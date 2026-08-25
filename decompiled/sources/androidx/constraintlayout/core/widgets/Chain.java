package androidx.constraintlayout.core.widgets;

/* JADX INFO: loaded from: classes2.dex */
public class Chain {
    private static final boolean DEBUG = false;
    public static final boolean USE_CHAIN_OPTIMIZATION = false;

    public Chain() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void applyChainConstraints(androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r42, androidx.constraintlayout.core.LinearSystem r43, java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r44, int r45) {
            r0 = r42
            r10 = r43
            r11 = r44
            r12 = r45
            if (r12 != 0) goto L14
            int r1 = r0.mHorizontalChainsSize
            androidx.constraintlayout.core.widgets.ChainHead[] r2 = r0.mHorizontalChainsArray
            r15 = r1
            r16 = r2
            r17 = 0
            goto L1d
        L14:
            int r1 = r0.mVerticalChainsSize
            androidx.constraintlayout.core.widgets.ChainHead[] r2 = r0.mVerticalChainsArray
            r15 = r1
            r16 = r2
            r17 = 2
        L1d:
            r9 = 0
        L1e:
            if (r9 >= r15) goto L5bd
            r1 = r16[r9]
            r1.define()
            if (r11 == 0) goto L37
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r1.mFirst
            boolean r2 = r11.contains(r2)
            if (r2 == 0) goto L30
            goto L37
        L30:
            r11 = r9
            r29 = r15
            r18 = 2
            goto L5b3
        L37:
            androidx.constraintlayout.core.widgets.ConstraintWidget r8 = r1.mFirst
            androidx.constraintlayout.core.widgets.ConstraintWidget r7 = r1.mLast
            androidx.constraintlayout.core.widgets.ConstraintWidget r6 = r1.mFirstVisibleWidget
            androidx.constraintlayout.core.widgets.ConstraintWidget r5 = r1.mLastVisibleWidget
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r1.mHead
            float r3 = r1.mTotalWeight
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r4 = r0.mListDimensionBehaviors
            r4 = r4[r12]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r14 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            r13 = 1
            if (r4 != r14) goto L4e
            r4 = 1
            goto L4f
        L4e:
            r4 = 0
        L4f:
            if (r12 != 0) goto L67
            int r14 = r2.mHorizontalChainStyle
            if (r14 != 0) goto L58
            r20 = 1
            goto L5a
        L58:
            r20 = 0
        L5a:
            r21 = r9
            r9 = 2
            if (r14 != r13) goto L62
            r19 = 1
            goto L64
        L62:
            r19 = 0
        L64:
            if (r14 != r9) goto L84
            goto L82
        L67:
            r21 = r9
            r9 = 2
            int r14 = r2.mVerticalChainStyle
            if (r14 != 0) goto L71
            r19 = 1
            goto L73
        L71:
            r19 = 0
        L73:
            if (r14 != r13) goto L78
            r20 = 1
            goto L7a
        L78:
            r20 = 0
        L7a:
            r41 = r20
            r20 = r19
            r19 = r41
            if (r14 != r9) goto L84
        L82:
            r14 = 1
            goto L85
        L84:
            r14 = 0
        L85:
            r9 = r8
            r22 = 0
        L88:
            r24 = 0
            if (r22 != 0) goto L178
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r13 = r9.mListAnchors
            r13 = r13[r17]
            if (r14 == 0) goto L95
            r26 = 1
            goto L97
        L95:
            r26 = 4
        L97:
            int r27 = r13.getMargin()
            r28 = r3
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r3 = r9.mListDimensionBehaviors
            r3 = r3[r12]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r11 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r3 != r11) goto Laf
            int[] r3 = r9.mResolvedMatchConstraintDefault
            r3 = r3[r12]
            if (r3 != 0) goto Laf
            r29 = r15
            r3 = 1
            goto Lb2
        Laf:
            r29 = r15
            r3 = 0
        Lb2:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r15 = r13.mTarget
            if (r15 == 0) goto Lbe
            if (r9 == r8) goto Lbe
            int r15 = r15.getMargin()
            int r27 = r15 + r27
        Lbe:
            r15 = r27
            if (r14 == 0) goto Lcb
            if (r9 == r8) goto Lcb
            if (r9 == r6) goto Lcb
            r27 = r2
            r26 = 8
            goto Lcd
        Lcb:
            r27 = r2
        Lcd:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r13.mTarget
            if (r2 == 0) goto L10b
            if (r9 != r6) goto Le0
            r30 = r8
            androidx.constraintlayout.core.SolverVariable r8 = r13.mSolverVariable
            androidx.constraintlayout.core.SolverVariable r2 = r2.mSolverVariable
            r31 = r1
            r1 = 6
            r10.addGreaterThan(r8, r2, r15, r1)
            goto Led
        Le0:
            r31 = r1
            r30 = r8
            androidx.constraintlayout.core.SolverVariable r1 = r13.mSolverVariable
            androidx.constraintlayout.core.SolverVariable r2 = r2.mSolverVariable
            r8 = 8
            r10.addGreaterThan(r1, r2, r15, r8)
        Led:
            if (r3 == 0) goto Lf3
            if (r14 != 0) goto Lf3
            r26 = 5
        Lf3:
            if (r9 != r6) goto Lff
            if (r14 == 0) goto Lff
            boolean r1 = r9.isInBarrier(r12)
            if (r1 == 0) goto Lff
            r1 = 5
            goto L101
        Lff:
            r1 = r26
        L101:
            androidx.constraintlayout.core.SolverVariable r2 = r13.mSolverVariable
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r13.mTarget
            androidx.constraintlayout.core.SolverVariable r3 = r3.mSolverVariable
            r10.addEquality(r2, r3, r15, r1)
            goto L10f
        L10b:
            r31 = r1
            r30 = r8
        L10f:
            if (r4 == 0) goto L143
            int r1 = r9.getVisibility()
            r2 = 8
            if (r1 == r2) goto L131
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r1 = r9.mListDimensionBehaviors
            r1 = r1[r12]
            if (r1 != r11) goto L131
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r1 = r9.mListAnchors
            int r2 = r17 + 1
            r2 = r1[r2]
            androidx.constraintlayout.core.SolverVariable r2 = r2.mSolverVariable
            r1 = r1[r17]
            androidx.constraintlayout.core.SolverVariable r1 = r1.mSolverVariable
            r3 = 5
            r8 = 0
            r10.addGreaterThan(r2, r1, r8, r3)
            goto L132
        L131:
            r8 = 0
        L132:
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r1 = r9.mListAnchors
            r1 = r1[r17]
            androidx.constraintlayout.core.SolverVariable r1 = r1.mSolverVariable
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r2 = r0.mListAnchors
            r2 = r2[r17]
            androidx.constraintlayout.core.SolverVariable r2 = r2.mSolverVariable
            r3 = 8
            r10.addGreaterThan(r1, r2, r8, r3)
        L143:
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r1 = r9.mListAnchors
            int r2 = r17 + 1
            r1 = r1[r2]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r1.mTarget
            if (r1 == 0) goto L162
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r1.mOwner
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r2 = r1.mListAnchors
            r3 = r2[r17]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r3.mTarget
            if (r3 == 0) goto L162
            r2 = r2[r17]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r2.mTarget
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r2.mOwner
            if (r2 == r9) goto L160
            goto L162
        L160:
            r24 = r1
        L162:
            if (r24 == 0) goto L167
            r9 = r24
            goto L169
        L167:
            r22 = 1
        L169:
            r11 = r44
            r2 = r27
            r3 = r28
            r15 = r29
            r8 = r30
            r1 = r31
            r13 = 1
            goto L88
        L178:
            r31 = r1
            r27 = r2
            r28 = r3
            r30 = r8
            r29 = r15
            if (r5 == 0) goto L1e3
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r1 = r7.mListAnchors
            int r2 = r17 + 1
            r1 = r1[r2]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r1.mTarget
            if (r1 == 0) goto L1e3
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r1 = r5.mListAnchors
            r1 = r1[r2]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r3 = r5.mListDimensionBehaviors
            r3 = r3[r12]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r8 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r3 != r8) goto L1a2
            int[] r3 = r5.mResolvedMatchConstraintDefault
            r3 = r3[r12]
            if (r3 != 0) goto L1a2
            r3 = 1
            goto L1a3
        L1a2:
            r3 = 0
        L1a3:
            if (r3 == 0) goto L1bb
            if (r14 != 0) goto L1bb
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r1.mTarget
            androidx.constraintlayout.core.widgets.ConstraintWidget r8 = r3.mOwner
            if (r8 != r0) goto L1bb
            androidx.constraintlayout.core.SolverVariable r8 = r1.mSolverVariable
            androidx.constraintlayout.core.SolverVariable r3 = r3.mSolverVariable
            int r9 = r1.getMargin()
            int r9 = -r9
            r11 = 5
            r10.addEquality(r8, r3, r9, r11)
            goto L1d0
        L1bb:
            if (r14 == 0) goto L1d0
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r1.mTarget
            androidx.constraintlayout.core.widgets.ConstraintWidget r8 = r3.mOwner
            if (r8 != r0) goto L1d0
            androidx.constraintlayout.core.SolverVariable r8 = r1.mSolverVariable
            androidx.constraintlayout.core.SolverVariable r3 = r3.mSolverVariable
            int r9 = r1.getMargin()
            int r9 = -r9
            r11 = 4
            r10.addEquality(r8, r3, r9, r11)
        L1d0:
            androidx.constraintlayout.core.SolverVariable r3 = r1.mSolverVariable
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r8 = r7.mListAnchors
            r2 = r8[r2]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r2.mTarget
            androidx.constraintlayout.core.SolverVariable r2 = r2.mSolverVariable
            int r1 = r1.getMargin()
            int r1 = -r1
            r8 = 6
            r10.addLowerThan(r3, r2, r1, r8)
        L1e3:
            if (r4 == 0) goto L1fe
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r1 = r0.mListAnchors
            int r2 = r17 + 1
            r1 = r1[r2]
            androidx.constraintlayout.core.SolverVariable r1 = r1.mSolverVariable
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r3 = r7.mListAnchors
            r4 = r3[r2]
            androidx.constraintlayout.core.SolverVariable r4 = r4.mSolverVariable
            r2 = r3[r2]
            int r2 = r2.getMargin()
            r3 = 8
            r10.addGreaterThan(r1, r4, r2, r3)
        L1fe:
            r1 = r31
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r2 = r1.mWeightedMatchConstraintsWidgets
            if (r2 == 0) goto L2a7
            int r3 = r2.size()
            r4 = 1
            if (r3 <= r4) goto L2a7
            boolean r8 = r1.mHasUndefinedWeights
            if (r8 == 0) goto L218
            boolean r8 = r1.mHasComplexMatchWeights
            if (r8 != 0) goto L218
            int r8 = r1.mWidgetsMatchCount
            float r8 = (float) r8
            r28 = r8
        L218:
            r8 = 0
            r11 = r24
            r9 = 0
            r32 = 0
        L21e:
            if (r9 >= r3) goto L2a7
            java.lang.Object r13 = r2.get(r9)
            androidx.constraintlayout.core.widgets.ConstraintWidget r13 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r13
            float[] r15 = r13.mWeight
            r15 = r15[r12]
            int r22 = (r15 > r8 ? 1 : (r15 == r8 ? 0 : -1))
            if (r22 >= 0) goto L249
            boolean r15 = r1.mHasComplexMatchWeights
            if (r15 == 0) goto L245
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r13 = r13.mListAnchors
            int r15 = r17 + 1
            r15 = r13[r15]
            androidx.constraintlayout.core.SolverVariable r15 = r15.mSolverVariable
            r13 = r13[r17]
            androidx.constraintlayout.core.SolverVariable r13 = r13.mSolverVariable
            r4 = 0
            r8 = 4
            r10.addEquality(r15, r13, r4, r8)
            r0 = 0
            goto L261
        L245:
            r8 = 4
            r15 = 1065353216(0x3f800000, float:1.0)
            goto L24a
        L249:
            r8 = 4
        L24a:
            r4 = 0
            int r22 = (r15 > r4 ? 1 : (r15 == r4 ? 0 : -1))
            if (r22 != 0) goto L264
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r13 = r13.mListAnchors
            int r15 = r17 + 1
            r15 = r13[r15]
            androidx.constraintlayout.core.SolverVariable r15 = r15.mSolverVariable
            r13 = r13[r17]
            androidx.constraintlayout.core.SolverVariable r13 = r13.mSolverVariable
            r0 = 0
            r4 = 8
            r10.addEquality(r15, r13, r0, r4)
        L261:
            r18 = r2
            goto L29d
        L264:
            r0 = 0
            if (r11 == 0) goto L298
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r4 = r11.mListAnchors
            r11 = r4[r17]
            androidx.constraintlayout.core.SolverVariable r11 = r11.mSolverVariable
            int r18 = r17 + 1
            r4 = r4[r18]
            androidx.constraintlayout.core.SolverVariable r4 = r4.mSolverVariable
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r0 = r13.mListAnchors
            r8 = r0[r17]
            androidx.constraintlayout.core.SolverVariable r8 = r8.mSolverVariable
            r0 = r0[r18]
            androidx.constraintlayout.core.SolverVariable r0 = r0.mSolverVariable
            r18 = r2
            androidx.constraintlayout.core.ArrayRow r2 = r43.createRow()
            r31 = r2
            r33 = r28
            r34 = r15
            r35 = r11
            r36 = r4
            r37 = r8
            r38 = r0
            r31.createRowEqualMatchDimensions(r32, r33, r34, r35, r36, r37, r38)
            r10.addConstraint(r2)
            goto L29a
        L298:
            r18 = r2
        L29a:
            r11 = r13
            r32 = r15
        L29d:
            int r9 = r9 + 1
            r2 = r18
            r4 = 1
            r8 = 0
            r0 = r42
            goto L21e
        L2a7:
            if (r6 == 0) goto L312
            if (r6 == r5) goto L2ad
            if (r14 == 0) goto L312
        L2ad:
            r0 = r30
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r0 = r0.mListAnchors
            r0 = r0[r17]
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r1 = r7.mListAnchors
            int r2 = r17 + 1
            r1 = r1[r2]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.mTarget
            if (r0 == 0) goto L2c1
            androidx.constraintlayout.core.SolverVariable r0 = r0.mSolverVariable
            r3 = r0
            goto L2c3
        L2c1:
            r3 = r24
        L2c3:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r1.mTarget
            if (r0 == 0) goto L2ca
            androidx.constraintlayout.core.SolverVariable r0 = r0.mSolverVariable
            goto L2cc
        L2ca:
            r0 = r24
        L2cc:
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r4 = r6.mListAnchors
            r4 = r4[r17]
            if (r5 == 0) goto L2d6
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r1 = r5.mListAnchors
            r1 = r1[r2]
        L2d6:
            if (r3 == 0) goto L309
            if (r0 == 0) goto L309
            if (r12 != 0) goto L2e1
            r2 = r27
            float r2 = r2.mHorizontalBiasPercent
            goto L2e5
        L2e1:
            r2 = r27
            float r2 = r2.mVerticalBiasPercent
        L2e5:
            r8 = r2
            int r9 = r4.getMargin()
            int r11 = r1.getMargin()
            androidx.constraintlayout.core.SolverVariable r2 = r4.mSolverVariable
            androidx.constraintlayout.core.SolverVariable r13 = r1.mSolverVariable
            r14 = 7
            r1 = r43
            r4 = r9
            r15 = r5
            r5 = r8
            r9 = r6
            r6 = r0
            r0 = r7
            r7 = r13
            r8 = r11
            r13 = r9
            r11 = r21
            r18 = 2
            r9 = r14
            r1.addCentering(r2, r3, r4, r5, r6, r7, r8, r9)
            r14 = r0
            goto L555
        L309:
            r15 = r5
            r13 = r6
            r11 = r21
            r18 = 2
            r14 = r7
            goto L555
        L312:
            r15 = r5
            r13 = r6
            r14 = r7
            r11 = r21
            r0 = r30
            r18 = 2
            if (r20 == 0) goto L41a
            if (r13 == 0) goto L41a
            int r2 = r1.mWidgetsMatchCount
            if (r2 <= 0) goto L32a
            int r1 = r1.mWidgetsCount
            if (r1 != r2) goto L32a
            r25 = 1
            goto L32c
        L32a:
            r25 = 0
        L32c:
            r8 = r13
            r9 = r8
        L32e:
            if (r9 == 0) goto L555
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r1 = r9.mNextChainWidget
            r1 = r1[r12]
            r7 = r1
        L335:
            if (r7 == 0) goto L344
            int r1 = r7.getVisibility()
            r2 = 8
            if (r1 != r2) goto L344
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r1 = r7.mNextChainWidget
            r7 = r1[r12]
            goto L335
        L344:
            if (r7 != 0) goto L352
            if (r9 != r15) goto L349
            goto L352
        L349:
            r39 = r0
            r0 = r7
            r21 = r8
            r22 = r9
            goto L408
        L352:
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r1 = r9.mListAnchors
            r1 = r1[r17]
            androidx.constraintlayout.core.SolverVariable r2 = r1.mSolverVariable
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r1.mTarget
            if (r3 == 0) goto L35f
            androidx.constraintlayout.core.SolverVariable r3 = r3.mSolverVariable
            goto L361
        L35f:
            r3 = r24
        L361:
            if (r8 == r9) goto L36c
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r3 = r8.mListAnchors
            int r4 = r17 + 1
            r3 = r3[r4]
            androidx.constraintlayout.core.SolverVariable r3 = r3.mSolverVariable
            goto L37f
        L36c:
            if (r9 != r13) goto L37f
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r3 = r0.mListAnchors
            r4 = r3[r17]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r4.mTarget
            if (r4 == 0) goto L37d
            r3 = r3[r17]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r3.mTarget
            androidx.constraintlayout.core.SolverVariable r3 = r3.mSolverVariable
            goto L37f
        L37d:
            r3 = r24
        L37f:
            int r1 = r1.getMargin()
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r4 = r9.mListAnchors
            int r5 = r17 + 1
            r4 = r4[r5]
            int r4 = r4.getMargin()
            if (r7 == 0) goto L398
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r6 = r7.mListAnchors
            r6 = r6[r17]
            r30 = r0
            androidx.constraintlayout.core.SolverVariable r0 = r6.mSolverVariable
            goto L3a4
        L398:
            r30 = r0
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r0 = r14.mListAnchors
            r0 = r0[r5]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r0.mTarget
            if (r6 == 0) goto L3a7
            androidx.constraintlayout.core.SolverVariable r0 = r6.mSolverVariable
        L3a4:
            r21 = r7
            goto L3ab
        L3a7:
            r21 = r7
            r0 = r24
        L3ab:
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r7 = r9.mListAnchors
            r7 = r7[r5]
            androidx.constraintlayout.core.SolverVariable r7 = r7.mSolverVariable
            if (r6 == 0) goto L3b8
            int r6 = r6.getMargin()
            int r4 = r4 + r6
        L3b8:
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r6 = r8.mListAnchors
            r6 = r6[r5]
            int r6 = r6.getMargin()
            int r6 = r6 + r1
            if (r2 == 0) goto L400
            if (r3 == 0) goto L400
            if (r0 == 0) goto L400
            if (r7 == 0) goto L400
            if (r9 != r13) goto L3d4
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r1 = r13.mListAnchors
            r1 = r1[r17]
            int r1 = r1.getMargin()
            r6 = r1
        L3d4:
            if (r9 != r15) goto L3e1
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r1 = r15.mListAnchors
            r1 = r1[r5]
            int r1 = r1.getMargin()
            r22 = r1
            goto L3e3
        L3e1:
            r22 = r4
        L3e3:
            if (r25 == 0) goto L3e8
            r23 = 8
            goto L3ea
        L3e8:
            r23 = 5
        L3ea:
            r5 = 1056964608(0x3f000000, float:0.5)
            r1 = r43
            r4 = r6
            r6 = r0
            r0 = r21
            r21 = r8
            r39 = r30
            r8 = r22
            r22 = r9
            r9 = r23
            r1.addCentering(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L408
        L400:
            r22 = r9
            r0 = r21
            r39 = r30
            r21 = r8
        L408:
            int r1 = r22.getVisibility()
            r2 = 8
            if (r1 == r2) goto L413
            r8 = r22
            goto L415
        L413:
            r8 = r21
        L415:
            r9 = r0
            r0 = r39
            goto L32e
        L41a:
            r39 = r0
            if (r19 == 0) goto L555
            if (r13 == 0) goto L555
            int r0 = r1.mWidgetsMatchCount
            if (r0 <= 0) goto L42b
            int r1 = r1.mWidgetsCount
            if (r1 != r0) goto L42b
            r25 = 1
            goto L42d
        L42b:
            r25 = 0
        L42d:
            r0 = r13
            r9 = r0
        L42f:
            if (r0 == 0) goto L4ef
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r1 = r0.mNextChainWidget
            r1 = r1[r12]
        L435:
            if (r1 == 0) goto L444
            int r2 = r1.getVisibility()
            r3 = 8
            if (r2 != r3) goto L444
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r1 = r1.mNextChainWidget
            r1 = r1[r12]
            goto L435
        L444:
            if (r0 == r13) goto L4db
            if (r0 == r15) goto L4db
            if (r1 == 0) goto L4db
            if (r1 != r15) goto L44f
            r8 = r24
            goto L450
        L44f:
            r8 = r1
        L450:
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r1 = r0.mListAnchors
            r1 = r1[r17]
            androidx.constraintlayout.core.SolverVariable r2 = r1.mSolverVariable
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r3 = r9.mListAnchors
            int r4 = r17 + 1
            r3 = r3[r4]
            androidx.constraintlayout.core.SolverVariable r3 = r3.mSolverVariable
            int r1 = r1.getMargin()
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r5 = r0.mListAnchors
            r5 = r5[r4]
            int r5 = r5.getMargin()
            if (r8 == 0) goto L47e
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r6 = r8.mListAnchors
            r6 = r6[r17]
            androidx.constraintlayout.core.SolverVariable r7 = r6.mSolverVariable
            r21 = r7
            androidx.constraintlayout.core.widgets.ConstraintAnchor r7 = r6.mTarget
            if (r7 == 0) goto L47b
            androidx.constraintlayout.core.SolverVariable r7 = r7.mSolverVariable
            goto L49a
        L47b:
            r7 = r24
            goto L49a
        L47e:
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r6 = r15.mListAnchors
            r6 = r6[r17]
            if (r6 == 0) goto L489
            androidx.constraintlayout.core.SolverVariable r7 = r6.mSolverVariable
            r21 = r6
            goto L48d
        L489:
            r21 = r6
            r7 = r24
        L48d:
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r6 = r0.mListAnchors
            r6 = r6[r4]
            androidx.constraintlayout.core.SolverVariable r6 = r6.mSolverVariable
            r41 = r7
            r7 = r6
            r6 = r21
            r21 = r41
        L49a:
            if (r6 == 0) goto L4a4
            int r6 = r6.getMargin()
            int r6 = r6 + r5
            r22 = r6
            goto L4a6
        L4a4:
            r22 = r5
        L4a6:
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r5 = r9.mListAnchors
            r4 = r5[r4]
            int r4 = r4.getMargin()
            int r4 = r4 + r1
            if (r25 == 0) goto L4b4
            r23 = 8
            goto L4b6
        L4b4:
            r23 = 4
        L4b6:
            if (r2 == 0) goto L4d2
            if (r3 == 0) goto L4d2
            if (r21 == 0) goto L4d2
            if (r7 == 0) goto L4d2
            r5 = 1056964608(0x3f000000, float:0.5)
            r1 = r43
            r6 = r21
            r21 = r8
            r26 = 4
            r8 = r22
            r22 = r9
            r9 = r23
            r1.addCentering(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L4d8
        L4d2:
            r21 = r8
            r22 = r9
            r26 = 4
        L4d8:
            r6 = r21
            goto L4e0
        L4db:
            r22 = r9
            r26 = 4
            r6 = r1
        L4e0:
            int r1 = r0.getVisibility()
            r2 = 8
            if (r1 == r2) goto L4ea
            r9 = r0
            goto L4ec
        L4ea:
            r9 = r22
        L4ec:
            r0 = r6
            goto L42f
        L4ef:
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r0 = r13.mListAnchors
            r0 = r0[r17]
            r1 = r39
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r1 = r1.mListAnchors
            r1 = r1[r17]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r1.mTarget
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r2 = r15.mListAnchors
            int r3 = r17 + 1
            r9 = r2[r3]
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r2 = r14.mListAnchors
            r2 = r2[r3]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r8 = r2.mTarget
            if (r1 == 0) goto L542
            if (r13 == r15) goto L51a
            androidx.constraintlayout.core.SolverVariable r2 = r0.mSolverVariable
            androidx.constraintlayout.core.SolverVariable r1 = r1.mSolverVariable
            int r0 = r0.getMargin()
            r3 = 5
            r10.addEquality(r2, r1, r0, r3)
            r1 = r8
            r0 = r9
            goto L544
        L51a:
            if (r8 == 0) goto L53c
            androidx.constraintlayout.core.SolverVariable r2 = r0.mSolverVariable
            androidx.constraintlayout.core.SolverVariable r3 = r1.mSolverVariable
            int r4 = r0.getMargin()
            r5 = 1056964608(0x3f000000, float:0.5)
            androidx.constraintlayout.core.SolverVariable r6 = r9.mSolverVariable
            androidx.constraintlayout.core.SolverVariable r7 = r8.mSolverVariable
            int r0 = r9.getMargin()
            r21 = 5
            r1 = r43
            r40 = r8
            r8 = r0
            r0 = r9
            r9 = r21
            r1.addCentering(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L53f
        L53c:
            r40 = r8
            r0 = r9
        L53f:
            r1 = r40
            goto L544
        L542:
            r0 = r9
            r1 = r8
        L544:
            if (r1 == 0) goto L555
            if (r13 == r15) goto L555
            androidx.constraintlayout.core.SolverVariable r2 = r0.mSolverVariable
            androidx.constraintlayout.core.SolverVariable r1 = r1.mSolverVariable
            int r0 = r0.getMargin()
            int r0 = -r0
            r3 = 5
            r10.addEquality(r2, r1, r0, r3)
        L555:
            if (r20 != 0) goto L559
            if (r19 == 0) goto L5b3
        L559:
            if (r13 == 0) goto L5b3
            if (r13 == r15) goto L5b3
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r0 = r13.mListAnchors
            r1 = r0[r17]
            if (r15 != 0) goto L565
            r6 = r13
            goto L566
        L565:
            r6 = r15
        L566:
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r2 = r6.mListAnchors
            int r3 = r17 + 1
            r2 = r2[r3]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r1.mTarget
            if (r4 == 0) goto L573
            androidx.constraintlayout.core.SolverVariable r4 = r4.mSolverVariable
            goto L575
        L573:
            r4 = r24
        L575:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r2.mTarget
            if (r5 == 0) goto L57c
            androidx.constraintlayout.core.SolverVariable r5 = r5.mSolverVariable
            goto L57e
        L57c:
            r5 = r24
        L57e:
            if (r14 == r6) goto L58a
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r5 = r14.mListAnchors
            r5 = r5[r3]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r5.mTarget
            if (r5 == 0) goto L58c
            androidx.constraintlayout.core.SolverVariable r5 = r5.mSolverVariable
        L58a:
            r24 = r5
        L58c:
            if (r13 != r6) goto L592
            r1 = r0[r17]
            r2 = r0[r3]
        L592:
            if (r4 == 0) goto L5b3
            if (r24 == 0) goto L5b3
            r5 = 1056964608(0x3f000000, float:0.5)
            int r0 = r1.getMargin()
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r6 = r6.mListAnchors
            r3 = r6[r3]
            int r8 = r3.getMargin()
            androidx.constraintlayout.core.SolverVariable r3 = r1.mSolverVariable
            androidx.constraintlayout.core.SolverVariable r7 = r2.mSolverVariable
            r9 = 5
            r1 = r43
            r2 = r3
            r3 = r4
            r4 = r0
            r6 = r24
            r1.addCentering(r2, r3, r4, r5, r6, r7, r8, r9)
        L5b3:
            int r9 = r11 + 1
            r0 = r42
            r11 = r44
            r15 = r29
            goto L1e
        L5bd:
            return
    }
}
