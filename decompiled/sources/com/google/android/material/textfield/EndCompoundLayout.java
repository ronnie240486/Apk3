package com.google.android.material.textfield;

/* JADX INFO: loaded from: classes.dex */
@android.annotation.SuppressLint({"ViewConstructor"})
class EndCompoundLayout extends android.widget.LinearLayout {

    @androidx.annotation.Nullable
    private final android.view.accessibility.AccessibilityManager accessibilityManager;
    private android.widget.EditText editText;
    private final android.text.TextWatcher editTextWatcher;
    private final java.util.LinkedHashSet<com.google.android.material.textfield.TextInputLayout.OnEndIconChangedListener> endIconChangedListeners;
    private final com.google.android.material.textfield.EndCompoundLayout.EndIconDelegates endIconDelegates;

    @androidx.annotation.NonNull
    private final android.widget.FrameLayout endIconFrame;
    private int endIconMinSize;
    private int endIconMode;
    private android.view.View.OnLongClickListener endIconOnLongClickListener;

    @androidx.annotation.NonNull
    private android.widget.ImageView.ScaleType endIconScaleType;
    private android.content.res.ColorStateList endIconTintList;
    private android.graphics.PorterDuff.Mode endIconTintMode;

    @androidx.annotation.NonNull
    private final com.google.android.material.internal.CheckableImageButton endIconView;
    private android.view.View.OnLongClickListener errorIconOnLongClickListener;
    private android.content.res.ColorStateList errorIconTintList;
    private android.graphics.PorterDuff.Mode errorIconTintMode;

    @androidx.annotation.NonNull
    private final com.google.android.material.internal.CheckableImageButton errorIconView;
    private boolean hintExpanded;
    private final com.google.android.material.textfield.TextInputLayout.OnEditTextAttachedListener onEditTextAttachedListener;

    @androidx.annotation.Nullable
    private java.lang.CharSequence suffixText;

    @androidx.annotation.NonNull
    private final android.widget.TextView suffixTextView;
    public final com.google.android.material.textfield.TextInputLayout textInputLayout;

    @androidx.annotation.Nullable
    private androidx.core.view.accessibility.AccessibilityManagerCompat.TouchExplorationStateChangeListener touchExplorationStateChangeListener;




    /* JADX INFO: loaded from: classes3.dex */
    public static class EndIconDelegates {
        private final int customEndIconDrawableId;
        private final android.util.SparseArray<com.google.android.material.textfield.EndIconDelegate> delegates;
        private final com.google.android.material.textfield.EndCompoundLayout endLayout;
        private final int passwordIconDrawableId;

        public EndIconDelegates(com.google.android.material.textfield.EndCompoundLayout r2, androidx.appcompat.widget.TintTypedArray r3) {
                r1 = this;
                r1.<init>()
                android.util.SparseArray r0 = new android.util.SparseArray
                r0.<init>()
                r1.delegates = r0
                r1.endLayout = r2
                int r2 = com.google.android.material.R.styleable.TextInputLayout_endIconDrawable
                r0 = 0
                int r2 = r3.getResourceId(r2, r0)
                r1.customEndIconDrawableId = r2
                int r2 = com.google.android.material.R.styleable.TextInputLayout_passwordToggleDrawable
                int r2 = r3.getResourceId(r2, r0)
                r1.passwordIconDrawableId = r2
                return
        }

        public static /* synthetic */ int access$500(com.google.android.material.textfield.EndCompoundLayout.EndIconDelegates r0) {
                int r0 = r0.customEndIconDrawableId
                return r0
        }

        private com.google.android.material.textfield.EndIconDelegate create(int r3) {
                r2 = this;
                r0 = -1
                if (r3 == r0) goto L3c
                if (r3 == 0) goto L34
                r0 = 1
                if (r3 == r0) goto L2a
                r0 = 2
                if (r3 == r0) goto L22
                r0 = 3
                if (r3 != r0) goto L16
                com.google.android.material.textfield.DropdownMenuEndIconDelegate r3 = new com.google.android.material.textfield.DropdownMenuEndIconDelegate
                com.google.android.material.textfield.EndCompoundLayout r0 = r2.endLayout
                r3.<init>(r0)
                return r3
            L16:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "Invalid end icon mode: "
                java.lang.String r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r3)
                r0.<init>(r3)
                throw r0
            L22:
                com.google.android.material.textfield.ClearTextEndIconDelegate r3 = new com.google.android.material.textfield.ClearTextEndIconDelegate
                com.google.android.material.textfield.EndCompoundLayout r0 = r2.endLayout
                r3.<init>(r0)
                return r3
            L2a:
                com.google.android.material.textfield.PasswordToggleEndIconDelegate r3 = new com.google.android.material.textfield.PasswordToggleEndIconDelegate
                com.google.android.material.textfield.EndCompoundLayout r0 = r2.endLayout
                int r1 = r2.passwordIconDrawableId
                r3.<init>(r0, r1)
                return r3
            L34:
                com.google.android.material.textfield.NoEndIconDelegate r3 = new com.google.android.material.textfield.NoEndIconDelegate
                com.google.android.material.textfield.EndCompoundLayout r0 = r2.endLayout
                r3.<init>(r0)
                return r3
            L3c:
                com.google.android.material.textfield.CustomEndIconDelegate r3 = new com.google.android.material.textfield.CustomEndIconDelegate
                com.google.android.material.textfield.EndCompoundLayout r0 = r2.endLayout
                r3.<init>(r0)
                return r3
        }

        public final com.google.android.material.textfield.EndIconDelegate get(int r3) {
                r2 = this;
                android.util.SparseArray<com.google.android.material.textfield.EndIconDelegate> r0 = r2.delegates
                java.lang.Object r0 = r0.get(r3)
                com.google.android.material.textfield.EndIconDelegate r0 = (com.google.android.material.textfield.EndIconDelegate) r0
                if (r0 != 0) goto L13
                com.google.android.material.textfield.EndIconDelegate r0 = r2.create(r3)
                android.util.SparseArray<com.google.android.material.textfield.EndIconDelegate> r1 = r2.delegates
                r1.append(r3, r0)
            L13:
                return r0
        }
    }

    public EndCompoundLayout(com.google.android.material.textfield.TextInputLayout r7, androidx.appcompat.widget.TintTypedArray r8) {
            r6 = this;
            android.content.Context r0 = r7.getContext()
            r6.<init>(r0)
            r0 = 0
            r6.endIconMode = r0
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            r6.endIconChangedListeners = r1
            com.google.android.material.textfield.EndCompoundLayout$1 r1 = new com.google.android.material.textfield.EndCompoundLayout$1
            r1.<init>(r6)
            r6.editTextWatcher = r1
            com.google.android.material.textfield.EndCompoundLayout$2 r1 = new com.google.android.material.textfield.EndCompoundLayout$2
            r1.<init>(r6)
            r6.onEditTextAttachedListener = r1
            android.content.Context r2 = r6.getContext()
            java.lang.String r3 = "accessibility"
            java.lang.Object r2 = r2.getSystemService(r3)
            android.view.accessibility.AccessibilityManager r2 = (android.view.accessibility.AccessibilityManager) r2
            r6.accessibilityManager = r2
            r6.textInputLayout = r7
            r2 = 8
            r6.setVisibility(r2)
            r6.setOrientation(r0)
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r3 = -2
            r4 = -1
            r5 = 8388613(0x800005, float:1.175495E-38)
            r0.<init>(r3, r4, r5)
            r6.setLayoutParams(r0)
            android.widget.FrameLayout r0 = new android.widget.FrameLayout
            android.content.Context r5 = r6.getContext()
            r0.<init>(r5)
            r6.endIconFrame = r0
            r0.setVisibility(r2)
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            r2.<init>(r3, r4)
            r0.setLayoutParams(r2)
            android.content.Context r2 = r6.getContext()
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r2)
            int r3 = com.google.android.material.R.id.text_input_error_icon
            com.google.android.material.internal.CheckableImageButton r3 = r6.createIconView(r6, r2, r3)
            r6.errorIconView = r3
            int r4 = com.google.android.material.R.id.text_input_end_icon
            com.google.android.material.internal.CheckableImageButton r2 = r6.createIconView(r0, r2, r4)
            r6.endIconView = r2
            com.google.android.material.textfield.EndCompoundLayout$EndIconDelegates r4 = new com.google.android.material.textfield.EndCompoundLayout$EndIconDelegates
            r4.<init>(r6, r8)
            r6.endIconDelegates = r4
            androidx.appcompat.widget.AppCompatTextView r4 = new androidx.appcompat.widget.AppCompatTextView
            android.content.Context r5 = r6.getContext()
            r4.<init>(r5)
            r6.suffixTextView = r4
            r6.initErrorIconView(r8)
            r6.initEndIconView(r8)
            r6.initSuffixTextView(r8)
            r0.addView(r2)
            r6.addView(r4)
            r6.addView(r0)
            r6.addView(r3)
            r7.addOnEditTextAttachedListener(r1)
            com.google.android.material.textfield.EndCompoundLayout$3 r7 = new com.google.android.material.textfield.EndCompoundLayout$3
            r7.<init>(r6)
            r6.addOnAttachStateChangeListener(r7)
            return
    }

    public static /* synthetic */ android.widget.EditText access$000(com.google.android.material.textfield.EndCompoundLayout r0) {
            android.widget.EditText r0 = r0.editText
            return r0
    }

    public static /* synthetic */ android.widget.EditText access$002(com.google.android.material.textfield.EndCompoundLayout r0, android.widget.EditText r1) {
            r0.editText = r1
            return r1
    }

    public static /* synthetic */ android.text.TextWatcher access$100(com.google.android.material.textfield.EndCompoundLayout r0) {
            android.text.TextWatcher r0 = r0.editTextWatcher
            return r0
    }

    public static /* synthetic */ void access$200(com.google.android.material.textfield.EndCompoundLayout r0, com.google.android.material.textfield.EndIconDelegate r1) {
            r0.setOnFocusChangeListenersIfNeeded(r1)
            return
    }

    public static /* synthetic */ void access$300(com.google.android.material.textfield.EndCompoundLayout r0) {
            r0.addTouchExplorationStateChangeListenerIfNeeded()
            return
    }

    public static /* synthetic */ void access$400(com.google.android.material.textfield.EndCompoundLayout r0) {
            r0.removeTouchExplorationStateChangeListenerIfNeeded()
            return
    }

    private void addTouchExplorationStateChangeListenerIfNeeded() {
            r2 = this;
            androidx.core.view.accessibility.AccessibilityManagerCompat$TouchExplorationStateChangeListener r0 = r2.touchExplorationStateChangeListener
            if (r0 == 0) goto L15
            android.view.accessibility.AccessibilityManager r0 = r2.accessibilityManager
            if (r0 == 0) goto L15
            boolean r0 = androidx.core.view.ViewCompat.isAttachedToWindow(r2)
            if (r0 == 0) goto L15
            android.view.accessibility.AccessibilityManager r0 = r2.accessibilityManager
            androidx.core.view.accessibility.AccessibilityManagerCompat$TouchExplorationStateChangeListener r1 = r2.touchExplorationStateChangeListener
            androidx.core.view.accessibility.AccessibilityManagerCompat.addTouchExplorationStateChangeListener(r0, r1)
        L15:
            return
    }

    private com.google.android.material.internal.CheckableImageButton createIconView(android.view.ViewGroup r3, android.view.LayoutInflater r4, @androidx.annotation.IdRes int r5) {
            r2 = this;
            int r0 = com.google.android.material.R.layout.design_text_input_end_icon
            r1 = 0
            android.view.View r3 = r4.inflate(r0, r3, r1)
            com.google.android.material.internal.CheckableImageButton r3 = (com.google.android.material.internal.CheckableImageButton) r3
            r3.setId(r5)
            com.google.android.material.textfield.IconHelper.setCompatRippleBackgroundIfNeeded(r3)
            android.content.Context r4 = r2.getContext()
            boolean r4 = com.google.android.material.resources.MaterialResources.isFontScaleAtLeast1_3(r4)
            if (r4 == 0) goto L22
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r4 = (android.view.ViewGroup.MarginLayoutParams) r4
            androidx.core.view.MarginLayoutParamsCompat.setMarginStart(r4, r1)
        L22:
            return r3
    }

    private void dispatchOnEndIconChanged(int r4) {
            r3 = this;
            java.util.LinkedHashSet<com.google.android.material.textfield.TextInputLayout$OnEndIconChangedListener> r0 = r3.endIconChangedListeners
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L18
            java.lang.Object r1 = r0.next()
            com.google.android.material.textfield.TextInputLayout$OnEndIconChangedListener r1 = (com.google.android.material.textfield.TextInputLayout.OnEndIconChangedListener) r1
            com.google.android.material.textfield.TextInputLayout r2 = r3.textInputLayout
            r1.onEndIconChanged(r2, r4)
            goto L6
        L18:
            return
    }

    private int getIconResId(com.google.android.material.textfield.EndIconDelegate r2) {
            r1 = this;
            com.google.android.material.textfield.EndCompoundLayout$EndIconDelegates r0 = r1.endIconDelegates
            int r0 = com.google.android.material.textfield.EndCompoundLayout.EndIconDelegates.access$500(r0)
            if (r0 != 0) goto Lc
            int r0 = r2.getIconDrawableResId()
        Lc:
            return r0
    }

    private void initEndIconView(androidx.appcompat.widget.TintTypedArray r7) {
            r6 = this;
            int r0 = com.google.android.material.R.styleable.TextInputLayout_passwordToggleEnabled
            boolean r1 = r7.hasValue(r0)
            r2 = 0
            r3 = -1
            if (r1 != 0) goto L2e
            int r1 = com.google.android.material.R.styleable.TextInputLayout_endIconTint
            boolean r4 = r7.hasValue(r1)
            if (r4 == 0) goto L1c
            android.content.Context r4 = r6.getContext()
            android.content.res.ColorStateList r1 = com.google.android.material.resources.MaterialResources.getColorStateList(r4, r7, r1)
            r6.endIconTintList = r1
        L1c:
            int r1 = com.google.android.material.R.styleable.TextInputLayout_endIconTintMode
            boolean r4 = r7.hasValue(r1)
            if (r4 == 0) goto L2e
            int r1 = r7.getInt(r1, r3)
            android.graphics.PorterDuff$Mode r1 = com.google.android.material.internal.ViewUtils.parseTintMode(r1, r2)
            r6.endIconTintMode = r1
        L2e:
            int r1 = com.google.android.material.R.styleable.TextInputLayout_endIconMode
            boolean r4 = r7.hasValue(r1)
            r5 = 0
            if (r4 == 0) goto L58
            int r0 = r7.getInt(r1, r5)
            r6.setEndIconMode(r0)
            int r0 = com.google.android.material.R.styleable.TextInputLayout_endIconContentDescription
            boolean r1 = r7.hasValue(r0)
            if (r1 == 0) goto L4d
            java.lang.CharSequence r0 = r7.getText(r0)
            r6.setEndIconContentDescription(r0)
        L4d:
            int r0 = com.google.android.material.R.styleable.TextInputLayout_endIconCheckable
            r1 = 1
            boolean r0 = r7.getBoolean(r0, r1)
            r6.setEndIconCheckable(r0)
            goto L92
        L58:
            boolean r1 = r7.hasValue(r0)
            if (r1 == 0) goto L92
            int r1 = com.google.android.material.R.styleable.TextInputLayout_passwordToggleTint
            boolean r4 = r7.hasValue(r1)
            if (r4 == 0) goto L70
            android.content.Context r4 = r6.getContext()
            android.content.res.ColorStateList r1 = com.google.android.material.resources.MaterialResources.getColorStateList(r4, r7, r1)
            r6.endIconTintList = r1
        L70:
            int r1 = com.google.android.material.R.styleable.TextInputLayout_passwordToggleTintMode
            boolean r4 = r7.hasValue(r1)
            if (r4 == 0) goto L82
            int r1 = r7.getInt(r1, r3)
            android.graphics.PorterDuff$Mode r1 = com.google.android.material.internal.ViewUtils.parseTintMode(r1, r2)
            r6.endIconTintMode = r1
        L82:
            boolean r0 = r7.getBoolean(r0, r5)
            r6.setEndIconMode(r0)
            int r0 = com.google.android.material.R.styleable.TextInputLayout_passwordToggleContentDescription
            java.lang.CharSequence r0 = r7.getText(r0)
            r6.setEndIconContentDescription(r0)
        L92:
            int r0 = com.google.android.material.R.styleable.TextInputLayout_endIconMinSize
            android.content.res.Resources r1 = r6.getResources()
            int r2 = com.google.android.material.R.dimen.mtrl_min_touch_target_size
            int r1 = r1.getDimensionPixelSize(r2)
            int r0 = r7.getDimensionPixelSize(r0, r1)
            r6.setEndIconMinSize(r0)
            int r0 = com.google.android.material.R.styleable.TextInputLayout_endIconScaleType
            boolean r1 = r7.hasValue(r0)
            if (r1 == 0) goto Lc1
            int r7 = r7.getInt(r0, r3)
            android.widget.ImageView$ScaleType r7 = com.google.android.material.textfield.IconHelper.convertScaleType(r7)
            r6.endIconScaleType = r7
            com.google.android.material.internal.CheckableImageButton r0 = r6.endIconView
            r0.setScaleType(r7)
            com.google.android.material.internal.CheckableImageButton r0 = r6.errorIconView
            r0.setScaleType(r7)
        Lc1:
            return
    }

    private void initErrorIconView(androidx.appcompat.widget.TintTypedArray r3) {
            r2 = this;
            int r0 = com.google.android.material.R.styleable.TextInputLayout_errorIconTint
            boolean r1 = r3.hasValue(r0)
            if (r1 == 0) goto L12
            android.content.Context r1 = r2.getContext()
            android.content.res.ColorStateList r0 = com.google.android.material.resources.MaterialResources.getColorStateList(r1, r3, r0)
            r2.errorIconTintList = r0
        L12:
            int r0 = com.google.android.material.R.styleable.TextInputLayout_errorIconTintMode
            boolean r1 = r3.hasValue(r0)
            if (r1 == 0) goto L26
            r1 = -1
            int r0 = r3.getInt(r0, r1)
            r1 = 0
            android.graphics.PorterDuff$Mode r0 = com.google.android.material.internal.ViewUtils.parseTintMode(r0, r1)
            r2.errorIconTintMode = r0
        L26:
            int r0 = com.google.android.material.R.styleable.TextInputLayout_errorIconDrawable
            boolean r1 = r3.hasValue(r0)
            if (r1 == 0) goto L35
            android.graphics.drawable.Drawable r3 = r3.getDrawable(r0)
            r2.setErrorIconDrawable(r3)
        L35:
            com.google.android.material.internal.CheckableImageButton r3 = r2.errorIconView
            android.content.res.Resources r0 = r2.getResources()
            int r1 = com.google.android.material.R.string.error_icon_content_description
            java.lang.CharSequence r0 = r0.getText(r1)
            r3.setContentDescription(r0)
            com.google.android.material.internal.CheckableImageButton r3 = r2.errorIconView
            r0 = 2
            androidx.core.view.ViewCompat.setImportantForAccessibility(r3, r0)
            com.google.android.material.internal.CheckableImageButton r3 = r2.errorIconView
            r0 = 0
            r3.setClickable(r0)
            com.google.android.material.internal.CheckableImageButton r3 = r2.errorIconView
            r3.setPressable(r0)
            com.google.android.material.internal.CheckableImageButton r3 = r2.errorIconView
            r3.setFocusable(r0)
            return
    }

    private void initSuffixTextView(androidx.appcompat.widget.TintTypedArray r5) {
            r4 = this;
            android.widget.TextView r0 = r4.suffixTextView
            r1 = 8
            r0.setVisibility(r1)
            android.widget.TextView r0 = r4.suffixTextView
            int r1 = com.google.android.material.R.id.textinput_suffix_text
            r0.setId(r1)
            android.widget.TextView r0 = r4.suffixTextView
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r2 = -2
            r3 = 1117782016(0x42a00000, float:80.0)
            r1.<init>(r2, r2, r3)
            r0.setLayoutParams(r1)
            android.widget.TextView r0 = r4.suffixTextView
            r1 = 1
            androidx.core.view.ViewCompat.setAccessibilityLiveRegion(r0, r1)
            int r0 = com.google.android.material.R.styleable.TextInputLayout_suffixTextAppearance
            r1 = 0
            int r0 = r5.getResourceId(r0, r1)
            android.widget.TextView r1 = r4.suffixTextView
            androidx.core.widget.TextViewCompat.setTextAppearance(r1, r0)
            int r0 = com.google.android.material.R.styleable.TextInputLayout_suffixTextColor
            boolean r1 = r5.hasValue(r0)
            if (r1 == 0) goto L3e
            android.content.res.ColorStateList r0 = r5.getColorStateList(r0)
            android.widget.TextView r1 = r4.suffixTextView
            r1.setTextColor(r0)
        L3e:
            int r0 = com.google.android.material.R.styleable.TextInputLayout_suffixText
            java.lang.CharSequence r5 = r5.getText(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 == 0) goto L4c
            r0 = 0
            goto L4d
        L4c:
            r0 = r5
        L4d:
            r4.suffixText = r0
            android.widget.TextView r0 = r4.suffixTextView
            r0.setText(r5)
            r4.updateSuffixTextVisibility()
            return
    }

    private void removeTouchExplorationStateChangeListenerIfNeeded() {
            r2 = this;
            androidx.core.view.accessibility.AccessibilityManagerCompat$TouchExplorationStateChangeListener r0 = r2.touchExplorationStateChangeListener
            if (r0 == 0) goto Lb
            android.view.accessibility.AccessibilityManager r1 = r2.accessibilityManager
            if (r1 == 0) goto Lb
            androidx.core.view.accessibility.AccessibilityManagerCompat.removeTouchExplorationStateChangeListener(r1, r0)
        Lb:
            return
    }

    private void setOnFocusChangeListenersIfNeeded(com.google.android.material.textfield.EndIconDelegate r3) {
            r2 = this;
            android.widget.EditText r0 = r2.editText
            if (r0 != 0) goto L5
            return
        L5:
            android.view.View$OnFocusChangeListener r0 = r3.getOnEditTextFocusChangeListener()
            if (r0 == 0) goto L14
            android.widget.EditText r0 = r2.editText
            android.view.View$OnFocusChangeListener r1 = r3.getOnEditTextFocusChangeListener()
            r0.setOnFocusChangeListener(r1)
        L14:
            android.view.View$OnFocusChangeListener r0 = r3.getOnIconViewFocusChangeListener()
            if (r0 == 0) goto L23
            com.google.android.material.internal.CheckableImageButton r0 = r2.endIconView
            android.view.View$OnFocusChangeListener r3 = r3.getOnIconViewFocusChangeListener()
            r0.setOnFocusChangeListener(r3)
        L23:
            return
    }

    private void setUpDelegate(@androidx.annotation.NonNull com.google.android.material.textfield.EndIconDelegate r1) {
            r0 = this;
            r1.setUp()
            androidx.core.view.accessibility.AccessibilityManagerCompat$TouchExplorationStateChangeListener r1 = r1.getTouchExplorationStateChangeListener()
            r0.touchExplorationStateChangeListener = r1
            r0.addTouchExplorationStateChangeListenerIfNeeded()
            return
    }

    private void tearDownDelegate(@androidx.annotation.NonNull com.google.android.material.textfield.EndIconDelegate r2) {
            r1 = this;
            r1.removeTouchExplorationStateChangeListenerIfNeeded()
            r0 = 0
            r1.touchExplorationStateChangeListener = r0
            r2.tearDown()
            return
    }

    private void tintEndIconOnError(boolean r4) {
            r3 = this;
            if (r4 == 0) goto L23
            android.graphics.drawable.Drawable r4 = r3.getEndIconDrawable()
            if (r4 == 0) goto L23
            android.graphics.drawable.Drawable r4 = r3.getEndIconDrawable()
            android.graphics.drawable.Drawable r4 = androidx.core.graphics.drawable.DrawableCompat.wrap(r4)
            android.graphics.drawable.Drawable r4 = r4.mutate()
            com.google.android.material.textfield.TextInputLayout r0 = r3.textInputLayout
            int r0 = r0.getErrorCurrentTextColors()
            androidx.core.graphics.drawable.DrawableCompat.setTint(r4, r0)
            com.google.android.material.internal.CheckableImageButton r0 = r3.endIconView
            r0.setImageDrawable(r4)
            goto L2e
        L23:
            com.google.android.material.textfield.TextInputLayout r4 = r3.textInputLayout
            com.google.android.material.internal.CheckableImageButton r0 = r3.endIconView
            android.content.res.ColorStateList r1 = r3.endIconTintList
            android.graphics.PorterDuff$Mode r2 = r3.endIconTintMode
            com.google.android.material.textfield.IconHelper.applyIconTint(r4, r0, r1, r2)
        L2e:
            return
    }

    private void updateEndLayoutVisibility() {
            r4 = this;
            android.widget.FrameLayout r0 = r4.endIconFrame
            com.google.android.material.internal.CheckableImageButton r1 = r4.endIconView
            int r1 = r1.getVisibility()
            r2 = 8
            r3 = 0
            if (r1 != 0) goto L15
            boolean r1 = r4.isErrorIconVisible()
            if (r1 != 0) goto L15
            r1 = 0
            goto L17
        L15:
            r1 = 8
        L17:
            r0.setVisibility(r1)
            java.lang.CharSequence r0 = r4.suffixText
            if (r0 == 0) goto L24
            boolean r0 = r4.hintExpanded
            if (r0 != 0) goto L24
            r0 = 0
            goto L26
        L24:
            r0 = 8
        L26:
            boolean r1 = r4.isEndIconVisible()
            if (r1 != 0) goto L37
            boolean r1 = r4.isErrorIconVisible()
            if (r1 != 0) goto L37
            if (r0 != 0) goto L35
            goto L37
        L35:
            r0 = 0
            goto L38
        L37:
            r0 = 1
        L38:
            if (r0 == 0) goto L3b
            r2 = 0
        L3b:
            r4.setVisibility(r2)
            return
    }

    private void updateErrorIconVisibility() {
            r3 = this;
            com.google.android.material.internal.CheckableImageButton r0 = r3.errorIconView
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
            r1 = 0
            if (r0 == 0) goto L1b
            com.google.android.material.textfield.TextInputLayout r0 = r3.textInputLayout
            boolean r0 = r0.isErrorEnabled()
            if (r0 == 0) goto L1b
            com.google.android.material.textfield.TextInputLayout r0 = r3.textInputLayout
            boolean r0 = r0.shouldShowError()
            if (r0 == 0) goto L1b
            r0 = 1
            goto L1c
        L1b:
            r0 = 0
        L1c:
            com.google.android.material.internal.CheckableImageButton r2 = r3.errorIconView
            if (r0 == 0) goto L21
            goto L23
        L21:
            r1 = 8
        L23:
            r2.setVisibility(r1)
            r3.updateEndLayoutVisibility()
            r3.updateSuffixTextViewPadding()
            boolean r0 = r3.hasEndIcon()
            if (r0 != 0) goto L37
            com.google.android.material.textfield.TextInputLayout r0 = r3.textInputLayout
            r0.updateDummyDrawables()
        L37:
            return
    }

    private void updateSuffixTextVisibility() {
            r3 = this;
            android.widget.TextView r0 = r3.suffixTextView
            int r0 = r0.getVisibility()
            java.lang.CharSequence r1 = r3.suffixText
            r2 = 0
            if (r1 == 0) goto L11
            boolean r1 = r3.hintExpanded
            if (r1 != 0) goto L11
            r1 = 0
            goto L13
        L11:
            r1 = 8
        L13:
            if (r0 == r1) goto L1f
            com.google.android.material.textfield.EndIconDelegate r0 = r3.getEndIconDelegate()
            if (r1 != 0) goto L1c
            r2 = 1
        L1c:
            r0.onSuffixVisibilityChanged(r2)
        L1f:
            r3.updateEndLayoutVisibility()
            android.widget.TextView r0 = r3.suffixTextView
            r0.setVisibility(r1)
            com.google.android.material.textfield.TextInputLayout r0 = r3.textInputLayout
            r0.updateDummyDrawables()
            return
    }

    public final void addOnEndIconChangedListener(@androidx.annotation.NonNull com.google.android.material.textfield.TextInputLayout.OnEndIconChangedListener r2) {
            r1 = this;
            java.util.LinkedHashSet<com.google.android.material.textfield.TextInputLayout$OnEndIconChangedListener> r0 = r1.endIconChangedListeners
            r0.add(r2)
            return
    }

    public final void checkEndIcon() {
            r1 = this;
            com.google.android.material.internal.CheckableImageButton r0 = r1.endIconView
            r0.performClick()
            com.google.android.material.internal.CheckableImageButton r0 = r1.endIconView
            r0.jumpDrawablesToCurrentState()
            return
    }

    public final void clearOnEndIconChangedListeners() {
            r1 = this;
            java.util.LinkedHashSet<com.google.android.material.textfield.TextInputLayout$OnEndIconChangedListener> r0 = r1.endIconChangedListeners
            r0.clear()
            return
    }

    @androidx.annotation.Nullable
    public final com.google.android.material.internal.CheckableImageButton getCurrentEndIconView() {
            r1 = this;
            boolean r0 = r1.isErrorIconVisible()
            if (r0 == 0) goto L9
            com.google.android.material.internal.CheckableImageButton r0 = r1.errorIconView
            return r0
        L9:
            boolean r0 = r1.hasEndIcon()
            if (r0 == 0) goto L18
            boolean r0 = r1.isEndIconVisible()
            if (r0 == 0) goto L18
            com.google.android.material.internal.CheckableImageButton r0 = r1.endIconView
            return r0
        L18:
            r0 = 0
            return r0
    }

    @androidx.annotation.Nullable
    public final java.lang.CharSequence getEndIconContentDescription() {
            r1 = this;
            com.google.android.material.internal.CheckableImageButton r0 = r1.endIconView
            java.lang.CharSequence r0 = r0.getContentDescription()
            return r0
    }

    public final com.google.android.material.textfield.EndIconDelegate getEndIconDelegate() {
            r2 = this;
            com.google.android.material.textfield.EndCompoundLayout$EndIconDelegates r0 = r2.endIconDelegates
            int r1 = r2.endIconMode
            com.google.android.material.textfield.EndIconDelegate r0 = r0.get(r1)
            return r0
    }

    @androidx.annotation.Nullable
    public final android.graphics.drawable.Drawable getEndIconDrawable() {
            r1 = this;
            com.google.android.material.internal.CheckableImageButton r0 = r1.endIconView
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
            return r0
    }

    public final int getEndIconMinSize() {
            r1 = this;
            int r0 = r1.endIconMinSize
            return r0
    }

    public final int getEndIconMode() {
            r1 = this;
            int r0 = r1.endIconMode
            return r0
    }

    @androidx.annotation.NonNull
    public final android.widget.ImageView.ScaleType getEndIconScaleType() {
            r1 = this;
            android.widget.ImageView$ScaleType r0 = r1.endIconScaleType
            return r0
    }

    public final com.google.android.material.internal.CheckableImageButton getEndIconView() {
            r1 = this;
            com.google.android.material.internal.CheckableImageButton r0 = r1.endIconView
            return r0
    }

    public final android.graphics.drawable.Drawable getErrorIconDrawable() {
            r1 = this;
            com.google.android.material.internal.CheckableImageButton r0 = r1.errorIconView
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
            return r0
    }

    @androidx.annotation.Nullable
    public final java.lang.CharSequence getPasswordVisibilityToggleContentDescription() {
            r1 = this;
            com.google.android.material.internal.CheckableImageButton r0 = r1.endIconView
            java.lang.CharSequence r0 = r0.getContentDescription()
            return r0
    }

    @androidx.annotation.Nullable
    public final android.graphics.drawable.Drawable getPasswordVisibilityToggleDrawable() {
            r1 = this;
            com.google.android.material.internal.CheckableImageButton r0 = r1.endIconView
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
            return r0
    }

    @androidx.annotation.Nullable
    public final java.lang.CharSequence getSuffixText() {
            r1 = this;
            java.lang.CharSequence r0 = r1.suffixText
            return r0
    }

    @androidx.annotation.Nullable
    public final android.content.res.ColorStateList getSuffixTextColor() {
            r1 = this;
            android.widget.TextView r0 = r1.suffixTextView
            android.content.res.ColorStateList r0 = r0.getTextColors()
            return r0
    }

    public final android.widget.TextView getSuffixTextView() {
            r1 = this;
            android.widget.TextView r0 = r1.suffixTextView
            return r0
    }

    public final boolean hasEndIcon() {
            r1 = this;
            int r0 = r1.endIconMode
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    public final boolean isEndIconCheckable() {
            r1 = this;
            com.google.android.material.internal.CheckableImageButton r0 = r1.endIconView
            boolean r0 = r0.isCheckable()
            return r0
    }

    public final boolean isEndIconChecked() {
            r1 = this;
            boolean r0 = r1.hasEndIcon()
            if (r0 == 0) goto L10
            com.google.android.material.internal.CheckableImageButton r0 = r1.endIconView
            boolean r0 = r0.isChecked()
            if (r0 == 0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            return r0
    }

    public final boolean isEndIconVisible() {
            r1 = this;
            android.widget.FrameLayout r0 = r1.endIconFrame
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L12
            com.google.android.material.internal.CheckableImageButton r0 = r1.endIconView
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L12
            r0 = 1
            goto L13
        L12:
            r0 = 0
        L13:
            return r0
    }

    public final boolean isErrorIconVisible() {
            r1 = this;
            com.google.android.material.internal.CheckableImageButton r0 = r1.errorIconView
            int r0 = r0.getVisibility()
            if (r0 != 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }

    public final boolean isPasswordVisibilityToggleEnabled() {
            r2 = this;
            int r0 = r2.endIconMode
            r1 = 1
            if (r0 != r1) goto L6
            goto L7
        L6:
            r1 = 0
        L7:
            return r1
    }

    public final void onHintStateChanged(boolean r1) {
            r0 = this;
            r0.hintExpanded = r1
            r0.updateSuffixTextVisibility()
            return
    }

    public final void onTextInputBoxStateUpdated() {
            r1 = this;
            r1.updateErrorIconVisibility()
            r1.refreshErrorIconDrawableState()
            r1.refreshEndIconDrawableState()
            com.google.android.material.textfield.EndIconDelegate r0 = r1.getEndIconDelegate()
            java.util.Objects.requireNonNull(r0)
            boolean r0 = r0 instanceof com.google.android.material.textfield.DropdownMenuEndIconDelegate
            if (r0 == 0) goto L1d
            com.google.android.material.textfield.TextInputLayout r0 = r1.textInputLayout
            boolean r0 = r0.shouldShowError()
            r1.tintEndIconOnError(r0)
        L1d:
            return
    }

    public final void refreshEndIconDrawableState() {
            r3 = this;
            com.google.android.material.textfield.TextInputLayout r0 = r3.textInputLayout
            com.google.android.material.internal.CheckableImageButton r1 = r3.endIconView
            android.content.res.ColorStateList r2 = r3.endIconTintList
            com.google.android.material.textfield.IconHelper.refreshIconDrawableState(r0, r1, r2)
            return
    }

    public final void refreshErrorIconDrawableState() {
            r3 = this;
            com.google.android.material.textfield.TextInputLayout r0 = r3.textInputLayout
            com.google.android.material.internal.CheckableImageButton r1 = r3.errorIconView
            android.content.res.ColorStateList r2 = r3.errorIconTintList
            com.google.android.material.textfield.IconHelper.refreshIconDrawableState(r0, r1, r2)
            return
    }

    public final void refreshIconState(boolean r5) {
            r4 = this;
            com.google.android.material.textfield.EndIconDelegate r0 = r4.getEndIconDelegate()
            boolean r1 = r0.isIconCheckable()
            r2 = 1
            if (r1 == 0) goto L1f
            com.google.android.material.internal.CheckableImageButton r1 = r4.endIconView
            boolean r1 = r1.isChecked()
            boolean r3 = r0.isIconChecked()
            if (r1 == r3) goto L1f
            com.google.android.material.internal.CheckableImageButton r3 = r4.endIconView
            r1 = r1 ^ r2
            r3.setChecked(r1)
            r1 = 1
            goto L20
        L1f:
            r1 = 0
        L20:
            boolean r3 = r0 instanceof com.google.android.material.textfield.DropdownMenuEndIconDelegate
            if (r3 == 0) goto L38
            com.google.android.material.internal.CheckableImageButton r3 = r4.endIconView
            boolean r3 = r3.isActivated()
            boolean r0 = r0.isIconActivated()
            if (r3 == r0) goto L38
            r0 = r3 ^ 1
            com.google.android.material.internal.CheckableImageButton r1 = r4.endIconView
            r1.setActivated(r0)
            goto L39
        L38:
            r2 = r1
        L39:
            if (r5 != 0) goto L3d
            if (r2 == 0) goto L40
        L3d:
            r4.refreshEndIconDrawableState()
        L40:
            return
    }

    public final void removeOnEndIconChangedListener(@androidx.annotation.NonNull com.google.android.material.textfield.TextInputLayout.OnEndIconChangedListener r2) {
            r1 = this;
            java.util.LinkedHashSet<com.google.android.material.textfield.TextInputLayout$OnEndIconChangedListener> r0 = r1.endIconChangedListeners
            r0.remove(r2)
            return
    }

    public final void setEndIconActivated(boolean r2) {
            r1 = this;
            com.google.android.material.internal.CheckableImageButton r0 = r1.endIconView
            r0.setActivated(r2)
            return
    }

    public final void setEndIconCheckable(boolean r2) {
            r1 = this;
            com.google.android.material.internal.CheckableImageButton r0 = r1.endIconView
            r0.setCheckable(r2)
            return
    }

    public final void setEndIconContentDescription(@androidx.annotation.Nullable java.lang.CharSequence r2) {
            r1 = this;
            com.google.android.material.internal.CheckableImageButton r0 = r1.endIconView
            java.lang.CharSequence r0 = r0.getContentDescription()
            if (r0 == r2) goto Ld
            com.google.android.material.internal.CheckableImageButton r0 = r1.endIconView
            r0.setContentDescription(r2)
        Ld:
            return
    }

    public final void setEndIconDrawable(@androidx.annotation.Nullable android.graphics.drawable.Drawable r4) {
            r3 = this;
            com.google.android.material.internal.CheckableImageButton r0 = r3.endIconView
            r0.setImageDrawable(r4)
            if (r4 == 0) goto L15
            com.google.android.material.textfield.TextInputLayout r4 = r3.textInputLayout
            com.google.android.material.internal.CheckableImageButton r0 = r3.endIconView
            android.content.res.ColorStateList r1 = r3.endIconTintList
            android.graphics.PorterDuff$Mode r2 = r3.endIconTintMode
            com.google.android.material.textfield.IconHelper.applyIconTint(r4, r0, r1, r2)
            r3.refreshEndIconDrawableState()
        L15:
            return
    }

    public final void setEndIconMinSize(@androidx.annotation.Px int r2) {
            r1 = this;
            if (r2 < 0) goto L13
            int r0 = r1.endIconMinSize
            if (r2 == r0) goto L12
            r1.endIconMinSize = r2
            com.google.android.material.internal.CheckableImageButton r0 = r1.endIconView
            com.google.android.material.textfield.IconHelper.setIconMinSize(r0, r2)
            com.google.android.material.internal.CheckableImageButton r0 = r1.errorIconView
            com.google.android.material.textfield.IconHelper.setIconMinSize(r0, r2)
        L12:
            return
        L13:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "endIconSize cannot be less than 0"
            r2.<init>(r0)
            throw r2
    }

    public final void setEndIconMode(int r6) {
            r5 = this;
            int r0 = r5.endIconMode
            if (r0 != r6) goto L5
            return
        L5:
            com.google.android.material.textfield.EndIconDelegate r0 = r5.getEndIconDelegate()
            r5.tearDownDelegate(r0)
            int r0 = r5.endIconMode
            r5.endIconMode = r6
            r5.dispatchOnEndIconChanged(r0)
            r0 = 1
            if (r6 == 0) goto L18
            r1 = 1
            goto L19
        L18:
            r1 = 0
        L19:
            r5.setEndIconVisible(r1)
            com.google.android.material.textfield.EndIconDelegate r1 = r5.getEndIconDelegate()
            int r2 = r5.getIconResId(r1)
            r3 = 0
            if (r2 == 0) goto L30
            android.content.Context r4 = r5.getContext()
            android.graphics.drawable.Drawable r2 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r4, r2)
            goto L31
        L30:
            r2 = r3
        L31:
            r5.setEndIconDrawable(r2)
            int r2 = r1.getIconContentDescriptionResId()
            if (r2 == 0) goto L42
            android.content.res.Resources r3 = r5.getResources()
            java.lang.CharSequence r3 = r3.getText(r2)
        L42:
            r5.setEndIconContentDescription(r3)
            boolean r2 = r1.isIconCheckable()
            r5.setEndIconCheckable(r2)
            com.google.android.material.textfield.TextInputLayout r2 = r5.textInputLayout
            int r2 = r2.getBoxBackgroundMode()
            boolean r2 = r1.isBoxBackgroundModeSupported(r2)
            if (r2 == 0) goto L7f
            r5.setUpDelegate(r1)
            android.view.View$OnClickListener r6 = r1.getOnIconClickListener()
            com.google.android.material.internal.CheckableImageButton r2 = r5.endIconView
            android.view.View$OnLongClickListener r3 = r5.endIconOnLongClickListener
            com.google.android.material.textfield.IconHelper.setIconOnClickListener(r2, r6, r3)
            android.widget.EditText r6 = r5.editText
            if (r6 == 0) goto L70
            r1.onEditTextAttached(r6)
            r5.setOnFocusChangeListenersIfNeeded(r1)
        L70:
            com.google.android.material.textfield.TextInputLayout r6 = r5.textInputLayout
            com.google.android.material.internal.CheckableImageButton r1 = r5.endIconView
            android.content.res.ColorStateList r2 = r5.endIconTintList
            android.graphics.PorterDuff$Mode r3 = r5.endIconTintMode
            com.google.android.material.textfield.IconHelper.applyIconTint(r6, r1, r2, r3)
            r5.refreshIconState(r0)
            return
        L7f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "The current box background mode "
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
            com.google.android.material.textfield.TextInputLayout r2 = r5.textInputLayout
            int r2 = r2.getBoxBackgroundMode()
            r1.append(r2)
            java.lang.String r2 = " is not supported by the end icon mode "
            r1.append(r2)
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            r0.<init>(r6)
            throw r0
    }

    public final void setEndIconOnClickListener(@androidx.annotation.Nullable android.view.View.OnClickListener r3) {
            r2 = this;
            com.google.android.material.internal.CheckableImageButton r0 = r2.endIconView
            android.view.View$OnLongClickListener r1 = r2.endIconOnLongClickListener
            com.google.android.material.textfield.IconHelper.setIconOnClickListener(r0, r3, r1)
            return
    }

    public final void setEndIconOnLongClickListener(@androidx.annotation.Nullable android.view.View.OnLongClickListener r2) {
            r1 = this;
            r1.endIconOnLongClickListener = r2
            com.google.android.material.internal.CheckableImageButton r0 = r1.endIconView
            com.google.android.material.textfield.IconHelper.setIconOnLongClickListener(r0, r2)
            return
    }

    public final void setEndIconScaleType(@androidx.annotation.NonNull android.widget.ImageView.ScaleType r2) {
            r1 = this;
            r1.endIconScaleType = r2
            com.google.android.material.internal.CheckableImageButton r0 = r1.endIconView
            r0.setScaleType(r2)
            com.google.android.material.internal.CheckableImageButton r0 = r1.errorIconView
            r0.setScaleType(r2)
            return
    }

    public final void setEndIconTintList(@androidx.annotation.Nullable android.content.res.ColorStateList r4) {
            r3 = this;
            android.content.res.ColorStateList r0 = r3.endIconTintList
            if (r0 == r4) goto Lf
            r3.endIconTintList = r4
            com.google.android.material.textfield.TextInputLayout r0 = r3.textInputLayout
            com.google.android.material.internal.CheckableImageButton r1 = r3.endIconView
            android.graphics.PorterDuff$Mode r2 = r3.endIconTintMode
            com.google.android.material.textfield.IconHelper.applyIconTint(r0, r1, r4, r2)
        Lf:
            return
    }

    public final void setEndIconTintMode(@androidx.annotation.Nullable android.graphics.PorterDuff.Mode r4) {
            r3 = this;
            android.graphics.PorterDuff$Mode r0 = r3.endIconTintMode
            if (r0 == r4) goto Lf
            r3.endIconTintMode = r4
            com.google.android.material.textfield.TextInputLayout r0 = r3.textInputLayout
            com.google.android.material.internal.CheckableImageButton r1 = r3.endIconView
            android.content.res.ColorStateList r2 = r3.endIconTintList
            com.google.android.material.textfield.IconHelper.applyIconTint(r0, r1, r2, r4)
        Lf:
            return
    }

    public final void setEndIconVisible(boolean r2) {
            r1 = this;
            boolean r0 = r1.isEndIconVisible()
            if (r0 == r2) goto L1c
            com.google.android.material.internal.CheckableImageButton r0 = r1.endIconView
            if (r2 == 0) goto Lc
            r2 = 0
            goto Le
        Lc:
            r2 = 8
        Le:
            r0.setVisibility(r2)
            r1.updateEndLayoutVisibility()
            r1.updateSuffixTextViewPadding()
            com.google.android.material.textfield.TextInputLayout r2 = r1.textInputLayout
            r2.updateDummyDrawables()
        L1c:
            return
    }

    public final void setErrorIconDrawable(@androidx.annotation.Nullable android.graphics.drawable.Drawable r4) {
            r3 = this;
            com.google.android.material.internal.CheckableImageButton r0 = r3.errorIconView
            r0.setImageDrawable(r4)
            r3.updateErrorIconVisibility()
            com.google.android.material.textfield.TextInputLayout r4 = r3.textInputLayout
            com.google.android.material.internal.CheckableImageButton r0 = r3.errorIconView
            android.content.res.ColorStateList r1 = r3.errorIconTintList
            android.graphics.PorterDuff$Mode r2 = r3.errorIconTintMode
            com.google.android.material.textfield.IconHelper.applyIconTint(r4, r0, r1, r2)
            return
    }

    public final void setErrorIconOnClickListener(@androidx.annotation.Nullable android.view.View.OnClickListener r3) {
            r2 = this;
            com.google.android.material.internal.CheckableImageButton r0 = r2.errorIconView
            android.view.View$OnLongClickListener r1 = r2.errorIconOnLongClickListener
            com.google.android.material.textfield.IconHelper.setIconOnClickListener(r0, r3, r1)
            return
    }

    public final void setErrorIconOnLongClickListener(@androidx.annotation.Nullable android.view.View.OnLongClickListener r2) {
            r1 = this;
            r1.errorIconOnLongClickListener = r2
            com.google.android.material.internal.CheckableImageButton r0 = r1.errorIconView
            com.google.android.material.textfield.IconHelper.setIconOnLongClickListener(r0, r2)
            return
    }

    public final void setErrorIconTintList(@androidx.annotation.Nullable android.content.res.ColorStateList r4) {
            r3 = this;
            android.content.res.ColorStateList r0 = r3.errorIconTintList
            if (r0 == r4) goto Lf
            r3.errorIconTintList = r4
            com.google.android.material.textfield.TextInputLayout r0 = r3.textInputLayout
            com.google.android.material.internal.CheckableImageButton r1 = r3.errorIconView
            android.graphics.PorterDuff$Mode r2 = r3.errorIconTintMode
            com.google.android.material.textfield.IconHelper.applyIconTint(r0, r1, r4, r2)
        Lf:
            return
    }

    public final void setErrorIconTintMode(@androidx.annotation.Nullable android.graphics.PorterDuff.Mode r4) {
            r3 = this;
            android.graphics.PorterDuff$Mode r0 = r3.errorIconTintMode
            if (r0 == r4) goto Lf
            r3.errorIconTintMode = r4
            com.google.android.material.textfield.TextInputLayout r0 = r3.textInputLayout
            com.google.android.material.internal.CheckableImageButton r1 = r3.errorIconView
            android.content.res.ColorStateList r2 = r3.errorIconTintList
            com.google.android.material.textfield.IconHelper.applyIconTint(r0, r1, r2, r4)
        Lf:
            return
    }

    public final void setPasswordVisibilityToggleContentDescription(@androidx.annotation.StringRes int r2) {
            r1 = this;
            if (r2 == 0) goto Lb
            android.content.res.Resources r0 = r1.getResources()
            java.lang.CharSequence r2 = r0.getText(r2)
            goto Lc
        Lb:
            r2 = 0
        Lc:
            com.google.android.material.internal.CheckableImageButton r0 = r1.endIconView
            r0.setContentDescription(r2)
            return
    }

    public final void setPasswordVisibilityToggleContentDescription(@androidx.annotation.Nullable java.lang.CharSequence r2) {
            r1 = this;
            com.google.android.material.internal.CheckableImageButton r0 = r1.endIconView
            r0.setContentDescription(r2)
            return
    }

    public final void setPasswordVisibilityToggleDrawable(@androidx.annotation.DrawableRes int r2) {
            r1 = this;
            if (r2 == 0) goto Lb
            android.content.Context r0 = r1.getContext()
            android.graphics.drawable.Drawable r2 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r0, r2)
            goto Lc
        Lb:
            r2 = 0
        Lc:
            com.google.android.material.internal.CheckableImageButton r0 = r1.endIconView
            r0.setImageDrawable(r2)
            return
    }

    public final void setPasswordVisibilityToggleDrawable(@androidx.annotation.Nullable android.graphics.drawable.Drawable r2) {
            r1 = this;
            com.google.android.material.internal.CheckableImageButton r0 = r1.endIconView
            r0.setImageDrawable(r2)
            return
    }

    public final void setPasswordVisibilityToggleEnabled(boolean r3) {
            r2 = this;
            if (r3 == 0) goto Lb
            int r0 = r2.endIconMode
            r1 = 1
            if (r0 == r1) goto Lb
            r2.setEndIconMode(r1)
            goto L11
        Lb:
            if (r3 != 0) goto L11
            r3 = 0
            r2.setEndIconMode(r3)
        L11:
            return
    }

    public final void setPasswordVisibilityToggleTintList(@androidx.annotation.Nullable android.content.res.ColorStateList r4) {
            r3 = this;
            r3.endIconTintList = r4
            com.google.android.material.textfield.TextInputLayout r0 = r3.textInputLayout
            com.google.android.material.internal.CheckableImageButton r1 = r3.endIconView
            android.graphics.PorterDuff$Mode r2 = r3.endIconTintMode
            com.google.android.material.textfield.IconHelper.applyIconTint(r0, r1, r4, r2)
            return
    }

    public final void setPasswordVisibilityToggleTintMode(@androidx.annotation.Nullable android.graphics.PorterDuff.Mode r4) {
            r3 = this;
            r3.endIconTintMode = r4
            com.google.android.material.textfield.TextInputLayout r0 = r3.textInputLayout
            com.google.android.material.internal.CheckableImageButton r1 = r3.endIconView
            android.content.res.ColorStateList r2 = r3.endIconTintList
            com.google.android.material.textfield.IconHelper.applyIconTint(r0, r1, r2, r4)
            return
    }

    public final void setSuffixText(@androidx.annotation.Nullable java.lang.CharSequence r2) {
            r1 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L8
            r0 = 0
            goto L9
        L8:
            r0 = r2
        L9:
            r1.suffixText = r0
            android.widget.TextView r0 = r1.suffixTextView
            r0.setText(r2)
            r1.updateSuffixTextVisibility()
            return
    }

    public final void setSuffixTextAppearance(@androidx.annotation.StyleRes int r2) {
            r1 = this;
            android.widget.TextView r0 = r1.suffixTextView
            androidx.core.widget.TextViewCompat.setTextAppearance(r0, r2)
            return
    }

    public final void setSuffixTextColor(@androidx.annotation.NonNull android.content.res.ColorStateList r2) {
            r1 = this;
            android.widget.TextView r0 = r1.suffixTextView
            r0.setTextColor(r2)
            return
    }

    public final void togglePasswordVisibilityToggle(boolean r3) {
            r2 = this;
            int r0 = r2.endIconMode
            r1 = 1
            if (r0 != r1) goto L11
            com.google.android.material.internal.CheckableImageButton r0 = r2.endIconView
            r0.performClick()
            if (r3 == 0) goto L11
            com.google.android.material.internal.CheckableImageButton r3 = r2.endIconView
            r3.jumpDrawablesToCurrentState()
        L11:
            return
    }

    public final void updateSuffixTextViewPadding() {
            r5 = this;
            com.google.android.material.textfield.TextInputLayout r0 = r5.textInputLayout
            android.widget.EditText r0 = r0.editText
            if (r0 != 0) goto L7
            return
        L7:
            boolean r0 = r5.isEndIconVisible()
            if (r0 != 0) goto L1d
            boolean r0 = r5.isErrorIconVisible()
            if (r0 == 0) goto L14
            goto L1d
        L14:
            com.google.android.material.textfield.TextInputLayout r0 = r5.textInputLayout
            android.widget.EditText r0 = r0.editText
            int r0 = androidx.core.view.ViewCompat.getPaddingEnd(r0)
            goto L1e
        L1d:
            r0 = 0
        L1e:
            android.widget.TextView r1 = r5.suffixTextView
            android.content.Context r2 = r5.getContext()
            android.content.res.Resources r2 = r2.getResources()
            int r3 = com.google.android.material.R.dimen.material_input_text_to_prefix_suffix_padding
            int r2 = r2.getDimensionPixelSize(r3)
            com.google.android.material.textfield.TextInputLayout r3 = r5.textInputLayout
            android.widget.EditText r3 = r3.editText
            int r3 = r3.getPaddingTop()
            com.google.android.material.textfield.TextInputLayout r4 = r5.textInputLayout
            android.widget.EditText r4 = r4.editText
            int r4 = r4.getPaddingBottom()
            androidx.core.view.ViewCompat.setPaddingRelative(r1, r2, r3, r0, r4)
            return
    }
}
