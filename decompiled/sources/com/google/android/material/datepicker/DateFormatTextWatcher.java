package com.google.android.material.datepicker;

/* JADX INFO: loaded from: classes.dex */
abstract class DateFormatTextWatcher extends com.google.android.material.internal.TextWatcherAdapter {
    private static final int VALIDATION_DELAY = 1000;
    private final com.google.android.material.datepicker.CalendarConstraints constraints;
    private final java.text.DateFormat dateFormat;
    private final java.lang.String outOfRange;
    private final java.lang.Runnable setErrorCallback;
    private java.lang.Runnable setRangeErrorCallback;

    @androidx.annotation.NonNull
    private final com.google.android.material.textfield.TextInputLayout textInputLayout;

    public static /* synthetic */ void $r8$lambda$522ap9tLQTJ0Q4tV2zWF8Zif_Xw(com.google.android.material.datepicker.DateFormatTextWatcher r0, java.lang.String r1) {
            r0.lambda$new$0(r1)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$jGG6qqlbk2aGp7DPyeS8kvE-KeQ, reason: not valid java name */
    public static /* synthetic */ void m283$r8$lambda$jGG6qqlbk2aGp7DPyeS8kvEKeQ(com.google.android.material.datepicker.DateFormatTextWatcher r0, long r1) {
            r0.lambda$createRangeErrorCallback$1(r1)
            return
    }

    public DateFormatTextWatcher(java.lang.String r1, java.text.DateFormat r2, @androidx.annotation.NonNull com.google.android.material.textfield.TextInputLayout r3, com.google.android.material.datepicker.CalendarConstraints r4) {
            r0 = this;
            r0.<init>()
            r0.dateFormat = r2
            r0.textInputLayout = r3
            r0.constraints = r4
            android.content.Context r2 = r3.getContext()
            int r3 = com.google.android.material.R.string.mtrl_picker_out_of_range
            java.lang.String r2 = r2.getString(r3)
            r0.outOfRange = r2
            com.google.android.material.datepicker.DateFormatTextWatcher$$ExternalSyntheticLambda1 r2 = new com.google.android.material.datepicker.DateFormatTextWatcher$$ExternalSyntheticLambda1
            r2.<init>(r0, r1)
            r0.setErrorCallback = r2
            return
    }

    private java.lang.Runnable createRangeErrorCallback(long r2) {
            r1 = this;
            com.google.android.material.datepicker.DateFormatTextWatcher$$ExternalSyntheticLambda0 r0 = new com.google.android.material.datepicker.DateFormatTextWatcher$$ExternalSyntheticLambda0
            r0.<init>(r1, r2)
            return r0
    }

    private void lambda$createRangeErrorCallback$1(long r4) {
            r3 = this;
            java.lang.String r4 = com.google.android.material.datepicker.DateStrings.getDateString$1(r4)
            com.google.android.material.textfield.TextInputLayout r5 = r3.textInputLayout
            java.lang.String r0 = r3.outOfRange
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r4 = r3.sanitizeDateString(r4)
            r2 = 0
            r1[r2] = r4
            java.lang.String r4 = java.lang.String.format(r0, r1)
            r5.setError(r4)
            r3.onInvalidDate()
            return
    }

    private /* synthetic */ void lambda$new$0(java.lang.String r11) {
            r10 = this;
            com.google.android.material.textfield.TextInputLayout r0 = r10.textInputLayout
            java.text.DateFormat r1 = r10.dateFormat
            android.content.Context r2 = r0.getContext()
            int r3 = com.google.android.material.R.string.mtrl_picker_invalid_format
            java.lang.String r3 = r2.getString(r3)
            int r4 = com.google.android.material.R.string.mtrl_picker_invalid_format_use
            java.lang.String r4 = r2.getString(r4)
            r5 = 1
            java.lang.Object[] r6 = new java.lang.Object[r5]
            java.lang.String r11 = r10.sanitizeDateString(r11)
            r7 = 0
            r6[r7] = r11
            java.lang.String r11 = java.lang.String.format(r4, r6)
            int r4 = com.google.android.material.R.string.mtrl_picker_invalid_format_example
            java.lang.String r2 = r2.getString(r4)
            java.lang.Object[] r4 = new java.lang.Object[r5]
            java.util.Date r5 = new java.util.Date
            java.util.Calendar r6 = com.google.android.material.datepicker.UtcDates.getTodayCalendar()
            long r8 = r6.getTimeInMillis()
            r5.<init>(r8)
            java.lang.String r1 = r1.format(r5)
            java.lang.String r1 = r10.sanitizeDateString(r1)
            r4[r7] = r1
            java.lang.String r1 = java.lang.String.format(r2, r4)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r3)
            java.lang.String r3 = "\n"
            r2.append(r3)
            r2.append(r11)
            r2.append(r3)
            r2.append(r1)
            java.lang.String r11 = r2.toString()
            r0.setError(r11)
            r10.onInvalidDate()
            return
    }

    private java.lang.String sanitizeDateString(java.lang.String r3) {
            r2 = this;
            r0 = 32
            r1 = 160(0xa0, float:2.24E-43)
            java.lang.String r3 = r3.replace(r0, r1)
            return r3
    }

    public void onInvalidDate() {
            r0 = this;
            return
    }

    @Override // com.google.android.material.internal.TextWatcherAdapter, android.text.TextWatcher
    public void onTextChanged(@androidx.annotation.NonNull java.lang.CharSequence r1, int r2, int r3, int r4) {
            r0 = this;
            com.google.android.material.textfield.TextInputLayout r2 = r0.textInputLayout
            java.lang.Runnable r3 = r0.setErrorCallback
            r2.removeCallbacks(r3)
            com.google.android.material.textfield.TextInputLayout r2 = r0.textInputLayout
            java.lang.Runnable r3 = r0.setRangeErrorCallback
            r2.removeCallbacks(r3)
            com.google.android.material.textfield.TextInputLayout r2 = r0.textInputLayout
            r3 = 0
            r2.setError(r3)
            r0.onValidDate(r3)
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto L1e
            return
        L1e:
            java.text.DateFormat r2 = r0.dateFormat     // Catch: java.text.ParseException -> L5d
            java.lang.String r1 = r1.toString()     // Catch: java.text.ParseException -> L5d
            java.util.Date r1 = r2.parse(r1)     // Catch: java.text.ParseException -> L5d
            com.google.android.material.textfield.TextInputLayout r2 = r0.textInputLayout     // Catch: java.text.ParseException -> L5d
            r2.setError(r3)     // Catch: java.text.ParseException -> L5d
            long r2 = r1.getTime()     // Catch: java.text.ParseException -> L5d
            com.google.android.material.datepicker.CalendarConstraints r4 = r0.constraints     // Catch: java.text.ParseException -> L5d
            com.google.android.material.datepicker.CalendarConstraints$DateValidator r4 = r4.getDateValidator()     // Catch: java.text.ParseException -> L5d
            boolean r4 = r4.isValid(r2)     // Catch: java.text.ParseException -> L5d
            if (r4 == 0) goto L51
            com.google.android.material.datepicker.CalendarConstraints r4 = r0.constraints     // Catch: java.text.ParseException -> L5d
            boolean r4 = r4.isWithinBounds(r2)     // Catch: java.text.ParseException -> L5d
            if (r4 == 0) goto L51
            long r1 = r1.getTime()     // Catch: java.text.ParseException -> L5d
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch: java.text.ParseException -> L5d
            r0.onValidDate(r1)     // Catch: java.text.ParseException -> L5d
            return
        L51:
            java.lang.Runnable r1 = r0.createRangeErrorCallback(r2)     // Catch: java.text.ParseException -> L5d
            r0.setRangeErrorCallback = r1     // Catch: java.text.ParseException -> L5d
            com.google.android.material.textfield.TextInputLayout r2 = r0.textInputLayout     // Catch: java.text.ParseException -> L5d
            r0.runValidation(r2, r1)     // Catch: java.text.ParseException -> L5d
            goto L64
        L5d:
            com.google.android.material.textfield.TextInputLayout r1 = r0.textInputLayout
            java.lang.Runnable r2 = r0.setErrorCallback
            r0.runValidation(r1, r2)
        L64:
            return
    }

    public abstract void onValidDate(@androidx.annotation.Nullable java.lang.Long r1);

    public void runValidation(android.view.View r3, java.lang.Runnable r4) {
            r2 = this;
            r0 = 1000(0x3e8, double:4.94E-321)
            r3.postDelayed(r4, r0)
            return
    }
}
