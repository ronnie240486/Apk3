package com.google.android.material.slider;

/* JADX INFO: loaded from: classes2.dex */
public class Slider extends com.google.android.material.slider.BaseSlider<com.google.android.material.slider.Slider, com.google.android.material.slider.Slider.OnChangeListener, com.google.android.material.slider.Slider.OnSliderTouchListener> {

    /* JADX INFO: loaded from: classes.dex */
    public interface OnChangeListener extends com.google.android.material.slider.BaseOnChangeListener<com.google.android.material.slider.Slider> {

        /* JADX INFO: renamed from: com.google.android.material.slider.Slider$OnChangeListener$-CC, reason: invalid class name */
        /* JADX INFO: loaded from: classes3.dex */
        public final /* synthetic */ class CC {
            public static /* bridge */ /* synthetic */ void $default$onValueChange(com.google.android.material.slider.Slider.OnChangeListener r0, @androidx.annotation.NonNull java.lang.Object r1, float r2, boolean r3) {
                    com.google.android.material.slider.Slider r1 = (com.google.android.material.slider.Slider) r1
                    r0.onValueChange2(r1, r2, r3)
                    return
            }
        }

        /* JADX INFO: renamed from: onValueChange, reason: avoid collision after fix types in other method */
        void onValueChange2(@androidx.annotation.NonNull com.google.android.material.slider.Slider r1, float r2, boolean r3);

        @Override // com.google.android.material.slider.BaseOnChangeListener
        /* bridge */ /* synthetic */ void onValueChange(@androidx.annotation.NonNull com.google.android.material.slider.Slider r1, float r2, boolean r3);
    }

    public interface OnSliderTouchListener extends com.google.android.material.slider.BaseOnSliderTouchListener<com.google.android.material.slider.Slider> {

        /* JADX INFO: renamed from: com.google.android.material.slider.Slider$OnSliderTouchListener$-CC, reason: invalid class name */
        public final /* synthetic */ class CC {
            public static /* bridge */ /* synthetic */ void $default$onStartTrackingTouch(com.google.android.material.slider.Slider.OnSliderTouchListener r0, @androidx.annotation.NonNull java.lang.Object r1) {
                    com.google.android.material.slider.Slider r1 = (com.google.android.material.slider.Slider) r1
                    r0.onStartTrackingTouch2(r1)
                    return
            }

            public static /* bridge */ /* synthetic */ void $default$onStopTrackingTouch(com.google.android.material.slider.Slider.OnSliderTouchListener r0, @androidx.annotation.NonNull java.lang.Object r1) {
                    com.google.android.material.slider.Slider r1 = (com.google.android.material.slider.Slider) r1
                    r0.onStopTrackingTouch2(r1)
                    return
            }
        }

        /* JADX INFO: renamed from: onStartTrackingTouch, reason: avoid collision after fix types in other method */
        void onStartTrackingTouch2(@androidx.annotation.NonNull com.google.android.material.slider.Slider r1);

        @Override // com.google.android.material.slider.BaseOnSliderTouchListener
        /* bridge */ /* synthetic */ void onStartTrackingTouch(@androidx.annotation.NonNull com.google.android.material.slider.Slider r1);

        /* JADX INFO: renamed from: onStopTrackingTouch, reason: avoid collision after fix types in other method */
        void onStopTrackingTouch2(@androidx.annotation.NonNull com.google.android.material.slider.Slider r1);

        @Override // com.google.android.material.slider.BaseOnSliderTouchListener
        /* bridge */ /* synthetic */ void onStopTrackingTouch(@androidx.annotation.NonNull com.google.android.material.slider.Slider r1);
    }

    public Slider(@androidx.annotation.NonNull android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public Slider(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.Nullable android.util.AttributeSet r3) {
            r1 = this;
            int r0 = com.google.android.material.R.attr.sliderStyle
            r1.<init>(r2, r3, r0)
            return
    }

    public Slider(@androidx.annotation.NonNull android.content.Context r3, @androidx.annotation.Nullable android.util.AttributeSet r4, int r5) {
            r2 = this;
            r2.<init>(r3, r4, r5)
            r5 = 1
            int[] r5 = new int[r5]
            r0 = 16842788(0x1010024, float:2.369366E-38)
            r1 = 0
            r5[r1] = r0
            android.content.res.TypedArray r3 = r3.obtainStyledAttributes(r4, r5)
            boolean r4 = r3.hasValue(r1)
            if (r4 == 0) goto L1e
            r4 = 0
            float r4 = r3.getFloat(r1, r4)
            r2.setValue(r4)
        L1e:
            r3.recycle()
            return
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void addOnChangeListener(@androidx.annotation.NonNull com.google.android.material.slider.BaseOnChangeListener r1) {
            r0 = this;
            super.addOnChangeListener(r1)
            return
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void addOnSliderTouchListener(@androidx.annotation.NonNull com.google.android.material.slider.BaseOnSliderTouchListener r1) {
            r0 = this;
            super.addOnSliderTouchListener(r1)
            return
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void clearOnChangeListeners() {
            r0 = this;
            super.clearOnChangeListeners()
            return
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void clearOnSliderTouchListeners() {
            r0 = this;
            super.clearOnSliderTouchListeners()
            return
    }

    @Override // com.google.android.material.slider.BaseSlider, android.view.View
    public /* bridge */ /* synthetic */ boolean dispatchHoverEvent(@androidx.annotation.NonNull android.view.MotionEvent r1) {
            r0 = this;
            boolean r1 = super.dispatchHoverEvent(r1)
            return r1
    }

    @Override // com.google.android.material.slider.BaseSlider, android.view.View
    public /* bridge */ /* synthetic */ boolean dispatchKeyEvent(@androidx.annotation.NonNull android.view.KeyEvent r1) {
            r0 = this;
            boolean r1 = super.dispatchKeyEvent(r1)
            return r1
    }

    @Override // com.google.android.material.slider.BaseSlider, android.view.View
    @androidx.annotation.NonNull
    public /* bridge */ /* synthetic */ java.lang.CharSequence getAccessibilityClassName() {
            r1 = this;
            java.lang.CharSequence r0 = super.getAccessibilityClassName()
            return r0
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ int getActiveThumbIndex() {
            r1 = this;
            int r0 = super.getActiveThumbIndex()
            return r0
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ int getFocusedThumbIndex() {
            r1 = this;
            int r0 = super.getFocusedThumbIndex()
            return r0
    }

    @Override // com.google.android.material.slider.BaseSlider
    @androidx.annotation.Dimension
    public /* bridge */ /* synthetic */ int getHaloRadius() {
            r1 = this;
            int r0 = super.getHaloRadius()
            return r0
    }

    @Override // com.google.android.material.slider.BaseSlider
    @androidx.annotation.NonNull
    public /* bridge */ /* synthetic */ android.content.res.ColorStateList getHaloTintList() {
            r1 = this;
            android.content.res.ColorStateList r0 = super.getHaloTintList()
            return r0
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ int getLabelBehavior() {
            r1 = this;
            int r0 = super.getLabelBehavior()
            return r0
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ float getStepSize() {
            r1 = this;
            float r0 = super.getStepSize()
            return r0
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ float getThumbElevation() {
            r1 = this;
            float r0 = super.getThumbElevation()
            return r0
    }

    @Override // com.google.android.material.slider.BaseSlider
    @androidx.annotation.Dimension
    public /* bridge */ /* synthetic */ int getThumbRadius() {
            r1 = this;
            int r0 = super.getThumbRadius()
            return r0
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ android.content.res.ColorStateList getThumbStrokeColor() {
            r1 = this;
            android.content.res.ColorStateList r0 = super.getThumbStrokeColor()
            return r0
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ float getThumbStrokeWidth() {
            r1 = this;
            float r0 = super.getThumbStrokeWidth()
            return r0
    }

    @Override // com.google.android.material.slider.BaseSlider
    @androidx.annotation.NonNull
    public /* bridge */ /* synthetic */ android.content.res.ColorStateList getThumbTintList() {
            r1 = this;
            android.content.res.ColorStateList r0 = super.getThumbTintList()
            return r0
    }

    @Override // com.google.android.material.slider.BaseSlider
    @androidx.annotation.NonNull
    public /* bridge */ /* synthetic */ android.content.res.ColorStateList getTickActiveTintList() {
            r1 = this;
            android.content.res.ColorStateList r0 = super.getTickActiveTintList()
            return r0
    }

    @Override // com.google.android.material.slider.BaseSlider
    @androidx.annotation.NonNull
    public /* bridge */ /* synthetic */ android.content.res.ColorStateList getTickInactiveTintList() {
            r1 = this;
            android.content.res.ColorStateList r0 = super.getTickInactiveTintList()
            return r0
    }

    @Override // com.google.android.material.slider.BaseSlider
    @androidx.annotation.NonNull
    public /* bridge */ /* synthetic */ android.content.res.ColorStateList getTickTintList() {
            r1 = this;
            android.content.res.ColorStateList r0 = super.getTickTintList()
            return r0
    }

    @Override // com.google.android.material.slider.BaseSlider
    @androidx.annotation.NonNull
    public /* bridge */ /* synthetic */ android.content.res.ColorStateList getTrackActiveTintList() {
            r1 = this;
            android.content.res.ColorStateList r0 = super.getTrackActiveTintList()
            return r0
    }

    @Override // com.google.android.material.slider.BaseSlider
    @androidx.annotation.Dimension
    public /* bridge */ /* synthetic */ int getTrackHeight() {
            r1 = this;
            int r0 = super.getTrackHeight()
            return r0
    }

    @Override // com.google.android.material.slider.BaseSlider
    @androidx.annotation.NonNull
    public /* bridge */ /* synthetic */ android.content.res.ColorStateList getTrackInactiveTintList() {
            r1 = this;
            android.content.res.ColorStateList r0 = super.getTrackInactiveTintList()
            return r0
    }

    @Override // com.google.android.material.slider.BaseSlider
    @androidx.annotation.Dimension
    public /* bridge */ /* synthetic */ int getTrackSidePadding() {
            r1 = this;
            int r0 = super.getTrackSidePadding()
            return r0
    }

    @Override // com.google.android.material.slider.BaseSlider
    @androidx.annotation.NonNull
    public /* bridge */ /* synthetic */ android.content.res.ColorStateList getTrackTintList() {
            r1 = this;
            android.content.res.ColorStateList r0 = super.getTrackTintList()
            return r0
    }

    @Override // com.google.android.material.slider.BaseSlider
    @androidx.annotation.Dimension
    public /* bridge */ /* synthetic */ int getTrackWidth() {
            r1 = this;
            int r0 = super.getTrackWidth()
            return r0
    }

    public float getValue() {
            r2 = this;
            java.util.List r0 = r2.getValues()
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            return r0
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ float getValueFrom() {
            r1 = this;
            float r0 = super.getValueFrom()
            return r0
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ float getValueTo() {
            r1 = this;
            float r0 = super.getValueTo()
            return r0
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ boolean hasLabelFormatter() {
            r1 = this;
            boolean r0 = super.hasLabelFormatter()
            return r0
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ boolean isTickVisible() {
            r1 = this;
            boolean r0 = super.isTickVisible()
            return r0
    }

    @Override // com.google.android.material.slider.BaseSlider, android.view.View, android.view.KeyEvent.Callback
    public /* bridge */ /* synthetic */ boolean onKeyDown(int r1, @androidx.annotation.NonNull android.view.KeyEvent r2) {
            r0 = this;
            boolean r1 = super.onKeyDown(r1, r2)
            return r1
    }

    @Override // com.google.android.material.slider.BaseSlider, android.view.View, android.view.KeyEvent.Callback
    public /* bridge */ /* synthetic */ boolean onKeyUp(int r1, @androidx.annotation.NonNull android.view.KeyEvent r2) {
            r0 = this;
            boolean r1 = super.onKeyUp(r1, r2)
            return r1
    }

    @Override // com.google.android.material.slider.BaseSlider, android.view.View
    public /* bridge */ /* synthetic */ boolean onTouchEvent(@androidx.annotation.NonNull android.view.MotionEvent r1) {
            r0 = this;
            boolean r1 = super.onTouchEvent(r1)
            return r1
    }

    @Override // com.google.android.material.slider.BaseSlider
    public final boolean pickActiveThumb() {
            r3 = this;
            int r0 = r3.getActiveThumbIndex()
            r1 = 1
            r2 = -1
            if (r0 == r2) goto L9
            return r1
        L9:
            r0 = 0
            r3.setActiveThumbIndex(r0)
            return r1
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void removeOnChangeListener(@androidx.annotation.NonNull com.google.android.material.slider.BaseOnChangeListener r1) {
            r0 = this;
            super.removeOnChangeListener(r1)
            return
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void removeOnSliderTouchListener(@androidx.annotation.NonNull com.google.android.material.slider.BaseOnSliderTouchListener r1) {
            r0 = this;
            super.removeOnSliderTouchListener(r1)
            return
    }

    @Override // com.google.android.material.slider.BaseSlider
    public void setCustomThumbDrawable(@androidx.annotation.DrawableRes int r1) {
            r0 = this;
            super.setCustomThumbDrawable(r1)
            return
    }

    @Override // com.google.android.material.slider.BaseSlider
    public void setCustomThumbDrawable(@androidx.annotation.NonNull android.graphics.drawable.Drawable r1) {
            r0 = this;
            super.setCustomThumbDrawable(r1)
            return
    }

    @Override // com.google.android.material.slider.BaseSlider, android.view.View
    public /* bridge */ /* synthetic */ void setEnabled(boolean r1) {
            r0 = this;
            super.setEnabled(r1)
            return
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setFocusedThumbIndex(int r1) {
            r0 = this;
            super.setFocusedThumbIndex(r1)
            return
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setHaloRadius(@androidx.annotation.IntRange(from = 0) @androidx.annotation.Dimension int r1) {
            r0 = this;
            super.setHaloRadius(r1)
            return
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setHaloRadiusResource(@androidx.annotation.DimenRes int r1) {
            r0 = this;
            super.setHaloRadiusResource(r1)
            return
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setHaloTintList(@androidx.annotation.NonNull android.content.res.ColorStateList r1) {
            r0 = this;
            super.setHaloTintList(r1)
            return
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setLabelBehavior(int r1) {
            r0 = this;
            super.setLabelBehavior(r1)
            return
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setLabelFormatter(@androidx.annotation.Nullable com.google.android.material.slider.LabelFormatter r1) {
            r0 = this;
            super.setLabelFormatter(r1)
            return
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setStepSize(float r1) {
            r0 = this;
            super.setStepSize(r1)
            return
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setThumbElevation(float r1) {
            r0 = this;
            super.setThumbElevation(r1)
            return
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setThumbElevationResource(@androidx.annotation.DimenRes int r1) {
            r0 = this;
            super.setThumbElevationResource(r1)
            return
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setThumbRadius(@androidx.annotation.IntRange(from = 0) @androidx.annotation.Dimension int r1) {
            r0 = this;
            super.setThumbRadius(r1)
            return
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setThumbRadiusResource(@androidx.annotation.DimenRes int r1) {
            r0 = this;
            super.setThumbRadiusResource(r1)
            return
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setThumbStrokeColor(@androidx.annotation.Nullable android.content.res.ColorStateList r1) {
            r0 = this;
            super.setThumbStrokeColor(r1)
            return
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setThumbStrokeColorResource(@androidx.annotation.ColorRes int r1) {
            r0 = this;
            super.setThumbStrokeColorResource(r1)
            return
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setThumbStrokeWidth(float r1) {
            r0 = this;
            super.setThumbStrokeWidth(r1)
            return
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setThumbStrokeWidthResource(@androidx.annotation.DimenRes int r1) {
            r0 = this;
            super.setThumbStrokeWidthResource(r1)
            return
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setThumbTintList(@androidx.annotation.NonNull android.content.res.ColorStateList r1) {
            r0 = this;
            super.setThumbTintList(r1)
            return
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setTickActiveTintList(@androidx.annotation.NonNull android.content.res.ColorStateList r1) {
            r0 = this;
            super.setTickActiveTintList(r1)
            return
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setTickInactiveTintList(@androidx.annotation.NonNull android.content.res.ColorStateList r1) {
            r0 = this;
            super.setTickInactiveTintList(r1)
            return
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setTickTintList(@androidx.annotation.NonNull android.content.res.ColorStateList r1) {
            r0 = this;
            super.setTickTintList(r1)
            return
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setTickVisible(boolean r1) {
            r0 = this;
            super.setTickVisible(r1)
            return
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setTrackActiveTintList(@androidx.annotation.NonNull android.content.res.ColorStateList r1) {
            r0 = this;
            super.setTrackActiveTintList(r1)
            return
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setTrackHeight(@androidx.annotation.IntRange(from = 0) @androidx.annotation.Dimension int r1) {
            r0 = this;
            super.setTrackHeight(r1)
            return
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setTrackInactiveTintList(@androidx.annotation.NonNull android.content.res.ColorStateList r1) {
            r0 = this;
            super.setTrackInactiveTintList(r1)
            return
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setTrackTintList(@androidx.annotation.NonNull android.content.res.ColorStateList r1) {
            r0 = this;
            super.setTrackTintList(r1)
            return
    }

    public void setValue(float r3) {
            r2 = this;
            r0 = 1
            java.lang.Float[] r0 = new java.lang.Float[r0]
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            r1 = 0
            r0[r1] = r3
            r2.setValues(r0)
            return
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setValueFrom(float r1) {
            r0 = this;
            super.setValueFrom(r1)
            return
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setValueTo(float r1) {
            r0 = this;
            super.setValueTo(r1)
            return
    }
}
