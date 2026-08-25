package com.google.android.exoplayer2.text.ttml;

/* JADX INFO: loaded from: classes3.dex */
final class TtmlStyle {
    public static final int FONT_SIZE_UNIT_EM = 2;
    public static final int FONT_SIZE_UNIT_PERCENT = 3;
    public static final int FONT_SIZE_UNIT_PIXEL = 1;
    private static final int OFF = 0;
    private static final int ON = 1;
    public static final int RUBY_TYPE_BASE = 2;
    public static final int RUBY_TYPE_CONTAINER = 1;
    public static final int RUBY_TYPE_DELIMITER = 4;
    public static final int RUBY_TYPE_TEXT = 3;
    public static final int STYLE_BOLD = 1;
    public static final int STYLE_BOLD_ITALIC = 3;
    public static final int STYLE_ITALIC = 2;
    public static final int STYLE_NORMAL = 0;
    public static final int UNSPECIFIED = -1;
    public static final float UNSPECIFIED_SHEAR = Float.MAX_VALUE;
    private int backgroundColor;
    private int bold;
    private int fontColor;

    @androidx.annotation.Nullable
    private java.lang.String fontFamily;
    private float fontSize;
    private int fontSizeUnit;
    private boolean hasBackgroundColor;
    private boolean hasFontColor;

    @androidx.annotation.Nullable
    private java.lang.String id;
    private int italic;
    private int linethrough;

    @androidx.annotation.Nullable
    private android.text.Layout.Alignment multiRowAlign;
    private int rubyPosition;
    private int rubyType;
    private float shearPercentage;

    @androidx.annotation.Nullable
    private android.text.Layout.Alignment textAlign;
    private int textCombine;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.text.ttml.TextEmphasis textEmphasis;
    private int underline;

    /* JADX INFO: loaded from: classes2.dex */
    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface FontSizeUnit {
    }

    /* JADX INFO: loaded from: classes.dex */
    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface RubyType {
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface StyleFlags {
    }

    public TtmlStyle() {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.linethrough = r0
            r1.underline = r0
            r1.bold = r0
            r1.italic = r0
            r1.fontSizeUnit = r0
            r1.rubyType = r0
            r1.rubyPosition = r0
            r1.textCombine = r0
            r0 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r1.shearPercentage = r0
            return
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    private com.google.android.exoplayer2.text.ttml.TtmlStyle inherit(@androidx.annotation.Nullable com.google.android.exoplayer2.text.ttml.TtmlStyle r4, boolean r5) {
            r3 = this;
            if (r4 == 0) goto L9a
            boolean r0 = r3.hasFontColor
            if (r0 != 0) goto Lf
            boolean r0 = r4.hasFontColor
            if (r0 == 0) goto Lf
            int r0 = r4.fontColor
            r3.setFontColor(r0)
        Lf:
            int r0 = r3.bold
            r1 = -1
            if (r0 != r1) goto L18
            int r0 = r4.bold
            r3.bold = r0
        L18:
            int r0 = r3.italic
            if (r0 != r1) goto L20
            int r0 = r4.italic
            r3.italic = r0
        L20:
            java.lang.String r0 = r3.fontFamily
            if (r0 != 0) goto L2a
            java.lang.String r0 = r4.fontFamily
            if (r0 == 0) goto L2a
            r3.fontFamily = r0
        L2a:
            int r0 = r3.linethrough
            if (r0 != r1) goto L32
            int r0 = r4.linethrough
            r3.linethrough = r0
        L32:
            int r0 = r3.underline
            if (r0 != r1) goto L3a
            int r0 = r4.underline
            r3.underline = r0
        L3a:
            int r0 = r3.rubyPosition
            if (r0 != r1) goto L42
            int r0 = r4.rubyPosition
            r3.rubyPosition = r0
        L42:
            android.text.Layout$Alignment r0 = r3.textAlign
            if (r0 != 0) goto L4c
            android.text.Layout$Alignment r0 = r4.textAlign
            if (r0 == 0) goto L4c
            r3.textAlign = r0
        L4c:
            android.text.Layout$Alignment r0 = r3.multiRowAlign
            if (r0 != 0) goto L56
            android.text.Layout$Alignment r0 = r4.multiRowAlign
            if (r0 == 0) goto L56
            r3.multiRowAlign = r0
        L56:
            int r0 = r3.textCombine
            if (r0 != r1) goto L5e
            int r0 = r4.textCombine
            r3.textCombine = r0
        L5e:
            int r0 = r3.fontSizeUnit
            if (r0 != r1) goto L6a
            int r0 = r4.fontSizeUnit
            r3.fontSizeUnit = r0
            float r0 = r4.fontSize
            r3.fontSize = r0
        L6a:
            com.google.android.exoplayer2.text.ttml.TextEmphasis r0 = r3.textEmphasis
            if (r0 != 0) goto L72
            com.google.android.exoplayer2.text.ttml.TextEmphasis r0 = r4.textEmphasis
            r3.textEmphasis = r0
        L72:
            float r0 = r3.shearPercentage
            r2 = 2139095039(0x7f7fffff, float:3.4028235E38)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L7f
            float r0 = r4.shearPercentage
            r3.shearPercentage = r0
        L7f:
            if (r5 == 0) goto L8e
            boolean r0 = r3.hasBackgroundColor
            if (r0 != 0) goto L8e
            boolean r0 = r4.hasBackgroundColor
            if (r0 == 0) goto L8e
            int r0 = r4.backgroundColor
            r3.setBackgroundColor(r0)
        L8e:
            if (r5 == 0) goto L9a
            int r5 = r3.rubyType
            if (r5 != r1) goto L9a
            int r4 = r4.rubyType
            if (r4 == r1) goto L9a
            r3.rubyType = r4
        L9a:
            return r3
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.exoplayer2.text.ttml.TtmlStyle chain(@androidx.annotation.Nullable com.google.android.exoplayer2.text.ttml.TtmlStyle r2) {
            r1 = this;
            r0 = 1
            com.google.android.exoplayer2.text.ttml.TtmlStyle r2 = r1.inherit(r2, r0)
            return r2
    }

    public int getBackgroundColor() {
            r2 = this;
            boolean r0 = r2.hasBackgroundColor
            if (r0 == 0) goto L7
            int r0 = r2.backgroundColor
            return r0
        L7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Background color has not been defined."
            r0.<init>(r1)
            throw r0
    }

    public int getFontColor() {
            r2 = this;
            boolean r0 = r2.hasFontColor
            if (r0 == 0) goto L7
            int r0 = r2.fontColor
            return r0
        L7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Font color has not been defined."
            r0.<init>(r1)
            throw r0
    }

    @androidx.annotation.Nullable
    public java.lang.String getFontFamily() {
            r1 = this;
            java.lang.String r0 = r1.fontFamily
            return r0
    }

    public float getFontSize() {
            r1 = this;
            float r0 = r1.fontSize
            return r0
    }

    public int getFontSizeUnit() {
            r1 = this;
            int r0 = r1.fontSizeUnit
            return r0
    }

    @androidx.annotation.Nullable
    public java.lang.String getId() {
            r1 = this;
            java.lang.String r0 = r1.id
            return r0
    }

    @androidx.annotation.Nullable
    public android.text.Layout.Alignment getMultiRowAlign() {
            r1 = this;
            android.text.Layout$Alignment r0 = r1.multiRowAlign
            return r0
    }

    public int getRubyPosition() {
            r1 = this;
            int r0 = r1.rubyPosition
            return r0
    }

    public int getRubyType() {
            r1 = this;
            int r0 = r1.rubyType
            return r0
    }

    public float getShearPercentage() {
            r1 = this;
            float r0 = r1.shearPercentage
            return r0
    }

    public int getStyle() {
            r4 = this;
            int r0 = r4.bold
            r1 = -1
            if (r0 != r1) goto La
            int r2 = r4.italic
            if (r2 != r1) goto La
            return r1
        La:
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            int r3 = r4.italic
            if (r3 != r2) goto L16
            r1 = 2
        L16:
            r0 = r0 | r1
            return r0
    }

    @androidx.annotation.Nullable
    public android.text.Layout.Alignment getTextAlign() {
            r1 = this;
            android.text.Layout$Alignment r0 = r1.textAlign
            return r0
    }

    public boolean getTextCombine() {
            r2 = this;
            int r0 = r2.textCombine
            r1 = 1
            if (r0 != r1) goto L6
            goto L7
        L6:
            r1 = 0
        L7:
            return r1
    }

    @androidx.annotation.Nullable
    public com.google.android.exoplayer2.text.ttml.TextEmphasis getTextEmphasis() {
            r1 = this;
            com.google.android.exoplayer2.text.ttml.TextEmphasis r0 = r1.textEmphasis
            return r0
    }

    public boolean hasBackgroundColor() {
            r1 = this;
            boolean r0 = r1.hasBackgroundColor
            return r0
    }

    public boolean hasFontColor() {
            r1 = this;
            boolean r0 = r1.hasFontColor
            return r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.exoplayer2.text.ttml.TtmlStyle inherit(@androidx.annotation.Nullable com.google.android.exoplayer2.text.ttml.TtmlStyle r2) {
            r1 = this;
            r0 = 0
            com.google.android.exoplayer2.text.ttml.TtmlStyle r2 = r1.inherit(r2, r0)
            return r2
    }

    public boolean isLinethrough() {
            r2 = this;
            int r0 = r2.linethrough
            r1 = 1
            if (r0 != r1) goto L6
            goto L7
        L6:
            r1 = 0
        L7:
            return r1
    }

    public boolean isUnderline() {
            r2 = this;
            int r0 = r2.underline
            r1 = 1
            if (r0 != r1) goto L6
            goto L7
        L6:
            r1 = 0
        L7:
            return r1
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.exoplayer2.text.ttml.TtmlStyle setBackgroundColor(int r1) {
            r0 = this;
            r0.backgroundColor = r1
            r1 = 1
            r0.hasBackgroundColor = r1
            return r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.exoplayer2.text.ttml.TtmlStyle setBold(boolean r1) {
            r0 = this;
            r0.bold = r1
            return r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.exoplayer2.text.ttml.TtmlStyle setFontColor(int r1) {
            r0 = this;
            r0.fontColor = r1
            r1 = 1
            r0.hasFontColor = r1
            return r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.exoplayer2.text.ttml.TtmlStyle setFontFamily(@androidx.annotation.Nullable java.lang.String r1) {
            r0 = this;
            r0.fontFamily = r1
            return r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.exoplayer2.text.ttml.TtmlStyle setFontSize(float r1) {
            r0 = this;
            r0.fontSize = r1
            return r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.exoplayer2.text.ttml.TtmlStyle setFontSizeUnit(int r1) {
            r0 = this;
            r0.fontSizeUnit = r1
            return r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.exoplayer2.text.ttml.TtmlStyle setId(@androidx.annotation.Nullable java.lang.String r1) {
            r0 = this;
            r0.id = r1
            return r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.exoplayer2.text.ttml.TtmlStyle setItalic(boolean r1) {
            r0 = this;
            r0.italic = r1
            return r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.exoplayer2.text.ttml.TtmlStyle setLinethrough(boolean r1) {
            r0 = this;
            r0.linethrough = r1
            return r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.exoplayer2.text.ttml.TtmlStyle setMultiRowAlign(@androidx.annotation.Nullable android.text.Layout.Alignment r1) {
            r0 = this;
            r0.multiRowAlign = r1
            return r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.exoplayer2.text.ttml.TtmlStyle setRubyPosition(int r1) {
            r0 = this;
            r0.rubyPosition = r1
            return r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.exoplayer2.text.ttml.TtmlStyle setRubyType(int r1) {
            r0 = this;
            r0.rubyType = r1
            return r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.exoplayer2.text.ttml.TtmlStyle setShearPercentage(float r1) {
            r0 = this;
            r0.shearPercentage = r1
            return r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.exoplayer2.text.ttml.TtmlStyle setTextAlign(@androidx.annotation.Nullable android.text.Layout.Alignment r1) {
            r0 = this;
            r0.textAlign = r1
            return r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.exoplayer2.text.ttml.TtmlStyle setTextCombine(boolean r1) {
            r0 = this;
            r0.textCombine = r1
            return r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.exoplayer2.text.ttml.TtmlStyle setTextEmphasis(@androidx.annotation.Nullable com.google.android.exoplayer2.text.ttml.TextEmphasis r1) {
            r0 = this;
            r0.textEmphasis = r1
            return r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.exoplayer2.text.ttml.TtmlStyle setUnderline(boolean r1) {
            r0 = this;
            r0.underline = r1
            return r0
    }
}
