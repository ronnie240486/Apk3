package com.google.android.material.textfield;

/* JADX INFO: loaded from: classes.dex */
class PasswordToggleEndIconDelegate extends com.google.android.material.textfield.EndIconDelegate {

    @androidx.annotation.Nullable
    private android.widget.EditText editText;
    private int iconResId;
    private final android.view.View.OnClickListener onIconClickListener;

    public static /* synthetic */ void $r8$lambda$twlq6SYcv_LydKclcBcdQZ6NHKY(com.google.android.material.textfield.PasswordToggleEndIconDelegate r0, android.view.View r1) {
            r0.lambda$new$0(r1)
            return
    }

    public PasswordToggleEndIconDelegate(@androidx.annotation.NonNull com.google.android.material.textfield.EndCompoundLayout r2, @androidx.annotation.DrawableRes int r3) {
            r1 = this;
            r1.<init>(r2)
            int r2 = com.google.android.material.R.drawable.design_password_eye
            r1.iconResId = r2
            com.google.android.material.textfield.ClearTextEndIconDelegate$$ExternalSyntheticLambda1 r2 = new com.google.android.material.textfield.ClearTextEndIconDelegate$$ExternalSyntheticLambda1
            r0 = 2
            r2.<init>(r1, r0)
            r1.onIconClickListener = r2
            if (r3 == 0) goto L13
            r1.iconResId = r3
        L13:
            return
    }

    private boolean hasPasswordTransformation() {
            r1 = this;
            android.widget.EditText r0 = r1.editText
            if (r0 == 0) goto Le
            android.text.method.TransformationMethod r0 = r0.getTransformationMethod()
            boolean r0 = r0 instanceof android.text.method.PasswordTransformationMethod
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    private static boolean isInputTypePassword(android.widget.EditText r2) {
            if (r2 == 0) goto L24
            int r0 = r2.getInputType()
            r1 = 16
            if (r0 == r1) goto L22
            int r0 = r2.getInputType()
            r1 = 128(0x80, float:1.8E-43)
            if (r0 == r1) goto L22
            int r0 = r2.getInputType()
            r1 = 144(0x90, float:2.02E-43)
            if (r0 == r1) goto L22
            int r2 = r2.getInputType()
            r0 = 224(0xe0, float:3.14E-43)
            if (r2 != r0) goto L24
        L22:
            r2 = 1
            goto L25
        L24:
            r2 = 0
        L25:
            return r2
    }

    private /* synthetic */ void lambda$new$0(android.view.View r3) {
            r2 = this;
            android.widget.EditText r3 = r2.editText
            if (r3 != 0) goto L5
            return
        L5:
            int r3 = r3.getSelectionEnd()
            boolean r0 = r2.hasPasswordTransformation()
            if (r0 == 0) goto L16
            android.widget.EditText r0 = r2.editText
            r1 = 0
            r0.setTransformationMethod(r1)
            goto L1f
        L16:
            android.widget.EditText r0 = r2.editText
            android.text.method.PasswordTransformationMethod r1 = android.text.method.PasswordTransformationMethod.getInstance()
            r0.setTransformationMethod(r1)
        L1f:
            if (r3 < 0) goto L26
            android.widget.EditText r0 = r2.editText
            r0.setSelection(r3)
        L26:
            r2.refreshIconState()
            return
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public final void beforeEditTextChanged() {
            r0 = this;
            r0.refreshIconState()
            return
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    @androidx.annotation.StringRes
    public final int getIconContentDescriptionResId() {
            r1 = this;
            int r0 = com.google.android.material.R.string.password_toggle_content_description
            return r0
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    @androidx.annotation.DrawableRes
    public final int getIconDrawableResId() {
            r1 = this;
            int r0 = r1.iconResId
            return r0
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public final android.view.View.OnClickListener getOnIconClickListener() {
            r1 = this;
            android.view.View$OnClickListener r0 = r1.onIconClickListener
            return r0
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public final boolean isIconCheckable() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public final boolean isIconChecked() {
            r1 = this;
            boolean r0 = r1.hasPasswordTransformation()
            r0 = r0 ^ 1
            return r0
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public final void onEditTextAttached(@androidx.annotation.Nullable android.widget.EditText r1) {
            r0 = this;
            r0.editText = r1
            r0.refreshIconState()
            return
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public final void setUp() {
            r2 = this;
            android.widget.EditText r0 = r2.editText
            boolean r0 = isInputTypePassword(r0)
            if (r0 == 0) goto L11
            android.widget.EditText r0 = r2.editText
            android.text.method.PasswordTransformationMethod r1 = android.text.method.PasswordTransformationMethod.getInstance()
            r0.setTransformationMethod(r1)
        L11:
            return
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public final void tearDown() {
            r2 = this;
            android.widget.EditText r0 = r2.editText
            if (r0 == 0) goto Lb
            android.text.method.PasswordTransformationMethod r1 = android.text.method.PasswordTransformationMethod.getInstance()
            r0.setTransformationMethod(r1)
        Lb:
            return
    }
}
