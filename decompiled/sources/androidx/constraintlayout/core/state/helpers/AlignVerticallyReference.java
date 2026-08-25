package androidx.constraintlayout.core.state.helpers;

/* JADX INFO: loaded from: classes3.dex */
public class AlignVerticallyReference extends androidx.constraintlayout.core.state.HelperReference {
    private float mBias;

    public AlignVerticallyReference(androidx.constraintlayout.core.state.State r2) {
            r1 = this;
            androidx.constraintlayout.core.state.State$Helper r0 = androidx.constraintlayout.core.state.State.Helper.ALIGN_VERTICALLY
            r1.<init>(r2, r0)
            r2 = 1056964608(0x3f000000, float:0.5)
            r1.mBias = r2
            return
    }

    @Override // androidx.constraintlayout.core.state.HelperReference, androidx.constraintlayout.core.state.ConstraintReference, androidx.constraintlayout.core.state.Reference
    public void apply() {
            r4 = this;
            java.util.ArrayList<java.lang.Object> r0 = r4.mReferences
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L4f
            java.lang.Object r1 = r0.next()
            androidx.constraintlayout.core.state.State r2 = r4.mState
            androidx.constraintlayout.core.state.ConstraintReference r1 = r2.constraints(r1)
            r1.clearVertical()
            java.lang.Object r2 = r4.mTopToTop
            if (r2 == 0) goto L21
            r1.topToTop(r2)
            goto L2e
        L21:
            java.lang.Object r2 = r4.mTopToBottom
            if (r2 == 0) goto L29
            r1.topToBottom(r2)
            goto L2e
        L29:
            java.lang.Integer r2 = androidx.constraintlayout.core.state.State.PARENT
            r1.topToTop(r2)
        L2e:
            java.lang.Object r2 = r4.mBottomToTop
            if (r2 == 0) goto L36
            r1.bottomToTop(r2)
            goto L43
        L36:
            java.lang.Object r2 = r4.mBottomToBottom
            if (r2 == 0) goto L3e
            r1.bottomToBottom(r2)
            goto L43
        L3e:
            java.lang.Integer r2 = androidx.constraintlayout.core.state.State.PARENT
            r1.bottomToBottom(r2)
        L43:
            float r2 = r4.mBias
            r3 = 1056964608(0x3f000000, float:0.5)
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 == 0) goto L6
            r1.verticalBias(r2)
            goto L6
        L4f:
            return
    }
}
