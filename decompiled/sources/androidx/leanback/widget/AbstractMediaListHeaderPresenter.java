package androidx.leanback.widget;

/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractMediaListHeaderPresenter extends androidx.leanback.widget.RowPresenter {
    private int mBackgroundColor;
    private boolean mBackgroundColorSet;
    private final android.content.Context mContext;

    public static class ViewHolder extends androidx.leanback.widget.RowPresenter.ViewHolder {
        private final android.widget.TextView mHeaderView;

        public ViewHolder(android.view.View r2) {
                r1 = this;
                r1.<init>(r2)
                int r0 = androidx.leanback.R.id.mediaListHeader
                android.view.View r2 = r2.findViewById(r0)
                android.widget.TextView r2 = (android.widget.TextView) r2
                r1.mHeaderView = r2
                return
        }

        public android.widget.TextView getHeaderView() {
                r1 = this;
                android.widget.TextView r0 = r1.mHeaderView
                return r0
        }
    }

    public AbstractMediaListHeaderPresenter() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.mBackgroundColor = r0
            r0 = 0
            r1.mContext = r0
            r1.setHeaderPresenter(r0)
            return
    }

    public AbstractMediaListHeaderPresenter(android.content.Context r2, int r3) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.mBackgroundColor = r0
            android.view.ContextThemeWrapper r0 = new android.view.ContextThemeWrapper
            android.content.Context r2 = r2.getApplicationContext()
            r0.<init>(r2, r3)
            r1.mContext = r0
            r2 = 0
            r1.setHeaderPresenter(r2)
            return
    }

    @Override // androidx.leanback.widget.RowPresenter
    public final androidx.leanback.widget.RowPresenter.ViewHolder createRowViewHolder(android.view.ViewGroup r4) {
            r3 = this;
            android.content.Context r0 = r3.mContext
            if (r0 == 0) goto L5
            goto L9
        L5:
            android.content.Context r0 = r4.getContext()
        L9:
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            int r1 = androidx.leanback.R.layout.lb_media_list_header
            r2 = 0
            android.view.View r4 = r0.inflate(r1, r4, r2)
            r4.setFocusable(r2)
            r4.setFocusableInTouchMode(r2)
            androidx.leanback.widget.AbstractMediaListHeaderPresenter$ViewHolder r0 = new androidx.leanback.widget.AbstractMediaListHeaderPresenter$ViewHolder
            r0.<init>(r4)
            boolean r4 = r3.mBackgroundColorSet
            if (r4 == 0) goto L2a
            android.view.View r4 = r0.view
            int r1 = r3.mBackgroundColor
            r4.setBackgroundColor(r1)
        L2a:
            return r0
    }

    @Override // androidx.leanback.widget.RowPresenter
    public boolean isUsingDefaultSelectEffect() {
            r1 = this;
            r0 = 0
            return r0
    }

    public abstract void onBindMediaListHeaderViewHolder();

    @Override // androidx.leanback.widget.RowPresenter
    public final void onBindRowViewHolder(androidx.leanback.widget.RowPresenter.ViewHolder r1, java.lang.Object r2) {
            r0 = this;
            super.onBindRowViewHolder(r1, r2)
            androidx.leanback.widget.AbstractMediaListHeaderPresenter$ViewHolder r1 = (androidx.leanback.widget.AbstractMediaListHeaderPresenter.ViewHolder) r1
            r0.onBindMediaListHeaderViewHolder()
            return
    }

    public void setBackgroundColor(int r2) {
            r1 = this;
            r0 = 1
            r1.mBackgroundColorSet = r0
            r1.mBackgroundColor = r2
            return
    }
}
