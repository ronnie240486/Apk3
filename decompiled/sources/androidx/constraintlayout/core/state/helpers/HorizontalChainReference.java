package androidx.constraintlayout.core.state.helpers;

/* JADX INFO: loaded from: classes.dex */
public class HorizontalChainReference extends androidx.constraintlayout.core.state.helpers.ChainReference {

    /* JADX INFO: renamed from: androidx.constraintlayout.core.state.helpers.HorizontalChainReference$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$androidx$constraintlayout$core$state$State$Chain = null;

        static {
                androidx.constraintlayout.core.state.State$Chain[] r0 = androidx.constraintlayout.core.state.State.Chain.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.constraintlayout.core.state.helpers.HorizontalChainReference.AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$state$State$Chain = r0
                androidx.constraintlayout.core.state.State$Chain r1 = androidx.constraintlayout.core.state.State.Chain.SPREAD     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = androidx.constraintlayout.core.state.helpers.HorizontalChainReference.AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$state$State$Chain     // Catch: java.lang.NoSuchFieldError -> L1d
                androidx.constraintlayout.core.state.State$Chain r1 = androidx.constraintlayout.core.state.State.Chain.SPREAD_INSIDE     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = androidx.constraintlayout.core.state.helpers.HorizontalChainReference.AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$state$State$Chain     // Catch: java.lang.NoSuchFieldError -> L28
                androidx.constraintlayout.core.state.State$Chain r1 = androidx.constraintlayout.core.state.State.Chain.PACKED     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                return
        }
    }

    public HorizontalChainReference(androidx.constraintlayout.core.state.State r2) {
            r1 = this;
            androidx.constraintlayout.core.state.State$Helper r0 = androidx.constraintlayout.core.state.State.Helper.HORIZONTAL_CHAIN
            r1.<init>(r2, r0)
            return
    }

    @Override // androidx.constraintlayout.core.state.HelperReference, androidx.constraintlayout.core.state.ConstraintReference, androidx.constraintlayout.core.state.Reference
    public void apply() {
            r5 = this;
            java.util.ArrayList<java.lang.Object> r0 = r5.mReferences
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1a
            java.lang.Object r1 = r0.next()
            androidx.constraintlayout.core.state.State r2 = r5.mState
            androidx.constraintlayout.core.state.ConstraintReference r1 = r2.constraints(r1)
            r1.clearHorizontal()
            goto L6
        L1a:
            java.util.ArrayList<java.lang.Object> r0 = r5.mReferences
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
            r2 = r1
        L22:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L9c
            java.lang.Object r3 = r0.next()
            androidx.constraintlayout.core.state.State r4 = r5.mState
            androidx.constraintlayout.core.state.ConstraintReference r3 = r4.constraints(r3)
            if (r2 != 0) goto L8a
            java.lang.Object r2 = r5.mStartToStart
            if (r2 == 0) goto L48
            androidx.constraintlayout.core.state.ConstraintReference r2 = r3.startToStart(r2)
            int r4 = r5.mMarginStart
            androidx.constraintlayout.core.state.ConstraintReference r2 = r2.margin(r4)
            int r4 = r5.mMarginStartGone
            r2.marginGone(r4)
            goto L89
        L48:
            java.lang.Object r2 = r5.mStartToEnd
            if (r2 == 0) goto L5c
            androidx.constraintlayout.core.state.ConstraintReference r2 = r3.startToEnd(r2)
            int r4 = r5.mMarginStart
            androidx.constraintlayout.core.state.ConstraintReference r2 = r2.margin(r4)
            int r4 = r5.mMarginStartGone
            r2.marginGone(r4)
            goto L89
        L5c:
            java.lang.Object r2 = r5.mLeftToLeft
            if (r2 == 0) goto L70
            androidx.constraintlayout.core.state.ConstraintReference r2 = r3.startToStart(r2)
            int r4 = r5.mMarginLeft
            androidx.constraintlayout.core.state.ConstraintReference r2 = r2.margin(r4)
            int r4 = r5.mMarginLeftGone
            r2.marginGone(r4)
            goto L89
        L70:
            java.lang.Object r2 = r5.mLeftToRight
            if (r2 == 0) goto L84
            androidx.constraintlayout.core.state.ConstraintReference r2 = r3.startToEnd(r2)
            int r4 = r5.mMarginLeft
            androidx.constraintlayout.core.state.ConstraintReference r2 = r2.margin(r4)
            int r4 = r5.mMarginLeftGone
            r2.marginGone(r4)
            goto L89
        L84:
            java.lang.Integer r2 = androidx.constraintlayout.core.state.State.PARENT
            r3.startToStart(r2)
        L89:
            r2 = r3
        L8a:
            if (r1 == 0) goto L9a
            java.lang.Object r4 = r3.getKey()
            r1.endToStart(r4)
            java.lang.Object r1 = r1.getKey()
            r3.startToEnd(r1)
        L9a:
            r1 = r3
            goto L22
        L9c:
            if (r1 == 0) goto Lf3
            java.lang.Object r0 = r5.mEndToStart
            if (r0 == 0) goto Lb2
            androidx.constraintlayout.core.state.ConstraintReference r0 = r1.endToStart(r0)
            int r1 = r5.mMarginEnd
            androidx.constraintlayout.core.state.ConstraintReference r0 = r0.margin(r1)
            int r1 = r5.mMarginEndGone
            r0.marginGone(r1)
            goto Lf3
        Lb2:
            java.lang.Object r0 = r5.mEndToEnd
            if (r0 == 0) goto Lc6
            androidx.constraintlayout.core.state.ConstraintReference r0 = r1.endToEnd(r0)
            int r1 = r5.mMarginEnd
            androidx.constraintlayout.core.state.ConstraintReference r0 = r0.margin(r1)
            int r1 = r5.mMarginEndGone
            r0.marginGone(r1)
            goto Lf3
        Lc6:
            java.lang.Object r0 = r5.mRightToLeft
            if (r0 == 0) goto Lda
            androidx.constraintlayout.core.state.ConstraintReference r0 = r1.endToStart(r0)
            int r1 = r5.mMarginRight
            androidx.constraintlayout.core.state.ConstraintReference r0 = r0.margin(r1)
            int r1 = r5.mMarginRightGone
            r0.marginGone(r1)
            goto Lf3
        Lda:
            java.lang.Object r0 = r5.mRightToRight
            if (r0 == 0) goto Lee
            androidx.constraintlayout.core.state.ConstraintReference r0 = r1.endToEnd(r0)
            int r1 = r5.mMarginRight
            androidx.constraintlayout.core.state.ConstraintReference r0 = r0.margin(r1)
            int r1 = r5.mMarginRightGone
            r0.marginGone(r1)
            goto Lf3
        Lee:
            java.lang.Integer r0 = androidx.constraintlayout.core.state.State.PARENT
            r1.endToEnd(r0)
        Lf3:
            if (r2 != 0) goto Lf6
            return
        Lf6:
            float r0 = r5.mBias
            r1 = 1056964608(0x3f000000, float:0.5)
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 == 0) goto L101
            r2.horizontalBias(r0)
        L101:
            int[] r0 = androidx.constraintlayout.core.state.helpers.HorizontalChainReference.AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$state$State$Chain
            androidx.constraintlayout.core.state.State$Chain r1 = r5.mStyle
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L11d
            r3 = 2
            if (r0 == r3) goto L119
            r1 = 3
            if (r0 == r1) goto L115
            goto L121
        L115:
            r2.setHorizontalChainStyle(r3)
            goto L121
        L119:
            r2.setHorizontalChainStyle(r1)
            goto L121
        L11d:
            r0 = 0
            r2.setHorizontalChainStyle(r0)
        L121:
            return
    }
}
