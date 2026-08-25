package androidx.leanback.widget.picker;

/* JADX INFO: loaded from: classes2.dex */
class PickerUtility {

    /* JADX INFO: loaded from: classes.dex */
    public static class DateConstant {
        public final java.lang.String[] days;
        public final java.util.Locale locale;
        public final java.lang.String[] months;

        public DateConstant(java.util.Locale r3) {
                r2 = this;
                r2.<init>()
                r2.locale = r3
                java.text.DateFormatSymbols r0 = java.text.DateFormatSymbols.getInstance(r3)
                java.lang.String[] r0 = r0.getShortMonths()
                r2.months = r0
                java.util.Calendar r3 = java.util.Calendar.getInstance(r3)
                r0 = 5
                int r1 = r3.getMinimum(r0)
                int r3 = r3.getMaximum(r0)
                java.lang.String r0 = "%02d"
                java.lang.String[] r3 = androidx.leanback.widget.picker.PickerUtility.createStringIntArrays(r1, r3, r0)
                r2.days = r3
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static class TimeConstant {
        public final java.lang.String[] ampm;
        public final java.lang.String[] hours12;
        public final java.lang.String[] hours24;
        public final java.util.Locale locale;
        public final java.lang.String[] minutes;

        public TimeConstant(java.util.Locale r4) {
                r3 = this;
                r3.<init>()
                r3.locale = r4
                java.text.DateFormatSymbols r4 = java.text.DateFormatSymbols.getInstance(r4)
                r0 = 1
                r1 = 12
                java.lang.String r2 = "%02d"
                java.lang.String[] r0 = androidx.leanback.widget.picker.PickerUtility.createStringIntArrays(r0, r1, r2)
                r3.hours12 = r0
                r0 = 0
                r1 = 23
                java.lang.String[] r1 = androidx.leanback.widget.picker.PickerUtility.createStringIntArrays(r0, r1, r2)
                r3.hours24 = r1
                r1 = 59
                java.lang.String[] r0 = androidx.leanback.widget.picker.PickerUtility.createStringIntArrays(r0, r1, r2)
                r3.minutes = r0
                java.lang.String[] r4 = r4.getAmPmStrings()
                r3.ampm = r4
                return
        }
    }

    private PickerUtility() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String[] createStringIntArrays(int r7, int r8, java.lang.String r9) {
            int r0 = r8 - r7
            r1 = 1
            int r0 = r0 + r1
            java.lang.String[] r0 = new java.lang.String[r0]
            r2 = r7
        L7:
            if (r2 > r8) goto L28
            if (r9 == 0) goto L1d
            int r3 = r2 - r7
            java.lang.Object[] r4 = new java.lang.Object[r1]
            r5 = 0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
            r4[r5] = r6
            java.lang.String r4 = java.lang.String.format(r9, r4)
            r0[r3] = r4
            goto L25
        L1d:
            int r3 = r2 - r7
            java.lang.String r4 = java.lang.String.valueOf(r2)
            r0[r3] = r4
        L25:
            int r2 = r2 + 1
            goto L7
        L28:
            return r0
    }

    public static java.util.Calendar getCalendarForLocale(java.util.Calendar r2, java.util.Locale r3) {
            if (r2 != 0) goto L7
            java.util.Calendar r2 = java.util.Calendar.getInstance(r3)
            return r2
        L7:
            long r0 = r2.getTimeInMillis()
            java.util.Calendar r2 = java.util.Calendar.getInstance(r3)
            r2.setTimeInMillis(r0)
            return r2
    }

    public static androidx.leanback.widget.picker.PickerUtility.DateConstant getDateConstantInstance(java.util.Locale r0, android.content.res.Resources r1) {
            androidx.leanback.widget.picker.PickerUtility$DateConstant r1 = new androidx.leanback.widget.picker.PickerUtility$DateConstant
            r1.<init>(r0)
            return r1
    }

    public static androidx.leanback.widget.picker.PickerUtility.TimeConstant getTimeConstantInstance(java.util.Locale r0, android.content.res.Resources r1) {
            androidx.leanback.widget.picker.PickerUtility$TimeConstant r1 = new androidx.leanback.widget.picker.PickerUtility$TimeConstant
            r1.<init>(r0)
            return r1
    }
}
