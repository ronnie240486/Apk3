package com.google.android.material.progressindicator;

/* JADX INFO: loaded from: classes2.dex */
public final class CircularProgressIndicator extends com.google.android.material.progressindicator.BaseProgressIndicator<com.google.android.material.progressindicator.CircularProgressIndicatorSpec> {
    public static final int DEF_STYLE_RES = 0;
    public static final int INDICATOR_DIRECTION_CLOCKWISE = 0;
    public static final int INDICATOR_DIRECTION_COUNTERCLOCKWISE = 1;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public @interface IndicatorDirection {
    }

    static {
            int r0 = com.google.android.material.R.style.Widget_MaterialComponents_CircularProgressIndicator
            com.google.android.material.progressindicator.CircularProgressIndicator.DEF_STYLE_RES = r0
            return
    }

    public CircularProgressIndicator(@androidx.annotation.NonNull android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public CircularProgressIndicator(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.Nullable android.util.AttributeSet r3) {
            r1 = this;
            int r0 = com.google.android.material.R.attr.circularProgressIndicatorStyle
            r1.<init>(r2, r3, r0)
            return
    }

    public CircularProgressIndicator(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.Nullable android.util.AttributeSet r3, @androidx.annotation.AttrRes int r4) {
            r1 = this;
            int r0 = com.google.android.material.progressindicator.CircularProgressIndicator.DEF_STYLE_RES
            r1.<init>(r2, r3, r4, r0)
            r1.initializeDrawables()
            return
    }

    private void initializeDrawables() {
            r2 = this;
            android.content.Context r0 = r2.getContext()
            S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec r1 = r2.spec
            com.google.android.material.progressindicator.CircularProgressIndicatorSpec r1 = (com.google.android.material.progressindicator.CircularProgressIndicatorSpec) r1
            com.google.android.material.progressindicator.IndeterminateDrawable r0 = com.google.android.material.progressindicator.IndeterminateDrawable.createCircularDrawable(r0, r1)
            r2.setIndeterminateDrawable(r0)
            android.content.Context r0 = r2.getContext()
            S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec r1 = r2.spec
            com.google.android.material.progressindicator.CircularProgressIndicatorSpec r1 = (com.google.android.material.progressindicator.CircularProgressIndicatorSpec) r1
            com.google.android.material.progressindicator.DeterminateDrawable r0 = com.google.android.material.progressindicator.DeterminateDrawable.createCircularDrawable(r0, r1)
            r2.setProgressDrawable(r0)
            return
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    public final com.google.android.material.progressindicator.BaseProgressIndicatorSpec createSpec(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.NonNull android.util.AttributeSet r3) {
            r1 = this;
            com.google.android.material.progressindicator.CircularProgressIndicatorSpec r0 = new com.google.android.material.progressindicator.CircularProgressIndicatorSpec
            r0.<init>(r2, r3)
            return r0
    }

    public int getIndicatorDirection() {
            r1 = this;
            S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec r0 = r1.spec
            com.google.android.material.progressindicator.CircularProgressIndicatorSpec r0 = (com.google.android.material.progressindicator.CircularProgressIndicatorSpec) r0
            int r0 = r0.indicatorDirection
            return r0
    }

    @androidx.annotation.Px
    public int getIndicatorInset() {
            r1 = this;
            S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec r0 = r1.spec
            com.google.android.material.progressindicator.CircularProgressIndicatorSpec r0 = (com.google.android.material.progressindicator.CircularProgressIndicatorSpec) r0
            int r0 = r0.indicatorInset
            return r0
    }

    @androidx.annotation.Px
    public int getIndicatorSize() {
            r1 = this;
            S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec r0 = r1.spec
            com.google.android.material.progressindicator.CircularProgressIndicatorSpec r0 = (com.google.android.material.progressindicator.CircularProgressIndicatorSpec) r0
            int r0 = r0.indicatorSize
            return r0
    }

    public void setIndicatorDirection(int r2) {
            r1 = this;
            S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec r0 = r1.spec
            com.google.android.material.progressindicator.CircularProgressIndicatorSpec r0 = (com.google.android.material.progressindicator.CircularProgressIndicatorSpec) r0
            r0.indicatorDirection = r2
            r1.invalidate()
            return
    }

    public void setIndicatorInset(@androidx.annotation.Px int r3) {
            r2 = this;
            S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec r0 = r2.spec
            r1 = r0
            com.google.android.material.progressindicator.CircularProgressIndicatorSpec r1 = (com.google.android.material.progressindicator.CircularProgressIndicatorSpec) r1
            int r1 = r1.indicatorInset
            if (r1 == r3) goto L10
            com.google.android.material.progressindicator.CircularProgressIndicatorSpec r0 = (com.google.android.material.progressindicator.CircularProgressIndicatorSpec) r0
            r0.indicatorInset = r3
            r2.invalidate()
        L10:
            return
    }

    public void setIndicatorSize(@androidx.annotation.Px int r3) {
            r2 = this;
            int r0 = r2.getTrackThickness()
            int r0 = r0 * 2
            int r3 = java.lang.Math.max(r3, r0)
            S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec r0 = r2.spec
            r1 = r0
            com.google.android.material.progressindicator.CircularProgressIndicatorSpec r1 = (com.google.android.material.progressindicator.CircularProgressIndicatorSpec) r1
            int r1 = r1.indicatorSize
            if (r1 == r3) goto L20
            r1 = r0
            com.google.android.material.progressindicator.CircularProgressIndicatorSpec r1 = (com.google.android.material.progressindicator.CircularProgressIndicatorSpec) r1
            r1.indicatorSize = r3
            com.google.android.material.progressindicator.CircularProgressIndicatorSpec r0 = (com.google.android.material.progressindicator.CircularProgressIndicatorSpec) r0
            java.util.Objects.requireNonNull(r0)
            r2.invalidate()
        L20:
            return
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    public void setTrackThickness(int r1) {
            r0 = this;
            super.setTrackThickness(r1)
            S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec r1 = r0.spec
            com.google.android.material.progressindicator.CircularProgressIndicatorSpec r1 = (com.google.android.material.progressindicator.CircularProgressIndicatorSpec) r1
            java.util.Objects.requireNonNull(r1)
            return
    }
}
