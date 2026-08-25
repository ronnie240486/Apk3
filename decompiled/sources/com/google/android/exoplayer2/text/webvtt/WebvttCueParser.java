package com.google.android.exoplayer2.text.webvtt;

/* JADX INFO: loaded from: classes3.dex */
public final class WebvttCueParser {
    private static final char CHAR_AMPERSAND = '&';
    private static final char CHAR_GREATER_THAN = '>';
    private static final char CHAR_LESS_THAN = '<';
    private static final char CHAR_SEMI_COLON = ';';
    private static final char CHAR_SLASH = '/';
    private static final char CHAR_SPACE = ' ';
    public static final java.util.regex.Pattern CUE_HEADER_PATTERN = null;
    private static final java.util.regex.Pattern CUE_SETTING_PATTERN = null;
    private static final java.util.Map<java.lang.String, java.lang.Integer> DEFAULT_BACKGROUND_COLORS = null;
    private static final java.util.Map<java.lang.String, java.lang.Integer> DEFAULT_TEXT_COLORS = null;
    private static final java.lang.String ENTITY_AMPERSAND = "amp";
    private static final java.lang.String ENTITY_GREATER_THAN = "gt";
    private static final java.lang.String ENTITY_LESS_THAN = "lt";
    private static final java.lang.String ENTITY_NON_BREAK_SPACE = "nbsp";
    private static final int STYLE_BOLD = 1;
    private static final int STYLE_ITALIC = 2;
    private static final java.lang.String TAG = "WebvttCueParser";
    private static final java.lang.String TAG_BOLD = "b";
    private static final java.lang.String TAG_CLASS = "c";
    private static final java.lang.String TAG_ITALIC = "i";
    private static final java.lang.String TAG_LANG = "lang";
    private static final java.lang.String TAG_RUBY = "ruby";
    private static final java.lang.String TAG_RUBY_TEXT = "rt";
    private static final java.lang.String TAG_UNDERLINE = "u";
    private static final java.lang.String TAG_VOICE = "v";
    private static final int TEXT_ALIGNMENT_CENTER = 2;
    private static final int TEXT_ALIGNMENT_END = 3;
    private static final int TEXT_ALIGNMENT_LEFT = 4;
    private static final int TEXT_ALIGNMENT_RIGHT = 5;
    private static final int TEXT_ALIGNMENT_START = 1;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.text.webvtt.WebvttCueParser$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static class Element {
        private static final java.util.Comparator<com.google.android.exoplayer2.text.webvtt.WebvttCueParser.Element> BY_START_POSITION_ASC = null;
        private final int endPosition;
        private final com.google.android.exoplayer2.text.webvtt.WebvttCueParser.StartTag startTag;

        public static /* synthetic */ int $r8$lambda$VyiDJ7qRfxCLGd6CXvAWYb7Vhxg(com.google.android.exoplayer2.text.webvtt.WebvttCueParser.Element r0, com.google.android.exoplayer2.text.webvtt.WebvttCueParser.Element r1) {
                int r0 = lambda$static$0(r0, r1)
                return r0
        }

        static {
                com.google.android.exoplayer2.text.webvtt.WebvttSubtitle$$ExternalSyntheticLambda0 r0 = com.google.android.exoplayer2.text.webvtt.WebvttSubtitle$$ExternalSyntheticLambda0.INSTANCE$1
                com.google.android.exoplayer2.text.webvtt.WebvttCueParser.Element.BY_START_POSITION_ASC = r0
                return
        }

        private Element(com.google.android.exoplayer2.text.webvtt.WebvttCueParser.StartTag r1, int r2) {
                r0 = this;
                r0.<init>()
                r0.startTag = r1
                r0.endPosition = r2
                return
        }

        public /* synthetic */ Element(com.google.android.exoplayer2.text.webvtt.WebvttCueParser.StartTag r1, int r2, com.google.android.exoplayer2.text.webvtt.WebvttCueParser.AnonymousClass1 r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static /* synthetic */ java.util.Comparator access$100() {
                java.util.Comparator<com.google.android.exoplayer2.text.webvtt.WebvttCueParser$Element> r0 = com.google.android.exoplayer2.text.webvtt.WebvttCueParser.Element.BY_START_POSITION_ASC
                return r0
        }

        public static /* synthetic */ com.google.android.exoplayer2.text.webvtt.WebvttCueParser.StartTag access$200(com.google.android.exoplayer2.text.webvtt.WebvttCueParser.Element r0) {
                com.google.android.exoplayer2.text.webvtt.WebvttCueParser$StartTag r0 = r0.startTag
                return r0
        }

        public static /* synthetic */ int access$300(com.google.android.exoplayer2.text.webvtt.WebvttCueParser.Element r0) {
                int r0 = r0.endPosition
                return r0
        }

        private static /* synthetic */ int lambda$static$0(com.google.android.exoplayer2.text.webvtt.WebvttCueParser.Element r0, com.google.android.exoplayer2.text.webvtt.WebvttCueParser.Element r1) {
                com.google.android.exoplayer2.text.webvtt.WebvttCueParser$StartTag r0 = r0.startTag
                int r0 = r0.position
                com.google.android.exoplayer2.text.webvtt.WebvttCueParser$StartTag r1 = r1.startTag
                int r1 = r1.position
                int r0 = java.lang.Integer.compare(r0, r1)
                return r0
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class StartTag {
        public final java.util.Set<java.lang.String> classes;
        public final java.lang.String name;
        public final int position;
        public final java.lang.String voice;

        private StartTag(java.lang.String r1, int r2, java.lang.String r3, java.util.Set<java.lang.String> r4) {
                r0 = this;
                r0.<init>()
                r0.position = r2
                r0.name = r1
                r0.voice = r3
                r0.classes = r4
                return
        }

        public static com.google.android.exoplayer2.text.webvtt.WebvttCueParser.StartTag buildStartTag(java.lang.String r5, int r6) {
                java.lang.String r5 = r5.trim()
                boolean r0 = r5.isEmpty()
                r1 = 1
                r0 = r0 ^ r1
                com.google.android.exoplayer2.util.Assertions.checkArgument(r0)
                java.lang.String r0 = " "
                int r0 = r5.indexOf(r0)
                r2 = -1
                r3 = 0
                if (r0 != r2) goto L1a
                java.lang.String r0 = ""
                goto L27
            L1a:
                java.lang.String r2 = r5.substring(r0)
                java.lang.String r2 = r2.trim()
                java.lang.String r5 = r5.substring(r3, r0)
                r0 = r2
            L27:
                java.lang.String r2 = "\\."
                java.lang.String[] r5 = com.google.android.exoplayer2.util.Util.split(r5, r2)
                r2 = r5[r3]
                java.util.HashSet r3 = new java.util.HashSet
                r3.<init>()
            L34:
                int r4 = r5.length
                if (r1 >= r4) goto L3f
                r4 = r5[r1]
                r3.add(r4)
                int r1 = r1 + 1
                goto L34
            L3f:
                com.google.android.exoplayer2.text.webvtt.WebvttCueParser$StartTag r5 = new com.google.android.exoplayer2.text.webvtt.WebvttCueParser$StartTag
                r5.<init>(r2, r6, r0, r3)
                return r5
        }

        public static com.google.android.exoplayer2.text.webvtt.WebvttCueParser.StartTag buildWholeCueVirtualTag() {
                com.google.android.exoplayer2.text.webvtt.WebvttCueParser$StartTag r0 = new com.google.android.exoplayer2.text.webvtt.WebvttCueParser$StartTag
                java.util.Set r1 = java.util.Collections.emptySet()
                java.lang.String r2 = ""
                r3 = 0
                r0.<init>(r2, r3, r2, r1)
                return r0
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class StyleMatch implements java.lang.Comparable<com.google.android.exoplayer2.text.webvtt.WebvttCueParser.StyleMatch> {
        public final int score;
        public final com.google.android.exoplayer2.text.webvtt.WebvttCssStyle style;

        public StyleMatch(int r1, com.google.android.exoplayer2.text.webvtt.WebvttCssStyle r2) {
                r0 = this;
                r0.<init>()
                r0.score = r1
                r0.style = r2
                return
        }

        /* JADX INFO: renamed from: compareTo, reason: avoid collision after fix types in other method */
        public int compareTo2(com.google.android.exoplayer2.text.webvtt.WebvttCueParser.StyleMatch r2) {
                r1 = this;
                int r0 = r1.score
                int r2 = r2.score
                int r2 = java.lang.Integer.compare(r0, r2)
                return r2
        }

        @Override // java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(com.google.android.exoplayer2.text.webvtt.WebvttCueParser.StyleMatch r1) {
                r0 = this;
                com.google.android.exoplayer2.text.webvtt.WebvttCueParser$StyleMatch r1 = (com.google.android.exoplayer2.text.webvtt.WebvttCueParser.StyleMatch) r1
                int r1 = r0.compareTo2(r1)
                return r1
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class WebvttCueInfoBuilder {
        public long endTimeUs;
        public float line;
        public int lineAnchor;
        public int lineType;
        public float position;
        public int positionAnchor;
        public float size;
        public long startTimeUs;
        public java.lang.CharSequence text;
        public int textAlignment;
        public int verticalType;

        public WebvttCueInfoBuilder() {
                r2 = this;
                r2.<init>()
                r0 = 0
                r2.startTimeUs = r0
                r2.endTimeUs = r0
                r0 = 2
                r2.textAlignment = r0
                r0 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
                r2.line = r0
                r1 = 1
                r2.lineType = r1
                r1 = 0
                r2.lineAnchor = r1
                r2.position = r0
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r2.positionAnchor = r0
                r1 = 1065353216(0x3f800000, float:1.0)
                r2.size = r1
                r2.verticalType = r0
                return
        }

        private static float computeLine(float r4, int r5) {
                r0 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
                r1 = 1065353216(0x3f800000, float:1.0)
                int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r2 == 0) goto L15
                if (r5 != 0) goto L15
                r3 = 0
                int r3 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
                if (r3 < 0) goto L14
                int r3 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
                if (r3 <= 0) goto L15
            L14:
                return r1
            L15:
                if (r2 == 0) goto L18
                return r4
            L18:
                if (r5 != 0) goto L1b
                return r1
            L1b:
                return r0
        }

        @androidx.annotation.Nullable
        private static android.text.Layout.Alignment convertTextAlignment(int r2) {
                r0 = 1
                if (r2 == r0) goto L1e
                r0 = 2
                if (r2 == r0) goto L1b
                r0 = 3
                if (r2 == r0) goto L18
                r0 = 4
                if (r2 == r0) goto L1e
                r0 = 5
                if (r2 == r0) goto L18
                java.lang.String r0 = "Unknown textAlignment: "
                java.lang.String r1 = "WebvttCueParser"
                androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m26m(r0, r2, r1)
                r2 = 0
                return r2
            L18:
                android.text.Layout$Alignment r2 = android.text.Layout.Alignment.ALIGN_OPPOSITE
                return r2
            L1b:
                android.text.Layout$Alignment r2 = android.text.Layout.Alignment.ALIGN_CENTER
                return r2
            L1e:
                android.text.Layout$Alignment r2 = android.text.Layout.Alignment.ALIGN_NORMAL
                return r2
        }

        private static float deriveMaxSize(int r2, float r3) {
                r0 = 1065353216(0x3f800000, float:1.0)
                if (r2 == 0) goto L24
                r1 = 1
                if (r2 == r1) goto L15
                r0 = 2
                if (r2 != r0) goto Lb
                return r3
            Lb:
                java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                java.lang.String r2 = java.lang.String.valueOf(r2)
                r3.<init>(r2)
                throw r3
            L15:
                r2 = 1056964608(0x3f000000, float:0.5)
                r1 = 1073741824(0x40000000, float:2.0)
                int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
                if (r2 > 0) goto L20
                float r3 = r3 * r1
                return r3
            L20:
                float r0 = r0 - r3
                float r0 = r0 * r1
                return r0
            L24:
                float r0 = r0 - r3
                return r0
        }

        private static float derivePosition(int r1) {
                r0 = 4
                if (r1 == r0) goto Lc
                r0 = 5
                if (r1 == r0) goto L9
                r1 = 1056964608(0x3f000000, float:0.5)
                return r1
            L9:
                r1 = 1065353216(0x3f800000, float:1.0)
                return r1
            Lc:
                r1 = 0
                return r1
        }

        private static int derivePositionAnchor(int r2) {
                r0 = 1
                if (r2 == r0) goto Lf
                r1 = 3
                if (r2 == r1) goto Ld
                r1 = 4
                if (r2 == r1) goto Lf
                r1 = 5
                if (r2 == r1) goto Ld
                return r0
            Ld:
                r2 = 2
                return r2
            Lf:
                r2 = 0
                return r2
        }

        public com.google.android.exoplayer2.text.webvtt.WebvttCueInfo build() {
                r7 = this;
                com.google.android.exoplayer2.text.webvtt.WebvttCueInfo r6 = new com.google.android.exoplayer2.text.webvtt.WebvttCueInfo
                com.google.android.exoplayer2.text.Cue$Builder r0 = r7.toCueBuilder()
                com.google.android.exoplayer2.text.Cue r1 = r0.build()
                long r2 = r7.startTimeUs
                long r4 = r7.endTimeUs
                r0 = r6
                r0.<init>(r1, r2, r4)
                return r6
        }

        public com.google.android.exoplayer2.text.Cue.Builder toCueBuilder() {
                r5 = this;
                float r0 = r5.position
                r1 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
                int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r1 == 0) goto La
                goto L10
            La:
                int r0 = r5.textAlignment
                float r0 = derivePosition(r0)
            L10:
                int r1 = r5.positionAnchor
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                if (r1 == r2) goto L17
                goto L1d
            L17:
                int r1 = r5.textAlignment
                int r1 = derivePositionAnchor(r1)
            L1d:
                com.google.android.exoplayer2.text.Cue$Builder r2 = new com.google.android.exoplayer2.text.Cue$Builder
                r2.<init>()
                int r3 = r5.textAlignment
                android.text.Layout$Alignment r3 = convertTextAlignment(r3)
                com.google.android.exoplayer2.text.Cue$Builder r2 = r2.setTextAlignment(r3)
                float r3 = r5.line
                int r4 = r5.lineType
                float r3 = computeLine(r3, r4)
                int r4 = r5.lineType
                com.google.android.exoplayer2.text.Cue$Builder r2 = r2.setLine(r3, r4)
                int r3 = r5.lineAnchor
                com.google.android.exoplayer2.text.Cue$Builder r2 = r2.setLineAnchor(r3)
                com.google.android.exoplayer2.text.Cue$Builder r2 = r2.setPosition(r0)
                com.google.android.exoplayer2.text.Cue$Builder r2 = r2.setPositionAnchor(r1)
                float r3 = r5.size
                float r0 = deriveMaxSize(r1, r0)
                float r0 = java.lang.Math.min(r3, r0)
                com.google.android.exoplayer2.text.Cue$Builder r0 = r2.setSize(r0)
                int r1 = r5.verticalType
                com.google.android.exoplayer2.text.Cue$Builder r0 = r0.setVerticalType(r1)
                java.lang.CharSequence r1 = r5.text
                if (r1 == 0) goto L63
                r0.setText(r1)
            L63:
                return r0
        }
    }

    static {
            java.lang.String r0 = "^(\\S+)\\s+-->\\s+(\\S+)(.*)?$"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.google.android.exoplayer2.text.webvtt.WebvttCueParser.CUE_HEADER_PATTERN = r0
            java.lang.String r0 = "(\\S+?):(\\S+)"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.google.android.exoplayer2.text.webvtt.WebvttCueParser.CUE_SETTING_PATTERN = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1 = 255(0xff, float:3.57E-43)
            int r2 = android.graphics.Color.rgb(r1, r1, r1)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r3 = "white"
            r0.put(r3, r2)
            r2 = 0
            int r3 = android.graphics.Color.rgb(r2, r1, r2)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r4 = "lime"
            r0.put(r4, r3)
            int r3 = android.graphics.Color.rgb(r2, r1, r1)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r4 = "cyan"
            r0.put(r4, r3)
            int r3 = android.graphics.Color.rgb(r1, r2, r2)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r4 = "red"
            r0.put(r4, r3)
            int r3 = android.graphics.Color.rgb(r1, r1, r2)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r4 = "yellow"
            r0.put(r4, r3)
            int r3 = android.graphics.Color.rgb(r1, r2, r1)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r4 = "magenta"
            r0.put(r4, r3)
            int r3 = android.graphics.Color.rgb(r2, r2, r1)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r4 = "blue"
            r0.put(r4, r3)
            int r3 = android.graphics.Color.rgb(r2, r2, r2)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r4 = "black"
            r0.put(r4, r3)
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r0)
            com.google.android.exoplayer2.text.webvtt.WebvttCueParser.DEFAULT_TEXT_COLORS = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            int r3 = android.graphics.Color.rgb(r1, r1, r1)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r4 = "bg_white"
            r0.put(r4, r3)
            int r3 = android.graphics.Color.rgb(r2, r1, r2)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r4 = "bg_lime"
            r0.put(r4, r3)
            int r3 = android.graphics.Color.rgb(r2, r1, r1)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r4 = "bg_cyan"
            r0.put(r4, r3)
            int r3 = android.graphics.Color.rgb(r1, r2, r2)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r4 = "bg_red"
            r0.put(r4, r3)
            int r3 = android.graphics.Color.rgb(r1, r1, r2)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r4 = "bg_yellow"
            r0.put(r4, r3)
            int r3 = android.graphics.Color.rgb(r1, r2, r1)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r4 = "bg_magenta"
            r0.put(r4, r3)
            int r1 = android.graphics.Color.rgb(r2, r2, r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r3 = "bg_blue"
            r0.put(r3, r1)
            int r1 = android.graphics.Color.rgb(r2, r2, r2)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "bg_black"
            r0.put(r2, r1)
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r0)
            com.google.android.exoplayer2.text.webvtt.WebvttCueParser.DEFAULT_BACKGROUND_COLORS = r0
            return
    }

    public WebvttCueParser() {
            r0 = this;
            r0.<init>()
            return
    }

    private static void applyDefaultColors(android.text.SpannableStringBuilder r4, java.util.Set<java.lang.String> r5, int r6, int r7) {
            java.util.Iterator r5 = r5.iterator()
        L4:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L48
            java.lang.Object r0 = r5.next()
            java.lang.String r0 = (java.lang.String) r0
            java.util.Map<java.lang.String, java.lang.Integer> r1 = com.google.android.exoplayer2.text.webvtt.WebvttCueParser.DEFAULT_TEXT_COLORS
            boolean r2 = r1.containsKey(r0)
            r3 = 33
            if (r2 == 0) goto L2d
            java.lang.Object r0 = r1.get(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            android.text.style.ForegroundColorSpan r1 = new android.text.style.ForegroundColorSpan
            r1.<init>(r0)
            r4.setSpan(r1, r6, r7, r3)
            goto L4
        L2d:
            java.util.Map<java.lang.String, java.lang.Integer> r1 = com.google.android.exoplayer2.text.webvtt.WebvttCueParser.DEFAULT_BACKGROUND_COLORS
            boolean r2 = r1.containsKey(r0)
            if (r2 == 0) goto L4
            java.lang.Object r0 = r1.get(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            android.text.style.BackgroundColorSpan r1 = new android.text.style.BackgroundColorSpan
            r1.<init>(r0)
            r4.setSpan(r1, r6, r7, r3)
            goto L4
        L48:
            return
    }

    private static void applyEntity(java.lang.String r2, android.text.SpannableStringBuilder r3) {
            java.util.Objects.requireNonNull(r2)
            int r0 = r2.hashCode()
            r1 = -1
            switch(r0) {
                case 3309: goto L2d;
                case 3464: goto L22;
                case 96708: goto L17;
                case 3374865: goto Lc;
                default: goto Lb;
            }
        Lb:
            goto L37
        Lc:
            java.lang.String r0 = "nbsp"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L15
            goto L37
        L15:
            r1 = 3
            goto L37
        L17:
            java.lang.String r0 = "amp"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L20
            goto L37
        L20:
            r1 = 2
            goto L37
        L22:
            java.lang.String r0 = "lt"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L2b
            goto L37
        L2b:
            r1 = 1
            goto L37
        L2d:
            java.lang.String r0 = "gt"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L36
            goto L37
        L36:
            r1 = 0
        L37:
            switch(r1) {
                case 0: goto L68;
                case 1: goto L62;
                case 2: goto L5c;
                case 3: goto L56;
                default: goto L3a;
            }
        L3a:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "ignoring unsupported entity: '&"
            r3.append(r0)
            r3.append(r2)
            java.lang.String r2 = ";'"
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            java.lang.String r3 = "WebvttCueParser"
            com.google.android.exoplayer2.util.Log.w(r3, r2)
            goto L6d
        L56:
            r2 = 32
            r3.append(r2)
            goto L6d
        L5c:
            r2 = 38
            r3.append(r2)
            goto L6d
        L62:
            r2 = 60
            r3.append(r2)
            goto L6d
        L68:
            r2 = 62
            r3.append(r2)
        L6d:
            return
    }

    private static void applyRubySpans(android.text.SpannableStringBuilder r8, @androidx.annotation.Nullable java.lang.String r9, com.google.android.exoplayer2.text.webvtt.WebvttCueParser.StartTag r10, java.util.List<com.google.android.exoplayer2.text.webvtt.WebvttCueParser.Element> r11, java.util.List<com.google.android.exoplayer2.text.webvtt.WebvttCssStyle> r12) {
            int r0 = getRubyPosition(r12, r9, r10)
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r11.size()
            r1.<init>(r2)
            r1.addAll(r11)
            java.util.Comparator r11 = com.google.android.exoplayer2.text.webvtt.WebvttCueParser.Element.access$100()
            java.util.Collections.sort(r1, r11)
            int r10 = r10.position
            r11 = 0
            r2 = 0
        L1b:
            int r3 = r1.size()
            if (r11 >= r3) goto L75
            java.lang.Object r3 = r1.get(r11)
            com.google.android.exoplayer2.text.webvtt.WebvttCueParser$Element r3 = (com.google.android.exoplayer2.text.webvtt.WebvttCueParser.Element) r3
            com.google.android.exoplayer2.text.webvtt.WebvttCueParser$StartTag r3 = com.google.android.exoplayer2.text.webvtt.WebvttCueParser.Element.access$200(r3)
            java.lang.String r3 = r3.name
            java.lang.String r4 = "rt"
            boolean r3 = r4.equals(r3)
            if (r3 != 0) goto L37
            goto L72
        L37:
            java.lang.Object r3 = r1.get(r11)
            com.google.android.exoplayer2.text.webvtt.WebvttCueParser$Element r3 = (com.google.android.exoplayer2.text.webvtt.WebvttCueParser.Element) r3
            com.google.android.exoplayer2.text.webvtt.WebvttCueParser$StartTag r4 = com.google.android.exoplayer2.text.webvtt.WebvttCueParser.Element.access$200(r3)
            int r4 = getRubyPosition(r12, r9, r4)
            r5 = 1
            int r4 = firstKnownRubyPosition(r4, r0, r5)
            com.google.android.exoplayer2.text.webvtt.WebvttCueParser$StartTag r5 = com.google.android.exoplayer2.text.webvtt.WebvttCueParser.Element.access$200(r3)
            int r5 = r5.position
            int r5 = r5 - r2
            int r3 = com.google.android.exoplayer2.text.webvtt.WebvttCueParser.Element.access$300(r3)
            int r3 = r3 - r2
            java.lang.CharSequence r6 = r8.subSequence(r5, r3)
            r8.delete(r5, r3)
            com.google.android.exoplayer2.text.span.RubySpan r3 = new com.google.android.exoplayer2.text.span.RubySpan
            java.lang.String r7 = r6.toString()
            r3.<init>(r7, r4)
            r4 = 33
            r8.setSpan(r3, r10, r5, r4)
            int r10 = r6.length()
            int r10 = r10 + r2
            r2 = r10
            r10 = r5
        L72:
            int r11 = r11 + 1
            goto L1b
        L75:
            return
    }

    private static void applySpansForTag(@androidx.annotation.Nullable java.lang.String r8, com.google.android.exoplayer2.text.webvtt.WebvttCueParser.StartTag r9, java.util.List<com.google.android.exoplayer2.text.webvtt.WebvttCueParser.Element> r10, android.text.SpannableStringBuilder r11, java.util.List<com.google.android.exoplayer2.text.webvtt.WebvttCssStyle> r12) {
            int r0 = r9.position
            int r1 = r11.length()
            java.lang.String r2 = r9.name
            java.util.Objects.requireNonNull(r2)
            int r3 = r2.hashCode()
            r4 = 2
            r5 = 0
            r6 = 1
            r7 = -1
            switch(r3) {
                case 0: goto L68;
                case 98: goto L5d;
                case 99: goto L52;
                case 105: goto L47;
                case 117: goto L3b;
                case 118: goto L2f;
                case 3314158: goto L24;
                case 3511770: goto L18;
                default: goto L16;
            }
        L16:
            goto L72
        L18:
            java.lang.String r3 = "ruby"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L22
            goto L72
        L22:
            r7 = 7
            goto L72
        L24:
            java.lang.String r3 = "lang"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L2d
            goto L72
        L2d:
            r7 = 6
            goto L72
        L2f:
            java.lang.String r3 = "v"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L39
            goto L72
        L39:
            r7 = 5
            goto L72
        L3b:
            java.lang.String r3 = "u"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L45
            goto L72
        L45:
            r7 = 4
            goto L72
        L47:
            java.lang.String r3 = "i"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L50
            goto L72
        L50:
            r7 = 3
            goto L72
        L52:
            java.lang.String r3 = "c"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L5b
            goto L72
        L5b:
            r7 = 2
            goto L72
        L5d:
            java.lang.String r3 = "b"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L66
            goto L72
        L66:
            r7 = 1
            goto L72
        L68:
            java.lang.String r3 = ""
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L71
            goto L72
        L71:
            r7 = 0
        L72:
            r2 = 33
            switch(r7) {
                case 0: goto L9c;
                case 1: goto L94;
                case 2: goto L8e;
                case 3: goto L85;
                case 4: goto L7c;
                case 5: goto L9c;
                case 6: goto L9c;
                case 7: goto L78;
                default: goto L77;
            }
        L77:
            return
        L78:
            applyRubySpans(r11, r8, r9, r10, r12)
            goto L9c
        L7c:
            android.text.style.UnderlineSpan r10 = new android.text.style.UnderlineSpan
            r10.<init>()
            r11.setSpan(r10, r0, r1, r2)
            goto L9c
        L85:
            android.text.style.StyleSpan r10 = new android.text.style.StyleSpan
            r10.<init>(r4)
            r11.setSpan(r10, r0, r1, r2)
            goto L9c
        L8e:
            java.util.Set<java.lang.String> r10 = r9.classes
            applyDefaultColors(r11, r10, r0, r1)
            goto L9c
        L94:
            android.text.style.StyleSpan r10 = new android.text.style.StyleSpan
            r10.<init>(r6)
            r11.setSpan(r10, r0, r1, r2)
        L9c:
            java.util.List r8 = getApplicableStyles(r12, r8, r9)
        La0:
            int r9 = r8.size()
            if (r5 >= r9) goto Lb4
            java.lang.Object r9 = r8.get(r5)
            com.google.android.exoplayer2.text.webvtt.WebvttCueParser$StyleMatch r9 = (com.google.android.exoplayer2.text.webvtt.WebvttCueParser.StyleMatch) r9
            com.google.android.exoplayer2.text.webvtt.WebvttCssStyle r9 = r9.style
            applyStyleToText(r11, r9, r0, r1)
            int r5 = r5 + 1
            goto La0
        Lb4:
            return
    }

    private static void applyStyleToText(android.text.SpannableStringBuilder r4, com.google.android.exoplayer2.text.webvtt.WebvttCssStyle r5, int r6, int r7) {
            if (r5 != 0) goto L3
            return
        L3:
            int r0 = r5.getStyle()
            r1 = -1
            r2 = 33
            if (r0 == r1) goto L18
            android.text.style.StyleSpan r0 = new android.text.style.StyleSpan
            int r1 = r5.getStyle()
            r0.<init>(r1)
            com.google.android.exoplayer2.text.span.SpanUtil.addOrReplaceSpan(r4, r0, r6, r7, r2)
        L18:
            boolean r0 = r5.isLinethrough()
            if (r0 == 0) goto L26
            android.text.style.StrikethroughSpan r0 = new android.text.style.StrikethroughSpan
            r0.<init>()
            r4.setSpan(r0, r6, r7, r2)
        L26:
            boolean r0 = r5.isUnderline()
            if (r0 == 0) goto L34
            android.text.style.UnderlineSpan r0 = new android.text.style.UnderlineSpan
            r0.<init>()
            r4.setSpan(r0, r6, r7, r2)
        L34:
            boolean r0 = r5.hasFontColor()
            if (r0 == 0) goto L46
            android.text.style.ForegroundColorSpan r0 = new android.text.style.ForegroundColorSpan
            int r1 = r5.getFontColor()
            r0.<init>(r1)
            com.google.android.exoplayer2.text.span.SpanUtil.addOrReplaceSpan(r4, r0, r6, r7, r2)
        L46:
            boolean r0 = r5.hasBackgroundColor()
            if (r0 == 0) goto L58
            android.text.style.BackgroundColorSpan r0 = new android.text.style.BackgroundColorSpan
            int r1 = r5.getBackgroundColor()
            r0.<init>(r1)
            com.google.android.exoplayer2.text.span.SpanUtil.addOrReplaceSpan(r4, r0, r6, r7, r2)
        L58:
            java.lang.String r0 = r5.getFontFamily()
            if (r0 == 0) goto L6a
            android.text.style.TypefaceSpan r0 = new android.text.style.TypefaceSpan
            java.lang.String r1 = r5.getFontFamily()
            r0.<init>(r1)
            com.google.android.exoplayer2.text.span.SpanUtil.addOrReplaceSpan(r4, r0, r6, r7, r2)
        L6a:
            int r0 = r5.getFontSizeUnit()
            r1 = 1
            if (r0 == r1) goto L95
            r1 = 2
            if (r0 == r1) goto L88
            r1 = 3
            if (r0 == r1) goto L78
            goto La2
        L78:
            android.text.style.RelativeSizeSpan r0 = new android.text.style.RelativeSizeSpan
            float r1 = r5.getFontSize()
            r3 = 1120403456(0x42c80000, float:100.0)
            float r1 = r1 / r3
            r0.<init>(r1)
            com.google.android.exoplayer2.text.span.SpanUtil.addOrReplaceSpan(r4, r0, r6, r7, r2)
            goto La2
        L88:
            android.text.style.RelativeSizeSpan r0 = new android.text.style.RelativeSizeSpan
            float r1 = r5.getFontSize()
            r0.<init>(r1)
            com.google.android.exoplayer2.text.span.SpanUtil.addOrReplaceSpan(r4, r0, r6, r7, r2)
            goto La2
        L95:
            android.text.style.AbsoluteSizeSpan r0 = new android.text.style.AbsoluteSizeSpan
            float r3 = r5.getFontSize()
            int r3 = (int) r3
            r0.<init>(r3, r1)
            com.google.android.exoplayer2.text.span.SpanUtil.addOrReplaceSpan(r4, r0, r6, r7, r2)
        La2:
            boolean r5 = r5.getCombineUpright()
            if (r5 == 0) goto Lb0
            com.google.android.exoplayer2.text.span.HorizontalTextInVerticalContextSpan r5 = new com.google.android.exoplayer2.text.span.HorizontalTextInVerticalContextSpan
            r5.<init>()
            r4.setSpan(r5, r6, r7, r2)
        Lb0:
            return
    }

    private static int findEndOfTag(java.lang.String r1, int r2) {
            r0 = 62
            int r2 = r1.indexOf(r0, r2)
            r0 = -1
            if (r2 != r0) goto Le
            int r1 = r1.length()
            goto L10
        Le:
            int r1 = r2 + 1
        L10:
            return r1
    }

    private static int firstKnownRubyPosition(int r1, int r2, int r3) {
            r0 = -1
            if (r1 == r0) goto L4
            return r1
        L4:
            if (r2 == r0) goto L7
            return r2
        L7:
            if (r3 == r0) goto La
            return r3
        La:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>()
            throw r1
    }

    private static java.util.List<com.google.android.exoplayer2.text.webvtt.WebvttCueParser.StyleMatch> getApplicableStyles(java.util.List<com.google.android.exoplayer2.text.webvtt.WebvttCssStyle> r6, @androidx.annotation.Nullable java.lang.String r7, com.google.android.exoplayer2.text.webvtt.WebvttCueParser.StartTag r8) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
        L6:
            int r2 = r6.size()
            if (r1 >= r2) goto L29
            java.lang.Object r2 = r6.get(r1)
            com.google.android.exoplayer2.text.webvtt.WebvttCssStyle r2 = (com.google.android.exoplayer2.text.webvtt.WebvttCssStyle) r2
            java.lang.String r3 = r8.name
            java.util.Set<java.lang.String> r4 = r8.classes
            java.lang.String r5 = r8.voice
            int r3 = r2.getSpecificityScore(r7, r3, r4, r5)
            if (r3 <= 0) goto L26
            com.google.android.exoplayer2.text.webvtt.WebvttCueParser$StyleMatch r4 = new com.google.android.exoplayer2.text.webvtt.WebvttCueParser$StyleMatch
            r4.<init>(r3, r2)
            r0.add(r4)
        L26:
            int r1 = r1 + 1
            goto L6
        L29:
            java.util.Collections.sort(r0)
            return r0
    }

    private static int getRubyPosition(java.util.List<com.google.android.exoplayer2.text.webvtt.WebvttCssStyle> r2, @androidx.annotation.Nullable java.lang.String r3, com.google.android.exoplayer2.text.webvtt.WebvttCueParser.StartTag r4) {
            java.util.List r2 = getApplicableStyles(r2, r3, r4)
            r3 = 0
        L5:
            int r4 = r2.size()
            r0 = -1
            if (r3 >= r4) goto L22
            java.lang.Object r4 = r2.get(r3)
            com.google.android.exoplayer2.text.webvtt.WebvttCueParser$StyleMatch r4 = (com.google.android.exoplayer2.text.webvtt.WebvttCueParser.StyleMatch) r4
            com.google.android.exoplayer2.text.webvtt.WebvttCssStyle r4 = r4.style
            int r1 = r4.getRubyPosition()
            if (r1 == r0) goto L1f
            int r2 = r4.getRubyPosition()
            return r2
        L1f:
            int r3 = r3 + 1
            goto L5
        L22:
            return r0
    }

    private static java.lang.String getTagName(java.lang.String r1) {
            java.lang.String r1 = r1.trim()
            boolean r0 = r1.isEmpty()
            r0 = r0 ^ 1
            com.google.android.exoplayer2.util.Assertions.checkArgument(r0)
            java.lang.String r0 = "[ \\.]"
            java.lang.String[] r1 = com.google.android.exoplayer2.util.Util.splitAtFirst(r1, r0)
            r0 = 0
            r1 = r1[r0]
            return r1
    }

    private static boolean isSupportedTag(java.lang.String r4) {
            java.util.Objects.requireNonNull(r4)
            int r0 = r4.hashCode()
            r1 = 1
            r2 = 0
            r3 = -1
            switch(r0) {
                case 98: goto L60;
                case 99: goto L55;
                case 105: goto L4a;
                case 117: goto L3e;
                case 118: goto L32;
                case 3650: goto L26;
                case 3314158: goto L1b;
                case 3511770: goto Lf;
                default: goto Ld;
            }
        Ld:
            goto L6a
        Lf:
            java.lang.String r0 = "ruby"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L19
            goto L6a
        L19:
            r3 = 7
            goto L6a
        L1b:
            java.lang.String r0 = "lang"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L24
            goto L6a
        L24:
            r3 = 6
            goto L6a
        L26:
            java.lang.String r0 = "rt"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L30
            goto L6a
        L30:
            r3 = 5
            goto L6a
        L32:
            java.lang.String r0 = "v"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L3c
            goto L6a
        L3c:
            r3 = 4
            goto L6a
        L3e:
            java.lang.String r0 = "u"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L48
            goto L6a
        L48:
            r3 = 3
            goto L6a
        L4a:
            java.lang.String r0 = "i"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L53
            goto L6a
        L53:
            r3 = 2
            goto L6a
        L55:
            java.lang.String r0 = "c"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L5e
            goto L6a
        L5e:
            r3 = 1
            goto L6a
        L60:
            java.lang.String r0 = "b"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L69
            goto L6a
        L69:
            r3 = 0
        L6a:
            switch(r3) {
                case 0: goto L6e;
                case 1: goto L6e;
                case 2: goto L6e;
                case 3: goto L6e;
                case 4: goto L6e;
                case 5: goto L6e;
                case 6: goto L6e;
                case 7: goto L6e;
                default: goto L6d;
            }
        L6d:
            return r2
        L6e:
            return r1
    }

    @androidx.annotation.Nullable
    public static com.google.android.exoplayer2.text.webvtt.WebvttCueInfo parseCue(com.google.android.exoplayer2.util.ParsableByteArray r5, java.util.List<com.google.android.exoplayer2.text.webvtt.WebvttCssStyle> r6) {
            java.lang.String r0 = r5.readLine()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            java.util.regex.Pattern r2 = com.google.android.exoplayer2.text.webvtt.WebvttCueParser.CUE_HEADER_PATTERN
            java.util.regex.Matcher r3 = r2.matcher(r0)
            boolean r4 = r3.matches()
            if (r4 == 0) goto L19
            com.google.android.exoplayer2.text.webvtt.WebvttCueInfo r5 = parseCue(r1, r3, r5, r6)
            return r5
        L19:
            java.lang.String r3 = r5.readLine()
            if (r3 != 0) goto L20
            return r1
        L20:
            java.util.regex.Matcher r2 = r2.matcher(r3)
            boolean r3 = r2.matches()
            if (r3 == 0) goto L33
            java.lang.String r0 = r0.trim()
            com.google.android.exoplayer2.text.webvtt.WebvttCueInfo r5 = parseCue(r0, r2, r5, r6)
            return r5
        L33:
            return r1
    }

    @androidx.annotation.Nullable
    private static com.google.android.exoplayer2.text.webvtt.WebvttCueInfo parseCue(@androidx.annotation.Nullable java.lang.String r3, java.util.regex.Matcher r4, com.google.android.exoplayer2.util.ParsableByteArray r5, java.util.List<com.google.android.exoplayer2.text.webvtt.WebvttCssStyle> r6) {
            com.google.android.exoplayer2.text.webvtt.WebvttCueParser$WebvttCueInfoBuilder r0 = new com.google.android.exoplayer2.text.webvtt.WebvttCueParser$WebvttCueInfoBuilder
            r0.<init>()
            r1 = 1
            java.lang.String r1 = r4.group(r1)     // Catch: java.lang.NumberFormatException -> L6a
            java.lang.Object r1 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r1)     // Catch: java.lang.NumberFormatException -> L6a
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.NumberFormatException -> L6a
            long r1 = com.google.android.exoplayer2.text.webvtt.WebvttParserUtil.parseTimestampUs(r1)     // Catch: java.lang.NumberFormatException -> L6a
            r0.startTimeUs = r1     // Catch: java.lang.NumberFormatException -> L6a
            r1 = 2
            java.lang.String r1 = r4.group(r1)     // Catch: java.lang.NumberFormatException -> L6a
            java.lang.Object r1 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r1)     // Catch: java.lang.NumberFormatException -> L6a
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.NumberFormatException -> L6a
            long r1 = com.google.android.exoplayer2.text.webvtt.WebvttParserUtil.parseTimestampUs(r1)     // Catch: java.lang.NumberFormatException -> L6a
            r0.endTimeUs = r1     // Catch: java.lang.NumberFormatException -> L6a
            r1 = 3
            java.lang.String r4 = r4.group(r1)
            java.lang.Object r4 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r4)
            java.lang.String r4 = (java.lang.String) r4
            parseCueSettingsList(r4, r0)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r1 = r5.readLine()
        L3e:
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L5b
            int r2 = r4.length()
            if (r2 <= 0) goto L4f
            java.lang.String r2 = "\n"
            r4.append(r2)
        L4f:
            java.lang.String r1 = r1.trim()
            r4.append(r1)
            java.lang.String r1 = r5.readLine()
            goto L3e
        L5b:
            java.lang.String r4 = r4.toString()
            android.text.SpannedString r3 = parseCueText(r3, r4, r6)
            r0.text = r3
            com.google.android.exoplayer2.text.webvtt.WebvttCueInfo r3 = r0.build()
            return r3
        L6a:
            java.lang.String r3 = "Skipping cue with bad header: "
            java.lang.StringBuilder r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r3)
            java.lang.String r4 = r4.group()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "WebvttCueParser"
            com.google.android.exoplayer2.util.Log.w(r4, r3)
            r3 = 0
            return r3
    }

    public static com.google.android.exoplayer2.text.Cue.Builder parseCueSettingsList(java.lang.String r1) {
            com.google.android.exoplayer2.text.webvtt.WebvttCueParser$WebvttCueInfoBuilder r0 = new com.google.android.exoplayer2.text.webvtt.WebvttCueParser$WebvttCueInfoBuilder
            r0.<init>()
            parseCueSettingsList(r1, r0)
            com.google.android.exoplayer2.text.Cue$Builder r1 = r0.toCueBuilder()
            return r1
    }

    private static void parseCueSettingsList(java.lang.String r5, com.google.android.exoplayer2.text.webvtt.WebvttCueParser.WebvttCueInfoBuilder r6) {
            java.lang.String r0 = "WebvttCueParser"
            java.util.regex.Pattern r1 = com.google.android.exoplayer2.text.webvtt.WebvttCueParser.CUE_SETTING_PATTERN
            java.util.regex.Matcher r5 = r1.matcher(r5)
        L8:
            boolean r1 = r5.find()
            if (r1 == 0) goto L9e
            r1 = 1
            java.lang.String r1 = r5.group(r1)
            java.lang.Object r1 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r1)
            java.lang.String r1 = (java.lang.String) r1
            r2 = 2
            java.lang.String r2 = r5.group(r2)
            java.lang.Object r2 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r2)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = "line"
            boolean r3 = r3.equals(r1)     // Catch: java.lang.NumberFormatException -> L88
            if (r3 == 0) goto L30
            parseLineAttribute(r2, r6)     // Catch: java.lang.NumberFormatException -> L88
            goto L8
        L30:
            java.lang.String r3 = "align"
            boolean r3 = r3.equals(r1)     // Catch: java.lang.NumberFormatException -> L88
            if (r3 == 0) goto L3f
            int r1 = parseTextAlignment(r2)     // Catch: java.lang.NumberFormatException -> L88
            r6.textAlignment = r1     // Catch: java.lang.NumberFormatException -> L88
            goto L8
        L3f:
            java.lang.String r3 = "position"
            boolean r3 = r3.equals(r1)     // Catch: java.lang.NumberFormatException -> L88
            if (r3 == 0) goto L4b
            parsePositionAttribute(r2, r6)     // Catch: java.lang.NumberFormatException -> L88
            goto L8
        L4b:
            java.lang.String r3 = "size"
            boolean r3 = r3.equals(r1)     // Catch: java.lang.NumberFormatException -> L88
            if (r3 == 0) goto L5b
            float r1 = com.google.android.exoplayer2.text.webvtt.WebvttParserUtil.parsePercentage(r2)     // Catch: java.lang.NumberFormatException -> L88
            r6.size = r1     // Catch: java.lang.NumberFormatException -> L88
            goto L8
        L5b:
            java.lang.String r3 = "vertical"
            boolean r3 = r3.equals(r1)     // Catch: java.lang.NumberFormatException -> L88
            if (r3 == 0) goto L6b
            int r1 = parseVerticalAttribute(r2)     // Catch: java.lang.NumberFormatException -> L88
            r6.verticalType = r1     // Catch: java.lang.NumberFormatException -> L88
            goto L8
        L6b:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.NumberFormatException -> L88
            r3.<init>()     // Catch: java.lang.NumberFormatException -> L88
            java.lang.String r4 = "Unknown cue setting "
            r3.append(r4)     // Catch: java.lang.NumberFormatException -> L88
            r3.append(r1)     // Catch: java.lang.NumberFormatException -> L88
            java.lang.String r1 = ":"
            r3.append(r1)     // Catch: java.lang.NumberFormatException -> L88
            r3.append(r2)     // Catch: java.lang.NumberFormatException -> L88
            java.lang.String r1 = r3.toString()     // Catch: java.lang.NumberFormatException -> L88
            com.google.android.exoplayer2.util.Log.w(r0, r1)     // Catch: java.lang.NumberFormatException -> L88
            goto L8
        L88:
            java.lang.String r1 = "Skipping bad cue setting: "
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
            java.lang.String r2 = r5.group()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.google.android.exoplayer2.util.Log.w(r0, r1)
            goto L8
        L9e:
            return
    }

    public static android.text.SpannedString parseCueText(@androidx.annotation.Nullable java.lang.String r11, java.lang.String r12, java.util.List<com.google.android.exoplayer2.text.webvtt.WebvttCssStyle> r13) {
            android.text.SpannableStringBuilder r0 = new android.text.SpannableStringBuilder
            r0.<init>()
            java.util.ArrayDeque r1 = new java.util.ArrayDeque
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r3 = 0
            r4 = 0
        L11:
            int r5 = r12.length()
            if (r4 >= r5) goto Le5
            char r5 = r12.charAt(r4)
            r6 = 38
            if (r5 == r6) goto Lb1
            r6 = 60
            if (r5 == r6) goto L29
            r0.append(r5)
            int r4 = r4 + 1
            goto L11
        L29:
            int r5 = r4 + 1
            int r6 = r12.length()
            if (r5 < r6) goto L32
            goto L6f
        L32:
            char r6 = r12.charAt(r5)
            r7 = 47
            r8 = 1
            if (r6 != r7) goto L3d
            r6 = 1
            goto L3e
        L3d:
            r6 = 0
        L3e:
            int r5 = findEndOfTag(r12, r5)
            int r9 = r5 + (-2)
            char r10 = r12.charAt(r9)
            if (r10 != r7) goto L4c
            r7 = 1
            goto L4d
        L4c:
            r7 = 0
        L4d:
            if (r6 == 0) goto L50
            r8 = 2
        L50:
            int r4 = r4 + r8
            if (r7 == 0) goto L54
            goto L56
        L54:
            int r9 = r5 + (-1)
        L56:
            java.lang.String r4 = r12.substring(r4, r9)
            java.lang.String r8 = r4.trim()
            boolean r8 = r8.isEmpty()
            if (r8 == 0) goto L65
            goto L6f
        L65:
            java.lang.String r8 = getTagName(r4)
            boolean r9 = isSupportedTag(r8)
            if (r9 != 0) goto L71
        L6f:
            r4 = r5
            goto L11
        L71:
            if (r6 == 0) goto La3
        L73:
            boolean r4 = r1.isEmpty()
            if (r4 == 0) goto L7a
            goto L6f
        L7a:
            java.lang.Object r4 = r1.pop()
            com.google.android.exoplayer2.text.webvtt.WebvttCueParser$StartTag r4 = (com.google.android.exoplayer2.text.webvtt.WebvttCueParser.StartTag) r4
            applySpansForTag(r11, r4, r2, r0, r13)
            boolean r6 = r1.isEmpty()
            if (r6 != 0) goto L97
            com.google.android.exoplayer2.text.webvtt.WebvttCueParser$Element r6 = new com.google.android.exoplayer2.text.webvtt.WebvttCueParser$Element
            int r7 = r0.length()
            r9 = 0
            r6.<init>(r4, r7, r9)
            r2.add(r6)
            goto L9a
        L97:
            r2.clear()
        L9a:
            java.lang.String r4 = r4.name
            boolean r4 = r4.equals(r8)
            if (r4 == 0) goto L73
            goto L6f
        La3:
            if (r7 != 0) goto L6f
            int r6 = r0.length()
            com.google.android.exoplayer2.text.webvtt.WebvttCueParser$StartTag r4 = com.google.android.exoplayer2.text.webvtt.WebvttCueParser.StartTag.buildStartTag(r4, r6)
            r1.push(r4)
            goto L6f
        Lb1:
            r6 = 59
            int r4 = r4 + 1
            int r6 = r12.indexOf(r6, r4)
            r7 = 32
            int r7 = r12.indexOf(r7, r4)
            r8 = -1
            if (r6 != r8) goto Lc4
            r6 = r7
            goto Lcb
        Lc4:
            if (r7 != r8) goto Lc7
            goto Lcb
        Lc7:
            int r6 = java.lang.Math.min(r6, r7)
        Lcb:
            if (r6 == r8) goto Le0
            java.lang.String r4 = r12.substring(r4, r6)
            applyEntity(r4, r0)
            if (r6 != r7) goto Ldb
            java.lang.String r4 = " "
            r0.append(r4)
        Ldb:
            int r6 = r6 + 1
            r4 = r6
            goto L11
        Le0:
            r0.append(r5)
            goto L11
        Le5:
            boolean r12 = r1.isEmpty()
            if (r12 != 0) goto Lf5
            java.lang.Object r12 = r1.pop()
            com.google.android.exoplayer2.text.webvtt.WebvttCueParser$StartTag r12 = (com.google.android.exoplayer2.text.webvtt.WebvttCueParser.StartTag) r12
            applySpansForTag(r11, r12, r2, r0, r13)
            goto Le5
        Lf5:
            com.google.android.exoplayer2.text.webvtt.WebvttCueParser$StartTag r12 = com.google.android.exoplayer2.text.webvtt.WebvttCueParser.StartTag.buildWholeCueVirtualTag()
            java.util.List r1 = java.util.Collections.emptyList()
            applySpansForTag(r11, r12, r1, r0, r13)
            android.text.SpannedString r11 = android.text.SpannedString.valueOf(r0)
            return r11
    }

    private static int parseLineAnchor(java.lang.String r5) {
            java.util.Objects.requireNonNull(r5)
            r5.hashCode()
            r0 = 2
            r1 = 1
            r2 = 0
            r3 = -1
            int r4 = r5.hashCode()
            switch(r4) {
                case -1364013995: goto L34;
                case -1074341483: goto L29;
                case 100571: goto L1e;
                case 109757538: goto L12;
                default: goto L11;
            }
        L11:
            goto L3e
        L12:
            java.lang.String r4 = "start"
            boolean r4 = r5.equals(r4)
            if (r4 != 0) goto L1c
            goto L3e
        L1c:
            r3 = 3
            goto L3e
        L1e:
            java.lang.String r4 = "end"
            boolean r4 = r5.equals(r4)
            if (r4 != 0) goto L27
            goto L3e
        L27:
            r3 = 2
            goto L3e
        L29:
            java.lang.String r4 = "middle"
            boolean r4 = r5.equals(r4)
            if (r4 != 0) goto L32
            goto L3e
        L32:
            r3 = 1
            goto L3e
        L34:
            java.lang.String r4 = "center"
            boolean r4 = r5.equals(r4)
            if (r4 != 0) goto L3d
            goto L3e
        L3d:
            r3 = 0
        L3e:
            switch(r3) {
                case 0: goto L4d;
                case 1: goto L4d;
                case 2: goto L4c;
                case 3: goto L4b;
                default: goto L41;
            }
        L41:
            java.lang.String r0 = "Invalid anchor value: "
            java.lang.String r1 = "WebvttCueParser"
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m27m(r0, r5, r1)
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            return r5
        L4b:
            return r2
        L4c:
            return r0
        L4d:
            return r1
    }

    private static void parseLineAttribute(java.lang.String r3, com.google.android.exoplayer2.text.webvtt.WebvttCueParser.WebvttCueInfoBuilder r4) {
            r0 = 44
            int r0 = r3.indexOf(r0)
            r1 = 0
            r2 = -1
            if (r0 == r2) goto L1a
            int r2 = r0 + 1
            java.lang.String r2 = r3.substring(r2)
            int r2 = parseLineAnchor(r2)
            r4.lineAnchor = r2
            java.lang.String r3 = r3.substring(r1, r0)
        L1a:
            java.lang.String r0 = "%"
            boolean r0 = r3.endsWith(r0)
            if (r0 == 0) goto L2b
            float r3 = com.google.android.exoplayer2.text.webvtt.WebvttParserUtil.parsePercentage(r3)
            r4.line = r3
            r4.lineType = r1
            goto L35
        L2b:
            int r3 = java.lang.Integer.parseInt(r3)
            float r3 = (float) r3
            r4.line = r3
            r3 = 1
            r4.lineType = r3
        L35:
            return
    }

    private static int parsePositionAnchor(java.lang.String r5) {
            java.util.Objects.requireNonNull(r5)
            r5.hashCode()
            r0 = 2
            r1 = 1
            r2 = 0
            r3 = -1
            int r4 = r5.hashCode()
            switch(r4) {
                case -1842484672: goto L4a;
                case -1364013995: goto L3f;
                case -1276788989: goto L34;
                case -1074341483: goto L29;
                case 100571: goto L1e;
                case 109757538: goto L12;
                default: goto L11;
            }
        L11:
            goto L54
        L12:
            java.lang.String r4 = "start"
            boolean r4 = r5.equals(r4)
            if (r4 != 0) goto L1c
            goto L54
        L1c:
            r3 = 5
            goto L54
        L1e:
            java.lang.String r4 = "end"
            boolean r4 = r5.equals(r4)
            if (r4 != 0) goto L27
            goto L54
        L27:
            r3 = 4
            goto L54
        L29:
            java.lang.String r4 = "middle"
            boolean r4 = r5.equals(r4)
            if (r4 != 0) goto L32
            goto L54
        L32:
            r3 = 3
            goto L54
        L34:
            java.lang.String r4 = "line-right"
            boolean r4 = r5.equals(r4)
            if (r4 != 0) goto L3d
            goto L54
        L3d:
            r3 = 2
            goto L54
        L3f:
            java.lang.String r4 = "center"
            boolean r4 = r5.equals(r4)
            if (r4 != 0) goto L48
            goto L54
        L48:
            r3 = 1
            goto L54
        L4a:
            java.lang.String r4 = "line-left"
            boolean r4 = r5.equals(r4)
            if (r4 != 0) goto L53
            goto L54
        L53:
            r3 = 0
        L54:
            switch(r3) {
                case 0: goto L63;
                case 1: goto L62;
                case 2: goto L61;
                case 3: goto L62;
                case 4: goto L61;
                case 5: goto L63;
                default: goto L57;
            }
        L57:
            java.lang.String r0 = "Invalid anchor value: "
            java.lang.String r1 = "WebvttCueParser"
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m27m(r0, r5, r1)
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            return r5
        L61:
            return r0
        L62:
            return r1
        L63:
            return r2
    }

    private static void parsePositionAttribute(java.lang.String r2, com.google.android.exoplayer2.text.webvtt.WebvttCueParser.WebvttCueInfoBuilder r3) {
            r0 = 44
            int r0 = r2.indexOf(r0)
            r1 = -1
            if (r0 == r1) goto L1a
            int r1 = r0 + 1
            java.lang.String r1 = r2.substring(r1)
            int r1 = parsePositionAnchor(r1)
            r3.positionAnchor = r1
            r1 = 0
            java.lang.String r2 = r2.substring(r1, r0)
        L1a:
            float r2 = com.google.android.exoplayer2.text.webvtt.WebvttParserUtil.parsePercentage(r2)
            r3.position = r2
            return
    }

    private static int parseTextAlignment(java.lang.String r7) {
            java.util.Objects.requireNonNull(r7)
            r7.hashCode()
            r0 = 5
            r1 = 4
            r2 = 3
            r3 = 1
            r4 = 2
            r5 = -1
            int r6 = r7.hashCode()
            switch(r6) {
                case -1364013995: goto L4d;
                case -1074341483: goto L42;
                case 100571: goto L37;
                case 3317767: goto L2c;
                case 108511772: goto L20;
                case 109757538: goto L14;
                default: goto L13;
            }
        L13:
            goto L57
        L14:
            java.lang.String r6 = "start"
            boolean r6 = r7.equals(r6)
            if (r6 != 0) goto L1e
            goto L57
        L1e:
            r5 = 5
            goto L57
        L20:
            java.lang.String r6 = "right"
            boolean r6 = r7.equals(r6)
            if (r6 != 0) goto L2a
            goto L57
        L2a:
            r5 = 4
            goto L57
        L2c:
            java.lang.String r6 = "left"
            boolean r6 = r7.equals(r6)
            if (r6 != 0) goto L35
            goto L57
        L35:
            r5 = 3
            goto L57
        L37:
            java.lang.String r6 = "end"
            boolean r6 = r7.equals(r6)
            if (r6 != 0) goto L40
            goto L57
        L40:
            r5 = 2
            goto L57
        L42:
            java.lang.String r6 = "middle"
            boolean r6 = r7.equals(r6)
            if (r6 != 0) goto L4b
            goto L57
        L4b:
            r5 = 1
            goto L57
        L4d:
            java.lang.String r6 = "center"
            boolean r6 = r7.equals(r6)
            if (r6 != 0) goto L56
            goto L57
        L56:
            r5 = 0
        L57:
            switch(r5) {
                case 0: goto L66;
                case 1: goto L66;
                case 2: goto L65;
                case 3: goto L64;
                case 4: goto L63;
                case 5: goto L62;
                default: goto L5a;
            }
        L5a:
            java.lang.String r0 = "Invalid alignment value: "
            java.lang.String r1 = "WebvttCueParser"
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m27m(r0, r7, r1)
            return r4
        L62:
            return r3
        L63:
            return r0
        L64:
            return r1
        L65:
            return r2
        L66:
            return r4
    }

    private static int parseVerticalAttribute(java.lang.String r2) {
            java.util.Objects.requireNonNull(r2)
            java.lang.String r0 = "lr"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L20
            java.lang.String r0 = "rl"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L1e
            java.lang.String r0 = "Invalid 'vertical' value: "
            java.lang.String r1 = "WebvttCueParser"
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m27m(r0, r2, r1)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            return r2
        L1e:
            r2 = 1
            return r2
        L20:
            r2 = 2
            return r2
    }
}
