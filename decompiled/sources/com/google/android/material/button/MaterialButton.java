package com.google.android.material.button;

/* JADX INFO: loaded from: classes2.dex */
public class MaterialButton extends androidx.appcompat.widget.AppCompatButton implements android.widget.Checkable, com.google.android.material.shape.Shapeable {
    private static final int[] CHECKABLE_STATE_SET = null;
    private static final int[] CHECKED_STATE_SET = null;
    private static final int DEF_STYLE_RES = 0;
    public static final int ICON_GRAVITY_END = 3;
    public static final int ICON_GRAVITY_START = 1;
    public static final int ICON_GRAVITY_TEXT_END = 4;
    public static final int ICON_GRAVITY_TEXT_START = 2;
    public static final int ICON_GRAVITY_TEXT_TOP = 32;
    public static final int ICON_GRAVITY_TOP = 16;
    private static final java.lang.String LOG_TAG = "MaterialButton";
    private boolean broadcasting;
    private boolean checked;

    @androidx.annotation.Nullable
    private android.graphics.drawable.Drawable icon;
    private int iconGravity;

    @androidx.annotation.Px
    private int iconLeft;

    @androidx.annotation.Px
    private int iconPadding;

    @androidx.annotation.Px
    private int iconSize;

    @androidx.annotation.Nullable
    private android.content.res.ColorStateList iconTint;

    @androidx.annotation.Nullable
    private android.graphics.PorterDuff.Mode iconTintMode;

    @androidx.annotation.Px
    private int iconTop;

    @androidx.annotation.NonNull
    private final com.google.android.material.button.MaterialButtonHelper materialButtonHelper;

    @androidx.annotation.NonNull
    private final java.util.LinkedHashSet<com.google.android.material.button.MaterialButton.OnCheckedChangeListener> onCheckedChangeListeners;

    @androidx.annotation.Nullable
    private com.google.android.material.button.MaterialButton.OnPressedChangeListener onPressedChangeListenerInternal;

    /* JADX INFO: loaded from: classes.dex */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface IconGravity {
    }

    public interface OnCheckedChangeListener {
        void onCheckedChanged(com.google.android.material.button.MaterialButton r1, boolean r2);
    }

    /* JADX INFO: loaded from: classes3.dex */
    public interface OnPressedChangeListener {
        void onPressedChanged(com.google.android.material.button.MaterialButton r1, boolean r2);
    }

    /* JADX INFO: loaded from: classes.dex */
    public static class SavedState extends androidx.customview.view.AbsSavedState {
        public static final android.os.Parcelable.Creator<com.google.android.material.button.MaterialButton.SavedState> CREATOR = null;
        public boolean checked;


        static {
                com.google.android.material.button.MaterialButton$SavedState$1 r0 = new com.google.android.material.button.MaterialButton$SavedState$1
                r0.<init>()
                com.google.android.material.button.MaterialButton.SavedState.CREATOR = r0
                return
        }

        public SavedState(@androidx.annotation.NonNull android.os.Parcel r1, java.lang.ClassLoader r2) {
                r0 = this;
                r0.<init>(r1, r2)
                if (r2 != 0) goto Lc
                java.lang.Class r2 = r0.getClass()
                r2.getClassLoader()
            Lc:
                r0.readFromParcel(r1)
                return
        }

        public SavedState(android.os.Parcelable r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        private void readFromParcel(@androidx.annotation.NonNull android.os.Parcel r2) {
                r1 = this;
                int r2 = r2.readInt()
                r0 = 1
                if (r2 != r0) goto L8
                goto L9
            L8:
                r0 = 0
            L9:
                r1.checked = r0
                return
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@androidx.annotation.NonNull android.os.Parcel r1, int r2) {
                r0 = this;
                super.writeToParcel(r1, r2)
                boolean r2 = r0.checked
                r1.writeInt(r2)
                return
        }
    }

    static {
            r0 = 1
            int[] r1 = new int[r0]
            r2 = 16842911(0x101009f, float:2.3694004E-38)
            r3 = 0
            r1[r3] = r2
            com.google.android.material.button.MaterialButton.CHECKABLE_STATE_SET = r1
            int[] r0 = new int[r0]
            r1 = 16842912(0x10100a0, float:2.3694006E-38)
            r0[r3] = r1
            com.google.android.material.button.MaterialButton.CHECKED_STATE_SET = r0
            int r0 = com.google.android.material.R.style.Widget_MaterialComponents_Button
            com.google.android.material.button.MaterialButton.DEF_STYLE_RES = r0
            return
    }

    public MaterialButton(@androidx.annotation.NonNull android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public MaterialButton(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.Nullable android.util.AttributeSet r3) {
            r1 = this;
            int r0 = com.google.android.material.R.attr.materialButtonStyle
            r1.<init>(r2, r3, r0)
            return
    }

    public MaterialButton(@androidx.annotation.NonNull android.content.Context r9, @androidx.annotation.Nullable android.util.AttributeSet r10, int r11) {
            r8 = this;
            int r6 = com.google.android.material.button.MaterialButton.DEF_STYLE_RES
            android.content.Context r9 = com.google.android.material.theme.overlay.MaterialThemeOverlay.wrap(r9, r10, r11, r6)
            r8.<init>(r9, r10, r11)
            java.util.LinkedHashSet r9 = new java.util.LinkedHashSet
            r9.<init>()
            r8.onCheckedChangeListeners = r9
            r9 = 0
            r8.checked = r9
            r8.broadcasting = r9
            android.content.Context r7 = r8.getContext()
            int[] r2 = com.google.android.material.R.styleable.MaterialButton
            int[] r5 = new int[r9]
            r0 = r7
            r1 = r10
            r3 = r11
            r4 = r6
            android.content.res.TypedArray r0 = com.google.android.material.internal.ThemeEnforcement.obtainStyledAttributes(r0, r1, r2, r3, r4, r5)
            int r1 = com.google.android.material.R.styleable.MaterialButton_iconPadding
            int r1 = r0.getDimensionPixelSize(r1, r9)
            r8.iconPadding = r1
            int r1 = com.google.android.material.R.styleable.MaterialButton_iconTintMode
            r2 = -1
            int r1 = r0.getInt(r1, r2)
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.PorterDuff$Mode r1 = com.google.android.material.internal.ViewUtils.parseTintMode(r1, r2)
            r8.iconTintMode = r1
            android.content.Context r1 = r8.getContext()
            int r2 = com.google.android.material.R.styleable.MaterialButton_iconTint
            android.content.res.ColorStateList r1 = com.google.android.material.resources.MaterialResources.getColorStateList(r1, r0, r2)
            r8.iconTint = r1
            android.content.Context r1 = r8.getContext()
            int r2 = com.google.android.material.R.styleable.MaterialButton_icon
            android.graphics.drawable.Drawable r1 = com.google.android.material.resources.MaterialResources.getDrawable(r1, r0, r2)
            r8.icon = r1
            int r1 = com.google.android.material.R.styleable.MaterialButton_iconGravity
            r2 = 1
            int r1 = r0.getInteger(r1, r2)
            r8.iconGravity = r1
            int r1 = com.google.android.material.R.styleable.MaterialButton_iconSize
            int r1 = r0.getDimensionPixelSize(r1, r9)
            r8.iconSize = r1
            com.google.android.material.shape.ShapeAppearanceModel$Builder r10 = com.google.android.material.shape.ShapeAppearanceModel.builder(r7, r10, r11, r6)
            com.google.android.material.shape.ShapeAppearanceModel r10 = r10.build()
            com.google.android.material.button.MaterialButtonHelper r11 = new com.google.android.material.button.MaterialButtonHelper
            r11.<init>(r8, r10)
            r8.materialButtonHelper = r11
            r11.loadFromAttributes(r0)
            r0.recycle()
            int r10 = r8.iconPadding
            r8.setCompoundDrawablePadding(r10)
            android.graphics.drawable.Drawable r10 = r8.icon
            if (r10 == 0) goto L84
            r9 = 1
        L84:
            r8.updateIcon(r9)
            return
    }

    @androidx.annotation.NonNull
    private java.lang.String getA11yClassName() {
            r1 = this;
            boolean r0 = r1.isCheckable()
            if (r0 == 0) goto L9
            java.lang.Class<android.widget.CompoundButton> r0 = android.widget.CompoundButton.class
            goto Lb
        L9:
            java.lang.Class<android.widget.Button> r0 = android.widget.Button.class
        Lb:
            java.lang.String r0 = r0.getName()
            return r0
    }

    private android.text.Layout.Alignment getActualTextAlignment() {
            r2 = this;
            int r0 = r2.getTextAlignment()
            r1 = 1
            if (r0 == r1) goto L19
            r1 = 6
            if (r0 == r1) goto L16
            r1 = 3
            if (r0 == r1) goto L16
            r1 = 4
            if (r0 == r1) goto L13
            android.text.Layout$Alignment r0 = android.text.Layout.Alignment.ALIGN_NORMAL
            return r0
        L13:
            android.text.Layout$Alignment r0 = android.text.Layout.Alignment.ALIGN_CENTER
            return r0
        L16:
            android.text.Layout$Alignment r0 = android.text.Layout.Alignment.ALIGN_OPPOSITE
            return r0
        L19:
            android.text.Layout$Alignment r0 = r2.getGravityTextAlignment()
            return r0
    }

    private android.text.Layout.Alignment getGravityTextAlignment() {
            r2 = this;
            int r0 = r2.getGravity()
            r1 = 8388615(0x800007, float:1.1754953E-38)
            r0 = r0 & r1
            r1 = 1
            if (r0 == r1) goto L19
            r1 = 5
            if (r0 == r1) goto L16
            r1 = 8388613(0x800005, float:1.175495E-38)
            if (r0 == r1) goto L16
            android.text.Layout$Alignment r0 = android.text.Layout.Alignment.ALIGN_NORMAL
            return r0
        L16:
            android.text.Layout$Alignment r0 = android.text.Layout.Alignment.ALIGN_OPPOSITE
            return r0
        L19:
            android.text.Layout$Alignment r0 = android.text.Layout.Alignment.ALIGN_CENTER
            return r0
    }

    private int getTextHeight() {
            r5 = this;
            int r0 = r5.getLineCount()
            r1 = 1
            if (r0 <= r1) goto L10
            android.text.Layout r0 = r5.getLayout()
            int r0 = r0.getHeight()
            return r0
        L10:
            android.text.TextPaint r0 = r5.getPaint()
            java.lang.CharSequence r1 = r5.getText()
            java.lang.String r1 = r1.toString()
            android.text.method.TransformationMethod r2 = r5.getTransformationMethod()
            if (r2 == 0) goto L2e
            android.text.method.TransformationMethod r2 = r5.getTransformationMethod()
            java.lang.CharSequence r1 = r2.getTransformation(r1, r5)
            java.lang.String r1 = r1.toString()
        L2e:
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            r3 = 0
            int r4 = r1.length()
            r0.getTextBounds(r1, r3, r4, r2)
            int r0 = r2.height()
            android.text.Layout r1 = r5.getLayout()
            int r1 = r1.getHeight()
            int r0 = java.lang.Math.min(r0, r1)
            return r0
    }

    private int getTextLayoutWidth() {
            r4 = this;
            int r0 = r4.getLineCount()
            r1 = 0
            r2 = 0
        L6:
            if (r2 >= r0) goto L17
            android.text.Layout r3 = r4.getLayout()
            float r3 = r3.getLineWidth(r2)
            float r1 = java.lang.Math.max(r1, r3)
            int r2 = r2 + 1
            goto L6
        L17:
            double r0 = (double) r1
            double r0 = java.lang.Math.ceil(r0)
            int r0 = (int) r0
            return r0
    }

    private boolean isIconEnd() {
            r2 = this;
            int r0 = r2.iconGravity
            r1 = 3
            if (r0 == r1) goto Lb
            r1 = 4
            if (r0 != r1) goto L9
            goto Lb
        L9:
            r0 = 0
            goto Lc
        Lb:
            r0 = 1
        Lc:
            return r0
    }

    private boolean isIconStart() {
            r3 = this;
            int r0 = r3.iconGravity
            r1 = 1
            if (r0 == r1) goto La
            r2 = 2
            if (r0 != r2) goto L9
            goto La
        L9:
            r1 = 0
        La:
            return r1
    }

    private boolean isIconTop() {
            r2 = this;
            int r0 = r2.iconGravity
            r1 = 16
            if (r0 == r1) goto Ld
            r1 = 32
            if (r0 != r1) goto Lb
            goto Ld
        Lb:
            r0 = 0
            goto Le
        Ld:
            r0 = 1
        Le:
            return r0
    }

    private boolean isLayoutRTL() {
            r2 = this;
            int r0 = androidx.core.view.ViewCompat.getLayoutDirection(r2)
            r1 = 1
            if (r0 != r1) goto L8
            goto L9
        L8:
            r1 = 0
        L9:
            return r1
    }

    private boolean isUsingOriginalBackground() {
            r1 = this;
            com.google.android.material.button.MaterialButtonHelper r0 = r1.materialButtonHelper
            if (r0 == 0) goto Lc
            boolean r0 = r0.isBackgroundOverwritten()
            if (r0 != 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    private void resetIconDrawable() {
            r2 = this;
            boolean r0 = r2.isIconStart()
            r1 = 0
            if (r0 == 0) goto Ld
            android.graphics.drawable.Drawable r0 = r2.icon
            androidx.core.widget.TextViewCompat.setCompoundDrawablesRelative(r2, r0, r1, r1, r1)
            goto L24
        Ld:
            boolean r0 = r2.isIconEnd()
            if (r0 == 0) goto L19
            android.graphics.drawable.Drawable r0 = r2.icon
            androidx.core.widget.TextViewCompat.setCompoundDrawablesRelative(r2, r1, r1, r0, r1)
            goto L24
        L19:
            boolean r0 = r2.isIconTop()
            if (r0 == 0) goto L24
            android.graphics.drawable.Drawable r0 = r2.icon
            androidx.core.widget.TextViewCompat.setCompoundDrawablesRelative(r2, r1, r0, r1, r1)
        L24:
            return
    }

    private void updateIcon(boolean r7) {
            r6 = this;
            android.graphics.drawable.Drawable r0 = r6.icon
            r1 = 1
            if (r0 == 0) goto L43
            android.graphics.drawable.Drawable r0 = androidx.core.graphics.drawable.DrawableCompat.wrap(r0)
            android.graphics.drawable.Drawable r0 = r0.mutate()
            r6.icon = r0
            android.content.res.ColorStateList r2 = r6.iconTint
            androidx.core.graphics.drawable.DrawableCompat.setTintList(r0, r2)
            android.graphics.PorterDuff$Mode r0 = r6.iconTintMode
            if (r0 == 0) goto L1d
            android.graphics.drawable.Drawable r2 = r6.icon
            androidx.core.graphics.drawable.DrawableCompat.setTintMode(r2, r0)
        L1d:
            int r0 = r6.iconSize
            if (r0 == 0) goto L22
            goto L28
        L22:
            android.graphics.drawable.Drawable r0 = r6.icon
            int r0 = r0.getIntrinsicWidth()
        L28:
            int r2 = r6.iconSize
            if (r2 == 0) goto L2d
            goto L33
        L2d:
            android.graphics.drawable.Drawable r2 = r6.icon
            int r2 = r2.getIntrinsicHeight()
        L33:
            android.graphics.drawable.Drawable r3 = r6.icon
            int r4 = r6.iconLeft
            int r5 = r6.iconTop
            int r0 = r0 + r4
            int r2 = r2 + r5
            r3.setBounds(r4, r5, r0, r2)
            android.graphics.drawable.Drawable r0 = r6.icon
            r0.setVisible(r1, r7)
        L43:
            if (r7 == 0) goto L49
            r6.resetIconDrawable()
            return
        L49:
            android.graphics.drawable.Drawable[] r7 = androidx.core.widget.TextViewCompat.getCompoundDrawablesRelative(r6)
            r0 = 0
            r2 = r7[r0]
            r3 = r7[r1]
            r4 = 2
            r7 = r7[r4]
            boolean r4 = r6.isIconStart()
            if (r4 == 0) goto L5f
            android.graphics.drawable.Drawable r4 = r6.icon
            if (r2 != r4) goto L75
        L5f:
            boolean r2 = r6.isIconEnd()
            if (r2 == 0) goto L69
            android.graphics.drawable.Drawable r2 = r6.icon
            if (r7 != r2) goto L75
        L69:
            boolean r7 = r6.isIconTop()
            if (r7 == 0) goto L74
            android.graphics.drawable.Drawable r7 = r6.icon
            if (r3 == r7) goto L74
            goto L75
        L74:
            r1 = 0
        L75:
            if (r1 == 0) goto L7a
            r6.resetIconDrawable()
        L7a:
            return
    }

    private void updateIconPosition(int r6, int r7) {
            r5 = this;
            android.graphics.drawable.Drawable r0 = r5.icon
            if (r0 == 0) goto Lb6
            android.text.Layout r0 = r5.getLayout()
            if (r0 != 0) goto Lc
            goto Lb6
        Lc:
            boolean r0 = r5.isIconStart()
            r1 = 2
            r2 = 0
            if (r0 != 0) goto L5b
            boolean r0 = r5.isIconEnd()
            if (r0 == 0) goto L1b
            goto L5b
        L1b:
            boolean r6 = r5.isIconTop()
            if (r6 == 0) goto Lb0
            r5.iconLeft = r2
            int r6 = r5.iconGravity
            r0 = 16
            if (r6 != r0) goto L2f
            r5.iconTop = r2
            r5.updateIcon(r2)
            return
        L2f:
            int r6 = r5.iconSize
            if (r6 != 0) goto L39
            android.graphics.drawable.Drawable r6 = r5.icon
            int r6 = r6.getIntrinsicHeight()
        L39:
            int r0 = r5.getTextHeight()
            int r7 = r7 - r0
            int r0 = r5.getPaddingTop()
            int r7 = r7 - r0
            int r7 = r7 - r6
            int r6 = r5.iconPadding
            int r7 = r7 - r6
            int r6 = r5.getPaddingBottom()
            int r7 = r7 - r6
            int r7 = r7 / r1
            int r6 = java.lang.Math.max(r2, r7)
            int r7 = r5.iconTop
            if (r7 == r6) goto Lb0
            r5.iconTop = r6
            r5.updateIcon(r2)
            goto Lb0
        L5b:
            r5.iconTop = r2
            android.text.Layout$Alignment r7 = r5.getActualTextAlignment()
            int r0 = r5.iconGravity
            r3 = 1
            if (r0 == r3) goto Lb1
            r4 = 3
            if (r0 == r4) goto Lb1
            if (r0 != r1) goto L6f
            android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_NORMAL
            if (r7 == r1) goto Lb1
        L6f:
            r1 = 4
            if (r0 != r1) goto L77
            android.text.Layout$Alignment r0 = android.text.Layout.Alignment.ALIGN_OPPOSITE
            if (r7 != r0) goto L77
            goto Lb1
        L77:
            int r0 = r5.iconSize
            if (r0 != 0) goto L81
            android.graphics.drawable.Drawable r0 = r5.icon
            int r0 = r0.getIntrinsicWidth()
        L81:
            int r4 = r5.getTextLayoutWidth()
            int r6 = r6 - r4
            int r4 = androidx.core.view.ViewCompat.getPaddingEnd(r5)
            int r6 = r6 - r4
            int r6 = r6 - r0
            int r0 = r5.iconPadding
            int r6 = r6 - r0
            int r0 = androidx.core.view.ViewCompat.getPaddingStart(r5)
            int r6 = r6 - r0
            android.text.Layout$Alignment r0 = android.text.Layout.Alignment.ALIGN_CENTER
            if (r7 != r0) goto L9a
            int r6 = r6 / 2
        L9a:
            boolean r7 = r5.isLayoutRTL()
            int r0 = r5.iconGravity
            if (r0 != r1) goto La3
            goto La4
        La3:
            r3 = 0
        La4:
            if (r7 == r3) goto La7
            int r6 = -r6
        La7:
            int r7 = r5.iconLeft
            if (r7 == r6) goto Lb0
            r5.iconLeft = r6
            r5.updateIcon(r2)
        Lb0:
            return
        Lb1:
            r5.iconLeft = r2
            r5.updateIcon(r2)
        Lb6:
            return
    }

    public void addOnCheckedChangeListener(@androidx.annotation.NonNull com.google.android.material.button.MaterialButton.OnCheckedChangeListener r2) {
            r1 = this;
            java.util.LinkedHashSet<com.google.android.material.button.MaterialButton$OnCheckedChangeListener> r0 = r1.onCheckedChangeListeners
            r0.add(r2)
            return
    }

    public void clearOnCheckedChangeListeners() {
            r1 = this;
            java.util.LinkedHashSet<com.google.android.material.button.MaterialButton$OnCheckedChangeListener> r0 = r1.onCheckedChangeListeners
            r0.clear()
            return
    }

    @Override // android.view.View
    @androidx.annotation.Nullable
    public android.content.res.ColorStateList getBackgroundTintList() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.getSupportBackgroundTintList()
            return r0
    }

    @Override // android.view.View
    @androidx.annotation.Nullable
    public android.graphics.PorterDuff.Mode getBackgroundTintMode() {
            r1 = this;
            android.graphics.PorterDuff$Mode r0 = r1.getSupportBackgroundTintMode()
            return r0
    }

    @androidx.annotation.Px
    public int getCornerRadius() {
            r1 = this;
            boolean r0 = r1.isUsingOriginalBackground()
            if (r0 == 0) goto Ld
            com.google.android.material.button.MaterialButtonHelper r0 = r1.materialButtonHelper
            int r0 = r0.getCornerRadius()
            goto Le
        Ld:
            r0 = 0
        Le:
            return r0
    }

    public android.graphics.drawable.Drawable getIcon() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.icon
            return r0
    }

    public int getIconGravity() {
            r1 = this;
            int r0 = r1.iconGravity
            return r0
    }

    @androidx.annotation.Px
    public int getIconPadding() {
            r1 = this;
            int r0 = r1.iconPadding
            return r0
    }

    @androidx.annotation.Px
    public int getIconSize() {
            r1 = this;
            int r0 = r1.iconSize
            return r0
    }

    public android.content.res.ColorStateList getIconTint() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.iconTint
            return r0
    }

    public android.graphics.PorterDuff.Mode getIconTintMode() {
            r1 = this;
            android.graphics.PorterDuff$Mode r0 = r1.iconTintMode
            return r0
    }

    @androidx.annotation.Dimension
    public int getInsetBottom() {
            r1 = this;
            com.google.android.material.button.MaterialButtonHelper r0 = r1.materialButtonHelper
            int r0 = r0.getInsetBottom()
            return r0
    }

    @androidx.annotation.Dimension
    public int getInsetTop() {
            r1 = this;
            com.google.android.material.button.MaterialButtonHelper r0 = r1.materialButtonHelper
            int r0 = r0.getInsetTop()
            return r0
    }

    @androidx.annotation.Nullable
    public android.content.res.ColorStateList getRippleColor() {
            r1 = this;
            boolean r0 = r1.isUsingOriginalBackground()
            if (r0 == 0) goto Ld
            com.google.android.material.button.MaterialButtonHelper r0 = r1.materialButtonHelper
            android.content.res.ColorStateList r0 = r0.getRippleColor()
            goto Le
        Ld:
            r0 = 0
        Le:
            return r0
    }

    @Override // com.google.android.material.shape.Shapeable
    @androidx.annotation.NonNull
    public com.google.android.material.shape.ShapeAppearanceModel getShapeAppearanceModel() {
            r2 = this;
            boolean r0 = r2.isUsingOriginalBackground()
            if (r0 == 0) goto Ld
            com.google.android.material.button.MaterialButtonHelper r0 = r2.materialButtonHelper
            com.google.android.material.shape.ShapeAppearanceModel r0 = r0.getShapeAppearanceModel()
            return r0
        Ld:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background."
            r0.<init>(r1)
            throw r0
    }

    public android.content.res.ColorStateList getStrokeColor() {
            r1 = this;
            boolean r0 = r1.isUsingOriginalBackground()
            if (r0 == 0) goto Ld
            com.google.android.material.button.MaterialButtonHelper r0 = r1.materialButtonHelper
            android.content.res.ColorStateList r0 = r0.getStrokeColor()
            goto Le
        Ld:
            r0 = 0
        Le:
            return r0
    }

    @androidx.annotation.Px
    public int getStrokeWidth() {
            r1 = this;
            boolean r0 = r1.isUsingOriginalBackground()
            if (r0 == 0) goto Ld
            com.google.android.material.button.MaterialButtonHelper r0 = r1.materialButtonHelper
            int r0 = r0.getStrokeWidth()
            goto Le
        Ld:
            r0 = 0
        Le:
            return r0
    }

    @Override // androidx.appcompat.widget.AppCompatButton, androidx.core.view.TintableBackgroundView
    @androidx.annotation.Nullable
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public android.content.res.ColorStateList getSupportBackgroundTintList() {
            r1 = this;
            boolean r0 = r1.isUsingOriginalBackground()
            if (r0 == 0) goto Ld
            com.google.android.material.button.MaterialButtonHelper r0 = r1.materialButtonHelper
            android.content.res.ColorStateList r0 = r0.getSupportBackgroundTintList()
            return r0
        Ld:
            android.content.res.ColorStateList r0 = super.getSupportBackgroundTintList()
            return r0
    }

    @Override // androidx.appcompat.widget.AppCompatButton, androidx.core.view.TintableBackgroundView
    @androidx.annotation.Nullable
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public android.graphics.PorterDuff.Mode getSupportBackgroundTintMode() {
            r1 = this;
            boolean r0 = r1.isUsingOriginalBackground()
            if (r0 == 0) goto Ld
            com.google.android.material.button.MaterialButtonHelper r0 = r1.materialButtonHelper
            android.graphics.PorterDuff$Mode r0 = r0.getSupportBackgroundTintMode()
            return r0
        Ld:
            android.graphics.PorterDuff$Mode r0 = super.getSupportBackgroundTintMode()
            return r0
    }

    public boolean isCheckable() {
            r1 = this;
            com.google.android.material.button.MaterialButtonHelper r0 = r1.materialButtonHelper
            if (r0 == 0) goto Lc
            boolean r0 = r0.isCheckable()
            if (r0 == 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
            r1 = this;
            boolean r0 = r1.checked
            return r0
    }

    public boolean isToggleCheckedStateOnClick() {
            r1 = this;
            com.google.android.material.button.MaterialButtonHelper r0 = r1.materialButtonHelper
            boolean r0 = r0.isToggleCheckedStateOnClick()
            return r0
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
            r1 = this;
            super.onAttachedToWindow()
            boolean r0 = r1.isUsingOriginalBackground()
            if (r0 == 0) goto L12
            com.google.android.material.button.MaterialButtonHelper r0 = r1.materialButtonHelper
            com.google.android.material.shape.MaterialShapeDrawable r0 = r0.getMaterialShapeDrawable()
            com.google.android.material.shape.MaterialShapeUtils.setParentAbsoluteElevation(r1, r0)
        L12:
            return
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int r2) {
            r1 = this;
            int r2 = r2 + 2
            int[] r2 = super.onCreateDrawableState(r2)
            boolean r0 = r1.isCheckable()
            if (r0 == 0) goto L11
            int[] r0 = com.google.android.material.button.MaterialButton.CHECKABLE_STATE_SET
            android.view.View.mergeDrawableStates(r2, r0)
        L11:
            boolean r0 = r1.isChecked()
            if (r0 == 0) goto L1c
            int[] r0 = com.google.android.material.button.MaterialButton.CHECKED_STATE_SET
            android.view.View.mergeDrawableStates(r2, r0)
        L1c:
            return r2
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void onInitializeAccessibilityEvent(@androidx.annotation.NonNull android.view.accessibility.AccessibilityEvent r2) {
            r1 = this;
            super.onInitializeAccessibilityEvent(r2)
            java.lang.String r0 = r1.getA11yClassName()
            r2.setClassName(r0)
            boolean r0 = r1.isChecked()
            r2.setChecked(r0)
            return
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void onInitializeAccessibilityNodeInfo(@androidx.annotation.NonNull android.view.accessibility.AccessibilityNodeInfo r2) {
            r1 = this;
            super.onInitializeAccessibilityNodeInfo(r2)
            java.lang.String r0 = r1.getA11yClassName()
            r2.setClassName(r0)
            boolean r0 = r1.isCheckable()
            r2.setCheckable(r0)
            boolean r0 = r1.isChecked()
            r2.setChecked(r0)
            boolean r0 = r1.isClickable()
            r2.setClickable(r0)
            return
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView, android.view.View
    public final void onLayout(boolean r2, int r3, int r4, int r5, int r6) {
            r1 = this;
            super.onLayout(r2, r3, r4, r5, r6)
            int r2 = android.os.Build.VERSION.SDK_INT
            r0 = 21
            if (r2 != r0) goto L12
            com.google.android.material.button.MaterialButtonHelper r2 = r1.materialButtonHelper
            if (r2 == 0) goto L12
            int r6 = r6 - r4
            int r5 = r5 - r3
            r2.updateMaskBounds(r6, r5)
        L12:
            int r2 = r1.getMeasuredWidth()
            int r3 = r1.getMeasuredHeight()
            r1.updateIconPosition(r2, r3)
            return
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(@androidx.annotation.Nullable android.os.Parcelable r2) {
            r1 = this;
            boolean r0 = r2 instanceof com.google.android.material.button.MaterialButton.SavedState
            if (r0 != 0) goto L8
            super.onRestoreInstanceState(r2)
            return
        L8:
            com.google.android.material.button.MaterialButton$SavedState r2 = (com.google.android.material.button.MaterialButton.SavedState) r2
            android.os.Parcelable r0 = r2.getSuperState()
            super.onRestoreInstanceState(r0)
            boolean r2 = r2.checked
            r1.setChecked(r2)
            return
    }

    @Override // android.widget.TextView, android.view.View
    @androidx.annotation.NonNull
    public android.os.Parcelable onSaveInstanceState() {
            r2 = this;
            android.os.Parcelable r0 = super.onSaveInstanceState()
            com.google.android.material.button.MaterialButton$SavedState r1 = new com.google.android.material.button.MaterialButton$SavedState
            r1.<init>(r0)
            boolean r0 = r2.checked
            r1.checked = r0
            return r1
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView
    public final void onTextChanged(java.lang.CharSequence r1, int r2, int r3, int r4) {
            r0 = this;
            super.onTextChanged(r1, r2, r3, r4)
            int r1 = r0.getMeasuredWidth()
            int r2 = r0.getMeasuredHeight()
            r0.updateIconPosition(r1, r2)
            return
    }

    @Override // android.view.View
    public boolean performClick() {
            r1 = this;
            com.google.android.material.button.MaterialButtonHelper r0 = r1.materialButtonHelper
            boolean r0 = r0.isToggleCheckedStateOnClick()
            if (r0 == 0) goto Lb
            r1.toggle()
        Lb:
            boolean r0 = super.performClick()
            return r0
    }

    @Override // android.view.View
    public void refreshDrawableState() {
            r2 = this;
            super.refreshDrawableState()
            android.graphics.drawable.Drawable r0 = r2.icon
            if (r0 == 0) goto L16
            int[] r0 = r2.getDrawableState()
            android.graphics.drawable.Drawable r1 = r2.icon
            boolean r0 = r1.setState(r0)
            if (r0 == 0) goto L16
            r2.invalidate()
        L16:
            return
    }

    public void removeOnCheckedChangeListener(@androidx.annotation.NonNull com.google.android.material.button.MaterialButton.OnCheckedChangeListener r2) {
            r1 = this;
            java.util.LinkedHashSet<com.google.android.material.button.MaterialButton$OnCheckedChangeListener> r0 = r1.onCheckedChangeListeners
            r0.remove(r2)
            return
    }

    @Override // android.view.View
    public void setBackground(@androidx.annotation.NonNull android.graphics.drawable.Drawable r1) {
            r0 = this;
            r0.setBackgroundDrawable(r1)
            return
    }

    @Override // android.view.View
    public void setBackgroundColor(@androidx.annotation.ColorInt int r2) {
            r1 = this;
            boolean r0 = r1.isUsingOriginalBackground()
            if (r0 == 0) goto Lc
            com.google.android.material.button.MaterialButtonHelper r0 = r1.materialButtonHelper
            r0.setBackgroundColor(r2)
            goto Lf
        Lc:
            super.setBackgroundColor(r2)
        Lf:
            return
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundDrawable(@androidx.annotation.NonNull android.graphics.drawable.Drawable r3) {
            r2 = this;
            boolean r0 = r2.isUsingOriginalBackground()
            if (r0 == 0) goto L28
            android.graphics.drawable.Drawable r0 = r2.getBackground()
            if (r3 == r0) goto L1c
            java.lang.String r0 = "MaterialButton"
            java.lang.String r1 = "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled"
            android.util.Log.w(r0, r1)
            com.google.android.material.button.MaterialButtonHelper r0 = r2.materialButtonHelper
            r0.setBackgroundOverwritten()
            super.setBackgroundDrawable(r3)
            goto L2b
        L1c:
            android.graphics.drawable.Drawable r0 = r2.getBackground()
            int[] r3 = r3.getState()
            r0.setState(r3)
            goto L2b
        L28:
            super.setBackgroundDrawable(r3)
        L2b:
            return
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundResource(@androidx.annotation.DrawableRes int r2) {
            r1 = this;
            if (r2 == 0) goto Lb
            android.content.Context r0 = r1.getContext()
            android.graphics.drawable.Drawable r2 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r0, r2)
            goto Lc
        Lb:
            r2 = 0
        Lc:
            r1.setBackgroundDrawable(r2)
            return
    }

    @Override // android.view.View
    public void setBackgroundTintList(@androidx.annotation.Nullable android.content.res.ColorStateList r1) {
            r0 = this;
            r0.setSupportBackgroundTintList(r1)
            return
    }

    @Override // android.view.View
    public void setBackgroundTintMode(@androidx.annotation.Nullable android.graphics.PorterDuff.Mode r1) {
            r0 = this;
            r0.setSupportBackgroundTintMode(r1)
            return
    }

    public void setCheckable(boolean r2) {
            r1 = this;
            boolean r0 = r1.isUsingOriginalBackground()
            if (r0 == 0) goto Lb
            com.google.android.material.button.MaterialButtonHelper r0 = r1.materialButtonHelper
            r0.setCheckable(r2)
        Lb:
            return
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean r3) {
            r2 = this;
            boolean r0 = r2.isCheckable()
            if (r0 == 0) goto L4b
            boolean r0 = r2.isEnabled()
            if (r0 == 0) goto L4b
            boolean r0 = r2.checked
            if (r0 == r3) goto L4b
            r2.checked = r3
            r2.refreshDrawableState()
            android.view.ViewParent r3 = r2.getParent()
            boolean r3 = r3 instanceof com.google.android.material.button.MaterialButtonToggleGroup
            if (r3 == 0) goto L28
            android.view.ViewParent r3 = r2.getParent()
            com.google.android.material.button.MaterialButtonToggleGroup r3 = (com.google.android.material.button.MaterialButtonToggleGroup) r3
            boolean r0 = r2.checked
            r3.onButtonCheckedStateChanged(r2, r0)
        L28:
            boolean r3 = r2.broadcasting
            if (r3 == 0) goto L2d
            return
        L2d:
            r3 = 1
            r2.broadcasting = r3
            java.util.LinkedHashSet<com.google.android.material.button.MaterialButton$OnCheckedChangeListener> r3 = r2.onCheckedChangeListeners
            java.util.Iterator r3 = r3.iterator()
        L36:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L48
            java.lang.Object r0 = r3.next()
            com.google.android.material.button.MaterialButton$OnCheckedChangeListener r0 = (com.google.android.material.button.MaterialButton.OnCheckedChangeListener) r0
            boolean r1 = r2.checked
            r0.onCheckedChanged(r2, r1)
            goto L36
        L48:
            r3 = 0
            r2.broadcasting = r3
        L4b:
            return
    }

    public void setCornerRadius(@androidx.annotation.Px int r2) {
            r1 = this;
            boolean r0 = r1.isUsingOriginalBackground()
            if (r0 == 0) goto Lb
            com.google.android.material.button.MaterialButtonHelper r0 = r1.materialButtonHelper
            r0.setCornerRadius(r2)
        Lb:
            return
    }

    public void setCornerRadiusResource(@androidx.annotation.DimenRes int r2) {
            r1 = this;
            boolean r0 = r1.isUsingOriginalBackground()
            if (r0 == 0) goto L11
            android.content.res.Resources r0 = r1.getResources()
            int r2 = r0.getDimensionPixelSize(r2)
            r1.setCornerRadius(r2)
        L11:
            return
    }

    @Override // android.view.View
    @androidx.annotation.RequiresApi(21)
    public void setElevation(float r2) {
            r1 = this;
            super.setElevation(r2)
            boolean r0 = r1.isUsingOriginalBackground()
            if (r0 == 0) goto L12
            com.google.android.material.button.MaterialButtonHelper r0 = r1.materialButtonHelper
            com.google.android.material.shape.MaterialShapeDrawable r0 = r0.getMaterialShapeDrawable()
            r0.setElevation(r2)
        L12:
            return
    }

    public void setIcon(@androidx.annotation.Nullable android.graphics.drawable.Drawable r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.icon
            if (r0 == r2) goto L15
            r1.icon = r2
            r2 = 1
            r1.updateIcon(r2)
            int r2 = r1.getMeasuredWidth()
            int r0 = r1.getMeasuredHeight()
            r1.updateIconPosition(r2, r0)
        L15:
            return
    }

    public void setIconGravity(int r2) {
            r1 = this;
            int r0 = r1.iconGravity
            if (r0 == r2) goto L11
            r1.iconGravity = r2
            int r2 = r1.getMeasuredWidth()
            int r0 = r1.getMeasuredHeight()
            r1.updateIconPosition(r2, r0)
        L11:
            return
    }

    public void setIconPadding(@androidx.annotation.Px int r2) {
            r1 = this;
            int r0 = r1.iconPadding
            if (r0 == r2) goto L9
            r1.iconPadding = r2
            r1.setCompoundDrawablePadding(r2)
        L9:
            return
    }

    public void setIconResource(@androidx.annotation.DrawableRes int r2) {
            r1 = this;
            if (r2 == 0) goto Lb
            android.content.Context r0 = r1.getContext()
            android.graphics.drawable.Drawable r2 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r0, r2)
            goto Lc
        Lb:
            r2 = 0
        Lc:
            r1.setIcon(r2)
            return
    }

    public void setIconSize(@androidx.annotation.Px int r2) {
            r1 = this;
            if (r2 < 0) goto Ld
            int r0 = r1.iconSize
            if (r0 == r2) goto Lc
            r1.iconSize = r2
            r2 = 1
            r1.updateIcon(r2)
        Lc:
            return
        Ld:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "iconSize cannot be less than 0"
            r2.<init>(r0)
            throw r2
    }

    public void setIconTint(@androidx.annotation.Nullable android.content.res.ColorStateList r2) {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.iconTint
            if (r0 == r2) goto La
            r1.iconTint = r2
            r2 = 0
            r1.updateIcon(r2)
        La:
            return
    }

    public void setIconTintMode(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            android.graphics.PorterDuff$Mode r0 = r1.iconTintMode
            if (r0 == r2) goto La
            r1.iconTintMode = r2
            r2 = 0
            r1.updateIcon(r2)
        La:
            return
    }

    public void setIconTintResource(@androidx.annotation.ColorRes int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            android.content.res.ColorStateList r2 = androidx.appcompat.content.res.AppCompatResources.getColorStateList(r0, r2)
            r1.setIconTint(r2)
            return
    }

    public void setInsetBottom(@androidx.annotation.Dimension int r2) {
            r1 = this;
            com.google.android.material.button.MaterialButtonHelper r0 = r1.materialButtonHelper
            r0.setInsetBottom(r2)
            return
    }

    public void setInsetTop(@androidx.annotation.Dimension int r2) {
            r1 = this;
            com.google.android.material.button.MaterialButtonHelper r0 = r1.materialButtonHelper
            r0.setInsetTop(r2)
            return
    }

    public void setInternalBackground(android.graphics.drawable.Drawable r1) {
            r0 = this;
            super.setBackgroundDrawable(r1)
            return
    }

    public void setOnPressedChangeListenerInternal(@androidx.annotation.Nullable com.google.android.material.button.MaterialButton.OnPressedChangeListener r1) {
            r0 = this;
            r0.onPressedChangeListenerInternal = r1
            return
    }

    @Override // android.view.View
    public void setPressed(boolean r2) {
            r1 = this;
            com.google.android.material.button.MaterialButton$OnPressedChangeListener r0 = r1.onPressedChangeListenerInternal
            if (r0 == 0) goto L7
            r0.onPressedChanged(r1, r2)
        L7:
            super.setPressed(r2)
            return
    }

    public void setRippleColor(@androidx.annotation.Nullable android.content.res.ColorStateList r2) {
            r1 = this;
            boolean r0 = r1.isUsingOriginalBackground()
            if (r0 == 0) goto Lb
            com.google.android.material.button.MaterialButtonHelper r0 = r1.materialButtonHelper
            r0.setRippleColor(r2)
        Lb:
            return
    }

    public void setRippleColorResource(@androidx.annotation.ColorRes int r2) {
            r1 = this;
            boolean r0 = r1.isUsingOriginalBackground()
            if (r0 == 0) goto L11
            android.content.Context r0 = r1.getContext()
            android.content.res.ColorStateList r2 = androidx.appcompat.content.res.AppCompatResources.getColorStateList(r0, r2)
            r1.setRippleColor(r2)
        L11:
            return
    }

    @Override // com.google.android.material.shape.Shapeable
    public void setShapeAppearanceModel(@androidx.annotation.NonNull com.google.android.material.shape.ShapeAppearanceModel r2) {
            r1 = this;
            boolean r0 = r1.isUsingOriginalBackground()
            if (r0 == 0) goto Lc
            com.google.android.material.button.MaterialButtonHelper r0 = r1.materialButtonHelper
            r0.setShapeAppearanceModel(r2)
            return
        Lc:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background."
            r2.<init>(r0)
            throw r2
    }

    public void setShouldDrawSurfaceColorStroke(boolean r2) {
            r1 = this;
            boolean r0 = r1.isUsingOriginalBackground()
            if (r0 == 0) goto Lb
            com.google.android.material.button.MaterialButtonHelper r0 = r1.materialButtonHelper
            r0.setShouldDrawSurfaceColorStroke(r2)
        Lb:
            return
    }

    public void setStrokeColor(@androidx.annotation.Nullable android.content.res.ColorStateList r2) {
            r1 = this;
            boolean r0 = r1.isUsingOriginalBackground()
            if (r0 == 0) goto Lb
            com.google.android.material.button.MaterialButtonHelper r0 = r1.materialButtonHelper
            r0.setStrokeColor(r2)
        Lb:
            return
    }

    public void setStrokeColorResource(@androidx.annotation.ColorRes int r2) {
            r1 = this;
            boolean r0 = r1.isUsingOriginalBackground()
            if (r0 == 0) goto L11
            android.content.Context r0 = r1.getContext()
            android.content.res.ColorStateList r2 = androidx.appcompat.content.res.AppCompatResources.getColorStateList(r0, r2)
            r1.setStrokeColor(r2)
        L11:
            return
    }

    public void setStrokeWidth(@androidx.annotation.Px int r2) {
            r1 = this;
            boolean r0 = r1.isUsingOriginalBackground()
            if (r0 == 0) goto Lb
            com.google.android.material.button.MaterialButtonHelper r0 = r1.materialButtonHelper
            r0.setStrokeWidth(r2)
        Lb:
            return
    }

    public void setStrokeWidthResource(@androidx.annotation.DimenRes int r2) {
            r1 = this;
            boolean r0 = r1.isUsingOriginalBackground()
            if (r0 == 0) goto L11
            android.content.res.Resources r0 = r1.getResources()
            int r2 = r0.getDimensionPixelSize(r2)
            r1.setStrokeWidth(r2)
        L11:
            return
    }

    @Override // androidx.appcompat.widget.AppCompatButton, androidx.core.view.TintableBackgroundView
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public void setSupportBackgroundTintList(@androidx.annotation.Nullable android.content.res.ColorStateList r2) {
            r1 = this;
            boolean r0 = r1.isUsingOriginalBackground()
            if (r0 == 0) goto Lc
            com.google.android.material.button.MaterialButtonHelper r0 = r1.materialButtonHelper
            r0.setSupportBackgroundTintList(r2)
            goto Lf
        Lc:
            super.setSupportBackgroundTintList(r2)
        Lf:
            return
    }

    @Override // androidx.appcompat.widget.AppCompatButton, androidx.core.view.TintableBackgroundView
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public void setSupportBackgroundTintMode(@androidx.annotation.Nullable android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            boolean r0 = r1.isUsingOriginalBackground()
            if (r0 == 0) goto Lc
            com.google.android.material.button.MaterialButtonHelper r0 = r1.materialButtonHelper
            r0.setSupportBackgroundTintMode(r2)
            goto Lf
        Lc:
            super.setSupportBackgroundTintMode(r2)
        Lf:
            return
    }

    @Override // android.view.View
    @androidx.annotation.RequiresApi(17)
    public void setTextAlignment(int r2) {
            r1 = this;
            super.setTextAlignment(r2)
            int r2 = r1.getMeasuredWidth()
            int r0 = r1.getMeasuredHeight()
            r1.updateIconPosition(r2, r0)
            return
    }

    public void setToggleCheckedStateOnClick(boolean r2) {
            r1 = this;
            com.google.android.material.button.MaterialButtonHelper r0 = r1.materialButtonHelper
            r0.setToggleCheckedStateOnClick(r2)
            return
    }

    @Override // android.widget.Checkable
    public void toggle() {
            r1 = this;
            boolean r0 = r1.checked
            r0 = r0 ^ 1
            r1.setChecked(r0)
            return
    }
}
