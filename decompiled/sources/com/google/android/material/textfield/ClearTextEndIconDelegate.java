package com.google.android.material.textfield;

/* JADX INFO: loaded from: classes.dex */
class ClearTextEndIconDelegate extends com.google.android.material.textfield.EndIconDelegate {
    private static final float ANIMATION_SCALE_FROM_VALUE = 0.8f;
    private static final int DEFAULT_ANIMATION_FADE_DURATION = 100;
    private static final int DEFAULT_ANIMATION_SCALE_DURATION = 150;
    private final int animationFadeDuration;

    @androidx.annotation.NonNull
    private final android.animation.TimeInterpolator animationFadeInterpolator;
    private final int animationScaleDuration;

    @androidx.annotation.NonNull
    private final android.animation.TimeInterpolator animationScaleInterpolator;

    @androidx.annotation.Nullable
    private android.widget.EditText editText;
    private android.animation.AnimatorSet iconInAnim;
    private android.animation.ValueAnimator iconOutAnim;
    private final android.view.View.OnFocusChangeListener onFocusChangeListener;
    private final android.view.View.OnClickListener onIconClickListener;



    /* JADX INFO: renamed from: $r8$lambda$Abvjkt9KmYeJvJ7_vHGwZ-xlmVA, reason: not valid java name */
    public static /* synthetic */ void m292$r8$lambda$Abvjkt9KmYeJvJ7_vHGwZxlmVA(com.google.android.material.textfield.ClearTextEndIconDelegate r0, android.animation.ValueAnimator r1) {
            r0.lambda$getScaleAnimator$4(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$nI62G89ozUOuRnvjwrP0IYYoGyA(com.google.android.material.textfield.ClearTextEndIconDelegate r0, android.view.View r1) {
            r0.lambda$new$0(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$tQahUbi3HJfsEhbpmdlHLxzqxv4(com.google.android.material.textfield.ClearTextEndIconDelegate r0, android.animation.ValueAnimator r1) {
            r0.lambda$getAlphaAnimator$3(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$ycpHjhDocuatJlJAPKZepsuRHG8(com.google.android.material.textfield.ClearTextEndIconDelegate r0, android.view.View r1, boolean r2) {
            r0.lambda$new$1(r1, r2)
            return
    }

    public static /* synthetic */ void $r8$lambda$ypc1RVfDDE8vNgAyrsAm7Dre9Zs(com.google.android.material.textfield.ClearTextEndIconDelegate r0) {
            r0.lambda$tearDown$2()
            return
    }

    public ClearTextEndIconDelegate(@androidx.annotation.NonNull com.google.android.material.textfield.EndCompoundLayout r4) {
            r3 = this;
            r3.<init>(r4)
            com.google.android.material.textfield.ClearTextEndIconDelegate$$ExternalSyntheticLambda1 r0 = new com.google.android.material.textfield.ClearTextEndIconDelegate$$ExternalSyntheticLambda1
            r1 = 0
            r0.<init>(r3, r1)
            r3.onIconClickListener = r0
            com.google.android.material.textfield.ClearTextEndIconDelegate$$ExternalSyntheticLambda2 r0 = new com.google.android.material.textfield.ClearTextEndIconDelegate$$ExternalSyntheticLambda2
            r0.<init>(r3, r1)
            r3.onFocusChangeListener = r0
            android.content.Context r0 = r4.getContext()
            int r1 = com.google.android.material.R.attr.motionDurationShort3
            r2 = 100
            int r0 = com.google.android.material.motion.MotionUtils.resolveThemeDuration(r0, r1, r2)
            r3.animationFadeDuration = r0
            android.content.Context r0 = r4.getContext()
            r2 = 150(0x96, float:2.1E-43)
            int r0 = com.google.android.material.motion.MotionUtils.resolveThemeDuration(r0, r1, r2)
            r3.animationScaleDuration = r0
            android.content.Context r0 = r4.getContext()
            int r1 = com.google.android.material.R.attr.motionEasingLinearInterpolator
            android.animation.TimeInterpolator r2 = com.google.android.material.animation.AnimationUtils.LINEAR_INTERPOLATOR
            android.animation.TimeInterpolator r0 = com.google.android.material.motion.MotionUtils.resolveThemeInterpolator(r0, r1, r2)
            r3.animationFadeInterpolator = r0
            android.content.Context r4 = r4.getContext()
            int r0 = com.google.android.material.R.attr.motionEasingEmphasizedInterpolator
            android.animation.TimeInterpolator r1 = com.google.android.material.animation.AnimationUtils.LINEAR_OUT_SLOW_IN_INTERPOLATOR
            android.animation.TimeInterpolator r4 = com.google.android.material.motion.MotionUtils.resolveThemeInterpolator(r4, r0, r1)
            r3.animationScaleInterpolator = r4
            return
    }

    private void animateIcon(boolean r3) {
            r2 = this;
            com.google.android.material.textfield.EndCompoundLayout r0 = r2.endLayout
            boolean r0 = r0.isEndIconVisible()
            if (r0 != r3) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            if (r3 == 0) goto L27
            android.animation.AnimatorSet r1 = r2.iconInAnim
            boolean r1 = r1.isRunning()
            if (r1 != 0) goto L27
            android.animation.ValueAnimator r3 = r2.iconOutAnim
            r3.cancel()
            android.animation.AnimatorSet r3 = r2.iconInAnim
            r3.start()
            if (r0 == 0) goto L3a
            android.animation.AnimatorSet r3 = r2.iconInAnim
            r3.end()
            goto L3a
        L27:
            if (r3 != 0) goto L3a
            android.animation.AnimatorSet r3 = r2.iconInAnim
            r3.cancel()
            android.animation.ValueAnimator r3 = r2.iconOutAnim
            r3.start()
            if (r0 == 0) goto L3a
            android.animation.ValueAnimator r3 = r2.iconOutAnim
            r3.end()
        L3a:
            return
    }

    private android.animation.ValueAnimator getAlphaAnimator(float... r3) {
            r2 = this;
            android.animation.ValueAnimator r3 = android.animation.ValueAnimator.ofFloat(r3)
            android.animation.TimeInterpolator r0 = r2.animationFadeInterpolator
            r3.setInterpolator(r0)
            int r0 = r2.animationFadeDuration
            long r0 = (long) r0
            r3.setDuration(r0)
            com.google.android.material.textfield.ClearTextEndIconDelegate$$ExternalSyntheticLambda0 r0 = new com.google.android.material.textfield.ClearTextEndIconDelegate$$ExternalSyntheticLambda0
            r1 = 1
            r0.<init>(r2, r1)
            r3.addUpdateListener(r0)
            return r3
    }

    private android.animation.ValueAnimator getScaleAnimator() {
            r3 = this;
            r0 = 2
            float[] r0 = new float[r0]
            r0 = {x0020: FILL_ARRAY_DATA , data: [1061997773, 1065353216} // fill-array
            android.animation.ValueAnimator r0 = android.animation.ValueAnimator.ofFloat(r0)
            android.animation.TimeInterpolator r1 = r3.animationScaleInterpolator
            r0.setInterpolator(r1)
            int r1 = r3.animationScaleDuration
            long r1 = (long) r1
            r0.setDuration(r1)
            com.google.android.material.textfield.ClearTextEndIconDelegate$$ExternalSyntheticLambda0 r1 = new com.google.android.material.textfield.ClearTextEndIconDelegate$$ExternalSyntheticLambda0
            r2 = 0
            r1.<init>(r3, r2)
            r0.addUpdateListener(r1)
            return r0
    }

    private void initAnimators() {
            r6 = this;
            android.animation.ValueAnimator r0 = r6.getScaleAnimator()
            r1 = 2
            float[] r2 = new float[r1]
            r2 = {x003e: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
            android.animation.ValueAnimator r2 = r6.getAlphaAnimator(r2)
            android.animation.AnimatorSet r3 = new android.animation.AnimatorSet
            r3.<init>()
            r6.iconInAnim = r3
            android.animation.Animator[] r4 = new android.animation.Animator[r1]
            r5 = 0
            r4[r5] = r0
            r0 = 1
            r4[r0] = r2
            r3.playTogether(r4)
            android.animation.AnimatorSet r0 = r6.iconInAnim
            com.google.android.material.textfield.ClearTextEndIconDelegate$1 r2 = new com.google.android.material.textfield.ClearTextEndIconDelegate$1
            r2.<init>(r6)
            r0.addListener(r2)
            float[] r0 = new float[r1]
            r0 = {x0046: FILL_ARRAY_DATA , data: [1065353216, 0} // fill-array
            android.animation.ValueAnimator r0 = r6.getAlphaAnimator(r0)
            r6.iconOutAnim = r0
            com.google.android.material.textfield.ClearTextEndIconDelegate$2 r1 = new com.google.android.material.textfield.ClearTextEndIconDelegate$2
            r1.<init>(r6)
            r0.addListener(r1)
            return
    }

    private /* synthetic */ void lambda$getAlphaAnimator$3(android.animation.ValueAnimator r2) {
            r1 = this;
            java.lang.Object r2 = r2.getAnimatedValue()
            java.lang.Float r2 = (java.lang.Float) r2
            float r2 = r2.floatValue()
            com.google.android.material.internal.CheckableImageButton r0 = r1.endIconView
            r0.setAlpha(r2)
            return
    }

    private /* synthetic */ void lambda$getScaleAnimator$4(android.animation.ValueAnimator r2) {
            r1 = this;
            java.lang.Object r2 = r2.getAnimatedValue()
            java.lang.Float r2 = (java.lang.Float) r2
            float r2 = r2.floatValue()
            com.google.android.material.internal.CheckableImageButton r0 = r1.endIconView
            r0.setScaleX(r2)
            com.google.android.material.internal.CheckableImageButton r0 = r1.endIconView
            r0.setScaleY(r2)
            return
    }

    private /* synthetic */ void lambda$new$0(android.view.View r1) {
            r0 = this;
            android.widget.EditText r1 = r0.editText
            if (r1 != 0) goto L5
            return
        L5:
            android.text.Editable r1 = r1.getText()
            if (r1 == 0) goto Le
            r1.clear()
        Le:
            r0.refreshIconState()
            return
    }

    private /* synthetic */ void lambda$new$1(android.view.View r1, boolean r2) {
            r0 = this;
            boolean r1 = r0.shouldBeVisible()
            r0.animateIcon(r1)
            return
    }

    private /* synthetic */ void lambda$tearDown$2() {
            r1 = this;
            r0 = 1
            r1.animateIcon(r0)
            return
    }

    private boolean shouldBeVisible() {
            r1 = this;
            android.widget.EditText r0 = r1.editText
            if (r0 == 0) goto L20
            boolean r0 = r0.hasFocus()
            if (r0 != 0) goto L12
            com.google.android.material.internal.CheckableImageButton r0 = r1.endIconView
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto L20
        L12:
            android.widget.EditText r0 = r1.editText
            android.text.Editable r0 = r0.getText()
            int r0 = r0.length()
            if (r0 <= 0) goto L20
            r0 = 1
            goto L21
        L20:
            r0 = 0
        L21:
            return r0
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public final void afterEditTextChanged(@androidx.annotation.NonNull android.text.Editable r1) {
            r0 = this;
            com.google.android.material.textfield.EndCompoundLayout r1 = r0.endLayout
            java.lang.CharSequence r1 = r1.getSuffixText()
            if (r1 == 0) goto L9
            return
        L9:
            boolean r1 = r0.shouldBeVisible()
            r0.animateIcon(r1)
            return
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public final int getIconContentDescriptionResId() {
            r1 = this;
            int r0 = com.google.android.material.R.string.clear_text_end_icon_content_description
            return r0
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public final int getIconDrawableResId() {
            r1 = this;
            int r0 = com.google.android.material.R.drawable.mtrl_ic_cancel
            return r0
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public final android.view.View.OnFocusChangeListener getOnEditTextFocusChangeListener() {
            r1 = this;
            android.view.View$OnFocusChangeListener r0 = r1.onFocusChangeListener
            return r0
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public final android.view.View.OnClickListener getOnIconClickListener() {
            r1 = this;
            android.view.View$OnClickListener r0 = r1.onIconClickListener
            return r0
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public final android.view.View.OnFocusChangeListener getOnIconViewFocusChangeListener() {
            r1 = this;
            android.view.View$OnFocusChangeListener r0 = r1.onFocusChangeListener
            return r0
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public void onEditTextAttached(@androidx.annotation.Nullable android.widget.EditText r2) {
            r1 = this;
            r1.editText = r2
            com.google.android.material.textfield.TextInputLayout r2 = r1.textInputLayout
            boolean r0 = r1.shouldBeVisible()
            r2.setEndIconVisible(r0)
            return
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public final void onSuffixVisibilityChanged(boolean r2) {
            r1 = this;
            com.google.android.material.textfield.EndCompoundLayout r0 = r1.endLayout
            java.lang.CharSequence r0 = r0.getSuffixText()
            if (r0 != 0) goto L9
            return
        L9:
            r1.animateIcon(r2)
            return
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public final void setUp() {
            r0 = this;
            r0.initAnimators()
            return
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public final void tearDown() {
            r3 = this;
            android.widget.EditText r0 = r3.editText
            if (r0 == 0) goto Ld
            com.google.android.material.textfield.ClearTextEndIconDelegate$$ExternalSyntheticLambda3 r1 = new com.google.android.material.textfield.ClearTextEndIconDelegate$$ExternalSyntheticLambda3
            r2 = 0
            r1.<init>(r3, r2)
            r0.post(r1)
        Ld:
            return
    }
}
