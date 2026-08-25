package androidx.leanback.widget.picker;

/* JADX INFO: loaded from: classes3.dex */
public class TimePicker extends androidx.leanback.widget.picker.Picker {
    private static final int AM_INDEX = 0;
    private static final int HOURS_IN_HALF_DAY = 12;
    private static final int PM_INDEX = 1;
    public androidx.leanback.widget.picker.PickerColumn mAmPmColumn;
    public int mColAmPmIndex;
    public int mColHourIndex;
    public int mColMinuteIndex;
    private final androidx.leanback.widget.picker.PickerUtility.TimeConstant mConstant;
    private int mCurrentAmPmIndex;
    private int mCurrentHour;
    private int mCurrentMinute;
    public androidx.leanback.widget.picker.PickerColumn mHourColumn;
    private boolean mIs24hFormat;
    public androidx.leanback.widget.picker.PickerColumn mMinuteColumn;
    private java.lang.String mTimePickerFormat;

    public TimePicker(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public TimePicker(android.content.Context r2, android.util.AttributeSet r3, int r4) {
            r1 = this;
            r1.<init>(r2, r3, r4)
            java.util.Locale r4 = java.util.Locale.getDefault()
            android.content.res.Resources r0 = r2.getResources()
            androidx.leanback.widget.picker.PickerUtility$TimeConstant r4 = androidx.leanback.widget.picker.PickerUtility.getTimeConstantInstance(r4, r0)
            r1.mConstant = r4
            int[] r0 = androidx.leanback.R.styleable.lbTimePicker
            android.content.res.TypedArray r3 = r2.obtainStyledAttributes(r3, r0)
            int r0 = androidx.leanback.R.styleable.lbTimePicker_is24HourFormat
            boolean r2 = android.text.format.DateFormat.is24HourFormat(r2)
            boolean r2 = r3.getBoolean(r0, r2)
            r1.mIs24hFormat = r2
            int r2 = androidx.leanback.R.styleable.lbTimePicker_useCurrentTime
            r0 = 1
            boolean r2 = r3.getBoolean(r2, r0)
            r1.updateColumns()
            r1.updateColumnsRange()
            if (r2 == 0) goto L4e
            r2 = 0
            java.util.Locale r3 = r4.locale
            java.util.Calendar r2 = androidx.leanback.widget.picker.PickerUtility.getCalendarForLocale(r2, r3)
            r3 = 11
            int r3 = r2.get(r3)
            r1.setHour(r3)
            r3 = 12
            int r2 = r2.get(r3)
            r1.setMinute(r2)
            r1.setAmPmValue()
        L4e:
            return
    }

    private java.lang.String extractTimeFields() {
            r6 = this;
            java.lang.String r0 = r6.getBestHourMinutePattern()
            androidx.leanback.widget.picker.PickerUtility$TimeConstant r1 = r6.mConstant
            java.util.Locale r1 = r1.locale
            int r1 = android.text.TextUtils.getLayoutDirectionFromLocale(r1)
            r2 = 0
            r3 = 1
            if (r1 != r3) goto L12
            r1 = 1
            goto L13
        L12:
            r1 = 0
        L13:
            r3 = 97
            int r3 = r0.indexOf(r3)
            java.lang.String r4 = "a"
            if (r3 < 0) goto L29
            int r3 = r0.indexOf(r4)
            java.lang.String r5 = "m"
            int r0 = r0.indexOf(r5)
            if (r3 <= r0) goto L2a
        L29:
            r2 = 1
        L2a:
            if (r1 == 0) goto L2f
            java.lang.String r0 = "mh"
            goto L31
        L2f:
            java.lang.String r0 = "hm"
        L31:
            boolean r1 = r6.is24Hour()
            if (r1 == 0) goto L38
            return r0
        L38:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            if (r2 == 0) goto L46
            r1.append(r0)
            r1.append(r4)
            goto L4c
        L46:
            r1.append(r4)
            r1.append(r0)
        L4c:
            java.lang.String r0 = r1.toString()
            return r0
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

    private void setAmPmValue() {
            r3 = this;
            boolean r0 = r3.is24Hour()
            if (r0 != 0) goto Le
            int r0 = r3.mColAmPmIndex
            int r1 = r3.mCurrentAmPmIndex
            r2 = 0
            r3.setColumnValue(r0, r1, r2)
        Le:
            return
    }

    private void updateColumns() {
            r11 = this;
            java.lang.String r0 = r11.getBestHourMinutePattern()
            java.lang.String r1 = r11.mTimePickerFormat
            boolean r1 = android.text.TextUtils.equals(r0, r1)
            if (r1 == 0) goto Ld
            return
        Ld:
            r11.mTimePickerFormat = r0
            java.lang.String r0 = r11.extractTimeFields()
            java.lang.String r1 = r11.getBestHourMinutePattern()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r4 = 7
            char[] r4 = new char[r4]
            r4 = {x0134: FILL_ARRAY_DATA , data: [72, 104, 75, 107, 109, 77, 97} // fill-array
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
        L2b:
            int r9 = r1.length()
            r10 = 1
            if (r6 >= r9) goto L68
            char r9 = r1.charAt(r6)
            r10 = 32
            if (r9 != r10) goto L3b
            goto L65
        L3b:
            r10 = 39
            if (r9 != r10) goto L48
            if (r7 != 0) goto L46
            r3.setLength(r5)
            r7 = 1
            goto L65
        L46:
            r7 = 0
            goto L65
        L48:
            if (r7 == 0) goto L4e
            r3.append(r9)
            goto L64
        L4e:
            boolean r10 = isAnyOf(r9, r4)
            if (r10 == 0) goto L61
            if (r9 == r8) goto L64
            java.lang.String r8 = r3.toString()
            r2.add(r8)
            r3.setLength(r5)
            goto L64
        L61:
            r3.append(r9)
        L64:
            r8 = r9
        L65:
            int r6 = r6 + 1
            goto L2b
        L68:
            java.lang.String r1 = r3.toString()
            r2.add(r1)
            int r1 = r2.size()
            int r3 = r0.length()
            int r3 = r3 + r10
            if (r1 != r3) goto L106
            r11.setSeparators(r2)
            java.lang.String r0 = r0.toUpperCase()
            r1 = 0
            r11.mAmPmColumn = r1
            r11.mMinuteColumn = r1
            r11.mHourColumn = r1
            r1 = -1
            r11.mColAmPmIndex = r1
            r11.mColMinuteIndex = r1
            r11.mColHourIndex = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 3
            r1.<init>(r2)
            r2 = 0
        L96:
            int r3 = r0.length()
            if (r2 >= r3) goto L102
            char r3 = r0.charAt(r2)
            r4 = 65
            if (r3 == r4) goto Le0
            r4 = 72
            if (r3 == r4) goto Lca
            r4 = 77
            if (r3 != r4) goto Lc2
            androidx.leanback.widget.picker.PickerColumn r3 = new androidx.leanback.widget.picker.PickerColumn
            r3.<init>()
            r11.mMinuteColumn = r3
            r1.add(r3)
            androidx.leanback.widget.picker.PickerColumn r3 = r11.mMinuteColumn
            androidx.leanback.widget.picker.PickerUtility$TimeConstant r4 = r11.mConstant
            java.lang.String[] r4 = r4.minutes
            r3.setStaticLabels(r4)
            r11.mColMinuteIndex = r2
            goto Lff
        Lc2:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Invalid time picker format."
            r0.<init>(r1)
            throw r0
        Lca:
            androidx.leanback.widget.picker.PickerColumn r3 = new androidx.leanback.widget.picker.PickerColumn
            r3.<init>()
            r11.mHourColumn = r3
            r1.add(r3)
            androidx.leanback.widget.picker.PickerColumn r3 = r11.mHourColumn
            androidx.leanback.widget.picker.PickerUtility$TimeConstant r4 = r11.mConstant
            java.lang.String[] r4 = r4.hours24
            r3.setStaticLabels(r4)
            r11.mColHourIndex = r2
            goto Lff
        Le0:
            androidx.leanback.widget.picker.PickerColumn r3 = new androidx.leanback.widget.picker.PickerColumn
            r3.<init>()
            r11.mAmPmColumn = r3
            r1.add(r3)
            androidx.leanback.widget.picker.PickerColumn r3 = r11.mAmPmColumn
            androidx.leanback.widget.picker.PickerUtility$TimeConstant r4 = r11.mConstant
            java.lang.String[] r4 = r4.ampm
            r3.setStaticLabels(r4)
            r11.mColAmPmIndex = r2
            androidx.leanback.widget.picker.PickerColumn r3 = r11.mAmPmColumn
            updateMin(r3, r5)
            androidx.leanback.widget.picker.PickerColumn r3 = r11.mAmPmColumn
            updateMax(r3, r10)
        Lff:
            int r2 = r2 + 1
            goto L96
        L102:
            r11.setColumns(r1)
            return
        L106:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r3 = "Separators size: "
            java.lang.StringBuilder r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r3)
            int r2 = r2.size()
            r3.append(r2)
            java.lang.String r2 = " must equal"
            r3.append(r2)
            java.lang.String r2 = " the size of timeFieldsPattern: "
            r3.append(r2)
            int r0 = r0.length()
            r3.append(r0)
            java.lang.String r0 = " + 1"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r1.<init>(r0)
            throw r1
    }

    private void updateColumnsRange() {
            r4 = this;
            androidx.leanback.widget.picker.PickerColumn r0 = r4.mHourColumn
            boolean r1 = r4.mIs24hFormat
            r2 = 1
            r1 = r1 ^ r2
            updateMin(r0, r1)
            androidx.leanback.widget.picker.PickerColumn r0 = r4.mHourColumn
            boolean r1 = r4.mIs24hFormat
            if (r1 == 0) goto L12
            r1 = 23
            goto L14
        L12:
            r1 = 12
        L14:
            updateMax(r0, r1)
            androidx.leanback.widget.picker.PickerColumn r0 = r4.mMinuteColumn
            r1 = 0
            updateMin(r0, r1)
            androidx.leanback.widget.picker.PickerColumn r0 = r4.mMinuteColumn
            r3 = 59
            updateMax(r0, r3)
            androidx.leanback.widget.picker.PickerColumn r0 = r4.mAmPmColumn
            if (r0 == 0) goto L30
            updateMin(r0, r1)
            androidx.leanback.widget.picker.PickerColumn r0 = r4.mAmPmColumn
            updateMax(r0, r2)
        L30:
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

    public java.lang.String getBestHourMinutePattern() {
            r2 = this;
            androidx.leanback.widget.picker.PickerUtility$TimeConstant r0 = r2.mConstant
            java.util.Locale r0 = r0.locale
            boolean r1 = r2.mIs24hFormat
            if (r1 == 0) goto Lb
            java.lang.String r1 = "Hma"
            goto Ld
        Lb:
            java.lang.String r1 = "hma"
        Ld:
            java.lang.String r0 = android.text.format.DateFormat.getBestDateTimePattern(r0, r1)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L19
            java.lang.String r0 = "h:mma"
        L19:
            return r0
    }

    public int getHour() {
            r1 = this;
            boolean r0 = r1.mIs24hFormat
            if (r0 == 0) goto L7
            int r0 = r1.mCurrentHour
            return r0
        L7:
            int r0 = r1.mCurrentAmPmIndex
            if (r0 != 0) goto L10
            int r0 = r1.mCurrentHour
            int r0 = r0 % 12
            return r0
        L10:
            int r0 = r1.mCurrentHour
            int r0 = r0 % 12
            int r0 = r0 + 12
            return r0
    }

    public int getMinute() {
            r1 = this;
            int r0 = r1.mCurrentMinute
            return r0
    }

    public boolean is24Hour() {
            r1 = this;
            boolean r0 = r1.mIs24hFormat
            return r0
    }

    public boolean isPm() {
            r2 = this;
            int r0 = r2.mCurrentAmPmIndex
            r1 = 1
            if (r0 != r1) goto L6
            goto L7
        L6:
            r1 = 0
        L7:
            return r1
    }

    @Override // androidx.leanback.widget.picker.Picker
    public void onColumnValueChanged(int r2, int r3) {
            r1 = this;
            int r0 = r1.mColHourIndex
            if (r2 != r0) goto L7
            r1.mCurrentHour = r3
            goto L14
        L7:
            int r0 = r1.mColMinuteIndex
            if (r2 != r0) goto Le
            r1.mCurrentMinute = r3
            goto L14
        Le:
            int r0 = r1.mColAmPmIndex
            if (r2 != r0) goto L15
            r1.mCurrentAmPmIndex = r3
        L14:
            return
        L15:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Invalid column index."
            r2.<init>(r3)
            throw r2
    }

    public void setHour(@androidx.annotation.IntRange(from = 0, to = 23) int r4) {
            r3 = this;
            if (r4 < 0) goto L2f
            r0 = 23
            if (r4 > r0) goto L2f
            r3.mCurrentHour = r4
            boolean r4 = r3.is24Hour()
            r0 = 0
            if (r4 != 0) goto L27
            int r4 = r3.mCurrentHour
            r1 = 12
            if (r4 < r1) goto L1e
            r2 = 1
            r3.mCurrentAmPmIndex = r2
            if (r4 <= r1) goto L24
            int r4 = r4 - r1
            r3.mCurrentHour = r4
            goto L24
        L1e:
            r3.mCurrentAmPmIndex = r0
            if (r4 != 0) goto L24
            r3.mCurrentHour = r1
        L24:
            r3.setAmPmValue()
        L27:
            int r4 = r3.mColHourIndex
            int r1 = r3.mCurrentHour
            r3.setColumnValue(r4, r1, r0)
            return
        L2f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "hour: "
            java.lang.String r2 = " is not in [0-23] range in"
            java.lang.String r4 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r4, r2)
            r0.<init>(r4)
            throw r0
    }

    public void setIs24Hour(boolean r3) {
            r2 = this;
            boolean r0 = r2.mIs24hFormat
            if (r0 != r3) goto L5
            return
        L5:
            int r0 = r2.getHour()
            int r1 = r2.getMinute()
            r2.mIs24hFormat = r3
            r2.updateColumns()
            r2.updateColumnsRange()
            r2.setHour(r0)
            r2.setMinute(r1)
            r2.setAmPmValue()
            return
    }

    public void setMinute(@androidx.annotation.IntRange(from = 0, to = 59) int r4) {
            r3 = this;
            if (r4 < 0) goto Lf
            r0 = 59
            if (r4 > r0) goto Lf
            r3.mCurrentMinute = r4
            int r0 = r3.mColMinuteIndex
            r1 = 0
            r3.setColumnValue(r0, r4, r1)
            return
        Lf:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "minute: "
            java.lang.String r2 = " is not in [0-59] range."
            java.lang.String r4 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r4, r2)
            r0.<init>(r4)
            throw r0
    }
}
