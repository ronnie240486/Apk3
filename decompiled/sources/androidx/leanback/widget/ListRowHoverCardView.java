package androidx.leanback.widget;

/* JADX INFO: loaded from: classes2.dex */
public final class ListRowHoverCardView extends android.widget.LinearLayout {
    private final android.widget.TextView mDescriptionView;
    private final android.widget.TextView mTitleView;

    public ListRowHoverCardView(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public ListRowHoverCardView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public ListRowHoverCardView(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r1)
            int r2 = androidx.leanback.R.layout.lb_list_row_hovercard
            r1.inflate(r2, r0)
            int r1 = androidx.leanback.R.id.title
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.mTitleView = r1
            int r1 = androidx.leanback.R.id.description
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.mDescriptionView = r1
            return
    }

    public final java.lang.CharSequence getDescription() {
            r1 = this;
            android.widget.TextView r0 = r1.mDescriptionView
            java.lang.CharSequence r0 = r0.getText()
            return r0
    }

    public final java.lang.CharSequence getTitle() {
            r1 = this;
            android.widget.TextView r0 = r1.mTitleView
            java.lang.CharSequence r0 = r0.getText()
            return r0
    }

    public final void setDescription(java.lang.CharSequence r2) {
            r1 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L12
            android.widget.TextView r0 = r1.mDescriptionView
            r0.setText(r2)
            android.widget.TextView r2 = r1.mDescriptionView
            r0 = 0
            r2.setVisibility(r0)
            goto L19
        L12:
            android.widget.TextView r2 = r1.mDescriptionView
            r0 = 8
            r2.setVisibility(r0)
        L19:
            return
    }

    public final void setTitle(java.lang.CharSequence r2) {
            r1 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L12
            android.widget.TextView r0 = r1.mTitleView
            r0.setText(r2)
            android.widget.TextView r2 = r1.mTitleView
            r0 = 0
            r2.setVisibility(r0)
            goto L19
        L12:
            android.widget.TextView r2 = r1.mTitleView
            r0 = 8
            r2.setVisibility(r0)
        L19:
            return
    }
}
