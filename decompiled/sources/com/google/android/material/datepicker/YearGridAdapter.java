package com.google.android.material.datepicker;

/* JADX INFO: loaded from: classes.dex */
class YearGridAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.google.android.material.datepicker.YearGridAdapter.ViewHolder> {
    private final com.google.android.material.datepicker.MaterialCalendar<?> materialCalendar;


    /* JADX INFO: loaded from: classes2.dex */
    public static class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        public final android.widget.TextView textView;

        public ViewHolder(android.widget.TextView r1) {
                r0 = this;
                r0.<init>(r1)
                r0.textView = r1
                return
        }
    }

    public YearGridAdapter(com.google.android.material.datepicker.MaterialCalendar<?> r1) {
            r0 = this;
            r0.<init>()
            r0.materialCalendar = r1
            return
    }

    public static /* synthetic */ com.google.android.material.datepicker.MaterialCalendar access$000(com.google.android.material.datepicker.YearGridAdapter r0) {
            com.google.android.material.datepicker.MaterialCalendar<?> r0 = r0.materialCalendar
            return r0
    }

    @androidx.annotation.NonNull
    private android.view.View.OnClickListener createYearClickListener(int r2) {
            r1 = this;
            com.google.android.material.datepicker.YearGridAdapter$1 r0 = new com.google.android.material.datepicker.YearGridAdapter$1
            r0.<init>(r1, r2)
            return r0
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
            r1 = this;
            com.google.android.material.datepicker.MaterialCalendar<?> r0 = r1.materialCalendar
            com.google.android.material.datepicker.CalendarConstraints r0 = r0.getCalendarConstraints()
            int r0 = r0.getYearSpan()
            return r0
    }

    public final int getPositionForYear(int r2) {
            r1 = this;
            com.google.android.material.datepicker.MaterialCalendar<?> r0 = r1.materialCalendar
            com.google.android.material.datepicker.CalendarConstraints r0 = r0.getCalendarConstraints()
            com.google.android.material.datepicker.Month r0 = r0.getStart()
            int r0 = r0.year
            int r2 = r2 - r0
            return r2
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ void onBindViewHolder(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.ViewHolder r1, int r2) {
            r0 = this;
            com.google.android.material.datepicker.YearGridAdapter$ViewHolder r1 = (com.google.android.material.datepicker.YearGridAdapter.ViewHolder) r1
            r0.onBindViewHolder(r1, r2)
            return
    }

    public void onBindViewHolder(@androidx.annotation.NonNull com.google.android.material.datepicker.YearGridAdapter.ViewHolder r8, int r9) {
            r7 = this;
            com.google.android.material.datepicker.MaterialCalendar<?> r0 = r7.materialCalendar
            com.google.android.material.datepicker.CalendarConstraints r0 = r0.getCalendarConstraints()
            com.google.android.material.datepicker.Month r0 = r0.getStart()
            int r0 = r0.year
            int r0 = r0 + r9
            android.widget.TextView r9 = r8.textView
            java.util.Locale r1 = java.util.Locale.getDefault()
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            r5 = 0
            r3[r5] = r4
            java.lang.String r4 = "%d"
            java.lang.String r1 = java.lang.String.format(r1, r4, r3)
            r9.setText(r1)
            android.widget.TextView r9 = r8.textView
            android.content.Context r1 = r9.getContext()
            java.util.Calendar r3 = com.google.android.material.datepicker.UtcDates.getTodayCalendar()
            int r3 = r3.get(r2)
            if (r3 != r0) goto L49
            int r3 = com.google.android.material.R.string.mtrl_picker_navigate_to_current_year_description
            java.lang.String r1 = r1.getString(r3)
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            r3[r5] = r4
            java.lang.String r1 = java.lang.String.format(r1, r3)
            goto L5b
        L49:
            int r3 = com.google.android.material.R.string.mtrl_picker_navigate_to_year_description
            java.lang.String r1 = r1.getString(r3)
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            r3[r5] = r4
            java.lang.String r1 = java.lang.String.format(r1, r3)
        L5b:
            r9.setContentDescription(r1)
            com.google.android.material.datepicker.MaterialCalendar<?> r9 = r7.materialCalendar
            com.google.android.material.datepicker.CalendarStyle r9 = r9.getCalendarStyle()
            java.util.Calendar r1 = com.google.android.material.datepicker.UtcDates.getTodayCalendar()
            int r3 = r1.get(r2)
            if (r3 != r0) goto L71
            com.google.android.material.datepicker.CalendarItemStyle r3 = r9.todayYear
            goto L73
        L71:
            com.google.android.material.datepicker.CalendarItemStyle r3 = r9.year
        L73:
            com.google.android.material.datepicker.MaterialCalendar<?> r4 = r7.materialCalendar
            com.google.android.material.datepicker.DateSelector r4 = r4.getDateSelector()
            java.util.Collection r4 = r4.getSelectedDays()
            java.util.Iterator r4 = r4.iterator()
        L81:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L9d
            java.lang.Object r5 = r4.next()
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            r1.setTimeInMillis(r5)
            int r5 = r1.get(r2)
            if (r5 != r0) goto L81
            com.google.android.material.datepicker.CalendarItemStyle r3 = r9.selectedYear
            goto L81
        L9d:
            android.widget.TextView r9 = r8.textView
            r1 = 0
            r3.styleItem(r9, r1)
            android.widget.TextView r8 = r8.textView
            android.view.View$OnClickListener r9 = r7.createYearClickListener(r0)
            r8.setOnClickListener(r9)
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @androidx.annotation.NonNull
    public /* bridge */ /* synthetic */ androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@androidx.annotation.NonNull android.view.ViewGroup r1, int r2) {
            r0 = this;
            com.google.android.material.datepicker.YearGridAdapter$ViewHolder r1 = r0.onCreateViewHolder(r1, r2)
            return r1
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @androidx.annotation.NonNull
    public com.google.android.material.datepicker.YearGridAdapter.ViewHolder onCreateViewHolder(@androidx.annotation.NonNull android.view.ViewGroup r3, int r4) {
            r2 = this;
            android.content.Context r4 = r3.getContext()
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r4)
            int r0 = com.google.android.material.R.layout.mtrl_calendar_year
            r1 = 0
            android.view.View r3 = r4.inflate(r0, r3, r1)
            android.widget.TextView r3 = (android.widget.TextView) r3
            com.google.android.material.datepicker.YearGridAdapter$ViewHolder r4 = new com.google.android.material.datepicker.YearGridAdapter$ViewHolder
            r4.<init>(r3)
            return r4
    }
}
