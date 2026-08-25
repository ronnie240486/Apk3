package com.google.android.material.datepicker;

/* JADX INFO: loaded from: classes2.dex */
public final class CalendarConstraints implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.google.android.material.datepicker.CalendarConstraints> CREATOR = null;

    @androidx.annotation.NonNull
    private final com.google.android.material.datepicker.Month end;
    private final int firstDayOfWeek;
    private final int monthSpan;

    @androidx.annotation.Nullable
    private com.google.android.material.datepicker.Month openAt;

    @androidx.annotation.NonNull
    private final com.google.android.material.datepicker.Month start;

    @androidx.annotation.NonNull
    private final com.google.android.material.datepicker.CalendarConstraints.DateValidator validator;
    private final int yearSpan;


    /* JADX INFO: loaded from: classes3.dex */
    public static final class Builder {
        private static final java.lang.String DEEP_COPY_VALIDATOR_KEY = "DEEP_COPY_VALIDATOR_KEY";
        public static final long DEFAULT_END = 0;
        public static final long DEFAULT_START = 0;
        private long end;
        private int firstDayOfWeek;
        private java.lang.Long openAt;
        private long start;
        private com.google.android.material.datepicker.CalendarConstraints.DateValidator validator;

        static {
                r0 = 1900(0x76c, float:2.662E-42)
                r1 = 0
                com.google.android.material.datepicker.Month r0 = com.google.android.material.datepicker.Month.create(r0, r1)
                long r0 = r0.timeInMillis
                long r0 = com.google.android.material.datepicker.UtcDates.canonicalYearMonthDay(r0)
                com.google.android.material.datepicker.CalendarConstraints.Builder.DEFAULT_START = r0
                r0 = 2100(0x834, float:2.943E-42)
                r1 = 11
                com.google.android.material.datepicker.Month r0 = com.google.android.material.datepicker.Month.create(r0, r1)
                long r0 = r0.timeInMillis
                long r0 = com.google.android.material.datepicker.UtcDates.canonicalYearMonthDay(r0)
                com.google.android.material.datepicker.CalendarConstraints.Builder.DEFAULT_END = r0
                return
        }

        public Builder() {
                r2 = this;
                r2.<init>()
                long r0 = com.google.android.material.datepicker.CalendarConstraints.Builder.DEFAULT_START
                r2.start = r0
                long r0 = com.google.android.material.datepicker.CalendarConstraints.Builder.DEFAULT_END
                r2.end = r0
                r0 = -9223372036854775808
                com.google.android.material.datepicker.DateValidatorPointForward r0 = com.google.android.material.datepicker.DateValidatorPointForward.from(r0)
                r2.validator = r0
                return
        }

        public Builder(@androidx.annotation.NonNull com.google.android.material.datepicker.CalendarConstraints r3) {
                r2 = this;
                r2.<init>()
                long r0 = com.google.android.material.datepicker.CalendarConstraints.Builder.DEFAULT_START
                r2.start = r0
                long r0 = com.google.android.material.datepicker.CalendarConstraints.Builder.DEFAULT_END
                r2.end = r0
                r0 = -9223372036854775808
                com.google.android.material.datepicker.DateValidatorPointForward r0 = com.google.android.material.datepicker.DateValidatorPointForward.from(r0)
                r2.validator = r0
                com.google.android.material.datepicker.Month r0 = com.google.android.material.datepicker.CalendarConstraints.access$100(r3)
                long r0 = r0.timeInMillis
                r2.start = r0
                com.google.android.material.datepicker.Month r0 = com.google.android.material.datepicker.CalendarConstraints.access$200(r3)
                long r0 = r0.timeInMillis
                r2.end = r0
                com.google.android.material.datepicker.Month r0 = com.google.android.material.datepicker.CalendarConstraints.access$300(r3)
                long r0 = r0.timeInMillis
                java.lang.Long r0 = java.lang.Long.valueOf(r0)
                r2.openAt = r0
                int r0 = com.google.android.material.datepicker.CalendarConstraints.access$400(r3)
                r2.firstDayOfWeek = r0
                com.google.android.material.datepicker.CalendarConstraints$DateValidator r3 = com.google.android.material.datepicker.CalendarConstraints.access$500(r3)
                r2.validator = r3
                return
        }

        @androidx.annotation.NonNull
        public com.google.android.material.datepicker.CalendarConstraints build() {
                r10 = this;
                android.os.Bundle r0 = new android.os.Bundle
                r0.<init>()
                com.google.android.material.datepicker.CalendarConstraints$DateValidator r1 = r10.validator
                java.lang.String r2 = "DEEP_COPY_VALIDATOR_KEY"
                r0.putParcelable(r2, r1)
                com.google.android.material.datepicker.CalendarConstraints r1 = new com.google.android.material.datepicker.CalendarConstraints
                long r3 = r10.start
                com.google.android.material.datepicker.Month r4 = com.google.android.material.datepicker.Month.create(r3)
                long r5 = r10.end
                com.google.android.material.datepicker.Month r5 = com.google.android.material.datepicker.Month.create(r5)
                android.os.Parcelable r0 = r0.getParcelable(r2)
                r6 = r0
                com.google.android.material.datepicker.CalendarConstraints$DateValidator r6 = (com.google.android.material.datepicker.CalendarConstraints.DateValidator) r6
                java.lang.Long r0 = r10.openAt
                if (r0 != 0) goto L27
                r0 = 0
                goto L2f
            L27:
                long r2 = r0.longValue()
                com.google.android.material.datepicker.Month r0 = com.google.android.material.datepicker.Month.create(r2)
            L2f:
                r7 = r0
                int r8 = r10.firstDayOfWeek
                r9 = 0
                r3 = r1
                r3.<init>(r4, r5, r6, r7, r8, r9)
                return r1
        }

        @androidx.annotation.NonNull
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.material.datepicker.CalendarConstraints.Builder setEnd(long r1) {
                r0 = this;
                r0.end = r1
                return r0
        }

        @androidx.annotation.NonNull
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public com.google.android.material.datepicker.CalendarConstraints.Builder setFirstDayOfWeek(int r1) {
                r0 = this;
                r0.firstDayOfWeek = r1
                return r0
        }

        @androidx.annotation.NonNull
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.material.datepicker.CalendarConstraints.Builder setOpenAt(long r1) {
                r0 = this;
                java.lang.Long r1 = java.lang.Long.valueOf(r1)
                r0.openAt = r1
                return r0
        }

        @androidx.annotation.NonNull
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.material.datepicker.CalendarConstraints.Builder setStart(long r1) {
                r0 = this;
                r0.start = r1
                return r0
        }

        @androidx.annotation.NonNull
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.material.datepicker.CalendarConstraints.Builder setValidator(@androidx.annotation.NonNull com.google.android.material.datepicker.CalendarConstraints.DateValidator r2) {
                r1 = this;
                java.lang.String r0 = "validator cannot be null"
                java.util.Objects.requireNonNull(r2, r0)
                r1.validator = r2
                return r1
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public interface DateValidator extends android.os.Parcelable {
        boolean isValid(long r1);
    }

    static {
            com.google.android.material.datepicker.CalendarConstraints$1 r0 = new com.google.android.material.datepicker.CalendarConstraints$1
            r0.<init>()
            com.google.android.material.datepicker.CalendarConstraints.CREATOR = r0
            return
    }

    private CalendarConstraints(@androidx.annotation.NonNull com.google.android.material.datepicker.Month r2, @androidx.annotation.NonNull com.google.android.material.datepicker.Month r3, @androidx.annotation.NonNull com.google.android.material.datepicker.CalendarConstraints.DateValidator r4, @androidx.annotation.Nullable com.google.android.material.datepicker.Month r5, int r6) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "start cannot be null"
            java.util.Objects.requireNonNull(r2, r0)
            java.lang.String r0 = "end cannot be null"
            java.util.Objects.requireNonNull(r3, r0)
            java.lang.String r0 = "validator cannot be null"
            java.util.Objects.requireNonNull(r4, r0)
            r1.start = r2
            r1.end = r3
            r1.openAt = r5
            r1.firstDayOfWeek = r6
            r1.validator = r4
            if (r5 == 0) goto L30
            int r4 = r2.compareTo2(r5)
            if (r4 > 0) goto L27
            goto L30
        L27:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "start Month cannot be after current Month"
            r2.<init>(r3)
            throw r2
        L30:
            if (r5 == 0) goto L41
            int r4 = r5.compareTo2(r3)
            if (r4 > 0) goto L39
            goto L41
        L39:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "current Month cannot be after end Month"
            r2.<init>(r3)
            throw r2
        L41:
            if (r6 < 0) goto L61
            r4 = 0
            java.util.Calendar r4 = com.google.android.material.datepicker.UtcDates.getUtcCalendarOf(r4)
            r5 = 7
            int r4 = r4.getMaximum(r5)
            if (r6 > r4) goto L61
            int r4 = r2.monthsUntil(r3)
            int r4 = r4 + 1
            r1.monthSpan = r4
            int r3 = r3.year
            int r2 = r2.year
            int r3 = r3 - r2
            int r3 = r3 + 1
            r1.yearSpan = r3
            return
        L61:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "firstDayOfWeek is not valid"
            r2.<init>(r3)
            throw r2
    }

    public /* synthetic */ CalendarConstraints(com.google.android.material.datepicker.Month r1, com.google.android.material.datepicker.Month r2, com.google.android.material.datepicker.CalendarConstraints.DateValidator r3, com.google.android.material.datepicker.Month r4, int r5, com.google.android.material.datepicker.CalendarConstraints.AnonymousClass1 r6) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    public static /* synthetic */ com.google.android.material.datepicker.Month access$100(com.google.android.material.datepicker.CalendarConstraints r0) {
            com.google.android.material.datepicker.Month r0 = r0.start
            return r0
    }

    public static /* synthetic */ com.google.android.material.datepicker.Month access$200(com.google.android.material.datepicker.CalendarConstraints r0) {
            com.google.android.material.datepicker.Month r0 = r0.end
            return r0
    }

    public static /* synthetic */ com.google.android.material.datepicker.Month access$300(com.google.android.material.datepicker.CalendarConstraints r0) {
            com.google.android.material.datepicker.Month r0 = r0.openAt
            return r0
    }

    public static /* synthetic */ int access$400(com.google.android.material.datepicker.CalendarConstraints r0) {
            int r0 = r0.firstDayOfWeek
            return r0
    }

    public static /* synthetic */ com.google.android.material.datepicker.CalendarConstraints.DateValidator access$500(com.google.android.material.datepicker.CalendarConstraints r0) {
            com.google.android.material.datepicker.CalendarConstraints$DateValidator r0 = r0.validator
            return r0
    }

    public final com.google.android.material.datepicker.Month clamp(com.google.android.material.datepicker.Month r2) {
            r1 = this;
            com.google.android.material.datepicker.Month r0 = r1.start
            int r0 = r2.compareTo2(r0)
            if (r0 >= 0) goto Lb
            com.google.android.material.datepicker.Month r2 = r1.start
            return r2
        Lb:
            com.google.android.material.datepicker.Month r0 = r1.end
            int r0 = r2.compareTo2(r0)
            if (r0 <= 0) goto L15
            com.google.android.material.datepicker.Month r2 = r1.end
        L15:
            return r2
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.google.android.material.datepicker.CalendarConstraints
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.google.android.material.datepicker.CalendarConstraints r5 = (com.google.android.material.datepicker.CalendarConstraints) r5
            com.google.android.material.datepicker.Month r1 = r4.start
            com.google.android.material.datepicker.Month r3 = r5.start
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L3b
            com.google.android.material.datepicker.Month r1 = r4.end
            com.google.android.material.datepicker.Month r3 = r5.end
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L3b
            com.google.android.material.datepicker.Month r1 = r4.openAt
            com.google.android.material.datepicker.Month r3 = r5.openAt
            boolean r1 = androidx.core.util.ObjectsCompat.equals(r1, r3)
            if (r1 == 0) goto L3b
            int r1 = r4.firstDayOfWeek
            int r3 = r5.firstDayOfWeek
            if (r1 != r3) goto L3b
            com.google.android.material.datepicker.CalendarConstraints$DateValidator r1 = r4.validator
            com.google.android.material.datepicker.CalendarConstraints$DateValidator r5 = r5.validator
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L3b
            goto L3c
        L3b:
            r0 = 0
        L3c:
            return r0
    }

    public com.google.android.material.datepicker.CalendarConstraints.DateValidator getDateValidator() {
            r1 = this;
            com.google.android.material.datepicker.CalendarConstraints$DateValidator r0 = r1.validator
            return r0
    }

    @androidx.annotation.NonNull
    public final com.google.android.material.datepicker.Month getEnd() {
            r1 = this;
            com.google.android.material.datepicker.Month r0 = r1.end
            return r0
    }

    public long getEndMs() {
            r2 = this;
            com.google.android.material.datepicker.Month r0 = r2.end
            long r0 = r0.timeInMillis
            return r0
    }

    public final int getFirstDayOfWeek() {
            r1 = this;
            int r0 = r1.firstDayOfWeek
            return r0
    }

    public final int getMonthSpan() {
            r1 = this;
            int r0 = r1.monthSpan
            return r0
    }

    @androidx.annotation.Nullable
    public final com.google.android.material.datepicker.Month getOpenAt() {
            r1 = this;
            com.google.android.material.datepicker.Month r0 = r1.openAt
            return r0
    }

    @androidx.annotation.Nullable
    public java.lang.Long getOpenAtMs() {
            r2 = this;
            com.google.android.material.datepicker.Month r0 = r2.openAt
            if (r0 != 0) goto L6
            r0 = 0
            goto Lc
        L6:
            long r0 = r0.timeInMillis
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
        Lc:
            return r0
    }

    @androidx.annotation.NonNull
    public final com.google.android.material.datepicker.Month getStart() {
            r1 = this;
            com.google.android.material.datepicker.Month r0 = r1.start
            return r0
    }

    public long getStartMs() {
            r2 = this;
            com.google.android.material.datepicker.Month r0 = r2.start
            long r0 = r0.timeInMillis
            return r0
    }

    public final int getYearSpan() {
            r1 = this;
            int r0 = r1.yearSpan
            return r0
    }

    public int hashCode() {
            r3 = this;
            r0 = 5
            java.lang.Object[] r0 = new java.lang.Object[r0]
            com.google.android.material.datepicker.Month r1 = r3.start
            r2 = 0
            r0[r2] = r1
            com.google.android.material.datepicker.Month r1 = r3.end
            r2 = 1
            r0[r2] = r1
            com.google.android.material.datepicker.Month r1 = r3.openAt
            r2 = 2
            r0[r2] = r1
            int r1 = r3.firstDayOfWeek
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 3
            r0[r2] = r1
            com.google.android.material.datepicker.CalendarConstraints$DateValidator r1 = r3.validator
            r2 = 4
            r0[r2] = r1
            int r0 = java.util.Arrays.hashCode(r0)
            return r0
    }

    public final boolean isWithinBounds(long r5) {
            r4 = this;
            com.google.android.material.datepicker.Month r0 = r4.start
            r1 = 1
            long r2 = r0.getDay(r1)
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 > 0) goto L18
            com.google.android.material.datepicker.Month r0 = r4.end
            int r2 = r0.daysInMonth
            long r2 = r0.getDay(r2)
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r0 > 0) goto L18
            goto L19
        L18:
            r1 = 0
        L19:
            return r1
    }

    public final void setOpenAt(@androidx.annotation.Nullable com.google.android.material.datepicker.Month r1) {
            r0 = this;
            r0.openAt = r1
            return
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r2, int r3) {
            r1 = this;
            com.google.android.material.datepicker.Month r3 = r1.start
            r0 = 0
            r2.writeParcelable(r3, r0)
            com.google.android.material.datepicker.Month r3 = r1.end
            r2.writeParcelable(r3, r0)
            com.google.android.material.datepicker.Month r3 = r1.openAt
            r2.writeParcelable(r3, r0)
            com.google.android.material.datepicker.CalendarConstraints$DateValidator r3 = r1.validator
            r2.writeParcelable(r3, r0)
            int r3 = r1.firstDayOfWeek
            r2.writeInt(r3)
            return
    }
}
