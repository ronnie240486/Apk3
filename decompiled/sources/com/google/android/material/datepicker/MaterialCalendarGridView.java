package com.google.android.material.datepicker;

/* JADX INFO: loaded from: classes3.dex */
final class MaterialCalendarGridView extends android.widget.GridView {
    private final java.util.Calendar dayCompute;
    private final boolean nestedScrollable;


    public MaterialCalendarGridView(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public MaterialCalendarGridView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public MaterialCalendarGridView(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r1 = 0
            java.util.Calendar r1 = com.google.android.material.datepicker.UtcDates.getUtcCalendarOf(r1)
            r0.dayCompute = r1
            android.content.Context r1 = r0.getContext()
            boolean r1 = com.google.android.material.datepicker.MaterialDatePicker.isFullscreen(r1)
            if (r1 == 0) goto L1e
            int r1 = com.google.android.material.R.id.cancel_button
            r0.setNextFocusLeftId(r1)
            int r1 = com.google.android.material.R.id.confirm_button
            r0.setNextFocusRightId(r1)
        L1e:
            android.content.Context r1 = r0.getContext()
            int r2 = com.google.android.material.R.attr.nestedScrollable
            boolean r1 = com.google.android.material.datepicker.MaterialDatePicker.readMaterialCalendarStyleBoolean(r1, r2)
            r0.nestedScrollable = r1
            com.google.android.material.datepicker.MaterialCalendarGridView$1 r1 = new com.google.android.material.datepicker.MaterialCalendarGridView$1
            r1.<init>()
            androidx.core.view.ViewCompat.setAccessibilityDelegate(r0, r1)
            return
    }

    private void gainFocus(int r2, android.graphics.Rect r3) {
            r1 = this;
            r0 = 33
            if (r2 != r0) goto L10
            com.google.android.material.datepicker.MonthAdapter r2 = r1.getAdapter()
            int r2 = r2.lastPositionInMonth()
            r1.setSelection(r2)
            goto L24
        L10:
            r0 = 130(0x82, float:1.82E-43)
            if (r2 != r0) goto L20
            com.google.android.material.datepicker.MonthAdapter r2 = r1.getAdapter()
            int r2 = r2.firstPositionInMonth()
            r1.setSelection(r2)
            goto L24
        L20:
            r0 = 1
            super.onFocusChanged(r0, r2, r3)
        L24:
            return
    }

    private android.view.View getChildAtPosition(int r2) {
            r1 = this;
            int r0 = r1.getFirstVisiblePosition()
            int r2 = r2 - r0
            android.view.View r2 = r1.getChildAt(r2)
            return r2
    }

    private static int horizontalMidPoint(@androidx.annotation.NonNull android.view.View r1) {
            int r0 = r1.getLeft()
            int r1 = r1.getWidth()
            int r1 = r1 / 2
            int r1 = r1 + r0
            return r1
    }

    private static boolean skipMonth(@androidx.annotation.Nullable java.lang.Long r4, @androidx.annotation.Nullable java.lang.Long r5, @androidx.annotation.Nullable java.lang.Long r6, @androidx.annotation.Nullable java.lang.Long r7) {
            r0 = 1
            if (r4 == 0) goto L24
            if (r5 == 0) goto L24
            if (r6 == 0) goto L24
            if (r7 != 0) goto La
            goto L24
        La:
            long r1 = r6.longValue()
            long r5 = r5.longValue()
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 > 0) goto L24
            long r5 = r7.longValue()
            long r1 = r4.longValue()
            int r4 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r4 >= 0) goto L23
            goto L24
        L23:
            r0 = 0
        L24:
            return r0
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    @androidx.annotation.NonNull
    public /* bridge */ /* synthetic */ android.widget.Adapter getAdapter() {
            r1 = this;
            com.google.android.material.datepicker.MonthAdapter r0 = r1.getAdapter()
            return r0
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    @androidx.annotation.NonNull
    public /* bridge */ /* synthetic */ android.widget.ListAdapter getAdapter() {
            r1 = this;
            com.google.android.material.datepicker.MonthAdapter r0 = r1.getAdapter()
            return r0
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    @androidx.annotation.NonNull
    public com.google.android.material.datepicker.MonthAdapter getAdapter() {
            r1 = this;
            android.widget.ListAdapter r0 = super.getAdapter()
            com.google.android.material.datepicker.MonthAdapter r0 = (com.google.android.material.datepicker.MonthAdapter) r0
            return r0
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
            r1 = this;
            super.onAttachedToWindow()
            com.google.android.material.datepicker.MonthAdapter r0 = r1.getAdapter()
            r0.notifyDataSetChanged()
            return
    }

    @Override // android.view.View
    public final void onDraw(@androidx.annotation.NonNull android.graphics.Canvas r29) {
            r28 = this;
            r0 = r28
            super.onDraw(r29)
            com.google.android.material.datepicker.MonthAdapter r1 = r28.getAdapter()
            com.google.android.material.datepicker.DateSelector<?> r2 = r1.dateSelector
            com.google.android.material.datepicker.CalendarStyle r3 = r1.calendarStyle
            int r4 = r1.firstPositionInMonth()
            int r5 = r28.getFirstVisiblePosition()
            int r4 = java.lang.Math.max(r4, r5)
            int r5 = r1.lastPositionInMonth()
            int r6 = r28.getLastVisiblePosition()
            int r5 = java.lang.Math.min(r5, r6)
            java.lang.Long r6 = r1.getItem(r4)
            java.lang.Long r7 = r1.getItem(r5)
            java.util.Collection r2 = r2.getSelectedRanges()
            java.util.Iterator r2 = r2.iterator()
        L35:
            boolean r8 = r2.hasNext()
            if (r8 == 0) goto L18a
            java.lang.Object r8 = r2.next()
            androidx.core.util.Pair r8 = (androidx.core.util.Pair) r8
            F r9 = r8.first
            if (r9 == 0) goto L186
            S r10 = r8.second
            if (r10 != 0) goto L4a
            goto L35
        L4a:
            java.lang.Long r9 = (java.lang.Long) r9
            long r9 = r9.longValue()
            S r8 = r8.second
            java.lang.Long r8 = (java.lang.Long) r8
            long r11 = r8.longValue()
            java.lang.Long r8 = java.lang.Long.valueOf(r9)
            java.lang.Long r13 = java.lang.Long.valueOf(r11)
            boolean r8 = skipMonth(r6, r7, r8, r13)
            if (r8 == 0) goto L67
            goto L35
        L67:
            boolean r8 = com.google.android.material.internal.ViewUtils.isLayoutRtl(r28)
            long r13 = r6.longValue()
            r15 = 5
            r16 = 0
            r17 = 1
            int r18 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r18 >= 0) goto La1
            com.google.android.material.datepicker.Month r9 = r1.month
            int r9 = r9.daysInWeek
            int r9 = r4 % r9
            if (r9 != 0) goto L82
            r9 = 1
            goto L83
        L82:
            r9 = 0
        L83:
            if (r9 == 0) goto L87
            r9 = 0
            goto L9e
        L87:
            if (r8 != 0) goto L94
            int r9 = r4 + (-1)
            android.view.View r9 = r0.getChildAtPosition(r9)
            int r9 = r9.getRight()
            goto L9e
        L94:
            int r9 = r4 + (-1)
            android.view.View r9 = r0.getChildAtPosition(r9)
            int r9 = r9.getLeft()
        L9e:
            r10 = r9
            r9 = r4
            goto Lb8
        La1:
            java.util.Calendar r13 = r0.dayCompute
            r13.setTimeInMillis(r9)
            java.util.Calendar r9 = r0.dayCompute
            int r9 = r9.get(r15)
            int r9 = r1.dayToPosition(r9)
            android.view.View r10 = r0.getChildAtPosition(r9)
            int r10 = horizontalMidPoint(r10)
        Lb8:
            long r13 = r7.longValue()
            int r18 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r18 <= 0) goto Le9
            int r11 = r5 + 1
            com.google.android.material.datepicker.Month r12 = r1.month
            int r12 = r12.daysInWeek
            int r11 = r11 % r12
            if (r11 != 0) goto Lcb
            r11 = 1
            goto Lcc
        Lcb:
            r11 = 0
        Lcc:
            if (r11 == 0) goto Ld3
            int r11 = r28.getWidth()
            goto Le6
        Ld3:
            if (r8 != 0) goto Lde
            android.view.View r11 = r0.getChildAtPosition(r5)
            int r11 = r11.getRight()
            goto Le6
        Lde:
            android.view.View r11 = r0.getChildAtPosition(r5)
            int r11 = r11.getLeft()
        Le6:
            r12 = r11
            r11 = r5
            goto L100
        Le9:
            java.util.Calendar r13 = r0.dayCompute
            r13.setTimeInMillis(r11)
            java.util.Calendar r11 = r0.dayCompute
            int r11 = r11.get(r15)
            int r11 = r1.dayToPosition(r11)
            android.view.View r12 = r0.getChildAtPosition(r11)
            int r12 = horizontalMidPoint(r12)
        L100:
            long r13 = r1.getItemId(r9)
            int r14 = (int) r13
            r13 = r4
            r15 = r5
            long r4 = r1.getItemId(r11)
            int r5 = (int) r4
        L10c:
            if (r14 > r5) goto L180
            int r4 = r28.getNumColumns()
            int r4 = r4 * r14
            int r18 = r28.getNumColumns()
            int r18 = r18 + r4
            r19 = r1
            int r1 = r18 + (-1)
            android.view.View r18 = r0.getChildAtPosition(r4)
            int r20 = r18.getTop()
            com.google.android.material.datepicker.CalendarItemStyle r0 = r3.day
            int r0 = r0.getTopInset()
            int r0 = r20 + r0
            int r18 = r18.getBottom()
            r20 = r2
            com.google.android.material.datepicker.CalendarItemStyle r2 = r3.day
            int r2 = r2.getBottomInset()
            int r2 = r18 - r2
            if (r8 != 0) goto L14c
            if (r4 <= r9) goto L142
            r4 = 0
            goto L143
        L142:
            r4 = r10
        L143:
            if (r11 <= r1) goto L14a
            int r1 = r28.getWidth()
            goto L15e
        L14a:
            r1 = r12
            goto L15e
        L14c:
            if (r11 <= r1) goto L150
            r1 = 0
            goto L151
        L150:
            r1 = r12
        L151:
            if (r4 <= r9) goto L158
            int r4 = r28.getWidth()
            goto L159
        L158:
            r4 = r10
        L159:
            r27 = r4
            r4 = r1
            r1 = r27
        L15e:
            float r4 = (float) r4
            float r0 = (float) r0
            float r1 = (float) r1
            float r2 = (float) r2
            r18 = r5
            android.graphics.Paint r5 = r3.rangeFill
            r21 = r29
            r22 = r4
            r23 = r0
            r24 = r1
            r25 = r2
            r26 = r5
            r21.drawRect(r22, r23, r24, r25, r26)
            int r14 = r14 + 1
            r0 = r28
            r5 = r18
            r1 = r19
            r2 = r20
            goto L10c
        L180:
            r0 = r28
            r4 = r13
            r5 = r15
            goto L35
        L186:
            r0 = r28
            goto L35
        L18a:
            return
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onFocusChanged(boolean r1, int r2, android.graphics.Rect r3) {
            r0 = this;
            if (r1 == 0) goto L6
            r0.gainFocus(r2, r3)
            goto La
        L6:
            r1 = 0
            super.onFocusChanged(r1, r2, r3)
        La:
            return
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int r4, android.view.KeyEvent r5) {
            r3 = this;
            boolean r5 = super.onKeyDown(r4, r5)
            r0 = 0
            if (r5 != 0) goto L8
            return r0
        L8:
            int r5 = r3.getSelectedItemPosition()
            r1 = -1
            r2 = 1
            if (r5 == r1) goto L30
            int r5 = r3.getSelectedItemPosition()
            com.google.android.material.datepicker.MonthAdapter r1 = r3.getAdapter()
            int r1 = r1.firstPositionInMonth()
            if (r5 < r1) goto L1f
            goto L30
        L1f:
            r5 = 19
            if (r5 != r4) goto L2f
            com.google.android.material.datepicker.MonthAdapter r4 = r3.getAdapter()
            int r4 = r4.firstPositionInMonth()
            r3.setSelection(r4)
            return r2
        L2f:
            return r0
        L30:
            return r2
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public void onMeasure(int r2, int r3) {
            r1 = this;
            boolean r0 = r1.nestedScrollable
            if (r0 == 0) goto L1b
            r3 = 16777215(0xffffff, float:2.3509886E-38)
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r0)
            super.onMeasure(r2, r3)
            android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()
            int r3 = r1.getMeasuredHeight()
            r2.height = r3
            goto L1e
        L1b:
            super.onMeasure(r2, r3)
        L1e:
            return
    }

    @Override // android.widget.AdapterView
    public /* bridge */ /* synthetic */ void setAdapter(android.widget.Adapter r1) {
            r0 = this;
            android.widget.ListAdapter r1 = (android.widget.ListAdapter) r1
            r0.setAdapter(r1)
            return
    }

    @Override // android.widget.GridView, android.widget.AbsListView
    public final void setAdapter(android.widget.ListAdapter r4) {
            r3 = this;
            boolean r0 = r4 instanceof com.google.android.material.datepicker.MonthAdapter
            if (r0 == 0) goto L8
            super.setAdapter(r4)
            return
        L8:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            java.lang.Class<com.google.android.material.datepicker.MaterialCalendarGridView> r2 = com.google.android.material.datepicker.MaterialCalendarGridView.class
            java.lang.String r2 = r2.getCanonicalName()
            r0[r1] = r2
            r1 = 1
            java.lang.Class<com.google.android.material.datepicker.MonthAdapter> r2 = com.google.android.material.datepicker.MonthAdapter.class
            java.lang.String r2 = r2.getCanonicalName()
            r0[r1] = r2
            java.lang.String r1 = "%1$s must have its Adapter set to a %2$s"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            r4.<init>(r0)
            throw r4
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public void setSelection(int r2) {
            r1 = this;
            com.google.android.material.datepicker.MonthAdapter r0 = r1.getAdapter()
            int r0 = r0.firstPositionInMonth()
            if (r2 >= r0) goto L16
            com.google.android.material.datepicker.MonthAdapter r2 = r1.getAdapter()
            int r2 = r2.firstPositionInMonth()
            super.setSelection(r2)
            goto L19
        L16:
            super.setSelection(r2)
        L19:
            return
    }
}
