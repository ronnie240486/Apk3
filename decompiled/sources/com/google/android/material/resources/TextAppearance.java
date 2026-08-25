package com.google.android.material.resources;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public class TextAppearance {
    private static final java.lang.String TAG = "TextAppearance";
    private static final int TYPEFACE_MONOSPACE = 3;
    private static final int TYPEFACE_SANS = 1;
    private static final int TYPEFACE_SERIF = 2;
    private android.graphics.Typeface font;

    @androidx.annotation.Nullable
    public final java.lang.String fontFamily;

    @androidx.annotation.FontRes
    private final int fontFamilyResourceId;
    private boolean fontResolved;
    public final boolean hasLetterSpacing;
    public final float letterSpacing;

    @androidx.annotation.Nullable
    public final android.content.res.ColorStateList shadowColor;
    public final float shadowDx;
    public final float shadowDy;
    public final float shadowRadius;
    public final boolean textAllCaps;

    @androidx.annotation.Nullable
    private android.content.res.ColorStateList textColor;

    @androidx.annotation.Nullable
    public final android.content.res.ColorStateList textColorHint;

    @androidx.annotation.Nullable
    public final android.content.res.ColorStateList textColorLink;
    private float textSize;
    public final int textStyle;
    public final int typeface;



    public TextAppearance(@androidx.annotation.NonNull android.content.Context r7, @androidx.annotation.StyleRes int r8) {
            r6 = this;
            r6.<init>()
            r0 = 0
            r6.fontResolved = r0
            int[] r1 = com.google.android.material.R.styleable.TextAppearance
            android.content.res.TypedArray r1 = r7.obtainStyledAttributes(r8, r1)
            int r2 = com.google.android.material.R.styleable.TextAppearance_android_textSize
            r3 = 0
            float r2 = r1.getDimension(r2, r3)
            r6.setTextSize(r2)
            int r2 = com.google.android.material.R.styleable.TextAppearance_android_textColor
            android.content.res.ColorStateList r2 = com.google.android.material.resources.MaterialResources.getColorStateList(r7, r1, r2)
            r6.setTextColor(r2)
            int r2 = com.google.android.material.R.styleable.TextAppearance_android_textColorHint
            android.content.res.ColorStateList r2 = com.google.android.material.resources.MaterialResources.getColorStateList(r7, r1, r2)
            r6.textColorHint = r2
            int r2 = com.google.android.material.R.styleable.TextAppearance_android_textColorLink
            android.content.res.ColorStateList r2 = com.google.android.material.resources.MaterialResources.getColorStateList(r7, r1, r2)
            r6.textColorLink = r2
            int r2 = com.google.android.material.R.styleable.TextAppearance_android_textStyle
            int r2 = r1.getInt(r2, r0)
            r6.textStyle = r2
            int r2 = com.google.android.material.R.styleable.TextAppearance_android_typeface
            r4 = 1
            int r2 = r1.getInt(r2, r4)
            r6.typeface = r2
            int r2 = com.google.android.material.R.styleable.TextAppearance_fontFamily
            int r4 = com.google.android.material.R.styleable.TextAppearance_android_fontFamily
            boolean r5 = r1.hasValue(r2)
            if (r5 == 0) goto L4b
            goto L4c
        L4b:
            r2 = r4
        L4c:
            int r4 = r1.getResourceId(r2, r0)
            r6.fontFamilyResourceId = r4
            java.lang.String r2 = r1.getString(r2)
            r6.fontFamily = r2
            int r2 = com.google.android.material.R.styleable.TextAppearance_textAllCaps
            boolean r0 = r1.getBoolean(r2, r0)
            r6.textAllCaps = r0
            int r0 = com.google.android.material.R.styleable.TextAppearance_android_shadowColor
            android.content.res.ColorStateList r0 = com.google.android.material.resources.MaterialResources.getColorStateList(r7, r1, r0)
            r6.shadowColor = r0
            int r0 = com.google.android.material.R.styleable.TextAppearance_android_shadowDx
            float r0 = r1.getFloat(r0, r3)
            r6.shadowDx = r0
            int r0 = com.google.android.material.R.styleable.TextAppearance_android_shadowDy
            float r0 = r1.getFloat(r0, r3)
            r6.shadowDy = r0
            int r0 = com.google.android.material.R.styleable.TextAppearance_android_shadowRadius
            float r0 = r1.getFloat(r0, r3)
            r6.shadowRadius = r0
            r1.recycle()
            int[] r0 = com.google.android.material.R.styleable.MaterialTextAppearance
            android.content.res.TypedArray r7 = r7.obtainStyledAttributes(r8, r0)
            int r8 = com.google.android.material.R.styleable.MaterialTextAppearance_android_letterSpacing
            boolean r0 = r7.hasValue(r8)
            r6.hasLetterSpacing = r0
            float r8 = r7.getFloat(r8, r3)
            r6.letterSpacing = r8
            r7.recycle()
            return
    }

    public static /* synthetic */ android.graphics.Typeface access$000(com.google.android.material.resources.TextAppearance r0) {
            android.graphics.Typeface r0 = r0.font
            return r0
    }

    public static /* synthetic */ android.graphics.Typeface access$002(com.google.android.material.resources.TextAppearance r0, android.graphics.Typeface r1) {
            r0.font = r1
            return r1
    }

    public static /* synthetic */ void access$102(com.google.android.material.resources.TextAppearance r1) {
            r0 = 1
            r1.fontResolved = r0
            return
    }

    private void createFallbackFont() {
            r2 = this;
            android.graphics.Typeface r0 = r2.font
            if (r0 != 0) goto L10
            java.lang.String r0 = r2.fontFamily
            if (r0 == 0) goto L10
            int r1 = r2.textStyle
            android.graphics.Typeface r0 = android.graphics.Typeface.create(r0, r1)
            r2.font = r0
        L10:
            android.graphics.Typeface r0 = r2.font
            if (r0 != 0) goto L3c
            int r0 = r2.typeface
            r1 = 1
            if (r0 == r1) goto L2e
            r1 = 2
            if (r0 == r1) goto L29
            r1 = 3
            if (r0 == r1) goto L24
            android.graphics.Typeface r0 = android.graphics.Typeface.DEFAULT
            r2.font = r0
            goto L32
        L24:
            android.graphics.Typeface r0 = android.graphics.Typeface.MONOSPACE
            r2.font = r0
            goto L32
        L29:
            android.graphics.Typeface r0 = android.graphics.Typeface.SERIF
            r2.font = r0
            goto L32
        L2e:
            android.graphics.Typeface r0 = android.graphics.Typeface.SANS_SERIF
            r2.font = r0
        L32:
            android.graphics.Typeface r0 = r2.font
            int r1 = r2.textStyle
            android.graphics.Typeface r0 = android.graphics.Typeface.create(r0, r1)
            r2.font = r0
        L3c:
            return
    }

    private boolean shouldLoadFontSynchronously(android.content.Context r3) {
            r2 = this;
            boolean r0 = com.google.android.material.resources.TextAppearanceConfig.shouldLoadFontSynchronously()
            r1 = 1
            if (r0 == 0) goto L8
            return r1
        L8:
            int r0 = r2.fontFamilyResourceId
            if (r0 == 0) goto L11
            android.graphics.Typeface r3 = androidx.core.content.res.ResourcesCompat.getCachedFont(r3, r0)
            goto L12
        L11:
            r3 = 0
        L12:
            if (r3 == 0) goto L15
            goto L16
        L15:
            r1 = 0
        L16:
            return r1
    }

    public android.graphics.Typeface getFallbackFont() {
            r1 = this;
            r1.createFallbackFont()
            android.graphics.Typeface r0 = r1.font
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.VisibleForTesting
    public android.graphics.Typeface getFont(@androidx.annotation.NonNull android.content.Context r3) {
            r2 = this;
            boolean r0 = r2.fontResolved
            if (r0 == 0) goto L7
            android.graphics.Typeface r3 = r2.font
            return r3
        L7:
            boolean r0 = r3.isRestricted()
            if (r0 != 0) goto L35
            int r0 = r2.fontFamilyResourceId     // Catch: java.lang.Exception -> L20 java.lang.Throwable -> L35
            android.graphics.Typeface r3 = androidx.core.content.res.ResourcesCompat.getFont(r3, r0)     // Catch: java.lang.Exception -> L20 java.lang.Throwable -> L35
            r2.font = r3     // Catch: java.lang.Exception -> L20 java.lang.Throwable -> L35
            if (r3 == 0) goto L35
            int r0 = r2.textStyle     // Catch: java.lang.Exception -> L20 java.lang.Throwable -> L35
            android.graphics.Typeface r3 = android.graphics.Typeface.create(r3, r0)     // Catch: java.lang.Exception -> L20 java.lang.Throwable -> L35
            r2.font = r3     // Catch: java.lang.Exception -> L20 java.lang.Throwable -> L35
            goto L35
        L20:
            r3 = move-exception
            java.lang.String r0 = "Error loading font "
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            java.lang.String r1 = r2.fontFamily
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "TextAppearance"
            android.util.Log.d(r1, r0, r3)
        L35:
            r2.createFallbackFont()
            r3 = 1
            r2.fontResolved = r3
            android.graphics.Typeface r3 = r2.font
            return r3
    }

    public void getFontAsync(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.NonNull android.text.TextPaint r3, @androidx.annotation.NonNull com.google.android.material.resources.TextAppearanceFontCallback r4) {
            r1 = this;
            android.graphics.Typeface r0 = r1.getFallbackFont()
            r1.updateTextPaintMeasureState(r2, r3, r0)
            com.google.android.material.resources.TextAppearance$2 r0 = new com.google.android.material.resources.TextAppearance$2
            r0.<init>(r1, r2, r3, r4)
            r1.getFontAsync(r2, r0)
            return
    }

    public void getFontAsync(@androidx.annotation.NonNull android.content.Context r5, @androidx.annotation.NonNull com.google.android.material.resources.TextAppearanceFontCallback r6) {
            r4 = this;
            boolean r0 = r4.shouldLoadFontSynchronously(r5)
            if (r0 == 0) goto La
            r4.getFont(r5)
            goto Ld
        La:
            r4.createFallbackFont()
        Ld:
            int r0 = r4.fontFamilyResourceId
            r1 = 1
            if (r0 != 0) goto L14
            r4.fontResolved = r1
        L14:
            boolean r2 = r4.fontResolved
            if (r2 == 0) goto L1e
            android.graphics.Typeface r5 = r4.font
            r6.onFontRetrieved(r5, r1)
            return
        L1e:
            com.google.android.material.resources.TextAppearance$1 r2 = new com.google.android.material.resources.TextAppearance$1     // Catch: java.lang.Exception -> L28 android.content.res.Resources.NotFoundException -> L44
            r2.<init>(r4, r6)     // Catch: java.lang.Exception -> L28 android.content.res.Resources.NotFoundException -> L44
            r3 = 0
            androidx.core.content.res.ResourcesCompat.getFont(r5, r0, r2, r3)     // Catch: java.lang.Exception -> L28 android.content.res.Resources.NotFoundException -> L44
            goto L49
        L28:
            r5 = move-exception
            java.lang.String r0 = "Error loading font "
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            java.lang.String r2 = r4.fontFamily
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "TextAppearance"
            android.util.Log.d(r2, r0, r5)
            r4.fontResolved = r1
            r5 = -3
            r6.onFontRetrievalFailed(r5)
            goto L49
        L44:
            r4.fontResolved = r1
            r6.onFontRetrievalFailed(r1)
        L49:
            return
    }

    @androidx.annotation.Nullable
    public android.content.res.ColorStateList getTextColor() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.textColor
            return r0
    }

    public float getTextSize() {
            r1 = this;
            float r0 = r1.textSize
            return r0
    }

    public void setTextColor(@androidx.annotation.Nullable android.content.res.ColorStateList r1) {
            r0 = this;
            r0.textColor = r1
            return
    }

    public void setTextSize(float r1) {
            r0 = this;
            r0.textSize = r1
            return
    }

    public void updateDrawState(@androidx.annotation.NonNull android.content.Context r5, @androidx.annotation.NonNull android.text.TextPaint r6, @androidx.annotation.NonNull com.google.android.material.resources.TextAppearanceFontCallback r7) {
            r4 = this;
            r4.updateMeasureState(r5, r6, r7)
            android.content.res.ColorStateList r5 = r4.textColor
            if (r5 == 0) goto L12
            int[] r7 = r6.drawableState
            int r0 = r5.getDefaultColor()
            int r5 = r5.getColorForState(r7, r0)
            goto L14
        L12:
            r5 = -16777216(0xffffffffff000000, float:-1.7014118E38)
        L14:
            r6.setColor(r5)
            float r5 = r4.shadowRadius
            float r7 = r4.shadowDx
            float r0 = r4.shadowDy
            android.content.res.ColorStateList r1 = r4.shadowColor
            if (r1 == 0) goto L2c
            int[] r2 = r6.drawableState
            int r3 = r1.getDefaultColor()
            int r1 = r1.getColorForState(r2, r3)
            goto L2d
        L2c:
            r1 = 0
        L2d:
            r6.setShadowLayer(r5, r7, r0, r1)
            return
    }

    public void updateMeasureState(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.NonNull android.text.TextPaint r3, @androidx.annotation.NonNull com.google.android.material.resources.TextAppearanceFontCallback r4) {
            r1 = this;
            boolean r0 = r1.shouldLoadFontSynchronously(r2)
            if (r0 == 0) goto Le
            android.graphics.Typeface r4 = r1.getFont(r2)
            r1.updateTextPaintMeasureState(r2, r3, r4)
            goto L11
        Le:
            r1.getFontAsync(r2, r3, r4)
        L11:
            return
    }

    public void updateTextPaintMeasureState(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.NonNull android.text.TextPaint r2, @androidx.annotation.NonNull android.graphics.Typeface r3) {
            r0 = this;
            android.graphics.Typeface r1 = com.google.android.material.resources.TypefaceUtils.maybeCopyWithFontWeightAdjustment(r1, r3)
            if (r1 == 0) goto L7
            r3 = r1
        L7:
            r2.setTypeface(r3)
            int r1 = r0.textStyle
            int r3 = r3.getStyle()
            int r3 = ~r3
            r1 = r1 & r3
            r3 = r1 & 1
            if (r3 == 0) goto L18
            r3 = 1
            goto L19
        L18:
            r3 = 0
        L19:
            r2.setFakeBoldText(r3)
            r1 = r1 & 2
            if (r1 == 0) goto L23
            r1 = -1098907648(0xffffffffbe800000, float:-0.25)
            goto L24
        L23:
            r1 = 0
        L24:
            r2.setTextSkewX(r1)
            float r1 = r0.textSize
            r2.setTextSize(r1)
            boolean r1 = r0.hasLetterSpacing
            if (r1 == 0) goto L35
            float r1 = r0.letterSpacing
            r2.setLetterSpacing(r1)
        L35:
            return
    }
}
