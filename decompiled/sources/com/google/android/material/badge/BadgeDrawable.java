package com.google.android.material.badge;

/* JADX INFO: loaded from: classes2.dex */
public class BadgeDrawable extends android.graphics.drawable.Drawable implements com.google.android.material.internal.TextDrawableHelper.TextDrawableDelegate {
    public static final int BOTTOM_END = 8388693;
    public static final int BOTTOM_START = 8388691;

    @androidx.annotation.StyleRes
    private static final int DEFAULT_STYLE = 0;

    @androidx.annotation.AttrRes
    private static final int DEFAULT_THEME_ATTR = 0;
    private static final int MAX_CIRCULAR_BADGE_NUMBER_COUNT = 9;
    public static final int TOP_END = 8388661;
    public static final int TOP_START = 8388659;

    @androidx.annotation.Nullable
    private java.lang.ref.WeakReference<android.view.View> anchorViewRef;

    @androidx.annotation.NonNull
    private final android.graphics.Rect badgeBounds;
    private float badgeCenterX;
    private float badgeCenterY;

    @androidx.annotation.NonNull
    private final java.lang.ref.WeakReference<android.content.Context> contextRef;
    private float cornerRadius;

    @androidx.annotation.Nullable
    private java.lang.ref.WeakReference<android.widget.FrameLayout> customBadgeParentRef;
    private float halfBadgeHeight;
    private float halfBadgeWidth;
    private int maxBadgeNumber;

    @androidx.annotation.NonNull
    private final com.google.android.material.shape.MaterialShapeDrawable shapeDrawable;

    @androidx.annotation.NonNull
    private final com.google.android.material.badge.BadgeState state;

    @androidx.annotation.NonNull
    private final com.google.android.material.internal.TextDrawableHelper textDrawableHelper;


    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface BadgeGravity {
    }

    static {
            int r0 = com.google.android.material.R.style.Widget_MaterialComponents_Badge
            com.google.android.material.badge.BadgeDrawable.DEFAULT_STYLE = r0
            int r0 = com.google.android.material.R.attr.badgeStyle
            com.google.android.material.badge.BadgeDrawable.DEFAULT_THEME_ATTR = r0
            return
    }

    private BadgeDrawable(@androidx.annotation.NonNull android.content.Context r8, @androidx.annotation.XmlRes int r9, @androidx.annotation.AttrRes int r10, @androidx.annotation.StyleRes int r11, @androidx.annotation.Nullable com.google.android.material.badge.BadgeState.State r12) {
            r7 = this;
            r7.<init>()
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r8)
            r7.contextRef = r0
            com.google.android.material.internal.ThemeEnforcement.checkMaterialTheme(r8)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r7.badgeBounds = r0
            com.google.android.material.shape.MaterialShapeDrawable r0 = new com.google.android.material.shape.MaterialShapeDrawable
            r0.<init>()
            r7.shapeDrawable = r0
            com.google.android.material.internal.TextDrawableHelper r0 = new com.google.android.material.internal.TextDrawableHelper
            r0.<init>(r7)
            r7.textDrawableHelper = r0
            android.text.TextPaint r0 = r0.getTextPaint()
            android.graphics.Paint$Align r1 = android.graphics.Paint.Align.CENTER
            r0.setTextAlign(r1)
            int r0 = com.google.android.material.R.style.TextAppearance_MaterialComponents_Badge
            r7.setTextAppearanceResource(r0)
            com.google.android.material.badge.BadgeState r0 = new com.google.android.material.badge.BadgeState
            r1 = r0
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r1.<init>(r2, r3, r4, r5, r6)
            r7.state = r0
            r7.restoreState()
            return
    }

    private void calculateCenterAndBounds(@androidx.annotation.NonNull android.content.Context r5, @androidx.annotation.NonNull android.graphics.Rect r6, @androidx.annotation.NonNull android.view.View r7) {
            r4 = this;
            int r0 = r4.getTotalVerticalOffsetForState()
            com.google.android.material.badge.BadgeState r1 = r4.state
            int r1 = r1.getBadgeGravity()
            r2 = 8388691(0x800053, float:1.175506E-38)
            if (r1 == r2) goto L1b
            r3 = 8388693(0x800055, float:1.1755063E-38)
            if (r1 == r3) goto L1b
            int r1 = r6.top
            int r1 = r1 + r0
            float r0 = (float) r1
            r4.badgeCenterY = r0
            goto L21
        L1b:
            int r1 = r6.bottom
            int r1 = r1 - r0
            float r0 = (float) r1
            r4.badgeCenterY = r0
        L21:
            int r0 = r4.getNumber()
            r1 = 9
            if (r0 > r1) goto L3f
            boolean r0 = r4.hasNumber()
            if (r0 != 0) goto L34
            com.google.android.material.badge.BadgeState r0 = r4.state
            float r0 = r0.badgeRadius
            goto L38
        L34:
            com.google.android.material.badge.BadgeState r0 = r4.state
            float r0 = r0.badgeWithTextRadius
        L38:
            r4.cornerRadius = r0
            r4.halfBadgeHeight = r0
            r4.halfBadgeWidth = r0
            goto L5b
        L3f:
            com.google.android.material.badge.BadgeState r0 = r4.state
            float r0 = r0.badgeWithTextRadius
            r4.cornerRadius = r0
            r4.halfBadgeHeight = r0
            java.lang.String r0 = r4.getBadgeText()
            com.google.android.material.internal.TextDrawableHelper r1 = r4.textDrawableHelper
            float r0 = r1.getTextWidth(r0)
            r1 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r1
            com.google.android.material.badge.BadgeState r1 = r4.state
            float r1 = r1.badgeWidePadding
            float r0 = r0 + r1
            r4.halfBadgeWidth = r0
        L5b:
            android.content.res.Resources r5 = r5.getResources()
            boolean r0 = r4.hasNumber()
            if (r0 == 0) goto L68
            int r0 = com.google.android.material.R.dimen.mtrl_badge_text_horizontal_edge_offset
            goto L6a
        L68:
            int r0 = com.google.android.material.R.dimen.mtrl_badge_horizontal_edge_offset
        L6a:
            int r5 = r5.getDimensionPixelSize(r0)
            int r0 = r4.getTotalHorizontalOffsetForState()
            com.google.android.material.badge.BadgeState r1 = r4.state
            int r1 = r1.getBadgeGravity()
            r3 = 8388659(0x800033, float:1.1755015E-38)
            if (r1 == r3) goto L9d
            if (r1 == r2) goto L9d
            int r7 = androidx.core.view.ViewCompat.getLayoutDirection(r7)
            if (r7 != 0) goto L90
            int r6 = r6.right
            float r6 = (float) r6
            float r7 = r4.halfBadgeWidth
            float r6 = r6 + r7
            float r5 = (float) r5
            float r6 = r6 - r5
            float r5 = (float) r0
            float r6 = r6 - r5
            goto L9a
        L90:
            int r6 = r6.left
            float r6 = (float) r6
            float r7 = r4.halfBadgeWidth
            float r6 = r6 - r7
            float r5 = (float) r5
            float r6 = r6 + r5
            float r5 = (float) r0
            float r6 = r6 + r5
        L9a:
            r4.badgeCenterX = r6
            goto Lba
        L9d:
            int r7 = androidx.core.view.ViewCompat.getLayoutDirection(r7)
            if (r7 != 0) goto Lae
            int r6 = r6.left
            float r6 = (float) r6
            float r7 = r4.halfBadgeWidth
            float r6 = r6 - r7
            float r5 = (float) r5
            float r6 = r6 + r5
            float r5 = (float) r0
            float r6 = r6 + r5
            goto Lb8
        Lae:
            int r6 = r6.right
            float r6 = (float) r6
            float r7 = r4.halfBadgeWidth
            float r6 = r6 + r7
            float r5 = (float) r5
            float r6 = r6 - r5
            float r5 = (float) r0
            float r6 = r6 - r5
        Lb8:
            r4.badgeCenterX = r6
        Lba:
            return
    }

    @androidx.annotation.NonNull
    public static com.google.android.material.badge.BadgeDrawable create(@androidx.annotation.NonNull android.content.Context r7) {
            com.google.android.material.badge.BadgeDrawable r6 = new com.google.android.material.badge.BadgeDrawable
            int r3 = com.google.android.material.badge.BadgeDrawable.DEFAULT_THEME_ATTR
            int r4 = com.google.android.material.badge.BadgeDrawable.DEFAULT_STYLE
            r2 = 0
            r5 = 0
            r0 = r6
            r1 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            return r6
    }

    @androidx.annotation.NonNull
    public static com.google.android.material.badge.BadgeDrawable createFromResource(@androidx.annotation.NonNull android.content.Context r7, @androidx.annotation.XmlRes int r8) {
            com.google.android.material.badge.BadgeDrawable r6 = new com.google.android.material.badge.BadgeDrawable
            int r3 = com.google.android.material.badge.BadgeDrawable.DEFAULT_THEME_ATTR
            int r4 = com.google.android.material.badge.BadgeDrawable.DEFAULT_STYLE
            r5 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            return r6
    }

    @androidx.annotation.NonNull
    public static com.google.android.material.badge.BadgeDrawable createFromSavedState(@androidx.annotation.NonNull android.content.Context r7, @androidx.annotation.NonNull com.google.android.material.badge.BadgeState.State r8) {
            com.google.android.material.badge.BadgeDrawable r6 = new com.google.android.material.badge.BadgeDrawable
            int r3 = com.google.android.material.badge.BadgeDrawable.DEFAULT_THEME_ATTR
            int r4 = com.google.android.material.badge.BadgeDrawable.DEFAULT_STYLE
            r2 = 0
            r0 = r6
            r1 = r7
            r5 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            return r6
    }

    private void drawText(android.graphics.Canvas r6) {
            r5 = this;
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            java.lang.String r1 = r5.getBadgeText()
            com.google.android.material.internal.TextDrawableHelper r2 = r5.textDrawableHelper
            android.text.TextPaint r2 = r2.getTextPaint()
            int r3 = r1.length()
            r4 = 0
            r2.getTextBounds(r1, r4, r3, r0)
            float r2 = r5.badgeCenterX
            float r3 = r5.badgeCenterY
            int r0 = r0.height()
            int r0 = r0 / 2
            float r0 = (float) r0
            float r3 = r3 + r0
            com.google.android.material.internal.TextDrawableHelper r0 = r5.textDrawableHelper
            android.text.TextPaint r0 = r0.getTextPaint()
            r6.drawText(r1, r2, r3, r0)
            return
    }

    @androidx.annotation.NonNull
    private java.lang.String getBadgeText() {
            r5 = this;
            int r0 = r5.getNumber()
            int r1 = r5.maxBadgeNumber
            if (r0 > r1) goto L1c
            com.google.android.material.badge.BadgeState r0 = r5.state
            java.util.Locale r0 = r0.getNumberLocale()
            java.text.NumberFormat r0 = java.text.NumberFormat.getInstance(r0)
            int r1 = r5.getNumber()
            long r1 = (long) r1
            java.lang.String r0 = r0.format(r1)
            return r0
        L1c:
            java.lang.ref.WeakReference<android.content.Context> r0 = r5.contextRef
            java.lang.Object r0 = r0.get()
            android.content.Context r0 = (android.content.Context) r0
            if (r0 != 0) goto L29
            java.lang.String r0 = ""
            return r0
        L29:
            com.google.android.material.badge.BadgeState r1 = r5.state
            java.util.Locale r1 = r1.getNumberLocale()
            int r2 = com.google.android.material.R.string.mtrl_exceed_max_badge_number_suffix
            java.lang.String r0 = r0.getString(r2)
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            int r4 = r5.maxBadgeNumber
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r2[r3] = r4
            r3 = 1
            java.lang.String r4 = "+"
            r2[r3] = r4
            java.lang.String r0 = java.lang.String.format(r1, r0, r2)
            return r0
    }

    private int getTotalHorizontalOffsetForState() {
            r2 = this;
            boolean r0 = r2.hasNumber()
            if (r0 == 0) goto Ld
            com.google.android.material.badge.BadgeState r0 = r2.state
            int r0 = r0.getHorizontalOffsetWithText()
            goto L13
        Ld:
            com.google.android.material.badge.BadgeState r0 = r2.state
            int r0 = r0.getHorizontalOffsetWithoutText()
        L13:
            com.google.android.material.badge.BadgeState r1 = r2.state
            int r1 = r1.getAdditionalHorizontalOffset()
            int r1 = r1 + r0
            return r1
    }

    private int getTotalVerticalOffsetForState() {
            r2 = this;
            boolean r0 = r2.hasNumber()
            if (r0 == 0) goto Ld
            com.google.android.material.badge.BadgeState r0 = r2.state
            int r0 = r0.getVerticalOffsetWithText()
            goto L13
        Ld:
            com.google.android.material.badge.BadgeState r0 = r2.state
            int r0 = r0.getVerticalOffsetWithoutText()
        L13:
            com.google.android.material.badge.BadgeState r1 = r2.state
            int r1 = r1.getAdditionalVerticalOffset()
            int r1 = r1 + r0
            return r1
    }

    private void onAlphaUpdated() {
            r2 = this;
            com.google.android.material.internal.TextDrawableHelper r0 = r2.textDrawableHelper
            android.text.TextPaint r0 = r0.getTextPaint()
            int r1 = r2.getAlpha()
            r0.setAlpha(r1)
            r2.invalidateSelf()
            return
    }

    private void onBackgroundColorUpdated() {
            r2 = this;
            com.google.android.material.badge.BadgeState r0 = r2.state
            int r0 = r0.getBackgroundColor()
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            com.google.android.material.shape.MaterialShapeDrawable r1 = r2.shapeDrawable
            android.content.res.ColorStateList r1 = r1.getFillColor()
            if (r1 == r0) goto L1a
            com.google.android.material.shape.MaterialShapeDrawable r1 = r2.shapeDrawable
            r1.setFillColor(r0)
            r2.invalidateSelf()
        L1a:
            return
    }

    private void onBadgeGravityUpdated() {
            r2 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r2.anchorViewRef
            if (r0 == 0) goto L21
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto L21
            java.lang.ref.WeakReference<android.view.View> r0 = r2.anchorViewRef
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            java.lang.ref.WeakReference<android.widget.FrameLayout> r1 = r2.customBadgeParentRef
            if (r1 == 0) goto L1d
            java.lang.Object r1 = r1.get()
            android.widget.FrameLayout r1 = (android.widget.FrameLayout) r1
            goto L1e
        L1d:
            r1 = 0
        L1e:
            r2.updateBadgeCoordinates(r0, r1)
        L21:
            return
    }

    private void onBadgeTextColorUpdated() {
            r2 = this;
            com.google.android.material.internal.TextDrawableHelper r0 = r2.textDrawableHelper
            android.text.TextPaint r0 = r0.getTextPaint()
            com.google.android.material.badge.BadgeState r1 = r2.state
            int r1 = r1.getBadgeTextColor()
            r0.setColor(r1)
            r2.invalidateSelf()
            return
    }

    private void onMaxCharacterCountUpdated() {
            r2 = this;
            r2.updateMaxBadgeNumber()
            com.google.android.material.internal.TextDrawableHelper r0 = r2.textDrawableHelper
            r1 = 1
            r0.setTextWidthDirty(r1)
            r2.updateCenterAndBounds()
            r2.invalidateSelf()
            return
    }

    private void onNumberUpdated() {
            r2 = this;
            com.google.android.material.internal.TextDrawableHelper r0 = r2.textDrawableHelper
            r1 = 1
            r0.setTextWidthDirty(r1)
            r2.updateCenterAndBounds()
            r2.invalidateSelf()
            return
    }

    private void onVisibilityUpdated() {
            r2 = this;
            com.google.android.material.badge.BadgeState r0 = r2.state
            boolean r0 = r0.isVisible()
            r1 = 0
            r2.setVisible(r0, r1)
            boolean r1 = com.google.android.material.badge.BadgeUtils.USE_COMPAT_PARENT
            if (r1 == 0) goto L23
            android.widget.FrameLayout r1 = r2.getCustomBadgeParent()
            if (r1 == 0) goto L23
            if (r0 != 0) goto L23
            android.widget.FrameLayout r0 = r2.getCustomBadgeParent()
            android.view.ViewParent r0 = r0.getParent()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r0.invalidate()
        L23:
            return
    }

    private void restoreState() {
            r0 = this;
            r0.onMaxCharacterCountUpdated()
            r0.onNumberUpdated()
            r0.onAlphaUpdated()
            r0.onBackgroundColorUpdated()
            r0.onBadgeTextColorUpdated()
            r0.onBadgeGravityUpdated()
            r0.updateCenterAndBounds()
            r0.onVisibilityUpdated()
            return
    }

    private void setTextAppearance(@androidx.annotation.Nullable com.google.android.material.resources.TextAppearance r3) {
            r2 = this;
            com.google.android.material.internal.TextDrawableHelper r0 = r2.textDrawableHelper
            com.google.android.material.resources.TextAppearance r0 = r0.getTextAppearance()
            if (r0 != r3) goto L9
            return
        L9:
            java.lang.ref.WeakReference<android.content.Context> r0 = r2.contextRef
            java.lang.Object r0 = r0.get()
            android.content.Context r0 = (android.content.Context) r0
            if (r0 != 0) goto L14
            return
        L14:
            com.google.android.material.internal.TextDrawableHelper r1 = r2.textDrawableHelper
            r1.setTextAppearance(r3, r0)
            r2.updateCenterAndBounds()
            return
    }

    private void setTextAppearanceResource(@androidx.annotation.StyleRes int r3) {
            r2 = this;
            java.lang.ref.WeakReference<android.content.Context> r0 = r2.contextRef
            java.lang.Object r0 = r0.get()
            android.content.Context r0 = (android.content.Context) r0
            if (r0 != 0) goto Lb
            return
        Lb:
            com.google.android.material.resources.TextAppearance r1 = new com.google.android.material.resources.TextAppearance
            r1.<init>(r0, r3)
            r2.setTextAppearance(r1)
            return
    }

    private void tryWrapAnchorInCompatParent(android.view.View r6) {
            r5 = this;
            android.view.ViewParent r0 = r6.getParent()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            if (r0 == 0) goto L10
            int r1 = r0.getId()
            int r2 = com.google.android.material.R.id.mtrl_anchor_parent
            if (r1 == r2) goto L1a
        L10:
            java.lang.ref.WeakReference<android.widget.FrameLayout> r1 = r5.customBadgeParentRef
            if (r1 == 0) goto L1b
            java.lang.Object r1 = r1.get()
            if (r1 != r0) goto L1b
        L1a:
            return
        L1b:
            updateAnchorParentToNotClip(r6)
            android.widget.FrameLayout r1 = new android.widget.FrameLayout
            android.content.Context r2 = r6.getContext()
            r1.<init>(r2)
            int r2 = com.google.android.material.R.id.mtrl_anchor_parent
            r1.setId(r2)
            r2 = 0
            r1.setClipChildren(r2)
            r1.setClipToPadding(r2)
            android.view.ViewGroup$LayoutParams r2 = r6.getLayoutParams()
            r1.setLayoutParams(r2)
            int r2 = r6.getWidth()
            r1.setMinimumWidth(r2)
            int r2 = r6.getHeight()
            r1.setMinimumHeight(r2)
            int r2 = r0.indexOfChild(r6)
            r0.removeViewAt(r2)
            android.widget.FrameLayout$LayoutParams r3 = new android.widget.FrameLayout$LayoutParams
            r4 = -1
            r3.<init>(r4, r4)
            r6.setLayoutParams(r3)
            r1.addView(r6)
            r0.addView(r1, r2)
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r1)
            r5.customBadgeParentRef = r0
            com.google.android.material.badge.BadgeDrawable$1 r0 = new com.google.android.material.badge.BadgeDrawable$1
            r0.<init>(r5, r6, r1)
            r1.post(r0)
            return
    }

    private static void updateAnchorParentToNotClip(android.view.View r1) {
            android.view.ViewParent r1 = r1.getParent()
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r0 = 0
            r1.setClipChildren(r0)
            r1.setClipToPadding(r0)
            return
    }

    private void updateCenterAndBounds() {
            r6 = this;
            java.lang.ref.WeakReference<android.content.Context> r0 = r6.contextRef
            java.lang.Object r0 = r0.get()
            android.content.Context r0 = (android.content.Context) r0
            java.lang.ref.WeakReference<android.view.View> r1 = r6.anchorViewRef
            r2 = 0
            if (r1 == 0) goto L14
            java.lang.Object r1 = r1.get()
            android.view.View r1 = (android.view.View) r1
            goto L15
        L14:
            r1 = r2
        L15:
            if (r0 == 0) goto L6d
            if (r1 != 0) goto L1a
            goto L6d
        L1a:
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
            android.graphics.Rect r4 = r6.badgeBounds
            r3.set(r4)
            android.graphics.Rect r4 = new android.graphics.Rect
            r4.<init>()
            r1.getDrawingRect(r4)
            java.lang.ref.WeakReference<android.widget.FrameLayout> r5 = r6.customBadgeParentRef
            if (r5 == 0) goto L36
            java.lang.Object r2 = r5.get()
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
        L36:
            if (r2 != 0) goto L3c
            boolean r5 = com.google.android.material.badge.BadgeUtils.USE_COMPAT_PARENT
            if (r5 == 0) goto L47
        L3c:
            if (r2 != 0) goto L44
            android.view.ViewParent r2 = r1.getParent()
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
        L44:
            r2.offsetDescendantRectToMyCoords(r1, r4)
        L47:
            r6.calculateCenterAndBounds(r0, r4, r1)
            android.graphics.Rect r0 = r6.badgeBounds
            float r1 = r6.badgeCenterX
            float r2 = r6.badgeCenterY
            float r4 = r6.halfBadgeWidth
            float r5 = r6.halfBadgeHeight
            com.google.android.material.badge.BadgeUtils.updateBadgeBounds(r0, r1, r2, r4, r5)
            com.google.android.material.shape.MaterialShapeDrawable r0 = r6.shapeDrawable
            float r1 = r6.cornerRadius
            r0.setCornerSize(r1)
            android.graphics.Rect r0 = r6.badgeBounds
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L6d
            com.google.android.material.shape.MaterialShapeDrawable r0 = r6.shapeDrawable
            android.graphics.Rect r1 = r6.badgeBounds
            r0.setBounds(r1)
        L6d:
            return
    }

    private void updateMaxBadgeNumber() {
            r4 = this;
            int r0 = r4.getMaxCharacterCount()
            double r0 = (double) r0
            r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r0 = r0 - r2
            r2 = 4621819117588971520(0x4024000000000000, double:10.0)
            double r0 = java.lang.Math.pow(r2, r0)
            int r0 = (int) r0
            int r0 = r0 + (-1)
            r4.maxBadgeNumber = r0
            return
    }

    public void clearNumber() {
            r1 = this;
            boolean r0 = r1.hasNumber()
            if (r0 == 0) goto Le
            com.google.android.material.badge.BadgeState r0 = r1.state
            r0.clearNumber()
            r1.onNumberUpdated()
        Le:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@androidx.annotation.NonNull android.graphics.Canvas r2) {
            r1 = this;
            android.graphics.Rect r0 = r1.getBounds()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L25
            int r0 = r1.getAlpha()
            if (r0 == 0) goto L25
            boolean r0 = r1.isVisible()
            if (r0 != 0) goto L17
            goto L25
        L17:
            com.google.android.material.shape.MaterialShapeDrawable r0 = r1.shapeDrawable
            r0.draw(r2)
            boolean r0 = r1.hasNumber()
            if (r0 == 0) goto L25
            r1.drawText(r2)
        L25:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
            r1 = this;
            com.google.android.material.badge.BadgeState r0 = r1.state
            int r0 = r0.getAlpha()
            return r0
    }

    @androidx.annotation.ColorInt
    public int getBackgroundColor() {
            r1 = this;
            com.google.android.material.shape.MaterialShapeDrawable r0 = r1.shapeDrawable
            android.content.res.ColorStateList r0 = r0.getFillColor()
            int r0 = r0.getDefaultColor()
            return r0
    }

    public int getBadgeGravity() {
            r1 = this;
            com.google.android.material.badge.BadgeState r0 = r1.state
            int r0 = r0.getBadgeGravity()
            return r0
    }

    @androidx.annotation.NonNull
    public java.util.Locale getBadgeNumberLocale() {
            r1 = this;
            com.google.android.material.badge.BadgeState r0 = r1.state
            java.util.Locale r0 = r0.getNumberLocale()
            return r0
    }

    @androidx.annotation.ColorInt
    public int getBadgeTextColor() {
            r1 = this;
            com.google.android.material.internal.TextDrawableHelper r0 = r1.textDrawableHelper
            android.text.TextPaint r0 = r0.getTextPaint()
            int r0 = r0.getColor()
            return r0
    }

    @androidx.annotation.Nullable
    public java.lang.CharSequence getContentDescription() {
            r6 = this;
            boolean r0 = r6.isVisible()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            boolean r0 = r6.hasNumber()
            if (r0 == 0) goto L60
            com.google.android.material.badge.BadgeState r0 = r6.state
            int r0 = r0.getContentDescriptionQuantityStrings()
            if (r0 == 0) goto L5f
            java.lang.ref.WeakReference<android.content.Context> r0 = r6.contextRef
            java.lang.Object r0 = r0.get()
            android.content.Context r0 = (android.content.Context) r0
            if (r0 != 0) goto L21
            return r1
        L21:
            int r1 = r6.getNumber()
            int r2 = r6.maxBadgeNumber
            r3 = 0
            r4 = 1
            if (r1 > r2) goto L4a
            android.content.res.Resources r0 = r0.getResources()
            com.google.android.material.badge.BadgeState r1 = r6.state
            int r1 = r1.getContentDescriptionQuantityStrings()
            int r2 = r6.getNumber()
            java.lang.Object[] r4 = new java.lang.Object[r4]
            int r5 = r6.getNumber()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4[r3] = r5
            java.lang.String r0 = r0.getQuantityString(r1, r2, r4)
            return r0
        L4a:
            com.google.android.material.badge.BadgeState r1 = r6.state
            int r1 = r1.getContentDescriptionExceedsMaxBadgeNumberStringResource()
            java.lang.Object[] r2 = new java.lang.Object[r4]
            int r4 = r6.maxBadgeNumber
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r2[r3] = r4
            java.lang.String r0 = r0.getString(r1, r2)
            return r0
        L5f:
            return r1
        L60:
            com.google.android.material.badge.BadgeState r0 = r6.state
            java.lang.CharSequence r0 = r0.getContentDescriptionNumberless()
            return r0
    }

    @androidx.annotation.Nullable
    public android.widget.FrameLayout getCustomBadgeParent() {
            r1 = this;
            java.lang.ref.WeakReference<android.widget.FrameLayout> r0 = r1.customBadgeParentRef
            if (r0 == 0) goto Lb
            java.lang.Object r0 = r0.get()
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            goto Lc
        Lb:
            r0 = 0
        Lc:
            return r0
    }

    public int getHorizontalOffset() {
            r1 = this;
            com.google.android.material.badge.BadgeState r0 = r1.state
            int r0 = r0.getHorizontalOffsetWithoutText()
            return r0
    }

    @androidx.annotation.Px
    public int getHorizontalOffsetWithText() {
            r1 = this;
            com.google.android.material.badge.BadgeState r0 = r1.state
            int r0 = r0.getHorizontalOffsetWithText()
            return r0
    }

    @androidx.annotation.Px
    public int getHorizontalOffsetWithoutText() {
            r1 = this;
            com.google.android.material.badge.BadgeState r0 = r1.state
            int r0 = r0.getHorizontalOffsetWithoutText()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
            r1 = this;
            android.graphics.Rect r0 = r1.badgeBounds
            int r0 = r0.height()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
            r1 = this;
            android.graphics.Rect r0 = r1.badgeBounds
            int r0 = r0.width()
            return r0
    }

    public int getMaxCharacterCount() {
            r1 = this;
            com.google.android.material.badge.BadgeState r0 = r1.state
            int r0 = r0.getMaxCharacterCount()
            return r0
    }

    public int getNumber() {
            r1 = this;
            boolean r0 = r1.hasNumber()
            if (r0 == 0) goto Ld
            com.google.android.material.badge.BadgeState r0 = r1.state
            int r0 = r0.getNumber()
            goto Le
        Ld:
            r0 = 0
        Le:
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
            r1 = this;
            r0 = -3
            return r0
    }

    @androidx.annotation.NonNull
    public final com.google.android.material.badge.BadgeState.State getSavedState() {
            r1 = this;
            com.google.android.material.badge.BadgeState r0 = r1.state
            com.google.android.material.badge.BadgeState$State r0 = r0.getOverridingState()
            return r0
    }

    public int getVerticalOffset() {
            r1 = this;
            com.google.android.material.badge.BadgeState r0 = r1.state
            int r0 = r0.getVerticalOffsetWithoutText()
            return r0
    }

    @androidx.annotation.Px
    public int getVerticalOffsetWithText() {
            r1 = this;
            com.google.android.material.badge.BadgeState r0 = r1.state
            int r0 = r0.getVerticalOffsetWithText()
            return r0
    }

    @androidx.annotation.Px
    public int getVerticalOffsetWithoutText() {
            r1 = this;
            com.google.android.material.badge.BadgeState r0 = r1.state
            int r0 = r0.getVerticalOffsetWithoutText()
            return r0
    }

    public boolean hasNumber() {
            r1 = this;
            com.google.android.material.badge.BadgeState r0 = r1.state
            boolean r0 = r0.hasNumber()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // android.graphics.drawable.Drawable, com.google.android.material.internal.TextDrawableHelper.TextDrawableDelegate
    public boolean onStateChange(int[] r1) {
            r0 = this;
            boolean r1 = super.onStateChange(r1)
            return r1
    }

    @Override // com.google.android.material.internal.TextDrawableHelper.TextDrawableDelegate
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public void onTextSizeChange() {
            r0 = this;
            r0.invalidateSelf()
            return
    }

    public final void setAdditionalHorizontalOffset(int r2) {
            r1 = this;
            com.google.android.material.badge.BadgeState r0 = r1.state
            r0.setAdditionalHorizontalOffset(r2)
            r1.updateCenterAndBounds()
            return
    }

    public final void setAdditionalVerticalOffset(@androidx.annotation.Px int r2) {
            r1 = this;
            com.google.android.material.badge.BadgeState r0 = r1.state
            r0.setAdditionalVerticalOffset(r2)
            r1.updateCenterAndBounds()
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int r2) {
            r1 = this;
            com.google.android.material.badge.BadgeState r0 = r1.state
            r0.setAlpha(r2)
            r1.onAlphaUpdated()
            return
    }

    public void setBackgroundColor(@androidx.annotation.ColorInt int r2) {
            r1 = this;
            com.google.android.material.badge.BadgeState r0 = r1.state
            r0.setBackgroundColor(r2)
            r1.onBackgroundColorUpdated()
            return
    }

    public void setBadgeGravity(int r2) {
            r1 = this;
            com.google.android.material.badge.BadgeState r0 = r1.state
            int r0 = r0.getBadgeGravity()
            if (r0 == r2) goto L10
            com.google.android.material.badge.BadgeState r0 = r1.state
            r0.setBadgeGravity(r2)
            r1.onBadgeGravityUpdated()
        L10:
            return
    }

    public void setBadgeNumberLocale(@androidx.annotation.NonNull java.util.Locale r2) {
            r1 = this;
            com.google.android.material.badge.BadgeState r0 = r1.state
            java.util.Locale r0 = r0.getNumberLocale()
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L14
            com.google.android.material.badge.BadgeState r0 = r1.state
            r0.setNumberLocale(r2)
            r1.invalidateSelf()
        L14:
            return
    }

    public void setBadgeTextColor(@androidx.annotation.ColorInt int r2) {
            r1 = this;
            com.google.android.material.internal.TextDrawableHelper r0 = r1.textDrawableHelper
            android.text.TextPaint r0 = r0.getTextPaint()
            int r0 = r0.getColor()
            if (r0 == r2) goto L14
            com.google.android.material.badge.BadgeState r0 = r1.state
            r0.setBadgeTextColor(r2)
            r1.onBadgeTextColorUpdated()
        L14:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter r1) {
            r0 = this;
            return
    }

    public void setContentDescriptionExceedsMaxBadgeNumberStringResource(@androidx.annotation.StringRes int r2) {
            r1 = this;
            com.google.android.material.badge.BadgeState r0 = r1.state
            r0.setContentDescriptionExceedsMaxBadgeNumberStringResource(r2)
            return
    }

    public void setContentDescriptionNumberless(java.lang.CharSequence r2) {
            r1 = this;
            com.google.android.material.badge.BadgeState r0 = r1.state
            r0.setContentDescriptionNumberless(r2)
            return
    }

    public void setContentDescriptionQuantityStringsResource(@androidx.annotation.PluralsRes int r2) {
            r1 = this;
            com.google.android.material.badge.BadgeState r0 = r1.state
            r0.setContentDescriptionQuantityStringsResource(r2)
            return
    }

    public void setHorizontalOffset(int r1) {
            r0 = this;
            r0.setHorizontalOffsetWithoutText(r1)
            r0.setHorizontalOffsetWithText(r1)
            return
    }

    public void setHorizontalOffsetWithText(@androidx.annotation.Px int r2) {
            r1 = this;
            com.google.android.material.badge.BadgeState r0 = r1.state
            r0.setHorizontalOffsetWithText(r2)
            r1.updateCenterAndBounds()
            return
    }

    public void setHorizontalOffsetWithoutText(@androidx.annotation.Px int r2) {
            r1 = this;
            com.google.android.material.badge.BadgeState r0 = r1.state
            r0.setHorizontalOffsetWithoutText(r2)
            r1.updateCenterAndBounds()
            return
    }

    public void setMaxCharacterCount(int r2) {
            r1 = this;
            com.google.android.material.badge.BadgeState r0 = r1.state
            int r0 = r0.getMaxCharacterCount()
            if (r0 == r2) goto L10
            com.google.android.material.badge.BadgeState r0 = r1.state
            r0.setMaxCharacterCount(r2)
            r1.onMaxCharacterCountUpdated()
        L10:
            return
    }

    public void setNumber(int r2) {
            r1 = this;
            r0 = 0
            int r2 = java.lang.Math.max(r0, r2)
            com.google.android.material.badge.BadgeState r0 = r1.state
            int r0 = r0.getNumber()
            if (r0 == r2) goto L15
            com.google.android.material.badge.BadgeState r0 = r1.state
            r0.setNumber(r2)
            r1.onNumberUpdated()
        L15:
            return
    }

    public void setVerticalOffset(int r1) {
            r0 = this;
            r0.setVerticalOffsetWithoutText(r1)
            r0.setVerticalOffsetWithText(r1)
            return
    }

    public void setVerticalOffsetWithText(@androidx.annotation.Px int r2) {
            r1 = this;
            com.google.android.material.badge.BadgeState r0 = r1.state
            r0.setVerticalOffsetWithText(r2)
            r1.updateCenterAndBounds()
            return
    }

    public void setVerticalOffsetWithoutText(@androidx.annotation.Px int r2) {
            r1 = this;
            com.google.android.material.badge.BadgeState r0 = r1.state
            r0.setVerticalOffsetWithoutText(r2)
            r1.updateCenterAndBounds()
            return
    }

    public void setVisible(boolean r2) {
            r1 = this;
            com.google.android.material.badge.BadgeState r0 = r1.state
            r0.setVisible(r2)
            r1.onVisibilityUpdated()
            return
    }

    public void updateBadgeCoordinates(@androidx.annotation.NonNull android.view.View r2) {
            r1 = this;
            r0 = 0
            r1.updateBadgeCoordinates(r2, r0)
            return
    }

    @java.lang.Deprecated
    public void updateBadgeCoordinates(@androidx.annotation.NonNull android.view.View r2, @androidx.annotation.Nullable android.view.ViewGroup r3) {
            r1 = this;
            boolean r0 = r3 instanceof android.widget.FrameLayout
            if (r0 == 0) goto La
            android.widget.FrameLayout r3 = (android.widget.FrameLayout) r3
            r1.updateBadgeCoordinates(r2, r3)
            return
        La:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "customBadgeParent must be a FrameLayout"
            r2.<init>(r3)
            throw r2
    }

    public void updateBadgeCoordinates(@androidx.annotation.NonNull android.view.View r3, @androidx.annotation.Nullable android.widget.FrameLayout r4) {
            r2 = this;
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r3)
            r2.anchorViewRef = r0
            boolean r0 = com.google.android.material.badge.BadgeUtils.USE_COMPAT_PARENT
            if (r0 == 0) goto L11
            if (r4 != 0) goto L11
            r2.tryWrapAnchorInCompatParent(r3)
            goto L18
        L11:
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r1.<init>(r4)
            r2.customBadgeParentRef = r1
        L18:
            if (r0 != 0) goto L1d
            updateAnchorParentToNotClip(r3)
        L1d:
            r2.updateCenterAndBounds()
            r2.invalidateSelf()
            return
    }
}
