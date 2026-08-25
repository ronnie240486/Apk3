package androidx.leanback.widget;

/* JADX INFO: loaded from: classes.dex */
class ActionPresenterSelector extends androidx.leanback.widget.PresenterSelector {
    private final androidx.leanback.widget.Presenter mOneLineActionPresenter;
    private final androidx.leanback.widget.Presenter[] mPresenters;
    private final androidx.leanback.widget.Presenter mTwoLineActionPresenter;

    public static abstract class ActionPresenter extends androidx.leanback.widget.Presenter {
        public ActionPresenter() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.leanback.widget.Presenter
        public void onBindViewHolder(androidx.leanback.widget.Presenter.ViewHolder r5, java.lang.Object r6) {
                r4 = this;
                androidx.leanback.widget.Action r6 = (androidx.leanback.widget.Action) r6
                androidx.leanback.widget.ActionPresenterSelector$ActionViewHolder r5 = (androidx.leanback.widget.ActionPresenterSelector.ActionViewHolder) r5
                java.util.Objects.requireNonNull(r5)
                android.graphics.drawable.Drawable r6 = r6.getIcon()
                r0 = 0
                if (r6 == 0) goto L2c
                android.view.View r1 = r5.view
                android.content.res.Resources r1 = r1.getResources()
                int r2 = androidx.leanback.R.dimen.lb_action_with_icon_padding_start
                int r1 = r1.getDimensionPixelSize(r2)
                android.view.View r2 = r5.view
                android.content.res.Resources r2 = r2.getResources()
                int r3 = androidx.leanback.R.dimen.lb_action_with_icon_padding_end
                int r2 = r2.getDimensionPixelSize(r3)
                android.view.View r3 = r5.view
                r3.setPaddingRelative(r1, r0, r2, r0)
                goto L3d
            L2c:
                android.view.View r1 = r5.view
                android.content.res.Resources r1 = r1.getResources()
                int r2 = androidx.leanback.R.dimen.lb_action_padding_horizontal
                int r1 = r1.getDimensionPixelSize(r2)
                android.view.View r2 = r5.view
                r2.setPaddingRelative(r1, r0, r1, r0)
            L3d:
                int r0 = r5.mLayoutDirection
                r1 = 1
                r2 = 0
                if (r0 != r1) goto L49
                android.widget.Button r5 = r5.mButton
                r5.setCompoundDrawablesWithIntrinsicBounds(r2, r2, r6, r2)
                goto L4e
            L49:
                android.widget.Button r5 = r5.mButton
                r5.setCompoundDrawablesWithIntrinsicBounds(r6, r2, r2, r2)
            L4e:
                return
        }

        @Override // androidx.leanback.widget.Presenter
        public void onUnbindViewHolder(androidx.leanback.widget.Presenter.ViewHolder r3) {
                r2 = this;
                androidx.leanback.widget.ActionPresenterSelector$ActionViewHolder r3 = (androidx.leanback.widget.ActionPresenterSelector.ActionViewHolder) r3
                android.widget.Button r0 = r3.mButton
                r1 = 0
                r0.setCompoundDrawablesWithIntrinsicBounds(r1, r1, r1, r1)
                android.view.View r3 = r3.view
                r0 = 0
                r3.setPadding(r0, r0, r0, r0)
                return
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static class ActionViewHolder extends androidx.leanback.widget.Presenter.ViewHolder {
        public android.widget.Button mButton;
        public int mLayoutDirection;

        public ActionViewHolder(android.view.View r2, int r3) {
                r1 = this;
                r1.<init>(r2)
                int r0 = androidx.leanback.R.id.lb_action_button
                android.view.View r2 = r2.findViewById(r0)
                android.widget.Button r2 = (android.widget.Button) r2
                r1.mButton = r2
                r1.mLayoutDirection = r3
                return
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static class OneLineActionPresenter extends androidx.leanback.widget.ActionPresenterSelector.ActionPresenter {
        public OneLineActionPresenter() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.leanback.widget.ActionPresenterSelector.ActionPresenter, androidx.leanback.widget.Presenter
        public void onBindViewHolder(androidx.leanback.widget.Presenter.ViewHolder r1, java.lang.Object r2) {
                r0 = this;
                super.onBindViewHolder(r1, r2)
                androidx.leanback.widget.ActionPresenterSelector$ActionViewHolder r1 = (androidx.leanback.widget.ActionPresenterSelector.ActionViewHolder) r1
                androidx.leanback.widget.Action r2 = (androidx.leanback.widget.Action) r2
                android.widget.Button r1 = r1.mButton
                java.lang.CharSequence r2 = r2.getLabel1()
                r1.setText(r2)
                return
        }

        @Override // androidx.leanback.widget.Presenter
        public androidx.leanback.widget.Presenter.ViewHolder onCreateViewHolder(android.view.ViewGroup r4) {
                r3 = this;
                android.content.Context r0 = r4.getContext()
                android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
                int r1 = androidx.leanback.R.layout.lb_action_1_line
                r2 = 0
                android.view.View r0 = r0.inflate(r1, r4, r2)
                androidx.leanback.widget.ActionPresenterSelector$ActionViewHolder r1 = new androidx.leanback.widget.ActionPresenterSelector$ActionViewHolder
                int r4 = r4.getLayoutDirection()
                r1.<init>(r0, r4)
                return r1
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static class TwoLineActionPresenter extends androidx.leanback.widget.ActionPresenterSelector.ActionPresenter {
        public TwoLineActionPresenter() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.leanback.widget.ActionPresenterSelector.ActionPresenter, androidx.leanback.widget.Presenter
        public void onBindViewHolder(androidx.leanback.widget.Presenter.ViewHolder r3, java.lang.Object r4) {
                r2 = this;
                super.onBindViewHolder(r3, r4)
                androidx.leanback.widget.Action r4 = (androidx.leanback.widget.Action) r4
                androidx.leanback.widget.ActionPresenterSelector$ActionViewHolder r3 = (androidx.leanback.widget.ActionPresenterSelector.ActionViewHolder) r3
                java.lang.CharSequence r0 = r4.getLabel1()
                java.lang.CharSequence r4 = r4.getLabel2()
                boolean r1 = android.text.TextUtils.isEmpty(r0)
                if (r1 == 0) goto L1b
                android.widget.Button r3 = r3.mButton
                r3.setText(r4)
                goto L40
            L1b:
                boolean r1 = android.text.TextUtils.isEmpty(r4)
                if (r1 == 0) goto L27
                android.widget.Button r3 = r3.mButton
                r3.setText(r0)
                goto L40
            L27:
                android.widget.Button r3 = r3.mButton
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r0)
                java.lang.String r0 = "\n"
                r1.append(r0)
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                r3.setText(r4)
            L40:
                return
        }

        @Override // androidx.leanback.widget.Presenter
        public androidx.leanback.widget.Presenter.ViewHolder onCreateViewHolder(android.view.ViewGroup r4) {
                r3 = this;
                android.content.Context r0 = r4.getContext()
                android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
                int r1 = androidx.leanback.R.layout.lb_action_2_lines
                r2 = 0
                android.view.View r0 = r0.inflate(r1, r4, r2)
                androidx.leanback.widget.ActionPresenterSelector$ActionViewHolder r1 = new androidx.leanback.widget.ActionPresenterSelector$ActionViewHolder
                int r4 = r4.getLayoutDirection()
                r1.<init>(r0, r4)
                return r1
        }
    }

    public ActionPresenterSelector() {
            r4 = this;
            r4.<init>()
            androidx.leanback.widget.ActionPresenterSelector$OneLineActionPresenter r0 = new androidx.leanback.widget.ActionPresenterSelector$OneLineActionPresenter
            r0.<init>()
            r4.mOneLineActionPresenter = r0
            androidx.leanback.widget.ActionPresenterSelector$TwoLineActionPresenter r1 = new androidx.leanback.widget.ActionPresenterSelector$TwoLineActionPresenter
            r1.<init>()
            r4.mTwoLineActionPresenter = r1
            r2 = 2
            androidx.leanback.widget.Presenter[] r2 = new androidx.leanback.widget.Presenter[r2]
            r3 = 0
            r2[r3] = r0
            r0 = 1
            r2[r0] = r1
            r4.mPresenters = r2
            return
    }

    @Override // androidx.leanback.widget.PresenterSelector
    public androidx.leanback.widget.Presenter getPresenter(java.lang.Object r1) {
            r0 = this;
            androidx.leanback.widget.Action r1 = (androidx.leanback.widget.Action) r1
            java.lang.CharSequence r1 = r1.getLabel2()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto Lf
            androidx.leanback.widget.Presenter r1 = r0.mOneLineActionPresenter
            return r1
        Lf:
            androidx.leanback.widget.Presenter r1 = r0.mTwoLineActionPresenter
            return r1
    }

    @Override // androidx.leanback.widget.PresenterSelector
    public androidx.leanback.widget.Presenter[] getPresenters() {
            r1 = this;
            androidx.leanback.widget.Presenter[] r0 = r1.mPresenters
            return r0
    }
}
