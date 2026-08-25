package androidx.leanback.widget;

/* JADX INFO: loaded from: classes3.dex */
public final class ItemAlignmentFacet {
    public static final float ITEM_ALIGN_OFFSET_PERCENT_DISABLED = -1.0f;
    private androidx.leanback.widget.ItemAlignmentFacet.ItemAlignmentDef[] mAlignmentDefs;

    /* JADX INFO: loaded from: classes.dex */
    public static class ItemAlignmentDef {
        private boolean mAlignToBaseline;
        public int mFocusViewId;
        public int mOffset;
        public float mOffsetPercent;
        public boolean mOffsetWithPadding;
        public int mViewId;

        public ItemAlignmentDef() {
                r2 = this;
                r2.<init>()
                r0 = -1
                r2.mViewId = r0
                r2.mFocusViewId = r0
                r0 = 0
                r2.mOffset = r0
                r1 = 1112014848(0x42480000, float:50.0)
                r2.mOffsetPercent = r1
                r2.mOffsetWithPadding = r0
                return
        }

        public final int getItemAlignmentFocusViewId() {
                r2 = this;
                int r0 = r2.mFocusViewId
                r1 = -1
                if (r0 == r1) goto L6
                goto L8
            L6:
                int r0 = r2.mViewId
            L8:
                return r0
        }

        public final int getItemAlignmentOffset() {
                r1 = this;
                int r0 = r1.mOffset
                return r0
        }

        public final float getItemAlignmentOffsetPercent() {
                r1 = this;
                float r0 = r1.mOffsetPercent
                return r0
        }

        public final int getItemAlignmentViewId() {
                r1 = this;
                int r0 = r1.mViewId
                return r0
        }

        public boolean isAlignedToTextViewBaseLine() {
                r1 = this;
                boolean r0 = r1.mAlignToBaseline
                return r0
        }

        public final boolean isItemAlignmentOffsetWithPadding() {
                r1 = this;
                boolean r0 = r1.mOffsetWithPadding
                return r0
        }

        public final void setAlignedToTextViewBaseline(boolean r1) {
                r0 = this;
                r0.mAlignToBaseline = r1
                return
        }

        public final void setItemAlignmentFocusViewId(int r1) {
                r0 = this;
                r0.mFocusViewId = r1
                return
        }

        public final void setItemAlignmentOffset(int r1) {
                r0 = this;
                r0.mOffset = r1
                return
        }

        public final void setItemAlignmentOffsetPercent(float r2) {
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
                r1.mOffsetPercent = r2
                return
            L14:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                r2.<init>()
                throw r2
        }

        public final void setItemAlignmentOffsetWithPadding(boolean r1) {
                r0 = this;
                r0.mOffsetWithPadding = r1
                return
        }

        public final void setItemAlignmentViewId(int r1) {
                r0 = this;
                r0.mViewId = r1
                return
        }
    }

    public ItemAlignmentFacet() {
            r3 = this;
            r3.<init>()
            r0 = 1
            androidx.leanback.widget.ItemAlignmentFacet$ItemAlignmentDef[] r0 = new androidx.leanback.widget.ItemAlignmentFacet.ItemAlignmentDef[r0]
            androidx.leanback.widget.ItemAlignmentFacet$ItemAlignmentDef r1 = new androidx.leanback.widget.ItemAlignmentFacet$ItemAlignmentDef
            r1.<init>()
            r2 = 0
            r0[r2] = r1
            r3.mAlignmentDefs = r0
            return
    }

    public androidx.leanback.widget.ItemAlignmentFacet.ItemAlignmentDef[] getAlignmentDefs() {
            r1 = this;
            androidx.leanback.widget.ItemAlignmentFacet$ItemAlignmentDef[] r0 = r1.mAlignmentDefs
            return r0
    }

    public boolean isMultiAlignment() {
            r2 = this;
            androidx.leanback.widget.ItemAlignmentFacet$ItemAlignmentDef[] r0 = r2.mAlignmentDefs
            int r0 = r0.length
            r1 = 1
            if (r0 <= r1) goto L7
            goto L8
        L7:
            r1 = 0
        L8:
            return r1
    }

    public void setAlignmentDefs(androidx.leanback.widget.ItemAlignmentFacet.ItemAlignmentDef[] r3) {
            r2 = this;
            if (r3 == 0) goto L9
            int r0 = r3.length
            r1 = 1
            if (r0 < r1) goto L9
            r2.mAlignmentDefs = r3
            return
        L9:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            r3.<init>()
            throw r3
    }
}
