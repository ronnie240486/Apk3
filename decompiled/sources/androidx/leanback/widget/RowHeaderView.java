package androidx.leanback.widget;

/* JADX INFO: loaded from: classes.dex */
public final class RowHeaderView extends android.widget.TextView {
    public RowHeaderView(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public RowHeaderView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            int r0 = androidx.leanback.R.attr.rowHeaderStyle
            r1.<init>(r2, r3, r0)
            return
    }

    public RowHeaderView(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(android.view.ActionMode.Callback r1) {
            r0 = this;
            android.view.ActionMode$Callback r1 = androidx.core.widget.TextViewCompat.wrapCustomSelectionActionModeCallback(r0, r1)
            super.setCustomSelectionActionModeCallback(r1)
            return
    }
}
