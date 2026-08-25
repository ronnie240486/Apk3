package androidx.leanback.widget;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public class InvisibleRowPresenter extends androidx.leanback.widget.RowPresenter {
    public InvisibleRowPresenter() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.setHeaderPresenter(r0)
            return
    }

    @Override // androidx.leanback.widget.RowPresenter
    public final androidx.leanback.widget.RowPresenter.ViewHolder createRowViewHolder(android.view.ViewGroup r3) {
            r2 = this;
            android.widget.RelativeLayout r0 = new android.widget.RelativeLayout
            android.content.Context r3 = r3.getContext()
            r0.<init>(r3)
            android.widget.RelativeLayout$LayoutParams r3 = new android.widget.RelativeLayout$LayoutParams
            r1 = 0
            r3.<init>(r1, r1)
            r0.setLayoutParams(r3)
            androidx.leanback.widget.RowPresenter$ViewHolder r3 = new androidx.leanback.widget.RowPresenter$ViewHolder
            r3.<init>(r0)
            return r3
    }
}
