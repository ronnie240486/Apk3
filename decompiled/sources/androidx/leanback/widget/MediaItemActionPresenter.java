package androidx.leanback.widget;

/* JADX INFO: loaded from: classes.dex */
class MediaItemActionPresenter extends androidx.leanback.widget.Presenter {

    /* JADX INFO: loaded from: classes3.dex */
    public static class ViewHolder extends androidx.leanback.widget.Presenter.ViewHolder {
        public final android.widget.ImageView mIcon;

        public ViewHolder(android.view.View r2) {
                r1 = this;
                r1.<init>(r2)
                int r0 = androidx.leanback.R.id.actionIcon
                android.view.View r2 = r2.findViewById(r0)
                android.widget.ImageView r2 = (android.widget.ImageView) r2
                r1.mIcon = r2
                return
        }

        public android.widget.ImageView getIcon() {
                r1 = this;
                android.widget.ImageView r0 = r1.mIcon
                return r0
        }
    }

    public MediaItemActionPresenter() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // androidx.leanback.widget.Presenter
    public void onBindViewHolder(androidx.leanback.widget.Presenter.ViewHolder r1, java.lang.Object r2) {
            r0 = this;
            androidx.leanback.widget.MediaItemActionPresenter$ViewHolder r1 = (androidx.leanback.widget.MediaItemActionPresenter.ViewHolder) r1
            androidx.leanback.widget.MultiActionsProvider$MultiAction r2 = (androidx.leanback.widget.MultiActionsProvider.MultiAction) r2
            android.widget.ImageView r1 = r1.getIcon()
            android.graphics.drawable.Drawable r2 = r2.getCurrentDrawable()
            r1.setImageDrawable(r2)
            return
    }

    @Override // androidx.leanback.widget.Presenter
    public androidx.leanback.widget.Presenter.ViewHolder onCreateViewHolder(android.view.ViewGroup r4) {
            r3 = this;
            android.content.Context r0 = r4.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            int r1 = androidx.leanback.R.layout.lb_row_media_item_action
            r2 = 0
            android.view.View r4 = r0.inflate(r1, r4, r2)
            androidx.leanback.widget.MediaItemActionPresenter$ViewHolder r0 = new androidx.leanback.widget.MediaItemActionPresenter$ViewHolder
            r0.<init>(r4)
            return r0
    }

    @Override // androidx.leanback.widget.Presenter
    public void onUnbindViewHolder(androidx.leanback.widget.Presenter.ViewHolder r1) {
            r0 = this;
            return
    }
}
