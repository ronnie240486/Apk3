package com.google.android.material.snackbar;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public class SnackbarContentLayout extends android.widget.LinearLayout implements com.google.android.material.snackbar.ContentViewCallback {
    private android.widget.Button actionView;
    private final android.animation.TimeInterpolator contentInterpolator;
    private int maxInlineActionWidth;
    private android.widget.TextView messageView;

    public SnackbarContentLayout(@androidx.annotation.NonNull android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public SnackbarContentLayout(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.Nullable android.util.AttributeSet r3) {
            r1 = this;
            r1.<init>(r2, r3)
            int r3 = com.google.android.material.R.attr.motionEasingEmphasizedInterpolator
            android.animation.TimeInterpolator r0 = com.google.android.material.animation.AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR
            android.animation.TimeInterpolator r2 = com.google.android.material.motion.MotionUtils.resolveThemeInterpolator(r2, r3, r0)
            r1.contentInterpolator = r2
            return
    }

    private static void updateTopBottomPadding(@androidx.annotation.NonNull android.view.View r2, int r3, int r4) {
            boolean r0 = androidx.core.view.ViewCompat.isPaddingRelative(r2)
            if (r0 == 0) goto L12
            int r0 = androidx.core.view.ViewCompat.getPaddingStart(r2)
            int r1 = androidx.core.view.ViewCompat.getPaddingEnd(r2)
            androidx.core.view.ViewCompat.setPaddingRelative(r2, r0, r3, r1, r4)
            goto L1d
        L12:
            int r0 = r2.getPaddingLeft()
            int r1 = r2.getPaddingRight()
            r2.setPadding(r0, r3, r1, r4)
        L1d:
            return
    }

    private boolean updateViewsWithinLayout(int r3, int r4, int r5) {
            r2 = this;
            int r0 = r2.getOrientation()
            r1 = 1
            if (r3 == r0) goto Lc
            r2.setOrientation(r3)
            r3 = 1
            goto Ld
        Lc:
            r3 = 0
        Ld:
            android.widget.TextView r0 = r2.messageView
            int r0 = r0.getPaddingTop()
            if (r0 != r4) goto L20
            android.widget.TextView r0 = r2.messageView
            int r0 = r0.getPaddingBottom()
            if (r0 == r5) goto L1e
            goto L20
        L1e:
            r1 = r3
            goto L25
        L20:
            android.widget.TextView r3 = r2.messageView
            updateTopBottomPadding(r3, r4, r5)
        L25:
            return r1
    }

    @Override // com.google.android.material.snackbar.ContentViewCallback
    public void animateContentIn(int r8, int r9) {
            r7 = this;
            android.widget.TextView r0 = r7.messageView
            r1 = 0
            r0.setAlpha(r1)
            android.widget.TextView r0 = r7.messageView
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r2 = 1065353216(0x3f800000, float:1.0)
            android.view.ViewPropertyAnimator r0 = r0.alpha(r2)
            long r3 = (long) r9
            android.view.ViewPropertyAnimator r9 = r0.setDuration(r3)
            android.animation.TimeInterpolator r0 = r7.contentInterpolator
            android.view.ViewPropertyAnimator r9 = r9.setInterpolator(r0)
            long r5 = (long) r8
            android.view.ViewPropertyAnimator r8 = r9.setStartDelay(r5)
            r8.start()
            android.widget.Button r8 = r7.actionView
            int r8 = r8.getVisibility()
            if (r8 != 0) goto L4d
            android.widget.Button r8 = r7.actionView
            r8.setAlpha(r1)
            android.widget.Button r8 = r7.actionView
            android.view.ViewPropertyAnimator r8 = r8.animate()
            android.view.ViewPropertyAnimator r8 = r8.alpha(r2)
            android.view.ViewPropertyAnimator r8 = r8.setDuration(r3)
            android.animation.TimeInterpolator r9 = r7.contentInterpolator
            android.view.ViewPropertyAnimator r8 = r8.setInterpolator(r9)
            android.view.ViewPropertyAnimator r8 = r8.setStartDelay(r5)
            r8.start()
        L4d:
            return
    }

    @Override // com.google.android.material.snackbar.ContentViewCallback
    public void animateContentOut(int r8, int r9) {
            r7 = this;
            android.widget.TextView r0 = r7.messageView
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.setAlpha(r1)
            android.widget.TextView r0 = r7.messageView
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r2 = 0
            android.view.ViewPropertyAnimator r0 = r0.alpha(r2)
            long r3 = (long) r9
            android.view.ViewPropertyAnimator r9 = r0.setDuration(r3)
            android.animation.TimeInterpolator r0 = r7.contentInterpolator
            android.view.ViewPropertyAnimator r9 = r9.setInterpolator(r0)
            long r5 = (long) r8
            android.view.ViewPropertyAnimator r8 = r9.setStartDelay(r5)
            r8.start()
            android.widget.Button r8 = r7.actionView
            int r8 = r8.getVisibility()
            if (r8 != 0) goto L4d
            android.widget.Button r8 = r7.actionView
            r8.setAlpha(r1)
            android.widget.Button r8 = r7.actionView
            android.view.ViewPropertyAnimator r8 = r8.animate()
            android.view.ViewPropertyAnimator r8 = r8.alpha(r2)
            android.view.ViewPropertyAnimator r8 = r8.setDuration(r3)
            android.animation.TimeInterpolator r9 = r7.contentInterpolator
            android.view.ViewPropertyAnimator r8 = r8.setInterpolator(r9)
            android.view.ViewPropertyAnimator r8 = r8.setStartDelay(r5)
            r8.start()
        L4d:
            return
    }

    public android.widget.Button getActionView() {
            r1 = this;
            android.widget.Button r0 = r1.actionView
            return r0
    }

    public android.widget.TextView getMessageView() {
            r1 = this;
            android.widget.TextView r0 = r1.messageView
            return r0
    }

    @Override // android.view.View
    public final void onFinishInflate() {
            r1 = this;
            super.onFinishInflate()
            int r0 = com.google.android.material.R.id.snackbar_text
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1.messageView = r0
            int r0 = com.google.android.material.R.id.snackbar_action
            android.view.View r0 = r1.findViewById(r0)
            android.widget.Button r0 = (android.widget.Button) r0
            r1.actionView = r0
            return
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int r8, int r9) {
            r7 = this;
            super.onMeasure(r8, r9)
            int r0 = r7.getOrientation()
            r1 = 1
            if (r0 != r1) goto Lb
            return
        Lb:
            android.content.res.Resources r0 = r7.getResources()
            int r2 = com.google.android.material.R.dimen.design_snackbar_padding_vertical_2lines
            int r0 = r0.getDimensionPixelSize(r2)
            android.content.res.Resources r2 = r7.getResources()
            int r3 = com.google.android.material.R.dimen.design_snackbar_padding_vertical
            int r2 = r2.getDimensionPixelSize(r3)
            android.widget.TextView r3 = r7.messageView
            android.text.Layout r3 = r3.getLayout()
            r4 = 0
            if (r3 == 0) goto L30
            int r3 = r3.getLineCount()
            if (r3 <= r1) goto L30
            r3 = 1
            goto L31
        L30:
            r3 = 0
        L31:
            if (r3 == 0) goto L4a
            int r5 = r7.maxInlineActionWidth
            if (r5 <= 0) goto L4a
            android.widget.Button r5 = r7.actionView
            int r5 = r5.getMeasuredWidth()
            int r6 = r7.maxInlineActionWidth
            if (r5 <= r6) goto L4a
            int r2 = r0 - r2
            boolean r0 = r7.updateViewsWithinLayout(r1, r0, r2)
            if (r0 == 0) goto L55
            goto L56
        L4a:
            if (r3 == 0) goto L4d
            goto L4e
        L4d:
            r0 = r2
        L4e:
            boolean r0 = r7.updateViewsWithinLayout(r4, r0, r0)
            if (r0 == 0) goto L55
            goto L56
        L55:
            r1 = 0
        L56:
            if (r1 == 0) goto L5b
            super.onMeasure(r8, r9)
        L5b:
            return
    }

    public void setMaxInlineActionWidth(int r1) {
            r0 = this;
            r0.maxInlineActionWidth = r1
            return
    }

    public final void updateActionTextColorAlphaIfNeeded(float r3) {
            r2 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 == 0) goto L1b
            android.widget.Button r0 = r2.actionView
            int r0 = r0.getCurrentTextColor()
            int r1 = com.google.android.material.R.attr.colorSurface
            int r1 = com.google.android.material.color.MaterialColors.getColor(r2, r1)
            int r3 = com.google.android.material.color.MaterialColors.layer(r1, r0, r3)
            android.widget.Button r0 = r2.actionView
            r0.setTextColor(r3)
        L1b:
            return
    }
}
