package com.google.android.material.progressindicator;

/* JADX INFO: loaded from: classes3.dex */
public final class LinearProgressIndicatorSpec extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec {
    public boolean drawHorizontallyInverse;
    public int indeterminateAnimationType;
    public int indicatorDirection;

    public LinearProgressIndicatorSpec(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.Nullable android.util.AttributeSet r3) {
            r1 = this;
            int r0 = com.google.android.material.R.attr.linearProgressIndicatorStyle
            r1.<init>(r2, r3, r0)
            return
    }

    public LinearProgressIndicatorSpec(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.Nullable android.util.AttributeSet r3, @androidx.annotation.AttrRes int r4) {
            r1 = this;
            int r0 = com.google.android.material.progressindicator.LinearProgressIndicator.DEF_STYLE_RES
            r1.<init>(r2, r3, r4, r0)
            return
    }

    public LinearProgressIndicatorSpec(@androidx.annotation.NonNull android.content.Context r7, @androidx.annotation.Nullable android.util.AttributeSet r8, @androidx.annotation.AttrRes int r9, @androidx.annotation.StyleRes int r10) {
            r6 = this;
            r6.<init>(r7, r8, r9, r10)
            int[] r2 = com.google.android.material.R.styleable.LinearProgressIndicator
            int r3 = com.google.android.material.R.attr.linearProgressIndicatorStyle
            int r4 = com.google.android.material.progressindicator.LinearProgressIndicator.DEF_STYLE_RES
            r9 = 0
            int[] r5 = new int[r9]
            r0 = r7
            r1 = r8
            android.content.res.TypedArray r7 = com.google.android.material.internal.ThemeEnforcement.obtainStyledAttributes(r0, r1, r2, r3, r4, r5)
            int r8 = com.google.android.material.R.styleable.LinearProgressIndicator_indeterminateAnimationType
            r10 = 1
            int r8 = r7.getInt(r8, r10)
            r6.indeterminateAnimationType = r8
            int r8 = com.google.android.material.R.styleable.LinearProgressIndicator_indicatorDirectionLinear
            int r8 = r7.getInt(r8, r9)
            r6.indicatorDirection = r8
            r7.recycle()
            r6.validateSpec()
            int r7 = r6.indicatorDirection
            if (r7 != r10) goto L2e
            r9 = 1
        L2e:
            r6.drawHorizontallyInverse = r9
            return
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicatorSpec
    public final void validateSpec() {
            r2 = this;
            int r0 = r2.indeterminateAnimationType
            if (r0 != 0) goto L1f
            int r0 = r2.trackCornerRadius
            if (r0 > 0) goto L17
            int[] r0 = r2.indicatorColors
            int r0 = r0.length
            r1 = 3
            if (r0 < r1) goto Lf
            goto L1f
        Lf:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Contiguous indeterminate animation must be used with 3 or more indicator colors."
            r0.<init>(r1)
            throw r0
        L17:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Rounded corners are not supported in contiguous indeterminate animation."
            r0.<init>(r1)
            throw r0
        L1f:
            return
    }
}
