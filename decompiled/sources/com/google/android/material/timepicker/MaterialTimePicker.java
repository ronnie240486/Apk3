package com.google.android.material.timepicker;

/* JADX INFO: loaded from: classes2.dex */
public final class MaterialTimePicker extends androidx.fragment.app.DialogFragment implements com.google.android.material.timepicker.TimePickerView.OnDoubleTapListener {
    public static final int INPUT_MODE_CLOCK = 0;
    public static final int INPUT_MODE_KEYBOARD = 1;

    @androidx.annotation.Nullable
    private com.google.android.material.timepicker.TimePickerPresenter activePresenter;
    private android.widget.Button cancelButton;
    private final java.util.Set<android.content.DialogInterface.OnCancelListener> cancelListeners;

    @androidx.annotation.DrawableRes
    private int clockIcon;
    private final java.util.Set<android.content.DialogInterface.OnDismissListener> dismissListeners;
    private int inputMode;

    @androidx.annotation.DrawableRes
    private int keyboardIcon;
    private com.google.android.material.button.MaterialButton modeButton;
    private final java.util.Set<android.view.View.OnClickListener> negativeButtonListeners;
    private java.lang.CharSequence negativeButtonText;

    @androidx.annotation.StringRes
    private int negativeButtonTextResId;
    private int overrideThemeResId;
    private final java.util.Set<android.view.View.OnClickListener> positiveButtonListeners;
    private java.lang.CharSequence positiveButtonText;

    @androidx.annotation.StringRes
    private int positiveButtonTextResId;
    private android.view.ViewStub textInputStub;
    private com.google.android.material.timepicker.TimeModel time;

    @androidx.annotation.Nullable
    private com.google.android.material.timepicker.TimePickerClockPresenter timePickerClockPresenter;

    @androidx.annotation.Nullable
    private com.google.android.material.timepicker.TimePickerTextInputPresenter timePickerTextInputPresenter;
    private com.google.android.material.timepicker.TimePickerView timePickerView;

    @androidx.annotation.StringRes
    private int titleResId;
    private java.lang.CharSequence titleText;




    /* JADX INFO: loaded from: classes.dex */
    public static final class Builder {

        @androidx.annotation.Nullable
        private java.lang.Integer inputMode;
        private java.lang.CharSequence negativeButtonText;

        @androidx.annotation.StringRes
        private int negativeButtonTextResId;
        private int overrideThemeResId;
        private java.lang.CharSequence positiveButtonText;

        @androidx.annotation.StringRes
        private int positiveButtonTextResId;
        private com.google.android.material.timepicker.TimeModel time;
        private java.lang.CharSequence titleText;

        @androidx.annotation.StringRes
        private int titleTextResId;

        public Builder() {
                r1 = this;
                r1.<init>()
                com.google.android.material.timepicker.TimeModel r0 = new com.google.android.material.timepicker.TimeModel
                r0.<init>()
                r1.time = r0
                r0 = 0
                r1.titleTextResId = r0
                r1.positiveButtonTextResId = r0
                r1.negativeButtonTextResId = r0
                r1.overrideThemeResId = r0
                return
        }

        public static /* synthetic */ com.google.android.material.timepicker.TimeModel access$000(com.google.android.material.timepicker.MaterialTimePicker.Builder r0) {
                com.google.android.material.timepicker.TimeModel r0 = r0.time
                return r0
        }

        public static /* synthetic */ java.lang.Integer access$100(com.google.android.material.timepicker.MaterialTimePicker.Builder r0) {
                java.lang.Integer r0 = r0.inputMode
                return r0
        }

        public static /* synthetic */ int access$200(com.google.android.material.timepicker.MaterialTimePicker.Builder r0) {
                int r0 = r0.titleTextResId
                return r0
        }

        public static /* synthetic */ java.lang.CharSequence access$300(com.google.android.material.timepicker.MaterialTimePicker.Builder r0) {
                java.lang.CharSequence r0 = r0.titleText
                return r0
        }

        public static /* synthetic */ int access$400(com.google.android.material.timepicker.MaterialTimePicker.Builder r0) {
                int r0 = r0.positiveButtonTextResId
                return r0
        }

        public static /* synthetic */ java.lang.CharSequence access$500(com.google.android.material.timepicker.MaterialTimePicker.Builder r0) {
                java.lang.CharSequence r0 = r0.positiveButtonText
                return r0
        }

        public static /* synthetic */ int access$600(com.google.android.material.timepicker.MaterialTimePicker.Builder r0) {
                int r0 = r0.negativeButtonTextResId
                return r0
        }

        public static /* synthetic */ java.lang.CharSequence access$700(com.google.android.material.timepicker.MaterialTimePicker.Builder r0) {
                java.lang.CharSequence r0 = r0.negativeButtonText
                return r0
        }

        public static /* synthetic */ int access$800(com.google.android.material.timepicker.MaterialTimePicker.Builder r0) {
                int r0 = r0.overrideThemeResId
                return r0
        }

        @androidx.annotation.NonNull
        public com.google.android.material.timepicker.MaterialTimePicker build() {
                r1 = this;
                com.google.android.material.timepicker.MaterialTimePicker r0 = com.google.android.material.timepicker.MaterialTimePicker.access$1400(r1)
                return r0
        }

        @androidx.annotation.NonNull
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.material.timepicker.MaterialTimePicker.Builder setHour(@androidx.annotation.IntRange(from = 0, to = 23) int r2) {
                r1 = this;
                com.google.android.material.timepicker.TimeModel r0 = r1.time
                r0.setHourOfDay(r2)
                return r1
        }

        @androidx.annotation.NonNull
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.material.timepicker.MaterialTimePicker.Builder setInputMode(int r1) {
                r0 = this;
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r0.inputMode = r1
                return r0
        }

        @androidx.annotation.NonNull
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.material.timepicker.MaterialTimePicker.Builder setMinute(@androidx.annotation.IntRange(from = 0, to = 59) int r2) {
                r1 = this;
                com.google.android.material.timepicker.TimeModel r0 = r1.time
                r0.setMinute(r2)
                return r1
        }

        @androidx.annotation.NonNull
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.material.timepicker.MaterialTimePicker.Builder setNegativeButtonText(@androidx.annotation.StringRes int r1) {
                r0 = this;
                r0.negativeButtonTextResId = r1
                return r0
        }

        @androidx.annotation.NonNull
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.material.timepicker.MaterialTimePicker.Builder setNegativeButtonText(@androidx.annotation.Nullable java.lang.CharSequence r1) {
                r0 = this;
                r0.negativeButtonText = r1
                return r0
        }

        @androidx.annotation.NonNull
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.material.timepicker.MaterialTimePicker.Builder setPositiveButtonText(@androidx.annotation.StringRes int r1) {
                r0 = this;
                r0.positiveButtonTextResId = r1
                return r0
        }

        @androidx.annotation.NonNull
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.material.timepicker.MaterialTimePicker.Builder setPositiveButtonText(@androidx.annotation.Nullable java.lang.CharSequence r1) {
                r0 = this;
                r0.positiveButtonText = r1
                return r0
        }

        @androidx.annotation.NonNull
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.material.timepicker.MaterialTimePicker.Builder setTheme(@androidx.annotation.StyleRes int r1) {
                r0 = this;
                r0.overrideThemeResId = r1
                return r0
        }

        @androidx.annotation.NonNull
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.material.timepicker.MaterialTimePicker.Builder setTimeFormat(int r4) {
                r3 = this;
                com.google.android.material.timepicker.TimeModel r0 = r3.time
                int r1 = r0.hour
                int r0 = r0.minute
                com.google.android.material.timepicker.TimeModel r2 = new com.google.android.material.timepicker.TimeModel
                r2.<init>(r4)
                r3.time = r2
                r2.setMinute(r0)
                com.google.android.material.timepicker.TimeModel r4 = r3.time
                r4.setHourOfDay(r1)
                return r3
        }

        @androidx.annotation.NonNull
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.material.timepicker.MaterialTimePicker.Builder setTitleText(@androidx.annotation.StringRes int r1) {
                r0 = this;
                r0.titleTextResId = r1
                return r0
        }

        @androidx.annotation.NonNull
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.material.timepicker.MaterialTimePicker.Builder setTitleText(@androidx.annotation.Nullable java.lang.CharSequence r1) {
                r0 = this;
                r0.titleText = r1
                return r0
        }
    }

    /* JADX INFO: renamed from: $r8$lambda$EAchhS67SdqVEMlxd-xEgAdPAbo, reason: not valid java name */
    public static /* synthetic */ void m296$r8$lambda$EAchhS67SdqVEMlxdxEgAdPAbo(com.google.android.material.timepicker.MaterialTimePicker r0) {
            r0.lambda$onViewCreated$0()
            return
    }

    public MaterialTimePicker() {
            r1 = this;
            r1.<init>()
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            r1.positiveButtonListeners = r0
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            r1.negativeButtonListeners = r0
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            r1.cancelListeners = r0
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            r1.dismissListeners = r0
            r0 = 0
            r1.titleResId = r0
            r1.positiveButtonTextResId = r0
            r1.negativeButtonTextResId = r0
            r1.inputMode = r0
            r1.overrideThemeResId = r0
            return
    }

    public static /* synthetic */ java.util.Set access$1000(com.google.android.material.timepicker.MaterialTimePicker r0) {
            java.util.Set<android.view.View$OnClickListener> r0 = r0.negativeButtonListeners
            return r0
    }

    public static /* synthetic */ int access$1100(com.google.android.material.timepicker.MaterialTimePicker r0) {
            int r0 = r0.inputMode
            return r0
    }

    public static /* synthetic */ int access$1102(com.google.android.material.timepicker.MaterialTimePicker r0, int r1) {
            r0.inputMode = r1
            return r1
    }

    public static /* synthetic */ com.google.android.material.button.MaterialButton access$1200(com.google.android.material.timepicker.MaterialTimePicker r0) {
            com.google.android.material.button.MaterialButton r0 = r0.modeButton
            return r0
    }

    public static /* synthetic */ void access$1300(com.google.android.material.timepicker.MaterialTimePicker r0, com.google.android.material.button.MaterialButton r1) {
            r0.updateInputMode(r1)
            return
    }

    public static /* synthetic */ com.google.android.material.timepicker.MaterialTimePicker access$1400(com.google.android.material.timepicker.MaterialTimePicker.Builder r0) {
            com.google.android.material.timepicker.MaterialTimePicker r0 = newInstance(r0)
            return r0
    }

    public static /* synthetic */ java.util.Set access$900(com.google.android.material.timepicker.MaterialTimePicker r0) {
            java.util.Set<android.view.View$OnClickListener> r0 = r0.positiveButtonListeners
            return r0
    }

    private android.util.Pair<java.lang.Integer, java.lang.Integer> dataForMode(int r3) {
            r2 = this;
            if (r3 == 0) goto L23
            r0 = 1
            if (r3 != r0) goto L17
            android.util.Pair r3 = new android.util.Pair
            int r0 = r2.clockIcon
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r1 = com.google.android.material.R.string.material_timepicker_clock_mode_description
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r3.<init>(r0, r1)
            return r3
        L17:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "no icon for mode: "
            java.lang.String r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r3)
            r0.<init>(r3)
            throw r0
        L23:
            android.util.Pair r3 = new android.util.Pair
            int r0 = r2.keyboardIcon
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r1 = com.google.android.material.R.string.material_timepicker_text_input_mode_description
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r3.<init>(r0, r1)
            return r3
    }

    private int getThemeResId() {
            r2 = this;
            int r0 = r2.overrideThemeResId
            if (r0 == 0) goto L5
            return r0
        L5:
            android.content.Context r0 = r2.requireContext()
            int r1 = com.google.android.material.R.attr.materialTimePickerTheme
            android.util.TypedValue r0 = com.google.android.material.resources.MaterialAttributes.resolve(r0, r1)
            if (r0 != 0) goto L13
            r0 = 0
            goto L15
        L13:
            int r0 = r0.data
        L15:
            return r0
    }

    private com.google.android.material.timepicker.TimePickerPresenter initializeOrRetrieveActivePresenterForMode(int r1, @androidx.annotation.NonNull com.google.android.material.timepicker.TimePickerView r2, @androidx.annotation.NonNull android.view.ViewStub r3) {
            r0 = this;
            if (r1 != 0) goto L10
            com.google.android.material.timepicker.TimePickerClockPresenter r1 = r0.timePickerClockPresenter
            if (r1 != 0) goto Ld
            com.google.android.material.timepicker.TimePickerClockPresenter r1 = new com.google.android.material.timepicker.TimePickerClockPresenter
            com.google.android.material.timepicker.TimeModel r3 = r0.time
            r1.<init>(r2, r3)
        Ld:
            r0.timePickerClockPresenter = r1
            return r1
        L10:
            com.google.android.material.timepicker.TimePickerTextInputPresenter r1 = r0.timePickerTextInputPresenter
            if (r1 != 0) goto L23
            android.view.View r1 = r3.inflate()
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            com.google.android.material.timepicker.TimePickerTextInputPresenter r2 = new com.google.android.material.timepicker.TimePickerTextInputPresenter
            com.google.android.material.timepicker.TimeModel r3 = r0.time
            r2.<init>(r1, r3)
            r0.timePickerTextInputPresenter = r2
        L23:
            com.google.android.material.timepicker.TimePickerTextInputPresenter r1 = r0.timePickerTextInputPresenter
            r1.clearCheck()
            com.google.android.material.timepicker.TimePickerTextInputPresenter r1 = r0.timePickerTextInputPresenter
            return r1
    }

    private /* synthetic */ void lambda$onViewCreated$0() {
            r1 = this;
            com.google.android.material.timepicker.TimePickerPresenter r0 = r1.activePresenter
            com.google.android.material.timepicker.TimePickerTextInputPresenter r0 = (com.google.android.material.timepicker.TimePickerTextInputPresenter) r0
            r0.resetChecked()
            return
    }

    @androidx.annotation.NonNull
    private static com.google.android.material.timepicker.MaterialTimePicker newInstance(@androidx.annotation.NonNull com.google.android.material.timepicker.MaterialTimePicker.Builder r4) {
            com.google.android.material.timepicker.MaterialTimePicker r0 = new com.google.android.material.timepicker.MaterialTimePicker
            r0.<init>()
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            com.google.android.material.timepicker.TimeModel r2 = com.google.android.material.timepicker.MaterialTimePicker.Builder.access$000(r4)
            java.lang.String r3 = "TIME_PICKER_TIME_MODEL"
            r1.putParcelable(r3, r2)
            java.lang.Integer r2 = com.google.android.material.timepicker.MaterialTimePicker.Builder.access$100(r4)
            if (r2 == 0) goto L26
            java.lang.Integer r2 = com.google.android.material.timepicker.MaterialTimePicker.Builder.access$100(r4)
            int r2 = r2.intValue()
            java.lang.String r3 = "TIME_PICKER_INPUT_MODE"
            r1.putInt(r3, r2)
        L26:
            int r2 = com.google.android.material.timepicker.MaterialTimePicker.Builder.access$200(r4)
            java.lang.String r3 = "TIME_PICKER_TITLE_RES"
            r1.putInt(r3, r2)
            java.lang.CharSequence r2 = com.google.android.material.timepicker.MaterialTimePicker.Builder.access$300(r4)
            if (r2 == 0) goto L3e
            java.lang.CharSequence r2 = com.google.android.material.timepicker.MaterialTimePicker.Builder.access$300(r4)
            java.lang.String r3 = "TIME_PICKER_TITLE_TEXT"
            r1.putCharSequence(r3, r2)
        L3e:
            int r2 = com.google.android.material.timepicker.MaterialTimePicker.Builder.access$400(r4)
            java.lang.String r3 = "TIME_PICKER_POSITIVE_BUTTON_TEXT_RES"
            r1.putInt(r3, r2)
            java.lang.CharSequence r2 = com.google.android.material.timepicker.MaterialTimePicker.Builder.access$500(r4)
            if (r2 == 0) goto L56
            java.lang.CharSequence r2 = com.google.android.material.timepicker.MaterialTimePicker.Builder.access$500(r4)
            java.lang.String r3 = "TIME_PICKER_POSITIVE_BUTTON_TEXT"
            r1.putCharSequence(r3, r2)
        L56:
            int r2 = com.google.android.material.timepicker.MaterialTimePicker.Builder.access$600(r4)
            java.lang.String r3 = "TIME_PICKER_NEGATIVE_BUTTON_TEXT_RES"
            r1.putInt(r3, r2)
            java.lang.CharSequence r2 = com.google.android.material.timepicker.MaterialTimePicker.Builder.access$700(r4)
            if (r2 == 0) goto L6e
            java.lang.CharSequence r2 = com.google.android.material.timepicker.MaterialTimePicker.Builder.access$700(r4)
            java.lang.String r3 = "TIME_PICKER_NEGATIVE_BUTTON_TEXT"
            r1.putCharSequence(r3, r2)
        L6e:
            int r4 = com.google.android.material.timepicker.MaterialTimePicker.Builder.access$800(r4)
            java.lang.String r2 = "TIME_PICKER_OVERRIDE_THEME_RES_ID"
            r1.putInt(r2, r4)
            r0.setArguments(r1)
            return r0
    }

    private void restoreState(@androidx.annotation.Nullable android.os.Bundle r4) {
            r3 = this;
            if (r4 != 0) goto L3
            return
        L3:
            java.lang.String r0 = "TIME_PICKER_TIME_MODEL"
            android.os.Parcelable r0 = r4.getParcelable(r0)
            com.google.android.material.timepicker.TimeModel r0 = (com.google.android.material.timepicker.TimeModel) r0
            r3.time = r0
            if (r0 != 0) goto L16
            com.google.android.material.timepicker.TimeModel r0 = new com.google.android.material.timepicker.TimeModel
            r0.<init>()
            r3.time = r0
        L16:
            com.google.android.material.timepicker.TimeModel r0 = r3.time
            int r0 = r0.format
            r1 = 1
            r2 = 0
            if (r0 != r1) goto L1f
            goto L20
        L1f:
            r1 = 0
        L20:
            java.lang.String r0 = "TIME_PICKER_INPUT_MODE"
            int r0 = r4.getInt(r0, r1)
            r3.inputMode = r0
            java.lang.String r0 = "TIME_PICKER_TITLE_RES"
            int r0 = r4.getInt(r0, r2)
            r3.titleResId = r0
            java.lang.String r0 = "TIME_PICKER_TITLE_TEXT"
            java.lang.CharSequence r0 = r4.getCharSequence(r0)
            r3.titleText = r0
            java.lang.String r0 = "TIME_PICKER_POSITIVE_BUTTON_TEXT_RES"
            int r0 = r4.getInt(r0, r2)
            r3.positiveButtonTextResId = r0
            java.lang.String r0 = "TIME_PICKER_POSITIVE_BUTTON_TEXT"
            java.lang.CharSequence r0 = r4.getCharSequence(r0)
            r3.positiveButtonText = r0
            java.lang.String r0 = "TIME_PICKER_NEGATIVE_BUTTON_TEXT_RES"
            int r0 = r4.getInt(r0, r2)
            r3.negativeButtonTextResId = r0
            java.lang.String r0 = "TIME_PICKER_NEGATIVE_BUTTON_TEXT"
            java.lang.CharSequence r0 = r4.getCharSequence(r0)
            r3.negativeButtonText = r0
            java.lang.String r0 = "TIME_PICKER_OVERRIDE_THEME_RES_ID"
            int r4 = r4.getInt(r0, r2)
            r3.overrideThemeResId = r4
            return
    }

    private void updateCancelButtonVisibility() {
            r2 = this;
            android.widget.Button r0 = r2.cancelButton
            if (r0 == 0) goto L11
            boolean r1 = r2.isCancelable()
            if (r1 == 0) goto Lc
            r1 = 0
            goto Le
        Lc:
            r1 = 8
        Le:
            r0.setVisibility(r1)
        L11:
            return
    }

    private void updateInputMode(com.google.android.material.button.MaterialButton r4) {
            r3 = this;
            if (r4 == 0) goto L4e
            com.google.android.material.timepicker.TimePickerView r0 = r3.timePickerView
            if (r0 == 0) goto L4e
            android.view.ViewStub r0 = r3.textInputStub
            if (r0 != 0) goto Lb
            goto L4e
        Lb:
            com.google.android.material.timepicker.TimePickerPresenter r0 = r3.activePresenter
            if (r0 == 0) goto L12
            r0.hide()
        L12:
            int r0 = r3.inputMode
            com.google.android.material.timepicker.TimePickerView r1 = r3.timePickerView
            android.view.ViewStub r2 = r3.textInputStub
            com.google.android.material.timepicker.TimePickerPresenter r0 = r3.initializeOrRetrieveActivePresenterForMode(r0, r1, r2)
            r3.activePresenter = r0
            r0.show()
            com.google.android.material.timepicker.TimePickerPresenter r0 = r3.activePresenter
            r0.invalidate()
            int r0 = r3.inputMode
            android.util.Pair r0 = r3.dataForMode(r0)
            java.lang.Object r1 = r0.first
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r4.setIconResource(r1)
            android.content.res.Resources r1 = r3.getResources()
            java.lang.Object r0 = r0.second
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            java.lang.String r0 = r1.getString(r0)
            r4.setContentDescription(r0)
            r0 = 4
            r4.sendAccessibilityEvent(r0)
        L4e:
            return
    }

    public boolean addOnCancelListener(@androidx.annotation.NonNull android.content.DialogInterface.OnCancelListener r2) {
            r1 = this;
            java.util.Set<android.content.DialogInterface$OnCancelListener> r0 = r1.cancelListeners
            boolean r2 = r0.add(r2)
            return r2
    }

    public boolean addOnDismissListener(@androidx.annotation.NonNull android.content.DialogInterface.OnDismissListener r2) {
            r1 = this;
            java.util.Set<android.content.DialogInterface$OnDismissListener> r0 = r1.dismissListeners
            boolean r2 = r0.add(r2)
            return r2
    }

    public boolean addOnNegativeButtonClickListener(@androidx.annotation.NonNull android.view.View.OnClickListener r2) {
            r1 = this;
            java.util.Set<android.view.View$OnClickListener> r0 = r1.negativeButtonListeners
            boolean r2 = r0.add(r2)
            return r2
    }

    public boolean addOnPositiveButtonClickListener(@androidx.annotation.NonNull android.view.View.OnClickListener r2) {
            r1 = this;
            java.util.Set<android.view.View$OnClickListener> r0 = r1.positiveButtonListeners
            boolean r2 = r0.add(r2)
            return r2
    }

    public void clearOnCancelListeners() {
            r1 = this;
            java.util.Set<android.content.DialogInterface$OnCancelListener> r0 = r1.cancelListeners
            r0.clear()
            return
    }

    public void clearOnDismissListeners() {
            r1 = this;
            java.util.Set<android.content.DialogInterface$OnDismissListener> r0 = r1.dismissListeners
            r0.clear()
            return
    }

    public void clearOnNegativeButtonClickListeners() {
            r1 = this;
            java.util.Set<android.view.View$OnClickListener> r0 = r1.negativeButtonListeners
            r0.clear()
            return
    }

    public void clearOnPositiveButtonClickListeners() {
            r1 = this;
            java.util.Set<android.view.View$OnClickListener> r0 = r1.positiveButtonListeners
            r0.clear()
            return
    }

    @androidx.annotation.IntRange(from = 0, to = 23)
    public int getHour() {
            r1 = this;
            com.google.android.material.timepicker.TimeModel r0 = r1.time
            int r0 = r0.hour
            int r0 = r0 % 24
            return r0
    }

    public int getInputMode() {
            r1 = this;
            int r0 = r1.inputMode
            return r0
    }

    @androidx.annotation.IntRange(from = 0, to = 59)
    public int getMinute() {
            r1 = this;
            com.google.android.material.timepicker.TimeModel r0 = r1.time
            int r0 = r0.minute
            return r0
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(@androidx.annotation.NonNull android.content.DialogInterface r3) {
            r2 = this;
            java.util.Set<android.content.DialogInterface$OnCancelListener> r0 = r2.cancelListeners
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            android.content.DialogInterface$OnCancelListener r1 = (android.content.DialogInterface.OnCancelListener) r1
            r1.onCancel(r3)
            goto L6
        L16:
            super.onCancel(r3)
            return
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@androidx.annotation.Nullable android.os.Bundle r1) {
            r0 = this;
            super.onCreate(r1)
            if (r1 != 0) goto L9
            android.os.Bundle r1 = r0.getArguments()
        L9:
            r0.restoreState(r1)
            return
    }

    @Override // androidx.fragment.app.DialogFragment
    @androidx.annotation.NonNull
    public final android.app.Dialog onCreateDialog(@androidx.annotation.Nullable android.os.Bundle r8) {
            r7 = this;
            android.app.Dialog r8 = new android.app.Dialog
            android.content.Context r0 = r7.requireContext()
            int r1 = r7.getThemeResId()
            r8.<init>(r0, r1)
            android.content.Context r0 = r8.getContext()
            int r1 = com.google.android.material.R.attr.colorSurface
            java.lang.Class<com.google.android.material.timepicker.MaterialTimePicker> r2 = com.google.android.material.timepicker.MaterialTimePicker.class
            java.lang.String r2 = r2.getCanonicalName()
            int r1 = com.google.android.material.resources.MaterialAttributes.resolveOrThrow(r0, r1, r2)
            com.google.android.material.shape.MaterialShapeDrawable r2 = new com.google.android.material.shape.MaterialShapeDrawable
            int r3 = com.google.android.material.R.attr.materialTimePickerStyle
            int r4 = com.google.android.material.R.style.Widget_MaterialComponents_TimePicker
            r5 = 0
            r2.<init>(r0, r5, r3, r4)
            int[] r6 = com.google.android.material.R.styleable.MaterialTimePicker
            android.content.res.TypedArray r3 = r0.obtainStyledAttributes(r5, r6, r3, r4)
            int r4 = com.google.android.material.R.styleable.MaterialTimePicker_clockIcon
            r5 = 0
            int r4 = r3.getResourceId(r4, r5)
            r7.clockIcon = r4
            int r4 = com.google.android.material.R.styleable.MaterialTimePicker_keyboardIcon
            int r4 = r3.getResourceId(r4, r5)
            r7.keyboardIcon = r4
            r3.recycle()
            r2.initializeElevationOverlay(r0)
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r1)
            r2.setFillColor(r0)
            android.view.Window r0 = r8.getWindow()
            r0.setBackgroundDrawable(r2)
            r1 = 1
            r0.requestFeature(r1)
            r1 = -2
            r0.setLayout(r1, r1)
            android.view.View r0 = r0.getDecorView()
            float r0 = androidx.core.view.ViewCompat.getElevation(r0)
            r2.setElevation(r0)
            return r8
    }

    @Override // androidx.fragment.app.Fragment
    @androidx.annotation.NonNull
    public final android.view.View onCreateView(@androidx.annotation.NonNull android.view.LayoutInflater r1, @androidx.annotation.Nullable android.view.ViewGroup r2, @androidx.annotation.Nullable android.os.Bundle r3) {
            r0 = this;
            int r3 = com.google.android.material.R.layout.material_timepicker_dialog
            android.view.View r1 = r1.inflate(r3, r2)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            int r2 = com.google.android.material.R.id.material_timepicker_view
            android.view.View r2 = r1.findViewById(r2)
            com.google.android.material.timepicker.TimePickerView r2 = (com.google.android.material.timepicker.TimePickerView) r2
            r0.timePickerView = r2
            r2.setOnDoubleTapListener(r0)
            int r2 = com.google.android.material.R.id.material_textinput_timepicker
            android.view.View r2 = r1.findViewById(r2)
            android.view.ViewStub r2 = (android.view.ViewStub) r2
            r0.textInputStub = r2
            int r2 = com.google.android.material.R.id.material_timepicker_mode_button
            android.view.View r2 = r1.findViewById(r2)
            com.google.android.material.button.MaterialButton r2 = (com.google.android.material.button.MaterialButton) r2
            r0.modeButton = r2
            int r2 = com.google.android.material.R.id.header_title
            android.view.View r2 = r1.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            int r3 = r0.titleResId
            if (r3 == 0) goto L39
            r2.setText(r3)
            goto L46
        L39:
            java.lang.CharSequence r3 = r0.titleText
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L46
            java.lang.CharSequence r3 = r0.titleText
            r2.setText(r3)
        L46:
            com.google.android.material.button.MaterialButton r2 = r0.modeButton
            r0.updateInputMode(r2)
            int r2 = com.google.android.material.R.id.material_timepicker_ok_button
            android.view.View r2 = r1.findViewById(r2)
            android.widget.Button r2 = (android.widget.Button) r2
            com.google.android.material.timepicker.MaterialTimePicker$1 r3 = new com.google.android.material.timepicker.MaterialTimePicker$1
            r3.<init>(r0)
            r2.setOnClickListener(r3)
            int r3 = r0.positiveButtonTextResId
            if (r3 == 0) goto L63
            r2.setText(r3)
            goto L70
        L63:
            java.lang.CharSequence r3 = r0.positiveButtonText
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L70
            java.lang.CharSequence r3 = r0.positiveButtonText
            r2.setText(r3)
        L70:
            int r2 = com.google.android.material.R.id.material_timepicker_cancel_button
            android.view.View r2 = r1.findViewById(r2)
            android.widget.Button r2 = (android.widget.Button) r2
            r0.cancelButton = r2
            com.google.android.material.timepicker.MaterialTimePicker$2 r3 = new com.google.android.material.timepicker.MaterialTimePicker$2
            r3.<init>(r0)
            r2.setOnClickListener(r3)
            int r2 = r0.negativeButtonTextResId
            if (r2 == 0) goto L8c
            android.widget.Button r3 = r0.cancelButton
            r3.setText(r2)
            goto L9b
        L8c:
            java.lang.CharSequence r2 = r0.negativeButtonText
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L9b
            android.widget.Button r2 = r0.cancelButton
            java.lang.CharSequence r3 = r0.negativeButtonText
            r2.setText(r3)
        L9b:
            r0.updateCancelButtonVisibility()
            com.google.android.material.button.MaterialButton r2 = r0.modeButton
            com.google.android.material.timepicker.MaterialTimePicker$3 r3 = new com.google.android.material.timepicker.MaterialTimePicker$3
            r3.<init>(r0)
            r2.setOnClickListener(r3)
            return r1
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
            r2 = this;
            super.onDestroyView()
            r0 = 0
            r2.activePresenter = r0
            r2.timePickerClockPresenter = r0
            r2.timePickerTextInputPresenter = r0
            com.google.android.material.timepicker.TimePickerView r1 = r2.timePickerView
            if (r1 == 0) goto L13
            r1.setOnDoubleTapListener(r0)
            r2.timePickerView = r0
        L13:
            return
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(@androidx.annotation.NonNull android.content.DialogInterface r3) {
            r2 = this;
            java.util.Set<android.content.DialogInterface$OnDismissListener> r0 = r2.dismissListeners
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            android.content.DialogInterface$OnDismissListener r1 = (android.content.DialogInterface.OnDismissListener) r1
            r1.onDismiss(r3)
            goto L6
        L16:
            super.onDismiss(r3)
            return
    }

    @Override // com.google.android.material.timepicker.TimePickerView.OnDoubleTapListener
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public void onDoubleTap() {
            r1 = this;
            r0 = 1
            r1.inputMode = r0
            com.google.android.material.button.MaterialButton r0 = r1.modeButton
            r1.updateInputMode(r0)
            com.google.android.material.timepicker.TimePickerTextInputPresenter r0 = r1.timePickerTextInputPresenter
            r0.resetChecked()
            return
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(@androidx.annotation.NonNull android.os.Bundle r3) {
            r2 = this;
            super.onSaveInstanceState(r3)
            com.google.android.material.timepicker.TimeModel r0 = r2.time
            java.lang.String r1 = "TIME_PICKER_TIME_MODEL"
            r3.putParcelable(r1, r0)
            int r0 = r2.inputMode
            java.lang.String r1 = "TIME_PICKER_INPUT_MODE"
            r3.putInt(r1, r0)
            int r0 = r2.titleResId
            java.lang.String r1 = "TIME_PICKER_TITLE_RES"
            r3.putInt(r1, r0)
            java.lang.CharSequence r0 = r2.titleText
            java.lang.String r1 = "TIME_PICKER_TITLE_TEXT"
            r3.putCharSequence(r1, r0)
            int r0 = r2.positiveButtonTextResId
            java.lang.String r1 = "TIME_PICKER_POSITIVE_BUTTON_TEXT_RES"
            r3.putInt(r1, r0)
            java.lang.CharSequence r0 = r2.positiveButtonText
            java.lang.String r1 = "TIME_PICKER_POSITIVE_BUTTON_TEXT"
            r3.putCharSequence(r1, r0)
            int r0 = r2.negativeButtonTextResId
            java.lang.String r1 = "TIME_PICKER_NEGATIVE_BUTTON_TEXT_RES"
            r3.putInt(r1, r0)
            java.lang.CharSequence r0 = r2.negativeButtonText
            java.lang.String r1 = "TIME_PICKER_NEGATIVE_BUTTON_TEXT"
            r3.putCharSequence(r1, r0)
            int r0 = r2.overrideThemeResId
            java.lang.String r1 = "TIME_PICKER_OVERRIDE_THEME_RES_ID"
            r3.putInt(r1, r0)
            return
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@androidx.annotation.NonNull android.view.View r3, @androidx.annotation.Nullable android.os.Bundle r4) {
            r2 = this;
            super.onViewCreated(r3, r4)
            com.google.android.material.timepicker.TimePickerPresenter r4 = r2.activePresenter
            boolean r4 = r4 instanceof com.google.android.material.timepicker.TimePickerTextInputPresenter
            if (r4 == 0) goto L14
            com.google.android.material.timepicker.RadialViewGroup$$ExternalSyntheticLambda0 r4 = new com.google.android.material.timepicker.RadialViewGroup$$ExternalSyntheticLambda0
            r0 = 1
            r4.<init>(r2, r0)
            r0 = 100
            r3.postDelayed(r4, r0)
        L14:
            return
    }

    public boolean removeOnCancelListener(@androidx.annotation.NonNull android.content.DialogInterface.OnCancelListener r2) {
            r1 = this;
            java.util.Set<android.content.DialogInterface$OnCancelListener> r0 = r1.cancelListeners
            boolean r2 = r0.remove(r2)
            return r2
    }

    public boolean removeOnDismissListener(@androidx.annotation.NonNull android.content.DialogInterface.OnDismissListener r2) {
            r1 = this;
            java.util.Set<android.content.DialogInterface$OnDismissListener> r0 = r1.dismissListeners
            boolean r2 = r0.remove(r2)
            return r2
    }

    public boolean removeOnNegativeButtonClickListener(@androidx.annotation.NonNull android.view.View.OnClickListener r2) {
            r1 = this;
            java.util.Set<android.view.View$OnClickListener> r0 = r1.negativeButtonListeners
            boolean r2 = r0.remove(r2)
            return r2
    }

    public boolean removeOnPositiveButtonClickListener(@androidx.annotation.NonNull android.view.View.OnClickListener r2) {
            r1 = this;
            java.util.Set<android.view.View$OnClickListener> r0 = r1.positiveButtonListeners
            boolean r2 = r0.remove(r2)
            return r2
    }

    @Override // androidx.fragment.app.DialogFragment
    public void setCancelable(boolean r1) {
            r0 = this;
            super.setCancelable(r1)
            r0.updateCancelButtonVisibility()
            return
    }

    public void setHour(@androidx.annotation.IntRange(from = 0, to = 23) int r2) {
            r1 = this;
            com.google.android.material.timepicker.TimeModel r0 = r1.time
            r0.setHour(r2)
            com.google.android.material.timepicker.TimePickerPresenter r2 = r1.activePresenter
            if (r2 == 0) goto Lc
            r2.invalidate()
        Lc:
            return
    }

    public void setMinute(@androidx.annotation.IntRange(from = 0, to = 59) int r2) {
            r1 = this;
            com.google.android.material.timepicker.TimeModel r0 = r1.time
            r0.setMinute(r2)
            com.google.android.material.timepicker.TimePickerPresenter r2 = r1.activePresenter
            if (r2 == 0) goto Lc
            r2.invalidate()
        Lc:
            return
    }
}
