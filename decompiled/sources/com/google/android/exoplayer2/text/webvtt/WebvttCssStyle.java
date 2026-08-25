package com.google.android.exoplayer2.text.webvtt;

/* JADX INFO: loaded from: classes2.dex */
public final class WebvttCssStyle {
    public static final int FONT_SIZE_UNIT_EM = 2;
    public static final int FONT_SIZE_UNIT_PERCENT = 3;
    public static final int FONT_SIZE_UNIT_PIXEL = 1;
    private static final int OFF = 0;
    private static final int ON = 1;
    public static final int STYLE_BOLD = 1;
    public static final int STYLE_BOLD_ITALIC = 3;
    public static final int STYLE_ITALIC = 2;
    public static final int STYLE_NORMAL = 0;
    public static final int UNSPECIFIED = -1;
    private int backgroundColor;
    private int bold;
    private boolean combineUpright;

    @androidx.annotation.ColorInt
    private int fontColor;

    @androidx.annotation.Nullable
    private java.lang.String fontFamily;
    private float fontSize;
    private int fontSizeUnit;
    private boolean hasBackgroundColor;
    private boolean hasFontColor;
    private int italic;
    private int linethrough;
    private int rubyPosition;
    private java.util.Set<java.lang.String> targetClasses;
    private java.lang.String targetId;
    private java.lang.String targetTag;
    private java.lang.String targetVoice;
    private int underline;

    /* JADX INFO: loaded from: classes3.dex */
    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface FontSizeUnit {
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface StyleFlags {
    }

    public WebvttCssStyle() {
            r2 = this;
            r2.<init>()
            java.lang.String r0 = ""
            r2.targetId = r0
            r2.targetTag = r0
            java.util.Set r1 = java.util.Collections.emptySet()
            r2.targetClasses = r1
            r2.targetVoice = r0
            r0 = 0
            r2.fontFamily = r0
            r0 = 0
            r2.hasFontColor = r0
            r2.hasBackgroundColor = r0
            r1 = -1
            r2.linethrough = r1
            r2.underline = r1
            r2.bold = r1
            r2.italic = r1
            r2.fontSizeUnit = r1
            r2.rubyPosition = r1
            r2.combineUpright = r0
            return
    }

    private static int updateScoreForMatch(int r1, java.lang.String r2, @androidx.annotation.Nullable java.lang.String r3, int r4) {
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L13
            r0 = -1
            if (r1 != r0) goto La
            goto L13
        La:
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L12
            int r0 = r1 + r4
        L12:
            return r0
        L13:
            return r1
    }

    public int getBackgroundColor() {
            r2 = this;
            boolean r0 = r2.hasBackgroundColor
            if (r0 == 0) goto L7
            int r0 = r2.backgroundColor
            return r0
        L7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Background color not defined."
            r0.<init>(r1)
            throw r0
    }

    public boolean getCombineUpright() {
            r1 = this;
            boolean r0 = r1.combineUpright
            return r0
    }

    public int getFontColor() {
            r2 = this;
            boolean r0 = r2.hasFontColor
            if (r0 == 0) goto L7
            int r0 = r2.fontColor
            return r0
        L7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Font color not defined"
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

    public int getRubyPosition() {
            r1 = this;
            int r0 = r1.rubyPosition
            return r0
    }

    public int getSpecificityScore(@androidx.annotation.Nullable java.lang.String r4, @androidx.annotation.Nullable java.lang.String r5, java.util.Set<java.lang.String> r6, @androidx.annotation.Nullable java.lang.String r7) {
            r3 = this;
            java.lang.String r0 = r3.targetId
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L25
            java.lang.String r0 = r3.targetTag
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L25
            java.util.Set<java.lang.String> r0 = r3.targetClasses
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L25
            java.lang.String r0 = r3.targetVoice
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L25
            boolean r4 = android.text.TextUtils.isEmpty(r5)
            return r4
        L25:
            java.lang.String r0 = r3.targetId
            r1 = 1073741824(0x40000000, float:2.0)
            r2 = 0
            int r4 = updateScoreForMatch(r2, r0, r4, r1)
            java.lang.String r0 = r3.targetTag
            r1 = 2
            int r4 = updateScoreForMatch(r4, r0, r5, r1)
            java.lang.String r5 = r3.targetVoice
            r0 = 4
            int r4 = updateScoreForMatch(r4, r5, r7, r0)
            r5 = -1
            if (r4 == r5) goto L52
            java.util.Set<java.lang.String> r5 = r3.targetClasses
            boolean r5 = r6.containsAll(r5)
            if (r5 != 0) goto L48
            goto L52
        L48:
            java.util.Set<java.lang.String> r5 = r3.targetClasses
            int r5 = r5.size()
            int r5 = r5 * 4
            int r5 = r5 + r4
            return r5
        L52:
            return r2
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
    public com.google.android.exoplayer2.text.webvtt.WebvttCssStyle setBackgroundColor(int r1) {
            r0 = this;
            r0.backgroundColor = r1
            r1 = 1
            r0.hasBackgroundColor = r1
            return r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.exoplayer2.text.webvtt.WebvttCssStyle setBold(boolean r1) {
            r0 = this;
            r0.bold = r1
            return r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.exoplayer2.text.webvtt.WebvttCssStyle setCombineUpright(boolean r1) {
            r0 = this;
            r0.combineUpright = r1
            return r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.exoplayer2.text.webvtt.WebvttCssStyle setFontColor(int r1) {
            r0 = this;
            r0.fontColor = r1
            r1 = 1
            r0.hasFontColor = r1
            return r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.exoplayer2.text.webvtt.WebvttCssStyle setFontFamily(@androidx.annotation.Nullable java.lang.String r1) {
            r0 = this;
            if (r1 != 0) goto L4
            r1 = 0
            goto L8
        L4:
            java.lang.String r1 = com.google.common.base.Ascii.toLowerCase(r1)
        L8:
            r0.fontFamily = r1
            return r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.exoplayer2.text.webvtt.WebvttCssStyle setFontSize(float r1) {
            r0 = this;
            r0.fontSize = r1
            return r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.exoplayer2.text.webvtt.WebvttCssStyle setFontSizeUnit(int r1) {
            r0 = this;
            r0.fontSizeUnit = r1
            return r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.exoplayer2.text.webvtt.WebvttCssStyle setItalic(boolean r1) {
            r0 = this;
            r0.italic = r1
            return r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.exoplayer2.text.webvtt.WebvttCssStyle setLinethrough(boolean r1) {
            r0 = this;
            r0.linethrough = r1
            return r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.exoplayer2.text.webvtt.WebvttCssStyle setRubyPosition(int r1) {
            r0 = this;
            r0.rubyPosition = r1
            return r0
    }

    public void setTargetClasses(java.lang.String[] r2) {
            r1 = this;
            java.util.HashSet r0 = new java.util.HashSet
            java.util.List r2 = java.util.Arrays.asList(r2)
            r0.<init>(r2)
            r1.targetClasses = r0
            return
    }

    public void setTargetId(java.lang.String r1) {
            r0 = this;
            r0.targetId = r1
            return
    }

    public void setTargetTagName(java.lang.String r1) {
            r0 = this;
            r0.targetTag = r1
            return
    }

    public void setTargetVoice(java.lang.String r1) {
            r0 = this;
            r0.targetVoice = r1
            return
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.exoplayer2.text.webvtt.WebvttCssStyle setUnderline(boolean r1) {
            r0 = this;
            r0.underline = r1
            return r0
    }
}
