package com.google.android.material.datepicker;

/* JADX INFO: loaded from: classes2.dex */
final class CalendarItemStyle {
    private final android.content.res.ColorStateList backgroundColor;

    @androidx.annotation.NonNull
    private final android.graphics.Rect insets;
    private final com.google.android.material.shape.ShapeAppearanceModel itemShape;
    private final android.content.res.ColorStateList strokeColor;
    private final int strokeWidth;
    private final android.content.res.ColorStateList textColor;

    private CalendarItemStyle(android.content.res.ColorStateList r2, android.content.res.ColorStateList r3, android.content.res.ColorStateList r4, int r5, com.google.android.material.shape.ShapeAppearanceModel r6, @androidx.annotation.NonNull android.graphics.Rect r7) {
            r1 = this;
            r1.<init>()
            int r0 = r7.left
            androidx.core.util.Preconditions.checkArgumentNonnegative(r0)
            int r0 = r7.top
            androidx.core.util.Preconditions.checkArgumentNonnegative(r0)
            int r0 = r7.right
            androidx.core.util.Preconditions.checkArgumentNonnegative(r0)
            int r0 = r7.bottom
            androidx.core.util.Preconditions.checkArgumentNonnegative(r0)
            r1.insets = r7
            r1.textColor = r3
            r1.backgroundColor = r2
            r1.strokeColor = r4
            r1.strokeWidth = r5
            r1.itemShape = r6
            return
    }

    @androidx.annotation.NonNull
    public static com.google.android.material.datepicker.CalendarItemStyle create(@androidx.annotation.NonNull android.content.Context r12, @androidx.annotation.StyleRes int r13) {
            r0 = 0
            if (r13 == 0) goto L5
            r1 = 1
            goto L6
        L5:
            r1 = 0
        L6:
            java.lang.String r2 = "Cannot create a CalendarItemStyle with a styleResId of 0"
            androidx.core.util.Preconditions.checkArgument(r1, r2)
            int[] r1 = com.google.android.material.R.styleable.MaterialCalendarItem
            android.content.res.TypedArray r13 = r12.obtainStyledAttributes(r13, r1)
            int r1 = com.google.android.material.R.styleable.MaterialCalendarItem_android_insetLeft
            int r1 = r13.getDimensionPixelOffset(r1, r0)
            int r2 = com.google.android.material.R.styleable.MaterialCalendarItem_android_insetTop
            int r2 = r13.getDimensionPixelOffset(r2, r0)
            int r3 = com.google.android.material.R.styleable.MaterialCalendarItem_android_insetRight
            int r3 = r13.getDimensionPixelOffset(r3, r0)
            int r4 = com.google.android.material.R.styleable.MaterialCalendarItem_android_insetBottom
            int r4 = r13.getDimensionPixelOffset(r4, r0)
            android.graphics.Rect r11 = new android.graphics.Rect
            r11.<init>(r1, r2, r3, r4)
            int r1 = com.google.android.material.R.styleable.MaterialCalendarItem_itemFillColor
            android.content.res.ColorStateList r6 = com.google.android.material.resources.MaterialResources.getColorStateList(r12, r13, r1)
            int r1 = com.google.android.material.R.styleable.MaterialCalendarItem_itemTextColor
            android.content.res.ColorStateList r7 = com.google.android.material.resources.MaterialResources.getColorStateList(r12, r13, r1)
            int r1 = com.google.android.material.R.styleable.MaterialCalendarItem_itemStrokeColor
            android.content.res.ColorStateList r8 = com.google.android.material.resources.MaterialResources.getColorStateList(r12, r13, r1)
            int r1 = com.google.android.material.R.styleable.MaterialCalendarItem_itemStrokeWidth
            int r9 = r13.getDimensionPixelSize(r1, r0)
            int r1 = com.google.android.material.R.styleable.MaterialCalendarItem_itemShapeAppearance
            int r1 = r13.getResourceId(r1, r0)
            int r2 = com.google.android.material.R.styleable.MaterialCalendarItem_itemShapeAppearanceOverlay
            int r0 = r13.getResourceId(r2, r0)
            com.google.android.material.shape.ShapeAppearanceModel$Builder r12 = com.google.android.material.shape.ShapeAppearanceModel.builder(r12, r1, r0)
            com.google.android.material.shape.ShapeAppearanceModel r10 = r12.build()
            r13.recycle()
            com.google.android.material.datepicker.CalendarItemStyle r12 = new com.google.android.material.datepicker.CalendarItemStyle
            r5 = r12
            r5.<init>(r6, r7, r8, r9, r10, r11)
            return r12
    }

    public final int getBottomInset() {
            r1 = this;
            android.graphics.Rect r0 = r1.insets
            int r0 = r0.bottom
            return r0
    }

    public final int getTopInset() {
            r1 = this;
            android.graphics.Rect r0 = r1.insets
            int r0 = r0.top
            return r0
    }

    public final void styleItem(@androidx.annotation.NonNull android.widget.TextView r9, @androidx.annotation.Nullable android.content.res.ColorStateList r10) {
            r8 = this;
            com.google.android.material.shape.MaterialShapeDrawable r0 = new com.google.android.material.shape.MaterialShapeDrawable
            r0.<init>()
            com.google.android.material.shape.MaterialShapeDrawable r1 = new com.google.android.material.shape.MaterialShapeDrawable
            r1.<init>()
            com.google.android.material.shape.ShapeAppearanceModel r2 = r8.itemShape
            r0.setShapeAppearanceModel(r2)
            com.google.android.material.shape.ShapeAppearanceModel r2 = r8.itemShape
            r1.setShapeAppearanceModel(r2)
            if (r10 == 0) goto L17
            goto L19
        L17:
            android.content.res.ColorStateList r10 = r8.backgroundColor
        L19:
            r0.setFillColor(r10)
            int r10 = r8.strokeWidth
            float r10 = (float) r10
            android.content.res.ColorStateList r2 = r8.strokeColor
            r0.setStroke(r10, r2)
            android.content.res.ColorStateList r10 = r8.textColor
            r9.setTextColor(r10)
            android.graphics.drawable.RippleDrawable r3 = new android.graphics.drawable.RippleDrawable
            android.content.res.ColorStateList r10 = r8.textColor
            r2 = 30
            android.content.res.ColorStateList r10 = r10.withAlpha(r2)
            r3.<init>(r10, r0, r1)
            android.graphics.drawable.InsetDrawable r10 = new android.graphics.drawable.InsetDrawable
            android.graphics.Rect r0 = r8.insets
            int r4 = r0.left
            int r5 = r0.top
            int r6 = r0.right
            int r7 = r0.bottom
            r2 = r10
            r2.<init>(r3, r4, r5, r6, r7)
            androidx.core.view.ViewCompat.setBackground(r9, r10)
            return
    }
}
