package androidx.leanback.widget;

/* JADX INFO: loaded from: classes.dex */
public class DividerPresenter extends androidx.leanback.widget.Presenter {
    private final int mLayoutResourceId;

    public DividerPresenter() {
            r1 = this;
            int r0 = androidx.leanback.R.layout.lb_divider
            r1.<init>(r0)
            return
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public DividerPresenter(int r1) {
            r0 = this;
            r0.<init>()
            r0.mLayoutResourceId = r1
            return
    }

    @Override // androidx.leanback.widget.Presenter
    public void onBindViewHolder(androidx.leanback.widget.Presenter.ViewHolder r1, java.lang.Object r2) {
            r0 = this;
            return
    }

    @Override // androidx.leanback.widget.Presenter
    public androidx.leanback.widget.Presenter.ViewHolder onCreateViewHolder(android.view.ViewGroup r4) {
            r3 = this;
            android.content.Context r0 = r4.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            int r1 = r3.mLayoutResourceId
            r2 = 0
            android.view.View r4 = r0.inflate(r1, r4, r2)
            androidx.leanback.widget.Presenter$ViewHolder r0 = new androidx.leanback.widget.Presenter$ViewHolder
            r0.<init>(r4)
            return r0
    }

    @Override // androidx.leanback.widget.Presenter
    public void onUnbindViewHolder(androidx.leanback.widget.Presenter.ViewHolder r1) {
            r0 = this;
            return
    }
}
