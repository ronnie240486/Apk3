package androidx.constraintlayout.core.widgets;

/* JADX INFO: loaded from: classes2.dex */
public class ChainHead {
    private boolean mDefined;
    public androidx.constraintlayout.core.widgets.ConstraintWidget mFirst;
    public androidx.constraintlayout.core.widgets.ConstraintWidget mFirstMatchConstraintWidget;
    public androidx.constraintlayout.core.widgets.ConstraintWidget mFirstVisibleWidget;
    public boolean mHasComplexMatchWeights;
    public boolean mHasDefinedWeights;
    public boolean mHasUndefinedWeights;
    public androidx.constraintlayout.core.widgets.ConstraintWidget mHead;
    private boolean mIsRtl;
    public androidx.constraintlayout.core.widgets.ConstraintWidget mLast;
    public androidx.constraintlayout.core.widgets.ConstraintWidget mLastMatchConstraintWidget;
    public androidx.constraintlayout.core.widgets.ConstraintWidget mLastVisibleWidget;
    private int mOrientation;
    public float mTotalWeight;
    public java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> mWeightedMatchConstraintsWidgets;
    public int mWidgetsCount;
    public int mWidgetsMatchCount;

    public ChainHead(androidx.constraintlayout.core.widgets.ConstraintWidget r2, int r3, boolean r4) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.mTotalWeight = r0
            r1.mFirst = r2
            r1.mOrientation = r3
            r1.mIsRtl = r4
            return
    }

    private void defineChainProperties() {
            r13 = this;
            int r0 = r13.mOrientation
            r1 = 2
            int r0 = r0 * 2
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r13.mFirst
            r3 = 0
            r4 = r2
            r5 = 0
        La:
            r6 = 1
            if (r5 != 0) goto Lef
            int r7 = r13.mWidgetsCount
            int r7 = r7 + r6
            r13.mWidgetsCount = r7
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r7 = r2.mNextChainWidget
            int r8 = r13.mOrientation
            r9 = 0
            r7[r8] = r9
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r7 = r2.mListNextMatchConstraintsWidget
            r7[r8] = r9
            int r7 = r2.getVisibility()
            r8 = 8
            if (r7 == r8) goto Lc0
            int r7 = r13.mOrientation
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r7 = r2.getDimensionBehaviour(r7)
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r8 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r7 == r8) goto L34
            int r7 = r13.mOrientation
            r2.getLength(r7)
        L34:
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r7 = r2.mListAnchors
            r7 = r7[r0]
            r7.getMargin()
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r7 = r2.mListAnchors
            int r10 = r0 + 1
            r7 = r7[r10]
            r7.getMargin()
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r7 = r2.mListAnchors
            r7 = r7[r0]
            r7.getMargin()
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r7 = r2.mListAnchors
            r7 = r7[r10]
            r7.getMargin()
            androidx.constraintlayout.core.widgets.ConstraintWidget r7 = r13.mFirstVisibleWidget
            if (r7 != 0) goto L58
            r13.mFirstVisibleWidget = r2
        L58:
            r13.mLastVisibleWidget = r2
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r7 = r2.mListDimensionBehaviors
            int r10 = r13.mOrientation
            r7 = r7[r10]
            if (r7 != r8) goto Lc0
            int[] r7 = r2.mResolvedMatchConstraintDefault
            r8 = r7[r10]
            if (r8 == 0) goto L71
            r8 = r7[r10]
            r11 = 3
            if (r8 == r11) goto L71
            r7 = r7[r10]
            if (r7 != r1) goto Lb7
        L71:
            int r7 = r13.mWidgetsMatchCount
            int r7 = r7 + r6
            r13.mWidgetsMatchCount = r7
            float[] r7 = r2.mWeight
            r8 = r7[r10]
            r11 = 0
            int r12 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r12 <= 0) goto L86
            float r12 = r13.mTotalWeight
            r7 = r7[r10]
            float r12 = r12 + r7
            r13.mTotalWeight = r12
        L86:
            boolean r7 = isMatchConstraintEqualityCandidate(r2, r10)
            if (r7 == 0) goto La5
            int r7 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r7 >= 0) goto L93
            r13.mHasUndefinedWeights = r6
            goto L95
        L93:
            r13.mHasDefinedWeights = r6
        L95:
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r7 = r13.mWeightedMatchConstraintsWidgets
            if (r7 != 0) goto La0
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r13.mWeightedMatchConstraintsWidgets = r7
        La0:
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r7 = r13.mWeightedMatchConstraintsWidgets
            r7.add(r2)
        La5:
            androidx.constraintlayout.core.widgets.ConstraintWidget r7 = r13.mFirstMatchConstraintWidget
            if (r7 != 0) goto Lab
            r13.mFirstMatchConstraintWidget = r2
        Lab:
            androidx.constraintlayout.core.widgets.ConstraintWidget r7 = r13.mLastMatchConstraintWidget
            if (r7 == 0) goto Lb5
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r7 = r7.mListNextMatchConstraintsWidget
            int r8 = r13.mOrientation
            r7[r8] = r2
        Lb5:
            r13.mLastMatchConstraintWidget = r2
        Lb7:
            int r7 = r13.mOrientation
            if (r7 != 0) goto Lbe
            int r7 = r2.mMatchConstraintDefaultWidth
            goto Lc0
        Lbe:
            int r7 = r2.mMatchConstraintDefaultHeight
        Lc0:
            if (r4 == r2) goto Lc8
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r4 = r4.mNextChainWidget
            int r7 = r13.mOrientation
            r4[r7] = r2
        Lc8:
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r4 = r2.mListAnchors
            int r7 = r0 + 1
            r4 = r4[r7]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r4.mTarget
            if (r4 == 0) goto Le6
            androidx.constraintlayout.core.widgets.ConstraintWidget r4 = r4.mOwner
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r7 = r4.mListAnchors
            r8 = r7[r0]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r8 = r8.mTarget
            if (r8 == 0) goto Le6
            r7 = r7[r0]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r7 = r7.mTarget
            androidx.constraintlayout.core.widgets.ConstraintWidget r7 = r7.mOwner
            if (r7 == r2) goto Le5
            goto Le6
        Le5:
            r9 = r4
        Le6:
            if (r9 == 0) goto Le9
            goto Leb
        Le9:
            r9 = r2
            r5 = 1
        Leb:
            r4 = r2
            r2 = r9
            goto La
        Lef:
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r13.mFirstVisibleWidget
            if (r1 == 0) goto Lfa
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r1 = r1.mListAnchors
            r1 = r1[r0]
            r1.getMargin()
        Lfa:
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r13.mLastVisibleWidget
            if (r1 == 0) goto L106
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r1 = r1.mListAnchors
            int r0 = r0 + r6
            r0 = r1[r0]
            r0.getMargin()
        L106:
            r13.mLast = r2
            int r0 = r13.mOrientation
            if (r0 != 0) goto L113
            boolean r0 = r13.mIsRtl
            if (r0 == 0) goto L113
            r13.mHead = r2
            goto L117
        L113:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r13.mFirst
            r13.mHead = r0
        L117:
            boolean r0 = r13.mHasDefinedWeights
            if (r0 == 0) goto L120
            boolean r0 = r13.mHasUndefinedWeights
            if (r0 == 0) goto L120
            r3 = 1
        L120:
            r13.mHasComplexMatchWeights = r3
            return
    }

    private static boolean isMatchConstraintEqualityCandidate(androidx.constraintlayout.core.widgets.ConstraintWidget r2, int r3) {
            int r0 = r2.getVisibility()
            r1 = 8
            if (r0 == r1) goto L1d
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r2.mListDimensionBehaviors
            r0 = r0[r3]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r0 != r1) goto L1d
            int[] r2 = r2.mResolvedMatchConstraintDefault
            r0 = r2[r3]
            if (r0 == 0) goto L1b
            r2 = r2[r3]
            r3 = 3
            if (r2 != r3) goto L1d
        L1b:
            r2 = 1
            goto L1e
        L1d:
            r2 = 0
        L1e:
            return r2
    }

    public void define() {
            r1 = this;
            boolean r0 = r1.mDefined
            if (r0 != 0) goto L7
            r1.defineChainProperties()
        L7:
            r0 = 1
            r1.mDefined = r0
            return
    }

    public androidx.constraintlayout.core.widgets.ConstraintWidget getFirst() {
            r1 = this;
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r1.mFirst
            return r0
    }

    public androidx.constraintlayout.core.widgets.ConstraintWidget getFirstMatchConstraintWidget() {
            r1 = this;
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r1.mFirstMatchConstraintWidget
            return r0
    }

    public androidx.constraintlayout.core.widgets.ConstraintWidget getFirstVisibleWidget() {
            r1 = this;
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r1.mFirstVisibleWidget
            return r0
    }

    public androidx.constraintlayout.core.widgets.ConstraintWidget getHead() {
            r1 = this;
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r1.mHead
            return r0
    }

    public androidx.constraintlayout.core.widgets.ConstraintWidget getLast() {
            r1 = this;
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r1.mLast
            return r0
    }

    public androidx.constraintlayout.core.widgets.ConstraintWidget getLastMatchConstraintWidget() {
            r1 = this;
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r1.mLastMatchConstraintWidget
            return r0
    }

    public androidx.constraintlayout.core.widgets.ConstraintWidget getLastVisibleWidget() {
            r1 = this;
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r1.mLastVisibleWidget
            return r0
    }

    public float getTotalWeight() {
            r1 = this;
            float r0 = r1.mTotalWeight
            return r0
    }
}
