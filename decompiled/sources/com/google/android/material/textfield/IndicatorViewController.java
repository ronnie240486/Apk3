package com.google.android.material.textfield;

/* JADX INFO: loaded from: classes2.dex */
final class IndicatorViewController {
    private static final int CAPTION_STATE_ERROR = 1;
    private static final int CAPTION_STATE_HELPER_TEXT = 2;
    private static final int CAPTION_STATE_NONE = 0;
    private static final int DEFAULT_CAPTION_FADE_ANIMATION_DURATION = 167;
    private static final int DEFAULT_CAPTION_TRANSLATION_Y_ANIMATION_DURATION = 217;

    @androidx.annotation.Nullable
    private android.animation.Animator captionAnimator;
    private android.widget.FrameLayout captionArea;
    private int captionDisplayed;
    private final int captionFadeInAnimationDuration;

    @androidx.annotation.NonNull
    private final android.animation.TimeInterpolator captionFadeInAnimationInterpolator;
    private final int captionFadeOutAnimationDuration;

    @androidx.annotation.NonNull
    private final android.animation.TimeInterpolator captionFadeOutAnimationInterpolator;
    private int captionToShow;
    private final int captionTranslationYAnimationDuration;

    @androidx.annotation.NonNull
    private final android.animation.TimeInterpolator captionTranslationYAnimationInterpolator;
    private final float captionTranslationYPx;
    private final android.content.Context context;
    private boolean errorEnabled;

    @androidx.annotation.Nullable
    private java.lang.CharSequence errorText;
    private int errorTextAppearance;

    @androidx.annotation.Nullable
    private android.widget.TextView errorView;
    private int errorViewAccessibilityLiveRegion;

    @androidx.annotation.Nullable
    private java.lang.CharSequence errorViewContentDescription;

    @androidx.annotation.Nullable
    private android.content.res.ColorStateList errorViewTextColor;
    private java.lang.CharSequence helperText;
    private boolean helperTextEnabled;
    private int helperTextTextAppearance;

    @androidx.annotation.Nullable
    private android.widget.TextView helperTextView;

    @androidx.annotation.Nullable
    private android.content.res.ColorStateList helperTextViewTextColor;
    private android.widget.LinearLayout indicatorArea;
    private int indicatorsAdded;

    @androidx.annotation.NonNull
    private final com.google.android.material.textfield.TextInputLayout textInputView;
    private android.graphics.Typeface typeface;



    public IndicatorViewController(@androidx.annotation.NonNull com.google.android.material.textfield.TextInputLayout r4) {
            r3 = this;
            r3.<init>()
            android.content.Context r0 = r4.getContext()
            r3.context = r0
            r3.textInputView = r4
            android.content.res.Resources r4 = r0.getResources()
            int r1 = com.google.android.material.R.dimen.design_textinput_caption_translate_y
            int r4 = r4.getDimensionPixelSize(r1)
            float r4 = (float) r4
            r3.captionTranslationYPx = r4
            int r4 = com.google.android.material.R.attr.motionDurationShort4
            r1 = 217(0xd9, float:3.04E-43)
            int r1 = com.google.android.material.motion.MotionUtils.resolveThemeDuration(r0, r4, r1)
            r3.captionTranslationYAnimationDuration = r1
            int r1 = com.google.android.material.R.attr.motionDurationMedium4
            r2 = 167(0xa7, float:2.34E-43)
            int r1 = com.google.android.material.motion.MotionUtils.resolveThemeDuration(r0, r1, r2)
            r3.captionFadeInAnimationDuration = r1
            int r4 = com.google.android.material.motion.MotionUtils.resolveThemeDuration(r0, r4, r2)
            r3.captionFadeOutAnimationDuration = r4
            int r4 = com.google.android.material.R.attr.motionEasingEmphasizedDecelerateInterpolator
            android.animation.TimeInterpolator r1 = com.google.android.material.animation.AnimationUtils.LINEAR_OUT_SLOW_IN_INTERPOLATOR
            android.animation.TimeInterpolator r1 = com.google.android.material.motion.MotionUtils.resolveThemeInterpolator(r0, r4, r1)
            r3.captionTranslationYAnimationInterpolator = r1
            android.animation.TimeInterpolator r1 = com.google.android.material.animation.AnimationUtils.LINEAR_INTERPOLATOR
            android.animation.TimeInterpolator r4 = com.google.android.material.motion.MotionUtils.resolveThemeInterpolator(r0, r4, r1)
            r3.captionFadeInAnimationInterpolator = r4
            int r4 = com.google.android.material.R.attr.motionEasingLinearInterpolator
            android.animation.TimeInterpolator r4 = com.google.android.material.motion.MotionUtils.resolveThemeInterpolator(r0, r4, r1)
            r3.captionFadeOutAnimationInterpolator = r4
            return
    }

    public static /* synthetic */ int access$002(com.google.android.material.textfield.IndicatorViewController r0, int r1) {
            r0.captionDisplayed = r1
            return r1
    }

    public static /* synthetic */ void access$102(com.google.android.material.textfield.IndicatorViewController r1) {
            r0 = 0
            r1.captionAnimator = r0
            return
    }

    public static /* synthetic */ android.widget.TextView access$200(com.google.android.material.textfield.IndicatorViewController r0) {
            android.widget.TextView r0 = r0.errorView
            return r0
    }

    public static /* synthetic */ com.google.android.material.textfield.TextInputLayout access$300(com.google.android.material.textfield.IndicatorViewController r0) {
            com.google.android.material.textfield.TextInputLayout r0 = r0.textInputView
            return r0
    }

    private boolean canAdjustIndicatorPadding() {
            r1 = this;
            android.widget.LinearLayout r0 = r1.indicatorArea
            if (r0 == 0) goto Le
            com.google.android.material.textfield.TextInputLayout r0 = r1.textInputView
            android.widget.EditText r0 = r0.getEditText()
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    private void createCaptionAnimators(@androidx.annotation.NonNull java.util.List<android.animation.Animator> r5, boolean r6, @androidx.annotation.Nullable android.widget.TextView r7, int r8, int r9, int r10) {
            r4 = this;
            if (r7 == 0) goto L3b
            if (r6 != 0) goto L5
            goto L3b
        L5:
            r6 = 0
            r0 = 1
            if (r8 == r10) goto Le
            if (r8 != r9) goto Lc
            goto Le
        Lc:
            r1 = 0
            goto Lf
        Le:
            r1 = 1
        Lf:
            if (r1 == 0) goto L3b
            if (r10 != r8) goto L15
            r1 = 1
            goto L16
        L15:
            r1 = 0
        L16:
            android.animation.ObjectAnimator r1 = r4.createCaptionOpacityAnimator(r7, r1)
            if (r8 != r10) goto L1f
            if (r9 == 0) goto L1f
            r6 = 1
        L1f:
            if (r6 == 0) goto L27
            int r6 = r4.captionFadeOutAnimationDuration
            long r2 = (long) r6
            r1.setStartDelay(r2)
        L27:
            r5.add(r1)
            if (r10 != r8) goto L3b
            if (r9 == 0) goto L3b
            android.animation.ObjectAnimator r6 = r4.createCaptionTranslationYAnimator(r7)
            int r7 = r4.captionFadeOutAnimationDuration
            long r7 = (long) r7
            r6.setStartDelay(r7)
            r5.add(r6)
        L3b:
            return
    }

    private android.animation.ObjectAnimator createCaptionOpacityAnimator(android.widget.TextView r5, boolean r6) {
            r4 = this;
            if (r6 == 0) goto L5
            r0 = 1065353216(0x3f800000, float:1.0)
            goto L6
        L5:
            r0 = 0
        L6:
            android.util.Property r1 = android.view.View.ALPHA
            r2 = 1
            float[] r2 = new float[r2]
            r3 = 0
            r2[r3] = r0
            android.animation.ObjectAnimator r5 = android.animation.ObjectAnimator.ofFloat(r5, r1, r2)
            if (r6 == 0) goto L17
            int r0 = r4.captionFadeInAnimationDuration
            goto L19
        L17:
            int r0 = r4.captionFadeOutAnimationDuration
        L19:
            long r0 = (long) r0
            r5.setDuration(r0)
            if (r6 == 0) goto L22
            android.animation.TimeInterpolator r6 = r4.captionFadeInAnimationInterpolator
            goto L24
        L22:
            android.animation.TimeInterpolator r6 = r4.captionFadeOutAnimationInterpolator
        L24:
            r5.setInterpolator(r6)
            return r5
    }

    private android.animation.ObjectAnimator createCaptionTranslationYAnimator(android.widget.TextView r5) {
            r4 = this;
            android.util.Property r0 = android.view.View.TRANSLATION_Y
            r1 = 2
            float[] r1 = new float[r1]
            float r2 = r4.captionTranslationYPx
            float r2 = -r2
            r3 = 0
            r1[r3] = r2
            r2 = 1
            r3 = 0
            r1[r2] = r3
            android.animation.ObjectAnimator r5 = android.animation.ObjectAnimator.ofFloat(r5, r0, r1)
            int r0 = r4.captionTranslationYAnimationDuration
            long r0 = (long) r0
            r5.setDuration(r0)
            android.animation.TimeInterpolator r0 = r4.captionTranslationYAnimationInterpolator
            r5.setInterpolator(r0)
            return r5
    }

    @androidx.annotation.Nullable
    private android.widget.TextView getCaptionViewFromDisplayState(int r2) {
            r1 = this;
            r0 = 1
            if (r2 == r0) goto Lb
            r0 = 2
            if (r2 == r0) goto L8
            r2 = 0
            return r2
        L8:
            android.widget.TextView r2 = r1.helperTextView
            return r2
        Lb:
            android.widget.TextView r2 = r1.errorView
            return r2
    }

    private int getIndicatorPadding(boolean r1, @androidx.annotation.DimenRes int r2, int r3) {
            r0 = this;
            if (r1 == 0) goto Lc
            android.content.Context r1 = r0.context
            android.content.res.Resources r1 = r1.getResources()
            int r3 = r1.getDimensionPixelSize(r2)
        Lc:
            return r3
    }

    private boolean isCaptionStateError(int r2) {
            r1 = this;
            r0 = 1
            if (r2 != r0) goto L10
            android.widget.TextView r2 = r1.errorView
            if (r2 == 0) goto L10
            java.lang.CharSequence r2 = r1.errorText
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L10
            goto L11
        L10:
            r0 = 0
        L11:
            return r0
    }

    private boolean isCaptionStateHelperText(int r2) {
            r1 = this;
            r0 = 2
            if (r2 != r0) goto L11
            android.widget.TextView r2 = r1.helperTextView
            if (r2 == 0) goto L11
            java.lang.CharSequence r2 = r1.helperText
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L11
            r2 = 1
            goto L12
        L11:
            r2 = 0
        L12:
            return r2
    }

    private void setCaptionViewVisibilities(int r3, int r4) {
            r2 = this;
            if (r3 != r4) goto L3
            return
        L3:
            if (r4 == 0) goto L14
            android.widget.TextView r0 = r2.getCaptionViewFromDisplayState(r4)
            if (r0 == 0) goto L14
            r1 = 0
            r0.setVisibility(r1)
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.setAlpha(r1)
        L14:
            if (r3 == 0) goto L27
            android.widget.TextView r0 = r2.getCaptionViewFromDisplayState(r3)
            if (r0 == 0) goto L27
            r1 = 4
            r0.setVisibility(r1)
            r1 = 1
            if (r3 != r1) goto L27
            r3 = 0
            r0.setText(r3)
        L27:
            r2.captionDisplayed = r4
            return
    }

    private void setTextViewTypeface(@androidx.annotation.Nullable android.widget.TextView r1, android.graphics.Typeface r2) {
            r0 = this;
            if (r1 == 0) goto L5
            r1.setTypeface(r2)
        L5:
            return
    }

    private void setViewGroupGoneIfEmpty(@androidx.annotation.NonNull android.view.ViewGroup r1, int r2) {
            r0 = this;
            if (r2 != 0) goto L7
            r2 = 8
            r1.setVisibility(r2)
        L7:
            return
    }

    private boolean shouldAnimateCaptionView(@androidx.annotation.Nullable android.widget.TextView r3, @androidx.annotation.NonNull java.lang.CharSequence r4) {
            r2 = this;
            com.google.android.material.textfield.TextInputLayout r0 = r2.textInputView
            boolean r0 = androidx.core.view.ViewCompat.isLaidOut(r0)
            if (r0 == 0) goto L24
            com.google.android.material.textfield.TextInputLayout r0 = r2.textInputView
            boolean r0 = r0.isEnabled()
            if (r0 == 0) goto L24
            int r0 = r2.captionToShow
            int r1 = r2.captionDisplayed
            if (r0 != r1) goto L22
            if (r3 == 0) goto L22
            java.lang.CharSequence r3 = r3.getText()
            boolean r3 = android.text.TextUtils.equals(r3, r4)
            if (r3 != 0) goto L24
        L22:
            r3 = 1
            goto L25
        L24:
            r3 = 0
        L25:
            return r3
    }

    private void updateCaptionViewsVisibility(int r14, int r15, boolean r16) {
            r13 = this;
            r7 = r13
            r8 = r15
            r9 = r14
            r10 = r16
            if (r9 != r8) goto L8
            return
        L8:
            if (r10 == 0) goto L45
            android.animation.AnimatorSet r11 = new android.animation.AnimatorSet
            r11.<init>()
            r7.captionAnimator = r11
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            boolean r2 = r7.helperTextEnabled
            android.widget.TextView r3 = r7.helperTextView
            r4 = 2
            r0 = r13
            r1 = r12
            r5 = r14
            r6 = r15
            r0.createCaptionAnimators(r1, r2, r3, r4, r5, r6)
            boolean r2 = r7.errorEnabled
            android.widget.TextView r3 = r7.errorView
            r4 = 1
            r0.createCaptionAnimators(r1, r2, r3, r4, r5, r6)
            com.google.android.material.animation.AnimatorSetCompat.playTogether(r11, r12)
            android.widget.TextView r3 = r13.getCaptionViewFromDisplayState(r14)
            android.widget.TextView r5 = r13.getCaptionViewFromDisplayState(r15)
            com.google.android.material.textfield.IndicatorViewController$1 r6 = new com.google.android.material.textfield.IndicatorViewController$1
            r0 = r6
            r1 = r13
            r2 = r15
            r4 = r14
            r0.<init>(r1, r2, r3, r4, r5)
            r11.addListener(r6)
            r11.start()
            goto L48
        L45:
            r13.setCaptionViewVisibilities(r14, r15)
        L48:
            com.google.android.material.textfield.TextInputLayout r0 = r7.textInputView
            r0.updateEditTextBackground()
            com.google.android.material.textfield.TextInputLayout r0 = r7.textInputView
            r0.updateLabelState(r10)
            com.google.android.material.textfield.TextInputLayout r0 = r7.textInputView
            r0.updateTextInputBoxState()
            return
    }

    public final void addIndicator(android.widget.TextView r6, int r7) {
            r5 = this;
            android.widget.LinearLayout r0 = r5.indicatorArea
            r1 = -2
            r2 = 0
            if (r0 != 0) goto L40
            android.widget.FrameLayout r0 = r5.captionArea
            if (r0 != 0) goto L40
            android.widget.LinearLayout r0 = new android.widget.LinearLayout
            android.content.Context r3 = r5.context
            r0.<init>(r3)
            r5.indicatorArea = r0
            r0.setOrientation(r2)
            com.google.android.material.textfield.TextInputLayout r0 = r5.textInputView
            android.widget.LinearLayout r3 = r5.indicatorArea
            r4 = -1
            r0.addView(r3, r4, r1)
            android.widget.FrameLayout r0 = new android.widget.FrameLayout
            android.content.Context r3 = r5.context
            r0.<init>(r3)
            r5.captionArea = r0
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r3 = 1065353216(0x3f800000, float:1.0)
            r0.<init>(r2, r1, r3)
            android.widget.LinearLayout r3 = r5.indicatorArea
            android.widget.FrameLayout r4 = r5.captionArea
            r3.addView(r4, r0)
            com.google.android.material.textfield.TextInputLayout r0 = r5.textInputView
            android.widget.EditText r0 = r0.getEditText()
            if (r0 == 0) goto L40
            r5.adjustIndicatorPadding()
        L40:
            r0 = 1
            if (r7 == 0) goto L48
            if (r7 != r0) goto L46
            goto L48
        L46:
            r7 = 0
            goto L49
        L48:
            r7 = 1
        L49:
            if (r7 == 0) goto L56
            android.widget.FrameLayout r7 = r5.captionArea
            r7.setVisibility(r2)
            android.widget.FrameLayout r7 = r5.captionArea
            r7.addView(r6)
            goto L60
        L56:
            android.widget.LinearLayout$LayoutParams r7 = new android.widget.LinearLayout$LayoutParams
            r7.<init>(r1, r1)
            android.widget.LinearLayout r1 = r5.indicatorArea
            r1.addView(r6, r7)
        L60:
            android.widget.LinearLayout r6 = r5.indicatorArea
            r6.setVisibility(r2)
            int r6 = r5.indicatorsAdded
            int r6 = r6 + r0
            r5.indicatorsAdded = r6
            return
    }

    public final void adjustIndicatorPadding() {
            r8 = this;
            boolean r0 = r8.canAdjustIndicatorPadding()
            if (r0 == 0) goto L3c
            com.google.android.material.textfield.TextInputLayout r0 = r8.textInputView
            android.widget.EditText r0 = r0.getEditText()
            android.content.Context r1 = r8.context
            boolean r1 = com.google.android.material.resources.MaterialResources.isFontScaleAtLeast1_3(r1)
            android.widget.LinearLayout r2 = r8.indicatorArea
            int r3 = com.google.android.material.R.dimen.material_helper_text_font_1_3_padding_horizontal
            int r4 = androidx.core.view.ViewCompat.getPaddingStart(r0)
            int r4 = r8.getIndicatorPadding(r1, r3, r4)
            int r5 = com.google.android.material.R.dimen.material_helper_text_font_1_3_padding_top
            android.content.Context r6 = r8.context
            android.content.res.Resources r6 = r6.getResources()
            int r7 = com.google.android.material.R.dimen.material_helper_text_default_padding_top
            int r6 = r6.getDimensionPixelSize(r7)
            int r5 = r8.getIndicatorPadding(r1, r5, r6)
            int r0 = androidx.core.view.ViewCompat.getPaddingEnd(r0)
            int r0 = r8.getIndicatorPadding(r1, r3, r0)
            r1 = 0
            androidx.core.view.ViewCompat.setPaddingRelative(r2, r4, r5, r0, r1)
        L3c:
            return
    }

    public final void cancelCaptionAnimator() {
            r1 = this;
            android.animation.Animator r0 = r1.captionAnimator
            if (r0 == 0) goto L7
            r0.cancel()
        L7:
            return
    }

    public final boolean errorShouldBeShown() {
            r1 = this;
            int r0 = r1.captionToShow
            boolean r0 = r1.isCaptionStateError(r0)
            return r0
    }

    public final int getErrorAccessibilityLiveRegion() {
            r1 = this;
            int r0 = r1.errorViewAccessibilityLiveRegion
            return r0
    }

    @androidx.annotation.Nullable
    public final java.lang.CharSequence getErrorContentDescription() {
            r1 = this;
            java.lang.CharSequence r0 = r1.errorViewContentDescription
            return r0
    }

    @androidx.annotation.Nullable
    public final java.lang.CharSequence getErrorText() {
            r1 = this;
            java.lang.CharSequence r0 = r1.errorText
            return r0
    }

    @androidx.annotation.ColorInt
    public final int getErrorViewCurrentTextColor() {
            r1 = this;
            android.widget.TextView r0 = r1.errorView
            if (r0 == 0) goto L9
            int r0 = r0.getCurrentTextColor()
            goto La
        L9:
            r0 = -1
        La:
            return r0
    }

    @androidx.annotation.Nullable
    public final android.content.res.ColorStateList getErrorViewTextColors() {
            r1 = this;
            android.widget.TextView r0 = r1.errorView
            if (r0 == 0) goto L9
            android.content.res.ColorStateList r0 = r0.getTextColors()
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    public final java.lang.CharSequence getHelperText() {
            r1 = this;
            java.lang.CharSequence r0 = r1.helperText
            return r0
    }

    @androidx.annotation.Nullable
    public final android.view.View getHelperTextView() {
            r1 = this;
            android.widget.TextView r0 = r1.helperTextView
            return r0
    }

    @androidx.annotation.ColorInt
    public final int getHelperTextViewCurrentTextColor() {
            r1 = this;
            android.widget.TextView r0 = r1.helperTextView
            if (r0 == 0) goto L9
            int r0 = r0.getCurrentTextColor()
            goto La
        L9:
            r0 = -1
        La:
            return r0
    }

    public final void hideError() {
            r4 = this;
            r0 = 0
            r4.errorText = r0
            r4.cancelCaptionAnimator()
            int r0 = r4.captionDisplayed
            r1 = 1
            if (r0 != r1) goto L1e
            boolean r0 = r4.helperTextEnabled
            if (r0 == 0) goto L1b
            java.lang.CharSequence r0 = r4.helperText
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L1b
            r0 = 2
            r4.captionToShow = r0
            goto L1e
        L1b:
            r0 = 0
            r4.captionToShow = r0
        L1e:
            int r0 = r4.captionDisplayed
            int r1 = r4.captionToShow
            android.widget.TextView r2 = r4.errorView
            java.lang.String r3 = ""
            boolean r2 = r4.shouldAnimateCaptionView(r2, r3)
            r4.updateCaptionViewsVisibility(r0, r1, r2)
            return
    }

    public final boolean isErrorEnabled() {
            r1 = this;
            boolean r0 = r1.errorEnabled
            return r0
    }

    public final boolean isHelperTextEnabled() {
            r1 = this;
            boolean r0 = r1.helperTextEnabled
            return r0
    }

    public final void removeIndicator(android.widget.TextView r3, int r4) {
            r2 = this;
            android.widget.LinearLayout r0 = r2.indicatorArea
            if (r0 != 0) goto L5
            return
        L5:
            r1 = 1
            if (r4 == 0) goto Ld
            if (r4 != r1) goto Lb
            goto Ld
        Lb:
            r4 = 0
            goto Le
        Ld:
            r4 = 1
        Le:
            if (r4 == 0) goto L18
            android.widget.FrameLayout r4 = r2.captionArea
            if (r4 == 0) goto L18
            r4.removeView(r3)
            goto L1b
        L18:
            r0.removeView(r3)
        L1b:
            int r3 = r2.indicatorsAdded
            int r3 = r3 - r1
            r2.indicatorsAdded = r3
            android.widget.LinearLayout r4 = r2.indicatorArea
            r2.setViewGroupGoneIfEmpty(r4, r3)
            return
    }

    public final void setErrorAccessibilityLiveRegion(int r2) {
            r1 = this;
            r1.errorViewAccessibilityLiveRegion = r2
            android.widget.TextView r0 = r1.errorView
            if (r0 == 0) goto L9
            androidx.core.view.ViewCompat.setAccessibilityLiveRegion(r0, r2)
        L9:
            return
    }

    public final void setErrorContentDescription(@androidx.annotation.Nullable java.lang.CharSequence r2) {
            r1 = this;
            r1.errorViewContentDescription = r2
            android.widget.TextView r0 = r1.errorView
            if (r0 == 0) goto L9
            r0.setContentDescription(r2)
        L9:
            return
    }

    public final void setErrorEnabled(boolean r5) {
            r4 = this;
            boolean r0 = r4.errorEnabled
            if (r0 != r5) goto L5
            return
        L5:
            r4.cancelCaptionAnimator()
            r0 = 0
            if (r5 == 0) goto L64
            androidx.appcompat.widget.AppCompatTextView r1 = new androidx.appcompat.widget.AppCompatTextView
            android.content.Context r2 = r4.context
            r1.<init>(r2)
            r4.errorView = r1
            int r2 = com.google.android.material.R.id.textinput_error
            r1.setId(r2)
            android.widget.TextView r1 = r4.errorView
            r2 = 5
            r1.setTextAlignment(r2)
            android.graphics.Typeface r1 = r4.typeface
            if (r1 == 0) goto L28
            android.widget.TextView r2 = r4.errorView
            r2.setTypeface(r1)
        L28:
            int r1 = r4.errorTextAppearance
            r4.errorTextAppearance = r1
            android.widget.TextView r2 = r4.errorView
            if (r2 == 0) goto L35
            com.google.android.material.textfield.TextInputLayout r3 = r4.textInputView
            r3.setTextAppearanceCompatWithErrorFallback(r2, r1)
        L35:
            android.content.res.ColorStateList r1 = r4.errorViewTextColor
            r4.errorViewTextColor = r1
            android.widget.TextView r2 = r4.errorView
            if (r2 == 0) goto L42
            if (r1 == 0) goto L42
            r2.setTextColor(r1)
        L42:
            java.lang.CharSequence r1 = r4.errorViewContentDescription
            r4.errorViewContentDescription = r1
            android.widget.TextView r2 = r4.errorView
            if (r2 == 0) goto L4d
            r2.setContentDescription(r1)
        L4d:
            int r1 = r4.errorViewAccessibilityLiveRegion
            r4.errorViewAccessibilityLiveRegion = r1
            android.widget.TextView r2 = r4.errorView
            if (r2 == 0) goto L58
            androidx.core.view.ViewCompat.setAccessibilityLiveRegion(r2, r1)
        L58:
            android.widget.TextView r1 = r4.errorView
            r2 = 4
            r1.setVisibility(r2)
            android.widget.TextView r1 = r4.errorView
            r4.addIndicator(r1, r0)
            goto L79
        L64:
            r4.hideError()
            android.widget.TextView r1 = r4.errorView
            r4.removeIndicator(r1, r0)
            r0 = 0
            r4.errorView = r0
            com.google.android.material.textfield.TextInputLayout r0 = r4.textInputView
            r0.updateEditTextBackground()
            com.google.android.material.textfield.TextInputLayout r0 = r4.textInputView
            r0.updateTextInputBoxState()
        L79:
            r4.errorEnabled = r5
            return
    }

    public final void setErrorTextAppearance(@androidx.annotation.StyleRes int r3) {
            r2 = this;
            r2.errorTextAppearance = r3
            android.widget.TextView r0 = r2.errorView
            if (r0 == 0) goto Lb
            com.google.android.material.textfield.TextInputLayout r1 = r2.textInputView
            r1.setTextAppearanceCompatWithErrorFallback(r0, r3)
        Lb:
            return
    }

    public final void setErrorViewTextColor(@androidx.annotation.Nullable android.content.res.ColorStateList r2) {
            r1 = this;
            r1.errorViewTextColor = r2
            android.widget.TextView r0 = r1.errorView
            if (r0 == 0) goto Lb
            if (r2 == 0) goto Lb
            r0.setTextColor(r2)
        Lb:
            return
    }

    public final void setHelperTextAppearance(@androidx.annotation.StyleRes int r2) {
            r1 = this;
            r1.helperTextTextAppearance = r2
            android.widget.TextView r0 = r1.helperTextView
            if (r0 == 0) goto L9
            androidx.core.widget.TextViewCompat.setTextAppearance(r0, r2)
        L9:
            return
    }

    public final void setHelperTextEnabled(boolean r6) {
            r5 = this;
            boolean r0 = r5.helperTextEnabled
            if (r0 != r6) goto L5
            return
        L5:
            r5.cancelCaptionAnimator()
            r0 = 1
            if (r6 == 0) goto L5b
            androidx.appcompat.widget.AppCompatTextView r1 = new androidx.appcompat.widget.AppCompatTextView
            android.content.Context r2 = r5.context
            r1.<init>(r2)
            r5.helperTextView = r1
            int r2 = com.google.android.material.R.id.textinput_helper_text
            r1.setId(r2)
            android.widget.TextView r1 = r5.helperTextView
            r2 = 5
            r1.setTextAlignment(r2)
            android.graphics.Typeface r1 = r5.typeface
            if (r1 == 0) goto L28
            android.widget.TextView r2 = r5.helperTextView
            r2.setTypeface(r1)
        L28:
            android.widget.TextView r1 = r5.helperTextView
            r2 = 4
            r1.setVisibility(r2)
            android.widget.TextView r1 = r5.helperTextView
            androidx.core.view.ViewCompat.setAccessibilityLiveRegion(r1, r0)
            int r1 = r5.helperTextTextAppearance
            r5.helperTextTextAppearance = r1
            android.widget.TextView r2 = r5.helperTextView
            if (r2 == 0) goto L3e
            androidx.core.widget.TextViewCompat.setTextAppearance(r2, r1)
        L3e:
            android.content.res.ColorStateList r1 = r5.helperTextViewTextColor
            r5.helperTextViewTextColor = r1
            android.widget.TextView r2 = r5.helperTextView
            if (r2 == 0) goto L4b
            if (r1 == 0) goto L4b
            r2.setTextColor(r1)
        L4b:
            android.widget.TextView r1 = r5.helperTextView
            r5.addIndicator(r1, r0)
            android.widget.TextView r0 = r5.helperTextView
            com.google.android.material.textfield.IndicatorViewController$2 r1 = new com.google.android.material.textfield.IndicatorViewController$2
            r1.<init>(r5)
            r0.setAccessibilityDelegate(r1)
            goto L85
        L5b:
            r5.cancelCaptionAnimator()
            int r1 = r5.captionDisplayed
            r2 = 2
            if (r1 != r2) goto L66
            r2 = 0
            r5.captionToShow = r2
        L66:
            int r2 = r5.captionToShow
            android.widget.TextView r3 = r5.helperTextView
            java.lang.String r4 = ""
            boolean r3 = r5.shouldAnimateCaptionView(r3, r4)
            r5.updateCaptionViewsVisibility(r1, r2, r3)
            android.widget.TextView r1 = r5.helperTextView
            r5.removeIndicator(r1, r0)
            r0 = 0
            r5.helperTextView = r0
            com.google.android.material.textfield.TextInputLayout r0 = r5.textInputView
            r0.updateEditTextBackground()
            com.google.android.material.textfield.TextInputLayout r0 = r5.textInputView
            r0.updateTextInputBoxState()
        L85:
            r5.helperTextEnabled = r6
            return
    }

    public final void setHelperTextViewTextColor(@androidx.annotation.Nullable android.content.res.ColorStateList r2) {
            r1 = this;
            r1.helperTextViewTextColor = r2
            android.widget.TextView r0 = r1.helperTextView
            if (r0 == 0) goto Lb
            if (r2 == 0) goto Lb
            r0.setTextColor(r2)
        Lb:
            return
    }

    public final void setTypefaces(android.graphics.Typeface r2) {
            r1 = this;
            android.graphics.Typeface r0 = r1.typeface
            if (r2 == r0) goto L10
            r1.typeface = r2
            android.widget.TextView r0 = r1.errorView
            r1.setTextViewTypeface(r0, r2)
            android.widget.TextView r0 = r1.helperTextView
            r1.setTextViewTypeface(r0, r2)
        L10:
            return
    }

    public final void showError(java.lang.CharSequence r4) {
            r3 = this;
            r3.cancelCaptionAnimator()
            r3.errorText = r4
            android.widget.TextView r0 = r3.errorView
            r0.setText(r4)
            int r0 = r3.captionDisplayed
            r1 = 1
            if (r0 == r1) goto L11
            r3.captionToShow = r1
        L11:
            int r1 = r3.captionToShow
            android.widget.TextView r2 = r3.errorView
            boolean r4 = r3.shouldAnimateCaptionView(r2, r4)
            r3.updateCaptionViewsVisibility(r0, r1, r4)
            return
    }

    public final void showHelper(java.lang.CharSequence r4) {
            r3 = this;
            r3.cancelCaptionAnimator()
            r3.helperText = r4
            android.widget.TextView r0 = r3.helperTextView
            r0.setText(r4)
            int r0 = r3.captionDisplayed
            r1 = 2
            if (r0 == r1) goto L11
            r3.captionToShow = r1
        L11:
            int r1 = r3.captionToShow
            android.widget.TextView r2 = r3.helperTextView
            boolean r4 = r3.shouldAnimateCaptionView(r2, r4)
            r3.updateCaptionViewsVisibility(r0, r1, r4)
            return
    }
}
