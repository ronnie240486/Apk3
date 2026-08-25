package com.google.android.material.materialswitch;

/* JADX INFO: loaded from: classes.dex */
public class MaterialSwitch extends androidx.appcompat.widget.SwitchCompat {
    private static final int DEF_STYLE_RES = 0;
    private static final int[] STATE_SET_WITH_ICON = null;
    private int[] currentStateChecked;
    private int[] currentStateUnchecked;

    @androidx.annotation.Nullable
    private android.graphics.drawable.Drawable thumbDrawable;

    @androidx.annotation.Nullable
    private android.graphics.drawable.Drawable thumbIconDrawable;

    @androidx.annotation.Nullable
    private android.content.res.ColorStateList thumbIconTintList;

    @androidx.annotation.NonNull
    private android.graphics.PorterDuff.Mode thumbIconTintMode;

    @androidx.annotation.Nullable
    private android.content.res.ColorStateList thumbTintList;

    @androidx.annotation.Nullable
    private android.graphics.drawable.Drawable trackDecorationDrawable;

    @androidx.annotation.Nullable
    private android.content.res.ColorStateList trackDecorationTintList;

    @androidx.annotation.NonNull
    private android.graphics.PorterDuff.Mode trackDecorationTintMode;

    @androidx.annotation.Nullable
    private android.graphics.drawable.Drawable trackDrawable;

    @androidx.annotation.Nullable
    private android.content.res.ColorStateList trackTintList;

    static {
            int r0 = com.google.android.material.R.style.Widget_Material3_CompoundButton_MaterialSwitch
            com.google.android.material.materialswitch.MaterialSwitch.DEF_STYLE_RES = r0
            r0 = 1
            int[] r0 = new int[r0]
            int r1 = com.google.android.material.R.attr.state_with_icon
            r2 = 0
            r0[r2] = r1
            com.google.android.material.materialswitch.MaterialSwitch.STATE_SET_WITH_ICON = r0
            return
    }

    public MaterialSwitch(@androidx.annotation.NonNull android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public MaterialSwitch(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.Nullable android.util.AttributeSet r3) {
            r1 = this;
            int r0 = com.google.android.material.R.attr.materialSwitchStyle
            r1.<init>(r2, r3, r0)
            return
    }

    public MaterialSwitch(@androidx.annotation.NonNull android.content.Context r7, @androidx.annotation.Nullable android.util.AttributeSet r8, int r9) {
            r6 = this;
            int r4 = com.google.android.material.materialswitch.MaterialSwitch.DEF_STYLE_RES
            android.content.Context r7 = com.google.android.material.theme.overlay.MaterialThemeOverlay.wrap(r7, r8, r9, r4)
            r6.<init>(r7, r8, r9)
            android.content.Context r0 = r6.getContext()
            android.graphics.drawable.Drawable r7 = super.getThumbDrawable()
            r6.thumbDrawable = r7
            android.content.res.ColorStateList r7 = super.getThumbTintList()
            r6.thumbTintList = r7
            r7 = 0
            super.setThumbTintList(r7)
            android.graphics.drawable.Drawable r1 = super.getTrackDrawable()
            r6.trackDrawable = r1
            android.content.res.ColorStateList r1 = super.getTrackTintList()
            r6.trackTintList = r1
            super.setTrackTintList(r7)
            int[] r2 = com.google.android.material.R.styleable.MaterialSwitch
            r7 = 0
            int[] r5 = new int[r7]
            r1 = r8
            r3 = r9
            androidx.appcompat.widget.TintTypedArray r8 = com.google.android.material.internal.ThemeEnforcement.obtainTintedStyledAttributes(r0, r1, r2, r3, r4, r5)
            int r9 = com.google.android.material.R.styleable.MaterialSwitch_thumbIcon
            android.graphics.drawable.Drawable r9 = r8.getDrawable(r9)
            r6.thumbIconDrawable = r9
            int r9 = com.google.android.material.R.styleable.MaterialSwitch_thumbIconTint
            android.content.res.ColorStateList r9 = r8.getColorStateList(r9)
            r6.thumbIconTintList = r9
            int r9 = com.google.android.material.R.styleable.MaterialSwitch_thumbIconTintMode
            r0 = -1
            int r9 = r8.getInt(r9, r0)
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.PorterDuff$Mode r9 = com.google.android.material.internal.ViewUtils.parseTintMode(r9, r1)
            r6.thumbIconTintMode = r9
            int r9 = com.google.android.material.R.styleable.MaterialSwitch_trackDecoration
            android.graphics.drawable.Drawable r9 = r8.getDrawable(r9)
            r6.trackDecorationDrawable = r9
            int r9 = com.google.android.material.R.styleable.MaterialSwitch_trackDecorationTint
            android.content.res.ColorStateList r9 = r8.getColorStateList(r9)
            r6.trackDecorationTintList = r9
            int r9 = com.google.android.material.R.styleable.MaterialSwitch_trackDecorationTintMode
            int r9 = r8.getInt(r9, r0)
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.PorterDuff$Mode r9 = com.google.android.material.internal.ViewUtils.parseTintMode(r9, r0)
            r6.trackDecorationTintMode = r9
            r8.recycle()
            r6.setEnforceSwitchWidth(r7)
            r6.refreshThumbDrawable()
            r6.refreshTrackDrawable()
            return
    }

    private void refreshThumbDrawable() {
            r3 = this;
            android.graphics.drawable.Drawable r0 = r3.thumbDrawable
            android.content.res.ColorStateList r1 = r3.thumbTintList
            android.graphics.PorterDuff$Mode r2 = r3.getThumbTintMode()
            android.graphics.drawable.Drawable r0 = com.google.android.material.drawable.DrawableUtils.createTintableDrawableIfNeeded(r0, r1, r2)
            r3.thumbDrawable = r0
            android.graphics.drawable.Drawable r0 = r3.thumbIconDrawable
            android.content.res.ColorStateList r1 = r3.thumbIconTintList
            android.graphics.PorterDuff$Mode r2 = r3.thumbIconTintMode
            android.graphics.drawable.Drawable r0 = com.google.android.material.drawable.DrawableUtils.createTintableDrawableIfNeeded(r0, r1, r2)
            r3.thumbIconDrawable = r0
            r3.updateDrawableTints()
            android.graphics.drawable.Drawable r0 = r3.thumbDrawable
            android.graphics.drawable.Drawable r1 = r3.thumbIconDrawable
            android.graphics.drawable.Drawable r0 = com.google.android.material.drawable.DrawableUtils.compositeTwoLayeredDrawable(r0, r1)
            super.setThumbDrawable(r0)
            r3.refreshDrawableState()
            return
    }

    private void refreshTrackDrawable() {
            r4 = this;
            android.graphics.drawable.Drawable r0 = r4.trackDrawable
            android.content.res.ColorStateList r1 = r4.trackTintList
            android.graphics.PorterDuff$Mode r2 = r4.getTrackTintMode()
            android.graphics.drawable.Drawable r0 = com.google.android.material.drawable.DrawableUtils.createTintableDrawableIfNeeded(r0, r1, r2)
            r4.trackDrawable = r0
            android.graphics.drawable.Drawable r0 = r4.trackDecorationDrawable
            android.content.res.ColorStateList r1 = r4.trackDecorationTintList
            android.graphics.PorterDuff$Mode r2 = r4.trackDecorationTintMode
            android.graphics.drawable.Drawable r0 = com.google.android.material.drawable.DrawableUtils.createTintableDrawableIfNeeded(r0, r1, r2)
            r4.trackDecorationDrawable = r0
            r4.updateDrawableTints()
            android.graphics.drawable.Drawable r0 = r4.trackDrawable
            if (r0 == 0) goto L38
            android.graphics.drawable.Drawable r1 = r4.trackDecorationDrawable
            if (r1 == 0) goto L38
            android.graphics.drawable.LayerDrawable r0 = new android.graphics.drawable.LayerDrawable
            r1 = 2
            android.graphics.drawable.Drawable[] r1 = new android.graphics.drawable.Drawable[r1]
            r2 = 0
            android.graphics.drawable.Drawable r3 = r4.trackDrawable
            r1[r2] = r3
            r2 = 1
            android.graphics.drawable.Drawable r3 = r4.trackDecorationDrawable
            r1[r2] = r3
            r0.<init>(r1)
            goto L3d
        L38:
            if (r0 == 0) goto L3b
            goto L3d
        L3b:
            android.graphics.drawable.Drawable r0 = r4.trackDecorationDrawable
        L3d:
            if (r0 == 0) goto L46
            int r1 = r0.getIntrinsicWidth()
            r4.setSwitchMinWidth(r1)
        L46:
            super.setTrackDrawable(r0)
            return
    }

    private static void setInterpolatedDrawableTintIfPossible(@androidx.annotation.Nullable android.graphics.drawable.Drawable r1, @androidx.annotation.Nullable android.content.res.ColorStateList r2, @androidx.annotation.NonNull int[] r3, @androidx.annotation.NonNull int[] r4, float r5) {
            if (r1 == 0) goto L15
            if (r2 != 0) goto L5
            goto L15
        L5:
            r0 = 0
            int r3 = r2.getColorForState(r3, r0)
            int r2 = r2.getColorForState(r4, r0)
            int r2 = androidx.core.graphics.ColorUtils.blendARGB(r3, r2, r5)
            androidx.core.graphics.drawable.DrawableCompat.setTint(r1, r2)
        L15:
            return
    }

    private void updateDrawableTints() {
            r5 = this;
            android.content.res.ColorStateList r0 = r5.thumbTintList
            if (r0 != 0) goto L11
            android.content.res.ColorStateList r0 = r5.thumbIconTintList
            if (r0 != 0) goto L11
            android.content.res.ColorStateList r0 = r5.trackTintList
            if (r0 != 0) goto L11
            android.content.res.ColorStateList r0 = r5.trackDecorationTintList
            if (r0 != 0) goto L11
            return
        L11:
            float r0 = r5.getThumbPosition()
            android.content.res.ColorStateList r1 = r5.thumbTintList
            if (r1 == 0) goto L22
            android.graphics.drawable.Drawable r2 = r5.thumbDrawable
            int[] r3 = r5.currentStateUnchecked
            int[] r4 = r5.currentStateChecked
            setInterpolatedDrawableTintIfPossible(r2, r1, r3, r4, r0)
        L22:
            android.content.res.ColorStateList r1 = r5.thumbIconTintList
            if (r1 == 0) goto L2f
            android.graphics.drawable.Drawable r2 = r5.thumbIconDrawable
            int[] r3 = r5.currentStateUnchecked
            int[] r4 = r5.currentStateChecked
            setInterpolatedDrawableTintIfPossible(r2, r1, r3, r4, r0)
        L2f:
            android.content.res.ColorStateList r1 = r5.trackTintList
            if (r1 == 0) goto L3c
            android.graphics.drawable.Drawable r2 = r5.trackDrawable
            int[] r3 = r5.currentStateUnchecked
            int[] r4 = r5.currentStateChecked
            setInterpolatedDrawableTintIfPossible(r2, r1, r3, r4, r0)
        L3c:
            android.content.res.ColorStateList r1 = r5.trackDecorationTintList
            if (r1 == 0) goto L49
            android.graphics.drawable.Drawable r2 = r5.trackDecorationDrawable
            int[] r3 = r5.currentStateUnchecked
            int[] r4 = r5.currentStateChecked
            setInterpolatedDrawableTintIfPossible(r2, r1, r3, r4, r0)
        L49:
            return
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    @androidx.annotation.Nullable
    public android.graphics.drawable.Drawable getThumbDrawable() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.thumbDrawable
            return r0
    }

    @androidx.annotation.Nullable
    public android.graphics.drawable.Drawable getThumbIconDrawable() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.thumbIconDrawable
            return r0
    }

    @androidx.annotation.Nullable
    public android.content.res.ColorStateList getThumbIconTintList() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.thumbIconTintList
            return r0
    }

    @androidx.annotation.NonNull
    public android.graphics.PorterDuff.Mode getThumbIconTintMode() {
            r1 = this;
            android.graphics.PorterDuff$Mode r0 = r1.thumbIconTintMode
            return r0
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    @androidx.annotation.Nullable
    public android.content.res.ColorStateList getThumbTintList() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.thumbTintList
            return r0
    }

    @androidx.annotation.Nullable
    public android.graphics.drawable.Drawable getTrackDecorationDrawable() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.trackDecorationDrawable
            return r0
    }

    @androidx.annotation.Nullable
    public android.content.res.ColorStateList getTrackDecorationTintList() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.trackDecorationTintList
            return r0
    }

    @androidx.annotation.NonNull
    public android.graphics.PorterDuff.Mode getTrackDecorationTintMode() {
            r1 = this;
            android.graphics.PorterDuff$Mode r0 = r1.trackDecorationTintMode
            return r0
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    @androidx.annotation.Nullable
    public android.graphics.drawable.Drawable getTrackDrawable() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.trackDrawable
            return r0
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    @androidx.annotation.Nullable
    public android.content.res.ColorStateList getTrackTintList() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.trackTintList
            return r0
    }

    @Override // android.view.View
    public void invalidate() {
            r0 = this;
            r0.updateDrawableTints()
            super.invalidate()
            return
    }

    @Override // androidx.appcompat.widget.SwitchCompat, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int r2) {
            r1 = this;
            int r2 = r2 + 1
            int[] r2 = super.onCreateDrawableState(r2)
            android.graphics.drawable.Drawable r0 = r1.thumbIconDrawable
            if (r0 == 0) goto Lf
            int[] r0 = com.google.android.material.materialswitch.MaterialSwitch.STATE_SET_WITH_ICON
            android.view.View.mergeDrawableStates(r2, r0)
        Lf:
            int[] r0 = com.google.android.material.drawable.DrawableUtils.getUncheckedState(r2)
            r1.currentStateUnchecked = r0
            int[] r0 = com.google.android.material.drawable.DrawableUtils.getCheckedState(r2)
            r1.currentStateChecked = r0
            return r2
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setThumbDrawable(@androidx.annotation.Nullable android.graphics.drawable.Drawable r1) {
            r0 = this;
            r0.thumbDrawable = r1
            r0.refreshThumbDrawable()
            return
    }

    public void setThumbIconDrawable(@androidx.annotation.Nullable android.graphics.drawable.Drawable r1) {
            r0 = this;
            r0.thumbIconDrawable = r1
            r0.refreshThumbDrawable()
            return
    }

    public void setThumbIconResource(@androidx.annotation.DrawableRes int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            android.graphics.drawable.Drawable r2 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r0, r2)
            r1.setThumbIconDrawable(r2)
            return
    }

    public void setThumbIconTintList(@androidx.annotation.Nullable android.content.res.ColorStateList r1) {
            r0 = this;
            r0.thumbIconTintList = r1
            r0.refreshThumbDrawable()
            return
    }

    public void setThumbIconTintMode(@androidx.annotation.NonNull android.graphics.PorterDuff.Mode r1) {
            r0 = this;
            r0.thumbIconTintMode = r1
            r0.refreshThumbDrawable()
            return
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setThumbTintList(@androidx.annotation.Nullable android.content.res.ColorStateList r1) {
            r0 = this;
            r0.thumbTintList = r1
            r0.refreshThumbDrawable()
            return
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setThumbTintMode(@androidx.annotation.Nullable android.graphics.PorterDuff.Mode r1) {
            r0 = this;
            super.setThumbTintMode(r1)
            r0.refreshThumbDrawable()
            return
    }

    public void setTrackDecorationDrawable(@androidx.annotation.Nullable android.graphics.drawable.Drawable r1) {
            r0 = this;
            r0.trackDecorationDrawable = r1
            r0.refreshTrackDrawable()
            return
    }

    public void setTrackDecorationResource(@androidx.annotation.DrawableRes int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            android.graphics.drawable.Drawable r2 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r0, r2)
            r1.setTrackDecorationDrawable(r2)
            return
    }

    public void setTrackDecorationTintList(@androidx.annotation.Nullable android.content.res.ColorStateList r1) {
            r0 = this;
            r0.trackDecorationTintList = r1
            r0.refreshTrackDrawable()
            return
    }

    public void setTrackDecorationTintMode(@androidx.annotation.NonNull android.graphics.PorterDuff.Mode r1) {
            r0 = this;
            r0.trackDecorationTintMode = r1
            r0.refreshTrackDrawable()
            return
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setTrackDrawable(@androidx.annotation.Nullable android.graphics.drawable.Drawable r1) {
            r0 = this;
            r0.trackDrawable = r1
            r0.refreshTrackDrawable()
            return
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setTrackTintList(@androidx.annotation.Nullable android.content.res.ColorStateList r1) {
            r0 = this;
            r0.trackTintList = r1
            r0.refreshTrackDrawable()
            return
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setTrackTintMode(@androidx.annotation.Nullable android.graphics.PorterDuff.Mode r1) {
            r0 = this;
            super.setTrackTintMode(r1)
            r0.refreshTrackDrawable()
            return
    }
}
