package androidx.leanback.widget.picker;

/* JADX INFO: loaded from: classes3.dex */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public class DatePicker extends androidx.leanback.widget.picker.Picker {
    private static final int[] DATE_FIELDS = null;
    public int mColDayIndex;
    public int mColMonthIndex;
    public int mColYearIndex;
    public androidx.leanback.widget.picker.PickerUtility.DateConstant mConstant;
    public java.util.Calendar mCurrentDate;
    public final java.text.SimpleDateFormat mDateFormat;
    private java.lang.String mDatePickerFormat;
    public androidx.leanback.widget.picker.PickerColumn mDayColumn;
    public java.util.Calendar mMaxDate;
    public java.util.Calendar mMinDate;
    public androidx.leanback.widget.picker.PickerColumn mMonthColumn;
    public java.util.Calendar mTempDate;
    public androidx.leanback.widget.picker.PickerColumn mYearColumn;


    static {
            r0 = 3
            int[] r0 = new int[r0]
            r0 = {x000a: FILL_ARRAY_DATA , data: [5, 2, 1} // fill-array
            androidx.leanback.widget.picker.DatePicker.DATE_FIELDS = r0
            return
    }

    public DatePicker(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public DatePicker(android.content.Context r6, android.util.AttributeSet r7, int r8) {
            r5 = this;
            r5.<init>(r6, r7, r8)
            java.text.SimpleDateFormat r8 = new java.text.SimpleDateFormat
            java.lang.String r0 = "MM/dd/yyyy"
            r8.<init>(r0)
            r5.mDateFormat = r8
            r5.updateCurrentLocale()
            int[] r8 = androidx.leanback.R.styleable.lbDatePicker
            android.content.res.TypedArray r7 = r6.obtainStyledAttributes(r7, r8)
            int r8 = androidx.leanback.R.styleable.lbDatePicker_android_minDate
            java.lang.String r8 = r7.getString(r8)
            int r0 = androidx.leanback.R.styleable.lbDatePicker_android_maxDate
            java.lang.String r0 = r7.getString(r0)
            java.util.Calendar r1 = r5.mTempDate
            r1.clear()
            boolean r1 = android.text.TextUtils.isEmpty(r8)
            r2 = 1900(0x76c, float:2.662E-42)
            r3 = 1
            r4 = 0
            if (r1 != 0) goto L3e
            java.util.Calendar r1 = r5.mTempDate
            boolean r8 = r5.parseDate(r8, r1)
            if (r8 != 0) goto L43
            java.util.Calendar r8 = r5.mTempDate
            r8.set(r2, r4, r3)
            goto L43
        L3e:
            java.util.Calendar r8 = r5.mTempDate
            r8.set(r2, r4, r3)
        L43:
            java.util.Calendar r8 = r5.mMinDate
            java.util.Calendar r1 = r5.mTempDate
            long r1 = r1.getTimeInMillis()
            r8.setTimeInMillis(r1)
            java.util.Calendar r8 = r5.mTempDate
            r8.clear()
            boolean r8 = android.text.TextUtils.isEmpty(r0)
            r1 = 2100(0x834, float:2.943E-42)
            if (r8 != 0) goto L69
            java.util.Calendar r8 = r5.mTempDate
            boolean r8 = r5.parseDate(r0, r8)
            if (r8 != 0) goto L6e
            java.util.Calendar r8 = r5.mTempDate
            r8.set(r1, r4, r3)
            goto L6e
        L69:
            java.util.Calendar r8 = r5.mTempDate
            r8.set(r1, r4, r3)
        L6e:
            java.util.Calendar r8 = r5.mMaxDate
            java.util.Calendar r0 = r5.mTempDate
            long r0 = r0.getTimeInMillis()
            r8.setTimeInMillis(r0)
            int r8 = androidx.leanback.R.styleable.lbDatePicker_datePickerFormat
            java.lang.String r7 = r7.getString(r8)
            boolean r8 = android.text.TextUtils.isEmpty(r7)
            if (r8 == 0) goto L8e
            java.lang.String r7 = new java.lang.String
            char[] r6 = android.text.format.DateFormat.getDateFormatOrder(r6)
            r7.<init>(r6)
        L8e:
            r5.setDatePickerFormat(r7)
            return
    }

    private static boolean isAnyOf(char r3, char[] r4) {
            r0 = 0
            r1 = 0
        L2:
            int r2 = r4.length
            if (r1 >= r2) goto Le
            char r2 = r4[r1]
            if (r3 != r2) goto Lb
            r3 = 1
            return r3
        Lb:
            int r1 = r1 + 1
            goto L2
        Le:
            return r0
    }

    private boolean isNewDate(int r3, int r4, int r5) {
            r2 = this;
            java.util.Calendar r0 = r2.mCurrentDate
            r1 = 1
            int r0 = r0.get(r1)
            if (r0 != r3) goto L1d
            java.util.Calendar r3 = r2.mCurrentDate
            r0 = 2
            int r3 = r3.get(r0)
            if (r3 != r5) goto L1d
            java.util.Calendar r3 = r2.mCurrentDate
            r5 = 5
            int r3 = r3.get(r5)
            if (r3 == r4) goto L1c
            goto L1d
        L1c:
            r1 = 0
        L1d:
            return r1
    }

    private boolean parseDate(java.lang.String r2, java.util.Calendar r3) {
            r1 = this;
            java.text.SimpleDateFormat r0 = r1.mDateFormat     // Catch: java.text.ParseException -> Lb
            java.util.Date r0 = r0.parse(r2)     // Catch: java.text.ParseException -> Lb
            r3.setTime(r0)     // Catch: java.text.ParseException -> Lb
            r2 = 1
            return r2
        Lb:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "Date: "
            r3.append(r0)
            r3.append(r2)
            java.lang.String r2 = " not in format: "
            r3.append(r2)
            java.lang.String r2 = "MM/dd/yyyy"
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            java.lang.String r3 = "DatePicker"
            android.util.Log.w(r3, r2)
            r2 = 0
            return r2
    }

    private void setDate(int r2, int r3, int r4) {
            r1 = this;
            java.util.Calendar r0 = r1.mCurrentDate
            r0.set(r2, r3, r4)
            java.util.Calendar r2 = r1.mCurrentDate
            java.util.Calendar r3 = r1.mMinDate
            boolean r2 = r2.before(r3)
            if (r2 == 0) goto L1b
            java.util.Calendar r2 = r1.mCurrentDate
            java.util.Calendar r3 = r1.mMinDate
            long r3 = r3.getTimeInMillis()
            r2.setTimeInMillis(r3)
            goto L30
        L1b:
            java.util.Calendar r2 = r1.mCurrentDate
            java.util.Calendar r3 = r1.mMaxDate
            boolean r2 = r2.after(r3)
            if (r2 == 0) goto L30
            java.util.Calendar r2 = r1.mCurrentDate
            java.util.Calendar r3 = r1.mMaxDate
            long r3 = r3.getTimeInMillis()
            r2.setTimeInMillis(r3)
        L30:
            return
    }

    private void updateCurrentLocale() {
            r2 = this;
            java.util.Locale r0 = java.util.Locale.getDefault()
            android.content.Context r1 = r2.getContext()
            android.content.res.Resources r1 = r1.getResources()
            androidx.leanback.widget.picker.PickerUtility$DateConstant r0 = androidx.leanback.widget.picker.PickerUtility.getDateConstantInstance(r0, r1)
            r2.mConstant = r0
            java.util.Calendar r1 = r2.mTempDate
            java.util.Locale r0 = r0.locale
            java.util.Calendar r0 = androidx.leanback.widget.picker.PickerUtility.getCalendarForLocale(r1, r0)
            r2.mTempDate = r0
            java.util.Calendar r0 = r2.mMinDate
            androidx.leanback.widget.picker.PickerUtility$DateConstant r1 = r2.mConstant
            java.util.Locale r1 = r1.locale
            java.util.Calendar r0 = androidx.leanback.widget.picker.PickerUtility.getCalendarForLocale(r0, r1)
            r2.mMinDate = r0
            java.util.Calendar r0 = r2.mMaxDate
            androidx.leanback.widget.picker.PickerUtility$DateConstant r1 = r2.mConstant
            java.util.Locale r1 = r1.locale
            java.util.Calendar r0 = androidx.leanback.widget.picker.PickerUtility.getCalendarForLocale(r0, r1)
            r2.mMaxDate = r0
            java.util.Calendar r0 = r2.mCurrentDate
            androidx.leanback.widget.picker.PickerUtility$DateConstant r1 = r2.mConstant
            java.util.Locale r1 = r1.locale
            java.util.Calendar r0 = androidx.leanback.widget.picker.PickerUtility.getCalendarForLocale(r0, r1)
            r2.mCurrentDate = r0
            androidx.leanback.widget.picker.PickerColumn r0 = r2.mMonthColumn
            if (r0 == 0) goto L52
            androidx.leanback.widget.picker.PickerUtility$DateConstant r1 = r2.mConstant
            java.lang.String[] r1 = r1.months
            r0.setStaticLabels(r1)
            int r0 = r2.mColMonthIndex
            androidx.leanback.widget.picker.PickerColumn r1 = r2.mMonthColumn
            r2.setColumnAt(r0, r1)
        L52:
            return
    }

    private static boolean updateMax(androidx.leanback.widget.picker.PickerColumn r1, int r2) {
            int r0 = r1.getMaxValue()
            if (r2 == r0) goto Lb
            r1.setMaxValue(r2)
            r1 = 1
            return r1
        Lb:
            r1 = 0
            return r1
    }

    private static boolean updateMin(androidx.leanback.widget.picker.PickerColumn r1, int r2) {
            int r0 = r1.getMinValue()
            if (r2 == r0) goto Lb
            r1.setMinValue(r2)
            r1 = 1
            return r1
        Lb:
            r1 = 0
            return r1
    }

    private void updateSpinners(boolean r2) {
            r1 = this;
            androidx.leanback.widget.picker.DatePicker$1 r0 = new androidx.leanback.widget.picker.DatePicker$1
            r0.<init>(r1, r2)
            r1.post(r0)
            return
    }

    public long getDate() {
            r2 = this;
            java.util.Calendar r0 = r2.mCurrentDate
            long r0 = r0.getTimeInMillis()
            return r0
    }

    public java.lang.String getDatePickerFormat() {
            r1 = this;
            java.lang.String r0 = r1.mDatePickerFormat
            return r0
    }

    public long getMaxDate() {
            r2 = this;
            java.util.Calendar r0 = r2.mMaxDate
            long r0 = r0.getTimeInMillis()
            return r0
    }

    public long getMinDate() {
            r2 = this;
            java.util.Calendar r0 = r2.mMinDate
            long r0 = r0.getTimeInMillis()
            return r0
    }

    @Override // androidx.leanback.widget.picker.Picker
    public final void onColumnValueChanged(int r6, int r7) {
            r5 = this;
            java.util.Calendar r0 = r5.mTempDate
            java.util.Calendar r1 = r5.mCurrentDate
            long r1 = r1.getTimeInMillis()
            r0.setTimeInMillis(r1)
            androidx.leanback.widget.picker.PickerColumn r0 = r5.getColumnAt(r6)
            int r0 = r0.getCurrentValue()
            int r1 = r5.mColDayIndex
            r2 = 1
            r3 = 2
            r4 = 5
            if (r6 != r1) goto L21
            java.util.Calendar r6 = r5.mTempDate
            int r7 = r7 - r0
            r6.add(r4, r7)
            goto L36
        L21:
            int r1 = r5.mColMonthIndex
            if (r6 != r1) goto L2c
            java.util.Calendar r6 = r5.mTempDate
            int r7 = r7 - r0
            r6.add(r3, r7)
            goto L36
        L2c:
            int r1 = r5.mColYearIndex
            if (r6 != r1) goto L50
            java.util.Calendar r6 = r5.mTempDate
            int r7 = r7 - r0
            r6.add(r2, r7)
        L36:
            java.util.Calendar r6 = r5.mTempDate
            int r6 = r6.get(r2)
            java.util.Calendar r7 = r5.mTempDate
            int r7 = r7.get(r3)
            java.util.Calendar r0 = r5.mTempDate
            int r0 = r0.get(r4)
            r5.setDate(r6, r7, r0)
            r6 = 0
            r5.updateSpinners(r6)
            return
        L50:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            r6.<init>()
            throw r6
    }

    public void setDatePickerFormat(java.lang.String r11) {
            r10 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r11)
            if (r0 == 0) goto L13
            java.lang.String r11 = new java.lang.String
            android.content.Context r0 = r10.getContext()
            char[] r0 = android.text.format.DateFormat.getDateFormatOrder(r0)
            r11.<init>(r0)
        L13:
            java.lang.String r0 = r10.mDatePickerFormat
            boolean r0 = android.text.TextUtils.equals(r0, r11)
            if (r0 == 0) goto L1c
            return
        L1c:
            r10.mDatePickerFormat = r11
            androidx.leanback.widget.picker.PickerUtility$DateConstant r0 = r10.mConstant
            java.util.Locale r0 = r0.locale
            java.lang.String r0 = android.text.format.DateFormat.getBestDateTimePattern(r0, r11)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L2e
            java.lang.String r0 = "MM/dd/yyyy"
        L2e:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r3 = 6
            char[] r3 = new char[r3]
            r3 = {x015e: FILL_ARRAY_DATA , data: [89, 121, 77, 109, 68, 100} // fill-array
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
        L42:
            int r8 = r0.length()
            if (r5 >= r8) goto L7e
            char r8 = r0.charAt(r5)
            r9 = 32
            if (r8 != r9) goto L51
            goto L7b
        L51:
            r9 = 39
            if (r8 != r9) goto L5e
            if (r6 != 0) goto L5c
            r2.setLength(r4)
            r6 = 1
            goto L7b
        L5c:
            r6 = 0
            goto L7b
        L5e:
            if (r6 == 0) goto L64
            r2.append(r8)
            goto L7a
        L64:
            boolean r9 = isAnyOf(r8, r3)
            if (r9 == 0) goto L77
            if (r8 == r7) goto L7a
            java.lang.String r7 = r2.toString()
            r1.add(r7)
            r2.setLength(r4)
            goto L7a
        L77:
            r2.append(r8)
        L7a:
            r7 = r8
        L7b:
            int r5 = r5 + 1
            goto L42
        L7e:
            java.lang.String r0 = r2.toString()
            r1.add(r0)
            int r0 = r1.size()
            int r2 = r11.length()
            int r2 = r2 + 1
            if (r0 != r2) goto L130
            r10.setSeparators(r1)
            r0 = 0
            r10.mDayColumn = r0
            r10.mMonthColumn = r0
            r10.mYearColumn = r0
            r0 = -1
            r10.mColMonthIndex = r0
            r10.mColDayIndex = r0
            r10.mColYearIndex = r0
            java.lang.String r11 = r11.toUpperCase()
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 3
            r0.<init>(r1)
            r1 = 0
        Lad:
            int r2 = r11.length()
            if (r1 >= r2) goto L129
            char r2 = r11.charAt(r1)
            r3 = 68
            java.lang.String r5 = "datePicker format error"
            if (r2 == r3) goto L109
            r3 = 77
            if (r2 == r3) goto Le9
            r3 = 89
            if (r2 != r3) goto Le3
            androidx.leanback.widget.picker.PickerColumn r2 = r10.mYearColumn
            if (r2 != 0) goto Ldd
            androidx.leanback.widget.picker.PickerColumn r2 = new androidx.leanback.widget.picker.PickerColumn
            r2.<init>()
            r10.mYearColumn = r2
            r0.add(r2)
            r10.mColYearIndex = r1
            androidx.leanback.widget.picker.PickerColumn r2 = r10.mYearColumn
            java.lang.String r3 = "%d"
            r2.setLabelFormat(r3)
            goto L120
        Ldd:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            r11.<init>(r5)
            throw r11
        Le3:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            r11.<init>(r5)
            throw r11
        Le9:
            androidx.leanback.widget.picker.PickerColumn r2 = r10.mMonthColumn
            if (r2 != 0) goto L103
            androidx.leanback.widget.picker.PickerColumn r2 = new androidx.leanback.widget.picker.PickerColumn
            r2.<init>()
            r10.mMonthColumn = r2
            r0.add(r2)
            androidx.leanback.widget.picker.PickerColumn r2 = r10.mMonthColumn
            androidx.leanback.widget.picker.PickerUtility$DateConstant r3 = r10.mConstant
            java.lang.String[] r3 = r3.months
            r2.setStaticLabels(r3)
            r10.mColMonthIndex = r1
            goto L120
        L103:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            r11.<init>(r5)
            throw r11
        L109:
            androidx.leanback.widget.picker.PickerColumn r2 = r10.mDayColumn
            if (r2 != 0) goto L123
            androidx.leanback.widget.picker.PickerColumn r2 = new androidx.leanback.widget.picker.PickerColumn
            r2.<init>()
            r10.mDayColumn = r2
            r0.add(r2)
            androidx.leanback.widget.picker.PickerColumn r2 = r10.mDayColumn
            java.lang.String r3 = "%02d"
            r2.setLabelFormat(r3)
            r10.mColDayIndex = r1
        L120:
            int r1 = r1 + 1
            goto Lad
        L123:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            r11.<init>(r5)
            throw r11
        L129:
            r10.setColumns(r0)
            r10.updateSpinners(r4)
            return
        L130:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "Separators size: "
            java.lang.StringBuilder r2 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2)
            int r1 = r1.size()
            r2.append(r1)
            java.lang.String r1 = " must equal"
            r2.append(r1)
            java.lang.String r1 = " the size of datePickerFormat: "
            r2.append(r1)
            int r11 = r11.length()
            r2.append(r11)
            java.lang.String r11 = " + 1"
            r2.append(r11)
            java.lang.String r11 = r2.toString()
            r0.<init>(r11)
            throw r0
    }

    public void setMaxDate(long r4) {
            r3 = this;
            java.util.Calendar r0 = r3.mTempDate
            r0.setTimeInMillis(r4)
            java.util.Calendar r0 = r3.mTempDate
            r1 = 1
            int r0 = r0.get(r1)
            java.util.Calendar r2 = r3.mMaxDate
            int r1 = r2.get(r1)
            if (r0 != r1) goto L24
            java.util.Calendar r0 = r3.mTempDate
            r1 = 6
            int r0 = r0.get(r1)
            java.util.Calendar r2 = r3.mMaxDate
            int r1 = r2.get(r1)
            if (r0 == r1) goto L24
            return
        L24:
            java.util.Calendar r0 = r3.mMaxDate
            r0.setTimeInMillis(r4)
            java.util.Calendar r4 = r3.mCurrentDate
            java.util.Calendar r5 = r3.mMaxDate
            boolean r4 = r4.after(r5)
            if (r4 == 0) goto L3e
            java.util.Calendar r4 = r3.mCurrentDate
            java.util.Calendar r5 = r3.mMaxDate
            long r0 = r5.getTimeInMillis()
            r4.setTimeInMillis(r0)
        L3e:
            r4 = 0
            r3.updateSpinners(r4)
            return
    }

    public void setMinDate(long r4) {
            r3 = this;
            java.util.Calendar r0 = r3.mTempDate
            r0.setTimeInMillis(r4)
            java.util.Calendar r0 = r3.mTempDate
            r1 = 1
            int r0 = r0.get(r1)
            java.util.Calendar r2 = r3.mMinDate
            int r1 = r2.get(r1)
            if (r0 != r1) goto L24
            java.util.Calendar r0 = r3.mTempDate
            r1 = 6
            int r0 = r0.get(r1)
            java.util.Calendar r2 = r3.mMinDate
            int r1 = r2.get(r1)
            if (r0 == r1) goto L24
            return
        L24:
            java.util.Calendar r0 = r3.mMinDate
            r0.setTimeInMillis(r4)
            java.util.Calendar r4 = r3.mCurrentDate
            java.util.Calendar r5 = r3.mMinDate
            boolean r4 = r4.before(r5)
            if (r4 == 0) goto L3e
            java.util.Calendar r4 = r3.mCurrentDate
            java.util.Calendar r5 = r3.mMinDate
            long r0 = r5.getTimeInMillis()
            r4.setTimeInMillis(r0)
        L3e:
            r4 = 0
            r3.updateSpinners(r4)
            return
    }

    public void updateDate(int r2, int r3, int r4, boolean r5) {
            r1 = this;
            boolean r0 = r1.isNewDate(r2, r3, r4)
            if (r0 != 0) goto L7
            return
        L7:
            r1.setDate(r2, r3, r4)
            r1.updateSpinners(r5)
            return
    }

    public final void updateSpinnersImpl(boolean r12) {
            r11 = this;
            r0 = 3
            int[] r0 = new int[r0]
            int r1 = r11.mColDayIndex
            r2 = 0
            r0[r2] = r1
            int r1 = r11.mColMonthIndex
            r3 = 1
            r0[r3] = r1
            int r1 = r11.mColYearIndex
            r4 = 2
            r0[r4] = r1
            int[] r1 = androidx.leanback.widget.picker.DatePicker.DATE_FIELDS
            int r1 = r1.length
            int r1 = r1 - r3
            r4 = 1
            r5 = 1
        L18:
            if (r1 < 0) goto L93
            r6 = r0[r1]
            if (r6 >= 0) goto L20
            goto L90
        L20:
            int[] r6 = androidx.leanback.widget.picker.DatePicker.DATE_FIELDS
            r6 = r6[r1]
            r7 = r0[r1]
            androidx.leanback.widget.picker.PickerColumn r7 = r11.getColumnAt(r7)
            if (r4 == 0) goto L37
            java.util.Calendar r8 = r11.mMinDate
            int r8 = r8.get(r6)
            boolean r8 = updateMin(r7, r8)
            goto L41
        L37:
            java.util.Calendar r8 = r11.mCurrentDate
            int r8 = r8.getActualMinimum(r6)
            boolean r8 = updateMin(r7, r8)
        L41:
            r8 = r8 | r2
            if (r5 == 0) goto L4f
            java.util.Calendar r9 = r11.mMaxDate
            int r9 = r9.get(r6)
            boolean r9 = updateMax(r7, r9)
            goto L59
        L4f:
            java.util.Calendar r9 = r11.mCurrentDate
            int r9 = r9.getActualMaximum(r6)
            boolean r9 = updateMax(r7, r9)
        L59:
            r8 = r8 | r9
            java.util.Calendar r9 = r11.mCurrentDate
            int r9 = r9.get(r6)
            java.util.Calendar r10 = r11.mMinDate
            int r10 = r10.get(r6)
            if (r9 != r10) goto L6a
            r9 = 1
            goto L6b
        L6a:
            r9 = 0
        L6b:
            r4 = r4 & r9
            java.util.Calendar r9 = r11.mCurrentDate
            int r9 = r9.get(r6)
            java.util.Calendar r10 = r11.mMaxDate
            int r10 = r10.get(r6)
            if (r9 != r10) goto L7c
            r9 = 1
            goto L7d
        L7c:
            r9 = 0
        L7d:
            r5 = r5 & r9
            if (r8 == 0) goto L85
            r8 = r0[r1]
            r11.setColumnAt(r8, r7)
        L85:
            r7 = r0[r1]
            java.util.Calendar r8 = r11.mCurrentDate
            int r6 = r8.get(r6)
            r11.setColumnValue(r7, r6, r12)
        L90:
            int r1 = r1 + (-1)
            goto L18
        L93:
            return
    }
}
