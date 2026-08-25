package com.google.android.material.textfield;

/* JADX INFO: loaded from: classes3.dex */
public class TextInputEditText extends androidx.appcompat.widget.AppCompatEditText {
    private final android.graphics.Rect parentRect;
    private boolean textInputLayoutFocusedRectEnabled;

    public TextInputEditText(@androidx.annotation.NonNull android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public TextInputEditText(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.Nullable android.util.AttributeSet r3) {
            r1 = this;
            int r0 = com.google.android.material.R.attr.editTextStyle
            r1.<init>(r2, r3, r0)
            return
    }

    public TextInputEditText(@androidx.annotation.NonNull android.content.Context r9, @androidx.annotation.Nullable android.util.AttributeSet r10, int r11) {
            r8 = this;
            r0 = 0
            android.content.Context r1 = com.google.android.material.theme.overlay.MaterialThemeOverlay.wrap(r9, r10, r11, r0)
            r8.<init>(r1, r10, r11)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r8.parentRect = r1
            int[] r4 = com.google.android.material.R.styleable.TextInputEditText
            int r6 = com.google.android.material.R.style.Widget_Design_TextInputEditText
            int[] r7 = new int[r0]
            r2 = r9
            r3 = r10
            r5 = r11
            android.content.res.TypedArray r9 = com.google.android.material.internal.ThemeEnforcement.obtainStyledAttributes(r2, r3, r4, r5, r6, r7)
            int r10 = com.google.android.material.R.styleable.TextInputEditText_textInputLayoutFocusedRectEnabled
            boolean r10 = r9.getBoolean(r10, r0)
            r8.setTextInputLayoutFocusedRectEnabled(r10)
            r9.recycle()
            return
    }

    @androidx.annotation.NonNull
    private java.lang.String getAccessibilityNodeInfoText(@androidx.annotation.NonNull com.google.android.material.textfield.TextInputLayout r5) {
            r4 = this;
            android.text.Editable r0 = r4.getText()
            java.lang.CharSequence r5 = r5.getHint()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            r1 = r1 ^ 1
            boolean r2 = android.text.TextUtils.isEmpty(r5)
            r2 = r2 ^ 1
            java.lang.String r3 = ""
            if (r2 == 0) goto L1d
            java.lang.String r5 = r5.toString()
            goto L1e
        L1d:
            r5 = r3
        L1e:
            if (r1 == 0) goto L3c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L34
            java.lang.String r0 = ", "
            java.lang.String r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r5)
        L34:
            r1.append(r3)
            java.lang.String r5 = r1.toString()
            return r5
        L3c:
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L43
            return r5
        L43:
            return r3
    }

    @androidx.annotation.Nullable
    private java.lang.CharSequence getHintFromLayout() {
            r1 = this;
            com.google.android.material.textfield.TextInputLayout r0 = r1.getTextInputLayout()
            if (r0 == 0) goto Lb
            java.lang.CharSequence r0 = r0.getHint()
            goto Lc
        Lb:
            r0 = 0
        Lc:
            return r0
    }

    @androidx.annotation.Nullable
    private com.google.android.material.textfield.TextInputLayout getTextInputLayout() {
            r2 = this;
            android.view.ViewParent r0 = r2.getParent()
        L4:
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L14
            boolean r1 = r0 instanceof com.google.android.material.textfield.TextInputLayout
            if (r1 == 0) goto Lf
            com.google.android.material.textfield.TextInputLayout r0 = (com.google.android.material.textfield.TextInputLayout) r0
            return r0
        Lf:
            android.view.ViewParent r0 = r0.getParent()
            goto L4
        L14:
            r0 = 0
            return r0
    }

    private boolean shouldUseTextInputLayoutFocusedRect(@androidx.annotation.Nullable com.google.android.material.textfield.TextInputLayout r1) {
            r0 = this;
            if (r1 == 0) goto L8
            boolean r1 = r0.textInputLayoutFocusedRectEnabled
            if (r1 == 0) goto L8
            r1 = 1
            goto L9
        L8:
            r1 = 0
        L9:
            return r1
    }

    @Override // android.widget.TextView, android.view.View
    public void getFocusedRect(@androidx.annotation.Nullable android.graphics.Rect r3) {
            r2 = this;
            super.getFocusedRect(r3)
            com.google.android.material.textfield.TextInputLayout r0 = r2.getTextInputLayout()
            boolean r1 = r2.shouldUseTextInputLayoutFocusedRect(r0)
            if (r1 == 0) goto L1a
            if (r3 == 0) goto L1a
            android.graphics.Rect r1 = r2.parentRect
            r0.getFocusedRect(r1)
            android.graphics.Rect r0 = r2.parentRect
            int r0 = r0.bottom
            r3.bottom = r0
        L1a:
            return
    }

    @Override // android.view.View
    public boolean getGlobalVisibleRect(@androidx.annotation.Nullable android.graphics.Rect r3, @androidx.annotation.Nullable android.graphics.Point r4) {
            r2 = this;
            com.google.android.material.textfield.TextInputLayout r0 = r2.getTextInputLayout()
            boolean r1 = r2.shouldUseTextInputLayoutFocusedRect(r0)
            if (r1 == 0) goto Lf
            boolean r3 = r0.getGlobalVisibleRect(r3, r4)
            goto L13
        Lf:
            boolean r3 = super.getGlobalVisibleRect(r3, r4)
        L13:
            return r3
    }

    @Override // android.widget.TextView
    @androidx.annotation.Nullable
    public java.lang.CharSequence getHint() {
            r2 = this;
            com.google.android.material.textfield.TextInputLayout r0 = r2.getTextInputLayout()
            if (r0 == 0) goto L11
            boolean r1 = r0.isProvidingHint()
            if (r1 == 0) goto L11
            java.lang.CharSequence r0 = r0.getHint()
            return r0
        L11:
            java.lang.CharSequence r0 = super.getHint()
            return r0
    }

    public boolean isTextInputLayoutFocusedRectEnabled() {
            r1 = this;
            boolean r0 = r1.textInputLayoutFocusedRectEnabled
            return r0
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
            r1 = this;
            super.onAttachedToWindow()
            com.google.android.material.textfield.TextInputLayout r0 = r1.getTextInputLayout()
            if (r0 == 0) goto L20
            boolean r0 = r0.isProvidingHint()
            if (r0 == 0) goto L20
            java.lang.CharSequence r0 = super.getHint()
            if (r0 != 0) goto L20
            boolean r0 = com.google.android.material.internal.ManufacturerUtils.isMeizuDevice()
            if (r0 == 0) goto L20
            java.lang.String r0 = ""
            r1.setHint(r0)
        L20:
            return
    }

    @Override // androidx.appcompat.widget.AppCompatEditText, android.widget.TextView, android.view.View
    @androidx.annotation.Nullable
    public android.view.inputmethod.InputConnection onCreateInputConnection(@androidx.annotation.NonNull android.view.inputmethod.EditorInfo r3) {
            r2 = this;
            android.view.inputmethod.InputConnection r0 = super.onCreateInputConnection(r3)
            if (r0 == 0) goto L10
            java.lang.CharSequence r1 = r3.hintText
            if (r1 != 0) goto L10
            java.lang.CharSequence r1 = r2.getHintFromLayout()
            r3.hintText = r1
        L10:
            return r0
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@androidx.annotation.NonNull android.view.accessibility.AccessibilityNodeInfo r4) {
            r3 = this;
            super.onInitializeAccessibilityNodeInfo(r4)
            com.google.android.material.textfield.TextInputLayout r0 = r3.getTextInputLayout()
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 23
            if (r1 >= r2) goto L16
            if (r0 == 0) goto L16
            java.lang.String r0 = r3.getAccessibilityNodeInfoText(r0)
            r4.setText(r0)
        L16:
            return
    }

    @Override // android.view.View
    public boolean requestRectangleOnScreen(@androidx.annotation.Nullable android.graphics.Rect r6) {
            r5 = this;
            com.google.android.material.textfield.TextInputLayout r0 = r5.getTextInputLayout()
            boolean r1 = r5.shouldUseTextInputLayoutFocusedRect(r0)
            if (r1 == 0) goto L2a
            if (r6 == 0) goto L2a
            int r0 = r0.getHeight()
            int r1 = r5.getHeight()
            int r0 = r0 - r1
            android.graphics.Rect r1 = r5.parentRect
            int r2 = r6.left
            int r3 = r6.top
            int r4 = r6.right
            int r6 = r6.bottom
            int r6 = r6 + r0
            r1.set(r2, r3, r4, r6)
            android.graphics.Rect r6 = r5.parentRect
            boolean r6 = super.requestRectangleOnScreen(r6)
            return r6
        L2a:
            boolean r6 = super.requestRectangleOnScreen(r6)
            return r6
    }

    public void setTextInputLayoutFocusedRectEnabled(boolean r1) {
            r0 = this;
            r0.textInputLayoutFocusedRectEnabled = r1
            return
    }
}
