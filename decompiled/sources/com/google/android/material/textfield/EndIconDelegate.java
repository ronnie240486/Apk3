package com.google.android.material.textfield;

/* JADX INFO: loaded from: classes3.dex */
abstract class EndIconDelegate {
    public final android.content.Context context;
    public final com.google.android.material.internal.CheckableImageButton endIconView;
    public final com.google.android.material.textfield.EndCompoundLayout endLayout;
    public final com.google.android.material.textfield.TextInputLayout textInputLayout;

    public EndIconDelegate(@androidx.annotation.NonNull com.google.android.material.textfield.EndCompoundLayout r2) {
            r1 = this;
            r1.<init>()
            com.google.android.material.textfield.TextInputLayout r0 = r2.textInputLayout
            r1.textInputLayout = r0
            r1.endLayout = r2
            android.content.Context r0 = r2.getContext()
            r1.context = r0
            com.google.android.material.internal.CheckableImageButton r2 = r2.getEndIconView()
            r1.endIconView = r2
            return
    }

    public void afterEditTextChanged(android.text.Editable r1) {
            r0 = this;
            return
    }

    public void beforeEditTextChanged() {
            r0 = this;
            return
    }

    @androidx.annotation.StringRes
    public int getIconContentDescriptionResId() {
            r1 = this;
            r0 = 0
            return r0
    }

    @androidx.annotation.DrawableRes
    public int getIconDrawableResId() {
            r1 = this;
            r0 = 0
            return r0
    }

    public android.view.View.OnFocusChangeListener getOnEditTextFocusChangeListener() {
            r1 = this;
            r0 = 0
            return r0
    }

    public android.view.View.OnClickListener getOnIconClickListener() {
            r1 = this;
            r0 = 0
            return r0
    }

    public android.view.View.OnFocusChangeListener getOnIconViewFocusChangeListener() {
            r1 = this;
            r0 = 0
            return r0
    }

    public androidx.core.view.accessibility.AccessibilityManagerCompat.TouchExplorationStateChangeListener getTouchExplorationStateChangeListener() {
            r1 = this;
            r0 = 0
            return r0
    }

    public boolean isBoxBackgroundModeSupported(int r1) {
            r0 = this;
            r1 = 1
            return r1
    }

    public boolean isIconActivated() {
            r1 = this;
            r0 = 0
            return r0
    }

    public boolean isIconCheckable() {
            r0 = this;
            boolean r0 = r0 instanceof com.google.android.material.textfield.DropdownMenuEndIconDelegate
            return r0
    }

    public boolean isIconChecked() {
            r1 = this;
            r0 = 0
            return r0
    }

    public void onEditTextAttached(@androidx.annotation.Nullable android.widget.EditText r1) {
            r0 = this;
            return
    }

    public void onInitializeAccessibilityNodeInfo(android.view.View r1, @androidx.annotation.NonNull androidx.core.view.accessibility.AccessibilityNodeInfoCompat r2) {
            r0 = this;
            return
    }

    public void onPopulateAccessibilityEvent(android.view.View r1, @androidx.annotation.NonNull android.view.accessibility.AccessibilityEvent r2) {
            r0 = this;
            return
    }

    public void onSuffixVisibilityChanged(boolean r1) {
            r0 = this;
            return
    }

    public final void refreshIconState() {
            r2 = this;
            com.google.android.material.textfield.EndCompoundLayout r0 = r2.endLayout
            r1 = 0
            r0.refreshIconState(r1)
            return
    }

    public void setUp() {
            r0 = this;
            return
    }

    public void tearDown() {
            r0 = this;
            return
    }
}
