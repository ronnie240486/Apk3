package androidx.leanback.widget;

/* JADX INFO: loaded from: classes.dex */
public class ControlButtonPresenterSelector extends androidx.leanback.widget.PresenterSelector {
    private final androidx.leanback.widget.Presenter[] mPresenters;
    private final androidx.leanback.widget.Presenter mPrimaryPresenter;
    private final androidx.leanback.widget.Presenter mSecondaryPresenter;

    public static class ActionViewHolder extends androidx.leanback.widget.Presenter.ViewHolder {
        public android.view.View mFocusableView;
        public android.widget.ImageView mIcon;
        public android.widget.TextView mLabel;

        public ActionViewHolder(android.view.View r2) {
                r1 = this;
                r1.<init>(r2)
                int r0 = androidx.leanback.R.id.icon
                android.view.View r0 = r2.findViewById(r0)
                android.widget.ImageView r0 = (android.widget.ImageView) r0
                r1.mIcon = r0
                int r0 = androidx.leanback.R.id.label
                android.view.View r0 = r2.findViewById(r0)
                android.widget.TextView r0 = (android.widget.TextView) r0
                r1.mLabel = r0
                int r0 = androidx.leanback.R.id.button
                android.view.View r2 = r2.findViewById(r0)
                r1.mFocusableView = r2
                return
        }
    }

    public static class ControlButtonPresenter extends androidx.leanback.widget.Presenter {
        private int mLayoutResourceId;

        public ControlButtonPresenter(int r1) {
                r0 = this;
                r0.<init>()
                r0.mLayoutResourceId = r1
                return
        }

        @Override // androidx.leanback.widget.Presenter
        public void onBindViewHolder(androidx.leanback.widget.Presenter.ViewHolder r3, java.lang.Object r4) {
                r2 = this;
                androidx.leanback.widget.Action r4 = (androidx.leanback.widget.Action) r4
                androidx.leanback.widget.ControlButtonPresenterSelector$ActionViewHolder r3 = (androidx.leanback.widget.ControlButtonPresenterSelector.ActionViewHolder) r3
                android.widget.ImageView r0 = r3.mIcon
                android.graphics.drawable.Drawable r1 = r4.getIcon()
                r0.setImageDrawable(r1)
                android.widget.TextView r0 = r3.mLabel
                if (r0 == 0) goto L27
                android.graphics.drawable.Drawable r0 = r4.getIcon()
                if (r0 != 0) goto L21
                android.widget.TextView r0 = r3.mLabel
                java.lang.CharSequence r1 = r4.getLabel1()
                r0.setText(r1)
                goto L27
            L21:
                android.widget.TextView r0 = r3.mLabel
                r1 = 0
                r0.setText(r1)
            L27:
                java.lang.CharSequence r0 = r4.getLabel2()
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 == 0) goto L36
                java.lang.CharSequence r4 = r4.getLabel1()
                goto L3a
            L36:
                java.lang.CharSequence r4 = r4.getLabel2()
            L3a:
                android.view.View r0 = r3.mFocusableView
                java.lang.CharSequence r0 = r0.getContentDescription()
                boolean r0 = android.text.TextUtils.equals(r0, r4)
                if (r0 != 0) goto L53
                android.view.View r0 = r3.mFocusableView
                r0.setContentDescription(r4)
                android.view.View r3 = r3.mFocusableView
                r4 = 32768(0x8000, float:4.5918E-41)
                r3.sendAccessibilityEvent(r4)
            L53:
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
                androidx.leanback.widget.ControlButtonPresenterSelector$ActionViewHolder r0 = new androidx.leanback.widget.ControlButtonPresenterSelector$ActionViewHolder
                r0.<init>(r4)
                return r0
        }

        @Override // androidx.leanback.widget.Presenter
        public void onUnbindViewHolder(androidx.leanback.widget.Presenter.ViewHolder r3) {
                r2 = this;
                androidx.leanback.widget.ControlButtonPresenterSelector$ActionViewHolder r3 = (androidx.leanback.widget.ControlButtonPresenterSelector.ActionViewHolder) r3
                android.widget.ImageView r0 = r3.mIcon
                r1 = 0
                r0.setImageDrawable(r1)
                android.widget.TextView r0 = r3.mLabel
                if (r0 == 0) goto Lf
                r0.setText(r1)
            Lf:
                android.view.View r3 = r3.mFocusableView
                r3.setContentDescription(r1)
                return
        }

        @Override // androidx.leanback.widget.Presenter
        public void setOnClickListener(androidx.leanback.widget.Presenter.ViewHolder r1, android.view.View.OnClickListener r2) {
                r0 = this;
                androidx.leanback.widget.ControlButtonPresenterSelector$ActionViewHolder r1 = (androidx.leanback.widget.ControlButtonPresenterSelector.ActionViewHolder) r1
                android.view.View r1 = r1.mFocusableView
                r1.setOnClickListener(r2)
                return
        }
    }

    public ControlButtonPresenterSelector() {
            r3 = this;
            r3.<init>()
            androidx.leanback.widget.ControlButtonPresenterSelector$ControlButtonPresenter r0 = new androidx.leanback.widget.ControlButtonPresenterSelector$ControlButtonPresenter
            int r1 = androidx.leanback.R.layout.lb_control_button_primary
            r0.<init>(r1)
            r3.mPrimaryPresenter = r0
            androidx.leanback.widget.ControlButtonPresenterSelector$ControlButtonPresenter r1 = new androidx.leanback.widget.ControlButtonPresenterSelector$ControlButtonPresenter
            int r2 = androidx.leanback.R.layout.lb_control_button_secondary
            r1.<init>(r2)
            r3.mSecondaryPresenter = r1
            r1 = 1
            androidx.leanback.widget.Presenter[] r1 = new androidx.leanback.widget.Presenter[r1]
            r2 = 0
            r1[r2] = r0
            r3.mPresenters = r1
            return
    }

    @Override // androidx.leanback.widget.PresenterSelector
    public androidx.leanback.widget.Presenter getPresenter(java.lang.Object r1) {
            r0 = this;
            androidx.leanback.widget.Presenter r1 = r0.mPrimaryPresenter
            return r1
    }

    @Override // androidx.leanback.widget.PresenterSelector
    public androidx.leanback.widget.Presenter[] getPresenters() {
            r1 = this;
            androidx.leanback.widget.Presenter[] r0 = r1.mPresenters
            return r0
    }

    public androidx.leanback.widget.Presenter getPrimaryPresenter() {
            r1 = this;
            androidx.leanback.widget.Presenter r0 = r1.mPrimaryPresenter
            return r0
    }

    public androidx.leanback.widget.Presenter getSecondaryPresenter() {
            r1 = this;
            androidx.leanback.widget.Presenter r0 = r1.mSecondaryPresenter
            return r0
    }
}
