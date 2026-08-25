package androidx.recyclerview.widget;

/* JADX INFO: loaded from: classes2.dex */
class LayoutState {
    public int mAvailable;
    public int mCurrentPosition;
    public int mEndLine;
    public boolean mInfinite;
    public int mItemDirection;
    public int mLayoutDirection;
    public boolean mRecycle;
    public int mStartLine;
    public boolean mStopInFocusable;

    public LayoutState() {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.mRecycle = r0
            r0 = 0
            r1.mStartLine = r0
            r1.mEndLine = r0
            return
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "LayoutState{mAvailable="
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            int r1 = r3.mAvailable
            r0.append(r1)
            java.lang.String r1 = ", mCurrentPosition="
            r0.append(r1)
            int r1 = r3.mCurrentPosition
            r0.append(r1)
            java.lang.String r1 = ", mItemDirection="
            r0.append(r1)
            int r1 = r3.mItemDirection
            r0.append(r1)
            java.lang.String r1 = ", mLayoutDirection="
            r0.append(r1)
            int r1 = r3.mLayoutDirection
            r0.append(r1)
            java.lang.String r1 = ", mStartLine="
            r0.append(r1)
            int r1 = r3.mStartLine
            r0.append(r1)
            java.lang.String r1 = ", mEndLine="
            r0.append(r1)
            int r1 = r3.mEndLine
            r2 = 125(0x7d, float:1.75E-43)
            java.lang.String r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r1, r2)
            return r0
    }
}
