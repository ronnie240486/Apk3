package com.google.android.exoplayer2.text.webvtt;

/* JADX INFO: loaded from: classes.dex */
final class WebvttCssParser {
    private static final java.util.regex.Pattern FONT_SIZE_PATTERN = null;
    private static final java.lang.String PROPERTY_BGCOLOR = "background-color";
    private static final java.lang.String PROPERTY_COLOR = "color";
    private static final java.lang.String PROPERTY_FONT_FAMILY = "font-family";
    private static final java.lang.String PROPERTY_FONT_SIZE = "font-size";
    private static final java.lang.String PROPERTY_FONT_STYLE = "font-style";
    private static final java.lang.String PROPERTY_FONT_WEIGHT = "font-weight";
    private static final java.lang.String PROPERTY_RUBY_POSITION = "ruby-position";
    private static final java.lang.String PROPERTY_TEXT_COMBINE_UPRIGHT = "text-combine-upright";
    private static final java.lang.String PROPERTY_TEXT_DECORATION = "text-decoration";
    private static final java.lang.String RULE_END = "}";
    private static final java.lang.String RULE_START = "{";
    private static final java.lang.String TAG = "WebvttCssParser";
    private static final java.lang.String VALUE_ALL = "all";
    private static final java.lang.String VALUE_BOLD = "bold";
    private static final java.lang.String VALUE_DIGITS = "digits";
    private static final java.lang.String VALUE_ITALIC = "italic";
    private static final java.lang.String VALUE_OVER = "over";
    private static final java.lang.String VALUE_UNDER = "under";
    private static final java.lang.String VALUE_UNDERLINE = "underline";
    private static final java.util.regex.Pattern VOICE_NAME_PATTERN = null;
    private final java.lang.StringBuilder stringBuilder;
    private final com.google.android.exoplayer2.util.ParsableByteArray styleInput;

    static {
            java.lang.String r0 = "\\[voice=\"([^\"]*)\"\\]"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.google.android.exoplayer2.text.webvtt.WebvttCssParser.VOICE_NAME_PATTERN = r0
            java.lang.String r0 = "^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.google.android.exoplayer2.text.webvtt.WebvttCssParser.FONT_SIZE_PATTERN = r0
            return
    }

    public WebvttCssParser() {
            r1 = this;
            r1.<init>()
            com.google.android.exoplayer2.util.ParsableByteArray r0 = new com.google.android.exoplayer2.util.ParsableByteArray
            r0.<init>()
            r1.styleInput = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1.stringBuilder = r0
            return
    }

    private void applySelectorToStyle(com.google.android.exoplayer2.text.webvtt.WebvttCssStyle r7, java.lang.String r8) {
            r6 = this;
            java.lang.String r0 = ""
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L9
            return
        L9:
            r0 = 91
            int r0 = r8.indexOf(r0)
            r1 = -1
            r2 = 0
            r3 = 1
            if (r0 == r1) goto L35
            java.util.regex.Pattern r4 = com.google.android.exoplayer2.text.webvtt.WebvttCssParser.VOICE_NAME_PATTERN
            java.lang.String r5 = r8.substring(r0)
            java.util.regex.Matcher r4 = r4.matcher(r5)
            boolean r5 = r4.matches()
            if (r5 == 0) goto L31
            java.lang.String r4 = r4.group(r3)
            java.lang.Object r4 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r4)
            java.lang.String r4 = (java.lang.String) r4
            r7.setTargetVoice(r4)
        L31:
            java.lang.String r8 = r8.substring(r2, r0)
        L35:
            java.lang.String r0 = "\\."
            java.lang.String[] r8 = com.google.android.exoplayer2.util.Util.split(r8, r0)
            r0 = r8[r2]
            r4 = 35
            int r4 = r0.indexOf(r4)
            if (r4 == r1) goto L55
            java.lang.String r1 = r0.substring(r2, r4)
            r7.setTargetTagName(r1)
            int r4 = r4 + r3
            java.lang.String r0 = r0.substring(r4)
            r7.setTargetId(r0)
            goto L58
        L55:
            r7.setTargetTagName(r0)
        L58:
            int r0 = r8.length
            if (r0 <= r3) goto L65
            int r0 = r8.length
            java.lang.Object[] r8 = com.google.android.exoplayer2.util.Util.nullSafeArrayCopyOfRange(r8, r3, r0)
            java.lang.String[] r8 = (java.lang.String[]) r8
            r7.setTargetClasses(r8)
        L65:
            return
    }

    private static boolean maybeSkipComment(com.google.android.exoplayer2.util.ParsableByteArray r6) {
            int r0 = r6.getPosition()
            int r1 = r6.limit()
            byte[] r2 = r6.getData()
            int r3 = r0 + 2
            if (r3 > r1) goto L3f
            int r3 = r0 + 1
            r0 = r2[r0]
            r4 = 47
            if (r0 != r4) goto L3f
            int r0 = r3 + 1
            r3 = r2[r3]
            r5 = 42
            if (r3 != r5) goto L3f
        L20:
            int r3 = r0 + 1
            if (r3 >= r1) goto L35
            r0 = r2[r0]
            char r0 = (char) r0
            if (r0 != r5) goto L33
            r0 = r2[r3]
            char r0 = (char) r0
            if (r0 != r4) goto L33
            int r3 = r3 + 1
            r0 = r3
            r1 = r0
            goto L20
        L33:
            r0 = r3
            goto L20
        L35:
            int r0 = r6.getPosition()
            int r1 = r1 - r0
            r6.skipBytes(r1)
            r6 = 1
            return r6
        L3f:
            r6 = 0
            return r6
    }

    private static boolean maybeSkipWhitespace(com.google.android.exoplayer2.util.ParsableByteArray r2) {
            int r0 = r2.getPosition()
            char r0 = peekCharAtPosition(r2, r0)
            r1 = 9
            if (r0 == r1) goto L1e
            r1 = 10
            if (r0 == r1) goto L1e
            r1 = 12
            if (r0 == r1) goto L1e
            r1 = 13
            if (r0 == r1) goto L1e
            r1 = 32
            if (r0 == r1) goto L1e
            r2 = 0
            return r2
        L1e:
            r0 = 1
            r2.skipBytes(r0)
            return r0
    }

    private static void parseFontSize(java.lang.String r5, com.google.android.exoplayer2.text.webvtt.WebvttCssStyle r6) {
            java.util.regex.Pattern r0 = com.google.android.exoplayer2.text.webvtt.WebvttCssParser.FONT_SIZE_PATTERN
            java.lang.String r1 = com.google.common.base.Ascii.toLowerCase(r5)
            java.util.regex.Matcher r0 = r0.matcher(r1)
            boolean r1 = r0.matches()
            if (r1 != 0) goto L2c
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "Invalid font-size: '"
            r6.append(r0)
            r6.append(r5)
            java.lang.String r5 = "'."
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            java.lang.String r6 = "WebvttCssParser"
            com.google.android.exoplayer2.util.Log.w(r6, r5)
            return
        L2c:
            r5 = 2
            java.lang.String r1 = r0.group(r5)
            java.lang.Object r1 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r1)
            java.lang.String r1 = (java.lang.String) r1
            java.util.Objects.requireNonNull(r1)
            r2 = -1
            int r3 = r1.hashCode()
            r4 = 1
            switch(r3) {
                case 37: goto L5b;
                case 3240: goto L50;
                case 3592: goto L44;
                default: goto L43;
            }
        L43:
            goto L65
        L44:
            java.lang.String r3 = "px"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L4e
            goto L65
        L4e:
            r2 = 2
            goto L65
        L50:
            java.lang.String r3 = "em"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L59
            goto L65
        L59:
            r2 = 1
            goto L65
        L5b:
            java.lang.String r3 = "%"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L64
            goto L65
        L64:
            r2 = 0
        L65:
            switch(r2) {
                case 0: goto L76;
                case 1: goto L72;
                case 2: goto L6e;
                default: goto L68;
            }
        L68:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            r5.<init>()
            throw r5
        L6e:
            r6.setFontSizeUnit(r4)
            goto L7a
        L72:
            r6.setFontSizeUnit(r5)
            goto L7a
        L76:
            r5 = 3
            r6.setFontSizeUnit(r5)
        L7a:
            java.lang.String r5 = r0.group(r4)
            java.lang.Object r5 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r5)
            java.lang.String r5 = (java.lang.String) r5
            float r5 = java.lang.Float.parseFloat(r5)
            r6.setFontSize(r5)
            return
    }

    private static java.lang.String parseIdentifier(com.google.android.exoplayer2.util.ParsableByteArray r5, java.lang.StringBuilder r6) {
            r0 = 0
            r6.setLength(r0)
            int r1 = r5.getPosition()
            int r2 = r5.limit()
        Lc:
            if (r1 >= r2) goto L48
            if (r0 != 0) goto L48
            byte[] r3 = r5.getData()
            r3 = r3[r1]
            char r3 = (char) r3
            r4 = 65
            if (r3 < r4) goto L1f
            r4 = 90
            if (r3 <= r4) goto L42
        L1f:
            r4 = 97
            if (r3 < r4) goto L27
            r4 = 122(0x7a, float:1.71E-43)
            if (r3 <= r4) goto L42
        L27:
            r4 = 48
            if (r3 < r4) goto L2f
            r4 = 57
            if (r3 <= r4) goto L42
        L2f:
            r4 = 35
            if (r3 == r4) goto L42
            r4 = 45
            if (r3 == r4) goto L42
            r4 = 46
            if (r3 == r4) goto L42
            r4 = 95
            if (r3 != r4) goto L40
            goto L42
        L40:
            r0 = 1
            goto Lc
        L42:
            int r1 = r1 + 1
            r6.append(r3)
            goto Lc
        L48:
            int r0 = r5.getPosition()
            int r1 = r1 - r0
            r5.skipBytes(r1)
            java.lang.String r5 = r6.toString()
            return r5
    }

    @androidx.annotation.Nullable
    public static java.lang.String parseNextToken(com.google.android.exoplayer2.util.ParsableByteArray r2, java.lang.StringBuilder r3) {
            skipWhitespaceAndComments(r2)
            int r0 = r2.bytesLeft()
            if (r0 != 0) goto Lb
            r2 = 0
            return r2
        Lb:
            java.lang.String r3 = parseIdentifier(r2, r3)
            java.lang.String r0 = ""
            boolean r1 = r0.equals(r3)
            if (r1 != 0) goto L18
            return r3
        L18:
            java.lang.StringBuilder r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            int r2 = r2.readUnsignedByte()
            char r2 = (char) r2
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            return r2
    }

    @androidx.annotation.Nullable
    private static java.lang.String parsePropertyValue(com.google.android.exoplayer2.util.ParsableByteArray r5, java.lang.StringBuilder r6) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
        L6:
            if (r1 != 0) goto L2f
            int r2 = r5.getPosition()
            java.lang.String r3 = parseNextToken(r5, r6)
            if (r3 != 0) goto L14
            r5 = 0
            return r5
        L14:
            java.lang.String r4 = "}"
            boolean r4 = r4.equals(r3)
            if (r4 != 0) goto L2a
            java.lang.String r4 = ";"
            boolean r4 = r4.equals(r3)
            if (r4 == 0) goto L26
            goto L2a
        L26:
            r0.append(r3)
            goto L6
        L2a:
            r5.setPosition(r2)
            r1 = 1
            goto L6
        L2f:
            java.lang.String r5 = r0.toString()
            return r5
    }

    @androidx.annotation.Nullable
    private static java.lang.String parseSelector(com.google.android.exoplayer2.util.ParsableByteArray r4, java.lang.StringBuilder r5) {
            skipWhitespaceAndComments(r4)
            int r0 = r4.bytesLeft()
            r1 = 5
            r2 = 0
            if (r0 >= r1) goto Lc
            return r2
        Lc:
            java.lang.String r0 = r4.readString(r1)
            java.lang.String r1 = "::cue"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L19
            return r2
        L19:
            int r0 = r4.getPosition()
            java.lang.String r1 = parseNextToken(r4, r5)
            if (r1 != 0) goto L24
            return r2
        L24:
            java.lang.String r3 = "{"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L33
            r4.setPosition(r0)
            java.lang.String r4 = ""
            return r4
        L33:
            java.lang.String r0 = "("
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L40
            java.lang.String r0 = readCueTarget(r4)
            goto L41
        L40:
            r0 = r2
        L41:
            java.lang.String r4 = parseNextToken(r4, r5)
            java.lang.String r5 = ")"
            boolean r4 = r5.equals(r4)
            if (r4 != 0) goto L4e
            return r2
        L4e:
            return r0
    }

    private static void parseStyleDeclaration(com.google.android.exoplayer2.util.ParsableByteArray r4, com.google.android.exoplayer2.text.webvtt.WebvttCssStyle r5, java.lang.StringBuilder r6) {
            skipWhitespaceAndComments(r4)
            java.lang.String r0 = parseIdentifier(r4, r6)
            java.lang.String r1 = ""
            boolean r2 = r1.equals(r0)
            if (r2 == 0) goto L10
            return
        L10:
            java.lang.String r2 = parseNextToken(r4, r6)
            java.lang.String r3 = ":"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L1d
            return
        L1d:
            skipWhitespaceAndComments(r4)
            java.lang.String r2 = parsePropertyValue(r4, r6)
            if (r2 == 0) goto L107
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L2e
            goto L107
        L2e:
            int r1 = r4.getPosition()
            java.lang.String r6 = parseNextToken(r4, r6)
            java.lang.String r3 = ";"
            boolean r3 = r3.equals(r6)
            if (r3 == 0) goto L3f
            goto L4b
        L3f:
            java.lang.String r3 = "}"
            boolean r6 = r3.equals(r6)
            if (r6 == 0) goto L107
            r4.setPosition(r1)
        L4b:
            java.lang.String r4 = "color"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L5c
            int r4 = com.google.android.exoplayer2.util.ColorParser.parseCssColor(r2)
            r5.setFontColor(r4)
            goto L107
        L5c:
            java.lang.String r4 = "background-color"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L6d
            int r4 = com.google.android.exoplayer2.util.ColorParser.parseCssColor(r2)
            r5.setBackgroundColor(r4)
            goto L107
        L6d:
            java.lang.String r4 = "ruby-position"
            boolean r4 = r4.equals(r0)
            r6 = 1
            if (r4 == 0) goto L93
            java.lang.String r4 = "over"
            boolean r4 = r4.equals(r2)
            if (r4 == 0) goto L84
            r5.setRubyPosition(r6)
            goto L107
        L84:
            java.lang.String r4 = "under"
            boolean r4 = r4.equals(r2)
            if (r4 == 0) goto L107
            r4 = 2
            r5.setRubyPosition(r4)
            goto L107
        L93:
            java.lang.String r4 = "text-combine-upright"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto Lb2
            java.lang.String r4 = "all"
            boolean r4 = r4.equals(r2)
            if (r4 != 0) goto Lae
            java.lang.String r4 = "digits"
            boolean r4 = r2.startsWith(r4)
            if (r4 == 0) goto Lad
            goto Lae
        Lad:
            r6 = 0
        Lae:
            r5.setCombineUpright(r6)
            goto L107
        Lb2:
            java.lang.String r4 = "text-decoration"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto Lc8
            java.lang.String r4 = "underline"
            boolean r4 = r4.equals(r2)
            if (r4 == 0) goto L107
            r5.setUnderline(r6)
            goto L107
        Lc8:
            java.lang.String r4 = "font-family"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto Ld4
            r5.setFontFamily(r2)
            goto L107
        Ld4:
            java.lang.String r4 = "font-weight"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto Le8
            java.lang.String r4 = "bold"
            boolean r4 = r4.equals(r2)
            if (r4 == 0) goto L107
            r5.setBold(r6)
            goto L107
        Le8:
            java.lang.String r4 = "font-style"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto Lfc
            java.lang.String r4 = "italic"
            boolean r4 = r4.equals(r2)
            if (r4 == 0) goto L107
            r5.setItalic(r6)
            goto L107
        Lfc:
            java.lang.String r4 = "font-size"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L107
            parseFontSize(r2, r5)
        L107:
            return
    }

    private static char peekCharAtPosition(com.google.android.exoplayer2.util.ParsableByteArray r0, int r1) {
            byte[] r0 = r0.getData()
            r0 = r0[r1]
            char r0 = (char) r0
            return r0
    }

    private static java.lang.String readCueTarget(com.google.android.exoplayer2.util.ParsableByteArray r5) {
            int r0 = r5.getPosition()
            int r1 = r5.limit()
            r2 = 0
            r3 = 0
        La:
            if (r0 >= r1) goto L21
            if (r3 != 0) goto L21
            byte[] r3 = r5.getData()
            int r4 = r0 + 1
            r0 = r3[r0]
            char r0 = (char) r0
            r3 = 41
            if (r0 != r3) goto L1e
            r0 = 1
            r3 = 1
            goto L1f
        L1e:
            r3 = 0
        L1f:
            r0 = r4
            goto La
        L21:
            int r0 = r0 + (-1)
            int r1 = r5.getPosition()
            int r0 = r0 - r1
            java.lang.String r5 = r5.readString(r0)
            java.lang.String r5 = r5.trim()
            return r5
    }

    public static void skipWhitespaceAndComments(com.google.android.exoplayer2.util.ParsableByteArray r3) {
            r0 = 1
        L1:
            r1 = 1
        L2:
            int r2 = r3.bytesLeft()
            if (r2 <= 0) goto L19
            if (r1 == 0) goto L19
            boolean r1 = maybeSkipWhitespace(r3)
            if (r1 != 0) goto L1
            boolean r1 = maybeSkipComment(r3)
            if (r1 == 0) goto L17
            goto L1
        L17:
            r1 = 0
            goto L2
        L19:
            return
    }

    public java.util.List<com.google.android.exoplayer2.text.webvtt.WebvttCssStyle> parseBlock(com.google.android.exoplayer2.util.ParsableByteArray r7) {
            r6 = this;
            java.lang.StringBuilder r0 = r6.stringBuilder
            r1 = 0
            r0.setLength(r1)
            int r0 = r7.getPosition()
        La:
            java.lang.String r2 = r7.readLine()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto La
            com.google.android.exoplayer2.util.ParsableByteArray r2 = r6.styleInput
            byte[] r3 = r7.getData()
            int r7 = r7.getPosition()
            r2.reset(r3, r7)
            com.google.android.exoplayer2.util.ParsableByteArray r7 = r6.styleInput
            r7.setPosition(r0)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
        L2b:
            com.google.android.exoplayer2.util.ParsableByteArray r0 = r6.styleInput
            java.lang.StringBuilder r2 = r6.stringBuilder
            java.lang.String r0 = parseSelector(r0, r2)
            if (r0 == 0) goto L8b
            com.google.android.exoplayer2.util.ParsableByteArray r2 = r6.styleInput
            java.lang.StringBuilder r3 = r6.stringBuilder
            java.lang.String r2 = parseNextToken(r2, r3)
            java.lang.String r3 = "{"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L47
            return r7
        L47:
            com.google.android.exoplayer2.text.webvtt.WebvttCssStyle r2 = new com.google.android.exoplayer2.text.webvtt.WebvttCssStyle
            r2.<init>()
            r6.applySelectorToStyle(r2, r0)
            r0 = 0
            r3 = 0
        L51:
            java.lang.String r4 = "}"
            if (r3 != 0) goto L81
            com.google.android.exoplayer2.util.ParsableByteArray r0 = r6.styleInput
            int r0 = r0.getPosition()
            com.google.android.exoplayer2.util.ParsableByteArray r3 = r6.styleInput
            java.lang.StringBuilder r5 = r6.stringBuilder
            java.lang.String r3 = parseNextToken(r3, r5)
            if (r3 == 0) goto L6f
            boolean r4 = r4.equals(r3)
            if (r4 == 0) goto L6d
            goto L6f
        L6d:
            r4 = 0
            goto L70
        L6f:
            r4 = 1
        L70:
            if (r4 != 0) goto L7e
            com.google.android.exoplayer2.util.ParsableByteArray r5 = r6.styleInput
            r5.setPosition(r0)
            com.google.android.exoplayer2.util.ParsableByteArray r0 = r6.styleInput
            java.lang.StringBuilder r5 = r6.stringBuilder
            parseStyleDeclaration(r0, r2, r5)
        L7e:
            r0 = r3
            r3 = r4
            goto L51
        L81:
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L2b
            r7.add(r2)
            goto L2b
        L8b:
            return r7
    }
}
