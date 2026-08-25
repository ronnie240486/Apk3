package com.google.android.exoplayer2.text.ttml;

/* JADX INFO: loaded from: classes.dex */
final class TtmlNode {
    public static final java.lang.String ANNOTATION_POSITION_AFTER = "after";
    public static final java.lang.String ANNOTATION_POSITION_BEFORE = "before";
    public static final java.lang.String ANNOTATION_POSITION_OUTSIDE = "outside";
    public static final java.lang.String ANONYMOUS_REGION_ID = "";
    public static final java.lang.String ATTR_EBUTTS_MULTI_ROW_ALIGN = "multiRowAlign";
    public static final java.lang.String ATTR_ID = "id";
    public static final java.lang.String ATTR_TTS_BACKGROUND_COLOR = "backgroundColor";
    public static final java.lang.String ATTR_TTS_COLOR = "color";
    public static final java.lang.String ATTR_TTS_DISPLAY_ALIGN = "displayAlign";
    public static final java.lang.String ATTR_TTS_EXTENT = "extent";
    public static final java.lang.String ATTR_TTS_FONT_FAMILY = "fontFamily";
    public static final java.lang.String ATTR_TTS_FONT_SIZE = "fontSize";
    public static final java.lang.String ATTR_TTS_FONT_STYLE = "fontStyle";
    public static final java.lang.String ATTR_TTS_FONT_WEIGHT = "fontWeight";
    public static final java.lang.String ATTR_TTS_ORIGIN = "origin";
    public static final java.lang.String ATTR_TTS_RUBY = "ruby";
    public static final java.lang.String ATTR_TTS_RUBY_POSITION = "rubyPosition";
    public static final java.lang.String ATTR_TTS_SHEAR = "shear";
    public static final java.lang.String ATTR_TTS_TEXT_ALIGN = "textAlign";
    public static final java.lang.String ATTR_TTS_TEXT_COMBINE = "textCombine";
    public static final java.lang.String ATTR_TTS_TEXT_DECORATION = "textDecoration";
    public static final java.lang.String ATTR_TTS_TEXT_EMPHASIS = "textEmphasis";
    public static final java.lang.String ATTR_TTS_WRITING_MODE = "writingMode";
    public static final java.lang.String BOLD = "bold";
    public static final java.lang.String CENTER = "center";
    public static final java.lang.String COMBINE_ALL = "all";
    public static final java.lang.String COMBINE_NONE = "none";
    public static final java.lang.String END = "end";
    public static final java.lang.String ITALIC = "italic";
    public static final java.lang.String LEFT = "left";
    public static final java.lang.String LINETHROUGH = "linethrough";
    public static final java.lang.String NO_LINETHROUGH = "nolinethrough";
    public static final java.lang.String NO_UNDERLINE = "nounderline";
    public static final java.lang.String RIGHT = "right";
    public static final java.lang.String RUBY_BASE = "base";
    public static final java.lang.String RUBY_BASE_CONTAINER = "baseContainer";
    public static final java.lang.String RUBY_CONTAINER = "container";
    public static final java.lang.String RUBY_DELIMITER = "delimiter";
    public static final java.lang.String RUBY_TEXT = "text";
    public static final java.lang.String RUBY_TEXT_CONTAINER = "textContainer";
    public static final java.lang.String START = "start";
    public static final java.lang.String TAG_BODY = "body";
    public static final java.lang.String TAG_BR = "br";
    public static final java.lang.String TAG_DATA = "data";
    public static final java.lang.String TAG_DIV = "div";
    public static final java.lang.String TAG_HEAD = "head";
    public static final java.lang.String TAG_IMAGE = "image";
    public static final java.lang.String TAG_INFORMATION = "information";
    public static final java.lang.String TAG_LAYOUT = "layout";
    public static final java.lang.String TAG_METADATA = "metadata";
    public static final java.lang.String TAG_P = "p";
    public static final java.lang.String TAG_REGION = "region";
    public static final java.lang.String TAG_SPAN = "span";
    public static final java.lang.String TAG_STYLE = "style";
    public static final java.lang.String TAG_STYLING = "styling";
    public static final java.lang.String TAG_TT = "tt";
    public static final java.lang.String TEXT_EMPHASIS_AUTO = "auto";
    public static final java.lang.String TEXT_EMPHASIS_MARK_CIRCLE = "circle";
    public static final java.lang.String TEXT_EMPHASIS_MARK_DOT = "dot";
    public static final java.lang.String TEXT_EMPHASIS_MARK_FILLED = "filled";
    public static final java.lang.String TEXT_EMPHASIS_MARK_OPEN = "open";
    public static final java.lang.String TEXT_EMPHASIS_MARK_SESAME = "sesame";
    public static final java.lang.String TEXT_EMPHASIS_NONE = "none";
    public static final java.lang.String UNDERLINE = "underline";
    public static final java.lang.String VERTICAL = "tb";
    public static final java.lang.String VERTICAL_LR = "tblr";
    public static final java.lang.String VERTICAL_RL = "tbrl";
    private java.util.List<com.google.android.exoplayer2.text.ttml.TtmlNode> children;
    public final long endTimeUs;

    @androidx.annotation.Nullable
    public final java.lang.String imageId;
    public final boolean isTextNode;
    private final java.util.HashMap<java.lang.String, java.lang.Integer> nodeEndsByRegion;
    private final java.util.HashMap<java.lang.String, java.lang.Integer> nodeStartsByRegion;

    @androidx.annotation.Nullable
    public final com.google.android.exoplayer2.text.ttml.TtmlNode parent;
    public final java.lang.String regionId;
    public final long startTimeUs;

    @androidx.annotation.Nullable
    public final com.google.android.exoplayer2.text.ttml.TtmlStyle style;

    @androidx.annotation.Nullable
    private final java.lang.String[] styleIds;

    @androidx.annotation.Nullable
    public final java.lang.String tag;

    @androidx.annotation.Nullable
    public final java.lang.String text;

    private TtmlNode(@androidx.annotation.Nullable java.lang.String r1, @androidx.annotation.Nullable java.lang.String r2, long r3, long r5, @androidx.annotation.Nullable com.google.android.exoplayer2.text.ttml.TtmlStyle r7, @androidx.annotation.Nullable java.lang.String[] r8, java.lang.String r9, @androidx.annotation.Nullable java.lang.String r10, @androidx.annotation.Nullable com.google.android.exoplayer2.text.ttml.TtmlNode r11) {
            r0 = this;
            r0.<init>()
            r0.tag = r1
            r0.text = r2
            r0.imageId = r10
            r0.style = r7
            r0.styleIds = r8
            if (r2 == 0) goto L11
            r1 = 1
            goto L12
        L11:
            r1 = 0
        L12:
            r0.isTextNode = r1
            r0.startTimeUs = r3
            r0.endTimeUs = r5
            java.lang.Object r1 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r9)
            java.lang.String r1 = (java.lang.String) r1
            r0.regionId = r1
            r0.parent = r11
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r0.nodeStartsByRegion = r1
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r0.nodeEndsByRegion = r1
            return
    }

    private void applyStyleToOutput(java.util.Map<java.lang.String, com.google.android.exoplayer2.text.ttml.TtmlStyle> r10, com.google.android.exoplayer2.text.Cue.Builder r11, int r12, int r13, int r14) {
            r9 = this;
            com.google.android.exoplayer2.text.ttml.TtmlStyle r0 = r9.style
            java.lang.String[] r1 = r9.styleIds
            com.google.android.exoplayer2.text.ttml.TtmlStyle r0 = com.google.android.exoplayer2.text.ttml.TtmlRenderUtil.resolveStyle(r0, r1, r10)
            java.lang.CharSequence r1 = r11.getText()
            android.text.SpannableStringBuilder r1 = (android.text.SpannableStringBuilder) r1
            if (r1 != 0) goto L18
            android.text.SpannableStringBuilder r1 = new android.text.SpannableStringBuilder
            r1.<init>()
            r11.setText(r1)
        L18:
            r2 = r1
            if (r0 == 0) goto L62
            com.google.android.exoplayer2.text.ttml.TtmlNode r6 = r9.parent
            r3 = r12
            r4 = r13
            r5 = r0
            r7 = r10
            r8 = r14
            com.google.android.exoplayer2.text.ttml.TtmlRenderUtil.applyStylesToSpan(r2, r3, r4, r5, r6, r7, r8)
            java.lang.String r10 = r9.tag
            java.lang.String r12 = "p"
            boolean r10 = r12.equals(r10)
            if (r10 == 0) goto L62
            float r10 = r0.getShearPercentage()
            r12 = 2139095039(0x7f7fffff, float:3.4028235E38)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L48
            float r10 = r0.getShearPercentage()
            r12 = -1028390912(0xffffffffc2b40000, float:-90.0)
            float r10 = r10 * r12
            r12 = 1120403456(0x42c80000, float:100.0)
            float r10 = r10 / r12
            r11.setShearDegrees(r10)
        L48:
            android.text.Layout$Alignment r10 = r0.getTextAlign()
            if (r10 == 0) goto L55
            android.text.Layout$Alignment r10 = r0.getTextAlign()
            r11.setTextAlignment(r10)
        L55:
            android.text.Layout$Alignment r10 = r0.getMultiRowAlign()
            if (r10 == 0) goto L62
            android.text.Layout$Alignment r10 = r0.getMultiRowAlign()
            r11.setMultiRowAlignment(r10)
        L62:
            return
    }

    public static com.google.android.exoplayer2.text.ttml.TtmlNode buildNode(@androidx.annotation.Nullable java.lang.String r13, long r14, long r16, @androidx.annotation.Nullable com.google.android.exoplayer2.text.ttml.TtmlStyle r18, @androidx.annotation.Nullable java.lang.String[] r19, java.lang.String r20, @androidx.annotation.Nullable java.lang.String r21, @androidx.annotation.Nullable com.google.android.exoplayer2.text.ttml.TtmlNode r22) {
            com.google.android.exoplayer2.text.ttml.TtmlNode r12 = new com.google.android.exoplayer2.text.ttml.TtmlNode
            r2 = 0
            r0 = r12
            r1 = r13
            r3 = r14
            r5 = r16
            r7 = r18
            r8 = r19
            r9 = r20
            r10 = r21
            r11 = r22
            r0.<init>(r1, r2, r3, r5, r7, r8, r9, r10, r11)
            return r12
    }

    public static com.google.android.exoplayer2.text.ttml.TtmlNode buildTextNode(java.lang.String r13) {
            com.google.android.exoplayer2.text.ttml.TtmlNode r12 = new com.google.android.exoplayer2.text.ttml.TtmlNode
            java.lang.String r0 = "\n"
            java.lang.String r1 = "\r\n"
            java.lang.String r13 = r13.replaceAll(r1, r0)
            java.lang.String r1 = " *\n *"
            java.lang.String r13 = r13.replaceAll(r1, r0)
            java.lang.String r1 = " "
            java.lang.String r13 = r13.replaceAll(r0, r1)
            java.lang.String r0 = "[ \t\\x0B\f\r]+"
            java.lang.String r2 = r13.replaceAll(r0, r1)
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = 0
            r8 = 0
            r10 = 0
            r11 = 0
            r1 = 0
            java.lang.String r9 = ""
            r0 = r12
            r0.<init>(r1, r2, r3, r5, r7, r8, r9, r10, r11)
            return r12
    }

    private static void cleanUpText(android.text.SpannableStringBuilder r7) {
            int r0 = r7.length()
            java.lang.Class<com.google.android.exoplayer2.text.ttml.DeleteTextSpan> r1 = com.google.android.exoplayer2.text.ttml.DeleteTextSpan.class
            r2 = 0
            java.lang.Object[] r0 = r7.getSpans(r2, r0, r1)
            com.google.android.exoplayer2.text.ttml.DeleteTextSpan[] r0 = (com.google.android.exoplayer2.text.ttml.DeleteTextSpan[]) r0
            int r1 = r0.length
            r3 = 0
        Lf:
            if (r3 >= r1) goto L23
            r4 = r0[r3]
            int r5 = r7.getSpanStart(r4)
            int r4 = r7.getSpanEnd(r4)
            java.lang.String r6 = ""
            r7.replace(r5, r4, r6)
            int r3 = r3 + 1
            goto Lf
        L23:
            r0 = 0
        L24:
            int r1 = r7.length()
            r3 = 32
            if (r0 >= r1) goto L4e
            char r1 = r7.charAt(r0)
            if (r1 != r3) goto L4b
            int r1 = r0 + 1
            r4 = r1
        L35:
            int r5 = r7.length()
            if (r4 >= r5) goto L44
            char r5 = r7.charAt(r4)
            if (r5 != r3) goto L44
            int r4 = r4 + 1
            goto L35
        L44:
            int r4 = r4 - r1
            if (r4 <= 0) goto L4b
            int r4 = r4 + r0
            r7.delete(r0, r4)
        L4b:
            int r0 = r0 + 1
            goto L24
        L4e:
            int r0 = r7.length()
            r1 = 1
            if (r0 <= 0) goto L5e
            char r0 = r7.charAt(r2)
            if (r0 != r3) goto L5e
            r7.delete(r2, r1)
        L5e:
            r0 = 0
        L5f:
            int r4 = r7.length()
            int r4 = r4 - r1
            r5 = 10
            if (r0 >= r4) goto L7e
            char r4 = r7.charAt(r0)
            if (r4 != r5) goto L7b
            int r4 = r0 + 1
            char r5 = r7.charAt(r4)
            if (r5 != r3) goto L7b
            int r5 = r0 + 2
            r7.delete(r4, r5)
        L7b:
            int r0 = r0 + 1
            goto L5f
        L7e:
            int r0 = r7.length()
            if (r0 <= 0) goto L9b
            int r0 = r7.length()
            int r0 = r0 - r1
            char r0 = r7.charAt(r0)
            if (r0 != r3) goto L9b
            int r0 = r7.length()
            int r0 = r0 - r1
            int r4 = r7.length()
            r7.delete(r0, r4)
        L9b:
            int r0 = r7.length()
            int r0 = r0 - r1
            if (r2 >= r0) goto Lb6
            char r0 = r7.charAt(r2)
            if (r0 != r3) goto Lb3
            int r0 = r2 + 1
            char r4 = r7.charAt(r0)
            if (r4 != r5) goto Lb3
            r7.delete(r2, r0)
        Lb3:
            int r2 = r2 + 1
            goto L9b
        Lb6:
            int r0 = r7.length()
            if (r0 <= 0) goto Ld3
            int r0 = r7.length()
            int r0 = r0 - r1
            char r0 = r7.charAt(r0)
            if (r0 != r5) goto Ld3
            int r0 = r7.length()
            int r0 = r0 - r1
            int r1 = r7.length()
            r7.delete(r0, r1)
        Ld3:
            return
    }

    private void getEventTimes(java.util.TreeSet<java.lang.Long> r7, boolean r8) {
            r6 = this;
            java.lang.String r0 = r6.tag
            java.lang.String r1 = "p"
            boolean r0 = r1.equals(r0)
            java.lang.String r1 = r6.tag
            java.lang.String r2 = "div"
            boolean r1 = r2.equals(r1)
            if (r8 != 0) goto L1a
            if (r0 != 0) goto L1a
            if (r1 == 0) goto L39
            java.lang.String r1 = r6.imageId
            if (r1 == 0) goto L39
        L1a:
            long r1 = r6.startTimeUs
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L2c
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r7.add(r1)
        L2c:
            long r1 = r6.endTimeUs
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L39
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r7.add(r1)
        L39:
            java.util.List<com.google.android.exoplayer2.text.ttml.TtmlNode> r1 = r6.children
            if (r1 != 0) goto L3e
            return
        L3e:
            r1 = 0
            r2 = 0
        L40:
            java.util.List<com.google.android.exoplayer2.text.ttml.TtmlNode> r3 = r6.children
            int r3 = r3.size()
            if (r2 >= r3) goto L5e
            java.util.List<com.google.android.exoplayer2.text.ttml.TtmlNode> r3 = r6.children
            java.lang.Object r3 = r3.get(r2)
            com.google.android.exoplayer2.text.ttml.TtmlNode r3 = (com.google.android.exoplayer2.text.ttml.TtmlNode) r3
            if (r8 != 0) goto L57
            if (r0 == 0) goto L55
            goto L57
        L55:
            r4 = 0
            goto L58
        L57:
            r4 = 1
        L58:
            r3.getEventTimes(r7, r4)
            int r2 = r2 + 1
            goto L40
        L5e:
            return
    }

    private static android.text.SpannableStringBuilder getRegionOutputText(java.lang.String r2, java.util.Map<java.lang.String, com.google.android.exoplayer2.text.Cue.Builder> r3) {
            boolean r0 = r3.containsKey(r2)
            if (r0 != 0) goto L16
            com.google.android.exoplayer2.text.Cue$Builder r0 = new com.google.android.exoplayer2.text.Cue$Builder
            r0.<init>()
            android.text.SpannableStringBuilder r1 = new android.text.SpannableStringBuilder
            r1.<init>()
            r0.setText(r1)
            r3.put(r2, r0)
        L16:
            java.lang.Object r2 = r3.get(r2)
            com.google.android.exoplayer2.text.Cue$Builder r2 = (com.google.android.exoplayer2.text.Cue.Builder) r2
            java.lang.CharSequence r2 = r2.getText()
            java.lang.Object r2 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r2)
            android.text.SpannableStringBuilder r2 = (android.text.SpannableStringBuilder) r2
            return r2
    }

    private void traverseForImage(long r3, java.lang.String r5, java.util.List<android.util.Pair<java.lang.String, java.lang.String>> r6) {
            r2 = this;
            java.lang.String r0 = r2.regionId
            java.lang.String r1 = ""
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Lb
            goto Ld
        Lb:
            java.lang.String r5 = r2.regionId
        Ld:
            boolean r0 = r2.isActive(r3)
            if (r0 == 0) goto L2c
            java.lang.String r0 = r2.tag
            java.lang.String r1 = "div"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L2c
            java.lang.String r0 = r2.imageId
            if (r0 == 0) goto L2c
            android.util.Pair r3 = new android.util.Pair
            java.lang.String r4 = r2.imageId
            r3.<init>(r5, r4)
            r6.add(r3)
            return
        L2c:
            r0 = 0
        L2d:
            int r1 = r2.getChildCount()
            if (r0 >= r1) goto L3d
            com.google.android.exoplayer2.text.ttml.TtmlNode r1 = r2.getChild(r0)
            r1.traverseForImage(r3, r5, r6)
            int r0 = r0 + 1
            goto L2d
        L3d:
            return
    }

    private void traverseForStyle(long r17, java.util.Map<java.lang.String, com.google.android.exoplayer2.text.ttml.TtmlStyle> r19, java.util.Map<java.lang.String, com.google.android.exoplayer2.text.ttml.TtmlRegion> r20, java.lang.String r21, java.util.Map<java.lang.String, com.google.android.exoplayer2.text.Cue.Builder> r22) {
            r16 = this;
            r6 = r16
            boolean r0 = r16.isActive(r17)
            if (r0 != 0) goto L9
            return
        L9:
            java.lang.String r0 = r6.regionId
            java.lang.String r1 = ""
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L16
            r14 = r21
            goto L19
        L16:
            java.lang.String r0 = r6.regionId
            r14 = r0
        L19:
            java.util.HashMap<java.lang.String, java.lang.Integer> r0 = r6.nodeEndsByRegion
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r7 = r0.iterator()
        L23:
            boolean r0 = r7.hasNext()
            r1 = 0
            if (r0 == 0) goto L85
            java.lang.Object r0 = r7.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r2 = r0.getKey()
            java.lang.String r2 = (java.lang.String) r2
            java.util.HashMap<java.lang.String, java.lang.Integer> r3 = r6.nodeStartsByRegion
            boolean r3 = r3.containsKey(r2)
            if (r3 == 0) goto L4c
            java.util.HashMap<java.lang.String, java.lang.Integer> r1 = r6.nodeStartsByRegion
            java.lang.Object r1 = r1.get(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r3 = r1
            goto L4d
        L4c:
            r3 = 0
        L4d:
            java.lang.Object r0 = r0.getValue()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r4 = r0.intValue()
            if (r3 == r4) goto L80
            r15 = r22
            java.lang.Object r0 = r15.get(r2)
            com.google.android.exoplayer2.text.Cue$Builder r0 = (com.google.android.exoplayer2.text.Cue.Builder) r0
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            r2 = r0
            com.google.android.exoplayer2.text.Cue$Builder r2 = (com.google.android.exoplayer2.text.Cue.Builder) r2
            r13 = r20
            java.lang.Object r0 = r13.get(r14)
            com.google.android.exoplayer2.text.ttml.TtmlRegion r0 = (com.google.android.exoplayer2.text.ttml.TtmlRegion) r0
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            com.google.android.exoplayer2.text.ttml.TtmlRegion r0 = (com.google.android.exoplayer2.text.ttml.TtmlRegion) r0
            int r5 = r0.verticalType
            r0 = r16
            r1 = r19
            r0.applyStyleToOutput(r1, r2, r3, r4, r5)
            goto L23
        L80:
            r13 = r20
            r15 = r22
            goto L23
        L85:
            r13 = r20
            r15 = r22
        L89:
            int r0 = r16.getChildCount()
            if (r1 >= r0) goto La4
            com.google.android.exoplayer2.text.ttml.TtmlNode r7 = r6.getChild(r1)
            r8 = r17
            r10 = r19
            r11 = r20
            r12 = r14
            r13 = r22
            r7.traverseForStyle(r8, r10, r11, r12, r13)
            int r1 = r1 + 1
            r13 = r20
            goto L89
        La4:
            return
    }

    private void traverseForText(long r11, boolean r13, java.lang.String r14, java.util.Map<java.lang.String, com.google.android.exoplayer2.text.Cue.Builder> r15) {
            r10 = this;
            java.util.HashMap<java.lang.String, java.lang.Integer> r0 = r10.nodeStartsByRegion
            r0.clear()
            java.util.HashMap<java.lang.String, java.lang.Integer> r0 = r10.nodeEndsByRegion
            r0.clear()
            java.lang.String r0 = r10.tag
            java.lang.String r1 = "metadata"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L15
            return
        L15:
            java.lang.String r0 = r10.regionId
            java.lang.String r1 = ""
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L20
            goto L22
        L20:
            java.lang.String r14 = r10.regionId
        L22:
            boolean r0 = r10.isTextNode
            if (r0 == 0) goto L39
            if (r13 == 0) goto L39
            android.text.SpannableStringBuilder r11 = getRegionOutputText(r14, r15)
            java.lang.String r12 = r10.text
            java.lang.Object r12 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r12)
            java.lang.CharSequence r12 = (java.lang.CharSequence) r12
            r11.append(r12)
            goto L10e
        L39:
            java.lang.String r0 = r10.tag
            java.lang.String r1 = "br"
            boolean r0 = r1.equals(r0)
            r6 = 10
            if (r0 == 0) goto L50
            if (r13 == 0) goto L50
            android.text.SpannableStringBuilder r11 = getRegionOutputText(r14, r15)
            r11.append(r6)
            goto L10e
        L50:
            boolean r0 = r10.isActive(r11)
            if (r0 == 0) goto L10e
            java.util.Set r0 = r15.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L5e:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L8e
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.util.HashMap<java.lang.String, java.lang.Integer> r2 = r10.nodeStartsByRegion
            java.lang.Object r3 = r1.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r1 = r1.getValue()
            com.google.android.exoplayer2.text.Cue$Builder r1 = (com.google.android.exoplayer2.text.Cue.Builder) r1
            java.lang.CharSequence r1 = r1.getText()
            java.lang.Object r1 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r1)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            int r1 = r1.length()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.put(r3, r1)
            goto L5e
        L8e:
            java.lang.String r0 = r10.tag
            java.lang.String r1 = "p"
            boolean r7 = r1.equals(r0)
            r8 = 0
            r9 = 0
        L98:
            int r0 = r10.getChildCount()
            if (r9 >= r0) goto Lb4
            com.google.android.exoplayer2.text.ttml.TtmlNode r0 = r10.getChild(r9)
            if (r13 != 0) goto La9
            if (r7 == 0) goto La7
            goto La9
        La7:
            r3 = 0
            goto Lab
        La9:
            r1 = 1
            r3 = 1
        Lab:
            r1 = r11
            r4 = r14
            r5 = r15
            r0.traverseForText(r1, r3, r4, r5)
            int r9 = r9 + 1
            goto L98
        Lb4:
            if (r7 == 0) goto Ld6
            android.text.SpannableStringBuilder r11 = getRegionOutputText(r14, r15)
            int r12 = r11.length()
        Lbe:
            int r12 = r12 + (-1)
            if (r12 < 0) goto Lcb
            char r13 = r11.charAt(r12)
            r14 = 32
            if (r13 != r14) goto Lcb
            goto Lbe
        Lcb:
            if (r12 < 0) goto Ld6
            char r12 = r11.charAt(r12)
            if (r12 == r6) goto Ld6
            r11.append(r6)
        Ld6:
            java.util.Set r11 = r15.entrySet()
            java.util.Iterator r11 = r11.iterator()
        Lde:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L10e
            java.lang.Object r12 = r11.next()
            java.util.Map$Entry r12 = (java.util.Map.Entry) r12
            java.util.HashMap<java.lang.String, java.lang.Integer> r13 = r10.nodeEndsByRegion
            java.lang.Object r14 = r12.getKey()
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Object r12 = r12.getValue()
            com.google.android.exoplayer2.text.Cue$Builder r12 = (com.google.android.exoplayer2.text.Cue.Builder) r12
            java.lang.CharSequence r12 = r12.getText()
            java.lang.Object r12 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r12)
            java.lang.CharSequence r12 = (java.lang.CharSequence) r12
            int r12 = r12.length()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r13.put(r14, r12)
            goto Lde
        L10e:
            return
    }

    public void addChild(com.google.android.exoplayer2.text.ttml.TtmlNode r2) {
            r1 = this;
            java.util.List<com.google.android.exoplayer2.text.ttml.TtmlNode> r0 = r1.children
            if (r0 != 0) goto Lb
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.children = r0
        Lb:
            java.util.List<com.google.android.exoplayer2.text.ttml.TtmlNode> r0 = r1.children
            r0.add(r2)
            return
    }

    public com.google.android.exoplayer2.text.ttml.TtmlNode getChild(int r2) {
            r1 = this;
            java.util.List<com.google.android.exoplayer2.text.ttml.TtmlNode> r0 = r1.children
            if (r0 == 0) goto Lb
            java.lang.Object r2 = r0.get(r2)
            com.google.android.exoplayer2.text.ttml.TtmlNode r2 = (com.google.android.exoplayer2.text.ttml.TtmlNode) r2
            return r2
        Lb:
            java.lang.IndexOutOfBoundsException r2 = new java.lang.IndexOutOfBoundsException
            r2.<init>()
            throw r2
    }

    public int getChildCount() {
            r1 = this;
            java.util.List<com.google.android.exoplayer2.text.ttml.TtmlNode> r0 = r1.children
            if (r0 != 0) goto L6
            r0 = 0
            goto La
        L6:
            int r0 = r0.size()
        La:
            return r0
    }

    public java.util.List<com.google.android.exoplayer2.text.Cue> getCues(long r10, java.util.Map<java.lang.String, com.google.android.exoplayer2.text.ttml.TtmlStyle> r12, java.util.Map<java.lang.String, com.google.android.exoplayer2.text.ttml.TtmlRegion> r13, java.util.Map<java.lang.String, java.lang.String> r14) {
            r9 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r1 = r9.regionId
            r9.traverseForImage(r10, r1, r0)
            java.util.TreeMap r1 = new java.util.TreeMap
            r1.<init>()
            java.lang.String r6 = r9.regionId
            r5 = 0
            r2 = r9
            r3 = r10
            r7 = r1
            r2.traverseForText(r3, r5, r6, r7)
            java.lang.String r7 = r9.regionId
            r5 = r12
            r6 = r13
            r8 = r1
            r2.traverseForStyle(r3, r5, r6, r7, r8)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r11 = r0.iterator()
        L29:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L91
            java.lang.Object r12 = r11.next()
            android.util.Pair r12 = (android.util.Pair) r12
            java.lang.Object r0 = r12.second
            java.lang.Object r0 = r14.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L40
            goto L29
        L40:
            r2 = 0
            byte[] r0 = android.util.Base64.decode(r0, r2)
            int r3 = r0.length
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeByteArray(r0, r2, r3)
            java.lang.Object r12 = r12.first
            java.lang.Object r12 = r13.get(r12)
            com.google.android.exoplayer2.text.ttml.TtmlRegion r12 = (com.google.android.exoplayer2.text.ttml.TtmlRegion) r12
            java.lang.Object r12 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r12)
            com.google.android.exoplayer2.text.ttml.TtmlRegion r12 = (com.google.android.exoplayer2.text.ttml.TtmlRegion) r12
            com.google.android.exoplayer2.text.Cue$Builder r3 = new com.google.android.exoplayer2.text.Cue$Builder
            r3.<init>()
            com.google.android.exoplayer2.text.Cue$Builder r0 = r3.setBitmap(r0)
            float r3 = r12.position
            com.google.android.exoplayer2.text.Cue$Builder r0 = r0.setPosition(r3)
            com.google.android.exoplayer2.text.Cue$Builder r0 = r0.setPositionAnchor(r2)
            float r3 = r12.line
            com.google.android.exoplayer2.text.Cue$Builder r0 = r0.setLine(r3, r2)
            int r2 = r12.lineAnchor
            com.google.android.exoplayer2.text.Cue$Builder r0 = r0.setLineAnchor(r2)
            float r2 = r12.width
            com.google.android.exoplayer2.text.Cue$Builder r0 = r0.setSize(r2)
            float r2 = r12.height
            com.google.android.exoplayer2.text.Cue$Builder r0 = r0.setBitmapHeight(r2)
            int r12 = r12.verticalType
            com.google.android.exoplayer2.text.Cue$Builder r12 = r0.setVerticalType(r12)
            com.google.android.exoplayer2.text.Cue r12 = r12.build()
            r10.add(r12)
            goto L29
        L91:
            java.util.Set r11 = r1.entrySet()
            java.util.Iterator r11 = r11.iterator()
        L99:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto Lf2
            java.lang.Object r12 = r11.next()
            java.util.Map$Entry r12 = (java.util.Map.Entry) r12
            java.lang.Object r14 = r12.getKey()
            java.lang.Object r14 = r13.get(r14)
            com.google.android.exoplayer2.text.ttml.TtmlRegion r14 = (com.google.android.exoplayer2.text.ttml.TtmlRegion) r14
            java.lang.Object r14 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r14)
            com.google.android.exoplayer2.text.ttml.TtmlRegion r14 = (com.google.android.exoplayer2.text.ttml.TtmlRegion) r14
            java.lang.Object r12 = r12.getValue()
            com.google.android.exoplayer2.text.Cue$Builder r12 = (com.google.android.exoplayer2.text.Cue.Builder) r12
            java.lang.CharSequence r0 = r12.getText()
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            android.text.SpannableStringBuilder r0 = (android.text.SpannableStringBuilder) r0
            cleanUpText(r0)
            float r0 = r14.line
            int r1 = r14.lineType
            r12.setLine(r0, r1)
            int r0 = r14.lineAnchor
            r12.setLineAnchor(r0)
            float r0 = r14.position
            r12.setPosition(r0)
            float r0 = r14.width
            r12.setSize(r0)
            float r0 = r14.textSize
            int r1 = r14.textSizeType
            r12.setTextSize(r0, r1)
            int r14 = r14.verticalType
            r12.setVerticalType(r14)
            com.google.android.exoplayer2.text.Cue r12 = r12.build()
            r10.add(r12)
            goto L99
        Lf2:
            return r10
    }

    public long[] getEventTimesUs() {
            r6 = this;
            java.util.TreeSet r0 = new java.util.TreeSet
            r0.<init>()
            r1 = 0
            r6.getEventTimes(r0, r1)
            int r2 = r0.size()
            long[] r2 = new long[r2]
            java.util.Iterator r0 = r0.iterator()
        L13:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L29
            java.lang.Object r3 = r0.next()
            java.lang.Long r3 = (java.lang.Long) r3
            long r3 = r3.longValue()
            int r5 = r1 + 1
            r2[r1] = r3
            r1 = r5
            goto L13
        L29:
            return r2
    }

    @androidx.annotation.Nullable
    public java.lang.String[] getStyleIds() {
            r1 = this;
            java.lang.String[] r0 = r1.styleIds
            return r0
    }

    public boolean isActive(long r8) {
            r7 = this;
            long r0 = r7.startTimeUs
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L11
            long r4 = r7.endTimeUs
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 == 0) goto L2f
        L11:
            int r4 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r4 > 0) goto L1b
            long r4 = r7.endTimeUs
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 == 0) goto L2f
        L1b:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L25
            long r2 = r7.endTimeUs
            int r4 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r4 < 0) goto L2f
        L25:
            int r2 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r2 > 0) goto L31
            long r0 = r7.endTimeUs
            int r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r2 >= 0) goto L31
        L2f:
            r8 = 1
            goto L32
        L31:
            r8 = 0
        L32:
            return r8
    }
}
