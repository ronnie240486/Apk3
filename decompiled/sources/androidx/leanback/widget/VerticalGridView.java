package androidx.leanback.widget;

/* JADX INFO: loaded from: classes.dex */
public class VerticalGridView extends androidx.leanback.widget.BaseGridView {
    public VerticalGridView(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public VerticalGridView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public VerticalGridView(android.content.Context r2, android.util.AttributeSet r3, int r4) {
            r1 = this;
            r1.<init>(r2, r3, r4)
            androidx.leanback.widget.GridLayoutManager r4 = r1.mLayoutManager
            r0 = 1
            r4.setOrientation(r0)
            r1.initBaseGridViewAttributes(r2, r3)
            int[] r4 = androidx.leanback.R.styleable.lbVerticalGridView
            android.content.res.TypedArray r2 = r2.obtainStyledAttributes(r3, r4)
            r1.setColumnWidth(r2)
            int r3 = androidx.leanback.R.styleable.lbVerticalGridView_numberOfColumns
            int r3 = r2.getInt(r3, r0)
            r1.setNumColumns(r3)
            r2.recycle()
            return
    }

    public void setColumnWidth(int r2) {
            r1 = this;
            androidx.leanback.widget.GridLayoutManager r0 = r1.mLayoutManager
            r0.setRowHeight(r2)
            r1.requestLayout()
            return
    }

    public void setColumnWidth(android.content.res.TypedArray r3) {
            r2 = this;
            int r0 = androidx.leanback.R.styleable.lbVerticalGridView_columnWidth
            android.util.TypedValue r1 = r3.peekValue(r0)
            if (r1 == 0) goto L10
            r1 = 0
            int r3 = r3.getLayoutDimension(r0, r1)
            r2.setColumnWidth(r3)
        L10:
            return
    }

    public void setNumColumns(int r2) {
            r1 = this;
            androidx.leanback.widget.GridLayoutManager r0 = r1.mLayoutManager
            r0.setNumRows(r2)
            r1.requestLayout()
            return
    }
}
