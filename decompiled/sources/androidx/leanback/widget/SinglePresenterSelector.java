package androidx.leanback.widget;

/* JADX INFO: loaded from: classes2.dex */
public final class SinglePresenterSelector extends androidx.leanback.widget.PresenterSelector {
    private final androidx.leanback.widget.Presenter mPresenter;

    public SinglePresenterSelector(androidx.leanback.widget.Presenter r1) {
            r0 = this;
            r0.<init>()
            r0.mPresenter = r1
            return
    }

    @Override // androidx.leanback.widget.PresenterSelector
    public androidx.leanback.widget.Presenter getPresenter(java.lang.Object r1) {
            r0 = this;
            androidx.leanback.widget.Presenter r1 = r0.mPresenter
            return r1
    }

    @Override // androidx.leanback.widget.PresenterSelector
    public androidx.leanback.widget.Presenter[] getPresenters() {
            r3 = this;
            r0 = 1
            androidx.leanback.widget.Presenter[] r0 = new androidx.leanback.widget.Presenter[r0]
            androidx.leanback.widget.Presenter r1 = r3.mPresenter
            r2 = 0
            r0[r2] = r1
            return r0
    }
}
