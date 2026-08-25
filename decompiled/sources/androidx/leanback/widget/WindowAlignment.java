package androidx.leanback.widget;

/* JADX INFO: loaded from: classes.dex */
class WindowAlignment {
    public final androidx.leanback.widget.WindowAlignment.Axis horizontal;
    private androidx.leanback.widget.WindowAlignment.Axis mMainAxis;
    private int mOrientation;
    private androidx.leanback.widget.WindowAlignment.Axis mSecondAxis;
    public final androidx.leanback.widget.WindowAlignment.Axis vertical;

    /* JADX INFO: loaded from: classes3.dex */
    public static class Axis {
        private int mMaxEdge;
        private int mMaxScroll;
        private int mMinEdge;
        private int mMinScroll;
        private java.lang.String mName;
        private int mPaddingMax;
        private int mPaddingMin;
        private int mPreferredKeyLine;
        private boolean mReversedFlow;
        private int mSize;
        private int mWindowAlignment;
        private int mWindowAlignmentOffset;
        private float mWindowAlignmentOffsetPercent;

        public Axis(java.lang.String r2) {
                r1 = this;
                r1.<init>()
                r0 = 2
                r1.mPreferredKeyLine = r0
                r0 = 3
                r1.mWindowAlignment = r0
                r0 = 0
                r1.mWindowAlignmentOffset = r0
                r0 = 1112014848(0x42480000, float:50.0)
                r1.mWindowAlignmentOffsetPercent = r0
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r1.mMinEdge = r0
                r0 = 2147483647(0x7fffffff, float:NaN)
                r1.mMaxEdge = r0
                r1.mName = r2
                return
        }

        public final int calculateKeyline() {
                r4 = this;
                boolean r0 = r4.mReversedFlow
                r1 = 1120403456(0x42c80000, float:100.0)
                r2 = -1082130432(0xffffffffbf800000, float:-1.0)
                if (r0 != 0) goto L1f
                int r0 = r4.mWindowAlignmentOffset
                if (r0 < 0) goto Ld
                goto L10
            Ld:
                int r3 = r4.mSize
                int r0 = r0 + r3
            L10:
                float r3 = r4.mWindowAlignmentOffsetPercent
                int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
                if (r2 == 0) goto L37
                int r2 = r4.mSize
                float r2 = (float) r2
                float r2 = r2 * r3
                float r2 = r2 / r1
                int r1 = (int) r2
                int r0 = r0 + r1
                goto L37
            L1f:
                int r0 = r4.mWindowAlignmentOffset
                if (r0 < 0) goto L28
                int r3 = r4.mSize
                int r3 = r3 - r0
                r0 = r3
                goto L29
            L28:
                int r0 = -r0
            L29:
                float r3 = r4.mWindowAlignmentOffsetPercent
                int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
                if (r2 == 0) goto L37
                int r2 = r4.mSize
                float r2 = (float) r2
                float r2 = r2 * r3
                float r2 = r2 / r1
                int r1 = (int) r2
                int r0 = r0 - r1
            L37:
                return r0
        }

        public final int getClientSize() {
                r2 = this;
                int r0 = r2.mSize
                int r1 = r2.mPaddingMin
                int r0 = r0 - r1
                int r1 = r2.mPaddingMax
                int r0 = r0 - r1
                return r0
        }

        public final int getMaxScroll() {
                r1 = this;
                int r0 = r1.mMaxScroll
                return r0
        }

        public final int getMinScroll() {
                r1 = this;
                int r0 = r1.mMinScroll
                return r0
        }

        public final int getPaddingMax() {
                r1 = this;
                int r0 = r1.mPaddingMax
                return r0
        }

        public final int getPaddingMin() {
                r1 = this;
                int r0 = r1.mPaddingMin
                return r0
        }

        public final int getScroll(int r9) {
                r8 = this;
                int r0 = r8.getSize()
                int r1 = r8.calculateKeyline()
                boolean r2 = r8.isMinUnknown()
                boolean r3 = r8.isMaxUnknown()
                if (r2 != 0) goto L36
                int r4 = r8.mPaddingMin
                int r5 = r1 - r4
                boolean r6 = r8.mReversedFlow
                if (r6 != 0) goto L21
                int r6 = r8.mWindowAlignment
                r6 = r6 & 1
                if (r6 == 0) goto L36
                goto L27
            L21:
                int r6 = r8.mWindowAlignment
                r6 = r6 & 2
                if (r6 == 0) goto L36
            L27:
                int r6 = r8.mMinEdge
                int r7 = r9 - r6
                if (r7 > r5) goto L36
                int r6 = r6 - r4
                if (r3 != 0) goto L35
                int r9 = r8.mMaxScroll
                if (r6 <= r9) goto L35
                r6 = r9
            L35:
                return r6
            L36:
                if (r3 != 0) goto L5e
                int r3 = r0 - r1
                int r4 = r8.mPaddingMax
                int r3 = r3 - r4
                boolean r5 = r8.mReversedFlow
                if (r5 != 0) goto L48
                int r5 = r8.mWindowAlignment
                r5 = r5 & 2
                if (r5 == 0) goto L5e
                goto L4e
            L48:
                int r5 = r8.mWindowAlignment
                r5 = r5 & 1
                if (r5 == 0) goto L5e
            L4e:
                int r5 = r8.mMaxEdge
                int r6 = r5 - r9
                if (r6 > r3) goto L5e
                int r0 = r0 - r4
                int r5 = r5 - r0
                if (r2 != 0) goto L5d
                int r9 = r8.mMinScroll
                if (r5 >= r9) goto L5d
                r5 = r9
            L5d:
                return r5
            L5e:
                int r9 = r9 - r1
                return r9
        }

        public final int getSize() {
                r1 = this;
                int r0 = r1.mSize
                return r0
        }

        public final int getWindowAlignment() {
                r1 = this;
                int r0 = r1.mWindowAlignment
                return r0
        }

        public final int getWindowAlignmentOffset() {
                r1 = this;
                int r0 = r1.mWindowAlignmentOffset
                return r0
        }

        public final float getWindowAlignmentOffsetPercent() {
                r1 = this;
                float r0 = r1.mWindowAlignmentOffsetPercent
                return r0
        }

        public final void invalidateScrollMax() {
                r1 = this;
                r0 = 2147483647(0x7fffffff, float:NaN)
                r1.mMaxEdge = r0
                r1.mMaxScroll = r0
                return
        }

        public final void invalidateScrollMin() {
                r1 = this;
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r1.mMinEdge = r0
                r1.mMinScroll = r0
                return
        }

        public final boolean isMaxUnknown() {
                r2 = this;
                int r0 = r2.mMaxEdge
                r1 = 2147483647(0x7fffffff, float:NaN)
                if (r0 != r1) goto L9
                r0 = 1
                goto La
            L9:
                r0 = 0
            La:
                return r0
        }

        public final boolean isMinUnknown() {
                r2 = this;
                int r0 = r2.mMinEdge
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                if (r0 != r1) goto L8
                r0 = 1
                goto L9
            L8:
                r0 = 0
            L9:
                return r0
        }

        public final boolean isPreferKeylineOverHighEdge() {
                r1 = this;
                int r0 = r1.mPreferredKeyLine
                r0 = r0 & 2
                if (r0 == 0) goto L8
                r0 = 1
                goto L9
            L8:
                r0 = 0
            L9:
                return r0
        }

        public final boolean isPreferKeylineOverLowEdge() {
                r2 = this;
                int r0 = r2.mPreferredKeyLine
                r1 = 1
                r0 = r0 & r1
                if (r0 == 0) goto L7
                goto L8
            L7:
                r1 = 0
            L8:
                return r1
        }

        public final void reset() {
                r1 = this;
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r1.mMinEdge = r0
                r0 = 2147483647(0x7fffffff, float:NaN)
                r1.mMaxEdge = r0
                return
        }

        public final void setPadding(int r1, int r2) {
                r0 = this;
                r0.mPaddingMin = r1
                r0.mPaddingMax = r2
                return
        }

        public final void setPreferKeylineOverHighEdge(boolean r1) {
                r0 = this;
                if (r1 == 0) goto L7
                int r1 = r0.mPreferredKeyLine
                r1 = r1 | 2
                goto Lb
            L7:
                int r1 = r0.mPreferredKeyLine
                r1 = r1 & (-3)
            Lb:
                r0.mPreferredKeyLine = r1
                return
        }

        public final void setPreferKeylineOverLowEdge(boolean r1) {
                r0 = this;
                if (r1 == 0) goto L7
                int r1 = r0.mPreferredKeyLine
                r1 = r1 | 1
                goto Lb
            L7:
                int r1 = r0.mPreferredKeyLine
                r1 = r1 & (-2)
            Lb:
                r0.mPreferredKeyLine = r1
                return
        }

        public final void setReversedFlow(boolean r1) {
                r0 = this;
                r0.mReversedFlow = r1
                return
        }

        public final void setSize(int r1) {
                r0 = this;
                r0.mSize = r1
                return
        }

        public final void setWindowAlignment(int r1) {
                r0 = this;
                r0.mWindowAlignment = r1
                return
        }

        public final void setWindowAlignmentOffset(int r1) {
                r0 = this;
                r0.mWindowAlignmentOffset = r1
                return
        }

        public final void setWindowAlignmentOffsetPercent(float r2) {
                r1 = this;
                r0 = 0
                int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r0 < 0) goto Lb
                r0 = 1120403456(0x42c80000, float:100.0)
                int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r0 <= 0) goto L11
            Lb:
                r0 = -1082130432(0xffffffffbf800000, float:-1.0)
                int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r0 != 0) goto L14
            L11:
                r1.mWindowAlignmentOffsetPercent = r2
                return
            L14:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                r2.<init>()
                throw r2
        }

        public java.lang.String toString() {
                r3 = this;
                java.lang.String r0 = " min:"
                java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
                int r1 = r3.mMinEdge
                r0.append(r1)
                java.lang.String r1 = " "
                r0.append(r1)
                int r2 = r3.mMinScroll
                r0.append(r2)
                java.lang.String r2 = " max:"
                r0.append(r2)
                int r2 = r3.mMaxEdge
                r0.append(r2)
                r0.append(r1)
                int r1 = r3.mMaxScroll
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }

        public final void updateMinMax(int r5, int r6, int r7, int r8) {
                r4 = this;
                r4.mMinEdge = r5
                r4.mMaxEdge = r6
                int r5 = r4.getClientSize()
                int r6 = r4.calculateKeyline()
                boolean r0 = r4.isMinUnknown()
                boolean r1 = r4.isMaxUnknown()
                if (r0 != 0) goto L33
                boolean r2 = r4.mReversedFlow
                if (r2 != 0) goto L21
                int r2 = r4.mWindowAlignment
                r2 = r2 & 1
                if (r2 == 0) goto L2f
                goto L27
            L21:
                int r2 = r4.mWindowAlignment
                r2 = r2 & 2
                if (r2 == 0) goto L2f
            L27:
                int r2 = r4.mMinEdge
                int r3 = r4.mPaddingMin
                int r2 = r2 - r3
                r4.mMinScroll = r2
                goto L33
            L2f:
                int r2 = r7 - r6
                r4.mMinScroll = r2
            L33:
                if (r1 != 0) goto L53
                boolean r2 = r4.mReversedFlow
                if (r2 != 0) goto L40
                int r2 = r4.mWindowAlignment
                r2 = r2 & 2
                if (r2 == 0) goto L4f
                goto L46
            L40:
                int r2 = r4.mWindowAlignment
                r2 = r2 & 1
                if (r2 == 0) goto L4f
            L46:
                int r2 = r4.mMaxEdge
                int r3 = r4.mPaddingMin
                int r2 = r2 - r3
                int r2 = r2 - r5
                r4.mMaxScroll = r2
                goto L53
            L4f:
                int r5 = r8 - r6
                r4.mMaxScroll = r5
            L53:
                if (r1 != 0) goto Ld6
                if (r0 != 0) goto Ld6
                boolean r5 = r4.mReversedFlow
                if (r5 != 0) goto L99
                int r5 = r4.mWindowAlignment
                r0 = r5 & 1
                if (r0 == 0) goto L7b
                boolean r5 = r4.isPreferKeylineOverLowEdge()
                if (r5 == 0) goto L70
                int r5 = r4.mMinScroll
                int r8 = r8 - r6
                int r5 = java.lang.Math.min(r5, r8)
                r4.mMinScroll = r5
            L70:
                int r5 = r4.mMinScroll
                int r6 = r4.mMaxScroll
                int r5 = java.lang.Math.max(r5, r6)
                r4.mMaxScroll = r5
                goto Ld6
            L7b:
                r5 = r5 & 2
                if (r5 == 0) goto Ld6
                boolean r5 = r4.isPreferKeylineOverHighEdge()
                if (r5 == 0) goto L8e
                int r5 = r4.mMaxScroll
                int r7 = r7 - r6
                int r5 = java.lang.Math.max(r5, r7)
                r4.mMaxScroll = r5
            L8e:
                int r5 = r4.mMinScroll
                int r6 = r4.mMaxScroll
                int r5 = java.lang.Math.min(r5, r6)
                r4.mMinScroll = r5
                goto Ld6
            L99:
                int r5 = r4.mWindowAlignment
                r0 = r5 & 1
                if (r0 == 0) goto Lb9
                boolean r5 = r4.isPreferKeylineOverLowEdge()
                if (r5 == 0) goto Lae
                int r5 = r4.mMaxScroll
                int r7 = r7 - r6
                int r5 = java.lang.Math.max(r5, r7)
                r4.mMaxScroll = r5
            Lae:
                int r5 = r4.mMinScroll
                int r6 = r4.mMaxScroll
                int r5 = java.lang.Math.min(r5, r6)
                r4.mMinScroll = r5
                goto Ld6
            Lb9:
                r5 = r5 & 2
                if (r5 == 0) goto Ld6
                boolean r5 = r4.isPreferKeylineOverHighEdge()
                if (r5 == 0) goto Lcc
                int r5 = r4.mMinScroll
                int r8 = r8 - r6
                int r5 = java.lang.Math.min(r5, r8)
                r4.mMinScroll = r5
            Lcc:
                int r5 = r4.mMinScroll
                int r6 = r4.mMaxScroll
                int r5 = java.lang.Math.max(r5, r6)
                r4.mMaxScroll = r5
            Ld6:
                return
        }
    }

    public WindowAlignment() {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.mOrientation = r0
            androidx.leanback.widget.WindowAlignment$Axis r0 = new androidx.leanback.widget.WindowAlignment$Axis
            java.lang.String r1 = "vertical"
            r0.<init>(r1)
            r3.vertical = r0
            androidx.leanback.widget.WindowAlignment$Axis r1 = new androidx.leanback.widget.WindowAlignment$Axis
            java.lang.String r2 = "horizontal"
            r1.<init>(r2)
            r3.horizontal = r1
            r3.mMainAxis = r1
            r3.mSecondAxis = r0
            return
    }

    public final int getOrientation() {
            r1 = this;
            int r0 = r1.mOrientation
            return r0
    }

    public final androidx.leanback.widget.WindowAlignment.Axis mainAxis() {
            r1 = this;
            androidx.leanback.widget.WindowAlignment$Axis r0 = r1.mMainAxis
            return r0
    }

    public final void reset() {
            r1 = this;
            androidx.leanback.widget.WindowAlignment$Axis r0 = r1.mainAxis()
            r0.reset()
            return
    }

    public final androidx.leanback.widget.WindowAlignment.Axis secondAxis() {
            r1 = this;
            androidx.leanback.widget.WindowAlignment$Axis r0 = r1.mSecondAxis
            return r0
    }

    public final void setOrientation(int r1) {
            r0 = this;
            r0.mOrientation = r1
            if (r1 != 0) goto Ld
            androidx.leanback.widget.WindowAlignment$Axis r1 = r0.horizontal
            r0.mMainAxis = r1
            androidx.leanback.widget.WindowAlignment$Axis r1 = r0.vertical
            r0.mSecondAxis = r1
            goto L15
        Ld:
            androidx.leanback.widget.WindowAlignment$Axis r1 = r0.vertical
            r0.mMainAxis = r1
            androidx.leanback.widget.WindowAlignment$Axis r1 = r0.horizontal
            r0.mSecondAxis = r1
        L15:
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "horizontal="
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            androidx.leanback.widget.WindowAlignment$Axis r1 = r2.horizontal
            r0.append(r1)
            java.lang.String r1 = "; vertical="
            r0.append(r1)
            androidx.leanback.widget.WindowAlignment$Axis r1 = r2.vertical
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
