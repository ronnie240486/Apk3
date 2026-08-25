package androidx.leanback.widget;

/* JADX INFO: loaded from: classes.dex */
public class GuidedDatePickerAction extends androidx.leanback.widget.GuidedAction {
    public long mDate;
    public java.lang.String mDatePickerFormat;
    public long mMaxDate;
    public long mMinDate;

    /* JADX INFO: loaded from: classes2.dex */
    public static final class Builder extends androidx.leanback.widget.GuidedDatePickerAction.BuilderBase<androidx.leanback.widget.GuidedDatePickerAction.Builder> {
        public Builder(android.content.Context r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public androidx.leanback.widget.GuidedDatePickerAction build() {
                r1 = this;
                androidx.leanback.widget.GuidedDatePickerAction r0 = new androidx.leanback.widget.GuidedDatePickerAction
                r0.<init>()
                r1.applyDatePickerValues(r0)
                return r0
        }
    }

    public static abstract class BuilderBase<B extends androidx.leanback.widget.GuidedDatePickerAction.BuilderBase> extends androidx.leanback.widget.GuidedAction.BuilderBase<B> {
        private long mDate;
        private java.lang.String mDatePickerFormat;
        private long mMaxDate;
        private long mMinDate;

        public BuilderBase(android.content.Context r3) {
                r2 = this;
                r2.<init>(r3)
                r0 = -9223372036854775808
                r2.mMinDate = r0
                r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r2.mMaxDate = r0
                java.util.Calendar r3 = java.util.Calendar.getInstance()
                long r0 = r3.getTimeInMillis()
                r2.mDate = r0
                r3 = 1
                r2.hasEditableActivatorView(r3)
                return
        }

        public final void applyDatePickerValues(androidx.leanback.widget.GuidedDatePickerAction r6) {
                r5 = this;
                r5.applyValues(r6)
                java.lang.String r0 = r5.mDatePickerFormat
                r6.mDatePickerFormat = r0
                long r0 = r5.mDate
                r6.mDate = r0
                long r0 = r5.mMinDate
                long r2 = r5.mMaxDate
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 > 0) goto L18
                r6.mMinDate = r0
                r6.mMaxDate = r2
                return
            L18:
                java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "MinDate cannot be larger than MaxDate"
                r6.<init>(r0)
                throw r6
        }

        public B date(long r1) {
                r0 = this;
                r0.mDate = r1
                return r0
        }

        public B datePickerFormat(java.lang.String r1) {
                r0 = this;
                r0.mDatePickerFormat = r1
                return r0
        }

        public B maxDate(long r1) {
                r0 = this;
                r0.mMaxDate = r1
                return r0
        }

        public B minDate(long r1) {
                r0 = this;
                r0.mMinDate = r1
                return r0
        }
    }

    public GuidedDatePickerAction() {
            r2 = this;
            r2.<init>()
            r0 = -9223372036854775808
            r2.mMinDate = r0
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r2.mMaxDate = r0
            return
    }

    public long getDate() {
            r2 = this;
            long r0 = r2.mDate
            return r0
    }

    public java.lang.String getDatePickerFormat() {
            r1 = this;
            java.lang.String r0 = r1.mDatePickerFormat
            return r0
    }

    public long getMaxDate() {
            r2 = this;
            long r0 = r2.mMaxDate
            return r0
    }

    public long getMinDate() {
            r2 = this;
            long r0 = r2.mMinDate
            return r0
    }

    @Override // androidx.leanback.widget.GuidedAction
    public void onRestoreInstanceState(android.os.Bundle r3, java.lang.String r4) {
            r2 = this;
            long r0 = r2.getDate()
            long r3 = r3.getLong(r4, r0)
            r2.setDate(r3)
            return
    }

    @Override // androidx.leanback.widget.GuidedAction
    public void onSaveInstanceState(android.os.Bundle r3, java.lang.String r4) {
            r2 = this;
            long r0 = r2.getDate()
            r3.putLong(r4, r0)
            return
    }

    public void setDate(long r1) {
            r0 = this;
            r0.mDate = r1
            return
    }
}
