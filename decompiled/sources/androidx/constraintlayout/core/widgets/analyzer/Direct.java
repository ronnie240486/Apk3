package androidx.constraintlayout.core.widgets.analyzer;

/* JADX INFO: loaded from: classes2.dex */
public class Direct {
    private static final boolean APPLY_MATCH_PARENT = false;
    private static final boolean DEBUG = false;
    private static final boolean EARLY_TERMINATION = true;
    private static int hcount;
    private static androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure measure;
    private static int vcount;

    static {
            androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measure r0 = new androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measure
            r0.<init>()
            androidx.constraintlayout.core.widgets.analyzer.Direct.measure = r0
            r0 = 0
            androidx.constraintlayout.core.widgets.analyzer.Direct.hcount = r0
            androidx.constraintlayout.core.widgets.analyzer.Direct.vcount = r0
            return
    }

    public Direct() {
            r0 = this;
            r0.<init>()
            return
    }

    private static boolean canMeasure(int r7, androidx.constraintlayout.core.widgets.ConstraintWidget r8) {
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r7 = r8.getHorizontalDimensionBehaviour()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r0 = r8.getVerticalDimensionBehaviour()
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r8.getParent()
            if (r1 == 0) goto L15
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r8.getParent()
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r1 = (androidx.constraintlayout.core.widgets.ConstraintWidgetContainer) r1
            goto L16
        L15:
            r1 = 0
        L16:
            if (r1 == 0) goto L1e
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r2 = r1.getHorizontalDimensionBehaviour()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
        L1e:
            if (r1 == 0) goto L26
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = r1.getVerticalDimensionBehaviour()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
        L26:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r2 = 0
            r3 = 0
            r4 = 1
            if (r7 == r1) goto L5e
            boolean r5 = r8.isResolvedHorizontally()
            if (r5 != 0) goto L5e
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r5 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r7 == r5) goto L5e
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r5 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r7 != r5) goto L4b
            int r6 = r8.mMatchConstraintDefaultWidth
            if (r6 != 0) goto L4b
            float r6 = r8.mDimensionRatio
            int r6 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r6 != 0) goto L4b
            boolean r6 = r8.hasDanglingDimension(r3)
            if (r6 != 0) goto L5e
        L4b:
            if (r7 != r5) goto L5c
            int r7 = r8.mMatchConstraintDefaultWidth
            if (r7 != r4) goto L5c
            int r7 = r8.getWidth()
            boolean r7 = r8.hasResolvedTargets(r3, r7)
            if (r7 == 0) goto L5c
            goto L5e
        L5c:
            r7 = 0
            goto L5f
        L5e:
            r7 = 1
        L5f:
            if (r0 == r1) goto L92
            boolean r1 = r8.isResolvedVertically()
            if (r1 != 0) goto L92
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r0 == r1) goto L92
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r0 != r1) goto L7f
            int r5 = r8.mMatchConstraintDefaultHeight
            if (r5 != 0) goto L7f
            float r5 = r8.mDimensionRatio
            int r5 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r5 != 0) goto L7f
            boolean r5 = r8.hasDanglingDimension(r4)
            if (r5 != 0) goto L92
        L7f:
            if (r0 != r1) goto L90
            int r0 = r8.mMatchConstraintDefaultHeight
            if (r0 != r4) goto L90
            int r0 = r8.getHeight()
            boolean r0 = r8.hasResolvedTargets(r4, r0)
            if (r0 == 0) goto L90
            goto L92
        L90:
            r0 = 0
            goto L93
        L92:
            r0 = 1
        L93:
            float r8 = r8.mDimensionRatio
            int r8 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r8 <= 0) goto L9e
            if (r7 != 0) goto L9d
            if (r0 == 0) goto L9e
        L9d:
            return r4
        L9e:
            if (r7 == 0) goto La3
            if (r0 == 0) goto La3
            r3 = 1
        La3:
            return r3
    }

    private static void horizontalSolvingPass(int r16, androidx.constraintlayout.core.widgets.ConstraintWidget r17, androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measurer r18, boolean r19) {
            r0 = r17
            r1 = r18
            r2 = r19
            boolean r3 = r17.isHorizontalSolvingPassDone()
            if (r3 == 0) goto Ld
            return
        Ld:
            int r3 = androidx.constraintlayout.core.widgets.analyzer.Direct.hcount
            r4 = 1
            int r3 = r3 + r4
            androidx.constraintlayout.core.widgets.analyzer.Direct.hcount = r3
            boolean r3 = r0 instanceof androidx.constraintlayout.core.widgets.ConstraintWidgetContainer
            if (r3 != 0) goto L2f
            boolean r3 = r17.isMeasureRequested()
            if (r3 == 0) goto L2f
            int r3 = r16 + 1
            boolean r5 = canMeasure(r3, r0)
            if (r5 == 0) goto L2f
            androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measure r5 = new androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measure
            r5.<init>()
            int r6 = androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure.SELF_DIMENSIONS
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer.measure(r3, r0, r1, r5, r6)
        L2f:
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r3 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r0.getAnchor(r3)
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r5 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r0.getAnchor(r5)
            int r6 = r3.getFinalValue()
            int r7 = r5.getFinalValue()
            java.util.HashSet r8 = r3.getDependents()
            r9 = 0
            r10 = 8
            if (r8 == 0) goto L131
            boolean r8 = r3.hasFinalValue()
            if (r8 == 0) goto L131
            java.util.HashSet r3 = r3.getDependents()
            java.util.Iterator r3 = r3.iterator()
        L5a:
            boolean r8 = r3.hasNext()
            if (r8 == 0) goto L131
            java.lang.Object r8 = r3.next()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r8 = (androidx.constraintlayout.core.widgets.ConstraintAnchor) r8
            androidx.constraintlayout.core.widgets.ConstraintWidget r12 = r8.mOwner
            int r13 = r16 + 1
            boolean r14 = canMeasure(r13, r12)
            boolean r15 = r12.isMeasureRequested()
            if (r15 == 0) goto L80
            if (r14 == 0) goto L80
            androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measure r15 = new androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measure
            r15.<init>()
            int r11 = androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure.SELF_DIMENSIONS
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer.measure(r13, r12, r1, r15, r11)
        L80:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r12.mLeft
            if (r8 != r11) goto L90
            androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r12.mRight
            androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r11.mTarget
            if (r11 == 0) goto L90
            boolean r11 = r11.hasFinalValue()
            if (r11 != 0) goto La0
        L90:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r12.mRight
            if (r8 != r11) goto La2
            androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r12.mLeft
            androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r11.mTarget
            if (r11 == 0) goto La2
            boolean r11 = r11.hasFinalValue()
            if (r11 == 0) goto La2
        La0:
            r11 = 1
            goto La3
        La2:
            r11 = 0
        La3:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r15 = r12.getHorizontalDimensionBehaviour()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r15 != r4) goto Le6
            if (r14 == 0) goto Lae
            goto Le6
        Lae:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r8 = r12.getHorizontalDimensionBehaviour()
            if (r8 != r4) goto Lec
            int r4 = r12.mMatchConstraintMaxWidth
            if (r4 < 0) goto Lec
            int r4 = r12.mMatchConstraintMinWidth
            if (r4 < 0) goto Lec
            int r4 = r12.getVisibility()
            if (r4 == r10) goto Lce
            int r4 = r12.mMatchConstraintDefaultWidth
            if (r4 != 0) goto Lec
            float r4 = r12.getDimensionRatio()
            int r4 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r4 != 0) goto Lec
        Lce:
            boolean r4 = r12.isInHorizontalChain()
            if (r4 != 0) goto Lec
            boolean r4 = r12.isInVirtualLayout()
            if (r4 != 0) goto Lec
            if (r11 == 0) goto Lec
            boolean r4 = r12.isInHorizontalChain()
            if (r4 != 0) goto Lec
            solveHorizontalMatchConstraint(r13, r0, r1, r12, r2)
            goto Lec
        Le6:
            boolean r4 = r12.isMeasureRequested()
            if (r4 == 0) goto Lef
        Lec:
            r4 = 1
            goto L5a
        Lef:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r12.mLeft
            if (r8 != r4) goto L10a
            androidx.constraintlayout.core.widgets.ConstraintAnchor r14 = r12.mRight
            androidx.constraintlayout.core.widgets.ConstraintAnchor r14 = r14.mTarget
            if (r14 != 0) goto L10a
            int r4 = r4.getMargin()
            int r4 = r4 + r6
            int r8 = r12.getWidth()
            int r8 = r8 + r4
            r12.setFinalHorizontal(r4, r8)
            horizontalSolvingPass(r13, r12, r1, r2)
            goto Lec
        L10a:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r14 = r12.mRight
            if (r8 != r14) goto L125
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r4.mTarget
            if (r4 != 0) goto L125
            int r4 = r14.getMargin()
            int r4 = r6 - r4
            int r8 = r12.getWidth()
            int r8 = r4 - r8
            r12.setFinalHorizontal(r8, r4)
            horizontalSolvingPass(r13, r12, r1, r2)
            goto Lec
        L125:
            if (r11 == 0) goto Lec
            boolean r4 = r12.isInHorizontalChain()
            if (r4 != 0) goto Lec
            solveHorizontalCenterConstraints(r13, r1, r12, r2)
            goto Lec
        L131:
            boolean r3 = r0 instanceof androidx.constraintlayout.core.widgets.Guideline
            if (r3 == 0) goto L136
            return
        L136:
            java.util.HashSet r3 = r5.getDependents()
            if (r3 == 0) goto L225
            boolean r3 = r5.hasFinalValue()
            if (r3 == 0) goto L225
            java.util.HashSet r3 = r5.getDependents()
            java.util.Iterator r3 = r3.iterator()
        L14a:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L225
            java.lang.Object r4 = r3.next()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = (androidx.constraintlayout.core.widgets.ConstraintAnchor) r4
            androidx.constraintlayout.core.widgets.ConstraintWidget r5 = r4.mOwner
            r6 = 1
            int r8 = r16 + 1
            boolean r11 = canMeasure(r8, r5)
            boolean r12 = r5.isMeasureRequested()
            if (r12 == 0) goto L171
            if (r11 == 0) goto L171
            androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measure r12 = new androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measure
            r12.<init>()
            int r13 = androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure.SELF_DIMENSIONS
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer.measure(r8, r5, r1, r12, r13)
        L171:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r12 = r5.mLeft
            if (r4 != r12) goto L181
            androidx.constraintlayout.core.widgets.ConstraintAnchor r12 = r5.mRight
            androidx.constraintlayout.core.widgets.ConstraintAnchor r12 = r12.mTarget
            if (r12 == 0) goto L181
            boolean r12 = r12.hasFinalValue()
            if (r12 != 0) goto L191
        L181:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r12 = r5.mRight
            if (r4 != r12) goto L193
            androidx.constraintlayout.core.widgets.ConstraintAnchor r12 = r5.mLeft
            androidx.constraintlayout.core.widgets.ConstraintAnchor r12 = r12.mTarget
            if (r12 == 0) goto L193
            boolean r12 = r12.hasFinalValue()
            if (r12 == 0) goto L193
        L191:
            r12 = 1
            goto L194
        L193:
            r12 = 0
        L194:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r13 = r5.getHorizontalDimensionBehaviour()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r14 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r13 != r14) goto L1d8
            if (r11 == 0) goto L19f
            goto L1d8
        L19f:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r4 = r5.getHorizontalDimensionBehaviour()
            if (r4 != r14) goto L14a
            int r4 = r5.mMatchConstraintMaxWidth
            if (r4 < 0) goto L14a
            int r4 = r5.mMatchConstraintMinWidth
            if (r4 < 0) goto L14a
            int r4 = r5.getVisibility()
            if (r4 == r10) goto L1bf
            int r4 = r5.mMatchConstraintDefaultWidth
            if (r4 != 0) goto L14a
            float r4 = r5.getDimensionRatio()
            int r4 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r4 != 0) goto L14a
        L1bf:
            boolean r4 = r5.isInHorizontalChain()
            if (r4 != 0) goto L14a
            boolean r4 = r5.isInVirtualLayout()
            if (r4 != 0) goto L14a
            if (r12 == 0) goto L14a
            boolean r4 = r5.isInHorizontalChain()
            if (r4 != 0) goto L14a
            solveHorizontalMatchConstraint(r8, r0, r1, r5, r2)
            goto L14a
        L1d8:
            boolean r11 = r5.isMeasureRequested()
            if (r11 == 0) goto L1e0
            goto L14a
        L1e0:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r5.mLeft
            if (r4 != r11) goto L1fc
            androidx.constraintlayout.core.widgets.ConstraintAnchor r13 = r5.mRight
            androidx.constraintlayout.core.widgets.ConstraintAnchor r13 = r13.mTarget
            if (r13 != 0) goto L1fc
            int r4 = r11.getMargin()
            int r4 = r4 + r7
            int r11 = r5.getWidth()
            int r11 = r11 + r4
            r5.setFinalHorizontal(r4, r11)
            horizontalSolvingPass(r8, r5, r1, r2)
            goto L14a
        L1fc:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r13 = r5.mRight
            if (r4 != r13) goto L218
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r11.mTarget
            if (r4 != 0) goto L218
            int r4 = r13.getMargin()
            int r4 = r7 - r4
            int r11 = r5.getWidth()
            int r11 = r4 - r11
            r5.setFinalHorizontal(r11, r4)
            horizontalSolvingPass(r8, r5, r1, r2)
            goto L14a
        L218:
            if (r12 == 0) goto L14a
            boolean r4 = r5.isInHorizontalChain()
            if (r4 != 0) goto L14a
            solveHorizontalCenterConstraints(r8, r1, r5, r2)
            goto L14a
        L225:
            r17.markHorizontalSolvingPassDone()
            return
    }

    public static java.lang.String ls(int r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
        L6:
            if (r1 >= r3) goto L10
            java.lang.String r2 = "  "
            r0.append(r2)
            int r1 = r1 + 1
            goto L6
        L10:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "+-("
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = ") "
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }

    private static void solveBarrier(int r1, androidx.constraintlayout.core.widgets.Barrier r2, androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measurer r3, int r4, boolean r5) {
            boolean r0 = r2.allSolved()
            if (r0 == 0) goto L13
            if (r4 != 0) goto Le
            int r1 = r1 + 1
            horizontalSolvingPass(r1, r2, r3, r5)
            goto L13
        Le:
            int r1 = r1 + 1
            verticalSolvingPass(r1, r2, r3)
        L13:
            return
    }

    public static boolean solveChain(androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r20, androidx.constraintlayout.core.LinearSystem r21, int r22, int r23, androidx.constraintlayout.core.widgets.ChainHead r24, boolean r25, boolean r26, boolean r27) {
            r0 = 0
            if (r27 == 0) goto L4
            return r0
        L4:
            if (r22 != 0) goto Ld
            boolean r1 = r20.isResolvedHorizontally()
            if (r1 != 0) goto L14
            return r0
        Ld:
            boolean r1 = r20.isResolvedVertically()
            if (r1 != 0) goto L14
            return r0
        L14:
            boolean r1 = r20.isRtl()
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r24.getFirst()
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r24.getLast()
            androidx.constraintlayout.core.widgets.ConstraintWidget r4 = r24.getFirstVisibleWidget()
            androidx.constraintlayout.core.widgets.ConstraintWidget r5 = r24.getLastVisibleWidget()
            androidx.constraintlayout.core.widgets.ConstraintWidget r6 = r24.getHead()
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r7 = r2.mListAnchors
            r7 = r7[r23]
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r3 = r3.mListAnchors
            int r8 = r23 + 1
            r3 = r3[r8]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r7.mTarget
            if (r9 == 0) goto L237
            androidx.constraintlayout.core.widgets.ConstraintAnchor r10 = r3.mTarget
            if (r10 != 0) goto L40
            goto L237
        L40:
            boolean r9 = r9.hasFinalValue()
            if (r9 == 0) goto L237
            androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r3.mTarget
            boolean r9 = r9.hasFinalValue()
            if (r9 != 0) goto L50
            goto L237
        L50:
            if (r4 == 0) goto L237
            if (r5 != 0) goto L56
            goto L237
        L56:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r7 = r7.mTarget
            int r7 = r7.getFinalValue()
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r9 = r4.mListAnchors
            r9 = r9[r23]
            int r9 = r9.getMargin()
            int r9 = r9 + r7
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r3.mTarget
            int r3 = r3.getFinalValue()
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r7 = r5.mListAnchors
            r7 = r7[r8]
            int r7 = r7.getMargin()
            int r3 = r3 - r7
            int r7 = r3 - r9
            if (r7 > 0) goto L79
            return r0
        L79:
            androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measure r10 = new androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measure
            r10.<init>()
            r13 = r2
            r11 = 0
            r12 = 0
            r14 = 0
            r15 = 0
        L83:
            r17 = 0
            r0 = 1
            if (r11 != 0) goto L107
            boolean r18 = canMeasure(r0, r13)
            if (r18 != 0) goto L91
            r16 = 0
            return r16
        L91:
            r16 = 0
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r13.mListDimensionBehaviors
            r0 = r0[r22]
            r18 = r2
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r0 != r2) goto L9e
            return r16
        L9e:
            boolean r0 = r13.isMeasureRequested()
            if (r0 == 0) goto Lb1
            androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measurer r0 = r20.getMeasurer()
            int r2 = androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure.SELF_DIMENSIONS
            r19 = r11
            r11 = 1
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer.measure(r11, r13, r0, r10, r2)
            goto Lb3
        Lb1:
            r19 = r11
        Lb3:
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r0 = r13.mListAnchors
            r0 = r0[r23]
            int r0 = r0.getMargin()
            int r0 = r0 + r15
            if (r22 != 0) goto Lc3
            int r2 = r13.getWidth()
            goto Lc7
        Lc3:
            int r2 = r13.getHeight()
        Lc7:
            int r2 = r2 + r0
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r0 = r13.mListAnchors
            r0 = r0[r8]
            int r0 = r0.getMargin()
            int r15 = r0 + r2
            int r14 = r14 + 1
            int r0 = r13.getVisibility()
            r2 = 8
            if (r0 == r2) goto Lde
            int r12 = r12 + 1
        Lde:
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r0 = r13.mListAnchors
            r0 = r0[r8]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.mTarget
            if (r0 == 0) goto Lfb
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r0.mOwner
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r2 = r0.mListAnchors
            r11 = r2[r23]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r11.mTarget
            if (r11 == 0) goto Lfb
            r2 = r2[r23]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r2.mTarget
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r2.mOwner
            if (r2 == r13) goto Lf9
            goto Lfb
        Lf9:
            r17 = r0
        Lfb:
            if (r17 == 0) goto L102
            r13 = r17
            r11 = r19
            goto L103
        L102:
            r11 = 1
        L103:
            r2 = r18
            goto L83
        L107:
            r18 = r2
            if (r12 != 0) goto L10d
            r0 = 0
            return r0
        L10d:
            r0 = 0
            if (r12 == r14) goto L111
            return r0
        L111:
            if (r7 >= r15) goto L114
            return r0
        L114:
            int r7 = r7 - r15
            r0 = 2
            if (r25 == 0) goto L11d
            int r2 = r12 + 1
            int r7 = r7 / r2
        L11b:
            r2 = 1
            goto L124
        L11d:
            if (r26 == 0) goto L11b
            if (r12 <= r0) goto L11b
            int r7 = r7 / r12
            r2 = 1
            int r7 = r7 - r2
        L124:
            if (r12 != r2) goto L156
            if (r22 != 0) goto L12d
            float r0 = r6.getHorizontalBiasPercent()
            goto L131
        L12d:
            float r0 = r6.getVerticalBiasPercent()
        L131:
            r2 = 1056964608(0x3f000000, float:0.5)
            float r3 = (float) r9
            float r3 = r3 + r2
            float r2 = (float) r7
            float r2 = r2 * r0
            float r2 = r2 + r3
            int r0 = (int) r2
            if (r22 != 0) goto L145
            int r2 = r4.getWidth()
            int r2 = r2 + r0
            r4.setFinalHorizontal(r0, r2)
            goto L14d
        L145:
            int r2 = r4.getHeight()
            int r2 = r2 + r0
            r4.setFinalVertical(r0, r2)
        L14d:
            androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measurer r0 = r20.getMeasurer()
            r2 = 1
            horizontalSolvingPass(r2, r4, r0, r1)
            return r2
        L156:
            if (r25 == 0) goto L1eb
            int r9 = r9 + r7
            r0 = r18
            r3 = 0
        L15c:
            if (r3 != 0) goto L236
            int r4 = r0.getVisibility()
            r5 = 8
            if (r4 != r5) goto L181
            if (r22 != 0) goto L173
            r0.setFinalHorizontal(r9, r9)
            androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measurer r4 = r20.getMeasurer()
            horizontalSolvingPass(r2, r0, r4, r1)
            goto L17d
        L173:
            r0.setFinalVertical(r9, r9)
            androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measurer r4 = r20.getMeasurer()
            verticalSolvingPass(r2, r0, r4)
        L17d:
            r2 = r21
            r4 = 0
            goto L1c4
        L181:
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r2 = r0.mListAnchors
            r2 = r2[r23]
            int r2 = r2.getMargin()
            int r2 = r2 + r9
            if (r22 != 0) goto L1a1
            int r4 = r0.getWidth()
            int r4 = r4 + r2
            r0.setFinalHorizontal(r2, r4)
            androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measurer r4 = r20.getMeasurer()
            r6 = 1
            horizontalSolvingPass(r6, r0, r4, r1)
            int r4 = r0.getWidth()
            goto L1b5
        L1a1:
            r6 = 1
            int r4 = r0.getHeight()
            int r4 = r4 + r2
            r0.setFinalVertical(r2, r4)
            androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measurer r4 = r20.getMeasurer()
            verticalSolvingPass(r6, r0, r4)
            int r4 = r0.getHeight()
        L1b5:
            int r4 = r4 + r2
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r2 = r0.mListAnchors
            r2 = r2[r8]
            int r2 = r2.getMargin()
            int r2 = r2 + r4
            int r2 = r2 + r7
            r9 = r2
            r4 = 0
            r2 = r21
        L1c4:
            r0.addToSolver(r2, r4)
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r4 = r0.mListAnchors
            r4 = r4[r8]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r4.mTarget
            if (r4 == 0) goto L1e1
            androidx.constraintlayout.core.widgets.ConstraintWidget r4 = r4.mOwner
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r6 = r4.mListAnchors
            r10 = r6[r23]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r10 = r10.mTarget
            if (r10 == 0) goto L1e1
            r6 = r6[r23]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r6.mTarget
            androidx.constraintlayout.core.widgets.ConstraintWidget r6 = r6.mOwner
            if (r6 == r0) goto L1e3
        L1e1:
            r4 = r17
        L1e3:
            if (r4 == 0) goto L1e7
            r0 = r4
            goto L1e8
        L1e7:
            r3 = 1
        L1e8:
            r2 = 1
            goto L15c
        L1eb:
            if (r26 == 0) goto L235
            if (r12 != r0) goto L233
            if (r22 != 0) goto L212
            int r0 = r4.getWidth()
            int r0 = r0 + r9
            r4.setFinalHorizontal(r9, r0)
            int r0 = r5.getWidth()
            int r0 = r3 - r0
            r5.setFinalHorizontal(r0, r3)
            androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measurer r0 = r20.getMeasurer()
            r2 = 1
            horizontalSolvingPass(r2, r4, r0, r1)
            androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measurer r0 = r20.getMeasurer()
            horizontalSolvingPass(r2, r5, r0, r1)
            goto L232
        L212:
            r2 = 1
            int r0 = r4.getHeight()
            int r0 = r0 + r9
            r4.setFinalVertical(r9, r0)
            int r0 = r5.getHeight()
            int r0 = r3 - r0
            r5.setFinalVertical(r0, r3)
            androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measurer r0 = r20.getMeasurer()
            verticalSolvingPass(r2, r4, r0)
            androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measurer r0 = r20.getMeasurer()
            verticalSolvingPass(r2, r5, r0)
        L232:
            return r2
        L233:
            r0 = 0
            return r0
        L235:
            r2 = 1
        L236:
            return r2
        L237:
            return r0
    }

    private static void solveHorizontalCenterConstraints(int r6, androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measurer r7, androidx.constraintlayout.core.widgets.ConstraintWidget r8, boolean r9) {
            float r0 = r8.getHorizontalBiasPercent()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r8.mLeft
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r1.mTarget
            int r1 = r1.getFinalValue()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r8.mRight
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r2.mTarget
            int r2 = r2.getFinalValue()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r8.mLeft
            int r3 = r3.getMargin()
            int r3 = r3 + r1
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r8.mRight
            int r4 = r4.getMargin()
            int r4 = r2 - r4
            r5 = 1056964608(0x3f000000, float:0.5)
            if (r1 != r2) goto L2a
            r0 = 1056964608(0x3f000000, float:0.5)
            goto L2c
        L2a:
            r1 = r3
            r2 = r4
        L2c:
            int r3 = r8.getWidth()
            int r4 = r2 - r1
            int r4 = r4 - r3
            if (r1 <= r2) goto L38
            int r4 = r1 - r2
            int r4 = r4 - r3
        L38:
            if (r4 <= 0) goto L3f
            float r4 = (float) r4
            float r0 = r0 * r4
            float r0 = r0 + r5
            goto L42
        L3f:
            float r4 = (float) r4
            float r0 = r0 * r4
        L42:
            int r0 = (int) r0
            int r0 = r0 + r1
            int r4 = r0 + r3
            if (r1 <= r2) goto L4a
            int r4 = r0 - r3
        L4a:
            r8.setFinalHorizontal(r0, r4)
            int r6 = r6 + 1
            horizontalSolvingPass(r6, r8, r7, r9)
            return
    }

    private static void solveHorizontalMatchConstraint(int r7, androidx.constraintlayout.core.widgets.ConstraintWidget r8, androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measurer r9, androidx.constraintlayout.core.widgets.ConstraintWidget r10, boolean r11) {
            float r0 = r10.getHorizontalBiasPercent()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r10.mLeft
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r1.mTarget
            int r1 = r1.getFinalValue()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r10.mLeft
            int r2 = r2.getMargin()
            int r2 = r2 + r1
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r10.mRight
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r1.mTarget
            int r1 = r1.getFinalValue()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r10.mRight
            int r3 = r3.getMargin()
            int r1 = r1 - r3
            if (r1 < r2) goto L76
            int r3 = r10.getWidth()
            int r4 = r10.getVisibility()
            r5 = 8
            r6 = 1056964608(0x3f000000, float:0.5)
            if (r4 == r5) goto L65
            int r4 = r10.mMatchConstraintDefaultWidth
            r5 = 2
            if (r4 != r5) goto L53
            boolean r3 = r8 instanceof androidx.constraintlayout.core.widgets.ConstraintWidgetContainer
            if (r3 == 0) goto L40
            int r8 = r8.getWidth()
            goto L48
        L40:
            androidx.constraintlayout.core.widgets.ConstraintWidget r8 = r8.getParent()
            int r8 = r8.getWidth()
        L48:
            float r3 = r10.getHorizontalBiasPercent()
            float r3 = r3 * r6
            float r8 = (float) r8
            float r3 = r3 * r8
            int r3 = (int) r3
            goto L57
        L53:
            if (r4 != 0) goto L57
            int r3 = r1 - r2
        L57:
            int r8 = r10.mMatchConstraintMinWidth
            int r3 = java.lang.Math.max(r8, r3)
            int r8 = r10.mMatchConstraintMaxWidth
            if (r8 <= 0) goto L65
            int r3 = java.lang.Math.min(r8, r3)
        L65:
            int r1 = r1 - r2
            int r1 = r1 - r3
            float r8 = (float) r1
            float r0 = r0 * r8
            float r0 = r0 + r6
            int r8 = (int) r0
            int r2 = r2 + r8
            int r3 = r3 + r2
            r10.setFinalHorizontal(r2, r3)
            int r7 = r7 + 1
            horizontalSolvingPass(r7, r10, r9, r11)
        L76:
            return
    }

    private static void solveVerticalCenterConstraints(int r6, androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measurer r7, androidx.constraintlayout.core.widgets.ConstraintWidget r8) {
            float r0 = r8.getVerticalBiasPercent()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r8.mTop
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r1.mTarget
            int r1 = r1.getFinalValue()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r8.mBottom
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r2.mTarget
            int r2 = r2.getFinalValue()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r8.mTop
            int r3 = r3.getMargin()
            int r3 = r3 + r1
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r8.mBottom
            int r4 = r4.getMargin()
            int r4 = r2 - r4
            r5 = 1056964608(0x3f000000, float:0.5)
            if (r1 != r2) goto L2a
            r0 = 1056964608(0x3f000000, float:0.5)
            goto L2c
        L2a:
            r1 = r3
            r2 = r4
        L2c:
            int r3 = r8.getHeight()
            int r4 = r2 - r1
            int r4 = r4 - r3
            if (r1 <= r2) goto L38
            int r4 = r1 - r2
            int r4 = r4 - r3
        L38:
            if (r4 <= 0) goto L3f
            float r4 = (float) r4
            float r0 = r0 * r4
            float r0 = r0 + r5
            goto L42
        L3f:
            float r4 = (float) r4
            float r0 = r0 * r4
        L42:
            int r0 = (int) r0
            int r4 = r1 + r0
            int r5 = r4 + r3
            if (r1 <= r2) goto L4d
            int r4 = r1 - r0
            int r5 = r4 - r3
        L4d:
            r8.setFinalVertical(r4, r5)
            int r6 = r6 + 1
            verticalSolvingPass(r6, r8, r7)
            return
    }

    private static void solveVerticalMatchConstraint(int r7, androidx.constraintlayout.core.widgets.ConstraintWidget r8, androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measurer r9, androidx.constraintlayout.core.widgets.ConstraintWidget r10) {
            float r0 = r10.getVerticalBiasPercent()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r10.mTop
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r1.mTarget
            int r1 = r1.getFinalValue()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r10.mTop
            int r2 = r2.getMargin()
            int r2 = r2 + r1
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r10.mBottom
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r1.mTarget
            int r1 = r1.getFinalValue()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r10.mBottom
            int r3 = r3.getMargin()
            int r1 = r1 - r3
            if (r1 < r2) goto L72
            int r3 = r10.getHeight()
            int r4 = r10.getVisibility()
            r5 = 8
            r6 = 1056964608(0x3f000000, float:0.5)
            if (r4 == r5) goto L61
            int r4 = r10.mMatchConstraintDefaultHeight
            r5 = 2
            if (r4 != r5) goto L4f
            boolean r3 = r8 instanceof androidx.constraintlayout.core.widgets.ConstraintWidgetContainer
            if (r3 == 0) goto L40
            int r8 = r8.getHeight()
            goto L48
        L40:
            androidx.constraintlayout.core.widgets.ConstraintWidget r8 = r8.getParent()
            int r8 = r8.getHeight()
        L48:
            float r3 = r0 * r6
            float r8 = (float) r8
            float r3 = r3 * r8
            int r3 = (int) r3
            goto L53
        L4f:
            if (r4 != 0) goto L53
            int r3 = r1 - r2
        L53:
            int r8 = r10.mMatchConstraintMinHeight
            int r3 = java.lang.Math.max(r8, r3)
            int r8 = r10.mMatchConstraintMaxHeight
            if (r8 <= 0) goto L61
            int r3 = java.lang.Math.min(r8, r3)
        L61:
            int r1 = r1 - r2
            int r1 = r1 - r3
            float r8 = (float) r1
            float r0 = r0 * r8
            float r0 = r0 + r6
            int r8 = (int) r0
            int r2 = r2 + r8
            int r3 = r3 + r2
            r10.setFinalVertical(r2, r3)
            int r7 = r7 + 1
            verticalSolvingPass(r7, r10, r9)
        L72:
            return
    }

    public static void solvingPass(androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r13, androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measurer r14) {
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r0 = r13.getHorizontalDimensionBehaviour()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = r13.getVerticalDimensionBehaviour()
            r2 = 0
            androidx.constraintlayout.core.widgets.analyzer.Direct.hcount = r2
            androidx.constraintlayout.core.widgets.analyzer.Direct.vcount = r2
            r13.resetFinalResolution()
            java.util.ArrayList r3 = r13.getChildren()
            int r4 = r3.size()
            r5 = 0
        L19:
            if (r5 >= r4) goto L27
            java.lang.Object r6 = r3.get(r5)
            androidx.constraintlayout.core.widgets.ConstraintWidget r6 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r6
            r6.resetFinalResolution()
            int r5 = r5 + 1
            goto L19
        L27:
            boolean r5 = r13.isRtl()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r0 != r6) goto L37
            int r0 = r13.getWidth()
            r13.setFinalHorizontal(r2, r0)
            goto L3a
        L37:
            r13.setFinalLeft(r2)
        L3a:
            r0 = 0
            r6 = 0
            r7 = 0
        L3d:
            r8 = 1056964608(0x3f000000, float:0.5)
            r9 = -1
            r10 = 1
            if (r0 >= r4) goto La4
            java.lang.Object r11 = r3.get(r0)
            androidx.constraintlayout.core.widgets.ConstraintWidget r11 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r11
            boolean r12 = r11 instanceof androidx.constraintlayout.core.widgets.Guideline
            if (r12 == 0) goto L94
            androidx.constraintlayout.core.widgets.Guideline r11 = (androidx.constraintlayout.core.widgets.Guideline) r11
            int r12 = r11.getOrientation()
            if (r12 != r10) goto La1
            int r6 = r11.getRelativeBegin()
            if (r6 == r9) goto L63
            int r6 = r11.getRelativeBegin()
            r11.setFinalValue(r6)
            goto L92
        L63:
            int r6 = r11.getRelativeEnd()
            if (r6 == r9) goto L7c
            boolean r6 = r13.isResolvedHorizontally()
            if (r6 == 0) goto L7c
            int r6 = r13.getWidth()
            int r8 = r11.getRelativeEnd()
            int r6 = r6 - r8
            r11.setFinalValue(r6)
            goto L92
        L7c:
            boolean r6 = r13.isResolvedHorizontally()
            if (r6 == 0) goto L92
            float r6 = r11.getRelativePercent()
            int r9 = r13.getWidth()
            float r9 = (float) r9
            float r6 = r6 * r9
            float r6 = r6 + r8
            int r6 = (int) r6
            r11.setFinalValue(r6)
        L92:
            r6 = 1
            goto La1
        L94:
            boolean r8 = r11 instanceof androidx.constraintlayout.core.widgets.Barrier
            if (r8 == 0) goto La1
            androidx.constraintlayout.core.widgets.Barrier r11 = (androidx.constraintlayout.core.widgets.Barrier) r11
            int r8 = r11.getOrientation()
            if (r8 != 0) goto La1
            r7 = 1
        La1:
            int r0 = r0 + 1
            goto L3d
        La4:
            if (r6 == 0) goto Lc1
            r0 = 0
        La7:
            if (r0 >= r4) goto Lc1
            java.lang.Object r6 = r3.get(r0)
            androidx.constraintlayout.core.widgets.ConstraintWidget r6 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r6
            boolean r11 = r6 instanceof androidx.constraintlayout.core.widgets.Guideline
            if (r11 == 0) goto Lbe
            androidx.constraintlayout.core.widgets.Guideline r6 = (androidx.constraintlayout.core.widgets.Guideline) r6
            int r11 = r6.getOrientation()
            if (r11 != r10) goto Lbe
            horizontalSolvingPass(r2, r6, r14, r5)
        Lbe:
            int r0 = r0 + 1
            goto La7
        Lc1:
            horizontalSolvingPass(r2, r13, r14, r5)
            if (r7 == 0) goto Le1
            r0 = 0
        Lc7:
            if (r0 >= r4) goto Le1
            java.lang.Object r6 = r3.get(r0)
            androidx.constraintlayout.core.widgets.ConstraintWidget r6 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r6
            boolean r7 = r6 instanceof androidx.constraintlayout.core.widgets.Barrier
            if (r7 == 0) goto Lde
            androidx.constraintlayout.core.widgets.Barrier r6 = (androidx.constraintlayout.core.widgets.Barrier) r6
            int r7 = r6.getOrientation()
            if (r7 != 0) goto Lde
            solveBarrier(r2, r6, r14, r2, r5)
        Lde:
            int r0 = r0 + 1
            goto Lc7
        Le1:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r0 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r1 != r0) goto Led
            int r0 = r13.getHeight()
            r13.setFinalVertical(r2, r0)
            goto Lf0
        Led:
            r13.setFinalTop(r2)
        Lf0:
            r0 = 0
            r1 = 0
            r6 = 0
        Lf3:
            if (r0 >= r4) goto L156
            java.lang.Object r7 = r3.get(r0)
            androidx.constraintlayout.core.widgets.ConstraintWidget r7 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r7
            boolean r11 = r7 instanceof androidx.constraintlayout.core.widgets.Guideline
            if (r11 == 0) goto L146
            androidx.constraintlayout.core.widgets.Guideline r7 = (androidx.constraintlayout.core.widgets.Guideline) r7
            int r11 = r7.getOrientation()
            if (r11 != 0) goto L153
            int r1 = r7.getRelativeBegin()
            if (r1 == r9) goto L115
            int r1 = r7.getRelativeBegin()
            r7.setFinalValue(r1)
            goto L144
        L115:
            int r1 = r7.getRelativeEnd()
            if (r1 == r9) goto L12e
            boolean r1 = r13.isResolvedVertically()
            if (r1 == 0) goto L12e
            int r1 = r13.getHeight()
            int r11 = r7.getRelativeEnd()
            int r1 = r1 - r11
            r7.setFinalValue(r1)
            goto L144
        L12e:
            boolean r1 = r13.isResolvedVertically()
            if (r1 == 0) goto L144
            float r1 = r7.getRelativePercent()
            int r11 = r13.getHeight()
            float r11 = (float) r11
            float r1 = r1 * r11
            float r1 = r1 + r8
            int r1 = (int) r1
            r7.setFinalValue(r1)
        L144:
            r1 = 1
            goto L153
        L146:
            boolean r11 = r7 instanceof androidx.constraintlayout.core.widgets.Barrier
            if (r11 == 0) goto L153
            androidx.constraintlayout.core.widgets.Barrier r7 = (androidx.constraintlayout.core.widgets.Barrier) r7
            int r7 = r7.getOrientation()
            if (r7 != r10) goto L153
            r6 = 1
        L153:
            int r0 = r0 + 1
            goto Lf3
        L156:
            if (r1 == 0) goto L173
            r0 = 0
        L159:
            if (r0 >= r4) goto L173
            java.lang.Object r1 = r3.get(r0)
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r1
            boolean r7 = r1 instanceof androidx.constraintlayout.core.widgets.Guideline
            if (r7 == 0) goto L170
            androidx.constraintlayout.core.widgets.Guideline r1 = (androidx.constraintlayout.core.widgets.Guideline) r1
            int r7 = r1.getOrientation()
            if (r7 != 0) goto L170
            verticalSolvingPass(r10, r1, r14)
        L170:
            int r0 = r0 + 1
            goto L159
        L173:
            verticalSolvingPass(r2, r13, r14)
            if (r6 == 0) goto L193
            r13 = 0
        L179:
            if (r13 >= r4) goto L193
            java.lang.Object r0 = r3.get(r13)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r0
            boolean r1 = r0 instanceof androidx.constraintlayout.core.widgets.Barrier
            if (r1 == 0) goto L190
            androidx.constraintlayout.core.widgets.Barrier r0 = (androidx.constraintlayout.core.widgets.Barrier) r0
            int r1 = r0.getOrientation()
            if (r1 != r10) goto L190
            solveBarrier(r2, r0, r14, r10, r5)
        L190:
            int r13 = r13 + 1
            goto L179
        L193:
            r13 = 0
        L194:
            if (r13 >= r4) goto L1cd
            java.lang.Object r0 = r3.get(r13)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r0
            boolean r1 = r0.isMeasureRequested()
            if (r1 == 0) goto L1ca
            boolean r1 = canMeasure(r2, r0)
            if (r1 == 0) goto L1ca
            androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measure r1 = androidx.constraintlayout.core.widgets.analyzer.Direct.measure
            int r6 = androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure.SELF_DIMENSIONS
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer.measure(r2, r0, r14, r1, r6)
            boolean r1 = r0 instanceof androidx.constraintlayout.core.widgets.Guideline
            if (r1 == 0) goto L1c4
            r1 = r0
            androidx.constraintlayout.core.widgets.Guideline r1 = (androidx.constraintlayout.core.widgets.Guideline) r1
            int r1 = r1.getOrientation()
            if (r1 != 0) goto L1c0
            verticalSolvingPass(r2, r0, r14)
            goto L1ca
        L1c0:
            horizontalSolvingPass(r2, r0, r14, r5)
            goto L1ca
        L1c4:
            horizontalSolvingPass(r2, r0, r14, r5)
            verticalSolvingPass(r2, r0, r14)
        L1ca:
            int r13 = r13 + 1
            goto L194
        L1cd:
            return
    }

    private static void verticalSolvingPass(int r16, androidx.constraintlayout.core.widgets.ConstraintWidget r17, androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measurer r18) {
            r0 = r17
            r1 = r18
            boolean r2 = r17.isVerticalSolvingPassDone()
            if (r2 == 0) goto Lb
            return
        Lb:
            int r2 = androidx.constraintlayout.core.widgets.analyzer.Direct.vcount
            r3 = 1
            int r2 = r2 + r3
            androidx.constraintlayout.core.widgets.analyzer.Direct.vcount = r2
            boolean r2 = r0 instanceof androidx.constraintlayout.core.widgets.ConstraintWidgetContainer
            if (r2 != 0) goto L2d
            boolean r2 = r17.isMeasureRequested()
            if (r2 == 0) goto L2d
            int r2 = r16 + 1
            boolean r4 = canMeasure(r2, r0)
            if (r4 == 0) goto L2d
            androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measure r4 = new androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measure
            r4.<init>()
            int r5 = androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure.SELF_DIMENSIONS
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer.measure(r2, r0, r1, r4, r5)
        L2d:
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r2 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r0.getAnchor(r2)
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r0.getAnchor(r4)
            int r5 = r2.getFinalValue()
            int r6 = r4.getFinalValue()
            java.util.HashSet r7 = r2.getDependents()
            r8 = 0
            r9 = 8
            if (r7 == 0) goto L132
            boolean r7 = r2.hasFinalValue()
            if (r7 == 0) goto L132
            java.util.HashSet r2 = r2.getDependents()
            java.util.Iterator r2 = r2.iterator()
        L58:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L132
            java.lang.Object r7 = r2.next()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r7 = (androidx.constraintlayout.core.widgets.ConstraintAnchor) r7
            androidx.constraintlayout.core.widgets.ConstraintWidget r11 = r7.mOwner
            int r12 = r16 + 1
            boolean r13 = canMeasure(r12, r11)
            boolean r14 = r11.isMeasureRequested()
            if (r14 == 0) goto L7e
            if (r13 == 0) goto L7e
            androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measure r14 = new androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measure
            r14.<init>()
            int r15 = androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure.SELF_DIMENSIONS
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer.measure(r12, r11, r1, r14, r15)
        L7e:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r14 = r11.mTop
            if (r7 != r14) goto L8e
            androidx.constraintlayout.core.widgets.ConstraintAnchor r14 = r11.mBottom
            androidx.constraintlayout.core.widgets.ConstraintAnchor r14 = r14.mTarget
            if (r14 == 0) goto L8e
            boolean r14 = r14.hasFinalValue()
            if (r14 != 0) goto L9e
        L8e:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r14 = r11.mBottom
            if (r7 != r14) goto La0
            androidx.constraintlayout.core.widgets.ConstraintAnchor r14 = r11.mTop
            androidx.constraintlayout.core.widgets.ConstraintAnchor r14 = r14.mTarget
            if (r14 == 0) goto La0
            boolean r14 = r14.hasFinalValue()
            if (r14 == 0) goto La0
        L9e:
            r14 = 1
            goto La1
        La0:
            r14 = 0
        La1:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r15 = r11.getVerticalDimensionBehaviour()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r10 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r15 != r10) goto Le5
            if (r13 == 0) goto Lac
            goto Le5
        Lac:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r7 = r11.getVerticalDimensionBehaviour()
            if (r7 != r10) goto L58
            int r7 = r11.mMatchConstraintMaxHeight
            if (r7 < 0) goto L58
            int r7 = r11.mMatchConstraintMinHeight
            if (r7 < 0) goto L58
            int r7 = r11.getVisibility()
            if (r7 == r9) goto Lcc
            int r7 = r11.mMatchConstraintDefaultHeight
            if (r7 != 0) goto L58
            float r7 = r11.getDimensionRatio()
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 != 0) goto L58
        Lcc:
            boolean r7 = r11.isInVerticalChain()
            if (r7 != 0) goto L58
            boolean r7 = r11.isInVirtualLayout()
            if (r7 != 0) goto L58
            if (r14 == 0) goto L58
            boolean r7 = r11.isInVerticalChain()
            if (r7 != 0) goto L58
            solveVerticalMatchConstraint(r12, r0, r1, r11)
            goto L58
        Le5:
            boolean r10 = r11.isMeasureRequested()
            if (r10 == 0) goto Led
            goto L58
        Led:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r10 = r11.mTop
            if (r7 != r10) goto L109
            androidx.constraintlayout.core.widgets.ConstraintAnchor r13 = r11.mBottom
            androidx.constraintlayout.core.widgets.ConstraintAnchor r13 = r13.mTarget
            if (r13 != 0) goto L109
            int r7 = r10.getMargin()
            int r7 = r7 + r5
            int r10 = r11.getHeight()
            int r10 = r10 + r7
            r11.setFinalVertical(r7, r10)
            verticalSolvingPass(r12, r11, r1)
            goto L58
        L109:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r13 = r11.mBottom
            if (r7 != r13) goto L125
            androidx.constraintlayout.core.widgets.ConstraintAnchor r7 = r10.mTarget
            if (r7 != 0) goto L125
            int r7 = r13.getMargin()
            int r7 = r5 - r7
            int r10 = r11.getHeight()
            int r10 = r7 - r10
            r11.setFinalVertical(r10, r7)
            verticalSolvingPass(r12, r11, r1)
            goto L58
        L125:
            if (r14 == 0) goto L58
            boolean r7 = r11.isInVerticalChain()
            if (r7 != 0) goto L58
            solveVerticalCenterConstraints(r12, r1, r11)
            goto L58
        L132:
            boolean r2 = r0 instanceof androidx.constraintlayout.core.widgets.Guideline
            if (r2 == 0) goto L137
            return
        L137:
            java.util.HashSet r2 = r4.getDependents()
            if (r2 == 0) goto L225
            boolean r2 = r4.hasFinalValue()
            if (r2 == 0) goto L225
            java.util.HashSet r2 = r4.getDependents()
            java.util.Iterator r2 = r2.iterator()
        L14b:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L225
            java.lang.Object r4 = r2.next()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = (androidx.constraintlayout.core.widgets.ConstraintAnchor) r4
            androidx.constraintlayout.core.widgets.ConstraintWidget r5 = r4.mOwner
            int r7 = r16 + 1
            boolean r10 = canMeasure(r7, r5)
            boolean r11 = r5.isMeasureRequested()
            if (r11 == 0) goto L171
            if (r10 == 0) goto L171
            androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measure r11 = new androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measure
            r11.<init>()
            int r12 = androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure.SELF_DIMENSIONS
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer.measure(r7, r5, r1, r11, r12)
        L171:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r5.mTop
            if (r4 != r11) goto L181
            androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r5.mBottom
            androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r11.mTarget
            if (r11 == 0) goto L181
            boolean r11 = r11.hasFinalValue()
            if (r11 != 0) goto L191
        L181:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r5.mBottom
            if (r4 != r11) goto L193
            androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r5.mTop
            androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r11.mTarget
            if (r11 == 0) goto L193
            boolean r11 = r11.hasFinalValue()
            if (r11 == 0) goto L193
        L191:
            r11 = 1
            goto L194
        L193:
            r11 = 0
        L194:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r12 = r5.getVerticalDimensionBehaviour()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r13 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r12 != r13) goto L1d8
            if (r10 == 0) goto L19f
            goto L1d8
        L19f:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r4 = r5.getVerticalDimensionBehaviour()
            if (r4 != r13) goto L14b
            int r4 = r5.mMatchConstraintMaxHeight
            if (r4 < 0) goto L14b
            int r4 = r5.mMatchConstraintMinHeight
            if (r4 < 0) goto L14b
            int r4 = r5.getVisibility()
            if (r4 == r9) goto L1bf
            int r4 = r5.mMatchConstraintDefaultHeight
            if (r4 != 0) goto L14b
            float r4 = r5.getDimensionRatio()
            int r4 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r4 != 0) goto L14b
        L1bf:
            boolean r4 = r5.isInVerticalChain()
            if (r4 != 0) goto L14b
            boolean r4 = r5.isInVirtualLayout()
            if (r4 != 0) goto L14b
            if (r11 == 0) goto L14b
            boolean r4 = r5.isInVerticalChain()
            if (r4 != 0) goto L14b
            solveVerticalMatchConstraint(r7, r0, r1, r5)
            goto L14b
        L1d8:
            boolean r10 = r5.isMeasureRequested()
            if (r10 == 0) goto L1e0
            goto L14b
        L1e0:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r10 = r5.mTop
            if (r4 != r10) goto L1fc
            androidx.constraintlayout.core.widgets.ConstraintAnchor r12 = r5.mBottom
            androidx.constraintlayout.core.widgets.ConstraintAnchor r12 = r12.mTarget
            if (r12 != 0) goto L1fc
            int r4 = r10.getMargin()
            int r4 = r4 + r6
            int r10 = r5.getHeight()
            int r10 = r10 + r4
            r5.setFinalVertical(r4, r10)
            verticalSolvingPass(r7, r5, r1)
            goto L14b
        L1fc:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r12 = r5.mBottom
            if (r4 != r12) goto L218
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r10.mTarget
            if (r4 != 0) goto L218
            int r4 = r12.getMargin()
            int r4 = r6 - r4
            int r10 = r5.getHeight()
            int r10 = r4 - r10
            r5.setFinalVertical(r10, r4)
            verticalSolvingPass(r7, r5, r1)
            goto L14b
        L218:
            if (r11 == 0) goto L14b
            boolean r4 = r5.isInVerticalChain()
            if (r4 != 0) goto L14b
            solveVerticalCenterConstraints(r7, r1, r5)
            goto L14b
        L225:
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r2 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BASELINE
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r0.getAnchor(r2)
            java.util.HashSet r4 = r2.getDependents()
            if (r4 == 0) goto L28a
            boolean r4 = r2.hasFinalValue()
            if (r4 == 0) goto L28a
            int r4 = r2.getFinalValue()
            java.util.HashSet r2 = r2.getDependents()
            java.util.Iterator r2 = r2.iterator()
        L243:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L28a
            java.lang.Object r5 = r2.next()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = (androidx.constraintlayout.core.widgets.ConstraintAnchor) r5
            androidx.constraintlayout.core.widgets.ConstraintWidget r6 = r5.mOwner
            int r7 = r16 + 1
            boolean r8 = canMeasure(r7, r6)
            boolean r9 = r6.isMeasureRequested()
            if (r9 == 0) goto L269
            if (r8 == 0) goto L269
            androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measure r9 = new androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measure
            r9.<init>()
            int r10 = androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure.SELF_DIMENSIONS
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer.measure(r7, r6, r1, r9, r10)
        L269:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r9 = r6.getVerticalDimensionBehaviour()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r10 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r9 != r10) goto L273
            if (r8 == 0) goto L243
        L273:
            boolean r8 = r6.isMeasureRequested()
            if (r8 == 0) goto L27a
            goto L243
        L27a:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r8 = r6.mBaseline
            if (r5 != r8) goto L243
            int r5 = r5.getMargin()
            int r5 = r5 + r4
            r6.setFinalBaseline(r5)
            verticalSolvingPass(r7, r6, r1)     // Catch: java.lang.Throwable -> L28e
            goto L243
        L28a:
            r17.markVerticalSolvingPassDone()
            return
        L28e:
            r0 = move-exception
            r1 = r0
            throw r1
    }
}
