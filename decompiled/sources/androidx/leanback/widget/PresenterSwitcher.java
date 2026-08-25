package androidx.leanback.widget;

/* JADX INFO: loaded from: classes.dex */
public abstract class PresenterSwitcher {
    private androidx.leanback.widget.Presenter mCurrentPresenter;
    private androidx.leanback.widget.Presenter.ViewHolder mCurrentViewHolder;
    private android.view.ViewGroup mParent;
    private androidx.leanback.widget.PresenterSelector mPresenterSelector;

    public PresenterSwitcher() {
            r0 = this;
            r0.<init>()
            return
    }

    private void showView(boolean r2) {
            r1 = this;
            androidx.leanback.widget.Presenter$ViewHolder r0 = r1.mCurrentViewHolder
            if (r0 == 0) goto Lf
            android.view.View r0 = r0.view
            if (r2 == 0) goto La
            r2 = 0
            goto Lc
        La:
            r2 = 8
        Lc:
            r0.setVisibility(r2)
        Lf:
            return
    }

    private void switchView(java.lang.Object r3) {
            r2 = this;
            androidx.leanback.widget.PresenterSelector r0 = r2.mPresenterSelector
            androidx.leanback.widget.Presenter r0 = r0.getPresenter(r3)
            androidx.leanback.widget.Presenter r1 = r2.mCurrentPresenter
            if (r0 == r1) goto L24
            r1 = 0
            r2.showView(r1)
            r2.clear()
            r2.mCurrentPresenter = r0
            if (r0 != 0) goto L16
            return
        L16:
            android.view.ViewGroup r1 = r2.mParent
            androidx.leanback.widget.Presenter$ViewHolder r0 = r0.onCreateViewHolder(r1)
            r2.mCurrentViewHolder = r0
            android.view.View r0 = r0.view
            r2.insertView(r0)
            goto L2c
        L24:
            if (r1 != 0) goto L27
            return
        L27:
            androidx.leanback.widget.Presenter$ViewHolder r0 = r2.mCurrentViewHolder
            r1.onUnbindViewHolder(r0)
        L2c:
            androidx.leanback.widget.Presenter r0 = r2.mCurrentPresenter
            androidx.leanback.widget.Presenter$ViewHolder r1 = r2.mCurrentViewHolder
            r0.onBindViewHolder(r1, r3)
            androidx.leanback.widget.Presenter$ViewHolder r3 = r2.mCurrentViewHolder
            android.view.View r3 = r3.view
            r2.onViewSelected(r3)
            return
    }

    public void clear() {
            r2 = this;
            androidx.leanback.widget.Presenter r0 = r2.mCurrentPresenter
            if (r0 == 0) goto L17
            androidx.leanback.widget.Presenter$ViewHolder r1 = r2.mCurrentViewHolder
            r0.onUnbindViewHolder(r1)
            android.view.ViewGroup r0 = r2.mParent
            androidx.leanback.widget.Presenter$ViewHolder r1 = r2.mCurrentViewHolder
            android.view.View r1 = r1.view
            r0.removeView(r1)
            r0 = 0
            r2.mCurrentViewHolder = r0
            r2.mCurrentPresenter = r0
        L17:
            return
    }

    public final android.view.ViewGroup getParentViewGroup() {
            r1 = this;
            android.view.ViewGroup r0 = r1.mParent
            return r0
    }

    public void init(android.view.ViewGroup r1, androidx.leanback.widget.PresenterSelector r2) {
            r0 = this;
            r0.clear()
            r0.mParent = r1
            r0.mPresenterSelector = r2
            return
    }

    public abstract void insertView(android.view.View r1);

    public void onViewSelected(android.view.View r1) {
            r0 = this;
            return
    }

    public void select(java.lang.Object r1) {
            r0 = this;
            r0.switchView(r1)
            r1 = 1
            r0.showView(r1)
            return
    }

    public void unselect() {
            r1 = this;
            r0 = 0
            r1.showView(r0)
            return
    }
}
