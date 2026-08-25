package androidx.leanback.widget;

/* JADX INFO: loaded from: classes.dex */
class ItemAlignment {
    public final androidx.leanback.widget.ItemAlignment.Axis horizontal;
    private androidx.leanback.widget.ItemAlignment.Axis mMainAxis;
    private int mOrientation;
    private androidx.leanback.widget.ItemAlignment.Axis mSecondAxis;
    public final androidx.leanback.widget.ItemAlignment.Axis vertical;

    public static final class Axis extends androidx.leanback.widget.ItemAlignmentFacet.ItemAlignmentDef {
        private int mOrientation;

        public Axis(int r1) {
                r0 = this;
                r0.<init>()
                r0.mOrientation = r1
                return
        }

        public int getAlignmentPosition(android.view.View r2) {
                r1 = this;
                int r0 = r1.mOrientation
                int r2 = androidx.leanback.widget.ItemAlignmentFacetHelper.getAlignmentPosition(r2, r1, r0)
                return r2
        }
    }

    public ItemAlignment() {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.mOrientation = r0
            androidx.leanback.widget.ItemAlignment$Axis r1 = new androidx.leanback.widget.ItemAlignment$Axis
            r2 = 1
            r1.<init>(r2)
            r3.vertical = r1
            androidx.leanback.widget.ItemAlignment$Axis r2 = new androidx.leanback.widget.ItemAlignment$Axis
            r2.<init>(r0)
            r3.horizontal = r2
            r3.mMainAxis = r2
            r3.mSecondAxis = r1
            return
    }

    public final int getOrientation() {
            r1 = this;
            int r0 = r1.mOrientation
            return r0
    }

    public final androidx.leanback.widget.ItemAlignment.Axis mainAxis() {
            r1 = this;
            androidx.leanback.widget.ItemAlignment$Axis r0 = r1.mMainAxis
            return r0
    }

    public final androidx.leanback.widget.ItemAlignment.Axis secondAxis() {
            r1 = this;
            androidx.leanback.widget.ItemAlignment$Axis r0 = r1.mSecondAxis
            return r0
    }

    public final void setOrientation(int r1) {
            r0 = this;
            r0.mOrientation = r1
            if (r1 != 0) goto Ld
            androidx.leanback.widget.ItemAlignment$Axis r1 = r0.horizontal
            r0.mMainAxis = r1
            androidx.leanback.widget.ItemAlignment$Axis r1 = r0.vertical
            r0.mSecondAxis = r1
            goto L15
        Ld:
            androidx.leanback.widget.ItemAlignment$Axis r1 = r0.vertical
            r0.mMainAxis = r1
            androidx.leanback.widget.ItemAlignment$Axis r1 = r0.horizontal
            r0.mSecondAxis = r1
        L15:
            return
    }
}
