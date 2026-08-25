package com.google.android.material.timepicker;

/* JADX INFO: loaded from: classes3.dex */
class RadialViewGroup extends androidx.constraintlayout.widget.ConstraintLayout {
    private static final java.lang.String SKIP_TAG = "skip";
    private com.google.android.material.shape.MaterialShapeDrawable background;
    private int radius;
    private final java.lang.Runnable updateLayoutParametersRunnable;

    public RadialViewGroup(@androidx.annotation.NonNull android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public RadialViewGroup(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.Nullable android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public RadialViewGroup(@androidx.annotation.NonNull android.content.Context r3, @androidx.annotation.Nullable android.util.AttributeSet r4, int r5) {
            r2 = this;
            r2.<init>(r3, r4, r5)
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r3)
            int r1 = com.google.android.material.R.layout.material_radial_view_group
            r0.inflate(r1, r2)
            android.graphics.drawable.Drawable r0 = r2.createBackground()
            androidx.core.view.ViewCompat.setBackground(r2, r0)
            int[] r0 = com.google.android.material.R.styleable.RadialViewGroup
            r1 = 0
            android.content.res.TypedArray r3 = r3.obtainStyledAttributes(r4, r0, r5, r1)
            int r4 = com.google.android.material.R.styleable.RadialViewGroup_materialCircleRadius
            int r4 = r3.getDimensionPixelSize(r4, r1)
            r2.radius = r4
            com.google.android.material.timepicker.RadialViewGroup$$ExternalSyntheticLambda0 r4 = new com.google.android.material.timepicker.RadialViewGroup$$ExternalSyntheticLambda0
            r4.<init>(r2, r1)
            r2.updateLayoutParametersRunnable = r4
            r3.recycle()
            return
    }

    private void addConstraints(java.util.List<android.view.View> r5, androidx.constraintlayout.widget.ConstraintSet r6, int r7) {
            r4 = this;
            java.util.Iterator r0 = r5.iterator()
            r1 = 0
        L5:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L24
            java.lang.Object r2 = r0.next()
            android.view.View r2 = (android.view.View) r2
            int r2 = r2.getId()
            int r3 = com.google.android.material.R.id.circle_center
            r6.constrainCircle(r2, r3, r7, r1)
            r2 = 1135869952(0x43b40000, float:360.0)
            int r3 = r5.size()
            float r3 = (float) r3
            float r2 = r2 / r3
            float r1 = r1 + r2
            goto L5
        L24:
            return
    }

    private android.graphics.drawable.Drawable createBackground() {
            r3 = this;
            com.google.android.material.shape.MaterialShapeDrawable r0 = new com.google.android.material.shape.MaterialShapeDrawable
            r0.<init>()
            r3.background = r0
            com.google.android.material.shape.RelativeCornerSize r1 = new com.google.android.material.shape.RelativeCornerSize
            r2 = 1056964608(0x3f000000, float:0.5)
            r1.<init>(r2)
            r0.setCornerSize(r1)
            com.google.android.material.shape.MaterialShapeDrawable r0 = r3.background
            r1 = -1
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
            r0.setFillColor(r1)
            com.google.android.material.shape.MaterialShapeDrawable r0 = r3.background
            return r0
    }

    private static boolean shouldSkipView(android.view.View r1) {
            java.lang.Object r1 = r1.getTag()
            java.lang.String r0 = "skip"
            boolean r1 = r0.equals(r1)
            return r1
    }

    private void updateLayoutParamsAsync() {
            r2 = this;
            android.os.Handler r0 = r2.getHandler()
            if (r0 == 0) goto L10
            java.lang.Runnable r1 = r2.updateLayoutParametersRunnable
            r0.removeCallbacks(r1)
            java.lang.Runnable r1 = r2.updateLayoutParametersRunnable
            r0.post(r1)
        L10:
            return
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View r1, int r2, android.view.ViewGroup.LayoutParams r3) {
            r0 = this;
            super.addView(r1, r2, r3)
            int r2 = r1.getId()
            r3 = -1
            if (r2 != r3) goto L11
            int r2 = androidx.core.view.ViewCompat.generateViewId()
            r1.setId(r2)
        L11:
            r0.updateLayoutParamsAsync()
            return
    }

    @androidx.annotation.Dimension
    public int getRadius() {
            r1 = this;
            int r0 = r1.radius
            return r0
    }

    @Override // android.view.View
    public final void onFinishInflate() {
            r0 = this;
            super.onFinishInflate()
            r0.updateLayoutParams()
            return
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(android.view.View r1) {
            r0 = this;
            super.onViewRemoved(r1)
            r0.updateLayoutParamsAsync()
            return
    }

    @Override // android.view.View
    public void setBackgroundColor(@androidx.annotation.ColorInt int r2) {
            r1 = this;
            com.google.android.material.shape.MaterialShapeDrawable r0 = r1.background
            android.content.res.ColorStateList r2 = android.content.res.ColorStateList.valueOf(r2)
            r0.setFillColor(r2)
            return
    }

    public void setRadius(@androidx.annotation.Dimension int r1) {
            r0 = this;
            r0.radius = r1
            r0.updateLayoutParams()
            return
    }

    public void updateLayoutParams() {
            r6 = this;
            androidx.constraintlayout.widget.ConstraintSet r0 = new androidx.constraintlayout.widget.ConstraintSet
            r0.<init>()
            r0.clone(r6)
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r2 = 0
        Le:
            int r3 = r6.getChildCount()
            if (r2 >= r3) goto L50
            android.view.View r3 = r6.getChildAt(r2)
            int r4 = r3.getId()
            int r5 = com.google.android.material.R.id.circle_center
            if (r4 == r5) goto L4d
            boolean r4 = shouldSkipView(r3)
            if (r4 == 0) goto L27
            goto L4d
        L27:
            int r4 = com.google.android.material.R.id.material_clock_level
            java.lang.Object r4 = r3.getTag(r4)
            java.lang.Integer r4 = (java.lang.Integer) r4
            if (r4 != 0) goto L36
            r4 = 1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
        L36:
            boolean r5 = r1.containsKey(r4)
            if (r5 != 0) goto L44
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r1.put(r4, r5)
        L44:
            java.lang.Object r4 = r1.get(r4)
            java.util.List r4 = (java.util.List) r4
            r4.add(r3)
        L4d:
            int r2 = r2 + 1
            goto Le
        L50:
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L58:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L8a
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getValue()
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r2 = r2.getKey()
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r4 = 2
            if (r2 != r4) goto L84
            int r2 = r6.radius
            float r2 = (float) r2
            r4 = 1059648963(0x3f28f5c3, float:0.66)
            float r2 = r2 * r4
            int r2 = java.lang.Math.round(r2)
            goto L86
        L84:
            int r2 = r6.radius
        L86:
            r6.addConstraints(r3, r0, r2)
            goto L58
        L8a:
            r0.applyTo(r6)
            return
    }
}
