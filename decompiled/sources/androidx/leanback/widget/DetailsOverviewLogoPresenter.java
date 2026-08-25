package androidx.leanback.widget;

/* JADX INFO: loaded from: classes2.dex */
public class DetailsOverviewLogoPresenter extends androidx.leanback.widget.Presenter {

    public static class ViewHolder extends androidx.leanback.widget.Presenter.ViewHolder {
        public androidx.leanback.widget.FullWidthDetailsOverviewRowPresenter mParentPresenter;
        public androidx.leanback.widget.FullWidthDetailsOverviewRowPresenter.ViewHolder mParentViewHolder;
        private boolean mSizeFromDrawableIntrinsic;

        public ViewHolder(android.view.View r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public androidx.leanback.widget.FullWidthDetailsOverviewRowPresenter getParentPresenter() {
                r1 = this;
                androidx.leanback.widget.FullWidthDetailsOverviewRowPresenter r0 = r1.mParentPresenter
                return r0
        }

        public androidx.leanback.widget.FullWidthDetailsOverviewRowPresenter.ViewHolder getParentViewHolder() {
                r1 = this;
                androidx.leanback.widget.FullWidthDetailsOverviewRowPresenter$ViewHolder r0 = r1.mParentViewHolder
                return r0
        }

        public boolean isSizeFromDrawableIntrinsic() {
                r1 = this;
                boolean r0 = r1.mSizeFromDrawableIntrinsic
                return r0
        }

        public void setSizeFromDrawableIntrinsic(boolean r1) {
                r0 = this;
                r0.mSizeFromDrawableIntrinsic = r1
                return
        }
    }

    public DetailsOverviewLogoPresenter() {
            r0 = this;
            r0.<init>()
            return
    }

    public boolean isBoundToImage(androidx.leanback.widget.DetailsOverviewLogoPresenter.ViewHolder r1, androidx.leanback.widget.DetailsOverviewRow r2) {
            r0 = this;
            if (r2 == 0) goto La
            android.graphics.drawable.Drawable r1 = r2.getImageDrawable()
            if (r1 == 0) goto La
            r1 = 1
            goto Lb
        La:
            r1 = 0
        Lb:
            return r1
    }

    @Override // androidx.leanback.widget.Presenter
    public void onBindViewHolder(androidx.leanback.widget.Presenter.ViewHolder r6, java.lang.Object r7) {
            r5 = this;
            androidx.leanback.widget.DetailsOverviewRow r7 = (androidx.leanback.widget.DetailsOverviewRow) r7
            android.view.View r0 = r6.view
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            android.graphics.drawable.Drawable r1 = r7.getImageDrawable()
            r0.setImageDrawable(r1)
            androidx.leanback.widget.DetailsOverviewLogoPresenter$ViewHolder r6 = (androidx.leanback.widget.DetailsOverviewLogoPresenter.ViewHolder) r6
            boolean r1 = r5.isBoundToImage(r6, r7)
            if (r1 == 0) goto L90
            boolean r1 = r6.isSizeFromDrawableIntrinsic()
            if (r1 == 0) goto L89
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            android.graphics.drawable.Drawable r2 = r7.getImageDrawable()
            int r2 = r2.getIntrinsicWidth()
            r1.width = r2
            android.graphics.drawable.Drawable r7 = r7.getImageDrawable()
            int r7 = r7.getIntrinsicHeight()
            r1.height = r7
            int r7 = r0.getMaxWidth()
            if (r7 > 0) goto L3f
            int r7 = r0.getMaxHeight()
            if (r7 <= 0) goto L86
        L3f:
            int r7 = r0.getMaxWidth()
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r7 <= 0) goto L59
            int r7 = r1.width
            int r3 = r0.getMaxWidth()
            if (r7 <= r3) goto L59
            int r7 = r0.getMaxWidth()
            float r7 = (float) r7
            int r3 = r1.width
            float r3 = (float) r3
            float r7 = r7 / r3
            goto L5b
        L59:
            r7 = 1065353216(0x3f800000, float:1.0)
        L5b:
            int r3 = r0.getMaxHeight()
            if (r3 <= 0) goto L72
            int r3 = r1.height
            int r4 = r0.getMaxHeight()
            if (r3 <= r4) goto L72
            int r2 = r0.getMaxHeight()
            float r2 = (float) r2
            int r3 = r1.height
            float r3 = (float) r3
            float r2 = r2 / r3
        L72:
            float r7 = java.lang.Math.min(r7, r2)
            int r2 = r1.width
            float r2 = (float) r2
            float r2 = r2 * r7
            int r2 = (int) r2
            r1.width = r2
            int r2 = r1.height
            float r2 = (float) r2
            float r2 = r2 * r7
            int r7 = (int) r2
            r1.height = r7
        L86:
            r0.setLayoutParams(r1)
        L89:
            androidx.leanback.widget.FullWidthDetailsOverviewRowPresenter r7 = r6.mParentPresenter
            androidx.leanback.widget.FullWidthDetailsOverviewRowPresenter$ViewHolder r6 = r6.mParentViewHolder
            r7.notifyOnBindLogo(r6)
        L90:
            return
    }

    public android.view.View onCreateView(android.view.ViewGroup r4) {
            r3 = this;
            android.content.Context r0 = r4.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            int r1 = androidx.leanback.R.layout.lb_fullwidth_details_overview_logo
            r2 = 0
            android.view.View r4 = r0.inflate(r1, r4, r2)
            return r4
    }

    @Override // androidx.leanback.widget.Presenter
    public androidx.leanback.widget.Presenter.ViewHolder onCreateViewHolder(android.view.ViewGroup r4) {
            r3 = this;
            android.view.View r4 = r3.onCreateView(r4)
            androidx.leanback.widget.DetailsOverviewLogoPresenter$ViewHolder r0 = new androidx.leanback.widget.DetailsOverviewLogoPresenter$ViewHolder
            r0.<init>(r4)
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            int r1 = r4.width
            r2 = -2
            if (r1 != r2) goto L18
            int r4 = r4.height
            if (r4 != r2) goto L18
            r4 = 1
            goto L19
        L18:
            r4 = 0
        L19:
            r0.setSizeFromDrawableIntrinsic(r4)
            return r0
    }

    @Override // androidx.leanback.widget.Presenter
    public void onUnbindViewHolder(androidx.leanback.widget.Presenter.ViewHolder r1) {
            r0 = this;
            return
    }

    public void setContext(androidx.leanback.widget.DetailsOverviewLogoPresenter.ViewHolder r1, androidx.leanback.widget.FullWidthDetailsOverviewRowPresenter.ViewHolder r2, androidx.leanback.widget.FullWidthDetailsOverviewRowPresenter r3) {
            r0 = this;
            r1.mParentViewHolder = r2
            r1.mParentPresenter = r3
            return
    }
}
