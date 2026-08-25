package com.google.android.material.progressindicator;

/* JADX INFO: loaded from: classes2.dex */
public final class LinearProgressIndicator extends com.google.android.material.progressindicator.BaseProgressIndicator<com.google.android.material.progressindicator.LinearProgressIndicatorSpec> {
    public static final int DEF_STYLE_RES = 0;
    public static final int INDETERMINATE_ANIMATION_TYPE_CONTIGUOUS = 0;
    public static final int INDETERMINATE_ANIMATION_TYPE_DISJOINT = 1;
    public static final int INDICATOR_DIRECTION_END_TO_START = 3;
    public static final int INDICATOR_DIRECTION_LEFT_TO_RIGHT = 0;
    public static final int INDICATOR_DIRECTION_RIGHT_TO_LEFT = 1;
    public static final int INDICATOR_DIRECTION_START_TO_END = 2;

    /* JADX INFO: loaded from: classes3.dex */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public @interface IndeterminateAnimationType {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public @interface IndicatorDirection {
    }

    static {
            int r0 = com.google.android.material.R.style.Widget_MaterialComponents_LinearProgressIndicator
            com.google.android.material.progressindicator.LinearProgressIndicator.DEF_STYLE_RES = r0
            return
    }

    public LinearProgressIndicator(@androidx.annotation.NonNull android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public LinearProgressIndicator(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.Nullable android.util.AttributeSet r3) {
            r1 = this;
            int r0 = com.google.android.material.R.attr.linearProgressIndicatorStyle
            r1.<init>(r2, r3, r0)
            return
    }

    public LinearProgressIndicator(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.Nullable android.util.AttributeSet r3, @androidx.annotation.AttrRes int r4) {
            r1 = this;
            int r0 = com.google.android.material.progressindicator.LinearProgressIndicator.DEF_STYLE_RES
            r1.<init>(r2, r3, r4, r0)
            r1.initializeDrawables()
            return
    }

    private void initializeDrawables() {
            r2 = this;
            android.content.Context r0 = r2.getContext()
            S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec r1 = r2.spec
            com.google.android.material.progressindicator.LinearProgressIndicatorSpec r1 = (com.google.android.material.progressindicator.LinearProgressIndicatorSpec) r1
            com.google.android.material.progressindicator.IndeterminateDrawable r0 = com.google.android.material.progressindicator.IndeterminateDrawable.createLinearDrawable(r0, r1)
            r2.setIndeterminateDrawable(r0)
            android.content.Context r0 = r2.getContext()
            S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec r1 = r2.spec
            com.google.android.material.progressindicator.LinearProgressIndicatorSpec r1 = (com.google.android.material.progressindicator.LinearProgressIndicatorSpec) r1
            com.google.android.material.progressindicator.DeterminateDrawable r0 = com.google.android.material.progressindicator.DeterminateDrawable.createLinearDrawable(r0, r1)
            r2.setProgressDrawable(r0)
            return
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    public final com.google.android.material.progressindicator.BaseProgressIndicatorSpec createSpec(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.NonNull android.util.AttributeSet r3) {
            r1 = this;
            com.google.android.material.progressindicator.LinearProgressIndicatorSpec r0 = new com.google.android.material.progressindicator.LinearProgressIndicatorSpec
            r0.<init>(r2, r3)
            return r0
    }

    public int getIndeterminateAnimationType() {
            r1 = this;
            S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec r0 = r1.spec
            com.google.android.material.progressindicator.LinearProgressIndicatorSpec r0 = (com.google.android.material.progressindicator.LinearProgressIndicatorSpec) r0
            int r0 = r0.indeterminateAnimationType
            return r0
    }

    public int getIndicatorDirection() {
            r1 = this;
            S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec r0 = r1.spec
            com.google.android.material.progressindicator.LinearProgressIndicatorSpec r0 = (com.google.android.material.progressindicator.LinearProgressIndicatorSpec) r0
            int r0 = r0.indicatorDirection
            return r0
    }

    @Override // android.view.View
    public final void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            super.onLayout(r1, r2, r3, r4, r5)
            S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec r1 = r0.spec
            r2 = r1
            com.google.android.material.progressindicator.LinearProgressIndicatorSpec r2 = (com.google.android.material.progressindicator.LinearProgressIndicatorSpec) r2
            com.google.android.material.progressindicator.LinearProgressIndicatorSpec r1 = (com.google.android.material.progressindicator.LinearProgressIndicatorSpec) r1
            int r1 = r1.indicatorDirection
            r3 = 1
            if (r1 == r3) goto L2f
            int r1 = androidx.core.view.ViewCompat.getLayoutDirection(r0)
            if (r1 != r3) goto L1e
            S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec r1 = r0.spec
            com.google.android.material.progressindicator.LinearProgressIndicatorSpec r1 = (com.google.android.material.progressindicator.LinearProgressIndicatorSpec) r1
            int r1 = r1.indicatorDirection
            r4 = 2
            if (r1 == r4) goto L2f
        L1e:
            int r1 = androidx.core.view.ViewCompat.getLayoutDirection(r0)
            if (r1 != 0) goto L2e
            S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec r1 = r0.spec
            com.google.android.material.progressindicator.LinearProgressIndicatorSpec r1 = (com.google.android.material.progressindicator.LinearProgressIndicatorSpec) r1
            int r1 = r1.indicatorDirection
            r4 = 3
            if (r1 != r4) goto L2e
            goto L2f
        L2e:
            r3 = 0
        L2f:
            r2.drawHorizontallyInverse = r3
            return
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onSizeChanged(int r1, int r2, int r3, int r4) {
            r0 = this;
            int r3 = r0.getPaddingLeft()
            int r4 = r0.getPaddingRight()
            int r4 = r4 + r3
            int r1 = r1 - r4
            int r3 = r0.getPaddingTop()
            int r4 = r0.getPaddingBottom()
            int r4 = r4 + r3
            int r2 = r2 - r4
            com.google.android.material.progressindicator.IndeterminateDrawable r3 = r0.getIndeterminateDrawable()
            r4 = 0
            if (r3 == 0) goto L1e
            r3.setBounds(r4, r4, r1, r2)
        L1e:
            com.google.android.material.progressindicator.DeterminateDrawable r3 = r0.getProgressDrawable()
            if (r3 == 0) goto L27
            r3.setBounds(r4, r4, r1, r2)
        L27:
            return
    }

    public void setIndeterminateAnimationType(int r4) {
            r3 = this;
            S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec r0 = r3.spec
            com.google.android.material.progressindicator.LinearProgressIndicatorSpec r0 = (com.google.android.material.progressindicator.LinearProgressIndicatorSpec) r0
            int r0 = r0.indeterminateAnimationType
            if (r0 != r4) goto L9
            return
        L9:
            boolean r0 = r3.visibleToUser()
            if (r0 == 0) goto L1e
            boolean r0 = r3.isIndeterminate()
            if (r0 != 0) goto L16
            goto L1e
        L16:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "Cannot change indeterminate animation type while the progress indicator is show in indeterminate mode."
            r4.<init>(r0)
            throw r4
        L1e:
            S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec r0 = r3.spec
            r1 = r0
            com.google.android.material.progressindicator.LinearProgressIndicatorSpec r1 = (com.google.android.material.progressindicator.LinearProgressIndicatorSpec) r1
            r1.indeterminateAnimationType = r4
            com.google.android.material.progressindicator.LinearProgressIndicatorSpec r0 = (com.google.android.material.progressindicator.LinearProgressIndicatorSpec) r0
            r0.validateSpec()
            if (r4 != 0) goto L3d
            com.google.android.material.progressindicator.IndeterminateDrawable r4 = r3.getIndeterminateDrawable()
            com.google.android.material.progressindicator.LinearIndeterminateContiguousAnimatorDelegate r0 = new com.google.android.material.progressindicator.LinearIndeterminateContiguousAnimatorDelegate
            S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec r1 = r3.spec
            com.google.android.material.progressindicator.LinearProgressIndicatorSpec r1 = (com.google.android.material.progressindicator.LinearProgressIndicatorSpec) r1
            r0.<init>(r1)
            r4.setAnimatorDelegate(r0)
            goto L51
        L3d:
            com.google.android.material.progressindicator.IndeterminateDrawable r4 = r3.getIndeterminateDrawable()
            com.google.android.material.progressindicator.LinearIndeterminateDisjointAnimatorDelegate r0 = new com.google.android.material.progressindicator.LinearIndeterminateDisjointAnimatorDelegate
            android.content.Context r1 = r3.getContext()
            S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec r2 = r3.spec
            com.google.android.material.progressindicator.LinearProgressIndicatorSpec r2 = (com.google.android.material.progressindicator.LinearProgressIndicatorSpec) r2
            r0.<init>(r1, r2)
            r4.setAnimatorDelegate(r0)
        L51:
            r3.invalidate()
            return
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    public void setIndicatorColor(@androidx.annotation.NonNull int... r1) {
            r0 = this;
            super.setIndicatorColor(r1)
            S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec r1 = r0.spec
            com.google.android.material.progressindicator.LinearProgressIndicatorSpec r1 = (com.google.android.material.progressindicator.LinearProgressIndicatorSpec) r1
            r1.validateSpec()
            return
    }

    public void setIndicatorDirection(int r5) {
            r4 = this;
            S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec r0 = r4.spec
            r1 = r0
            com.google.android.material.progressindicator.LinearProgressIndicatorSpec r1 = (com.google.android.material.progressindicator.LinearProgressIndicatorSpec) r1
            r1.indicatorDirection = r5
            com.google.android.material.progressindicator.LinearProgressIndicatorSpec r0 = (com.google.android.material.progressindicator.LinearProgressIndicatorSpec) r0
            r1 = 1
            if (r5 == r1) goto L26
            int r2 = androidx.core.view.ViewCompat.getLayoutDirection(r4)
            if (r2 != r1) goto L1b
            S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec r2 = r4.spec
            com.google.android.material.progressindicator.LinearProgressIndicatorSpec r2 = (com.google.android.material.progressindicator.LinearProgressIndicatorSpec) r2
            int r2 = r2.indicatorDirection
            r3 = 2
            if (r2 == r3) goto L26
        L1b:
            int r2 = androidx.core.view.ViewCompat.getLayoutDirection(r4)
            if (r2 != 0) goto L25
            r2 = 3
            if (r5 != r2) goto L25
            goto L26
        L25:
            r1 = 0
        L26:
            r0.drawHorizontallyInverse = r1
            r4.invalidate()
            return
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    public void setProgressCompat(int r2, boolean r3) {
            r1 = this;
            S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec r0 = r1.spec
            if (r0 == 0) goto L11
            com.google.android.material.progressindicator.LinearProgressIndicatorSpec r0 = (com.google.android.material.progressindicator.LinearProgressIndicatorSpec) r0
            int r0 = r0.indeterminateAnimationType
            if (r0 != 0) goto L11
            boolean r0 = r1.isIndeterminate()
            if (r0 == 0) goto L11
            return
        L11:
            super.setProgressCompat(r2, r3)
            return
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    public void setTrackCornerRadius(int r1) {
            r0 = this;
            super.setTrackCornerRadius(r1)
            S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec r1 = r0.spec
            com.google.android.material.progressindicator.LinearProgressIndicatorSpec r1 = (com.google.android.material.progressindicator.LinearProgressIndicatorSpec) r1
            r1.validateSpec()
            r0.invalidate()
            return
    }
}
