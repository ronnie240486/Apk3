package com.google.android.material.datepicker;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public final class MaterialCalendar<S> extends com.google.android.material.datepicker.PickerFragment<S> {
    public static final /* synthetic */ int $r8$clinit = 0;
    private static final java.lang.String CALENDAR_CONSTRAINTS_KEY = "CALENDAR_CONSTRAINTS_KEY";
    private static final java.lang.String CURRENT_MONTH_KEY = "CURRENT_MONTH_KEY";
    private static final java.lang.String DAY_VIEW_DECORATOR_KEY = "DAY_VIEW_DECORATOR_KEY";
    private static final java.lang.String GRID_SELECTOR_KEY = "GRID_SELECTOR_KEY";
    private static final int SMOOTH_SCROLL_MAX = 3;
    private static final java.lang.String THEME_RES_ID_KEY = "THEME_RES_ID_KEY";

    @androidx.annotation.Nullable
    private com.google.android.material.datepicker.CalendarConstraints calendarConstraints;
    private com.google.android.material.datepicker.MaterialCalendar.CalendarSelector calendarSelector;
    private com.google.android.material.datepicker.CalendarStyle calendarStyle;

    @androidx.annotation.Nullable
    private com.google.android.material.datepicker.Month current;

    @androidx.annotation.Nullable
    private com.google.android.material.datepicker.DateSelector<S> dateSelector;
    private android.view.View dayFrame;

    @androidx.annotation.Nullable
    private com.google.android.material.datepicker.DayViewDecorator dayViewDecorator;
    private android.view.View monthNext;
    private android.view.View monthPrev;
    private androidx.recyclerview.widget.RecyclerView recyclerView;

    @androidx.annotation.StyleRes
    private int themeResId;
    private android.view.View yearFrame;
    private androidx.recyclerview.widget.RecyclerView yearSelector;












    public static final enum CalendarSelector extends java.lang.Enum<com.google.android.material.datepicker.MaterialCalendar.CalendarSelector> {
        private static final /* synthetic */ com.google.android.material.datepicker.MaterialCalendar.CalendarSelector[] $VALUES = null;
        public static final com.google.android.material.datepicker.MaterialCalendar.CalendarSelector DAY = null;
        public static final com.google.android.material.datepicker.MaterialCalendar.CalendarSelector YEAR = null;

        static {
                com.google.android.material.datepicker.MaterialCalendar$CalendarSelector r0 = new com.google.android.material.datepicker.MaterialCalendar$CalendarSelector
                java.lang.String r1 = "DAY"
                r2 = 0
                r0.<init>(r1, r2)
                com.google.android.material.datepicker.MaterialCalendar.CalendarSelector.DAY = r0
                com.google.android.material.datepicker.MaterialCalendar$CalendarSelector r1 = new com.google.android.material.datepicker.MaterialCalendar$CalendarSelector
                java.lang.String r3 = "YEAR"
                r4 = 1
                r1.<init>(r3, r4)
                com.google.android.material.datepicker.MaterialCalendar.CalendarSelector.YEAR = r1
                r3 = 2
                com.google.android.material.datepicker.MaterialCalendar$CalendarSelector[] r3 = new com.google.android.material.datepicker.MaterialCalendar.CalendarSelector[r3]
                r3[r2] = r0
                r3[r4] = r1
                com.google.android.material.datepicker.MaterialCalendar.CalendarSelector.$VALUES = r3
                return
        }

        private CalendarSelector(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.google.android.material.datepicker.MaterialCalendar.CalendarSelector valueOf(java.lang.String r1) {
                java.lang.Class<com.google.android.material.datepicker.MaterialCalendar$CalendarSelector> r0 = com.google.android.material.datepicker.MaterialCalendar.CalendarSelector.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.google.android.material.datepicker.MaterialCalendar$CalendarSelector r1 = (com.google.android.material.datepicker.MaterialCalendar.CalendarSelector) r1
                return r1
        }

        public static com.google.android.material.datepicker.MaterialCalendar.CalendarSelector[] values() {
                com.google.android.material.datepicker.MaterialCalendar$CalendarSelector[] r0 = com.google.android.material.datepicker.MaterialCalendar.CalendarSelector.$VALUES
                java.lang.Object r0 = r0.clone()
                com.google.android.material.datepicker.MaterialCalendar$CalendarSelector[] r0 = (com.google.android.material.datepicker.MaterialCalendar.CalendarSelector[]) r0
                return r0
        }
    }

    public interface OnDayClickListener {
        void onDayClick(long r1);
    }

    public MaterialCalendar() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ androidx.recyclerview.widget.RecyclerView access$000(com.google.android.material.datepicker.MaterialCalendar r0) {
            androidx.recyclerview.widget.RecyclerView r0 = r0.recyclerView
            return r0
    }

    public static /* synthetic */ com.google.android.material.datepicker.CalendarConstraints access$100(com.google.android.material.datepicker.MaterialCalendar r0) {
            com.google.android.material.datepicker.CalendarConstraints r0 = r0.calendarConstraints
            return r0
    }

    public static /* synthetic */ com.google.android.material.datepicker.DateSelector access$200(com.google.android.material.datepicker.MaterialCalendar r0) {
            com.google.android.material.datepicker.DateSelector<S> r0 = r0.dateSelector
            return r0
    }

    public static /* synthetic */ androidx.recyclerview.widget.RecyclerView access$300(com.google.android.material.datepicker.MaterialCalendar r0) {
            androidx.recyclerview.widget.RecyclerView r0 = r0.yearSelector
            return r0
    }

    public static /* synthetic */ com.google.android.material.datepicker.CalendarStyle access$400(com.google.android.material.datepicker.MaterialCalendar r0) {
            com.google.android.material.datepicker.CalendarStyle r0 = r0.calendarStyle
            return r0
    }

    public static /* synthetic */ android.view.View access$500(com.google.android.material.datepicker.MaterialCalendar r0) {
            android.view.View r0 = r0.dayFrame
            return r0
    }

    public static /* synthetic */ com.google.android.material.datepicker.Month access$602(com.google.android.material.datepicker.MaterialCalendar r0, com.google.android.material.datepicker.Month r1) {
            r0.current = r1
            return r1
    }

    private void addActionsToMonthNavigation(@androidx.annotation.NonNull android.view.View r4, @androidx.annotation.NonNull com.google.android.material.datepicker.MonthsPagerAdapter r5) {
            r3 = this;
            int r0 = com.google.android.material.R.id.month_navigation_fragment_toggle
            android.view.View r0 = r4.findViewById(r0)
            com.google.android.material.button.MaterialButton r0 = (com.google.android.material.button.MaterialButton) r0
            java.lang.String r1 = "SELECTOR_TOGGLE_TAG"
            r0.setTag(r1)
            com.google.android.material.datepicker.MaterialCalendar$6 r1 = new com.google.android.material.datepicker.MaterialCalendar$6
            r1.<init>(r3)
            androidx.core.view.ViewCompat.setAccessibilityDelegate(r0, r1)
            int r1 = com.google.android.material.R.id.month_navigation_previous
            android.view.View r1 = r4.findViewById(r1)
            r3.monthPrev = r1
            java.lang.String r2 = "NAVIGATION_PREV_TAG"
            r1.setTag(r2)
            int r1 = com.google.android.material.R.id.month_navigation_next
            android.view.View r1 = r4.findViewById(r1)
            r3.monthNext = r1
            java.lang.String r2 = "NAVIGATION_NEXT_TAG"
            r1.setTag(r2)
            int r1 = com.google.android.material.R.id.mtrl_calendar_year_selector_frame
            android.view.View r1 = r4.findViewById(r1)
            r3.yearFrame = r1
            int r1 = com.google.android.material.R.id.mtrl_calendar_day_selector_frame
            android.view.View r4 = r4.findViewById(r1)
            r3.dayFrame = r4
            com.google.android.material.datepicker.MaterialCalendar$CalendarSelector r4 = com.google.android.material.datepicker.MaterialCalendar.CalendarSelector.DAY
            r3.setSelector(r4)
            com.google.android.material.datepicker.Month r4 = r3.current
            java.lang.String r4 = r4.getLongName()
            r0.setText(r4)
            androidx.recyclerview.widget.RecyclerView r4 = r3.recyclerView
            com.google.android.material.datepicker.MaterialCalendar$7 r1 = new com.google.android.material.datepicker.MaterialCalendar$7
            r1.<init>(r3, r5, r0)
            r4.addOnScrollListener(r1)
            com.google.android.material.datepicker.MaterialCalendar$8 r4 = new com.google.android.material.datepicker.MaterialCalendar$8
            r4.<init>(r3)
            r0.setOnClickListener(r4)
            android.view.View r4 = r3.monthNext
            com.google.android.material.datepicker.MaterialCalendar$9 r0 = new com.google.android.material.datepicker.MaterialCalendar$9
            r0.<init>(r3, r5)
            r4.setOnClickListener(r0)
            android.view.View r4 = r3.monthPrev
            com.google.android.material.datepicker.MaterialCalendar$10 r0 = new com.google.android.material.datepicker.MaterialCalendar$10
            r0.<init>(r3, r5)
            r4.setOnClickListener(r0)
            return
    }

    @androidx.annotation.NonNull
    private androidx.recyclerview.widget.RecyclerView.ItemDecoration createItemDecoration() {
            r1 = this;
            com.google.android.material.datepicker.MaterialCalendar$5 r0 = new com.google.android.material.datepicker.MaterialCalendar$5
            r0.<init>(r1)
            return r0
    }

    private static int getDialogPickerHeight(@androidx.annotation.NonNull android.content.Context r5) {
            android.content.res.Resources r5 = r5.getResources()
            int r0 = com.google.android.material.R.dimen.mtrl_calendar_navigation_height
            int r0 = r5.getDimensionPixelSize(r0)
            int r1 = com.google.android.material.R.dimen.mtrl_calendar_navigation_top_padding
            int r1 = r5.getDimensionPixelOffset(r1)
            int r1 = r1 + r0
            int r0 = com.google.android.material.R.dimen.mtrl_calendar_navigation_bottom_padding
            int r0 = r5.getDimensionPixelOffset(r0)
            int r0 = r0 + r1
            int r1 = com.google.android.material.R.dimen.mtrl_calendar_days_of_week_height
            int r1 = r5.getDimensionPixelSize(r1)
            int r2 = com.google.android.material.datepicker.MonthAdapter.MAXIMUM_WEEKS
            int r3 = com.google.android.material.R.dimen.mtrl_calendar_day_height
            int r3 = r5.getDimensionPixelSize(r3)
            int r3 = r3 * r2
            int r2 = r2 + (-1)
            int r4 = com.google.android.material.R.dimen.mtrl_calendar_month_vertical_padding
            int r4 = r5.getDimensionPixelOffset(r4)
            int r4 = r4 * r2
            int r4 = r4 + r3
            int r2 = com.google.android.material.R.dimen.mtrl_calendar_bottom_padding
            int r5 = r5.getDimensionPixelOffset(r2)
            int r0 = r0 + r1
            int r0 = r0 + r4
            int r0 = r0 + r5
            return r0
    }

    @androidx.annotation.NonNull
    public static <T> com.google.android.material.datepicker.MaterialCalendar<T> newInstance(@androidx.annotation.NonNull com.google.android.material.datepicker.DateSelector<T> r1, @androidx.annotation.StyleRes int r2, @androidx.annotation.NonNull com.google.android.material.datepicker.CalendarConstraints r3) {
            r0 = 0
            com.google.android.material.datepicker.MaterialCalendar r1 = newInstance(r1, r2, r3, r0)
            return r1
    }

    @androidx.annotation.NonNull
    public static <T> com.google.android.material.datepicker.MaterialCalendar<T> newInstance(@androidx.annotation.NonNull com.google.android.material.datepicker.DateSelector<T> r3, @androidx.annotation.StyleRes int r4, @androidx.annotation.NonNull com.google.android.material.datepicker.CalendarConstraints r5, @androidx.annotation.Nullable com.google.android.material.datepicker.DayViewDecorator r6) {
            com.google.android.material.datepicker.MaterialCalendar r0 = new com.google.android.material.datepicker.MaterialCalendar
            r0.<init>()
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.lang.String r2 = "THEME_RES_ID_KEY"
            r1.putInt(r2, r4)
            java.lang.String r4 = "GRID_SELECTOR_KEY"
            r1.putParcelable(r4, r3)
            java.lang.String r3 = "CALENDAR_CONSTRAINTS_KEY"
            r1.putParcelable(r3, r5)
            java.lang.String r3 = "DAY_VIEW_DECORATOR_KEY"
            r1.putParcelable(r3, r6)
            com.google.android.material.datepicker.Month r3 = r5.getOpenAt()
            java.lang.String r4 = "CURRENT_MONTH_KEY"
            r1.putParcelable(r4, r3)
            r0.setArguments(r1)
            return r0
    }

    private void postSmoothRecyclerViewScroll(int r3) {
            r2 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r2.recyclerView
            com.google.android.material.datepicker.MaterialCalendar$11 r1 = new com.google.android.material.datepicker.MaterialCalendar$11
            r1.<init>(r2, r3)
            r0.post(r1)
            return
    }

    private void setUpForAccessibility() {
            r2 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r2.recyclerView
            com.google.android.material.datepicker.MaterialCalendar$4 r1 = new com.google.android.material.datepicker.MaterialCalendar$4
            r1.<init>()
            androidx.core.view.ViewCompat.setAccessibilityDelegate(r0, r1)
            return
    }

    @Override // com.google.android.material.datepicker.PickerFragment
    public boolean addOnSelectionChangedListener(@androidx.annotation.NonNull com.google.android.material.datepicker.OnSelectionChangedListener<S> r2) {
            r1 = this;
            java.util.LinkedHashSet<com.google.android.material.datepicker.OnSelectionChangedListener<S>> r0 = r1.onSelectionChangedListeners
            boolean r2 = r0.add(r2)
            return r2
    }

    @androidx.annotation.Nullable
    public final com.google.android.material.datepicker.CalendarConstraints getCalendarConstraints() {
            r1 = this;
            com.google.android.material.datepicker.CalendarConstraints r0 = r1.calendarConstraints
            return r0
    }

    public final com.google.android.material.datepicker.CalendarStyle getCalendarStyle() {
            r1 = this;
            com.google.android.material.datepicker.CalendarStyle r0 = r1.calendarStyle
            return r0
    }

    @androidx.annotation.Nullable
    public final com.google.android.material.datepicker.Month getCurrentMonth() {
            r1 = this;
            com.google.android.material.datepicker.Month r0 = r1.current
            return r0
    }

    @androidx.annotation.Nullable
    public com.google.android.material.datepicker.DateSelector<S> getDateSelector() {
            r1 = this;
            com.google.android.material.datepicker.DateSelector<S> r0 = r1.dateSelector
            return r0
    }

    @androidx.annotation.NonNull
    public final androidx.recyclerview.widget.LinearLayoutManager getLayoutManager() {
            r1 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r1.recyclerView
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r0.getLayoutManager()
            androidx.recyclerview.widget.LinearLayoutManager r0 = (androidx.recyclerview.widget.LinearLayoutManager) r0
            return r0
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@androidx.annotation.Nullable android.os.Bundle r2) {
            r1 = this;
            super.onCreate(r2)
            if (r2 != 0) goto L9
            android.os.Bundle r2 = r1.getArguments()
        L9:
            java.lang.String r0 = "THEME_RES_ID_KEY"
            int r0 = r2.getInt(r0)
            r1.themeResId = r0
            java.lang.String r0 = "GRID_SELECTOR_KEY"
            android.os.Parcelable r0 = r2.getParcelable(r0)
            com.google.android.material.datepicker.DateSelector r0 = (com.google.android.material.datepicker.DateSelector) r0
            r1.dateSelector = r0
            java.lang.String r0 = "CALENDAR_CONSTRAINTS_KEY"
            android.os.Parcelable r0 = r2.getParcelable(r0)
            com.google.android.material.datepicker.CalendarConstraints r0 = (com.google.android.material.datepicker.CalendarConstraints) r0
            r1.calendarConstraints = r0
            java.lang.String r0 = "DAY_VIEW_DECORATOR_KEY"
            android.os.Parcelable r0 = r2.getParcelable(r0)
            com.google.android.material.datepicker.DayViewDecorator r0 = (com.google.android.material.datepicker.DayViewDecorator) r0
            r1.dayViewDecorator = r0
            java.lang.String r0 = "CURRENT_MONTH_KEY"
            android.os.Parcelable r2 = r2.getParcelable(r0)
            com.google.android.material.datepicker.Month r2 = (com.google.android.material.datepicker.Month) r2
            r1.current = r2
            return
    }

    @Override // androidx.fragment.app.Fragment
    @androidx.annotation.NonNull
    public android.view.View onCreateView(@androidx.annotation.NonNull android.view.LayoutInflater r9, @androidx.annotation.Nullable android.view.ViewGroup r10, @androidx.annotation.Nullable android.os.Bundle r11) {
            r8 = this;
            android.view.ContextThemeWrapper r11 = new android.view.ContextThemeWrapper
            android.content.Context r0 = r8.getContext()
            int r1 = r8.themeResId
            r11.<init>(r0, r1)
            com.google.android.material.datepicker.CalendarStyle r0 = new com.google.android.material.datepicker.CalendarStyle
            r0.<init>(r11)
            r8.calendarStyle = r0
            android.view.LayoutInflater r9 = r9.cloneInContext(r11)
            com.google.android.material.datepicker.CalendarConstraints r0 = r8.calendarConstraints
            com.google.android.material.datepicker.Month r0 = r0.getStart()
            boolean r1 = com.google.android.material.datepicker.MaterialDatePicker.isFullscreen(r11)
            r6 = 0
            r7 = 1
            if (r1 == 0) goto L28
            int r1 = com.google.android.material.R.layout.mtrl_calendar_vertical
            r2 = 1
            goto L2b
        L28:
            int r1 = com.google.android.material.R.layout.mtrl_calendar_horizontal
            r2 = 0
        L2b:
            android.view.View r9 = r9.inflate(r1, r10, r6)
            android.content.Context r10 = r8.requireContext()
            int r10 = getDialogPickerHeight(r10)
            r9.setMinimumHeight(r10)
            int r10 = com.google.android.material.R.id.mtrl_calendar_days_of_week
            android.view.View r10 = r9.findViewById(r10)
            android.widget.GridView r10 = (android.widget.GridView) r10
            com.google.android.material.datepicker.MaterialCalendar$1 r1 = new com.google.android.material.datepicker.MaterialCalendar$1
            r1.<init>()
            androidx.core.view.ViewCompat.setAccessibilityDelegate(r10, r1)
            com.google.android.material.datepicker.CalendarConstraints r1 = r8.calendarConstraints
            int r1 = r1.getFirstDayOfWeek()
            com.google.android.material.datepicker.DaysOfWeekAdapter r3 = new com.google.android.material.datepicker.DaysOfWeekAdapter
            if (r1 <= 0) goto L58
            r3.<init>(r1)
            goto L5b
        L58:
            r3.<init>()
        L5b:
            r10.setAdapter(r3)
            int r0 = r0.daysInWeek
            r10.setNumColumns(r0)
            r10.setEnabled(r6)
            int r10 = com.google.android.material.R.id.mtrl_calendar_months
            android.view.View r10 = r9.findViewById(r10)
            androidx.recyclerview.widget.RecyclerView r10 = (androidx.recyclerview.widget.RecyclerView) r10
            r8.recyclerView = r10
            com.google.android.material.datepicker.MaterialCalendar$2 r10 = new com.google.android.material.datepicker.MaterialCalendar$2
            android.content.Context r0 = r8.getContext()
            r10.<init>(r8, r0, r2, r2)
            androidx.recyclerview.widget.RecyclerView r0 = r8.recyclerView
            r0.setLayoutManager(r10)
            androidx.recyclerview.widget.RecyclerView r10 = r8.recyclerView
            java.lang.String r0 = "MONTHS_VIEW_GROUP_TAG"
            r10.setTag(r0)
            com.google.android.material.datepicker.MonthsPagerAdapter r10 = new com.google.android.material.datepicker.MonthsPagerAdapter
            com.google.android.material.datepicker.DateSelector<S> r2 = r8.dateSelector
            com.google.android.material.datepicker.CalendarConstraints r3 = r8.calendarConstraints
            com.google.android.material.datepicker.DayViewDecorator r4 = r8.dayViewDecorator
            com.google.android.material.datepicker.MaterialCalendar$3 r5 = new com.google.android.material.datepicker.MaterialCalendar$3
            r5.<init>(r8)
            r0 = r10
            r1 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            androidx.recyclerview.widget.RecyclerView r0 = r8.recyclerView
            r0.setAdapter(r10)
            android.content.res.Resources r0 = r11.getResources()
            int r1 = com.google.android.material.R.integer.mtrl_calendar_year_selector_span
            int r0 = r0.getInteger(r1)
            int r1 = com.google.android.material.R.id.mtrl_calendar_year_selector_frame
            android.view.View r1 = r9.findViewById(r1)
            androidx.recyclerview.widget.RecyclerView r1 = (androidx.recyclerview.widget.RecyclerView) r1
            r8.yearSelector = r1
            if (r1 == 0) goto Ld2
            r1.setHasFixedSize(r7)
            androidx.recyclerview.widget.RecyclerView r1 = r8.yearSelector
            androidx.recyclerview.widget.GridLayoutManager r2 = new androidx.recyclerview.widget.GridLayoutManager
            r2.<init>(r11, r0, r7, r6)
            r1.setLayoutManager(r2)
            androidx.recyclerview.widget.RecyclerView r0 = r8.yearSelector
            com.google.android.material.datepicker.YearGridAdapter r1 = new com.google.android.material.datepicker.YearGridAdapter
            r1.<init>(r8)
            r0.setAdapter(r1)
            androidx.recyclerview.widget.RecyclerView r0 = r8.yearSelector
            androidx.recyclerview.widget.RecyclerView$ItemDecoration r1 = r8.createItemDecoration()
            r0.addItemDecoration(r1)
        Ld2:
            int r0 = com.google.android.material.R.id.month_navigation_fragment_toggle
            android.view.View r0 = r9.findViewById(r0)
            if (r0 == 0) goto Ldd
            r8.addActionsToMonthNavigation(r9, r10)
        Ldd:
            boolean r11 = com.google.android.material.datepicker.MaterialDatePicker.isFullscreen(r11)
            if (r11 != 0) goto Led
            androidx.recyclerview.widget.PagerSnapHelper r11 = new androidx.recyclerview.widget.PagerSnapHelper
            r11.<init>()
            androidx.recyclerview.widget.RecyclerView r0 = r8.recyclerView
            r11.attachToRecyclerView(r0)
        Led:
            androidx.recyclerview.widget.RecyclerView r11 = r8.recyclerView
            com.google.android.material.datepicker.Month r0 = r8.current
            int r10 = r10.getPosition(r0)
            r11.scrollToPosition(r10)
            r8.setUpForAccessibility()
            return r9
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(@androidx.annotation.NonNull android.os.Bundle r3) {
            r2 = this;
            super.onSaveInstanceState(r3)
            int r0 = r2.themeResId
            java.lang.String r1 = "THEME_RES_ID_KEY"
            r3.putInt(r1, r0)
            com.google.android.material.datepicker.DateSelector<S> r0 = r2.dateSelector
            java.lang.String r1 = "GRID_SELECTOR_KEY"
            r3.putParcelable(r1, r0)
            com.google.android.material.datepicker.CalendarConstraints r0 = r2.calendarConstraints
            java.lang.String r1 = "CALENDAR_CONSTRAINTS_KEY"
            r3.putParcelable(r1, r0)
            com.google.android.material.datepicker.DayViewDecorator r0 = r2.dayViewDecorator
            java.lang.String r1 = "DAY_VIEW_DECORATOR_KEY"
            r3.putParcelable(r1, r0)
            com.google.android.material.datepicker.Month r0 = r2.current
            java.lang.String r1 = "CURRENT_MONTH_KEY"
            r3.putParcelable(r1, r0)
            return
    }

    public final void setCurrentMonth(com.google.android.material.datepicker.Month r7) {
            r6 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r6.recyclerView
            androidx.recyclerview.widget.RecyclerView$Adapter r0 = r0.getAdapter()
            com.google.android.material.datepicker.MonthsPagerAdapter r0 = (com.google.android.material.datepicker.MonthsPagerAdapter) r0
            int r1 = r0.getPosition(r7)
            com.google.android.material.datepicker.Month r2 = r6.current
            int r0 = r0.getPosition(r2)
            int r0 = r1 - r0
            int r2 = java.lang.Math.abs(r0)
            r3 = 1
            r4 = 0
            r5 = 3
            if (r2 <= r5) goto L1f
            r2 = 1
            goto L20
        L1f:
            r2 = 0
        L20:
            if (r0 <= 0) goto L23
            goto L24
        L23:
            r3 = 0
        L24:
            r6.current = r7
            if (r2 == 0) goto L35
            if (r3 == 0) goto L35
            androidx.recyclerview.widget.RecyclerView r7 = r6.recyclerView
            int r0 = r1 + (-3)
            r7.scrollToPosition(r0)
            r6.postSmoothRecyclerViewScroll(r1)
            goto L45
        L35:
            if (r2 == 0) goto L42
            androidx.recyclerview.widget.RecyclerView r7 = r6.recyclerView
            int r0 = r1 + 3
            r7.scrollToPosition(r0)
            r6.postSmoothRecyclerViewScroll(r1)
            goto L45
        L42:
            r6.postSmoothRecyclerViewScroll(r1)
        L45:
            return
    }

    public final void setSelector(com.google.android.material.datepicker.MaterialCalendar.CalendarSelector r5) {
            r4 = this;
            r4.calendarSelector = r5
            com.google.android.material.datepicker.MaterialCalendar$CalendarSelector r0 = com.google.android.material.datepicker.MaterialCalendar.CalendarSelector.YEAR
            r1 = 8
            r2 = 0
            if (r5 != r0) goto L37
            androidx.recyclerview.widget.RecyclerView r5 = r4.yearSelector
            androidx.recyclerview.widget.RecyclerView$LayoutManager r5 = r5.getLayoutManager()
            androidx.recyclerview.widget.RecyclerView r0 = r4.yearSelector
            androidx.recyclerview.widget.RecyclerView$Adapter r0 = r0.getAdapter()
            com.google.android.material.datepicker.YearGridAdapter r0 = (com.google.android.material.datepicker.YearGridAdapter) r0
            com.google.android.material.datepicker.Month r3 = r4.current
            int r3 = r3.year
            int r0 = r0.getPositionForYear(r3)
            r5.scrollToPosition(r0)
            android.view.View r5 = r4.yearFrame
            r5.setVisibility(r2)
            android.view.View r5 = r4.dayFrame
            r5.setVisibility(r1)
            android.view.View r5 = r4.monthPrev
            r5.setVisibility(r1)
            android.view.View r5 = r4.monthNext
            r5.setVisibility(r1)
            goto L54
        L37:
            com.google.android.material.datepicker.MaterialCalendar$CalendarSelector r0 = com.google.android.material.datepicker.MaterialCalendar.CalendarSelector.DAY
            if (r5 != r0) goto L54
            android.view.View r5 = r4.yearFrame
            r5.setVisibility(r1)
            android.view.View r5 = r4.dayFrame
            r5.setVisibility(r2)
            android.view.View r5 = r4.monthPrev
            r5.setVisibility(r2)
            android.view.View r5 = r4.monthNext
            r5.setVisibility(r2)
            com.google.android.material.datepicker.Month r5 = r4.current
            r4.setCurrentMonth(r5)
        L54:
            return
    }

    public final void toggleVisibleSelector() {
            r3 = this;
            com.google.android.material.datepicker.MaterialCalendar$CalendarSelector r0 = r3.calendarSelector
            com.google.android.material.datepicker.MaterialCalendar$CalendarSelector r1 = com.google.android.material.datepicker.MaterialCalendar.CalendarSelector.YEAR
            if (r0 != r1) goto Lc
            com.google.android.material.datepicker.MaterialCalendar$CalendarSelector r0 = com.google.android.material.datepicker.MaterialCalendar.CalendarSelector.DAY
            r3.setSelector(r0)
            goto L13
        Lc:
            com.google.android.material.datepicker.MaterialCalendar$CalendarSelector r2 = com.google.android.material.datepicker.MaterialCalendar.CalendarSelector.DAY
            if (r0 != r2) goto L13
            r3.setSelector(r1)
        L13:
            return
    }
}
