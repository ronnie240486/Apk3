package com.google.android.material.card;

/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
class MaterialCardViewHelper {
    private static final float CARD_VIEW_SHADOW_MULTIPLIER = 1.5f;
    private static final int CHECKED_ICON_LAYER_INDEX = 2;
    private static final android.graphics.drawable.Drawable CHECKED_ICON_NONE = null;
    private static final double COS_45 = 0.0d;
    public static final int DEFAULT_FADE_ANIM_DURATION = 300;
    private static final int DEFAULT_STROKE_VALUE = -1;

    @androidx.annotation.NonNull
    private final com.google.android.material.shape.MaterialShapeDrawable bgDrawable;
    private boolean checkable;
    private float checkedAnimationProgress;

    @androidx.annotation.Nullable
    private android.graphics.drawable.Drawable checkedIcon;
    private int checkedIconGravity;

    @androidx.annotation.Dimension
    private int checkedIconMargin;

    @androidx.annotation.Dimension
    private int checkedIconSize;

    @androidx.annotation.Nullable
    private android.content.res.ColorStateList checkedIconTint;

    @androidx.annotation.Nullable
    private android.graphics.drawable.LayerDrawable clickableForegroundDrawable;

    @androidx.annotation.Nullable
    private com.google.android.material.shape.MaterialShapeDrawable compatRippleDrawable;

    @androidx.annotation.Nullable
    private android.graphics.drawable.Drawable fgDrawable;

    @androidx.annotation.NonNull
    private final com.google.android.material.shape.MaterialShapeDrawable foregroundContentDrawable;

    @androidx.annotation.Nullable
    private com.google.android.material.shape.MaterialShapeDrawable foregroundShapeDrawable;

    @androidx.annotation.Nullable
    private android.animation.ValueAnimator iconAnimator;
    private final android.animation.TimeInterpolator iconFadeAnimInterpolator;
    private final int iconFadeInAnimDuration;
    private final int iconFadeOutAnimDuration;
    private boolean isBackgroundOverwritten;

    @androidx.annotation.NonNull
    private final com.google.android.material.card.MaterialCardView materialCardView;

    @androidx.annotation.Nullable
    private android.content.res.ColorStateList rippleColor;

    @androidx.annotation.Nullable
    private android.graphics.drawable.Drawable rippleDrawable;

    @androidx.annotation.Nullable
    private com.google.android.material.shape.ShapeAppearanceModel shapeAppearanceModel;

    @androidx.annotation.Nullable
    private android.content.res.ColorStateList strokeColor;

    @androidx.annotation.Dimension
    private int strokeWidth;

    @androidx.annotation.NonNull
    private final android.graphics.Rect userContentPadding;


    public static /* synthetic */ void $r8$lambda$3WoItmtzfLszshWzhC1gtU5reVQ(com.google.android.material.card.MaterialCardViewHelper r0, android.animation.ValueAnimator r1) {
            r0.lambda$animateCheckedIcon$0(r1)
            return
    }

    static {
            r0 = 4631530004285489152(0x4046800000000000, double:45.0)
            double r0 = java.lang.Math.toRadians(r0)
            double r0 = java.lang.Math.cos(r0)
            com.google.android.material.card.MaterialCardViewHelper.COS_45 = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 > r1) goto L1b
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            r0.<init>()
            goto L1c
        L1b:
            r0 = 0
        L1c:
            com.google.android.material.card.MaterialCardViewHelper.CHECKED_ICON_NONE = r0
            return
    }

    public MaterialCardViewHelper(@androidx.annotation.NonNull com.google.android.material.card.MaterialCardView r5, android.util.AttributeSet r6, int r7, @androidx.annotation.StyleRes int r8) {
            r4 = this;
            r4.<init>()
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r4.userContentPadding = r0
            r0 = 0
            r4.isBackgroundOverwritten = r0
            r0 = 0
            r4.checkedAnimationProgress = r0
            r4.materialCardView = r5
            com.google.android.material.shape.MaterialShapeDrawable r1 = new com.google.android.material.shape.MaterialShapeDrawable
            android.content.Context r2 = r5.getContext()
            r1.<init>(r2, r6, r7, r8)
            r4.bgDrawable = r1
            android.content.Context r8 = r5.getContext()
            r1.initializeElevationOverlay(r8)
            r8 = -12303292(0xffffffffff444444, float:-2.6088314E38)
            r1.setShadowColor(r8)
            com.google.android.material.shape.ShapeAppearanceModel r8 = r1.getShapeAppearanceModel()
            com.google.android.material.shape.ShapeAppearanceModel$Builder r8 = r8.toBuilder()
            android.content.Context r1 = r5.getContext()
            int[] r2 = com.google.android.material.R.styleable.CardView
            int r3 = com.google.android.material.R.style.CardView
            android.content.res.TypedArray r6 = r1.obtainStyledAttributes(r6, r2, r7, r3)
            int r7 = com.google.android.material.R.styleable.CardView_cardCornerRadius
            boolean r1 = r6.hasValue(r7)
            if (r1 == 0) goto L4d
            float r7 = r6.getDimension(r7, r0)
            r8.setAllCornerSizes(r7)
        L4d:
            com.google.android.material.shape.MaterialShapeDrawable r7 = new com.google.android.material.shape.MaterialShapeDrawable
            r7.<init>()
            r4.foregroundContentDrawable = r7
            com.google.android.material.shape.ShapeAppearanceModel r7 = r8.build()
            r4.setShapeAppearanceModel(r7)
            android.content.Context r7 = r5.getContext()
            int r8 = com.google.android.material.R.attr.motionEasingLinearInterpolator
            android.animation.TimeInterpolator r0 = com.google.android.material.animation.AnimationUtils.LINEAR_INTERPOLATOR
            android.animation.TimeInterpolator r7 = com.google.android.material.motion.MotionUtils.resolveThemeInterpolator(r7, r8, r0)
            r4.iconFadeAnimInterpolator = r7
            android.content.Context r7 = r5.getContext()
            int r8 = com.google.android.material.R.attr.motionDurationShort2
            r0 = 300(0x12c, float:4.2E-43)
            int r7 = com.google.android.material.motion.MotionUtils.resolveThemeDuration(r7, r8, r0)
            r4.iconFadeInAnimDuration = r7
            android.content.Context r5 = r5.getContext()
            int r7 = com.google.android.material.R.attr.motionDurationShort1
            int r5 = com.google.android.material.motion.MotionUtils.resolveThemeDuration(r5, r7, r0)
            r4.iconFadeOutAnimDuration = r5
            r6.recycle()
            return
    }

    private float calculateActualCornerPadding() {
            r4 = this;
            com.google.android.material.shape.ShapeAppearanceModel r0 = r4.shapeAppearanceModel
            com.google.android.material.shape.CornerTreatment r0 = r0.getTopLeftCorner()
            com.google.android.material.shape.MaterialShapeDrawable r1 = r4.bgDrawable
            float r1 = r1.getTopLeftCornerResolvedSize()
            float r0 = r4.calculateCornerPaddingForCornerTreatment(r0, r1)
            com.google.android.material.shape.ShapeAppearanceModel r1 = r4.shapeAppearanceModel
            com.google.android.material.shape.CornerTreatment r1 = r1.getTopRightCorner()
            com.google.android.material.shape.MaterialShapeDrawable r2 = r4.bgDrawable
            float r2 = r2.getTopRightCornerResolvedSize()
            float r1 = r4.calculateCornerPaddingForCornerTreatment(r1, r2)
            float r0 = java.lang.Math.max(r0, r1)
            com.google.android.material.shape.ShapeAppearanceModel r1 = r4.shapeAppearanceModel
            com.google.android.material.shape.CornerTreatment r1 = r1.getBottomRightCorner()
            com.google.android.material.shape.MaterialShapeDrawable r2 = r4.bgDrawable
            float r2 = r2.getBottomRightCornerResolvedSize()
            float r1 = r4.calculateCornerPaddingForCornerTreatment(r1, r2)
            com.google.android.material.shape.ShapeAppearanceModel r2 = r4.shapeAppearanceModel
            com.google.android.material.shape.CornerTreatment r2 = r2.getBottomLeftCorner()
            com.google.android.material.shape.MaterialShapeDrawable r3 = r4.bgDrawable
            float r3 = r3.getBottomLeftCornerResolvedSize()
            float r2 = r4.calculateCornerPaddingForCornerTreatment(r2, r3)
            float r1 = java.lang.Math.max(r1, r2)
            float r0 = java.lang.Math.max(r0, r1)
            return r0
    }

    private float calculateCornerPaddingForCornerTreatment(com.google.android.material.shape.CornerTreatment r5, float r6) {
            r4 = this;
            boolean r0 = r5 instanceof com.google.android.material.shape.RoundedCornerTreatment
            if (r0 == 0) goto Le
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r2 = com.google.android.material.card.MaterialCardViewHelper.COS_45
            double r0 = r0 - r2
            double r5 = (double) r6
            double r0 = r0 * r5
            float r5 = (float) r0
            return r5
        Le:
            boolean r5 = r5 instanceof com.google.android.material.shape.CutCornerTreatment
            if (r5 == 0) goto L16
            r5 = 1073741824(0x40000000, float:2.0)
            float r6 = r6 / r5
            return r6
        L16:
            r5 = 0
            return r5
    }

    private float calculateHorizontalBackgroundPadding() {
            r2 = this;
            com.google.android.material.card.MaterialCardView r0 = r2.materialCardView
            float r0 = r0.getMaxCardElevation()
            boolean r1 = r2.shouldAddCornerPaddingOutsideCardBackground()
            if (r1 == 0) goto L11
            float r1 = r2.calculateActualCornerPadding()
            goto L12
        L11:
            r1 = 0
        L12:
            float r0 = r0 + r1
            return r0
    }

    private float calculateVerticalBackgroundPadding() {
            r2 = this;
            com.google.android.material.card.MaterialCardView r0 = r2.materialCardView
            float r0 = r0.getMaxCardElevation()
            r1 = 1069547520(0x3fc00000, float:1.5)
            float r0 = r0 * r1
            boolean r1 = r2.shouldAddCornerPaddingOutsideCardBackground()
            if (r1 == 0) goto L15
            float r1 = r2.calculateActualCornerPadding()
            goto L16
        L15:
            r1 = 0
        L16:
            float r0 = r0 + r1
            return r0
    }

    private boolean canClipToOutline() {
            r1 = this;
            com.google.android.material.shape.MaterialShapeDrawable r0 = r1.bgDrawable
            boolean r0 = r0.isRoundRect()
            if (r0 == 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }

    @androidx.annotation.NonNull
    private android.graphics.drawable.Drawable createCompatRippleDrawable() {
            r4 = this;
            android.graphics.drawable.StateListDrawable r0 = new android.graphics.drawable.StateListDrawable
            r0.<init>()
            com.google.android.material.shape.MaterialShapeDrawable r1 = r4.createForegroundShapeDrawable()
            r4.compatRippleDrawable = r1
            android.content.res.ColorStateList r2 = r4.rippleColor
            r1.setFillColor(r2)
            r1 = 1
            int[] r1 = new int[r1]
            r2 = 0
            r3 = 16842919(0x10100a7, float:2.3694026E-38)
            r1[r2] = r3
            com.google.android.material.shape.MaterialShapeDrawable r2 = r4.compatRippleDrawable
            r0.addState(r1, r2)
            return r0
    }

    @androidx.annotation.NonNull
    private android.graphics.drawable.Drawable createForegroundRippleDrawable() {
            r4 = this;
            boolean r0 = com.google.android.material.ripple.RippleUtils.USE_FRAMEWORK_RIPPLE
            if (r0 == 0) goto L15
            com.google.android.material.shape.MaterialShapeDrawable r0 = r4.createForegroundShapeDrawable()
            r4.foregroundShapeDrawable = r0
            android.graphics.drawable.RippleDrawable r0 = new android.graphics.drawable.RippleDrawable
            android.content.res.ColorStateList r1 = r4.rippleColor
            r2 = 0
            com.google.android.material.shape.MaterialShapeDrawable r3 = r4.foregroundShapeDrawable
            r0.<init>(r1, r2, r3)
            return r0
        L15:
            android.graphics.drawable.Drawable r0 = r4.createCompatRippleDrawable()
            return r0
    }

    @androidx.annotation.NonNull
    private com.google.android.material.shape.MaterialShapeDrawable createForegroundShapeDrawable() {
            r2 = this;
            com.google.android.material.shape.MaterialShapeDrawable r0 = new com.google.android.material.shape.MaterialShapeDrawable
            com.google.android.material.shape.ShapeAppearanceModel r1 = r2.shapeAppearanceModel
            r0.<init>(r1)
            return r0
    }

    @androidx.annotation.NonNull
    private android.graphics.drawable.Drawable getClickableForeground() {
            r4 = this;
            android.graphics.drawable.Drawable r0 = r4.rippleDrawable
            if (r0 != 0) goto La
            android.graphics.drawable.Drawable r0 = r4.createForegroundRippleDrawable()
            r4.rippleDrawable = r0
        La:
            android.graphics.drawable.LayerDrawable r0 = r4.clickableForegroundDrawable
            if (r0 != 0) goto L2c
            android.graphics.drawable.LayerDrawable r0 = new android.graphics.drawable.LayerDrawable
            r1 = 3
            android.graphics.drawable.Drawable[] r1 = new android.graphics.drawable.Drawable[r1]
            r2 = 0
            android.graphics.drawable.Drawable r3 = r4.rippleDrawable
            r1[r2] = r3
            r2 = 1
            com.google.android.material.shape.MaterialShapeDrawable r3 = r4.foregroundContentDrawable
            r1[r2] = r3
            android.graphics.drawable.Drawable r2 = r4.checkedIcon
            r3 = 2
            r1[r3] = r2
            r0.<init>(r1)
            r4.clickableForegroundDrawable = r0
            int r1 = com.google.android.material.R.id.mtrl_card_checked_layer_id
            r0.setId(r3, r1)
        L2c:
            android.graphics.drawable.LayerDrawable r0 = r4.clickableForegroundDrawable
            return r0
    }

    private float getParentCardViewCalculatedCornerPadding() {
            r4 = this;
            com.google.android.material.card.MaterialCardView r0 = r4.materialCardView
            boolean r0 = r0.getPreventCornerOverlap()
            if (r0 == 0) goto L20
            com.google.android.material.card.MaterialCardView r0 = r4.materialCardView
            boolean r0 = r0.getUseCompatPadding()
            if (r0 == 0) goto L20
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r2 = com.google.android.material.card.MaterialCardViewHelper.COS_45
            double r0 = r0 - r2
            com.google.android.material.card.MaterialCardView r2 = r4.materialCardView
            float r2 = r2.getCardViewRadius()
            double r2 = (double) r2
            double r0 = r0 * r2
            float r0 = (float) r0
            return r0
        L20:
            r0 = 0
            return r0
    }

    @androidx.annotation.NonNull
    private android.graphics.drawable.Drawable insetDrawable(android.graphics.drawable.Drawable r9) {
            r8 = this;
            com.google.android.material.card.MaterialCardView r0 = r8.materialCardView
            boolean r0 = r0.getUseCompatPadding()
            r1 = 0
            if (r0 == 0) goto L20
            float r0 = r8.calculateVerticalBackgroundPadding()
            double r0 = (double) r0
            double r0 = java.lang.Math.ceil(r0)
            int r1 = (int) r0
            float r0 = r8.calculateHorizontalBackgroundPadding()
            double r2 = (double) r0
            double r2 = java.lang.Math.ceil(r2)
            int r0 = (int) r2
            r6 = r0
            r7 = r1
            goto L22
        L20:
            r6 = 0
            r7 = 0
        L22:
            com.google.android.material.card.MaterialCardViewHelper$1 r0 = new com.google.android.material.card.MaterialCardViewHelper$1
            r2 = r0
            r3 = r9
            r4 = r6
            r5 = r7
            r2.<init>(r3, r4, r5, r6, r7)
            return r0
    }

    private boolean isCheckedIconBottom() {
            r2 = this;
            int r0 = r2.checkedIconGravity
            r1 = 80
            r0 = r0 & r1
            if (r0 != r1) goto L9
            r0 = 1
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    private boolean isCheckedIconEnd() {
            r2 = this;
            int r0 = r2.checkedIconGravity
            r1 = 8388613(0x800005, float:1.175495E-38)
            r0 = r0 & r1
            if (r0 != r1) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }

    private /* synthetic */ void lambda$animateCheckedIcon$0(android.animation.ValueAnimator r3) {
            r2 = this;
            java.lang.Object r3 = r3.getAnimatedValue()
            java.lang.Float r3 = (java.lang.Float) r3
            float r3 = r3.floatValue()
            r0 = 1132396544(0x437f0000, float:255.0)
            float r0 = r0 * r3
            int r0 = (int) r0
            android.graphics.drawable.Drawable r1 = r2.checkedIcon
            r1.setAlpha(r0)
            r2.checkedAnimationProgress = r3
            return
    }

    private boolean shouldAddCornerPaddingInsideCardBackground() {
            r1 = this;
            com.google.android.material.card.MaterialCardView r0 = r1.materialCardView
            boolean r0 = r0.getPreventCornerOverlap()
            if (r0 == 0) goto L10
            boolean r0 = r1.canClipToOutline()
            if (r0 != 0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            return r0
    }

    private boolean shouldAddCornerPaddingOutsideCardBackground() {
            r1 = this;
            com.google.android.material.card.MaterialCardView r0 = r1.materialCardView
            boolean r0 = r0.getPreventCornerOverlap()
            if (r0 == 0) goto L18
            boolean r0 = r1.canClipToOutline()
            if (r0 == 0) goto L18
            com.google.android.material.card.MaterialCardView r0 = r1.materialCardView
            boolean r0 = r0.getUseCompatPadding()
            if (r0 == 0) goto L18
            r0 = 1
            goto L19
        L18:
            r0 = 0
        L19:
            return r0
    }

    private void updateInsetForeground(android.graphics.drawable.Drawable r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto L1c
            com.google.android.material.card.MaterialCardView r0 = r2.materialCardView
            android.graphics.drawable.Drawable r0 = r0.getForeground()
            boolean r0 = r0 instanceof android.graphics.drawable.InsetDrawable
            if (r0 == 0) goto L1c
            com.google.android.material.card.MaterialCardView r0 = r2.materialCardView
            android.graphics.drawable.Drawable r0 = r0.getForeground()
            android.graphics.drawable.InsetDrawable r0 = (android.graphics.drawable.InsetDrawable) r0
            r0.setDrawable(r3)
            goto L25
        L1c:
            com.google.android.material.card.MaterialCardView r0 = r2.materialCardView
            android.graphics.drawable.Drawable r3 = r2.insetDrawable(r3)
            r0.setForeground(r3)
        L25:
            return
    }

    private void updateRippleColor() {
            r2 = this;
            boolean r0 = com.google.android.material.ripple.RippleUtils.USE_FRAMEWORK_RIPPLE
            if (r0 == 0) goto L10
            android.graphics.drawable.Drawable r0 = r2.rippleDrawable
            if (r0 == 0) goto L10
            android.graphics.drawable.RippleDrawable r0 = (android.graphics.drawable.RippleDrawable) r0
            android.content.res.ColorStateList r1 = r2.rippleColor
            r0.setColor(r1)
            goto L19
        L10:
            com.google.android.material.shape.MaterialShapeDrawable r0 = r2.compatRippleDrawable
            if (r0 == 0) goto L19
            android.content.res.ColorStateList r1 = r2.rippleColor
            r0.setFillColor(r1)
        L19:
            return
    }

    public void animateCheckedIcon(boolean r6) {
            r5 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r6 == 0) goto L7
            r1 = 1065353216(0x3f800000, float:1.0)
            goto L8
        L7:
            r1 = 0
        L8:
            if (r6 == 0) goto Le
            float r2 = r5.checkedAnimationProgress
            float r0 = r0 - r2
            goto L10
        Le:
            float r0 = r5.checkedAnimationProgress
        L10:
            android.animation.ValueAnimator r2 = r5.iconAnimator
            if (r2 == 0) goto L1a
            r2.cancel()
            r2 = 0
            r5.iconAnimator = r2
        L1a:
            r2 = 2
            float[] r2 = new float[r2]
            r3 = 0
            float r4 = r5.checkedAnimationProgress
            r2[r3] = r4
            r3 = 1
            r2[r3] = r1
            android.animation.ValueAnimator r1 = android.animation.ValueAnimator.ofFloat(r2)
            r5.iconAnimator = r1
            com.google.android.material.card.MaterialCardViewHelper$$ExternalSyntheticLambda0 r2 = new com.google.android.material.card.MaterialCardViewHelper$$ExternalSyntheticLambda0
            r2.<init>(r5)
            r1.addUpdateListener(r2)
            android.animation.ValueAnimator r1 = r5.iconAnimator
            android.animation.TimeInterpolator r2 = r5.iconFadeAnimInterpolator
            r1.setInterpolator(r2)
            android.animation.ValueAnimator r1 = r5.iconAnimator
            if (r6 == 0) goto L41
            int r6 = r5.iconFadeInAnimDuration
            goto L43
        L41:
            int r6 = r5.iconFadeOutAnimDuration
        L43:
            float r6 = (float) r6
            float r6 = r6 * r0
            long r2 = (long) r6
            r1.setDuration(r2)
            android.animation.ValueAnimator r6 = r5.iconAnimator
            r6.start()
            return
    }

    @androidx.annotation.RequiresApi(api = 23)
    public final void forceRippleRedraw() {
            r7 = this;
            android.graphics.drawable.Drawable r0 = r7.rippleDrawable
            if (r0 == 0) goto L22
            android.graphics.Rect r0 = r0.getBounds()
            int r1 = r0.bottom
            android.graphics.drawable.Drawable r2 = r7.rippleDrawable
            int r3 = r0.left
            int r4 = r0.top
            int r5 = r0.right
            int r6 = r1 + (-1)
            r2.setBounds(r3, r4, r5, r6)
            android.graphics.drawable.Drawable r2 = r7.rippleDrawable
            int r3 = r0.left
            int r4 = r0.top
            int r0 = r0.right
            r2.setBounds(r3, r4, r0, r1)
        L22:
            return
    }

    @androidx.annotation.NonNull
    public final com.google.android.material.shape.MaterialShapeDrawable getBackground() {
            r1 = this;
            com.google.android.material.shape.MaterialShapeDrawable r0 = r1.bgDrawable
            return r0
    }

    public final android.content.res.ColorStateList getCardBackgroundColor() {
            r1 = this;
            com.google.android.material.shape.MaterialShapeDrawable r0 = r1.bgDrawable
            android.content.res.ColorStateList r0 = r0.getFillColor()
            return r0
    }

    public final android.content.res.ColorStateList getCardForegroundColor() {
            r1 = this;
            com.google.android.material.shape.MaterialShapeDrawable r0 = r1.foregroundContentDrawable
            android.content.res.ColorStateList r0 = r0.getFillColor()
            return r0
    }

    @androidx.annotation.Nullable
    public final android.graphics.drawable.Drawable getCheckedIcon() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.checkedIcon
            return r0
    }

    public final int getCheckedIconGravity() {
            r1 = this;
            int r0 = r1.checkedIconGravity
            return r0
    }

    @androidx.annotation.Dimension
    public final int getCheckedIconMargin() {
            r1 = this;
            int r0 = r1.checkedIconMargin
            return r0
    }

    @androidx.annotation.Dimension
    public final int getCheckedIconSize() {
            r1 = this;
            int r0 = r1.checkedIconSize
            return r0
    }

    @androidx.annotation.Nullable
    public final android.content.res.ColorStateList getCheckedIconTint() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.checkedIconTint
            return r0
    }

    public final float getCornerRadius() {
            r1 = this;
            com.google.android.material.shape.MaterialShapeDrawable r0 = r1.bgDrawable
            float r0 = r0.getTopLeftCornerResolvedSize()
            return r0
    }

    @androidx.annotation.FloatRange(from = 0.0d, to = 1.0d)
    public final float getProgress() {
            r1 = this;
            com.google.android.material.shape.MaterialShapeDrawable r0 = r1.bgDrawable
            float r0 = r0.getInterpolation()
            return r0
    }

    @androidx.annotation.Nullable
    public final android.content.res.ColorStateList getRippleColor() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.rippleColor
            return r0
    }

    public final com.google.android.material.shape.ShapeAppearanceModel getShapeAppearanceModel() {
            r1 = this;
            com.google.android.material.shape.ShapeAppearanceModel r0 = r1.shapeAppearanceModel
            return r0
    }

    @androidx.annotation.ColorInt
    public final int getStrokeColor() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.strokeColor
            if (r0 != 0) goto L6
            r0 = -1
            goto La
        L6:
            int r0 = r0.getDefaultColor()
        La:
            return r0
    }

    @androidx.annotation.Nullable
    public final android.content.res.ColorStateList getStrokeColorStateList() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.strokeColor
            return r0
    }

    @androidx.annotation.Dimension
    public final int getStrokeWidth() {
            r1 = this;
            int r0 = r1.strokeWidth
            return r0
    }

    @androidx.annotation.NonNull
    public final android.graphics.Rect getUserContentPadding() {
            r1 = this;
            android.graphics.Rect r0 = r1.userContentPadding
            return r0
    }

    public final boolean isBackgroundOverwritten() {
            r1 = this;
            boolean r0 = r1.isBackgroundOverwritten
            return r0
    }

    public final boolean isCheckable() {
            r1 = this;
            boolean r0 = r1.checkable
            return r0
    }

    public final void loadFromAttributes(@androidx.annotation.NonNull android.content.res.TypedArray r4) {
            r3 = this;
            com.google.android.material.card.MaterialCardView r0 = r3.materialCardView
            android.content.Context r0 = r0.getContext()
            int r1 = com.google.android.material.R.styleable.MaterialCardView_strokeColor
            android.content.res.ColorStateList r0 = com.google.android.material.resources.MaterialResources.getColorStateList(r0, r4, r1)
            r3.strokeColor = r0
            if (r0 != 0) goto L17
            r0 = -1
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            r3.strokeColor = r0
        L17:
            int r0 = com.google.android.material.R.styleable.MaterialCardView_strokeWidth
            r1 = 0
            int r0 = r4.getDimensionPixelSize(r0, r1)
            r3.strokeWidth = r0
            int r0 = com.google.android.material.R.styleable.MaterialCardView_android_checkable
            boolean r0 = r4.getBoolean(r0, r1)
            r3.checkable = r0
            com.google.android.material.card.MaterialCardView r2 = r3.materialCardView
            r2.setLongClickable(r0)
            com.google.android.material.card.MaterialCardView r0 = r3.materialCardView
            android.content.Context r0 = r0.getContext()
            int r2 = com.google.android.material.R.styleable.MaterialCardView_checkedIconTint
            android.content.res.ColorStateList r0 = com.google.android.material.resources.MaterialResources.getColorStateList(r0, r4, r2)
            r3.checkedIconTint = r0
            com.google.android.material.card.MaterialCardView r0 = r3.materialCardView
            android.content.Context r0 = r0.getContext()
            int r2 = com.google.android.material.R.styleable.MaterialCardView_checkedIcon
            android.graphics.drawable.Drawable r0 = com.google.android.material.resources.MaterialResources.getDrawable(r0, r4, r2)
            r3.setCheckedIcon(r0)
            int r0 = com.google.android.material.R.styleable.MaterialCardView_checkedIconSize
            int r0 = r4.getDimensionPixelSize(r0, r1)
            r3.checkedIconSize = r0
            int r0 = com.google.android.material.R.styleable.MaterialCardView_checkedIconMargin
            int r0 = r4.getDimensionPixelSize(r0, r1)
            r3.checkedIconMargin = r0
            int r0 = com.google.android.material.R.styleable.MaterialCardView_checkedIconGravity
            r2 = 8388661(0x800035, float:1.1755018E-38)
            int r0 = r4.getInteger(r0, r2)
            r3.checkedIconGravity = r0
            com.google.android.material.card.MaterialCardView r0 = r3.materialCardView
            android.content.Context r0 = r0.getContext()
            int r2 = com.google.android.material.R.styleable.MaterialCardView_rippleColor
            android.content.res.ColorStateList r0 = com.google.android.material.resources.MaterialResources.getColorStateList(r0, r4, r2)
            r3.rippleColor = r0
            if (r0 != 0) goto L83
            com.google.android.material.card.MaterialCardView r0 = r3.materialCardView
            int r2 = com.google.android.material.R.attr.colorControlHighlight
            int r0 = com.google.android.material.color.MaterialColors.getColor(r0, r2)
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            r3.rippleColor = r0
        L83:
            com.google.android.material.card.MaterialCardView r0 = r3.materialCardView
            android.content.Context r0 = r0.getContext()
            int r2 = com.google.android.material.R.styleable.MaterialCardView_cardForegroundColor
            android.content.res.ColorStateList r4 = com.google.android.material.resources.MaterialResources.getColorStateList(r0, r4, r2)
            com.google.android.material.shape.MaterialShapeDrawable r0 = r3.foregroundContentDrawable
            if (r4 != 0) goto L97
            android.content.res.ColorStateList r4 = android.content.res.ColorStateList.valueOf(r1)
        L97:
            r0.setFillColor(r4)
            r3.updateRippleColor()
            com.google.android.material.shape.MaterialShapeDrawable r4 = r3.bgDrawable
            com.google.android.material.card.MaterialCardView r0 = r3.materialCardView
            float r0 = r0.getCardElevation()
            r4.setElevation(r0)
            r3.updateStroke()
            com.google.android.material.card.MaterialCardView r4 = r3.materialCardView
            com.google.android.material.shape.MaterialShapeDrawable r0 = r3.bgDrawable
            android.graphics.drawable.Drawable r0 = r3.insetDrawable(r0)
            r4.setBackgroundInternal(r0)
            com.google.android.material.card.MaterialCardView r4 = r3.materialCardView
            boolean r4 = r4.isClickable()
            if (r4 == 0) goto Lc3
            android.graphics.drawable.Drawable r4 = r3.getClickableForeground()
            goto Lc5
        Lc3:
            com.google.android.material.shape.MaterialShapeDrawable r4 = r3.foregroundContentDrawable
        Lc5:
            r3.fgDrawable = r4
            com.google.android.material.card.MaterialCardView r0 = r3.materialCardView
            android.graphics.drawable.Drawable r4 = r3.insetDrawable(r4)
            r0.setForeground(r4)
            return
    }

    public final void recalculateCheckedIconPosition(int r11, int r12) {
            r10 = this;
            android.graphics.drawable.LayerDrawable r0 = r10.clickableForegroundDrawable
            if (r0 == 0) goto L81
            com.google.android.material.card.MaterialCardView r0 = r10.materialCardView
            boolean r0 = r0.getUseCompatPadding()
            r1 = 0
            if (r0 == 0) goto L28
            float r0 = r10.calculateVerticalBackgroundPadding()
            r1 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 * r1
            double r2 = (double) r0
            double r2 = java.lang.Math.ceil(r2)
            int r0 = (int) r2
            float r2 = r10.calculateHorizontalBackgroundPadding()
            float r2 = r2 * r1
            double r1 = (double) r2
            double r1 = java.lang.Math.ceil(r1)
            int r1 = (int) r1
            goto L29
        L28:
            r0 = 0
        L29:
            boolean r2 = r10.isCheckedIconEnd()
            if (r2 == 0) goto L38
            int r2 = r10.checkedIconMargin
            int r2 = r11 - r2
            int r3 = r10.checkedIconSize
            int r2 = r2 - r3
            int r2 = r2 - r1
            goto L3a
        L38:
            int r2 = r10.checkedIconMargin
        L3a:
            boolean r3 = r10.isCheckedIconBottom()
            if (r3 == 0) goto L43
            int r3 = r10.checkedIconMargin
            goto L4b
        L43:
            int r3 = r10.checkedIconMargin
            int r3 = r12 - r3
            int r4 = r10.checkedIconSize
            int r3 = r3 - r4
            int r3 = r3 - r0
        L4b:
            r9 = r3
            boolean r3 = r10.isCheckedIconEnd()
            if (r3 == 0) goto L55
            int r11 = r10.checkedIconMargin
            goto L5c
        L55:
            int r3 = r10.checkedIconMargin
            int r11 = r11 - r3
            int r3 = r10.checkedIconSize
            int r11 = r11 - r3
            int r11 = r11 - r1
        L5c:
            boolean r1 = r10.isCheckedIconBottom()
            if (r1 == 0) goto L6a
            int r1 = r10.checkedIconMargin
            int r12 = r12 - r1
            int r1 = r10.checkedIconSize
            int r12 = r12 - r1
            int r12 = r12 - r0
            goto L6c
        L6a:
            int r12 = r10.checkedIconMargin
        L6c:
            r7 = r12
            com.google.android.material.card.MaterialCardView r12 = r10.materialCardView
            int r12 = androidx.core.view.ViewCompat.getLayoutDirection(r12)
            r0 = 1
            if (r12 != r0) goto L79
            r6 = r11
            r8 = r2
            goto L7b
        L79:
            r8 = r11
            r6 = r2
        L7b:
            android.graphics.drawable.LayerDrawable r4 = r10.clickableForegroundDrawable
            r5 = 2
            r4.setLayerInset(r5, r6, r7, r8, r9)
        L81:
            return
    }

    public final void setBackgroundOverwritten() {
            r1 = this;
            r0 = 1
            r1.isBackgroundOverwritten = r0
            return
    }

    public final void setCardBackgroundColor(android.content.res.ColorStateList r2) {
            r1 = this;
            com.google.android.material.shape.MaterialShapeDrawable r0 = r1.bgDrawable
            r0.setFillColor(r2)
            return
    }

    public final void setCardForegroundColor(@androidx.annotation.Nullable android.content.res.ColorStateList r2) {
            r1 = this;
            com.google.android.material.shape.MaterialShapeDrawable r0 = r1.foregroundContentDrawable
            if (r2 != 0) goto L9
            r2 = 0
            android.content.res.ColorStateList r2 = android.content.res.ColorStateList.valueOf(r2)
        L9:
            r0.setFillColor(r2)
            return
    }

    public final void setCheckable(boolean r1) {
            r0 = this;
            r0.checkable = r1
            return
    }

    public void setChecked(boolean r2) {
            r1 = this;
            r0 = 0
            r1.setChecked(r2, r0)
            return
    }

    public void setChecked(boolean r2, boolean r3) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.checkedIcon
            if (r0 == 0) goto L1b
            if (r3 == 0) goto La
            r1.animateCheckedIcon(r2)
            goto L1b
        La:
            if (r2 == 0) goto Lf
            r3 = 255(0xff, float:3.57E-43)
            goto L10
        Lf:
            r3 = 0
        L10:
            r0.setAlpha(r3)
            if (r2 == 0) goto L18
            r2 = 1065353216(0x3f800000, float:1.0)
            goto L19
        L18:
            r2 = 0
        L19:
            r1.checkedAnimationProgress = r2
        L1b:
            return
    }

    public final void setCheckedIcon(@androidx.annotation.Nullable android.graphics.drawable.Drawable r3) {
            r2 = this;
            if (r3 == 0) goto L1b
            android.graphics.drawable.Drawable r3 = androidx.core.graphics.drawable.DrawableCompat.wrap(r3)
            android.graphics.drawable.Drawable r3 = r3.mutate()
            r2.checkedIcon = r3
            android.content.res.ColorStateList r0 = r2.checkedIconTint
            androidx.core.graphics.drawable.DrawableCompat.setTintList(r3, r0)
            com.google.android.material.card.MaterialCardView r3 = r2.materialCardView
            boolean r3 = r3.isChecked()
            r2.setChecked(r3)
            goto L1f
        L1b:
            android.graphics.drawable.Drawable r3 = com.google.android.material.card.MaterialCardViewHelper.CHECKED_ICON_NONE
            r2.checkedIcon = r3
        L1f:
            android.graphics.drawable.LayerDrawable r3 = r2.clickableForegroundDrawable
            if (r3 == 0) goto L2a
            int r0 = com.google.android.material.R.id.mtrl_card_checked_layer_id
            android.graphics.drawable.Drawable r1 = r2.checkedIcon
            r3.setDrawableByLayerId(r0, r1)
        L2a:
            return
    }

    public final void setCheckedIconGravity(int r2) {
            r1 = this;
            r1.checkedIconGravity = r2
            com.google.android.material.card.MaterialCardView r2 = r1.materialCardView
            int r2 = r2.getMeasuredWidth()
            com.google.android.material.card.MaterialCardView r0 = r1.materialCardView
            int r0 = r0.getMeasuredHeight()
            r1.recalculateCheckedIconPosition(r2, r0)
            return
    }

    public final void setCheckedIconMargin(@androidx.annotation.Dimension int r1) {
            r0 = this;
            r0.checkedIconMargin = r1
            return
    }

    public final void setCheckedIconSize(@androidx.annotation.Dimension int r1) {
            r0 = this;
            r0.checkedIconSize = r1
            return
    }

    public final void setCheckedIconTint(@androidx.annotation.Nullable android.content.res.ColorStateList r2) {
            r1 = this;
            r1.checkedIconTint = r2
            android.graphics.drawable.Drawable r0 = r1.checkedIcon
            if (r0 == 0) goto L9
            androidx.core.graphics.drawable.DrawableCompat.setTintList(r0, r2)
        L9:
            return
    }

    public final void setCornerRadius(float r2) {
            r1 = this;
            com.google.android.material.shape.ShapeAppearanceModel r0 = r1.shapeAppearanceModel
            com.google.android.material.shape.ShapeAppearanceModel r2 = r0.withCornerSize(r2)
            r1.setShapeAppearanceModel(r2)
            android.graphics.drawable.Drawable r2 = r1.fgDrawable
            r2.invalidateSelf()
            boolean r2 = r1.shouldAddCornerPaddingOutsideCardBackground()
            if (r2 != 0) goto L1a
            boolean r2 = r1.shouldAddCornerPaddingInsideCardBackground()
            if (r2 == 0) goto L1d
        L1a:
            r1.updateContentPadding()
        L1d:
            boolean r2 = r1.shouldAddCornerPaddingOutsideCardBackground()
            if (r2 == 0) goto L26
            r1.updateInsets()
        L26:
            return
    }

    public final void setProgress(@androidx.annotation.FloatRange(from = 0.0d, to = 1.0d) float r2) {
            r1 = this;
            com.google.android.material.shape.MaterialShapeDrawable r0 = r1.bgDrawable
            r0.setInterpolation(r2)
            com.google.android.material.shape.MaterialShapeDrawable r0 = r1.foregroundContentDrawable
            if (r0 == 0) goto Lc
            r0.setInterpolation(r2)
        Lc:
            com.google.android.material.shape.MaterialShapeDrawable r0 = r1.foregroundShapeDrawable
            if (r0 == 0) goto L13
            r0.setInterpolation(r2)
        L13:
            return
    }

    public final void setRippleColor(@androidx.annotation.Nullable android.content.res.ColorStateList r1) {
            r0 = this;
            r0.rippleColor = r1
            r0.updateRippleColor()
            return
    }

    public final void setShapeAppearanceModel(@androidx.annotation.NonNull com.google.android.material.shape.ShapeAppearanceModel r3) {
            r2 = this;
            r2.shapeAppearanceModel = r3
            com.google.android.material.shape.MaterialShapeDrawable r0 = r2.bgDrawable
            r0.setShapeAppearanceModel(r3)
            com.google.android.material.shape.MaterialShapeDrawable r0 = r2.bgDrawable
            boolean r1 = r0.isRoundRect()
            r1 = r1 ^ 1
            r0.setShadowBitmapDrawingEnable(r1)
            com.google.android.material.shape.MaterialShapeDrawable r0 = r2.foregroundContentDrawable
            if (r0 == 0) goto L19
            r0.setShapeAppearanceModel(r3)
        L19:
            com.google.android.material.shape.MaterialShapeDrawable r0 = r2.foregroundShapeDrawable
            if (r0 == 0) goto L20
            r0.setShapeAppearanceModel(r3)
        L20:
            com.google.android.material.shape.MaterialShapeDrawable r0 = r2.compatRippleDrawable
            if (r0 == 0) goto L27
            r0.setShapeAppearanceModel(r3)
        L27:
            return
    }

    public final void setStrokeColor(android.content.res.ColorStateList r2) {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.strokeColor
            if (r0 != r2) goto L5
            return
        L5:
            r1.strokeColor = r2
            r1.updateStroke()
            return
    }

    public final void setStrokeWidth(@androidx.annotation.Dimension int r2) {
            r1 = this;
            int r0 = r1.strokeWidth
            if (r2 != r0) goto L5
            return
        L5:
            r1.strokeWidth = r2
            r1.updateStroke()
            return
    }

    public final void setUserContentPadding(int r2, int r3, int r4, int r5) {
            r1 = this;
            android.graphics.Rect r0 = r1.userContentPadding
            r0.set(r2, r3, r4, r5)
            r1.updateContentPadding()
            return
    }

    public final void updateClickable() {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.fgDrawable
            com.google.android.material.card.MaterialCardView r1 = r2.materialCardView
            boolean r1 = r1.isClickable()
            if (r1 == 0) goto Lf
            android.graphics.drawable.Drawable r1 = r2.getClickableForeground()
            goto L11
        Lf:
            com.google.android.material.shape.MaterialShapeDrawable r1 = r2.foregroundContentDrawable
        L11:
            r2.fgDrawable = r1
            if (r0 == r1) goto L18
            r2.updateInsetForeground(r1)
        L18:
            return
    }

    public final void updateContentPadding() {
            r6 = this;
            boolean r0 = r6.shouldAddCornerPaddingInsideCardBackground()
            if (r0 != 0) goto Lf
            boolean r0 = r6.shouldAddCornerPaddingOutsideCardBackground()
            if (r0 == 0) goto Ld
            goto Lf
        Ld:
            r0 = 0
            goto L10
        Lf:
            r0 = 1
        L10:
            if (r0 == 0) goto L17
            float r0 = r6.calculateActualCornerPadding()
            goto L18
        L17:
            r0 = 0
        L18:
            float r1 = r6.getParentCardViewCalculatedCornerPadding()
            float r0 = r0 - r1
            int r0 = (int) r0
            com.google.android.material.card.MaterialCardView r1 = r6.materialCardView
            android.graphics.Rect r2 = r6.userContentPadding
            int r3 = r2.left
            int r3 = r3 + r0
            int r4 = r2.top
            int r4 = r4 + r0
            int r5 = r2.right
            int r5 = r5 + r0
            int r2 = r2.bottom
            int r2 = r2 + r0
            r1.setAncestorContentPadding(r3, r4, r5, r2)
            return
    }

    public final void updateElevation() {
            r2 = this;
            com.google.android.material.shape.MaterialShapeDrawable r0 = r2.bgDrawable
            com.google.android.material.card.MaterialCardView r1 = r2.materialCardView
            float r1 = r1.getCardElevation()
            r0.setElevation(r1)
            return
    }

    public final void updateInsets() {
            r2 = this;
            boolean r0 = r2.isBackgroundOverwritten
            if (r0 != 0) goto Lf
            com.google.android.material.card.MaterialCardView r0 = r2.materialCardView
            com.google.android.material.shape.MaterialShapeDrawable r1 = r2.bgDrawable
            android.graphics.drawable.Drawable r1 = r2.insetDrawable(r1)
            r0.setBackgroundInternal(r1)
        Lf:
            com.google.android.material.card.MaterialCardView r0 = r2.materialCardView
            android.graphics.drawable.Drawable r1 = r2.fgDrawable
            android.graphics.drawable.Drawable r1 = r2.insetDrawable(r1)
            r0.setForeground(r1)
            return
    }

    public final void updateStroke() {
            r3 = this;
            com.google.android.material.shape.MaterialShapeDrawable r0 = r3.foregroundContentDrawable
            int r1 = r3.strokeWidth
            float r1 = (float) r1
            android.content.res.ColorStateList r2 = r3.strokeColor
            r0.setStroke(r1, r2)
            return
    }
}
