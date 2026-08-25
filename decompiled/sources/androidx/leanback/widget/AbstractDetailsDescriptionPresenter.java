package androidx.leanback.widget;

/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractDetailsDescriptionPresenter extends androidx.leanback.widget.Presenter {

    /* JADX INFO: loaded from: classes2.dex */
    public static class ViewHolder extends androidx.leanback.widget.Presenter.ViewHolder {
        public final android.widget.TextView mBody;
        public final android.graphics.Paint.FontMetricsInt mBodyFontMetricsInt;
        public final int mBodyLineSpacing;
        public final int mBodyMaxLines;
        public final int mBodyMinLines;
        private android.view.ViewTreeObserver.OnPreDrawListener mPreDrawListener;
        public final android.widget.TextView mSubtitle;
        public final android.graphics.Paint.FontMetricsInt mSubtitleFontMetricsInt;
        public final android.widget.TextView mTitle;
        public final android.graphics.Paint.FontMetricsInt mTitleFontMetricsInt;
        public final int mTitleLineSpacing;
        public final int mTitleMargin;
        public final int mTitleMaxLines;
        public final int mUnderSubtitleBaselineMargin;
        public final int mUnderTitleBaselineMargin;



        public ViewHolder(android.view.View r7) {
                r6 = this;
                r6.<init>(r7)
                int r0 = androidx.leanback.R.id.lb_details_description_title
                android.view.View r0 = r7.findViewById(r0)
                android.widget.TextView r0 = (android.widget.TextView) r0
                r6.mTitle = r0
                int r1 = androidx.leanback.R.id.lb_details_description_subtitle
                android.view.View r1 = r7.findViewById(r1)
                android.widget.TextView r1 = (android.widget.TextView) r1
                r6.mSubtitle = r1
                int r2 = androidx.leanback.R.id.lb_details_description_body
                android.view.View r2 = r7.findViewById(r2)
                android.widget.TextView r2 = (android.widget.TextView) r2
                r6.mBody = r2
                android.graphics.Paint$FontMetricsInt r3 = r6.getFontMetricsInt(r0)
                android.content.res.Resources r4 = r7.getResources()
                int r5 = androidx.leanback.R.dimen.lb_details_description_title_baseline
                int r4 = r4.getDimensionPixelSize(r5)
                int r3 = r3.ascent
                int r4 = r4 + r3
                r6.mTitleMargin = r4
                android.content.res.Resources r3 = r7.getResources()
                int r4 = androidx.leanback.R.dimen.lb_details_description_under_title_baseline_margin
                int r3 = r3.getDimensionPixelSize(r4)
                r6.mUnderTitleBaselineMargin = r3
                android.content.res.Resources r3 = r7.getResources()
                int r4 = androidx.leanback.R.dimen.lb_details_description_under_subtitle_baseline_margin
                int r3 = r3.getDimensionPixelSize(r4)
                r6.mUnderSubtitleBaselineMargin = r3
                android.content.res.Resources r3 = r7.getResources()
                int r4 = androidx.leanback.R.dimen.lb_details_description_title_line_spacing
                int r3 = r3.getDimensionPixelSize(r4)
                r6.mTitleLineSpacing = r3
                android.content.res.Resources r3 = r7.getResources()
                int r4 = androidx.leanback.R.dimen.lb_details_description_body_line_spacing
                int r3 = r3.getDimensionPixelSize(r4)
                r6.mBodyLineSpacing = r3
                android.content.res.Resources r3 = r7.getResources()
                int r4 = androidx.leanback.R.integer.lb_details_description_body_max_lines
                int r3 = r3.getInteger(r4)
                r6.mBodyMaxLines = r3
                android.content.res.Resources r7 = r7.getResources()
                int r3 = androidx.leanback.R.integer.lb_details_description_body_min_lines
                int r7 = r7.getInteger(r3)
                r6.mBodyMinLines = r7
                int r7 = r0.getMaxLines()
                r6.mTitleMaxLines = r7
                android.graphics.Paint$FontMetricsInt r7 = r6.getFontMetricsInt(r0)
                r6.mTitleFontMetricsInt = r7
                android.graphics.Paint$FontMetricsInt r7 = r6.getFontMetricsInt(r1)
                r6.mSubtitleFontMetricsInt = r7
                android.graphics.Paint$FontMetricsInt r7 = r6.getFontMetricsInt(r2)
                r6.mBodyFontMetricsInt = r7
                androidx.leanback.widget.AbstractDetailsDescriptionPresenter$ViewHolder$1 r7 = new androidx.leanback.widget.AbstractDetailsDescriptionPresenter$ViewHolder$1
                r7.<init>(r6)
                r0.addOnLayoutChangeListener(r7)
                return
        }

        private android.graphics.Paint.FontMetricsInt getFontMetricsInt(android.widget.TextView r3) {
                r2 = this;
                android.graphics.Paint r0 = new android.graphics.Paint
                r1 = 1
                r0.<init>(r1)
                float r1 = r3.getTextSize()
                r0.setTextSize(r1)
                android.graphics.Typeface r3 = r3.getTypeface()
                r0.setTypeface(r3)
                android.graphics.Paint$FontMetricsInt r3 = r0.getFontMetricsInt()
                return r3
        }

        public final void addPreDrawListener() {
                r2 = this;
                android.view.ViewTreeObserver$OnPreDrawListener r0 = r2.mPreDrawListener
                if (r0 == 0) goto L5
                return
            L5:
                androidx.leanback.widget.AbstractDetailsDescriptionPresenter$ViewHolder$2 r0 = new androidx.leanback.widget.AbstractDetailsDescriptionPresenter$ViewHolder$2
                r0.<init>(r2)
                r2.mPreDrawListener = r0
                android.view.View r0 = r2.view
                android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
                android.view.ViewTreeObserver$OnPreDrawListener r1 = r2.mPreDrawListener
                r0.addOnPreDrawListener(r1)
                return
        }

        public android.widget.TextView getBody() {
                r1 = this;
                android.widget.TextView r0 = r1.mBody
                return r0
        }

        public android.widget.TextView getSubtitle() {
                r1 = this;
                android.widget.TextView r0 = r1.mSubtitle
                return r0
        }

        public android.widget.TextView getTitle() {
                r1 = this;
                android.widget.TextView r0 = r1.mTitle
                return r0
        }

        public final void removePreDrawListener() {
                r2 = this;
                android.view.ViewTreeObserver$OnPreDrawListener r0 = r2.mPreDrawListener
                if (r0 == 0) goto L12
                android.view.View r0 = r2.view
                android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
                android.view.ViewTreeObserver$OnPreDrawListener r1 = r2.mPreDrawListener
                r0.removeOnPreDrawListener(r1)
                r0 = 0
                r2.mPreDrawListener = r0
            L12:
                return
        }
    }

    public AbstractDetailsDescriptionPresenter() {
            r0 = this;
            r0.<init>()
            return
    }

    private void setTopMargin(android.widget.TextView r2, int r3) {
            r1 = this;
            android.view.ViewGroup$LayoutParams r0 = r2.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            r0.topMargin = r3
            r2.setLayoutParams(r0)
            return
    }

    public abstract void onBindDescription(androidx.leanback.widget.AbstractDetailsDescriptionPresenter.ViewHolder r1, java.lang.Object r2);

    @Override // androidx.leanback.widget.Presenter
    public final void onBindViewHolder(androidx.leanback.widget.Presenter.ViewHolder r7, java.lang.Object r8) {
            r6 = this;
            androidx.leanback.widget.AbstractDetailsDescriptionPresenter$ViewHolder r7 = (androidx.leanback.widget.AbstractDetailsDescriptionPresenter.ViewHolder) r7
            r6.onBindDescription(r7, r8)
            android.widget.TextView r8 = r7.mTitle
            java.lang.CharSequence r8 = r8.getText()
            boolean r8 = android.text.TextUtils.isEmpty(r8)
            r0 = 1
            r1 = 8
            r2 = 0
            if (r8 == 0) goto L1c
            android.widget.TextView r8 = r7.mTitle
            r8.setVisibility(r1)
            r8 = 0
            goto L43
        L1c:
            android.widget.TextView r8 = r7.mTitle
            r8.setVisibility(r2)
            android.widget.TextView r8 = r7.mTitle
            int r3 = r7.mTitleLineSpacing
            int r4 = r8.getLineHeight()
            int r3 = r3 - r4
            float r3 = (float) r3
            android.widget.TextView r4 = r7.mTitle
            float r4 = r4.getLineSpacingExtra()
            float r4 = r4 + r3
            android.widget.TextView r3 = r7.mTitle
            float r3 = r3.getLineSpacingMultiplier()
            r8.setLineSpacing(r4, r3)
            android.widget.TextView r8 = r7.mTitle
            int r3 = r7.mTitleMaxLines
            r8.setMaxLines(r3)
            r8 = 1
        L43:
            android.widget.TextView r3 = r7.mTitle
            int r4 = r7.mTitleMargin
            r6.setTopMargin(r3, r4)
            android.widget.TextView r3 = r7.mSubtitle
            java.lang.CharSequence r3 = r3.getText()
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L5d
            android.widget.TextView r0 = r7.mSubtitle
            r0.setVisibility(r1)
            r0 = 0
            goto L7b
        L5d:
            android.widget.TextView r3 = r7.mSubtitle
            r3.setVisibility(r2)
            if (r8 == 0) goto L76
            android.widget.TextView r3 = r7.mSubtitle
            int r4 = r7.mUnderTitleBaselineMargin
            android.graphics.Paint$FontMetricsInt r5 = r7.mSubtitleFontMetricsInt
            int r5 = r5.ascent
            int r4 = r4 + r5
            android.graphics.Paint$FontMetricsInt r5 = r7.mTitleFontMetricsInt
            int r5 = r5.descent
            int r4 = r4 - r5
            r6.setTopMargin(r3, r4)
            goto L7b
        L76:
            android.widget.TextView r3 = r7.mSubtitle
            r6.setTopMargin(r3, r2)
        L7b:
            android.widget.TextView r3 = r7.mBody
            java.lang.CharSequence r3 = r3.getText()
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L8d
            android.widget.TextView r7 = r7.mBody
            r7.setVisibility(r1)
            goto Ld9
        L8d:
            android.widget.TextView r1 = r7.mBody
            r1.setVisibility(r2)
            android.widget.TextView r1 = r7.mBody
            int r3 = r7.mBodyLineSpacing
            int r4 = r1.getLineHeight()
            int r3 = r3 - r4
            float r3 = (float) r3
            android.widget.TextView r4 = r7.mBody
            float r4 = r4.getLineSpacingExtra()
            float r4 = r4 + r3
            android.widget.TextView r3 = r7.mBody
            float r3 = r3.getLineSpacingMultiplier()
            r1.setLineSpacing(r4, r3)
            if (r0 == 0) goto Lc0
            android.widget.TextView r8 = r7.mBody
            int r0 = r7.mUnderSubtitleBaselineMargin
            android.graphics.Paint$FontMetricsInt r1 = r7.mBodyFontMetricsInt
            int r1 = r1.ascent
            int r0 = r0 + r1
            android.graphics.Paint$FontMetricsInt r7 = r7.mSubtitleFontMetricsInt
            int r7 = r7.descent
            int r0 = r0 - r7
            r6.setTopMargin(r8, r0)
            goto Ld9
        Lc0:
            if (r8 == 0) goto Ld4
            android.widget.TextView r8 = r7.mBody
            int r0 = r7.mUnderTitleBaselineMargin
            android.graphics.Paint$FontMetricsInt r1 = r7.mBodyFontMetricsInt
            int r1 = r1.ascent
            int r0 = r0 + r1
            android.graphics.Paint$FontMetricsInt r7 = r7.mTitleFontMetricsInt
            int r7 = r7.descent
            int r0 = r0 - r7
            r6.setTopMargin(r8, r0)
            goto Ld9
        Ld4:
            android.widget.TextView r7 = r7.mBody
            r6.setTopMargin(r7, r2)
        Ld9:
            return
    }

    @Override // androidx.leanback.widget.Presenter
    public final androidx.leanback.widget.AbstractDetailsDescriptionPresenter.ViewHolder onCreateViewHolder(android.view.ViewGroup r4) {
            r3 = this;
            android.content.Context r0 = r4.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            int r1 = androidx.leanback.R.layout.lb_details_description
            r2 = 0
            android.view.View r4 = r0.inflate(r1, r4, r2)
            androidx.leanback.widget.AbstractDetailsDescriptionPresenter$ViewHolder r0 = new androidx.leanback.widget.AbstractDetailsDescriptionPresenter$ViewHolder
            r0.<init>(r4)
            return r0
    }

    @Override // androidx.leanback.widget.Presenter
    public /* bridge */ /* synthetic */ androidx.leanback.widget.Presenter.ViewHolder onCreateViewHolder(android.view.ViewGroup r1) {
            r0 = this;
            androidx.leanback.widget.AbstractDetailsDescriptionPresenter$ViewHolder r1 = r0.onCreateViewHolder(r1)
            return r1
    }

    @Override // androidx.leanback.widget.Presenter
    public void onUnbindViewHolder(androidx.leanback.widget.Presenter.ViewHolder r1) {
            r0 = this;
            return
    }

    @Override // androidx.leanback.widget.Presenter
    public void onViewAttachedToWindow(androidx.leanback.widget.Presenter.ViewHolder r2) {
            r1 = this;
            r0 = r2
            androidx.leanback.widget.AbstractDetailsDescriptionPresenter$ViewHolder r0 = (androidx.leanback.widget.AbstractDetailsDescriptionPresenter.ViewHolder) r0
            r0.addPreDrawListener()
            super.onViewAttachedToWindow(r2)
            return
    }

    @Override // androidx.leanback.widget.Presenter
    public void onViewDetachedFromWindow(androidx.leanback.widget.Presenter.ViewHolder r2) {
            r1 = this;
            r0 = r2
            androidx.leanback.widget.AbstractDetailsDescriptionPresenter$ViewHolder r0 = (androidx.leanback.widget.AbstractDetailsDescriptionPresenter.ViewHolder) r0
            r0.removePreDrawListener()
            super.onViewDetachedFromWindow(r2)
            return
    }
}
