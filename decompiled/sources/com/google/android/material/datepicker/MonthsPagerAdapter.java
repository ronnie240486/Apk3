package com.google.android.material.datepicker;

/* JADX INFO: loaded from: classes.dex */
class MonthsPagerAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.google.android.material.datepicker.MonthsPagerAdapter.ViewHolder> {

    @androidx.annotation.NonNull
    private final com.google.android.material.datepicker.CalendarConstraints calendarConstraints;
    private final com.google.android.material.datepicker.DateSelector<?> dateSelector;

    @androidx.annotation.Nullable
    private final com.google.android.material.datepicker.DayViewDecorator dayViewDecorator;
    private final int itemHeight;
    private final com.google.android.material.datepicker.MaterialCalendar.OnDayClickListener onDayClickListener;


    public static class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        public final com.google.android.material.datepicker.MaterialCalendarGridView monthGrid;
        public final android.widget.TextView monthTitle;

        public ViewHolder(@androidx.annotation.NonNull android.widget.LinearLayout r3, boolean r4) {
                r2 = this;
                r2.<init>(r3)
                int r0 = com.google.android.material.R.id.month_title
                android.view.View r0 = r3.findViewById(r0)
                android.widget.TextView r0 = (android.widget.TextView) r0
                r2.monthTitle = r0
                r1 = 1
                androidx.core.view.ViewCompat.setAccessibilityHeading(r0, r1)
                int r1 = com.google.android.material.R.id.month_grid
                android.view.View r3 = r3.findViewById(r1)
                com.google.android.material.datepicker.MaterialCalendarGridView r3 = (com.google.android.material.datepicker.MaterialCalendarGridView) r3
                r2.monthGrid = r3
                if (r4 != 0) goto L22
                r3 = 8
                r0.setVisibility(r3)
            L22:
                return
        }
    }

    public MonthsPagerAdapter(@androidx.annotation.NonNull android.content.Context r4, com.google.android.material.datepicker.DateSelector<?> r5, @androidx.annotation.NonNull com.google.android.material.datepicker.CalendarConstraints r6, @androidx.annotation.Nullable com.google.android.material.datepicker.DayViewDecorator r7, com.google.android.material.datepicker.MaterialCalendar.OnDayClickListener r8) {
            r3 = this;
            r3.<init>()
            com.google.android.material.datepicker.Month r0 = r6.getStart()
            com.google.android.material.datepicker.Month r1 = r6.getEnd()
            com.google.android.material.datepicker.Month r2 = r6.getOpenAt()
            int r0 = r0.compareTo2(r2)
            if (r0 > 0) goto L53
            int r0 = r2.compareTo2(r1)
            if (r0 > 0) goto L4b
            int r0 = com.google.android.material.datepicker.MonthAdapter.MAXIMUM_WEEKS
            int r1 = com.google.android.material.datepicker.MaterialCalendar.$r8$clinit
            android.content.res.Resources r1 = r4.getResources()
            int r2 = com.google.android.material.R.dimen.mtrl_calendar_day_height
            int r1 = r1.getDimensionPixelSize(r2)
            int r1 = r1 * r0
            boolean r0 = com.google.android.material.datepicker.MaterialDatePicker.isFullscreen(r4)
            if (r0 == 0) goto L3a
            android.content.res.Resources r4 = r4.getResources()
            int r4 = r4.getDimensionPixelSize(r2)
            goto L3b
        L3a:
            r4 = 0
        L3b:
            int r1 = r1 + r4
            r3.itemHeight = r1
            r3.calendarConstraints = r6
            r3.dateSelector = r5
            r3.dayViewDecorator = r7
            r3.onDayClickListener = r8
            r4 = 1
            r3.setHasStableIds(r4)
            return
        L4b:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "currentPage cannot be after lastPage"
            r4.<init>(r5)
            throw r4
        L53:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "firstPage cannot be after currentPage"
            r4.<init>(r5)
            throw r4
    }

    public static /* synthetic */ com.google.android.material.datepicker.MaterialCalendar.OnDayClickListener access$000(com.google.android.material.datepicker.MonthsPagerAdapter r0) {
            com.google.android.material.datepicker.MaterialCalendar$OnDayClickListener r0 = r0.onDayClickListener
            return r0
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
            r1 = this;
            com.google.android.material.datepicker.CalendarConstraints r0 = r1.calendarConstraints
            int r0 = r0.getMonthSpan()
            return r0
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int r3) {
            r2 = this;
            com.google.android.material.datepicker.CalendarConstraints r0 = r2.calendarConstraints
            com.google.android.material.datepicker.Month r0 = r0.getStart()
            com.google.android.material.datepicker.Month r3 = r0.monthsLater(r3)
            long r0 = r3.getStableId()
            return r0
    }

    @androidx.annotation.NonNull
    public final com.google.android.material.datepicker.Month getPageMonth(int r2) {
            r1 = this;
            com.google.android.material.datepicker.CalendarConstraints r0 = r1.calendarConstraints
            com.google.android.material.datepicker.Month r0 = r0.getStart()
            com.google.android.material.datepicker.Month r2 = r0.monthsLater(r2)
            return r2
    }

    public final int getPosition(@androidx.annotation.NonNull com.google.android.material.datepicker.Month r2) {
            r1 = this;
            com.google.android.material.datepicker.CalendarConstraints r0 = r1.calendarConstraints
            com.google.android.material.datepicker.Month r0 = r0.getStart()
            int r2 = r0.monthsUntil(r2)
            return r2
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ void onBindViewHolder(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.ViewHolder r1, int r2) {
            r0 = this;
            com.google.android.material.datepicker.MonthsPagerAdapter$ViewHolder r1 = (com.google.android.material.datepicker.MonthsPagerAdapter.ViewHolder) r1
            r0.onBindViewHolder(r1, r2)
            return
    }

    public void onBindViewHolder(@androidx.annotation.NonNull com.google.android.material.datepicker.MonthsPagerAdapter.ViewHolder r5, int r6) {
            r4 = this;
            com.google.android.material.datepicker.CalendarConstraints r0 = r4.calendarConstraints
            com.google.android.material.datepicker.Month r0 = r0.getStart()
            com.google.android.material.datepicker.Month r6 = r0.monthsLater(r6)
            android.widget.TextView r0 = r5.monthTitle
            java.lang.String r1 = r6.getLongName()
            r0.setText(r1)
            com.google.android.material.datepicker.MaterialCalendarGridView r5 = r5.monthGrid
            int r0 = com.google.android.material.R.id.month_grid
            android.view.View r5 = r5.findViewById(r0)
            com.google.android.material.datepicker.MaterialCalendarGridView r5 = (com.google.android.material.datepicker.MaterialCalendarGridView) r5
            com.google.android.material.datepicker.MonthAdapter r0 = r5.getAdapter()
            if (r0 == 0) goto L3a
            com.google.android.material.datepicker.MonthAdapter r0 = r5.getAdapter()
            com.google.android.material.datepicker.Month r0 = r0.month
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L3a
            r5.invalidate()
            com.google.android.material.datepicker.MonthAdapter r6 = r5.getAdapter()
            r6.updateSelectedStates(r5)
            goto L4d
        L3a:
            com.google.android.material.datepicker.MonthAdapter r0 = new com.google.android.material.datepicker.MonthAdapter
            com.google.android.material.datepicker.DateSelector<?> r1 = r4.dateSelector
            com.google.android.material.datepicker.CalendarConstraints r2 = r4.calendarConstraints
            com.google.android.material.datepicker.DayViewDecorator r3 = r4.dayViewDecorator
            r0.<init>(r6, r1, r2, r3)
            int r6 = r6.daysInWeek
            r5.setNumColumns(r6)
            r5.setAdapter(r0)
        L4d:
            com.google.android.material.datepicker.MonthsPagerAdapter$1 r6 = new com.google.android.material.datepicker.MonthsPagerAdapter$1
            r6.<init>(r4, r5)
            r5.setOnItemClickListener(r6)
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @androidx.annotation.NonNull
    public /* bridge */ /* synthetic */ androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@androidx.annotation.NonNull android.view.ViewGroup r1, int r2) {
            r0 = this;
            com.google.android.material.datepicker.MonthsPagerAdapter$ViewHolder r1 = r0.onCreateViewHolder(r1, r2)
            return r1
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @androidx.annotation.NonNull
    public com.google.android.material.datepicker.MonthsPagerAdapter.ViewHolder onCreateViewHolder(@androidx.annotation.NonNull android.view.ViewGroup r3, int r4) {
            r2 = this;
            android.content.Context r4 = r3.getContext()
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r4)
            int r0 = com.google.android.material.R.layout.mtrl_calendar_month_labeled
            r1 = 0
            android.view.View r4 = r4.inflate(r0, r3, r1)
            android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
            android.content.Context r3 = r3.getContext()
            boolean r3 = com.google.android.material.datepicker.MaterialDatePicker.isFullscreen(r3)
            if (r3 == 0) goto L2d
            androidx.recyclerview.widget.RecyclerView$LayoutParams r3 = new androidx.recyclerview.widget.RecyclerView$LayoutParams
            r0 = -1
            int r1 = r2.itemHeight
            r3.<init>(r0, r1)
            r4.setLayoutParams(r3)
            com.google.android.material.datepicker.MonthsPagerAdapter$ViewHolder r3 = new com.google.android.material.datepicker.MonthsPagerAdapter$ViewHolder
            r0 = 1
            r3.<init>(r4, r0)
            return r3
        L2d:
            com.google.android.material.datepicker.MonthsPagerAdapter$ViewHolder r3 = new com.google.android.material.datepicker.MonthsPagerAdapter$ViewHolder
            r3.<init>(r4, r1)
            return r3
    }
}
