package com.google.android.material.datepicker;

/* JADX INFO: loaded from: classes.dex */
class DateStrings {
    private DateStrings() {
            r0 = this;
            r0.<init>()
            return
    }

    public static androidx.core.util.Pair<java.lang.String, java.lang.String> getDateRangeString(@androidx.annotation.Nullable java.lang.Long r5, @androidx.annotation.Nullable java.lang.Long r6) {
            r0 = 0
            if (r5 != 0) goto Lb
            if (r6 != 0) goto Lb
            androidx.core.util.Pair r5 = androidx.core.util.Pair.create(r0, r0)
            goto Lb0
        Lb:
            if (r5 != 0) goto L1b
            long r5 = r6.longValue()
            java.lang.String r5 = getDateString$1(r5)
            androidx.core.util.Pair r5 = androidx.core.util.Pair.create(r0, r5)
            goto Lb0
        L1b:
            if (r6 != 0) goto L2b
            long r5 = r5.longValue()
            java.lang.String r5 = getDateString$1(r5)
            androidx.core.util.Pair r5 = androidx.core.util.Pair.create(r5, r0)
            goto Lb0
        L2b:
            java.util.Calendar r1 = com.google.android.material.datepicker.UtcDates.getTodayCalendar()
            java.util.Calendar r2 = com.google.android.material.datepicker.UtcDates.getUtcCalendarOf(r0)
            long r3 = r5.longValue()
            r2.setTimeInMillis(r3)
            java.util.Calendar r0 = com.google.android.material.datepicker.UtcDates.getUtcCalendarOf(r0)
            long r3 = r6.longValue()
            r0.setTimeInMillis(r3)
            r3 = 1
            int r4 = r2.get(r3)
            int r0 = r0.get(r3)
            if (r4 != r0) goto L94
            int r0 = r2.get(r3)
            int r1 = r1.get(r3)
            if (r0 != r1) goto L77
            long r0 = r5.longValue()
            java.util.Locale r5 = java.util.Locale.getDefault()
            java.lang.String r5 = getMonthDay(r0, r5)
            long r0 = r6.longValue()
            java.util.Locale r6 = java.util.Locale.getDefault()
            java.lang.String r6 = getMonthDay(r0, r6)
            androidx.core.util.Pair r5 = androidx.core.util.Pair.create(r5, r6)
            goto Lb0
        L77:
            long r0 = r5.longValue()
            java.util.Locale r5 = java.util.Locale.getDefault()
            java.lang.String r5 = getMonthDay(r0, r5)
            long r0 = r6.longValue()
            java.util.Locale r6 = java.util.Locale.getDefault()
            java.lang.String r6 = getYearMonthDay(r0, r6)
            androidx.core.util.Pair r5 = androidx.core.util.Pair.create(r5, r6)
            goto Lb0
        L94:
            long r0 = r5.longValue()
            java.util.Locale r5 = java.util.Locale.getDefault()
            java.lang.String r5 = getYearMonthDay(r0, r5)
            long r0 = r6.longValue()
            java.util.Locale r6 = java.util.Locale.getDefault()
            java.lang.String r6 = getYearMonthDay(r0, r6)
            androidx.core.util.Pair r5 = androidx.core.util.Pair.create(r5, r6)
        Lb0:
            return r5
    }

    public static java.lang.String getDateString$1(long r1) {
            boolean r0 = isDateWithinCurrentYear(r1)
            if (r0 == 0) goto Lf
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.lang.String r1 = getMonthDay(r1, r0)
            return r1
        Lf:
            java.lang.String r1 = getYearMonthDay(r1)
            return r1
    }

    public static java.lang.String getDayContentDescription(android.content.Context r3, long r4, boolean r6, boolean r7, boolean r8) {
            boolean r0 = isDateWithinCurrentYear(r4)
            r1 = 24
            if (r0 == 0) goto L2c
            java.util.Locale r0 = java.util.Locale.getDefault()
            int r2 = android.os.Build.VERSION.SDK_INT
            if (r2 < r1) goto L1e
            android.icu.text.DateFormat r0 = com.google.android.material.datepicker.UtcDates.getAbbrMonthWeekdayDayFormat(r0)
            java.util.Date r1 = new java.util.Date
            r1.<init>(r4)
            java.lang.String r4 = r0.format(r1)
            goto L4f
        L1e:
            java.text.DateFormat r0 = com.google.android.material.datepicker.UtcDates.getFullFormat(r0)
            java.util.Date r1 = new java.util.Date
            r1.<init>(r4)
            java.lang.String r4 = r0.format(r1)
            goto L4f
        L2c:
            java.util.Locale r0 = java.util.Locale.getDefault()
            int r2 = android.os.Build.VERSION.SDK_INT
            if (r2 < r1) goto L42
            android.icu.text.DateFormat r0 = com.google.android.material.datepicker.UtcDates.getYearAbbrMonthWeekdayDayFormat(r0)
            java.util.Date r1 = new java.util.Date
            r1.<init>(r4)
            java.lang.String r4 = r0.format(r1)
            goto L4f
        L42:
            java.text.DateFormat r0 = com.google.android.material.datepicker.UtcDates.getFullFormat(r0)
            java.util.Date r1 = new java.util.Date
            r1.<init>(r4)
            java.lang.String r4 = r0.format(r1)
        L4f:
            r5 = 0
            r0 = 1
            if (r6 == 0) goto L61
            int r6 = com.google.android.material.R.string.mtrl_picker_today_description
            java.lang.String r6 = r3.getString(r6)
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r1[r5] = r4
            java.lang.String r4 = java.lang.String.format(r6, r1)
        L61:
            if (r7 == 0) goto L72
            int r6 = com.google.android.material.R.string.mtrl_picker_start_date_description
            java.lang.String r3 = r3.getString(r6)
            java.lang.Object[] r6 = new java.lang.Object[r0]
            r6[r5] = r4
            java.lang.String r3 = java.lang.String.format(r3, r6)
            return r3
        L72:
            if (r8 == 0) goto L83
            int r6 = com.google.android.material.R.string.mtrl_picker_end_date_description
            java.lang.String r3 = r3.getString(r6)
            java.lang.Object[] r6 = new java.lang.Object[r0]
            r6[r5] = r4
            java.lang.String r3 = java.lang.String.format(r3, r6)
            return r3
        L83:
            return r4
    }

    public static java.lang.String getMonthDay(long r2, java.util.Locale r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 < r1) goto L14
            android.icu.text.DateFormat r4 = com.google.android.material.datepicker.UtcDates.getAbbrMonthDayFormat(r4)
            java.util.Date r0 = new java.util.Date
            r0.<init>(r2)
            java.lang.String r2 = r4.format(r0)
            return r2
        L14:
            java.text.DateFormat r4 = com.google.android.material.datepicker.UtcDates.getMediumNoYear(r4)
            java.util.Date r0 = new java.util.Date
            r0.<init>(r2)
            java.lang.String r2 = r4.format(r0)
            return r2
    }

    public static java.lang.String getYearMonthDay(long r1) {
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.lang.String r1 = getYearMonthDay(r1, r0)
            return r1
    }

    public static java.lang.String getYearMonthDay(long r2, java.util.Locale r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 < r1) goto L14
            android.icu.text.DateFormat r4 = com.google.android.material.datepicker.UtcDates.getYearAbbrMonthDayFormat(r4)
            java.util.Date r0 = new java.util.Date
            r0.<init>(r2)
            java.lang.String r2 = r4.format(r0)
            return r2
        L14:
            java.text.DateFormat r4 = com.google.android.material.datepicker.UtcDates.getMediumFormat(r4)
            java.util.Date r0 = new java.util.Date
            r0.<init>(r2)
            java.lang.String r2 = r4.format(r0)
            return r2
    }

    private static boolean isDateWithinCurrentYear(long r2) {
            java.util.Calendar r0 = com.google.android.material.datepicker.UtcDates.getTodayCalendar()
            r1 = 0
            java.util.Calendar r1 = com.google.android.material.datepicker.UtcDates.getUtcCalendarOf(r1)
            r1.setTimeInMillis(r2)
            r2 = 1
            int r3 = r0.get(r2)
            int r0 = r1.get(r2)
            if (r3 != r0) goto L18
            goto L19
        L18:
            r2 = 0
        L19:
            return r2
    }
}
