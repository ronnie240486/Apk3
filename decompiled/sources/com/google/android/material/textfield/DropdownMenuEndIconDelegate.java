package com.google.android.material.textfield;

/* JADX INFO: loaded from: classes2.dex */
class DropdownMenuEndIconDelegate extends com.google.android.material.textfield.EndIconDelegate {
    private static final int DEFAULT_ANIMATION_FADE_IN_DURATION = 67;
    private static final int DEFAULT_ANIMATION_FADE_OUT_DURATION = 50;

    @androidx.annotation.ChecksSdkIntAtLeast(api = 21)
    private static final boolean IS_LOLLIPOP = false;

    @androidx.annotation.Nullable
    private android.view.accessibility.AccessibilityManager accessibilityManager;
    private final int animationFadeInDuration;

    @androidx.annotation.NonNull
    private final android.animation.TimeInterpolator animationFadeInterpolator;
    private final int animationFadeOutDuration;

    @androidx.annotation.Nullable
    private android.widget.AutoCompleteTextView autoCompleteTextView;
    private long dropdownPopupActivatedAt;
    private boolean dropdownPopupDirty;
    private boolean editTextHasFocus;
    private android.animation.ValueAnimator fadeInAnim;
    private android.animation.ValueAnimator fadeOutAnim;
    private boolean isEndIconChecked;
    private final android.view.View.OnFocusChangeListener onEditTextFocusChangeListener;
    private final android.view.View.OnClickListener onIconClickListener;
    private final androidx.core.view.accessibility.AccessibilityManagerCompat.TouchExplorationStateChangeListener touchExplorationStateChangeListener;


    public static /* synthetic */ void $r8$lambda$4SBpO57tjhDSopV0DemkySdxojY(com.google.android.material.textfield.DropdownMenuEndIconDelegate r0, android.animation.ValueAnimator r1) {
            r0.lambda$getAlphaAnimator$6(r1)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$BqmxB1OD2-UBtyLLYrjkb1pVKko, reason: not valid java name */
    public static /* synthetic */ boolean m293$r8$lambda$BqmxB1OD2UBtyLLYrjkb1pVKko(com.google.android.material.textfield.DropdownMenuEndIconDelegate r0, android.view.View r1, android.view.MotionEvent r2) {
            boolean r0 = r0.lambda$setUpDropdownShowHideBehavior$4(r1, r2)
            return r0
    }

    public static /* synthetic */ void $r8$lambda$CCm9KkEwkNKH7i3YuOdE94QyO7w(com.google.android.material.textfield.DropdownMenuEndIconDelegate r0, boolean r1) {
            r0.lambda$new$2(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$GC4Z4aSLx1o4GNefaOGyXn6tdak(com.google.android.material.textfield.DropdownMenuEndIconDelegate r0, android.view.View r1) {
            r0.lambda$new$0(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$Gy89nJjcMrMnAKlMjFZkWRzwff0(com.google.android.material.textfield.DropdownMenuEndIconDelegate r0) {
            r0.lambda$setUpDropdownShowHideBehavior$5()
            return
    }

    public static /* synthetic */ void $r8$lambda$az2bGAstjYQVJ0xTZU5to9JFwf8(com.google.android.material.textfield.DropdownMenuEndIconDelegate r0) {
            r0.lambda$afterEditTextChanged$3()
            return
    }

    public static /* synthetic */ void $r8$lambda$s0Go8aDJW6wdKEyjtVLy3FzDAsw(com.google.android.material.textfield.DropdownMenuEndIconDelegate r0, android.view.View r1, boolean r2) {
            r0.lambda$new$1(r1, r2)
            return
    }

    static {
            r0 = 1
            com.google.android.material.textfield.DropdownMenuEndIconDelegate.IS_LOLLIPOP = r0
            return
    }

    public DropdownMenuEndIconDelegate(@androidx.annotation.NonNull com.google.android.material.textfield.EndCompoundLayout r4) {
            r3 = this;
            r3.<init>(r4)
            com.google.android.material.textfield.ClearTextEndIconDelegate$$ExternalSyntheticLambda1 r0 = new com.google.android.material.textfield.ClearTextEndIconDelegate$$ExternalSyntheticLambda1
            r1 = 1
            r0.<init>(r3, r1)
            r3.onIconClickListener = r0
            com.google.android.material.textfield.ClearTextEndIconDelegate$$ExternalSyntheticLambda2 r0 = new com.google.android.material.textfield.ClearTextEndIconDelegate$$ExternalSyntheticLambda2
            r0.<init>(r3, r1)
            r3.onEditTextFocusChangeListener = r0
            com.google.android.material.textfield.DropdownMenuEndIconDelegate$$ExternalSyntheticLambda2 r0 = new com.google.android.material.textfield.DropdownMenuEndIconDelegate$$ExternalSyntheticLambda2
            r0.<init>(r3)
            r3.touchExplorationStateChangeListener = r0
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r3.dropdownPopupActivatedAt = r0
            android.content.Context r0 = r4.getContext()
            int r1 = com.google.android.material.R.attr.motionDurationShort3
            r2 = 67
            int r0 = com.google.android.material.motion.MotionUtils.resolveThemeDuration(r0, r1, r2)
            r3.animationFadeInDuration = r0
            android.content.Context r0 = r4.getContext()
            r2 = 50
            int r0 = com.google.android.material.motion.MotionUtils.resolveThemeDuration(r0, r1, r2)
            r3.animationFadeOutDuration = r0
            android.content.Context r4 = r4.getContext()
            int r0 = com.google.android.material.R.attr.motionEasingLinearInterpolator
            android.animation.TimeInterpolator r1 = com.google.android.material.animation.AnimationUtils.LINEAR_INTERPOLATOR
            android.animation.TimeInterpolator r4 = com.google.android.material.motion.MotionUtils.resolveThemeInterpolator(r4, r0, r1)
            r3.animationFadeInterpolator = r4
            return
    }

    public static /* synthetic */ android.animation.ValueAnimator access$000(com.google.android.material.textfield.DropdownMenuEndIconDelegate r0) {
            android.animation.ValueAnimator r0 = r0.fadeInAnim
            return r0
    }

    @androidx.annotation.NonNull
    private static android.widget.AutoCompleteTextView castAutoCompleteTextViewOrThrow(android.widget.EditText r1) {
            boolean r0 = r1 instanceof android.widget.AutoCompleteTextView
            if (r0 == 0) goto L7
            android.widget.AutoCompleteTextView r1 = (android.widget.AutoCompleteTextView) r1
            return r1
        L7:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r0 = "EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used."
            r1.<init>(r0)
            throw r1
    }

    private android.animation.ValueAnimator getAlphaAnimator(int r3, float... r4) {
            r2 = this;
            android.animation.ValueAnimator r4 = android.animation.ValueAnimator.ofFloat(r4)
            android.animation.TimeInterpolator r0 = r2.animationFadeInterpolator
            r4.setInterpolator(r0)
            long r0 = (long) r3
            r4.setDuration(r0)
            com.google.android.material.textfield.ClearTextEndIconDelegate$$ExternalSyntheticLambda0 r3 = new com.google.android.material.textfield.ClearTextEndIconDelegate$$ExternalSyntheticLambda0
            r0 = 2
            r3.<init>(r2, r0)
            r4.addUpdateListener(r3)
            return r4
    }

    private void initAnimators() {
            r3 = this;
            int r0 = r3.animationFadeInDuration
            r1 = 2
            float[] r2 = new float[r1]
            r2 = {x0024: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
            android.animation.ValueAnimator r0 = r3.getAlphaAnimator(r0, r2)
            r3.fadeInAnim = r0
            int r0 = r3.animationFadeOutDuration
            float[] r1 = new float[r1]
            r1 = {x002c: FILL_ARRAY_DATA , data: [1065353216, 0} // fill-array
            android.animation.ValueAnimator r0 = r3.getAlphaAnimator(r0, r1)
            r3.fadeOutAnim = r0
            com.google.android.material.textfield.DropdownMenuEndIconDelegate$1 r1 = new com.google.android.material.textfield.DropdownMenuEndIconDelegate$1
            r1.<init>(r3)
            r0.addListener(r1)
            return
    }

    private boolean isDropdownPopupActive() {
            r5 = this;
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = r5.dropdownPopupActivatedAt
            long r0 = r0 - r2
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L16
            r2 = 300(0x12c, double:1.48E-321)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L14
            goto L16
        L14:
            r0 = 0
            goto L17
        L16:
            r0 = 1
        L17:
            return r0
    }

    private /* synthetic */ void lambda$afterEditTextChanged$3() {
            r1 = this;
            android.widget.AutoCompleteTextView r0 = r1.autoCompleteTextView
            boolean r0 = r0.isPopupShowing()
            r1.setEndIconChecked(r0)
            r1.dropdownPopupDirty = r0
            return
    }

    private /* synthetic */ void lambda$getAlphaAnimator$6(android.animation.ValueAnimator r2) {
            r1 = this;
            java.lang.Object r2 = r2.getAnimatedValue()
            java.lang.Float r2 = (java.lang.Float) r2
            float r2 = r2.floatValue()
            com.google.android.material.internal.CheckableImageButton r0 = r1.endIconView
            r0.setAlpha(r2)
            return
    }

    private /* synthetic */ void lambda$new$0(android.view.View r1) {
            r0 = this;
            r0.showHideDropdown()
            return
    }

    private /* synthetic */ void lambda$new$1(android.view.View r1, boolean r2) {
            r0 = this;
            r0.editTextHasFocus = r2
            r0.refreshIconState()
            if (r2 != 0) goto Ld
            r1 = 0
            r0.setEndIconChecked(r1)
            r0.dropdownPopupDirty = r1
        Ld:
            return
    }

    private /* synthetic */ void lambda$new$2(boolean r2) {
            r1 = this;
            android.widget.AutoCompleteTextView r0 = r1.autoCompleteTextView
            if (r0 == 0) goto L14
            boolean r0 = com.google.android.material.textfield.EditTextUtils.isEditable(r0)
            if (r0 != 0) goto L14
            com.google.android.material.internal.CheckableImageButton r0 = r1.endIconView
            if (r2 == 0) goto L10
            r2 = 2
            goto L11
        L10:
            r2 = 1
        L11:
            androidx.core.view.ViewCompat.setImportantForAccessibility(r0, r2)
        L14:
            return
    }

    private /* synthetic */ boolean lambda$setUpDropdownShowHideBehavior$4(android.view.View r2, android.view.MotionEvent r3) {
            r1 = this;
            int r2 = r3.getAction()
            r3 = 0
            r0 = 1
            if (r2 != r0) goto L16
            boolean r2 = r1.isDropdownPopupActive()
            if (r2 == 0) goto L10
            r1.dropdownPopupDirty = r3
        L10:
            r1.showHideDropdown()
            r1.updateDropdownPopupDirty()
        L16:
            return r3
    }

    private /* synthetic */ void lambda$setUpDropdownShowHideBehavior$5() {
            r1 = this;
            r1.updateDropdownPopupDirty()
            r0 = 0
            r1.setEndIconChecked(r0)
            return
    }

    private void setEndIconChecked(boolean r2) {
            r1 = this;
            boolean r0 = r1.isEndIconChecked
            if (r0 == r2) goto L10
            r1.isEndIconChecked = r2
            android.animation.ValueAnimator r2 = r1.fadeInAnim
            r2.cancel()
            android.animation.ValueAnimator r2 = r1.fadeOutAnim
            r2.start()
        L10:
            return
    }

    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    private void setUpDropdownShowHideBehavior() {
            r2 = this;
            android.widget.AutoCompleteTextView r0 = r2.autoCompleteTextView
            com.google.android.material.textfield.DropdownMenuEndIconDelegate$$ExternalSyntheticLambda0 r1 = new com.google.android.material.textfield.DropdownMenuEndIconDelegate$$ExternalSyntheticLambda0
            r1.<init>(r2)
            r0.setOnTouchListener(r1)
            boolean r0 = com.google.android.material.textfield.DropdownMenuEndIconDelegate.IS_LOLLIPOP
            if (r0 == 0) goto L18
            android.widget.AutoCompleteTextView r0 = r2.autoCompleteTextView
            com.google.android.material.textfield.DropdownMenuEndIconDelegate$$ExternalSyntheticLambda1 r1 = new com.google.android.material.textfield.DropdownMenuEndIconDelegate$$ExternalSyntheticLambda1
            r1.<init>(r2)
            r0.setOnDismissListener(r1)
        L18:
            android.widget.AutoCompleteTextView r0 = r2.autoCompleteTextView
            r1 = 0
            r0.setThreshold(r1)
            return
    }

    private void showHideDropdown() {
            r2 = this;
            android.widget.AutoCompleteTextView r0 = r2.autoCompleteTextView
            if (r0 != 0) goto L5
            return
        L5:
            boolean r0 = r2.isDropdownPopupActive()
            r1 = 0
            if (r0 == 0) goto Le
            r2.dropdownPopupDirty = r1
        Le:
            boolean r0 = r2.dropdownPopupDirty
            if (r0 != 0) goto L3c
            boolean r0 = com.google.android.material.textfield.DropdownMenuEndIconDelegate.IS_LOLLIPOP
            if (r0 == 0) goto L1e
            boolean r0 = r2.isEndIconChecked
            r0 = r0 ^ 1
            r2.setEndIconChecked(r0)
            goto L27
        L1e:
            boolean r0 = r2.isEndIconChecked
            r0 = r0 ^ 1
            r2.isEndIconChecked = r0
            r2.refreshIconState()
        L27:
            boolean r0 = r2.isEndIconChecked
            if (r0 == 0) goto L36
            android.widget.AutoCompleteTextView r0 = r2.autoCompleteTextView
            r0.requestFocus()
            android.widget.AutoCompleteTextView r0 = r2.autoCompleteTextView
            r0.showDropDown()
            goto L3e
        L36:
            android.widget.AutoCompleteTextView r0 = r2.autoCompleteTextView
            r0.dismissDropDown()
            goto L3e
        L3c:
            r2.dropdownPopupDirty = r1
        L3e:
            return
    }

    private void updateDropdownPopupDirty() {
            r2 = this;
            r0 = 1
            r2.dropdownPopupDirty = r0
            long r0 = java.lang.System.currentTimeMillis()
            r2.dropdownPopupActivatedAt = r0
            return
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public void afterEditTextChanged(android.text.Editable r3) {
            r2 = this;
            android.view.accessibility.AccessibilityManager r3 = r2.accessibilityManager
            boolean r3 = r3.isTouchExplorationEnabled()
            if (r3 == 0) goto L1d
            android.widget.AutoCompleteTextView r3 = r2.autoCompleteTextView
            boolean r3 = com.google.android.material.textfield.EditTextUtils.isEditable(r3)
            if (r3 == 0) goto L1d
            com.google.android.material.internal.CheckableImageButton r3 = r2.endIconView
            boolean r3 = r3.hasFocus()
            if (r3 != 0) goto L1d
            android.widget.AutoCompleteTextView r3 = r2.autoCompleteTextView
            r3.dismissDropDown()
        L1d:
            android.widget.AutoCompleteTextView r3 = r2.autoCompleteTextView
            com.google.android.material.textfield.ClearTextEndIconDelegate$$ExternalSyntheticLambda3 r0 = new com.google.android.material.textfield.ClearTextEndIconDelegate$$ExternalSyntheticLambda3
            r1 = 1
            r0.<init>(r2, r1)
            r3.post(r0)
            return
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public final int getIconContentDescriptionResId() {
            r1 = this;
            int r0 = com.google.android.material.R.string.exposed_dropdown_menu_content_description
            return r0
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public final int getIconDrawableResId() {
            r1 = this;
            boolean r0 = com.google.android.material.textfield.DropdownMenuEndIconDelegate.IS_LOLLIPOP
            if (r0 == 0) goto L7
            int r0 = com.google.android.material.R.drawable.mtrl_dropdown_arrow
            goto L9
        L7:
            int r0 = com.google.android.material.R.drawable.mtrl_ic_arrow_drop_down
        L9:
            return r0
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public final android.view.View.OnFocusChangeListener getOnEditTextFocusChangeListener() {
            r1 = this;
            android.view.View$OnFocusChangeListener r0 = r1.onEditTextFocusChangeListener
            return r0
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public final android.view.View.OnClickListener getOnIconClickListener() {
            r1 = this;
            android.view.View$OnClickListener r0 = r1.onIconClickListener
            return r0
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public androidx.core.view.accessibility.AccessibilityManagerCompat.TouchExplorationStateChangeListener getTouchExplorationStateChangeListener() {
            r1 = this;
            androidx.core.view.accessibility.AccessibilityManagerCompat$TouchExplorationStateChangeListener r0 = r1.touchExplorationStateChangeListener
            return r0
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public final boolean isBoxBackgroundModeSupported(int r1) {
            r0 = this;
            if (r1 == 0) goto L4
            r1 = 1
            goto L5
        L4:
            r1 = 0
        L5:
            return r1
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public final boolean isIconActivated() {
            r1 = this;
            boolean r0 = r1.editTextHasFocus
            return r0
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public final boolean isIconChecked() {
            r1 = this;
            boolean r0 = r1.isEndIconChecked
            return r0
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public void onEditTextAttached(@androidx.annotation.Nullable android.widget.EditText r3) {
            r2 = this;
            android.widget.AutoCompleteTextView r0 = castAutoCompleteTextViewOrThrow(r3)
            r2.autoCompleteTextView = r0
            r2.setUpDropdownShowHideBehavior()
            com.google.android.material.textfield.TextInputLayout r0 = r2.textInputLayout
            r1 = 0
            r0.setErrorIconDrawable(r1)
            int r3 = r3.getInputType()
            r0 = 1
            if (r3 == 0) goto L18
            r3 = 1
            goto L19
        L18:
            r3 = 0
        L19:
            if (r3 != 0) goto L29
            android.view.accessibility.AccessibilityManager r3 = r2.accessibilityManager
            boolean r3 = r3.isTouchExplorationEnabled()
            if (r3 == 0) goto L29
            com.google.android.material.internal.CheckableImageButton r3 = r2.endIconView
            r1 = 2
            androidx.core.view.ViewCompat.setImportantForAccessibility(r3, r1)
        L29:
            com.google.android.material.textfield.TextInputLayout r3 = r2.textInputLayout
            r3.setEndIconVisible(r0)
            return
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public void onInitializeAccessibilityNodeInfo(android.view.View r1, @androidx.annotation.NonNull androidx.core.view.accessibility.AccessibilityNodeInfoCompat r2) {
            r0 = this;
            android.widget.AutoCompleteTextView r1 = r0.autoCompleteTextView
            boolean r1 = com.google.android.material.textfield.EditTextUtils.isEditable(r1)
            if (r1 != 0) goto L11
            java.lang.Class<android.widget.Spinner> r1 = android.widget.Spinner.class
            java.lang.String r1 = r1.getName()
            r2.setClassName(r1)
        L11:
            boolean r1 = r2.isShowingHintText()
            if (r1 == 0) goto L1b
            r1 = 0
            r2.setHintText(r1)
        L1b:
            return
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public void onPopulateAccessibilityEvent(android.view.View r1, @androidx.annotation.NonNull android.view.accessibility.AccessibilityEvent r2) {
            r0 = this;
            int r1 = r2.getEventType()
            r2 = 1
            if (r1 != r2) goto L1d
            android.view.accessibility.AccessibilityManager r1 = r0.accessibilityManager
            boolean r1 = r1.isEnabled()
            if (r1 == 0) goto L1d
            android.widget.AutoCompleteTextView r1 = r0.autoCompleteTextView
            boolean r1 = com.google.android.material.textfield.EditTextUtils.isEditable(r1)
            if (r1 != 0) goto L1d
            r0.showHideDropdown()
            r0.updateDropdownPopupDirty()
        L1d:
            return
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public final void setUp() {
            r2 = this;
            r2.initAnimators()
            android.content.Context r0 = r2.context
            java.lang.String r1 = "accessibility"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.accessibility.AccessibilityManager r0 = (android.view.accessibility.AccessibilityManager) r0
            r2.accessibilityManager = r0
            return
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    public final void tearDown() {
            r2 = this;
            android.widget.AutoCompleteTextView r0 = r2.autoCompleteTextView
            if (r0 == 0) goto L11
            r1 = 0
            r0.setOnTouchListener(r1)
            boolean r0 = com.google.android.material.textfield.DropdownMenuEndIconDelegate.IS_LOLLIPOP
            if (r0 == 0) goto L11
            android.widget.AutoCompleteTextView r0 = r2.autoCompleteTextView
            r0.setOnDismissListener(r1)
        L11:
            return
    }
}
