package androidx.constraintlayout.core.state.helpers;

/* JADX INFO: loaded from: classes2.dex */
public class VerticalChainReference extends androidx.constraintlayout.core.state.helpers.ChainReference {

    /* JADX INFO: renamed from: androidx.constraintlayout.core.state.helpers.VerticalChainReference$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$androidx$constraintlayout$core$state$State$Chain = null;

        static {
                androidx.constraintlayout.core.state.State$Chain[] r0 = androidx.constraintlayout.core.state.State.Chain.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.constraintlayout.core.state.helpers.VerticalChainReference.AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$state$State$Chain = r0
                androidx.constraintlayout.core.state.State$Chain r1 = androidx.constraintlayout.core.state.State.Chain.SPREAD     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = androidx.constraintlayout.core.state.helpers.VerticalChainReference.AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$state$State$Chain     // Catch: java.lang.NoSuchFieldError -> L1d
                androidx.constraintlayout.core.state.State$Chain r1 = androidx.constraintlayout.core.state.State.Chain.SPREAD_INSIDE     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = androidx.constraintlayout.core.state.helpers.VerticalChainReference.AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$state$State$Chain     // Catch: java.lang.NoSuchFieldError -> L28
                androidx.constraintlayout.core.state.State$Chain r1 = androidx.constraintlayout.core.state.State.Chain.PACKED     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                return
        }
    }

    public VerticalChainReference(androidx.constraintlayout.core.state.State r2) {
            r1 = this;
            androidx.constraintlayout.core.state.State$Helper r0 = androidx.constraintlayout.core.state.State.Helper.VERTICAL_CHAIN
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
            r1.clearVertical()
            goto L6
        L1a:
            java.util.ArrayList<java.lang.Object> r0 = r5.mReferences
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
            r2 = r1
        L22:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L74
            java.lang.Object r3 = r0.next()
            androidx.constraintlayout.core.state.State r4 = r5.mState
            androidx.constraintlayout.core.state.ConstraintReference r3 = r4.constraints(r3)
            if (r2 != 0) goto L62
            java.lang.Object r2 = r5.mTopToTop
            if (r2 == 0) goto L48
            androidx.constraintlayout.core.state.ConstraintReference r2 = r3.topToTop(r2)
            int r4 = r5.mMarginTop
            androidx.constraintlayout.core.state.ConstraintReference r2 = r2.margin(r4)
            int r4 = r5.mMarginTopGone
            r2.marginGone(r4)
            goto L61
        L48:
            java.lang.Object r2 = r5.mTopToBottom
            if (r2 == 0) goto L5c
            androidx.constraintlayout.core.state.ConstraintReference r2 = r3.topToBottom(r2)
            int r4 = r5.mMarginTop
            androidx.constraintlayout.core.state.ConstraintReference r2 = r2.margin(r4)
            int r4 = r5.mMarginTopGone
            r2.marginGone(r4)
            goto L61
        L5c:
            java.lang.Integer r2 = androidx.constraintlayout.core.state.State.PARENT
            r3.topToTop(r2)
        L61:
            r2 = r3
        L62:
            if (r1 == 0) goto L72
            java.lang.Object r4 = r3.getKey()
            r1.bottomToTop(r4)
            java.lang.Object r1 = r1.getKey()
            r3.topToBottom(r1)
        L72:
            r1 = r3
            goto L22
        L74:
            if (r1 == 0) goto La3
            java.lang.Object r0 = r5.mBottomToTop
            if (r0 == 0) goto L8a
            androidx.constraintlayout.core.state.ConstraintReference r0 = r1.bottomToTop(r0)
            int r1 = r5.mMarginBottom
            androidx.constraintlayout.core.state.ConstraintReference r0 = r0.margin(r1)
            int r1 = r5.mMarginBottomGone
            r0.marginGone(r1)
            goto La3
        L8a:
            java.lang.Object r0 = r5.mBottomToBottom
            if (r0 == 0) goto L9e
            androidx.constraintlayout.core.state.ConstraintReference r0 = r1.bottomToBottom(r0)
            int r1 = r5.mMarginBottom
            androidx.constraintlayout.core.state.ConstraintReference r0 = r0.margin(r1)
            int r1 = r5.mMarginBottomGone
            r0.marginGone(r1)
            goto La3
        L9e:
            java.lang.Integer r0 = androidx.constraintlayout.core.state.State.PARENT
            r1.bottomToBottom(r0)
        La3:
            if (r2 != 0) goto La6
            return
        La6:
            float r0 = r5.mBias
            r1 = 1056964608(0x3f000000, float:0.5)
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 == 0) goto Lb1
            r2.verticalBias(r0)
        Lb1:
            int[] r0 = androidx.constraintlayout.core.state.helpers.VerticalChainReference.AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$state$State$Chain
            androidx.constraintlayout.core.state.State$Chain r1 = r5.mStyle
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto Lcd
            r3 = 2
            if (r0 == r3) goto Lc9
            r1 = 3
            if (r0 == r1) goto Lc5
            goto Ld1
        Lc5:
            r2.setVerticalChainStyle(r3)
            goto Ld1
        Lc9:
            r2.setVerticalChainStyle(r1)
            goto Ld1
        Lcd:
            r0 = 0
            r2.setVerticalChainStyle(r0)
        Ld1:
            return
    }
}
