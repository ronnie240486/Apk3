package androidx.leanback.widget;

/* JADX INFO: loaded from: classes.dex */
public final class ListRowView extends android.widget.LinearLayout {
    private androidx.leanback.widget.HorizontalGridView mGridView;

    public ListRowView(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public ListRowView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public ListRowView(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r1)
            int r2 = androidx.leanback.R.layout.lb_list_row
            r1.inflate(r2, r0)
            int r1 = androidx.leanback.R.id.row_content
            android.view.View r1 = r0.findViewById(r1)
            androidx.leanback.widget.HorizontalGridView r1 = (androidx.leanback.widget.HorizontalGridView) r1
            r0.mGridView = r1
            r2 = 0
            r1.setHasFixedSize(r2)
            r1 = 1
            r0.setOrientation(r1)
            r1 = 262144(0x40000, float:3.67342E-40)
            r0.setDescendantFocusability(r1)
            return
    }

    public androidx.leanback.widget.HorizontalGridView getGridView() {
            r1 = this;
            androidx.leanback.widget.HorizontalGridView r0 = r1.mGridView
            return r0
    }
}
