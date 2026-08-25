package androidx.leanback.widget;

/* JADX INFO: loaded from: classes.dex */
public class RowHeaderPresenter extends androidx.leanback.widget.Presenter {
    private final boolean mAnimateSelect;
    private final android.graphics.Paint mFontMeasurePaint;
    private final int mLayoutResourceId;
    private boolean mNullItemVisibilityGone;

    /* JADX INFO: loaded from: classes2.dex */
    public static class ViewHolder extends androidx.leanback.widget.Presenter.ViewHolder {
        public android.widget.TextView mDescriptionView;
        public float mSelectLevel;
        public androidx.leanback.widget.RowHeaderView mTitleView;
        public float mUnselectAlpha;

        public ViewHolder(android.view.View r2) {
                r1 = this;
                r1.<init>(r2)
                int r0 = androidx.leanback.R.id.row_header
                android.view.View r0 = r2.findViewById(r0)
                androidx.leanback.widget.RowHeaderView r0 = (androidx.leanback.widget.RowHeaderView) r0
                r1.mTitleView = r0
                int r0 = androidx.leanback.R.id.row_header_description
                android.view.View r2 = r2.findViewById(r0)
                android.widget.TextView r2 = (android.widget.TextView) r2
                r1.mDescriptionView = r2
                r1.initColors()
                return
        }

        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public ViewHolder(androidx.leanback.widget.RowHeaderView r1) {
                r0 = this;
                r0.<init>(r1)
                r0.mTitleView = r1
                r0.initColors()
                return
        }

        public final float getSelectLevel() {
                r1 = this;
                float r0 = r1.mSelectLevel
                return r0
        }

        public final void initColors() {
                r3 = this;
                androidx.leanback.widget.RowHeaderView r0 = r3.mTitleView
                if (r0 == 0) goto L7
                r0.getCurrentTextColor()
            L7:
                android.view.View r0 = r3.view
                android.content.res.Resources r0 = r0.getResources()
                int r1 = androidx.leanback.R.fraction.lb_browse_header_unselect_alpha
                r2 = 1
                float r0 = r0.getFraction(r1, r2, r2)
                r3.mUnselectAlpha = r0
                return
        }
    }

    public RowHeaderPresenter() {
            r1 = this;
            int r0 = androidx.leanback.R.layout.lb_row_header
            r1.<init>(r0)
            return
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public RowHeaderPresenter(int r2) {
            r1 = this;
            r0 = 1
            r1.<init>(r2, r0)
            return
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public RowHeaderPresenter(int r3, boolean r4) {
            r2 = this;
            r2.<init>()
            android.graphics.Paint r0 = new android.graphics.Paint
            r1 = 1
            r0.<init>(r1)
            r2.mFontMeasurePaint = r0
            r2.mLayoutResourceId = r3
            r2.mAnimateSelect = r4
            return
    }

    public int getSpaceUnderBaseline(androidx.leanback.widget.RowHeaderPresenter.ViewHolder r5) {
            r4 = this;
            android.view.View r0 = r5.view
            int r0 = r0.getPaddingBottom()
            android.view.View r5 = r5.view
            boolean r1 = r5 instanceof android.widget.TextView
            if (r1 == 0) goto L3a
            android.widget.TextView r5 = (android.widget.TextView) r5
            android.graphics.Paint r1 = r4.mFontMeasurePaint
            float r2 = r1.getTextSize()
            float r3 = r5.getTextSize()
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 == 0) goto L23
            float r2 = r5.getTextSize()
            r1.setTextSize(r2)
        L23:
            android.graphics.Typeface r2 = r1.getTypeface()
            android.graphics.Typeface r3 = r5.getTypeface()
            if (r2 == r3) goto L34
            android.graphics.Typeface r5 = r5.getTypeface()
            r1.setTypeface(r5)
        L34:
            float r5 = r1.descent()
            int r5 = (int) r5
            int r0 = r0 + r5
        L3a:
            return r0
    }

    public boolean isNullItemVisibilityGone() {
            r1 = this;
            boolean r0 = r1.mNullItemVisibilityGone
            return r0
    }

    @Override // androidx.leanback.widget.Presenter
    public void onBindViewHolder(androidx.leanback.widget.Presenter.ViewHolder r5, java.lang.Object r6) {
            r4 = this;
            r0 = 0
            if (r6 != 0) goto L5
            r6 = r0
            goto Lb
        L5:
            androidx.leanback.widget.Row r6 = (androidx.leanback.widget.Row) r6
            androidx.leanback.widget.HeaderItem r6 = r6.getHeaderItem()
        Lb:
            r1 = r5
            androidx.leanback.widget.RowHeaderPresenter$ViewHolder r1 = (androidx.leanback.widget.RowHeaderPresenter.ViewHolder) r1
            r2 = 8
            if (r6 != 0) goto L2f
            androidx.leanback.widget.RowHeaderView r6 = r1.mTitleView
            if (r6 == 0) goto L19
            r6.setText(r0)
        L19:
            android.widget.TextView r6 = r1.mDescriptionView
            if (r6 == 0) goto L20
            r6.setText(r0)
        L20:
            android.view.View r6 = r5.view
            r6.setContentDescription(r0)
            boolean r6 = r4.mNullItemVisibilityGone
            if (r6 == 0) goto L6b
            android.view.View r5 = r5.view
            r5.setVisibility(r2)
            goto L6b
        L2f:
            androidx.leanback.widget.RowHeaderView r0 = r1.mTitleView
            if (r0 == 0) goto L3a
            java.lang.String r3 = r6.getName()
            r0.setText(r3)
        L3a:
            android.widget.TextView r0 = r1.mDescriptionView
            r3 = 0
            if (r0 == 0) goto L5d
            java.lang.CharSequence r0 = r6.getDescription()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L4f
            android.widget.TextView r0 = r1.mDescriptionView
            r0.setVisibility(r2)
            goto L54
        L4f:
            android.widget.TextView r0 = r1.mDescriptionView
            r0.setVisibility(r3)
        L54:
            android.widget.TextView r0 = r1.mDescriptionView
            java.lang.CharSequence r1 = r6.getDescription()
            r0.setText(r1)
        L5d:
            android.view.View r0 = r5.view
            java.lang.CharSequence r6 = r6.getContentDescription()
            r0.setContentDescription(r6)
            android.view.View r5 = r5.view
            r5.setVisibility(r3)
        L6b:
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
            androidx.leanback.widget.RowHeaderPresenter$ViewHolder r0 = new androidx.leanback.widget.RowHeaderPresenter$ViewHolder
            r0.<init>(r4)
            boolean r4 = r3.mAnimateSelect
            if (r4 == 0) goto L1c
            r4 = 0
            r3.setSelectLevel(r0, r4)
        L1c:
            return r0
    }

    @Override // androidx.leanback.widget.Presenter
    public void onUnbindViewHolder(androidx.leanback.widget.Presenter.ViewHolder r3) {
            r2 = this;
            androidx.leanback.widget.RowHeaderPresenter$ViewHolder r3 = (androidx.leanback.widget.RowHeaderPresenter.ViewHolder) r3
            androidx.leanback.widget.RowHeaderView r0 = r3.mTitleView
            r1 = 0
            if (r0 == 0) goto La
            r0.setText(r1)
        La:
            android.widget.TextView r0 = r3.mDescriptionView
            if (r0 == 0) goto L11
            r0.setText(r1)
        L11:
            boolean r0 = r2.mAnimateSelect
            if (r0 == 0) goto L19
            r0 = 0
            r2.setSelectLevel(r3, r0)
        L19:
            return
    }

    public void setNullItemVisibilityGone(boolean r1) {
            r0 = this;
            r0.mNullItemVisibilityGone = r1
            return
    }

    public final void setSelectLevel(androidx.leanback.widget.RowHeaderPresenter.ViewHolder r3, float r4) {
            r2 = this;
            r3.mSelectLevel = r4
            boolean r0 = r2.mAnimateSelect
            if (r0 == 0) goto L13
            android.view.View r0 = r3.view
            float r3 = r3.mUnselectAlpha
            r1 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 - r3
            float r1 = r1 * r4
            float r1 = r1 + r3
            r0.setAlpha(r1)
        L13:
            return
    }
}
