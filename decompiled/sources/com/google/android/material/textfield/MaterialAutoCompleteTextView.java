package com.google.android.material.textfield;

/* JADX INFO: loaded from: classes3.dex */
public class MaterialAutoCompleteTextView extends androidx.appcompat.widget.AppCompatAutoCompleteTextView {
    private static final int MAX_ITEMS_MEASURED = 15;

    @androidx.annotation.Nullable
    private final android.view.accessibility.AccessibilityManager accessibilityManager;

    @androidx.annotation.NonNull
    private final androidx.appcompat.widget.ListPopupWindow modalListPopup;
    private final float popupElevation;

    @androidx.annotation.LayoutRes
    private final int simpleItemLayout;
    private int simpleItemSelectedColor;

    @androidx.annotation.Nullable
    private android.content.res.ColorStateList simpleItemSelectedRippleColor;

    @androidx.annotation.NonNull
    private final android.graphics.Rect tempRect;


    public class MaterialArrayAdapter<T> extends android.widget.ArrayAdapter<java.lang.String> {

        @androidx.annotation.Nullable
        private android.content.res.ColorStateList pressedRippleColor;

        @androidx.annotation.Nullable
        private android.content.res.ColorStateList selectedItemRippleOverlaidColor;
        public final /* synthetic */ com.google.android.material.textfield.MaterialAutoCompleteTextView this$0;

        public MaterialArrayAdapter(@androidx.annotation.NonNull com.google.android.material.textfield.MaterialAutoCompleteTextView r1, android.content.Context r2, @androidx.annotation.NonNull int r3, java.lang.String[] r4) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r2, r3, r4)
                r0.updateSelectedItemColorStateList()
                return
        }

        @androidx.annotation.Nullable
        private android.content.res.ColorStateList createItemSelectedColorStateList() {
                r9 = this;
                boolean r0 = r9.hasSelectedColor()
                if (r0 == 0) goto L60
                boolean r0 = r9.hasSelectedRippleColor()
                if (r0 == 0) goto L60
                r0 = 2
                int[] r1 = new int[r0]
                r1 = {x0062: FILL_ARRAY_DATA , data: [16843623, -16842919} // fill-array
                int[] r2 = new int[r0]
                r2 = {x006a: FILL_ARRAY_DATA , data: [16842913, -16842919} // fill-array
                com.google.android.material.textfield.MaterialAutoCompleteTextView r3 = r9.this$0
                android.content.res.ColorStateList r3 = com.google.android.material.textfield.MaterialAutoCompleteTextView.access$300(r3)
                r4 = 0
                int r3 = r3.getColorForState(r2, r4)
                com.google.android.material.textfield.MaterialAutoCompleteTextView r5 = r9.this$0
                android.content.res.ColorStateList r5 = com.google.android.material.textfield.MaterialAutoCompleteTextView.access$300(r5)
                int r5 = r5.getColorForState(r1, r4)
                r6 = 3
                int[] r7 = new int[r6]
                com.google.android.material.textfield.MaterialAutoCompleteTextView r8 = r9.this$0
                int r8 = com.google.android.material.textfield.MaterialAutoCompleteTextView.access$200(r8)
                int r3 = com.google.android.material.color.MaterialColors.layer(r8, r3)
                r7[r4] = r3
                com.google.android.material.textfield.MaterialAutoCompleteTextView r3 = r9.this$0
                int r3 = com.google.android.material.textfield.MaterialAutoCompleteTextView.access$200(r3)
                int r3 = com.google.android.material.color.MaterialColors.layer(r3, r5)
                r5 = 1
                r7[r5] = r3
                com.google.android.material.textfield.MaterialAutoCompleteTextView r3 = r9.this$0
                int r3 = com.google.android.material.textfield.MaterialAutoCompleteTextView.access$200(r3)
                r7[r0] = r3
                int[][] r3 = new int[r6][]
                r3[r4] = r2
                r3[r5] = r1
                int[] r1 = new int[r4]
                r3[r0] = r1
                android.content.res.ColorStateList r0 = new android.content.res.ColorStateList
                r0.<init>(r3, r7)
                return r0
            L60:
                r0 = 0
                return r0
        }

        @androidx.annotation.Nullable
        private android.graphics.drawable.Drawable getSelectedItemDrawable() {
                r4 = this;
                boolean r0 = r4.hasSelectedColor()
                r1 = 0
                if (r0 == 0) goto L24
                android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
                com.google.android.material.textfield.MaterialAutoCompleteTextView r2 = r4.this$0
                int r2 = com.google.android.material.textfield.MaterialAutoCompleteTextView.access$200(r2)
                r0.<init>(r2)
                android.content.res.ColorStateList r2 = r4.pressedRippleColor
                if (r2 == 0) goto L23
                android.content.res.ColorStateList r2 = r4.selectedItemRippleOverlaidColor
                androidx.core.graphics.drawable.DrawableCompat.setTintList(r0, r2)
                android.graphics.drawable.RippleDrawable r2 = new android.graphics.drawable.RippleDrawable
                android.content.res.ColorStateList r3 = r4.pressedRippleColor
                r2.<init>(r3, r0, r1)
                return r2
            L23:
                return r0
            L24:
                return r1
        }

        private boolean hasSelectedColor() {
                r1 = this;
                com.google.android.material.textfield.MaterialAutoCompleteTextView r0 = r1.this$0
                int r0 = com.google.android.material.textfield.MaterialAutoCompleteTextView.access$200(r0)
                if (r0 == 0) goto La
                r0 = 1
                goto Lb
            La:
                r0 = 0
            Lb:
                return r0
        }

        private boolean hasSelectedRippleColor() {
                r1 = this;
                com.google.android.material.textfield.MaterialAutoCompleteTextView r0 = r1.this$0
                android.content.res.ColorStateList r0 = com.google.android.material.textfield.MaterialAutoCompleteTextView.access$300(r0)
                if (r0 == 0) goto La
                r0 = 1
                goto Lb
            La:
                r0 = 0
            Lb:
                return r0
        }

        private android.content.res.ColorStateList sanitizeDropdownItemSelectedRippleColor() {
                r6 = this;
                boolean r0 = r6.hasSelectedRippleColor()
                if (r0 != 0) goto L8
                r0 = 0
                return r0
            L8:
                r0 = 1
                int[] r1 = new int[r0]
                r2 = 16842919(0x10100a7, float:2.3694026E-38)
                r3 = 0
                r1[r3] = r2
                r2 = 2
                int[] r4 = new int[r2]
                com.google.android.material.textfield.MaterialAutoCompleteTextView r5 = r6.this$0
                android.content.res.ColorStateList r5 = com.google.android.material.textfield.MaterialAutoCompleteTextView.access$300(r5)
                int r5 = r5.getColorForState(r1, r3)
                r4[r3] = r5
                r4[r0] = r3
                int[][] r2 = new int[r2][]
                r2[r3] = r1
                int[] r1 = new int[r3]
                r2[r0] = r1
                android.content.res.ColorStateList r0 = new android.content.res.ColorStateList
                r0.<init>(r2, r4)
                return r0
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public android.view.View getView(int r2, @androidx.annotation.Nullable android.view.View r3, android.view.ViewGroup r4) {
                r1 = this;
                android.view.View r2 = super.getView(r2, r3, r4)
                boolean r3 = r2 instanceof android.widget.TextView
                if (r3 == 0) goto L28
                r3 = r2
                android.widget.TextView r3 = (android.widget.TextView) r3
                com.google.android.material.textfield.MaterialAutoCompleteTextView r4 = r1.this$0
                android.text.Editable r4 = r4.getText()
                java.lang.String r4 = r4.toString()
                java.lang.CharSequence r0 = r3.getText()
                boolean r4 = r4.contentEquals(r0)
                if (r4 == 0) goto L24
                android.graphics.drawable.Drawable r4 = r1.getSelectedItemDrawable()
                goto L25
            L24:
                r4 = 0
            L25:
                androidx.core.view.ViewCompat.setBackground(r3, r4)
            L28:
                return r2
        }

        public final void updateSelectedItemColorStateList() {
                r1 = this;
                android.content.res.ColorStateList r0 = r1.sanitizeDropdownItemSelectedRippleColor()
                r1.pressedRippleColor = r0
                android.content.res.ColorStateList r0 = r1.createItemSelectedColorStateList()
                r1.selectedItemRippleOverlaidColor = r0
                return
        }
    }

    public MaterialAutoCompleteTextView(@androidx.annotation.NonNull android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public MaterialAutoCompleteTextView(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.Nullable android.util.AttributeSet r3) {
            r1 = this;
            int r0 = com.google.android.material.R.attr.autoCompleteTextViewStyle
            r1.<init>(r2, r3, r0)
            return
    }

    public MaterialAutoCompleteTextView(@androidx.annotation.NonNull android.content.Context r8, @androidx.annotation.Nullable android.util.AttributeSet r9, int r10) {
            r7 = this;
            r0 = 0
            android.content.Context r8 = com.google.android.material.theme.overlay.MaterialThemeOverlay.wrap(r8, r9, r10, r0)
            r7.<init>(r8, r9, r10)
            android.graphics.Rect r8 = new android.graphics.Rect
            r8.<init>()
            r7.tempRect = r8
            android.content.Context r8 = r7.getContext()
            int[] r3 = com.google.android.material.R.styleable.MaterialAutoCompleteTextView
            int r5 = com.google.android.material.R.style.Widget_AppCompat_AutoCompleteTextView
            int[] r6 = new int[r0]
            r1 = r8
            r2 = r9
            r4 = r10
            android.content.res.TypedArray r9 = com.google.android.material.internal.ThemeEnforcement.obtainStyledAttributes(r1, r2, r3, r4, r5, r6)
            int r10 = com.google.android.material.R.styleable.MaterialAutoCompleteTextView_android_inputType
            boolean r1 = r9.hasValue(r10)
            if (r1 == 0) goto L32
            int r10 = r9.getInt(r10, r0)
            if (r10 != 0) goto L32
            r10 = 0
            r7.setKeyListener(r10)
        L32:
            int r10 = com.google.android.material.R.styleable.MaterialAutoCompleteTextView_simpleItemLayout
            int r1 = com.google.android.material.R.layout.mtrl_auto_complete_simple_item
            int r10 = r9.getResourceId(r10, r1)
            r7.simpleItemLayout = r10
            int r10 = com.google.android.material.R.styleable.MaterialAutoCompleteTextView_android_popupElevation
            int r1 = com.google.android.material.R.dimen.mtrl_exposed_dropdown_menu_popup_elevation
            int r10 = r9.getDimensionPixelOffset(r10, r1)
            float r10 = (float) r10
            r7.popupElevation = r10
            int r10 = com.google.android.material.R.styleable.MaterialAutoCompleteTextView_simpleItemSelectedColor
            int r10 = r9.getColor(r10, r0)
            r7.simpleItemSelectedColor = r10
            int r10 = com.google.android.material.R.styleable.MaterialAutoCompleteTextView_simpleItemSelectedRippleColor
            android.content.res.ColorStateList r10 = com.google.android.material.resources.MaterialResources.getColorStateList(r8, r9, r10)
            r7.simpleItemSelectedRippleColor = r10
            java.lang.String r10 = "accessibility"
            java.lang.Object r10 = r8.getSystemService(r10)
            android.view.accessibility.AccessibilityManager r10 = (android.view.accessibility.AccessibilityManager) r10
            r7.accessibilityManager = r10
            androidx.appcompat.widget.ListPopupWindow r10 = new androidx.appcompat.widget.ListPopupWindow
            r10.<init>(r8)
            r7.modalListPopup = r10
            r8 = 1
            r10.setModal(r8)
            r10.setAnchorView(r7)
            r8 = 2
            r10.setInputMethodMode(r8)
            android.widget.ListAdapter r8 = r7.getAdapter()
            r10.setAdapter(r8)
            com.google.android.material.textfield.MaterialAutoCompleteTextView$1 r8 = new com.google.android.material.textfield.MaterialAutoCompleteTextView$1
            r8.<init>(r7)
            r10.setOnItemClickListener(r8)
            int r8 = com.google.android.material.R.styleable.MaterialAutoCompleteTextView_simpleItems
            boolean r10 = r9.hasValue(r8)
            if (r10 == 0) goto L91
            int r8 = r9.getResourceId(r8, r0)
            r7.setSimpleItems(r8)
        L91:
            r9.recycle()
            return
    }

    public static /* synthetic */ androidx.appcompat.widget.ListPopupWindow access$000(com.google.android.material.textfield.MaterialAutoCompleteTextView r0) {
            androidx.appcompat.widget.ListPopupWindow r0 = r0.modalListPopup
            return r0
    }

    public static /* synthetic */ void access$100(com.google.android.material.textfield.MaterialAutoCompleteTextView r0, java.lang.Object r1) {
            r0.updateText(r1)
            return
    }

    public static /* synthetic */ int access$200(com.google.android.material.textfield.MaterialAutoCompleteTextView r0) {
            int r0 = r0.simpleItemSelectedColor
            return r0
    }

    public static /* synthetic */ android.content.res.ColorStateList access$300(com.google.android.material.textfield.MaterialAutoCompleteTextView r0) {
            android.content.res.ColorStateList r0 = r0.simpleItemSelectedRippleColor
            return r0
    }

    @androidx.annotation.Nullable
    private com.google.android.material.textfield.TextInputLayout findTextInputLayoutAncestor() {
            r2 = this;
            android.view.ViewParent r0 = r2.getParent()
        L4:
            if (r0 == 0) goto L12
            boolean r1 = r0 instanceof com.google.android.material.textfield.TextInputLayout
            if (r1 == 0) goto Ld
            com.google.android.material.textfield.TextInputLayout r0 = (com.google.android.material.textfield.TextInputLayout) r0
            return r0
        Ld:
            android.view.ViewParent r0 = r0.getParent()
            goto L4
        L12:
            r0 = 0
            return r0
    }

    private boolean isTouchExplorationEnabled() {
            r1 = this;
            android.view.accessibility.AccessibilityManager r0 = r1.accessibilityManager
            if (r0 == 0) goto Lc
            boolean r0 = r0.isTouchExplorationEnabled()
            if (r0 == 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    private int measureContentWidth() {
            r12 = this;
            android.widget.ListAdapter r0 = r12.getAdapter()
            com.google.android.material.textfield.TextInputLayout r1 = r12.findTextInputLayoutAncestor()
            r2 = 0
            if (r0 == 0) goto L87
            if (r1 != 0) goto Lf
            goto L87
        Lf:
            int r3 = r12.getMeasuredWidth()
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r2)
            int r4 = r12.getMeasuredHeight()
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r2)
            androidx.appcompat.widget.ListPopupWindow r5 = r12.modalListPopup
            int r5 = r5.getSelectedItemPosition()
            int r5 = java.lang.Math.max(r2, r5)
            int r6 = r0.getCount()
            int r5 = r5 + 15
            int r5 = java.lang.Math.min(r6, r5)
            int r6 = r5 + (-15)
            int r6 = java.lang.Math.max(r2, r6)
            r7 = 0
            r8 = r6
            r9 = r7
            r6 = 0
        L3d:
            if (r8 >= r5) goto L68
            int r10 = r0.getItemViewType(r8)
            if (r10 == r2) goto L47
            r9 = r7
            r2 = r10
        L47:
            android.view.View r9 = r0.getView(r8, r9, r1)
            android.view.ViewGroup$LayoutParams r10 = r9.getLayoutParams()
            if (r10 != 0) goto L5a
            android.view.ViewGroup$LayoutParams r10 = new android.view.ViewGroup$LayoutParams
            r11 = -2
            r10.<init>(r11, r11)
            r9.setLayoutParams(r10)
        L5a:
            r9.measure(r3, r4)
            int r10 = r9.getMeasuredWidth()
            int r6 = java.lang.Math.max(r6, r10)
            int r8 = r8 + 1
            goto L3d
        L68:
            androidx.appcompat.widget.ListPopupWindow r0 = r12.modalListPopup
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            if (r0 == 0) goto L7d
            android.graphics.Rect r2 = r12.tempRect
            r0.getPadding(r2)
            android.graphics.Rect r0 = r12.tempRect
            int r2 = r0.left
            int r0 = r0.right
            int r2 = r2 + r0
            int r6 = r6 + r2
        L7d:
            com.google.android.material.internal.CheckableImageButton r0 = r1.getEndIconView()
            int r0 = r0.getMeasuredWidth()
            int r0 = r0 + r6
            return r0
        L87:
            return r2
    }

    private void onInputTypeChanged() {
            r1 = this;
            com.google.android.material.textfield.TextInputLayout r0 = r1.findTextInputLayoutAncestor()
            if (r0 == 0) goto L9
            r0.updateEditTextBoxBackgroundIfNeeded()
        L9:
            return
    }

    private <T extends android.widget.ListAdapter & android.widget.Filterable> void updateText(java.lang.Object r2) {
            r1 = this;
            java.lang.CharSequence r2 = r1.convertSelectionToString(r2)
            r0 = 0
            r1.setText(r2, r0)
            return
    }

    @Override // android.widget.AutoCompleteTextView
    public void dismissDropDown() {
            r1 = this;
            boolean r0 = r1.isTouchExplorationEnabled()
            if (r0 == 0) goto Lc
            androidx.appcompat.widget.ListPopupWindow r0 = r1.modalListPopup
            r0.dismiss()
            goto Lf
        Lc:
            super.dismissDropDown()
        Lf:
            return
    }

    @Override // android.widget.TextView
    @androidx.annotation.Nullable
    public java.lang.CharSequence getHint() {
            r2 = this;
            com.google.android.material.textfield.TextInputLayout r0 = r2.findTextInputLayoutAncestor()
            if (r0 == 0) goto L11
            boolean r1 = r0.isProvidingHint()
            if (r1 == 0) goto L11
            java.lang.CharSequence r0 = r0.getHint()
            return r0
        L11:
            java.lang.CharSequence r0 = super.getHint()
            return r0
    }

    public float getPopupElevation() {
            r1 = this;
            float r0 = r1.popupElevation
            return r0
    }

    public int getSimpleItemSelectedColor() {
            r1 = this;
            int r0 = r1.simpleItemSelectedColor
            return r0
    }

    @androidx.annotation.Nullable
    public android.content.res.ColorStateList getSimpleItemSelectedRippleColor() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.simpleItemSelectedRippleColor
            return r0
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
            r1 = this;
            super.onAttachedToWindow()
            com.google.android.material.textfield.TextInputLayout r0 = r1.findTextInputLayoutAncestor()
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

    @Override // android.widget.AutoCompleteTextView, android.view.View
    public final void onDetachedFromWindow() {
            r1 = this;
            super.onDetachedFromWindow()
            androidx.appcompat.widget.ListPopupWindow r0 = r1.modalListPopup
            r0.dismiss()
            return
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int r2, int r3) {
            r1 = this;
            super.onMeasure(r2, r3)
            int r3 = android.view.View.MeasureSpec.getMode(r2)
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 != r0) goto L26
            int r3 = r1.getMeasuredWidth()
            int r0 = r1.measureContentWidth()
            int r3 = java.lang.Math.max(r3, r0)
            int r2 = android.view.View.MeasureSpec.getSize(r2)
            int r2 = java.lang.Math.min(r3, r2)
            int r3 = r1.getMeasuredHeight()
            r1.setMeasuredDimension(r2, r3)
        L26:
            return
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public void onWindowFocusChanged(boolean r2) {
            r1 = this;
            boolean r0 = r1.isTouchExplorationEnabled()
            if (r0 == 0) goto L7
            return
        L7:
            super.onWindowFocusChanged(r2)
            return
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends android.widget.ListAdapter & android.widget.Filterable> void setAdapter(@androidx.annotation.Nullable T r2) {
            r1 = this;
            super.setAdapter(r2)
            androidx.appcompat.widget.ListPopupWindow r2 = r1.modalListPopup
            android.widget.ListAdapter r0 = r1.getAdapter()
            r2.setAdapter(r0)
            return
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundDrawable(android.graphics.drawable.Drawable r2) {
            r1 = this;
            super.setDropDownBackgroundDrawable(r2)
            androidx.appcompat.widget.ListPopupWindow r0 = r1.modalListPopup
            if (r0 == 0) goto La
            r0.setBackgroundDrawable(r2)
        La:
            return
    }

    @Override // android.widget.AutoCompleteTextView
    public void setOnItemSelectedListener(@androidx.annotation.Nullable android.widget.AdapterView.OnItemSelectedListener r2) {
            r1 = this;
            super.setOnItemSelectedListener(r2)
            androidx.appcompat.widget.ListPopupWindow r2 = r1.modalListPopup
            android.widget.AdapterView$OnItemSelectedListener r0 = r1.getOnItemSelectedListener()
            r2.setOnItemSelectedListener(r0)
            return
    }

    @Override // android.widget.TextView
    public void setRawInputType(int r1) {
            r0 = this;
            super.setRawInputType(r1)
            r0.onInputTypeChanged()
            return
    }

    public void setSimpleItemSelectedColor(int r1) {
            r0 = this;
            r0.simpleItemSelectedColor = r1
            android.widget.ListAdapter r1 = r0.getAdapter()
            boolean r1 = r1 instanceof com.google.android.material.textfield.MaterialAutoCompleteTextView.MaterialArrayAdapter
            if (r1 == 0) goto L13
            android.widget.ListAdapter r1 = r0.getAdapter()
            com.google.android.material.textfield.MaterialAutoCompleteTextView$MaterialArrayAdapter r1 = (com.google.android.material.textfield.MaterialAutoCompleteTextView.MaterialArrayAdapter) r1
            r1.updateSelectedItemColorStateList()
        L13:
            return
    }

    public void setSimpleItemSelectedRippleColor(@androidx.annotation.Nullable android.content.res.ColorStateList r1) {
            r0 = this;
            r0.simpleItemSelectedRippleColor = r1
            android.widget.ListAdapter r1 = r0.getAdapter()
            boolean r1 = r1 instanceof com.google.android.material.textfield.MaterialAutoCompleteTextView.MaterialArrayAdapter
            if (r1 == 0) goto L13
            android.widget.ListAdapter r1 = r0.getAdapter()
            com.google.android.material.textfield.MaterialAutoCompleteTextView$MaterialArrayAdapter r1 = (com.google.android.material.textfield.MaterialAutoCompleteTextView.MaterialArrayAdapter) r1
            r1.updateSelectedItemColorStateList()
        L13:
            return
    }

    public void setSimpleItems(@androidx.annotation.ArrayRes int r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.getResources()
            java.lang.String[] r2 = r0.getStringArray(r2)
            r1.setSimpleItems(r2)
            return
    }

    public void setSimpleItems(@androidx.annotation.NonNull java.lang.String[] r4) {
            r3 = this;
            com.google.android.material.textfield.MaterialAutoCompleteTextView$MaterialArrayAdapter r0 = new com.google.android.material.textfield.MaterialAutoCompleteTextView$MaterialArrayAdapter
            android.content.Context r1 = r3.getContext()
            int r2 = r3.simpleItemLayout
            r0.<init>(r3, r1, r2, r4)
            r3.setAdapter(r0)
            return
    }

    @Override // android.widget.AutoCompleteTextView
    public void showDropDown() {
            r1 = this;
            boolean r0 = r1.isTouchExplorationEnabled()
            if (r0 == 0) goto Lc
            androidx.appcompat.widget.ListPopupWindow r0 = r1.modalListPopup
            r0.show()
            goto Lf
        Lc:
            super.showDropDown()
        Lf:
            return
    }
}
