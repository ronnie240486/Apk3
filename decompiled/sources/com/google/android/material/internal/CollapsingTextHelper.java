package com.google.android.material.internal;

/* JADX INFO: loaded from: classes3.dex */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public final class CollapsingTextHelper {
    private static final boolean DEBUG_DRAW = false;

    @androidx.annotation.NonNull
    private static final android.graphics.Paint DEBUG_DRAW_PAINT = null;
    private static final java.lang.String ELLIPSIS_NORMAL = "…";
    private static final float FADE_MODE_THRESHOLD_FRACTION_RELATIVE = 0.5f;
    private static final java.lang.String TAG = "CollapsingTextHelper";
    private static final boolean USE_SCALING_TEXTURE = false;
    private boolean boundsChanged;

    @androidx.annotation.NonNull
    private final android.graphics.Rect collapsedBounds;
    private float collapsedDrawX;
    private float collapsedDrawY;
    private com.google.android.material.resources.CancelableFontCallback collapsedFontCallback;
    private float collapsedLetterSpacing;
    private android.content.res.ColorStateList collapsedShadowColor;
    private float collapsedShadowDx;
    private float collapsedShadowDy;
    private float collapsedShadowRadius;
    private float collapsedTextBlend;
    private android.content.res.ColorStateList collapsedTextColor;
    private int collapsedTextGravity;
    private float collapsedTextSize;
    private float collapsedTextWidth;
    private android.graphics.Typeface collapsedTypeface;
    private android.graphics.Typeface collapsedTypefaceBold;
    private android.graphics.Typeface collapsedTypefaceDefault;

    @androidx.annotation.NonNull
    private final android.graphics.RectF currentBounds;
    private float currentDrawX;
    private float currentDrawY;
    private float currentLetterSpacing;
    private int currentOffsetY;
    private int currentShadowColor;
    private float currentShadowDx;
    private float currentShadowDy;
    private float currentShadowRadius;
    private float currentTextSize;
    private android.graphics.Typeface currentTypeface;

    @androidx.annotation.NonNull
    private final android.graphics.Rect expandedBounds;
    private float expandedDrawX;
    private float expandedDrawY;
    private com.google.android.material.resources.CancelableFontCallback expandedFontCallback;
    private float expandedFraction;
    private float expandedLetterSpacing;
    private int expandedLineCount;
    private android.content.res.ColorStateList expandedShadowColor;
    private float expandedShadowDx;
    private float expandedShadowDy;
    private float expandedShadowRadius;
    private float expandedTextBlend;
    private android.content.res.ColorStateList expandedTextColor;
    private int expandedTextGravity;
    private float expandedTextSize;

    @androidx.annotation.Nullable
    private android.graphics.Bitmap expandedTitleTexture;
    private android.graphics.Typeface expandedTypeface;
    private android.graphics.Typeface expandedTypefaceBold;
    private android.graphics.Typeface expandedTypefaceDefault;
    private boolean fadeModeEnabled;
    private float fadeModeStartFraction;
    private float fadeModeThresholdFraction;
    private int hyphenationFrequency;
    private boolean isRtl;
    private boolean isRtlTextDirectionHeuristicsEnabled;
    private float lineSpacingAdd;
    private float lineSpacingMultiplier;
    private int maxLines;
    private android.animation.TimeInterpolator positionInterpolator;
    private float scale;
    private int[] state;

    @androidx.annotation.Nullable
    private com.google.android.material.internal.StaticLayoutBuilderConfigurer staticLayoutBuilderConfigurer;

    @androidx.annotation.Nullable
    private java.lang.CharSequence text;
    private android.text.StaticLayout textLayout;

    @androidx.annotation.NonNull
    private final android.text.TextPaint textPaint;
    private android.animation.TimeInterpolator textSizeInterpolator;

    @androidx.annotation.Nullable
    private java.lang.CharSequence textToDraw;
    private java.lang.CharSequence textToDrawCollapsed;
    private android.graphics.Paint texturePaint;
    private android.text.TextUtils.TruncateAt titleTextEllipsize;

    @androidx.annotation.NonNull
    private final android.text.TextPaint tmpPaint;
    private boolean useTexture;
    private final android.view.View view;



    static {
            r0 = 0
            com.google.android.material.internal.CollapsingTextHelper.USE_SCALING_TEXTURE = r0
            r0 = 0
            com.google.android.material.internal.CollapsingTextHelper.DEBUG_DRAW_PAINT = r0
            return
    }

    public CollapsingTextHelper(android.view.View r3) {
            r2 = this;
            r2.<init>()
            r0 = 16
            r2.expandedTextGravity = r0
            r2.collapsedTextGravity = r0
            r0 = 1097859072(0x41700000, float:15.0)
            r2.expandedTextSize = r0
            r2.collapsedTextSize = r0
            android.text.TextUtils$TruncateAt r0 = android.text.TextUtils.TruncateAt.END
            r2.titleTextEllipsize = r0
            r0 = 1
            r2.isRtlTextDirectionHeuristicsEnabled = r0
            r2.maxLines = r0
            r0 = 0
            r2.lineSpacingAdd = r0
            r0 = 1065353216(0x3f800000, float:1.0)
            r2.lineSpacingMultiplier = r0
            int r0 = com.google.android.material.internal.StaticLayoutBuilderCompat.DEFAULT_HYPHENATION_FREQUENCY
            r2.hyphenationFrequency = r0
            r2.view = r3
            android.text.TextPaint r0 = new android.text.TextPaint
            r1 = 129(0x81, float:1.81E-43)
            r0.<init>(r1)
            r2.textPaint = r0
            android.text.TextPaint r1 = new android.text.TextPaint
            r1.<init>(r0)
            r2.tmpPaint = r1
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r2.collapsedBounds = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r2.expandedBounds = r0
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r2.currentBounds = r0
            float r0 = r2.calculateFadeModeThresholdFraction()
            r2.fadeModeThresholdFraction = r0
            android.content.Context r3 = r3.getContext()
            android.content.res.Resources r3 = r3.getResources()
            android.content.res.Configuration r3 = r3.getConfiguration()
            r2.maybeUpdateFontWeightAdjustment(r3)
            return
    }

    @androidx.annotation.ColorInt
    private static int blendARGB(@androidx.annotation.ColorInt int r5, @androidx.annotation.ColorInt int r6, @androidx.annotation.FloatRange(from = 0.0d, to = 1.0d) float r7) {
            r0 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0 - r7
            int r1 = android.graphics.Color.alpha(r5)
            float r1 = (float) r1
            float r1 = r1 * r0
            int r2 = android.graphics.Color.alpha(r6)
            float r2 = (float) r2
            float r2 = r2 * r7
            float r2 = r2 + r1
            int r1 = android.graphics.Color.red(r5)
            float r1 = (float) r1
            float r1 = r1 * r0
            int r3 = android.graphics.Color.red(r6)
            float r3 = (float) r3
            float r3 = r3 * r7
            float r3 = r3 + r1
            int r1 = android.graphics.Color.green(r5)
            float r1 = (float) r1
            float r1 = r1 * r0
            int r4 = android.graphics.Color.green(r6)
            float r4 = (float) r4
            float r4 = r4 * r7
            float r4 = r4 + r1
            int r5 = android.graphics.Color.blue(r5)
            float r5 = (float) r5
            float r5 = r5 * r0
            int r6 = android.graphics.Color.blue(r6)
            float r6 = (float) r6
            float r6 = r6 * r7
            float r6 = r6 + r5
            int r5 = java.lang.Math.round(r2)
            int r7 = java.lang.Math.round(r3)
            int r0 = java.lang.Math.round(r4)
            int r6 = java.lang.Math.round(r6)
            int r5 = android.graphics.Color.argb(r5, r7, r0, r6)
            return r5
    }

    private void calculateBaseOffsets(boolean r10) {
            r9 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            r9.calculateUsingTextSize(r0, r10)
            java.lang.CharSequence r0 = r9.textToDraw
            if (r0 == 0) goto L1c
            android.text.StaticLayout r1 = r9.textLayout
            if (r1 == 0) goto L1c
            android.text.TextPaint r2 = r9.textPaint
            int r1 = r1.getWidth()
            float r1 = (float) r1
            android.text.TextUtils$TruncateAt r3 = r9.titleTextEllipsize
            java.lang.CharSequence r0 = android.text.TextUtils.ellipsize(r0, r2, r1, r3)
            r9.textToDrawCollapsed = r0
        L1c:
            java.lang.CharSequence r0 = r9.textToDrawCollapsed
            r1 = 0
            if (r0 == 0) goto L2a
            android.text.TextPaint r2 = r9.textPaint
            float r0 = r9.measureTextWidth(r2, r0)
            r9.collapsedTextWidth = r0
            goto L2c
        L2a:
            r9.collapsedTextWidth = r1
        L2c:
            int r0 = r9.collapsedTextGravity
            boolean r2 = r9.isRtl
            int r0 = androidx.core.view.GravityCompat.getAbsoluteGravity(r0, r2)
            r2 = r0 & 112(0x70, float:1.57E-43)
            r3 = 80
            r4 = 48
            r5 = 1073741824(0x40000000, float:2.0)
            if (r2 == r4) goto L68
            if (r2 == r3) goto L59
            android.text.TextPaint r2 = r9.textPaint
            float r2 = r2.descent()
            android.text.TextPaint r6 = r9.textPaint
            float r6 = r6.ascent()
            float r2 = r2 - r6
            float r2 = r2 / r5
            android.graphics.Rect r6 = r9.collapsedBounds
            int r6 = r6.centerY()
            float r6 = (float) r6
            float r6 = r6 - r2
            r9.collapsedDrawY = r6
            goto L6f
        L59:
            android.graphics.Rect r2 = r9.collapsedBounds
            int r2 = r2.bottom
            float r2 = (float) r2
            android.text.TextPaint r6 = r9.textPaint
            float r6 = r6.ascent()
            float r6 = r6 + r2
            r9.collapsedDrawY = r6
            goto L6f
        L68:
            android.graphics.Rect r2 = r9.collapsedBounds
            int r2 = r2.top
            float r2 = (float) r2
            r9.collapsedDrawY = r2
        L6f:
            r2 = 8388615(0x800007, float:1.1754953E-38)
            r0 = r0 & r2
            r6 = 5
            r7 = 1
            if (r0 == r7) goto L8c
            if (r0 == r6) goto L81
            android.graphics.Rect r0 = r9.collapsedBounds
            int r0 = r0.left
            float r0 = (float) r0
            r9.collapsedDrawX = r0
            goto L99
        L81:
            android.graphics.Rect r0 = r9.collapsedBounds
            int r0 = r0.right
            float r0 = (float) r0
            float r8 = r9.collapsedTextWidth
            float r0 = r0 - r8
            r9.collapsedDrawX = r0
            goto L99
        L8c:
            android.graphics.Rect r0 = r9.collapsedBounds
            int r0 = r0.centerX()
            float r0 = (float) r0
            float r8 = r9.collapsedTextWidth
            float r8 = r8 / r5
            float r0 = r0 - r8
            r9.collapsedDrawX = r0
        L99:
            r9.calculateUsingTextSize(r1, r10)
            android.text.StaticLayout r10 = r9.textLayout
            if (r10 == 0) goto La6
            int r10 = r10.getHeight()
            float r10 = (float) r10
            goto La7
        La6:
            r10 = 0
        La7:
            android.text.StaticLayout r0 = r9.textLayout
            if (r0 == 0) goto Lb5
            int r8 = r9.maxLines
            if (r8 <= r7) goto Lb5
            int r0 = r0.getWidth()
            float r1 = (float) r0
            goto Lbf
        Lb5:
            java.lang.CharSequence r0 = r9.textToDraw
            if (r0 == 0) goto Lbf
            android.text.TextPaint r1 = r9.textPaint
            float r1 = r9.measureTextWidth(r1, r0)
        Lbf:
            android.text.StaticLayout r0 = r9.textLayout
            if (r0 == 0) goto Lc8
            int r0 = r0.getLineCount()
            goto Lc9
        Lc8:
            r0 = 0
        Lc9:
            r9.expandedLineCount = r0
            int r0 = r9.expandedTextGravity
            boolean r8 = r9.isRtl
            int r0 = androidx.core.view.GravityCompat.getAbsoluteGravity(r0, r8)
            r8 = r0 & 112(0x70, float:1.57E-43)
            if (r8 == r4) goto Lf5
            if (r8 == r3) goto Le5
            float r10 = r10 / r5
            android.graphics.Rect r3 = r9.expandedBounds
            int r3 = r3.centerY()
            float r3 = (float) r3
            float r3 = r3 - r10
            r9.expandedDrawY = r3
            goto Lfc
        Le5:
            android.graphics.Rect r3 = r9.expandedBounds
            int r3 = r3.bottom
            float r3 = (float) r3
            float r3 = r3 - r10
            android.text.TextPaint r10 = r9.textPaint
            float r10 = r10.descent()
            float r10 = r10 + r3
            r9.expandedDrawY = r10
            goto Lfc
        Lf5:
            android.graphics.Rect r10 = r9.expandedBounds
            int r10 = r10.top
            float r10 = (float) r10
            r9.expandedDrawY = r10
        Lfc:
            r10 = r0 & r2
            if (r10 == r7) goto L113
            if (r10 == r6) goto L10a
            android.graphics.Rect r10 = r9.expandedBounds
            int r10 = r10.left
            float r10 = (float) r10
            r9.expandedDrawX = r10
            goto L11e
        L10a:
            android.graphics.Rect r10 = r9.expandedBounds
            int r10 = r10.right
            float r10 = (float) r10
            float r10 = r10 - r1
            r9.expandedDrawX = r10
            goto L11e
        L113:
            android.graphics.Rect r10 = r9.expandedBounds
            int r10 = r10.centerX()
            float r10 = (float) r10
            float r1 = r1 / r5
            float r10 = r10 - r1
            r9.expandedDrawX = r10
        L11e:
            r9.clearTexture()
            float r10 = r9.expandedFraction
            r9.setInterpolatedTextSize(r10)
            return
    }

    private void calculateCurrentOffsets() {
            r1 = this;
            float r0 = r1.expandedFraction
            r1.calculateOffsets(r0)
            return
    }

    private float calculateFadeModeTextAlpha(@androidx.annotation.FloatRange(from = 0.0d, to = 1.0d) float r5) {
            r4 = this;
            float r0 = r4.fadeModeThresholdFraction
            r1 = 0
            r2 = 1065353216(0x3f800000, float:1.0)
            int r3 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r3 > 0) goto L10
            float r3 = r4.fadeModeStartFraction
            float r5 = com.google.android.material.animation.AnimationUtils.lerp(r2, r1, r3, r0, r5)
            return r5
        L10:
            float r5 = com.google.android.material.animation.AnimationUtils.lerp(r1, r2, r0, r2, r5)
            return r5
    }

    private float calculateFadeModeThresholdFraction() {
            r3 = this;
            float r0 = r3.fadeModeStartFraction
            r1 = 1065353216(0x3f800000, float:1.0)
            r2 = 1056964608(0x3f000000, float:0.5)
            float r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r0, r2, r0)
            return r0
    }

    private boolean calculateIsRtl(@androidx.annotation.NonNull java.lang.CharSequence r3) {
            r2 = this;
            boolean r0 = r2.isDefaultIsRtl()
            boolean r1 = r2.isRtlTextDirectionHeuristicsEnabled
            if (r1 == 0) goto Lc
            boolean r0 = r2.isTextDirectionHeuristicsIsRtl(r3, r0)
        Lc:
            return r0
    }

    private void calculateOffsets(float r6) {
            r5 = this;
            r5.interpolateBounds(r6)
            boolean r0 = r5.fadeModeEnabled
            r1 = 0
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto L34
            float r0 = r5.fadeModeThresholdFraction
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 >= 0) goto L1d
            float r0 = r5.expandedDrawX
            r5.currentDrawX = r0
            float r0 = r5.expandedDrawY
            r5.currentDrawY = r0
            r5.setInterpolatedTextSize(r1)
            r0 = 0
            goto L50
        L1d:
            float r0 = r5.collapsedDrawX
            r5.currentDrawX = r0
            float r0 = r5.collapsedDrawY
            r3 = 0
            int r4 = r5.currentOffsetY
            int r3 = java.lang.Math.max(r3, r4)
            float r3 = (float) r3
            float r0 = r0 - r3
            r5.currentDrawY = r0
            r5.setInterpolatedTextSize(r2)
            r0 = 1065353216(0x3f800000, float:1.0)
            goto L50
        L34:
            float r0 = r5.expandedDrawX
            float r3 = r5.collapsedDrawX
            android.animation.TimeInterpolator r4 = r5.positionInterpolator
            float r0 = lerp(r0, r3, r6, r4)
            r5.currentDrawX = r0
            float r0 = r5.expandedDrawY
            float r3 = r5.collapsedDrawY
            android.animation.TimeInterpolator r4 = r5.positionInterpolator
            float r0 = lerp(r0, r3, r6, r4)
            r5.currentDrawY = r0
            r5.setInterpolatedTextSize(r6)
            r0 = r6
        L50:
            float r3 = r2 - r6
            android.animation.TimeInterpolator r4 = com.google.android.material.animation.AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR
            float r3 = lerp(r1, r2, r3, r4)
            float r3 = r2 - r3
            r5.setCollapsedTextBlend(r3)
            float r1 = lerp(r2, r1, r6, r4)
            r5.setExpandedTextBlend(r1)
            android.content.res.ColorStateList r1 = r5.collapsedTextColor
            android.content.res.ColorStateList r2 = r5.expandedTextColor
            if (r1 == r2) goto L7c
            android.text.TextPaint r1 = r5.textPaint
            int r2 = r5.getCurrentExpandedTextColor()
            int r3 = r5.getCurrentCollapsedTextColor()
            int r0 = blendARGB(r2, r3, r0)
            r1.setColor(r0)
            goto L85
        L7c:
            android.text.TextPaint r0 = r5.textPaint
            int r1 = r5.getCurrentCollapsedTextColor()
            r0.setColor(r1)
        L85:
            float r0 = r5.collapsedLetterSpacing
            float r1 = r5.expandedLetterSpacing
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 == 0) goto L97
            android.text.TextPaint r2 = r5.textPaint
            float r0 = lerp(r1, r0, r6, r4)
            r2.setLetterSpacing(r0)
            goto L9c
        L97:
            android.text.TextPaint r1 = r5.textPaint
            r1.setLetterSpacing(r0)
        L9c:
            float r0 = r5.expandedShadowRadius
            float r1 = r5.collapsedShadowRadius
            r2 = 0
            float r0 = lerp(r0, r1, r6, r2)
            r5.currentShadowRadius = r0
            float r0 = r5.expandedShadowDx
            float r1 = r5.collapsedShadowDx
            float r0 = lerp(r0, r1, r6, r2)
            r5.currentShadowDx = r0
            float r0 = r5.expandedShadowDy
            float r1 = r5.collapsedShadowDy
            float r0 = lerp(r0, r1, r6, r2)
            r5.currentShadowDy = r0
            android.content.res.ColorStateList r0 = r5.expandedShadowColor
            int r0 = r5.getCurrentColor(r0)
            android.content.res.ColorStateList r1 = r5.collapsedShadowColor
            int r1 = r5.getCurrentColor(r1)
            int r0 = blendARGB(r0, r1, r6)
            r5.currentShadowColor = r0
            android.text.TextPaint r1 = r5.textPaint
            float r2 = r5.currentShadowRadius
            float r3 = r5.currentShadowDx
            float r4 = r5.currentShadowDy
            r1.setShadowLayer(r2, r3, r4, r0)
            boolean r0 = r5.fadeModeEnabled
            if (r0 == 0) goto Lef
            android.text.TextPaint r0 = r5.textPaint
            int r0 = r0.getAlpha()
            float r6 = r5.calculateFadeModeTextAlpha(r6)
            float r0 = (float) r0
            float r6 = r6 * r0
            int r6 = (int) r6
            android.text.TextPaint r0 = r5.textPaint
            r0.setAlpha(r6)
        Lef:
            android.view.View r6 = r5.view
            androidx.core.view.ViewCompat.postInvalidateOnAnimation(r6)
            return
    }

    private void calculateUsingTextSize(float r2) {
            r1 = this;
            r0 = 0
            r1.calculateUsingTextSize(r2, r0)
            return
    }

    private void calculateUsingTextSize(float r11, boolean r12) {
            r10 = this;
            java.lang.CharSequence r0 = r10.text
            if (r0 != 0) goto L5
            return
        L5:
            android.graphics.Rect r0 = r10.collapsedBounds
            int r0 = r0.width()
            float r0 = (float) r0
            android.graphics.Rect r1 = r10.expandedBounds
            int r1 = r1.width()
            float r1 = (float) r1
            r2 = 1065353216(0x3f800000, float:1.0)
            boolean r3 = isClose(r11, r2)
            r4 = 0
            if (r3 == 0) goto L25
            float r11 = r10.collapsedTextSize
            float r12 = r10.collapsedLetterSpacing
            r10.scale = r2
            android.graphics.Typeface r1 = r10.collapsedTypeface
            goto L5c
        L25:
            float r3 = r10.expandedTextSize
            float r5 = r10.expandedLetterSpacing
            android.graphics.Typeface r6 = r10.expandedTypeface
            boolean r7 = isClose(r11, r4)
            if (r7 == 0) goto L34
            r10.scale = r2
            goto L43
        L34:
            float r7 = r10.expandedTextSize
            float r8 = r10.collapsedTextSize
            android.animation.TimeInterpolator r9 = r10.textSizeInterpolator
            float r11 = lerp(r7, r8, r11, r9)
            float r7 = r10.expandedTextSize
            float r11 = r11 / r7
            r10.scale = r11
        L43:
            float r11 = r10.collapsedTextSize
            float r7 = r10.expandedTextSize
            float r11 = r11 / r7
            float r7 = r1 * r11
            if (r12 == 0) goto L51
        L4c:
            r0 = r1
        L4d:
            r11 = r3
            r12 = r5
            r1 = r6
            goto L5c
        L51:
            int r12 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r12 <= 0) goto L4c
            float r0 = r0 / r11
            float r11 = java.lang.Math.min(r0, r1)
            r0 = r11
            goto L4d
        L5c:
            r3 = 1
            r5 = 0
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 <= 0) goto Lb0
            float r4 = r10.currentTextSize
            int r4 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r4 == 0) goto L6a
            r4 = 1
            goto L6b
        L6a:
            r4 = 0
        L6b:
            float r6 = r10.currentLetterSpacing
            int r6 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r6 == 0) goto L73
            r6 = 1
            goto L74
        L73:
            r6 = 0
        L74:
            android.graphics.Typeface r7 = r10.currentTypeface
            if (r7 == r1) goto L7a
            r7 = 1
            goto L7b
        L7a:
            r7 = 0
        L7b:
            android.text.StaticLayout r8 = r10.textLayout
            if (r8 == 0) goto L8a
            int r8 = r8.getWidth()
            float r8 = (float) r8
            int r8 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r8 == 0) goto L8a
            r8 = 1
            goto L8b
        L8a:
            r8 = 0
        L8b:
            if (r4 != 0) goto L9a
            if (r6 != 0) goto L9a
            if (r8 != 0) goto L9a
            if (r7 != 0) goto L9a
            boolean r4 = r10.boundsChanged
            if (r4 == 0) goto L98
            goto L9a
        L98:
            r4 = 0
            goto L9b
        L9a:
            r4 = 1
        L9b:
            r10.currentTextSize = r11
            r10.currentLetterSpacing = r12
            r10.currentTypeface = r1
            r10.boundsChanged = r5
            android.text.TextPaint r11 = r10.textPaint
            float r12 = r10.scale
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 == 0) goto Lac
            r5 = 1
        Lac:
            r11.setLinearText(r5)
            r5 = r4
        Lb0:
            java.lang.CharSequence r11 = r10.textToDraw
            if (r11 == 0) goto Lb6
            if (r5 == 0) goto Le9
        Lb6:
            android.text.TextPaint r11 = r10.textPaint
            float r12 = r10.currentTextSize
            r11.setTextSize(r12)
            android.text.TextPaint r11 = r10.textPaint
            android.graphics.Typeface r12 = r10.currentTypeface
            r11.setTypeface(r12)
            android.text.TextPaint r11 = r10.textPaint
            float r12 = r10.currentLetterSpacing
            r11.setLetterSpacing(r12)
            java.lang.CharSequence r11 = r10.text
            boolean r11 = r10.calculateIsRtl(r11)
            r10.isRtl = r11
            boolean r11 = r10.shouldDrawMultiline()
            if (r11 == 0) goto Ldb
            int r3 = r10.maxLines
        Ldb:
            boolean r11 = r10.isRtl
            android.text.StaticLayout r11 = r10.createStaticLayout(r3, r0, r11)
            r10.textLayout = r11
            java.lang.CharSequence r11 = r11.getText()
            r10.textToDraw = r11
        Le9:
            return
    }

    private void clearTexture() {
            r1 = this;
            android.graphics.Bitmap r0 = r1.expandedTitleTexture
            if (r0 == 0) goto La
            r0.recycle()
            r0 = 0
            r1.expandedTitleTexture = r0
        La:
            return
    }

    private android.text.StaticLayout createStaticLayout(int r4, float r5, boolean r6) {
            r3 = this;
            r0 = 1
            if (r4 != r0) goto L6
            android.text.Layout$Alignment r0 = android.text.Layout.Alignment.ALIGN_NORMAL     // Catch: com.google.android.material.internal.StaticLayoutBuilderCompat.StaticLayoutBuilderCompatException -> L43
            goto La
        L6:
            android.text.Layout$Alignment r0 = r3.getMultilineTextLayoutAlignment()     // Catch: com.google.android.material.internal.StaticLayoutBuilderCompat.StaticLayoutBuilderCompatException -> L43
        La:
            java.lang.CharSequence r1 = r3.text     // Catch: com.google.android.material.internal.StaticLayoutBuilderCompat.StaticLayoutBuilderCompatException -> L43
            android.text.TextPaint r2 = r3.textPaint     // Catch: com.google.android.material.internal.StaticLayoutBuilderCompat.StaticLayoutBuilderCompatException -> L43
            int r5 = (int) r5     // Catch: com.google.android.material.internal.StaticLayoutBuilderCompat.StaticLayoutBuilderCompatException -> L43
            com.google.android.material.internal.StaticLayoutBuilderCompat r5 = com.google.android.material.internal.StaticLayoutBuilderCompat.obtain(r1, r2, r5)     // Catch: com.google.android.material.internal.StaticLayoutBuilderCompat.StaticLayoutBuilderCompatException -> L43
            android.text.TextUtils$TruncateAt r1 = r3.titleTextEllipsize     // Catch: com.google.android.material.internal.StaticLayoutBuilderCompat.StaticLayoutBuilderCompatException -> L43
            com.google.android.material.internal.StaticLayoutBuilderCompat r5 = r5.setEllipsize(r1)     // Catch: com.google.android.material.internal.StaticLayoutBuilderCompat.StaticLayoutBuilderCompatException -> L43
            com.google.android.material.internal.StaticLayoutBuilderCompat r5 = r5.setIsRtl(r6)     // Catch: com.google.android.material.internal.StaticLayoutBuilderCompat.StaticLayoutBuilderCompatException -> L43
            com.google.android.material.internal.StaticLayoutBuilderCompat r5 = r5.setAlignment(r0)     // Catch: com.google.android.material.internal.StaticLayoutBuilderCompat.StaticLayoutBuilderCompatException -> L43
            r6 = 0
            com.google.android.material.internal.StaticLayoutBuilderCompat r5 = r5.setIncludePad(r6)     // Catch: com.google.android.material.internal.StaticLayoutBuilderCompat.StaticLayoutBuilderCompatException -> L43
            com.google.android.material.internal.StaticLayoutBuilderCompat r4 = r5.setMaxLines(r4)     // Catch: com.google.android.material.internal.StaticLayoutBuilderCompat.StaticLayoutBuilderCompatException -> L43
            float r5 = r3.lineSpacingAdd     // Catch: com.google.android.material.internal.StaticLayoutBuilderCompat.StaticLayoutBuilderCompatException -> L43
            float r6 = r3.lineSpacingMultiplier     // Catch: com.google.android.material.internal.StaticLayoutBuilderCompat.StaticLayoutBuilderCompatException -> L43
            com.google.android.material.internal.StaticLayoutBuilderCompat r4 = r4.setLineSpacing(r5, r6)     // Catch: com.google.android.material.internal.StaticLayoutBuilderCompat.StaticLayoutBuilderCompatException -> L43
            int r5 = r3.hyphenationFrequency     // Catch: com.google.android.material.internal.StaticLayoutBuilderCompat.StaticLayoutBuilderCompatException -> L43
            com.google.android.material.internal.StaticLayoutBuilderCompat r4 = r4.setHyphenationFrequency(r5)     // Catch: com.google.android.material.internal.StaticLayoutBuilderCompat.StaticLayoutBuilderCompatException -> L43
            com.google.android.material.internal.StaticLayoutBuilderConfigurer r5 = r3.staticLayoutBuilderConfigurer     // Catch: com.google.android.material.internal.StaticLayoutBuilderCompat.StaticLayoutBuilderCompatException -> L43
            com.google.android.material.internal.StaticLayoutBuilderCompat r4 = r4.setStaticLayoutBuilderConfigurer(r5)     // Catch: com.google.android.material.internal.StaticLayoutBuilderCompat.StaticLayoutBuilderCompatException -> L43
            android.text.StaticLayout r4 = r4.build()     // Catch: com.google.android.material.internal.StaticLayoutBuilderCompat.StaticLayoutBuilderCompatException -> L43
            goto L52
        L43:
            r4 = move-exception
            java.lang.Throwable r5 = r4.getCause()
            java.lang.String r5 = r5.getMessage()
            java.lang.String r6 = "CollapsingTextHelper"
            android.util.Log.e(r6, r5, r4)
            r4 = 0
        L52:
            java.lang.Object r4 = androidx.core.util.Preconditions.checkNotNull(r4)
            android.text.StaticLayout r4 = (android.text.StaticLayout) r4
            return r4
    }

    private void drawMultilineTransition(@androidx.annotation.NonNull android.graphics.Canvas r15, float r16, float r17) {
            r14 = this;
            r0 = r14
            android.text.TextPaint r1 = r0.textPaint
            int r1 = r1.getAlpha()
            r15.translate(r16, r17)
            android.text.TextPaint r2 = r0.textPaint
            float r3 = r0.expandedTextBlend
            float r4 = (float) r1
            float r3 = r3 * r4
            int r3 = (int) r3
            r2.setAlpha(r3)
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 31
            if (r2 < r3) goto L30
            android.text.TextPaint r5 = r0.textPaint
            float r6 = r0.currentShadowRadius
            float r7 = r0.currentShadowDx
            float r8 = r0.currentShadowDy
            int r9 = r0.currentShadowColor
            int r10 = r5.getAlpha()
            int r9 = com.google.android.material.color.MaterialColors.compositeARGBWithAlpha(r9, r10)
            r5.setShadowLayer(r6, r7, r8, r9)
        L30:
            android.text.StaticLayout r5 = r0.textLayout
            r13 = r15
            r5.draw(r15)
            android.text.TextPaint r5 = r0.textPaint
            float r6 = r0.collapsedTextBlend
            float r6 = r6 * r4
            int r4 = (int) r6
            r5.setAlpha(r4)
            if (r2 < r3) goto L57
            android.text.TextPaint r4 = r0.textPaint
            float r5 = r0.currentShadowRadius
            float r6 = r0.currentShadowDx
            float r7 = r0.currentShadowDy
            int r8 = r0.currentShadowColor
            int r9 = r4.getAlpha()
            int r8 = com.google.android.material.color.MaterialColors.compositeARGBWithAlpha(r8, r9)
            r4.setShadowLayer(r5, r6, r7, r8)
        L57:
            android.text.StaticLayout r4 = r0.textLayout
            r5 = 0
            int r4 = r4.getLineBaseline(r5)
            java.lang.CharSequence r7 = r0.textToDrawCollapsed
            r8 = 0
            int r9 = r7.length()
            r10 = 0
            float r4 = (float) r4
            android.text.TextPaint r12 = r0.textPaint
            r6 = r15
            r11 = r4
            r6.drawText(r7, r8, r9, r10, r11, r12)
            if (r2 < r3) goto L7d
            android.text.TextPaint r2 = r0.textPaint
            float r3 = r0.currentShadowRadius
            float r6 = r0.currentShadowDx
            float r7 = r0.currentShadowDy
            int r8 = r0.currentShadowColor
            r2.setShadowLayer(r3, r6, r7, r8)
        L7d:
            boolean r2 = r0.fadeModeEnabled
            if (r2 != 0) goto Lba
            java.lang.CharSequence r2 = r0.textToDrawCollapsed
            java.lang.String r2 = r2.toString()
            java.lang.String r2 = r2.trim()
            java.lang.String r3 = "…"
            boolean r3 = r2.endsWith(r3)
            if (r3 == 0) goto L9d
            int r3 = r2.length()
            int r3 = r3 + (-1)
            java.lang.String r2 = r2.substring(r5, r3)
        L9d:
            r7 = r2
            android.text.TextPaint r2 = r0.textPaint
            r2.setAlpha(r1)
            r8 = 0
            android.text.StaticLayout r1 = r0.textLayout
            int r1 = r1.getLineEnd(r5)
            int r2 = r7.length()
            int r9 = java.lang.Math.min(r1, r2)
            r10 = 0
            android.text.TextPaint r12 = r0.textPaint
            r6 = r15
            r11 = r4
            r6.drawText(r7, r8, r9, r10, r11, r12)
        Lba:
            return
    }

    private void ensureExpandedTexture() {
            r3 = this;
            android.graphics.Bitmap r0 = r3.expandedTitleTexture
            if (r0 != 0) goto L4a
            android.graphics.Rect r0 = r3.expandedBounds
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L4a
            java.lang.CharSequence r0 = r3.textToDraw
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L15
            goto L4a
        L15:
            r0 = 0
            r3.calculateOffsets(r0)
            android.text.StaticLayout r0 = r3.textLayout
            int r0 = r0.getWidth()
            android.text.StaticLayout r1 = r3.textLayout
            int r1 = r1.getHeight()
            if (r0 <= 0) goto L4a
            if (r1 > 0) goto L2a
            goto L4a
        L2a:
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r0, r1, r2)
            r3.expandedTitleTexture = r0
            android.graphics.Canvas r0 = new android.graphics.Canvas
            android.graphics.Bitmap r1 = r3.expandedTitleTexture
            r0.<init>(r1)
            android.text.StaticLayout r1 = r3.textLayout
            r1.draw(r0)
            android.graphics.Paint r0 = r3.texturePaint
            if (r0 != 0) goto L4a
            android.graphics.Paint r0 = new android.graphics.Paint
            r1 = 3
            r0.<init>(r1)
            r3.texturePaint = r0
        L4a:
            return
    }

    private float getCollapsedTextLeftBound(int r3, int r4) {
            r2 = this;
            r0 = 17
            if (r4 == r0) goto L3c
            r0 = r4 & 7
            r1 = 1
            if (r0 != r1) goto La
            goto L3c
        La:
            r3 = 8388613(0x800005, float:1.175495E-38)
            r0 = r4 & r3
            if (r0 == r3) goto L29
            r3 = 5
            r4 = r4 & r3
            if (r4 != r3) goto L16
            goto L29
        L16:
            boolean r3 = r2.isRtl
            if (r3 == 0) goto L23
            android.graphics.Rect r3 = r2.collapsedBounds
            int r3 = r3.right
            float r3 = (float) r3
            float r4 = r2.collapsedTextWidth
            float r3 = r3 - r4
            goto L28
        L23:
            android.graphics.Rect r3 = r2.collapsedBounds
            int r3 = r3.left
            float r3 = (float) r3
        L28:
            return r3
        L29:
            boolean r3 = r2.isRtl
            if (r3 == 0) goto L33
            android.graphics.Rect r3 = r2.collapsedBounds
            int r3 = r3.left
            float r3 = (float) r3
            goto L3b
        L33:
            android.graphics.Rect r3 = r2.collapsedBounds
            int r3 = r3.right
            float r3 = (float) r3
            float r4 = r2.collapsedTextWidth
            float r3 = r3 - r4
        L3b:
            return r3
        L3c:
            float r3 = (float) r3
            r4 = 1073741824(0x40000000, float:2.0)
            float r3 = r3 / r4
            float r0 = r2.collapsedTextWidth
            float r0 = r0 / r4
            float r3 = r3 - r0
            return r3
    }

    private float getCollapsedTextRightBound(@androidx.annotation.NonNull android.graphics.RectF r3, int r4, int r5) {
            r2 = this;
            r0 = 17
            if (r5 == r0) goto L36
            r0 = r5 & 7
            r1 = 1
            if (r0 != r1) goto La
            goto L36
        La:
            r4 = 8388613(0x800005, float:1.175495E-38)
            r0 = r5 & r4
            if (r0 == r4) goto L26
            r4 = 5
            r5 = r5 & r4
            if (r5 != r4) goto L16
            goto L26
        L16:
            boolean r4 = r2.isRtl
            if (r4 == 0) goto L20
            android.graphics.Rect r3 = r2.collapsedBounds
            int r3 = r3.right
            float r3 = (float) r3
            goto L25
        L20:
            float r3 = r3.left
            float r4 = r2.collapsedTextWidth
            float r3 = r3 + r4
        L25:
            return r3
        L26:
            boolean r4 = r2.isRtl
            if (r4 == 0) goto L30
            float r3 = r3.left
            float r4 = r2.collapsedTextWidth
            float r3 = r3 + r4
            goto L35
        L30:
            android.graphics.Rect r3 = r2.collapsedBounds
            int r3 = r3.right
            float r3 = (float) r3
        L35:
            return r3
        L36:
            float r3 = (float) r4
            r4 = 1073741824(0x40000000, float:2.0)
            float r3 = r3 / r4
            float r5 = r2.collapsedTextWidth
            float r5 = r5 / r4
            float r5 = r5 + r3
            return r5
    }

    @androidx.annotation.ColorInt
    private int getCurrentColor(@androidx.annotation.Nullable android.content.res.ColorStateList r3) {
            r2 = this;
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            int[] r1 = r2.state
            if (r1 == 0) goto Ld
            int r3 = r3.getColorForState(r1, r0)
            return r3
        Ld:
            int r3 = r3.getDefaultColor()
            return r3
    }

    @androidx.annotation.ColorInt
    private int getCurrentExpandedTextColor() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.expandedTextColor
            int r0 = r1.getCurrentColor(r0)
            return r0
    }

    private android.text.Layout.Alignment getMultilineTextLayoutAlignment() {
            r2 = this;
            int r0 = r2.expandedTextGravity
            boolean r1 = r2.isRtl
            int r0 = androidx.core.view.GravityCompat.getAbsoluteGravity(r0, r1)
            r0 = r0 & 7
            r1 = 1
            if (r0 == r1) goto L24
            r1 = 5
            if (r0 == r1) goto L1a
            boolean r0 = r2.isRtl
            if (r0 == 0) goto L17
            android.text.Layout$Alignment r0 = android.text.Layout.Alignment.ALIGN_OPPOSITE
            goto L19
        L17:
            android.text.Layout$Alignment r0 = android.text.Layout.Alignment.ALIGN_NORMAL
        L19:
            return r0
        L1a:
            boolean r0 = r2.isRtl
            if (r0 == 0) goto L21
            android.text.Layout$Alignment r0 = android.text.Layout.Alignment.ALIGN_NORMAL
            goto L23
        L21:
            android.text.Layout$Alignment r0 = android.text.Layout.Alignment.ALIGN_OPPOSITE
        L23:
            return r0
        L24:
            android.text.Layout$Alignment r0 = android.text.Layout.Alignment.ALIGN_CENTER
            return r0
    }

    private void getTextPaintCollapsed(@androidx.annotation.NonNull android.text.TextPaint r2) {
            r1 = this;
            float r0 = r1.collapsedTextSize
            r2.setTextSize(r0)
            android.graphics.Typeface r0 = r1.collapsedTypeface
            r2.setTypeface(r0)
            float r0 = r1.collapsedLetterSpacing
            r2.setLetterSpacing(r0)
            return
    }

    private void getTextPaintExpanded(@androidx.annotation.NonNull android.text.TextPaint r2) {
            r1 = this;
            float r0 = r1.expandedTextSize
            r2.setTextSize(r0)
            android.graphics.Typeface r0 = r1.expandedTypeface
            r2.setTypeface(r0)
            float r0 = r1.expandedLetterSpacing
            r2.setLetterSpacing(r0)
            return
    }

    private void interpolateBounds(float r5) {
            r4 = this;
            boolean r0 = r4.fadeModeEnabled
            if (r0 == 0) goto L15
            android.graphics.RectF r0 = r4.currentBounds
            float r1 = r4.fadeModeThresholdFraction
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 >= 0) goto Lf
            android.graphics.Rect r5 = r4.expandedBounds
            goto L11
        Lf:
            android.graphics.Rect r5 = r4.collapsedBounds
        L11:
            r0.set(r5)
            goto L5f
        L15:
            android.graphics.RectF r0 = r4.currentBounds
            android.graphics.Rect r1 = r4.expandedBounds
            int r1 = r1.left
            float r1 = (float) r1
            android.graphics.Rect r2 = r4.collapsedBounds
            int r2 = r2.left
            float r2 = (float) r2
            android.animation.TimeInterpolator r3 = r4.positionInterpolator
            float r1 = lerp(r1, r2, r5, r3)
            r0.left = r1
            android.graphics.RectF r0 = r4.currentBounds
            float r1 = r4.expandedDrawY
            float r2 = r4.collapsedDrawY
            android.animation.TimeInterpolator r3 = r4.positionInterpolator
            float r1 = lerp(r1, r2, r5, r3)
            r0.top = r1
            android.graphics.RectF r0 = r4.currentBounds
            android.graphics.Rect r1 = r4.expandedBounds
            int r1 = r1.right
            float r1 = (float) r1
            android.graphics.Rect r2 = r4.collapsedBounds
            int r2 = r2.right
            float r2 = (float) r2
            android.animation.TimeInterpolator r3 = r4.positionInterpolator
            float r1 = lerp(r1, r2, r5, r3)
            r0.right = r1
            android.graphics.RectF r0 = r4.currentBounds
            android.graphics.Rect r1 = r4.expandedBounds
            int r1 = r1.bottom
            float r1 = (float) r1
            android.graphics.Rect r2 = r4.collapsedBounds
            int r2 = r2.bottom
            float r2 = (float) r2
            android.animation.TimeInterpolator r3 = r4.positionInterpolator
            float r5 = lerp(r1, r2, r5, r3)
            r0.bottom = r5
        L5f:
            return
    }

    private static boolean isClose(float r0, float r1) {
            float r0 = r0 - r1
            float r0 = java.lang.Math.abs(r0)
            r1 = 925353388(0x3727c5ac, float:1.0E-5)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    private boolean isDefaultIsRtl() {
            r2 = this;
            android.view.View r0 = r2.view
            int r0 = androidx.core.view.ViewCompat.getLayoutDirection(r0)
            r1 = 1
            if (r0 != r1) goto La
            goto Lb
        La:
            r1 = 0
        Lb:
            return r1
    }

    private boolean isTextDirectionHeuristicsIsRtl(@androidx.annotation.NonNull java.lang.CharSequence r3, boolean r4) {
            r2 = this;
            if (r4 == 0) goto L5
            androidx.core.text.TextDirectionHeuristicCompat r4 = androidx.core.text.TextDirectionHeuristicsCompat.FIRSTSTRONG_RTL
            goto L7
        L5:
            androidx.core.text.TextDirectionHeuristicCompat r4 = androidx.core.text.TextDirectionHeuristicsCompat.FIRSTSTRONG_LTR
        L7:
            r0 = 0
            int r1 = r3.length()
            boolean r3 = r4.isRtl(r3, r0, r1)
            return r3
    }

    private static float lerp(float r0, float r1, float r2, @androidx.annotation.Nullable android.animation.TimeInterpolator r3) {
            if (r3 == 0) goto L6
            float r2 = r3.getInterpolation(r2)
        L6:
            float r0 = com.google.android.material.animation.AnimationUtils.lerp(r0, r1, r2)
            return r0
    }

    private float measureTextWidth(android.text.TextPaint r3, java.lang.CharSequence r4) {
            r2 = this;
            int r0 = r4.length()
            r1 = 0
            float r3 = r3.measureText(r4, r1, r0)
            return r3
    }

    private static boolean rectEquals(@androidx.annotation.NonNull android.graphics.Rect r1, int r2, int r3, int r4, int r5) {
            int r0 = r1.left
            if (r0 != r2) goto L12
            int r2 = r1.top
            if (r2 != r3) goto L12
            int r2 = r1.right
            if (r2 != r4) goto L12
            int r1 = r1.bottom
            if (r1 != r5) goto L12
            r1 = 1
            goto L13
        L12:
            r1 = 0
        L13:
            return r1
    }

    private void setCollapsedTextBlend(float r1) {
            r0 = this;
            r0.collapsedTextBlend = r1
            android.view.View r1 = r0.view
            androidx.core.view.ViewCompat.postInvalidateOnAnimation(r1)
            return
    }

    private boolean setCollapsedTypefaceInternal(android.graphics.Typeface r2) {
            r1 = this;
            com.google.android.material.resources.CancelableFontCallback r0 = r1.collapsedFontCallback
            if (r0 == 0) goto L7
            r0.cancel()
        L7:
            android.graphics.Typeface r0 = r1.collapsedTypefaceDefault
            if (r0 == r2) goto L29
            r1.collapsedTypefaceDefault = r2
            android.view.View r0 = r1.view
            android.content.Context r0 = r0.getContext()
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            android.graphics.Typeface r2 = com.google.android.material.resources.TypefaceUtils.maybeCopyWithFontWeightAdjustment(r0, r2)
            r1.collapsedTypefaceBold = r2
            if (r2 != 0) goto L25
            android.graphics.Typeface r2 = r1.collapsedTypefaceDefault
        L25:
            r1.collapsedTypeface = r2
            r2 = 1
            return r2
        L29:
            r2 = 0
            return r2
    }

    private void setExpandedTextBlend(float r1) {
            r0 = this;
            r0.expandedTextBlend = r1
            android.view.View r1 = r0.view
            androidx.core.view.ViewCompat.postInvalidateOnAnimation(r1)
            return
    }

    private boolean setExpandedTypefaceInternal(android.graphics.Typeface r2) {
            r1 = this;
            com.google.android.material.resources.CancelableFontCallback r0 = r1.expandedFontCallback
            if (r0 == 0) goto L7
            r0.cancel()
        L7:
            android.graphics.Typeface r0 = r1.expandedTypefaceDefault
            if (r0 == r2) goto L29
            r1.expandedTypefaceDefault = r2
            android.view.View r0 = r1.view
            android.content.Context r0 = r0.getContext()
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            android.graphics.Typeface r2 = com.google.android.material.resources.TypefaceUtils.maybeCopyWithFontWeightAdjustment(r0, r2)
            r1.expandedTypefaceBold = r2
            if (r2 != 0) goto L25
            android.graphics.Typeface r2 = r1.expandedTypefaceDefault
        L25:
            r1.expandedTypeface = r2
            r2 = 1
            return r2
        L29:
            r2 = 0
            return r2
    }

    private void setInterpolatedTextSize(float r2) {
            r1 = this;
            r1.calculateUsingTextSize(r2)
            boolean r2 = com.google.android.material.internal.CollapsingTextHelper.USE_SCALING_TEXTURE
            if (r2 == 0) goto L11
            float r2 = r1.scale
            r0 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 == 0) goto L11
            r2 = 1
            goto L12
        L11:
            r2 = 0
        L12:
            r1.useTexture = r2
            if (r2 == 0) goto L19
            r1.ensureExpandedTexture()
        L19:
            android.view.View r2 = r1.view
            androidx.core.view.ViewCompat.postInvalidateOnAnimation(r2)
            return
    }

    private boolean shouldDrawMultiline() {
            r2 = this;
            int r0 = r2.maxLines
            r1 = 1
            if (r0 <= r1) goto L12
            boolean r0 = r2.isRtl
            if (r0 == 0) goto Ld
            boolean r0 = r2.fadeModeEnabled
            if (r0 == 0) goto L12
        Ld:
            boolean r0 = r2.useTexture
            if (r0 != 0) goto L12
            goto L13
        L12:
            r1 = 0
        L13:
            return r1
    }

    public void draw(@androidx.annotation.NonNull android.graphics.Canvas r8) {
            r7 = this;
            int r0 = r8.save()
            java.lang.CharSequence r1 = r7.textToDraw
            if (r1 == 0) goto L7b
            android.graphics.RectF r1 = r7.currentBounds
            float r1 = r1.width()
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 <= 0) goto L7b
            android.graphics.RectF r1 = r7.currentBounds
            float r1 = r1.height()
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 <= 0) goto L7b
            android.text.TextPaint r1 = r7.textPaint
            float r2 = r7.currentTextSize
            r1.setTextSize(r2)
            float r1 = r7.currentDrawX
            float r2 = r7.currentDrawY
            boolean r3 = r7.useTexture
            r4 = 0
            if (r3 == 0) goto L33
            android.graphics.Bitmap r3 = r7.expandedTitleTexture
            if (r3 == 0) goto L33
            r3 = 1
            goto L34
        L33:
            r3 = 0
        L34:
            float r5 = r7.scale
            r6 = 1065353216(0x3f800000, float:1.0)
            int r6 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r6 == 0) goto L43
            boolean r6 = r7.fadeModeEnabled
            if (r6 != 0) goto L43
            r8.scale(r5, r5, r1, r2)
        L43:
            if (r3 == 0) goto L50
            android.graphics.Bitmap r3 = r7.expandedTitleTexture
            android.graphics.Paint r4 = r7.texturePaint
            r8.drawBitmap(r3, r1, r2, r4)
            r8.restoreToCount(r0)
            return
        L50:
            boolean r3 = r7.shouldDrawMultiline()
            if (r3 == 0) goto L70
            boolean r3 = r7.fadeModeEnabled
            if (r3 == 0) goto L62
            float r3 = r7.expandedFraction
            float r5 = r7.fadeModeThresholdFraction
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 <= 0) goto L70
        L62:
            float r1 = r7.currentDrawX
            android.text.StaticLayout r3 = r7.textLayout
            int r3 = r3.getLineStart(r4)
            float r3 = (float) r3
            float r1 = r1 - r3
            r7.drawMultilineTransition(r8, r1, r2)
            goto L78
        L70:
            r8.translate(r1, r2)
            android.text.StaticLayout r1 = r7.textLayout
            r1.draw(r8)
        L78:
            r8.restoreToCount(r0)
        L7b:
            return
    }

    public void getCollapsedTextActualBounds(@androidx.annotation.NonNull android.graphics.RectF r3, int r4, int r5) {
            r2 = this;
            java.lang.CharSequence r0 = r2.text
            boolean r0 = r2.calculateIsRtl(r0)
            r2.isRtl = r0
            float r0 = r2.getCollapsedTextLeftBound(r4, r5)
            android.graphics.Rect r1 = r2.collapsedBounds
            int r1 = r1.left
            float r1 = (float) r1
            float r0 = java.lang.Math.max(r0, r1)
            r3.left = r0
            android.graphics.Rect r0 = r2.collapsedBounds
            int r0 = r0.top
            float r0 = (float) r0
            r3.top = r0
            float r4 = r2.getCollapsedTextRightBound(r3, r4, r5)
            android.graphics.Rect r5 = r2.collapsedBounds
            int r5 = r5.right
            float r5 = (float) r5
            float r4 = java.lang.Math.min(r4, r5)
            r3.right = r4
            android.graphics.Rect r4 = r2.collapsedBounds
            int r4 = r4.top
            float r4 = (float) r4
            float r5 = r2.getCollapsedTextHeight()
            float r5 = r5 + r4
            r3.bottom = r5
            return
    }

    public android.content.res.ColorStateList getCollapsedTextColor() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.collapsedTextColor
            return r0
    }

    public int getCollapsedTextGravity() {
            r1 = this;
            int r0 = r1.collapsedTextGravity
            return r0
    }

    public float getCollapsedTextHeight() {
            r1 = this;
            android.text.TextPaint r0 = r1.tmpPaint
            r1.getTextPaintCollapsed(r0)
            android.text.TextPaint r0 = r1.tmpPaint
            float r0 = r0.ascent()
            float r0 = -r0
            return r0
    }

    public float getCollapsedTextSize() {
            r1 = this;
            float r0 = r1.collapsedTextSize
            return r0
    }

    public android.graphics.Typeface getCollapsedTypeface() {
            r1 = this;
            android.graphics.Typeface r0 = r1.collapsedTypeface
            if (r0 == 0) goto L5
            goto L7
        L5:
            android.graphics.Typeface r0 = android.graphics.Typeface.DEFAULT
        L7:
            return r0
    }

    @androidx.annotation.ColorInt
    public int getCurrentCollapsedTextColor() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.collapsedTextColor
            int r0 = r1.getCurrentColor(r0)
            return r0
    }

    public int getExpandedLineCount() {
            r1 = this;
            int r0 = r1.expandedLineCount
            return r0
    }

    public android.content.res.ColorStateList getExpandedTextColor() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.expandedTextColor
            return r0
    }

    public float getExpandedTextFullHeight() {
            r2 = this;
            android.text.TextPaint r0 = r2.tmpPaint
            r2.getTextPaintExpanded(r0)
            android.text.TextPaint r0 = r2.tmpPaint
            float r0 = r0.ascent()
            float r0 = -r0
            android.text.TextPaint r1 = r2.tmpPaint
            float r1 = r1.descent()
            float r1 = r1 + r0
            return r1
    }

    public int getExpandedTextGravity() {
            r1 = this;
            int r0 = r1.expandedTextGravity
            return r0
    }

    public float getExpandedTextHeight() {
            r1 = this;
            android.text.TextPaint r0 = r1.tmpPaint
            r1.getTextPaintExpanded(r0)
            android.text.TextPaint r0 = r1.tmpPaint
            float r0 = r0.ascent()
            float r0 = -r0
            return r0
    }

    public float getExpandedTextSize() {
            r1 = this;
            float r0 = r1.expandedTextSize
            return r0
    }

    public android.graphics.Typeface getExpandedTypeface() {
            r1 = this;
            android.graphics.Typeface r0 = r1.expandedTypeface
            if (r0 == 0) goto L5
            goto L7
        L5:
            android.graphics.Typeface r0 = android.graphics.Typeface.DEFAULT
        L7:
            return r0
    }

    public float getExpansionFraction() {
            r1 = this;
            float r0 = r1.expandedFraction
            return r0
    }

    public float getFadeModeThresholdFraction() {
            r1 = this;
            float r0 = r1.fadeModeThresholdFraction
            return r0
    }

    @androidx.annotation.RequiresApi(23)
    public int getHyphenationFrequency() {
            r1 = this;
            int r0 = r1.hyphenationFrequency
            return r0
    }

    public int getLineCount() {
            r1 = this;
            android.text.StaticLayout r0 = r1.textLayout
            if (r0 == 0) goto L9
            int r0 = r0.getLineCount()
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    @androidx.annotation.RequiresApi(23)
    public float getLineSpacingAdd() {
            r1 = this;
            android.text.StaticLayout r0 = r1.textLayout
            float r0 = r0.getSpacingAdd()
            return r0
    }

    @androidx.annotation.RequiresApi(23)
    public float getLineSpacingMultiplier() {
            r1 = this;
            android.text.StaticLayout r0 = r1.textLayout
            float r0 = r0.getSpacingMultiplier()
            return r0
    }

    public int getMaxLines() {
            r1 = this;
            int r0 = r1.maxLines
            return r0
    }

    @androidx.annotation.Nullable
    public android.animation.TimeInterpolator getPositionInterpolator() {
            r1 = this;
            android.animation.TimeInterpolator r0 = r1.positionInterpolator
            return r0
    }

    @androidx.annotation.Nullable
    public java.lang.CharSequence getText() {
            r1 = this;
            java.lang.CharSequence r0 = r1.text
            return r0
    }

    @androidx.annotation.NonNull
    public android.text.TextUtils.TruncateAt getTitleTextEllipsize() {
            r1 = this;
            android.text.TextUtils$TruncateAt r0 = r1.titleTextEllipsize
            return r0
    }

    public boolean isRtlTextDirectionHeuristicsEnabled() {
            r1 = this;
            boolean r0 = r1.isRtlTextDirectionHeuristicsEnabled
            return r0
    }

    public final boolean isStateful() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.collapsedTextColor
            if (r0 == 0) goto La
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L14
        La:
            android.content.res.ColorStateList r0 = r1.expandedTextColor
            if (r0 == 0) goto L16
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L16
        L14:
            r0 = 1
            goto L17
        L16:
            r0 = 0
        L17:
            return r0
    }

    public void maybeUpdateFontWeightAdjustment(@androidx.annotation.NonNull android.content.res.Configuration r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto L30
            android.graphics.Typeface r0 = r2.collapsedTypefaceDefault
            if (r0 == 0) goto L10
            android.graphics.Typeface r0 = com.google.android.material.resources.TypefaceUtils.maybeCopyWithFontWeightAdjustment(r3, r0)
            r2.collapsedTypefaceBold = r0
        L10:
            android.graphics.Typeface r0 = r2.expandedTypefaceDefault
            if (r0 == 0) goto L1a
            android.graphics.Typeface r3 = com.google.android.material.resources.TypefaceUtils.maybeCopyWithFontWeightAdjustment(r3, r0)
            r2.expandedTypefaceBold = r3
        L1a:
            android.graphics.Typeface r3 = r2.collapsedTypefaceBold
            if (r3 == 0) goto L1f
            goto L21
        L1f:
            android.graphics.Typeface r3 = r2.collapsedTypefaceDefault
        L21:
            r2.collapsedTypeface = r3
            android.graphics.Typeface r3 = r2.expandedTypefaceBold
            if (r3 == 0) goto L28
            goto L2a
        L28:
            android.graphics.Typeface r3 = r2.expandedTypefaceDefault
        L2a:
            r2.expandedTypeface = r3
            r3 = 1
            r2.recalculate(r3)
        L30:
            return
    }

    public void recalculate() {
            r1 = this;
            r0 = 0
            r1.recalculate(r0)
            return
    }

    public void recalculate(boolean r2) {
            r1 = this;
            android.view.View r0 = r1.view
            int r0 = r0.getHeight()
            if (r0 <= 0) goto L10
            android.view.View r0 = r1.view
            int r0 = r0.getWidth()
            if (r0 > 0) goto L12
        L10:
            if (r2 == 0) goto L18
        L12:
            r1.calculateBaseOffsets(r2)
            r1.calculateCurrentOffsets()
        L18:
            return
    }

    public void setCollapsedAndExpandedTextColor(@androidx.annotation.Nullable android.content.res.ColorStateList r2) {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.collapsedTextColor
            if (r0 != r2) goto L8
            android.content.res.ColorStateList r0 = r1.expandedTextColor
            if (r0 == r2) goto Lf
        L8:
            r1.collapsedTextColor = r2
            r1.expandedTextColor = r2
            r1.recalculate()
        Lf:
            return
    }

    public void setCollapsedBounds(int r2, int r3, int r4, int r5) {
            r1 = this;
            android.graphics.Rect r0 = r1.collapsedBounds
            boolean r0 = rectEquals(r0, r2, r3, r4, r5)
            if (r0 != 0) goto L10
            android.graphics.Rect r0 = r1.collapsedBounds
            r0.set(r2, r3, r4, r5)
            r2 = 1
            r1.boundsChanged = r2
        L10:
            return
    }

    public void setCollapsedBounds(@androidx.annotation.NonNull android.graphics.Rect r4) {
            r3 = this;
            int r0 = r4.left
            int r1 = r4.top
            int r2 = r4.right
            int r4 = r4.bottom
            r3.setCollapsedBounds(r0, r1, r2, r4)
            return
    }

    public void setCollapsedTextAppearance(int r4) {
            r3 = this;
            com.google.android.material.resources.TextAppearance r0 = new com.google.android.material.resources.TextAppearance
            android.view.View r1 = r3.view
            android.content.Context r1 = r1.getContext()
            r0.<init>(r1, r4)
            android.content.res.ColorStateList r4 = r0.getTextColor()
            if (r4 == 0) goto L17
            android.content.res.ColorStateList r4 = r0.getTextColor()
            r3.collapsedTextColor = r4
        L17:
            float r4 = r0.getTextSize()
            r1 = 0
            int r4 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r4 == 0) goto L26
            float r4 = r0.getTextSize()
            r3.collapsedTextSize = r4
        L26:
            android.content.res.ColorStateList r4 = r0.shadowColor
            if (r4 == 0) goto L2c
            r3.collapsedShadowColor = r4
        L2c:
            float r4 = r0.shadowDx
            r3.collapsedShadowDx = r4
            float r4 = r0.shadowDy
            r3.collapsedShadowDy = r4
            float r4 = r0.shadowRadius
            r3.collapsedShadowRadius = r4
            float r4 = r0.letterSpacing
            r3.collapsedLetterSpacing = r4
            com.google.android.material.resources.CancelableFontCallback r4 = r3.collapsedFontCallback
            if (r4 == 0) goto L43
            r4.cancel()
        L43:
            com.google.android.material.resources.CancelableFontCallback r4 = new com.google.android.material.resources.CancelableFontCallback
            com.google.android.material.internal.CollapsingTextHelper$1 r1 = new com.google.android.material.internal.CollapsingTextHelper$1
            r1.<init>(r3)
            android.graphics.Typeface r2 = r0.getFallbackFont()
            r4.<init>(r1, r2)
            r3.collapsedFontCallback = r4
            android.view.View r4 = r3.view
            android.content.Context r4 = r4.getContext()
            com.google.android.material.resources.CancelableFontCallback r1 = r3.collapsedFontCallback
            r0.getFontAsync(r4, r1)
            r3.recalculate()
            return
    }

    public void setCollapsedTextColor(android.content.res.ColorStateList r2) {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.collapsedTextColor
            if (r0 == r2) goto L9
            r1.collapsedTextColor = r2
            r1.recalculate()
        L9:
            return
    }

    public void setCollapsedTextGravity(int r2) {
            r1 = this;
            int r0 = r1.collapsedTextGravity
            if (r0 == r2) goto L9
            r1.collapsedTextGravity = r2
            r1.recalculate()
        L9:
            return
    }

    public void setCollapsedTextSize(float r2) {
            r1 = this;
            float r0 = r1.collapsedTextSize
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Lb
            r1.collapsedTextSize = r2
            r1.recalculate()
        Lb:
            return
    }

    public void setCollapsedTypeface(android.graphics.Typeface r1) {
            r0 = this;
            boolean r1 = r0.setCollapsedTypefaceInternal(r1)
            if (r1 == 0) goto L9
            r0.recalculate()
        L9:
            return
    }

    public void setCurrentOffsetY(int r1) {
            r0 = this;
            r0.currentOffsetY = r1
            return
    }

    public void setExpandedBounds(int r2, int r3, int r4, int r5) {
            r1 = this;
            android.graphics.Rect r0 = r1.expandedBounds
            boolean r0 = rectEquals(r0, r2, r3, r4, r5)
            if (r0 != 0) goto L10
            android.graphics.Rect r0 = r1.expandedBounds
            r0.set(r2, r3, r4, r5)
            r2 = 1
            r1.boundsChanged = r2
        L10:
            return
    }

    public void setExpandedBounds(@androidx.annotation.NonNull android.graphics.Rect r4) {
            r3 = this;
            int r0 = r4.left
            int r1 = r4.top
            int r2 = r4.right
            int r4 = r4.bottom
            r3.setExpandedBounds(r0, r1, r2, r4)
            return
    }

    public void setExpandedLetterSpacing(float r2) {
            r1 = this;
            float r0 = r1.expandedLetterSpacing
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Lb
            r1.expandedLetterSpacing = r2
            r1.recalculate()
        Lb:
            return
    }

    public void setExpandedTextAppearance(int r4) {
            r3 = this;
            com.google.android.material.resources.TextAppearance r0 = new com.google.android.material.resources.TextAppearance
            android.view.View r1 = r3.view
            android.content.Context r1 = r1.getContext()
            r0.<init>(r1, r4)
            android.content.res.ColorStateList r4 = r0.getTextColor()
            if (r4 == 0) goto L17
            android.content.res.ColorStateList r4 = r0.getTextColor()
            r3.expandedTextColor = r4
        L17:
            float r4 = r0.getTextSize()
            r1 = 0
            int r4 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r4 == 0) goto L26
            float r4 = r0.getTextSize()
            r3.expandedTextSize = r4
        L26:
            android.content.res.ColorStateList r4 = r0.shadowColor
            if (r4 == 0) goto L2c
            r3.expandedShadowColor = r4
        L2c:
            float r4 = r0.shadowDx
            r3.expandedShadowDx = r4
            float r4 = r0.shadowDy
            r3.expandedShadowDy = r4
            float r4 = r0.shadowRadius
            r3.expandedShadowRadius = r4
            float r4 = r0.letterSpacing
            r3.expandedLetterSpacing = r4
            com.google.android.material.resources.CancelableFontCallback r4 = r3.expandedFontCallback
            if (r4 == 0) goto L43
            r4.cancel()
        L43:
            com.google.android.material.resources.CancelableFontCallback r4 = new com.google.android.material.resources.CancelableFontCallback
            com.google.android.material.internal.CollapsingTextHelper$2 r1 = new com.google.android.material.internal.CollapsingTextHelper$2
            r1.<init>(r3)
            android.graphics.Typeface r2 = r0.getFallbackFont()
            r4.<init>(r1, r2)
            r3.expandedFontCallback = r4
            android.view.View r4 = r3.view
            android.content.Context r4 = r4.getContext()
            com.google.android.material.resources.CancelableFontCallback r1 = r3.expandedFontCallback
            r0.getFontAsync(r4, r1)
            r3.recalculate()
            return
    }

    public void setExpandedTextColor(android.content.res.ColorStateList r2) {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.expandedTextColor
            if (r0 == r2) goto L9
            r1.expandedTextColor = r2
            r1.recalculate()
        L9:
            return
    }

    public void setExpandedTextGravity(int r2) {
            r1 = this;
            int r0 = r1.expandedTextGravity
            if (r0 == r2) goto L9
            r1.expandedTextGravity = r2
            r1.recalculate()
        L9:
            return
    }

    public void setExpandedTextSize(float r2) {
            r1 = this;
            float r0 = r1.expandedTextSize
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Lb
            r1.expandedTextSize = r2
            r1.recalculate()
        Lb:
            return
    }

    public void setExpandedTypeface(android.graphics.Typeface r1) {
            r0 = this;
            boolean r1 = r0.setExpandedTypefaceInternal(r1)
            if (r1 == 0) goto L9
            r0.recalculate()
        L9:
            return
    }

    public void setExpansionFraction(float r3) {
            r2 = this;
            r0 = 0
            r1 = 1065353216(0x3f800000, float:1.0)
            float r3 = androidx.core.math.MathUtils.clamp(r3, r0, r1)
            float r0 = r2.expandedFraction
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 == 0) goto L12
            r2.expandedFraction = r3
            r2.calculateCurrentOffsets()
        L12:
            return
    }

    public void setFadeModeEnabled(boolean r1) {
            r0 = this;
            r0.fadeModeEnabled = r1
            return
    }

    public void setFadeModeStartFraction(float r1) {
            r0 = this;
            r0.fadeModeStartFraction = r1
            float r1 = r0.calculateFadeModeThresholdFraction()
            r0.fadeModeThresholdFraction = r1
            return
    }

    @androidx.annotation.RequiresApi(23)
    public void setHyphenationFrequency(int r1) {
            r0 = this;
            r0.hyphenationFrequency = r1
            return
    }

    @androidx.annotation.RequiresApi(23)
    public void setLineSpacingAdd(float r1) {
            r0 = this;
            r0.lineSpacingAdd = r1
            return
    }

    @androidx.annotation.RequiresApi(23)
    public void setLineSpacingMultiplier(@androidx.annotation.FloatRange(from = 0.0d) float r1) {
            r0 = this;
            r0.lineSpacingMultiplier = r1
            return
    }

    public void setMaxLines(int r2) {
            r1 = this;
            int r0 = r1.maxLines
            if (r2 == r0) goto Lc
            r1.maxLines = r2
            r1.clearTexture()
            r1.recalculate()
        Lc:
            return
    }

    public void setPositionInterpolator(android.animation.TimeInterpolator r1) {
            r0 = this;
            r0.positionInterpolator = r1
            r0.recalculate()
            return
    }

    public void setRtlTextDirectionHeuristicsEnabled(boolean r1) {
            r0 = this;
            r0.isRtlTextDirectionHeuristicsEnabled = r1
            return
    }

    public final boolean setState(int[] r1) {
            r0 = this;
            r0.state = r1
            boolean r1 = r0.isStateful()
            if (r1 == 0) goto Ld
            r0.recalculate()
            r1 = 1
            return r1
        Ld:
            r1 = 0
            return r1
    }

    @androidx.annotation.RequiresApi(23)
    public void setStaticLayoutBuilderConfigurer(@androidx.annotation.Nullable com.google.android.material.internal.StaticLayoutBuilderConfigurer r2) {
            r1 = this;
            com.google.android.material.internal.StaticLayoutBuilderConfigurer r0 = r1.staticLayoutBuilderConfigurer
            if (r0 == r2) goto La
            r1.staticLayoutBuilderConfigurer = r2
            r2 = 1
            r1.recalculate(r2)
        La:
            return
    }

    public void setText(@androidx.annotation.Nullable java.lang.CharSequence r2) {
            r1 = this;
            if (r2 == 0) goto La
            java.lang.CharSequence r0 = r1.text
            boolean r0 = android.text.TextUtils.equals(r0, r2)
            if (r0 != 0) goto L15
        La:
            r1.text = r2
            r2 = 0
            r1.textToDraw = r2
            r1.clearTexture()
            r1.recalculate()
        L15:
            return
    }

    public void setTextSizeInterpolator(android.animation.TimeInterpolator r1) {
            r0 = this;
            r0.textSizeInterpolator = r1
            r0.recalculate()
            return
    }

    public void setTitleTextEllipsize(@androidx.annotation.NonNull android.text.TextUtils.TruncateAt r1) {
            r0 = this;
            r0.titleTextEllipsize = r1
            r0.recalculate()
            return
    }

    public void setTypefaces(android.graphics.Typeface r2) {
            r1 = this;
            boolean r0 = r1.setCollapsedTypefaceInternal(r2)
            boolean r2 = r1.setExpandedTypefaceInternal(r2)
            if (r0 != 0) goto Lc
            if (r2 == 0) goto Lf
        Lc:
            r1.recalculate()
        Lf:
            return
    }
}
