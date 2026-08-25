package com.google.android.exoplayer2.text.ttml;

/* JADX INFO: loaded from: classes2.dex */
public final class TtmlDecoder extends com.google.android.exoplayer2.text.SimpleSubtitleDecoder {
    private static final java.lang.String ATTR_BEGIN = "begin";
    private static final java.lang.String ATTR_DURATION = "dur";
    private static final java.lang.String ATTR_END = "end";
    private static final java.lang.String ATTR_IMAGE = "backgroundImage";
    private static final java.lang.String ATTR_REGION = "region";
    private static final java.lang.String ATTR_STYLE = "style";
    private static final java.util.regex.Pattern CELL_RESOLUTION = null;
    private static final java.util.regex.Pattern CLOCK_TIME = null;
    private static final com.google.android.exoplayer2.text.ttml.TtmlDecoder.CellResolution DEFAULT_CELL_RESOLUTION = null;
    private static final com.google.android.exoplayer2.text.ttml.TtmlDecoder.FrameAndTickRate DEFAULT_FRAME_AND_TICK_RATE = null;
    private static final int DEFAULT_FRAME_RATE = 30;
    private static final java.util.regex.Pattern FONT_SIZE = null;
    private static final java.util.regex.Pattern OFFSET_TIME = null;
    public static final java.util.regex.Pattern PERCENTAGE_COORDINATES = null;
    private static final java.util.regex.Pattern PIXEL_COORDINATES = null;
    public static final java.util.regex.Pattern SIGNED_PERCENTAGE = null;
    private static final java.lang.String TAG = "TtmlDecoder";
    private static final java.lang.String TTP = "http://www.w3.org/ns/ttml#parameter";
    private final org.xmlpull.v1.XmlPullParserFactory xmlParserFactory;

    /* JADX INFO: loaded from: classes.dex */
    public static final class CellResolution {
        public final int rows;

        public CellResolution(int r1) {
                r0 = this;
                r0.<init>()
                r0.rows = r1
                return
        }
    }

    public static final class FrameAndTickRate {
        public final float effectiveFrameRate;
        public final int subFrameRate;
        public final int tickRate;

        public FrameAndTickRate(float r1, int r2, int r3) {
                r0 = this;
                r0.<init>()
                r0.effectiveFrameRate = r1
                r0.subFrameRate = r2
                r0.tickRate = r3
                return
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static final class TtsExtent {
        public final int height;
        public final int width;

        public TtsExtent(int r1, int r2) {
                r0 = this;
                r0.<init>()
                r0.width = r1
                r0.height = r2
                return
        }
    }

    static {
            java.lang.String r0 = "^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.google.android.exoplayer2.text.ttml.TtmlDecoder.CLOCK_TIME = r0
            java.lang.String r0 = "^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.google.android.exoplayer2.text.ttml.TtmlDecoder.OFFSET_TIME = r0
            java.lang.String r0 = "^(([0-9]*.)?[0-9]+)(px|em|%)$"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.google.android.exoplayer2.text.ttml.TtmlDecoder.FONT_SIZE = r0
            java.lang.String r0 = "^([-+]?\\d+\\.?\\d*?)%$"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.google.android.exoplayer2.text.ttml.TtmlDecoder.SIGNED_PERCENTAGE = r0
            java.lang.String r0 = "^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.google.android.exoplayer2.text.ttml.TtmlDecoder.PERCENTAGE_COORDINATES = r0
            java.lang.String r0 = "^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.google.android.exoplayer2.text.ttml.TtmlDecoder.PIXEL_COORDINATES = r0
            java.lang.String r0 = "^(\\d+) (\\d+)$"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.google.android.exoplayer2.text.ttml.TtmlDecoder.CELL_RESOLUTION = r0
            com.google.android.exoplayer2.text.ttml.TtmlDecoder$FrameAndTickRate r0 = new com.google.android.exoplayer2.text.ttml.TtmlDecoder$FrameAndTickRate
            r1 = 1106247680(0x41f00000, float:30.0)
            r2 = 1
            r0.<init>(r1, r2, r2)
            com.google.android.exoplayer2.text.ttml.TtmlDecoder.DEFAULT_FRAME_AND_TICK_RATE = r0
            com.google.android.exoplayer2.text.ttml.TtmlDecoder$CellResolution r0 = new com.google.android.exoplayer2.text.ttml.TtmlDecoder$CellResolution
            r1 = 15
            r0.<init>(r1)
            com.google.android.exoplayer2.text.ttml.TtmlDecoder.DEFAULT_CELL_RESOLUTION = r0
            return
    }

    public TtmlDecoder() {
            r3 = this;
            java.lang.String r0 = "TtmlDecoder"
            r3.<init>(r0)
            org.xmlpull.v1.XmlPullParserFactory r0 = org.xmlpull.v1.XmlPullParserFactory.newInstance()     // Catch: org.xmlpull.v1.XmlPullParserException -> L10
            r3.xmlParserFactory = r0     // Catch: org.xmlpull.v1.XmlPullParserException -> L10
            r1 = 1
            r0.setNamespaceAware(r1)     // Catch: org.xmlpull.v1.XmlPullParserException -> L10
            return
        L10:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Couldn't create XmlPullParserFactory instance"
            r1.<init>(r2, r0)
            throw r1
    }

    private static com.google.android.exoplayer2.text.ttml.TtmlStyle createIfNull(@androidx.annotation.Nullable com.google.android.exoplayer2.text.ttml.TtmlStyle r0) {
            if (r0 != 0) goto L7
            com.google.android.exoplayer2.text.ttml.TtmlStyle r0 = new com.google.android.exoplayer2.text.ttml.TtmlStyle
            r0.<init>()
        L7:
            return r0
    }

    private static boolean isSupportedTag(java.lang.String r1) {
            java.lang.String r0 = "tt"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L80
            java.lang.String r0 = "head"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L80
            java.lang.String r0 = "body"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L80
            java.lang.String r0 = "div"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L80
            java.lang.String r0 = "p"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L80
            java.lang.String r0 = "span"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L80
            java.lang.String r0 = "br"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L80
            java.lang.String r0 = "style"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L80
            java.lang.String r0 = "styling"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L80
            java.lang.String r0 = "layout"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L80
            java.lang.String r0 = "region"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L80
            java.lang.String r0 = "metadata"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L80
            java.lang.String r0 = "image"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L80
            java.lang.String r0 = "data"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L80
            java.lang.String r0 = "information"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L7e
            goto L80
        L7e:
            r1 = 0
            goto L81
        L80:
            r1 = 1
        L81:
            return r1
    }

    @androidx.annotation.Nullable
    private static android.text.Layout.Alignment parseAlignment(java.lang.String r2) {
            java.lang.String r2 = com.google.common.base.Ascii.toLowerCase(r2)
            java.util.Objects.requireNonNull(r2)
            int r0 = r2.hashCode()
            r1 = -1
            switch(r0) {
                case -1364013995: goto L3e;
                case 100571: goto L33;
                case 3317767: goto L28;
                case 108511772: goto L1c;
                case 109757538: goto L10;
                default: goto Lf;
            }
        Lf:
            goto L48
        L10:
            java.lang.String r0 = "start"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L1a
            goto L48
        L1a:
            r1 = 4
            goto L48
        L1c:
            java.lang.String r0 = "right"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L26
            goto L48
        L26:
            r1 = 3
            goto L48
        L28:
            java.lang.String r0 = "left"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L31
            goto L48
        L31:
            r1 = 2
            goto L48
        L33:
            java.lang.String r0 = "end"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L3c
            goto L48
        L3c:
            r1 = 1
            goto L48
        L3e:
            java.lang.String r0 = "center"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L47
            goto L48
        L47:
            r1 = 0
        L48:
            switch(r1) {
                case 0: goto L53;
                case 1: goto L50;
                case 2: goto L4d;
                case 3: goto L50;
                case 4: goto L4d;
                default: goto L4b;
            }
        L4b:
            r2 = 0
            return r2
        L4d:
            android.text.Layout$Alignment r2 = android.text.Layout.Alignment.ALIGN_NORMAL
            return r2
        L50:
            android.text.Layout$Alignment r2 = android.text.Layout.Alignment.ALIGN_OPPOSITE
            return r2
        L53:
            android.text.Layout$Alignment r2 = android.text.Layout.Alignment.ALIGN_CENTER
            return r2
    }

    private static com.google.android.exoplayer2.text.ttml.TtmlDecoder.CellResolution parseCellResolution(org.xmlpull.v1.XmlPullParser r7, com.google.android.exoplayer2.text.ttml.TtmlDecoder.CellResolution r8) throws com.google.android.exoplayer2.text.SubtitleDecoderException {
            java.lang.String r0 = "http://www.w3.org/ns/ttml#parameter"
            java.lang.String r1 = "cellResolution"
            java.lang.String r7 = r7.getAttributeValue(r0, r1)
            if (r7 != 0) goto Lb
            return r8
        Lb:
            java.util.regex.Pattern r0 = com.google.android.exoplayer2.text.ttml.TtmlDecoder.CELL_RESOLUTION
            java.util.regex.Matcher r0 = r0.matcher(r7)
            boolean r1 = r0.matches()
            java.lang.String r2 = "Ignoring malformed cell resolution: "
            java.lang.String r3 = "TtmlDecoder"
            if (r1 != 0) goto L1f
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m27m(r2, r7, r3)
            return r8
        L1f:
            r1 = 1
            java.lang.String r1 = r0.group(r1)     // Catch: java.lang.NumberFormatException -> L66
            java.lang.Object r1 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r1)     // Catch: java.lang.NumberFormatException -> L66
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.NumberFormatException -> L66
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.NumberFormatException -> L66
            r4 = 2
            java.lang.String r0 = r0.group(r4)     // Catch: java.lang.NumberFormatException -> L66
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)     // Catch: java.lang.NumberFormatException -> L66
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.NumberFormatException -> L66
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> L66
            if (r1 == 0) goto L47
            if (r0 == 0) goto L47
            com.google.android.exoplayer2.text.ttml.TtmlDecoder$CellResolution r1 = new com.google.android.exoplayer2.text.ttml.TtmlDecoder$CellResolution     // Catch: java.lang.NumberFormatException -> L66
            r1.<init>(r0)     // Catch: java.lang.NumberFormatException -> L66
            return r1
        L47:
            com.google.android.exoplayer2.text.SubtitleDecoderException r4 = new com.google.android.exoplayer2.text.SubtitleDecoderException     // Catch: java.lang.NumberFormatException -> L66
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.NumberFormatException -> L66
            r5.<init>()     // Catch: java.lang.NumberFormatException -> L66
            java.lang.String r6 = "Invalid cell resolution "
            r5.append(r6)     // Catch: java.lang.NumberFormatException -> L66
            r5.append(r1)     // Catch: java.lang.NumberFormatException -> L66
            java.lang.String r1 = " "
            r5.append(r1)     // Catch: java.lang.NumberFormatException -> L66
            r5.append(r0)     // Catch: java.lang.NumberFormatException -> L66
            java.lang.String r0 = r5.toString()     // Catch: java.lang.NumberFormatException -> L66
            r4.<init>(r0)     // Catch: java.lang.NumberFormatException -> L66
            throw r4     // Catch: java.lang.NumberFormatException -> L66
        L66:
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m27m(r2, r7, r3)
            return r8
    }

    private static void parseFontSize(java.lang.String r7, com.google.android.exoplayer2.text.ttml.TtmlStyle r8) throws com.google.android.exoplayer2.text.SubtitleDecoderException {
            java.lang.String r0 = "\\s+"
            java.lang.String[] r0 = com.google.android.exoplayer2.util.Util.split(r7, r0)
            int r1 = r0.length
            r2 = 2
            r3 = 1
            if (r1 != r3) goto L12
            java.util.regex.Pattern r0 = com.google.android.exoplayer2.text.ttml.TtmlDecoder.FONT_SIZE
            java.util.regex.Matcher r0 = r0.matcher(r7)
            goto L24
        L12:
            int r1 = r0.length
            if (r1 != r2) goto L9f
            java.util.regex.Pattern r1 = com.google.android.exoplayer2.text.ttml.TtmlDecoder.FONT_SIZE
            r0 = r0[r3]
            java.util.regex.Matcher r0 = r1.matcher(r0)
            java.lang.String r1 = "TtmlDecoder"
            java.lang.String r4 = "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first."
            com.google.android.exoplayer2.util.Log.w(r1, r4)
        L24:
            boolean r1 = r0.matches()
            java.lang.String r4 = "'."
            if (r1 == 0) goto L93
            r7 = 3
            java.lang.String r1 = r0.group(r7)
            java.lang.Object r1 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r1)
            java.lang.String r1 = (java.lang.String) r1
            java.util.Objects.requireNonNull(r1)
            r1.hashCode()
            r5 = -1
            int r6 = r1.hashCode()
            switch(r6) {
                case 37: goto L5d;
                case 3240: goto L52;
                case 3592: goto L46;
                default: goto L45;
            }
        L45:
            goto L67
        L46:
            java.lang.String r6 = "px"
            boolean r6 = r1.equals(r6)
            if (r6 != 0) goto L50
            goto L67
        L50:
            r5 = 2
            goto L67
        L52:
            java.lang.String r6 = "em"
            boolean r6 = r1.equals(r6)
            if (r6 != 0) goto L5b
            goto L67
        L5b:
            r5 = 1
            goto L67
        L5d:
            java.lang.String r6 = "%"
            boolean r6 = r1.equals(r6)
            if (r6 != 0) goto L66
            goto L67
        L66:
            r5 = 0
        L67:
            switch(r5) {
                case 0: goto L7e;
                case 1: goto L7a;
                case 2: goto L76;
                default: goto L6a;
            }
        L6a:
            com.google.android.exoplayer2.text.SubtitleDecoderException r7 = new com.google.android.exoplayer2.text.SubtitleDecoderException
            java.lang.String r8 = "Invalid unit for fontSize: '"
            java.lang.String r8 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r8, r1, r4)
            r7.<init>(r8)
            throw r7
        L76:
            r8.setFontSizeUnit(r3)
            goto L81
        L7a:
            r8.setFontSizeUnit(r2)
            goto L81
        L7e:
            r8.setFontSizeUnit(r7)
        L81:
            java.lang.String r7 = r0.group(r3)
            java.lang.Object r7 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r7)
            java.lang.String r7 = (java.lang.String) r7
            float r7 = java.lang.Float.parseFloat(r7)
            r8.setFontSize(r7)
            return
        L93:
            com.google.android.exoplayer2.text.SubtitleDecoderException r8 = new com.google.android.exoplayer2.text.SubtitleDecoderException
            java.lang.String r0 = "Invalid expression for fontSize: '"
            java.lang.String r7 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r7, r4)
            r8.<init>(r7)
            throw r8
        L9f:
            com.google.android.exoplayer2.text.SubtitleDecoderException r7 = new com.google.android.exoplayer2.text.SubtitleDecoderException
            java.lang.String r8 = "Invalid number of entries for fontSize: "
            java.lang.StringBuilder r8 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r8)
            int r0 = r0.length
            java.lang.String r1 = "."
            java.lang.String r8 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r8, r0, r1)
            r7.<init>(r8)
            throw r7
    }

    private static com.google.android.exoplayer2.text.ttml.TtmlDecoder.FrameAndTickRate parseFrameAndTickRates(org.xmlpull.v1.XmlPullParser r6) throws com.google.android.exoplayer2.text.SubtitleDecoderException {
            java.lang.String r0 = "http://www.w3.org/ns/ttml#parameter"
            java.lang.String r1 = "frameRate"
            java.lang.String r1 = r6.getAttributeValue(r0, r1)
            if (r1 == 0) goto Lf
            int r1 = java.lang.Integer.parseInt(r1)
            goto L11
        Lf:
            r1 = 30
        L11:
            r2 = 1065353216(0x3f800000, float:1.0)
            java.lang.String r3 = "frameRateMultiplier"
            java.lang.String r3 = r6.getAttributeValue(r0, r3)
            if (r3 == 0) goto L40
            java.lang.String r2 = " "
            java.lang.String[] r2 = com.google.android.exoplayer2.util.Util.split(r3, r2)
            int r3 = r2.length
            r4 = 2
            if (r3 != r4) goto L38
            r3 = 0
            r3 = r2[r3]
            int r3 = java.lang.Integer.parseInt(r3)
            float r3 = (float) r3
            r4 = 1
            r2 = r2[r4]
            int r2 = java.lang.Integer.parseInt(r2)
            float r2 = (float) r2
            float r2 = r3 / r2
            goto L40
        L38:
            com.google.android.exoplayer2.text.SubtitleDecoderException r6 = new com.google.android.exoplayer2.text.SubtitleDecoderException
            java.lang.String r0 = "frameRateMultiplier doesn't have 2 parts"
            r6.<init>(r0)
            throw r6
        L40:
            com.google.android.exoplayer2.text.ttml.TtmlDecoder$FrameAndTickRate r3 = com.google.android.exoplayer2.text.ttml.TtmlDecoder.DEFAULT_FRAME_AND_TICK_RATE
            int r4 = r3.subFrameRate
            java.lang.String r5 = "subFrameRate"
            java.lang.String r5 = r6.getAttributeValue(r0, r5)
            if (r5 == 0) goto L51
            int r4 = java.lang.Integer.parseInt(r5)
        L51:
            int r3 = r3.tickRate
            java.lang.String r5 = "tickRate"
            java.lang.String r6 = r6.getAttributeValue(r0, r5)
            if (r6 == 0) goto L60
            int r3 = java.lang.Integer.parseInt(r6)
        L60:
            com.google.android.exoplayer2.text.ttml.TtmlDecoder$FrameAndTickRate r6 = new com.google.android.exoplayer2.text.ttml.TtmlDecoder$FrameAndTickRate
            float r0 = (float) r1
            float r0 = r0 * r2
            r6.<init>(r0, r4, r3)
            return r6
    }

    private static java.util.Map<java.lang.String, com.google.android.exoplayer2.text.ttml.TtmlStyle> parseHeader(org.xmlpull.v1.XmlPullParser r5, java.util.Map<java.lang.String, com.google.android.exoplayer2.text.ttml.TtmlStyle> r6, com.google.android.exoplayer2.text.ttml.TtmlDecoder.CellResolution r7, @androidx.annotation.Nullable com.google.android.exoplayer2.text.ttml.TtmlDecoder.TtsExtent r8, java.util.Map<java.lang.String, com.google.android.exoplayer2.text.ttml.TtmlRegion> r9, java.util.Map<java.lang.String, java.lang.String> r10) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
        L0:
            r5.next()
            java.lang.String r0 = "style"
            boolean r1 = com.google.android.exoplayer2.util.XmlPullParserUtil.isStartTag(r5, r0)
            if (r1 == 0) goto L3b
            java.lang.String r0 = com.google.android.exoplayer2.util.XmlPullParserUtil.getAttributeValue(r5, r0)
            com.google.android.exoplayer2.text.ttml.TtmlStyle r1 = new com.google.android.exoplayer2.text.ttml.TtmlStyle
            r1.<init>()
            com.google.android.exoplayer2.text.ttml.TtmlStyle r1 = parseStyleAttributes(r5, r1)
            if (r0 == 0) goto L31
            java.lang.String[] r0 = parseStyleIds(r0)
            int r2 = r0.length
            r3 = 0
        L21:
            if (r3 >= r2) goto L31
            r4 = r0[r3]
            java.lang.Object r4 = r6.get(r4)
            com.google.android.exoplayer2.text.ttml.TtmlStyle r4 = (com.google.android.exoplayer2.text.ttml.TtmlStyle) r4
            r1.chain(r4)
            int r3 = r3 + 1
            goto L21
        L31:
            java.lang.String r0 = r1.getId()
            if (r0 == 0) goto L5b
            r6.put(r0, r1)
            goto L5b
        L3b:
            java.lang.String r0 = "region"
            boolean r0 = com.google.android.exoplayer2.util.XmlPullParserUtil.isStartTag(r5, r0)
            if (r0 == 0) goto L50
            com.google.android.exoplayer2.text.ttml.TtmlRegion r0 = parseRegionAttributes(r5, r7, r8)
            if (r0 == 0) goto L5b
            java.lang.String r1 = r0.id
            r9.put(r1, r0)
            goto L5b
        L50:
            java.lang.String r0 = "metadata"
            boolean r0 = com.google.android.exoplayer2.util.XmlPullParserUtil.isStartTag(r5, r0)
            if (r0 == 0) goto L5b
            parseMetadata(r5, r10)
        L5b:
            java.lang.String r0 = "head"
            boolean r0 = com.google.android.exoplayer2.util.XmlPullParserUtil.isEndTag(r5, r0)
            if (r0 == 0) goto L0
            return r6
    }

    private static void parseMetadata(org.xmlpull.v1.XmlPullParser r2, java.util.Map<java.lang.String, java.lang.String> r3) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
        L0:
            r2.next()
            java.lang.String r0 = "image"
            boolean r0 = com.google.android.exoplayer2.util.XmlPullParserUtil.isStartTag(r2, r0)
            if (r0 == 0) goto L1a
            java.lang.String r0 = "id"
            java.lang.String r0 = com.google.android.exoplayer2.util.XmlPullParserUtil.getAttributeValue(r2, r0)
            if (r0 == 0) goto L1a
            java.lang.String r1 = r2.nextText()
            r3.put(r0, r1)
        L1a:
            java.lang.String r0 = "metadata"
            boolean r0 = com.google.android.exoplayer2.util.XmlPullParserUtil.isEndTag(r2, r0)
            if (r0 == 0) goto L0
            return
    }

    private static com.google.android.exoplayer2.text.ttml.TtmlNode parseNode(org.xmlpull.v1.XmlPullParser r19, @androidx.annotation.Nullable com.google.android.exoplayer2.text.ttml.TtmlNode r20, java.util.Map<java.lang.String, com.google.android.exoplayer2.text.ttml.TtmlRegion> r21, com.google.android.exoplayer2.text.ttml.TtmlDecoder.FrameAndTickRate r22) throws com.google.android.exoplayer2.text.SubtitleDecoderException {
            r0 = r19
            r9 = r20
            r1 = r22
            int r2 = r19.getAttributeCount()
            r3 = 0
            com.google.android.exoplayer2.text.ttml.TtmlStyle r5 = parseStyleAttributes(r0, r3)
            java.lang.String r8 = ""
            r11 = r3
            r10 = r8
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r14 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r16 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r8 = r11
            r3 = 0
        L24:
            if (r3 >= r2) goto Lb6
            java.lang.String r4 = r0.getAttributeName(r3)
            java.lang.String r6 = r0.getAttributeValue(r3)
            java.util.Objects.requireNonNull(r4)
            int r18 = r4.hashCode()
            switch(r18) {
                case -934795532: goto L72;
                case 99841: goto L67;
                case 100571: goto L5c;
                case 93616297: goto L51;
                case 109780401: goto L45;
                case 1292595405: goto L3a;
                default: goto L38;
            }
        L38:
            r7 = -1
            goto L7d
        L3a:
            java.lang.String r7 = "backgroundImage"
            boolean r4 = r4.equals(r7)
            if (r4 != 0) goto L43
            goto L38
        L43:
            r7 = 5
            goto L7d
        L45:
            java.lang.String r7 = "style"
            boolean r4 = r4.equals(r7)
            if (r4 != 0) goto L4f
            goto L38
        L4f:
            r7 = 4
            goto L7d
        L51:
            java.lang.String r7 = "begin"
            boolean r4 = r4.equals(r7)
            if (r4 != 0) goto L5a
            goto L38
        L5a:
            r7 = 3
            goto L7d
        L5c:
            java.lang.String r7 = "end"
            boolean r4 = r4.equals(r7)
            if (r4 != 0) goto L65
            goto L38
        L65:
            r7 = 2
            goto L7d
        L67:
            java.lang.String r7 = "dur"
            boolean r4 = r4.equals(r7)
            if (r4 != 0) goto L70
            goto L38
        L70:
            r7 = 1
            goto L7d
        L72:
            java.lang.String r7 = "region"
            boolean r4 = r4.equals(r7)
            if (r4 != 0) goto L7c
            goto L38
        L7c:
            r7 = 0
        L7d:
            switch(r7) {
                case 0: goto La9;
                case 1: goto La4;
                case 2: goto L9f;
                case 3: goto L98;
                case 4: goto L8f;
                case 5: goto L81;
                default: goto L80;
            }
        L80:
            goto L9c
        L81:
            java.lang.String r4 = "#"
            boolean r4 = r6.startsWith(r4)
            if (r4 == 0) goto L9c
            r4 = 1
            java.lang.String r11 = r6.substring(r4)
            goto L9c
        L8f:
            java.lang.String[] r4 = parseStyleIds(r6)
            int r6 = r4.length
            if (r6 <= 0) goto L9c
            r8 = r4
            goto L9c
        L98:
            long r12 = parseTimeExpression(r6, r1)
        L9c:
            r4 = r21
            goto Lb2
        L9f:
            long r14 = parseTimeExpression(r6, r1)
            goto L9c
        La4:
            long r16 = parseTimeExpression(r6, r1)
            goto L9c
        La9:
            r4 = r21
            boolean r7 = r4.containsKey(r6)
            if (r7 == 0) goto Lb2
            r10 = r6
        Lb2:
            int r3 = r3 + 1
            goto L24
        Lb6:
            if (r9 == 0) goto Lce
            long r1 = r9.startTimeUs
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 == 0) goto Ld3
            int r6 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r6 == 0) goto Lc8
            long r12 = r12 + r1
        Lc8:
            int r6 = (r14 > r3 ? 1 : (r14 == r3 ? 0 : -1))
            if (r6 == 0) goto Ld3
            long r14 = r14 + r1
            goto Ld3
        Lce:
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        Ld3:
            r1 = r12
            int r6 = (r14 > r3 ? 1 : (r14 == r3 ? 0 : -1))
            if (r6 != 0) goto Leb
            int r6 = (r16 > r3 ? 1 : (r16 == r3 ? 0 : -1))
            if (r6 == 0) goto Le1
            long r16 = r1 + r16
            r3 = r16
            goto Lec
        Le1:
            if (r9 == 0) goto Leb
            long r6 = r9.endTimeUs
            int r12 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r12 == 0) goto Leb
            r3 = r6
            goto Lec
        Leb:
            r3 = r14
        Lec:
            java.lang.String r0 = r19.getName()
            r6 = r8
            r7 = r10
            r8 = r11
            r9 = r20
            com.google.android.exoplayer2.text.ttml.TtmlNode r0 = com.google.android.exoplayer2.text.ttml.TtmlNode.buildNode(r0, r1, r3, r5, r6, r7, r8, r9)
            return r0
    }

    @androidx.annotation.Nullable
    private static com.google.android.exoplayer2.text.ttml.TtmlRegion parseRegionAttributes(org.xmlpull.v1.XmlPullParser r17, com.google.android.exoplayer2.text.ttml.TtmlDecoder.CellResolution r18, @androidx.annotation.Nullable com.google.android.exoplayer2.text.ttml.TtmlDecoder.TtsExtent r19) {
            r0 = r17
            r1 = r19
            java.lang.String r2 = "id"
            java.lang.String r4 = com.google.android.exoplayer2.util.XmlPullParserUtil.getAttributeValue(r0, r2)
            r2 = 0
            if (r4 != 0) goto Le
            return r2
        Le:
            java.lang.String r3 = "origin"
            java.lang.String r3 = com.google.android.exoplayer2.util.XmlPullParserUtil.getAttributeValue(r0, r3)
            java.lang.String r5 = "TtmlDecoder"
            if (r3 == 0) goto L1a5
            java.util.regex.Pattern r6 = com.google.android.exoplayer2.text.ttml.TtmlDecoder.PERCENTAGE_COORDINATES
            java.util.regex.Matcher r7 = r6.matcher(r3)
            java.util.regex.Pattern r8 = com.google.android.exoplayer2.text.ttml.TtmlDecoder.PIXEL_COORDINATES
            java.util.regex.Matcher r9 = r8.matcher(r3)
            boolean r10 = r7.matches()
            java.lang.String r11 = "Ignoring region with malformed origin: "
            java.lang.String r12 = "Ignoring region with missing tts:extent: "
            r13 = 1120403456(0x42c80000, float:100.0)
            r14 = 2
            r15 = 1
            if (r10 == 0) goto L5a
            java.lang.String r9 = r7.group(r15)     // Catch: java.lang.NumberFormatException -> L56
            java.lang.Object r9 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r9)     // Catch: java.lang.NumberFormatException -> L56
            java.lang.String r9 = (java.lang.String) r9     // Catch: java.lang.NumberFormatException -> L56
            float r9 = java.lang.Float.parseFloat(r9)     // Catch: java.lang.NumberFormatException -> L56
            float r9 = r9 / r13
            java.lang.String r7 = r7.group(r14)     // Catch: java.lang.NumberFormatException -> L56
            java.lang.Object r7 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r7)     // Catch: java.lang.NumberFormatException -> L56
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.NumberFormatException -> L56
            float r7 = java.lang.Float.parseFloat(r7)     // Catch: java.lang.NumberFormatException -> L56
            float r7 = r7 / r13
            r16 = r9
            r9 = r7
            r7 = r16
            goto L8c
        L56:
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m27m(r11, r3, r5)
            return r2
        L5a:
            boolean r7 = r9.matches()
            if (r7 == 0) goto L19f
            if (r1 != 0) goto L66
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m27m(r12, r3, r5)
            return r2
        L66:
            java.lang.String r7 = r9.group(r15)     // Catch: java.lang.NumberFormatException -> L19b
            java.lang.Object r7 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r7)     // Catch: java.lang.NumberFormatException -> L19b
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.NumberFormatException -> L19b
            int r7 = java.lang.Integer.parseInt(r7)     // Catch: java.lang.NumberFormatException -> L19b
            java.lang.String r9 = r9.group(r14)     // Catch: java.lang.NumberFormatException -> L19b
            java.lang.Object r9 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r9)     // Catch: java.lang.NumberFormatException -> L19b
            java.lang.String r9 = (java.lang.String) r9     // Catch: java.lang.NumberFormatException -> L19b
            int r9 = java.lang.Integer.parseInt(r9)     // Catch: java.lang.NumberFormatException -> L19b
            float r7 = (float) r7     // Catch: java.lang.NumberFormatException -> L19b
            int r10 = r1.width     // Catch: java.lang.NumberFormatException -> L19b
            float r10 = (float) r10     // Catch: java.lang.NumberFormatException -> L19b
            float r7 = r7 / r10
            float r9 = (float) r9     // Catch: java.lang.NumberFormatException -> L19b
            int r10 = r1.height     // Catch: java.lang.NumberFormatException -> L19b
            float r10 = (float) r10
            float r9 = r9 / r10
        L8c:
            java.lang.String r10 = "extent"
            java.lang.String r10 = com.google.android.exoplayer2.util.XmlPullParserUtil.getAttributeValue(r0, r10)
            if (r10 == 0) goto L195
            java.util.regex.Matcher r6 = r6.matcher(r10)
            java.util.regex.Matcher r8 = r8.matcher(r10)
            boolean r10 = r6.matches()
            java.lang.String r11 = "Ignoring region with malformed extent: "
            if (r10 == 0) goto Lc8
            java.lang.String r1 = r6.group(r15)     // Catch: java.lang.NumberFormatException -> Lc4
            java.lang.Object r1 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r1)     // Catch: java.lang.NumberFormatException -> Lc4
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.NumberFormatException -> Lc4
            float r1 = java.lang.Float.parseFloat(r1)     // Catch: java.lang.NumberFormatException -> Lc4
            float r1 = r1 / r13
            java.lang.String r6 = r6.group(r14)     // Catch: java.lang.NumberFormatException -> Lc4
            java.lang.Object r6 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r6)     // Catch: java.lang.NumberFormatException -> Lc4
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.NumberFormatException -> Lc4
            float r2 = java.lang.Float.parseFloat(r6)     // Catch: java.lang.NumberFormatException -> Lc4
            float r2 = r2 / r13
            r10 = r2
            goto Lfc
        Lc4:
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m27m(r11, r3, r5)
            return r2
        Lc8:
            boolean r6 = r8.matches()
            if (r6 == 0) goto L18f
            if (r1 != 0) goto Ld4
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m27m(r12, r3, r5)
            return r2
        Ld4:
            java.lang.String r6 = r8.group(r15)     // Catch: java.lang.NumberFormatException -> L18b
            java.lang.Object r6 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r6)     // Catch: java.lang.NumberFormatException -> L18b
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.NumberFormatException -> L18b
            int r6 = java.lang.Integer.parseInt(r6)     // Catch: java.lang.NumberFormatException -> L18b
            java.lang.String r8 = r8.group(r14)     // Catch: java.lang.NumberFormatException -> L18b
            java.lang.Object r8 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r8)     // Catch: java.lang.NumberFormatException -> L18b
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.NumberFormatException -> L18b
            int r8 = java.lang.Integer.parseInt(r8)     // Catch: java.lang.NumberFormatException -> L18b
            float r6 = (float) r6     // Catch: java.lang.NumberFormatException -> L18b
            int r10 = r1.width     // Catch: java.lang.NumberFormatException -> L18b
            float r10 = (float) r10     // Catch: java.lang.NumberFormatException -> L18b
            float r6 = r6 / r10
            float r8 = (float) r8     // Catch: java.lang.NumberFormatException -> L18b
            int r1 = r1.height     // Catch: java.lang.NumberFormatException -> L18b
            float r1 = (float) r1
            float r8 = r8 / r1
            r1 = r6
            r10 = r8
        Lfc:
            java.lang.String r2 = "displayAlign"
            java.lang.String r2 = com.google.android.exoplayer2.util.XmlPullParserUtil.getAttributeValue(r0, r2)
            r3 = 0
            if (r2 == 0) goto L12b
            java.lang.String r2 = com.google.common.base.Ascii.toLowerCase(r2)
            java.util.Objects.requireNonNull(r2)
            java.lang.String r5 = "center"
            boolean r5 = r2.equals(r5)
            if (r5 != 0) goto L122
            java.lang.String r5 = "after"
            boolean r2 = r2.equals(r5)
            if (r2 != 0) goto L11d
            goto L12b
        L11d:
            float r9 = r9 + r10
            r2 = 2
            r6 = r9
            r8 = 2
            goto L12e
        L122:
            r2 = 1073741824(0x40000000, float:2.0)
            float r2 = r10 / r2
            float r2 = r2 + r9
            r5 = 1
            r6 = r2
            r8 = 1
            goto L12e
        L12b:
            r2 = 0
            r6 = r9
            r8 = 0
        L12e:
            r2 = 1065353216(0x3f800000, float:1.0)
            r5 = r18
            int r5 = r5.rows
            float r5 = (float) r5
            float r12 = r2 / r5
            java.lang.String r2 = "writingMode"
            java.lang.String r0 = com.google.android.exoplayer2.util.XmlPullParserUtil.getAttributeValue(r0, r2)
            if (r0 == 0) goto L17b
            java.lang.String r0 = com.google.common.base.Ascii.toLowerCase(r0)
            java.util.Objects.requireNonNull(r0)
            int r2 = r0.hashCode()
            switch(r2) {
                case 3694: goto L167;
                case 3553396: goto L15b;
                case 3553576: goto L14f;
                default: goto L14e;
            }
        L14e:
            goto L170
        L14f:
            java.lang.String r2 = "tbrl"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L159
            goto L170
        L159:
            r3 = 2
            goto L171
        L15b:
            java.lang.String r2 = "tblr"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L165
            goto L170
        L165:
            r3 = 1
            goto L171
        L167:
            java.lang.String r2 = "tb"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L171
        L170:
            r3 = -1
        L171:
            switch(r3) {
                case 0: goto L178;
                case 1: goto L178;
                case 2: goto L175;
                default: goto L174;
            }
        L174:
            goto L17b
        L175:
            r0 = 1
            r13 = 1
            goto L17f
        L178:
            r0 = 2
            r13 = 2
            goto L17f
        L17b:
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r13 = -2147483648(0xffffffff80000000, float:-0.0)
        L17f:
            com.google.android.exoplayer2.text.ttml.TtmlRegion r0 = new com.google.android.exoplayer2.text.ttml.TtmlRegion
            r2 = 0
            r11 = 1
            r3 = r0
            r5 = r7
            r7 = r2
            r9 = r1
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r0
        L18b:
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m27m(r11, r3, r5)
            return r2
        L18f:
            java.lang.String r0 = "Ignoring region with unsupported extent: "
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m27m(r0, r3, r5)
            return r2
        L195:
            java.lang.String r0 = "Ignoring region without an extent"
            com.google.android.exoplayer2.util.Log.w(r5, r0)
            return r2
        L19b:
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m27m(r11, r3, r5)
            return r2
        L19f:
            java.lang.String r0 = "Ignoring region with unsupported origin: "
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m27m(r0, r3, r5)
            return r2
        L1a5:
            java.lang.String r0 = "Ignoring region without an origin"
            com.google.android.exoplayer2.util.Log.w(r5, r0)
            return r2
    }

    private static float parseShear(java.lang.String r5) {
            java.util.regex.Pattern r0 = com.google.android.exoplayer2.text.ttml.TtmlDecoder.SIGNED_PERCENTAGE
            java.util.regex.Matcher r0 = r0.matcher(r5)
            boolean r1 = r0.matches()
            r2 = 2139095039(0x7f7fffff, float:3.4028235E38)
            java.lang.String r3 = "TtmlDecoder"
            if (r1 != 0) goto L17
            java.lang.String r0 = "Invalid value for shear: "
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m27m(r0, r5, r3)
            return r2
        L17:
            r1 = 1
            java.lang.String r0 = r0.group(r1)     // Catch: java.lang.NumberFormatException -> L33
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)     // Catch: java.lang.NumberFormatException -> L33
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.NumberFormatException -> L33
            float r0 = java.lang.Float.parseFloat(r0)     // Catch: java.lang.NumberFormatException -> L33
            r1 = -1027080192(0xffffffffc2c80000, float:-100.0)
            float r0 = java.lang.Math.max(r1, r0)     // Catch: java.lang.NumberFormatException -> L33
            r1 = 1120403456(0x42c80000, float:100.0)
            float r5 = java.lang.Math.min(r1, r0)     // Catch: java.lang.NumberFormatException -> L33
            return r5
        L33:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = "Failed to parse shear: "
            r1.append(r4)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            com.google.android.exoplayer2.util.Log.w(r3, r5, r0)
            return r2
    }

    private static com.google.android.exoplayer2.text.ttml.TtmlStyle parseStyleAttributes(org.xmlpull.v1.XmlPullParser r11, com.google.android.exoplayer2.text.ttml.TtmlStyle r12) {
            int r0 = r11.getAttributeCount()
            r1 = 0
            r2 = 0
        L6:
            if (r2 >= r0) goto L2db
            java.lang.String r3 = r11.getAttributeValue(r2)
            java.lang.String r4 = r11.getAttributeName(r2)
            java.util.Objects.requireNonNull(r4)
            int r5 = r4.hashCode()
            r6 = 5
            r7 = 4
            r8 = 3
            r9 = 2
            r10 = 1
            switch(r5) {
                case -1550943582: goto Ld7;
                case -1224696685: goto Lcc;
                case -1065511464: goto Lc0;
                case -879295043: goto Lb4;
                case -734428249: goto La9;
                case 3355: goto L9e;
                case 3511770: goto L92;
                case 94842723: goto L87;
                case 109403361: goto L78;
                case 110138194: goto L69;
                case 365601008: goto L5b;
                case 921125321: goto L4c;
                case 1115953443: goto L3d;
                case 1287124693: goto L2f;
                case 1754920356: goto L21;
                default: goto L1f;
            }
        L1f:
            goto Le2
        L21:
            java.lang.String r5 = "multiRowAlign"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L2b
            goto Le2
        L2b:
            r4 = 14
            goto Le3
        L2f:
            java.lang.String r5 = "backgroundColor"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L39
            goto Le2
        L39:
            r4 = 13
            goto Le3
        L3d:
            java.lang.String r5 = "rubyPosition"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L48
            goto Le2
        L48:
            r4 = 12
            goto Le3
        L4c:
            java.lang.String r5 = "textEmphasis"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L57
            goto Le2
        L57:
            r4 = 11
            goto Le3
        L5b:
            java.lang.String r5 = "fontSize"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L65
            goto Le2
        L65:
            r4 = 10
            goto Le3
        L69:
            java.lang.String r5 = "textCombine"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L74
            goto Le2
        L74:
            r4 = 9
            goto Le3
        L78:
            java.lang.String r5 = "shear"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L83
            goto Le2
        L83:
            r4 = 8
            goto Le3
        L87:
            java.lang.String r5 = "color"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L90
            goto Le2
        L90:
            r4 = 7
            goto Le3
        L92:
            java.lang.String r5 = "ruby"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L9c
            goto Le2
        L9c:
            r4 = 6
            goto Le3
        L9e:
            java.lang.String r5 = "id"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto La7
            goto Le2
        La7:
            r4 = 5
            goto Le3
        La9:
            java.lang.String r5 = "fontWeight"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto Lb2
            goto Le2
        Lb2:
            r4 = 4
            goto Le3
        Lb4:
            java.lang.String r5 = "textDecoration"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto Lbe
            goto Le2
        Lbe:
            r4 = 3
            goto Le3
        Lc0:
            java.lang.String r5 = "textAlign"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto Lca
            goto Le2
        Lca:
            r4 = 2
            goto Le3
        Lcc:
            java.lang.String r5 = "fontFamily"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto Ld5
            goto Le2
        Ld5:
            r4 = 1
            goto Le3
        Ld7:
            java.lang.String r5 = "fontStyle"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto Le0
            goto Le2
        Le0:
            r4 = 0
            goto Le3
        Le2:
            r4 = -1
        Le3:
            java.lang.String r5 = "TtmlDecoder"
            switch(r4) {
                case 0: goto L2c9;
                case 1: goto L2c0;
                case 2: goto L2b3;
                case 3: goto L24c;
                case 4: goto L23c;
                case 5: goto L225;
                case 6: goto L1a6;
                case 7: goto L192;
                case 8: goto L184;
                case 9: goto L157;
                case 10: goto L147;
                case 11: goto L139;
                case 12: goto L10c;
                case 13: goto Lf8;
                case 14: goto Lea;
                default: goto Le8;
            }
        Le8:
            goto L2d7
        Lea:
            com.google.android.exoplayer2.text.ttml.TtmlStyle r12 = createIfNull(r12)
            android.text.Layout$Alignment r3 = parseAlignment(r3)
            com.google.android.exoplayer2.text.ttml.TtmlStyle r12 = r12.setMultiRowAlign(r3)
            goto L2d7
        Lf8:
            com.google.android.exoplayer2.text.ttml.TtmlStyle r12 = createIfNull(r12)
            int r4 = com.google.android.exoplayer2.util.ColorParser.parseTtmlColor(r3)     // Catch: java.lang.IllegalArgumentException -> L105
            r12.setBackgroundColor(r4)     // Catch: java.lang.IllegalArgumentException -> L105
            goto L2d7
        L105:
            java.lang.String r4 = "Failed parsing background value: "
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m27m(r4, r3, r5)
            goto L2d7
        L10c:
            java.lang.String r3 = com.google.common.base.Ascii.toLowerCase(r3)
            java.util.Objects.requireNonNull(r3)
            java.lang.String r4 = "before"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L12f
            java.lang.String r4 = "after"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L125
            goto L2d7
        L125:
            com.google.android.exoplayer2.text.ttml.TtmlStyle r12 = createIfNull(r12)
            com.google.android.exoplayer2.text.ttml.TtmlStyle r12 = r12.setRubyPosition(r9)
            goto L2d7
        L12f:
            com.google.android.exoplayer2.text.ttml.TtmlStyle r12 = createIfNull(r12)
            com.google.android.exoplayer2.text.ttml.TtmlStyle r12 = r12.setRubyPosition(r10)
            goto L2d7
        L139:
            com.google.android.exoplayer2.text.ttml.TtmlStyle r12 = createIfNull(r12)
            com.google.android.exoplayer2.text.ttml.TextEmphasis r3 = com.google.android.exoplayer2.text.ttml.TextEmphasis.parse(r3)
            com.google.android.exoplayer2.text.ttml.TtmlStyle r12 = r12.setTextEmphasis(r3)
            goto L2d7
        L147:
            com.google.android.exoplayer2.text.ttml.TtmlStyle r12 = createIfNull(r12)     // Catch: com.google.android.exoplayer2.text.SubtitleDecoderException -> L150
            parseFontSize(r3, r12)     // Catch: com.google.android.exoplayer2.text.SubtitleDecoderException -> L150
            goto L2d7
        L150:
            java.lang.String r4 = "Failed parsing fontSize value: "
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m27m(r4, r3, r5)
            goto L2d7
        L157:
            java.lang.String r3 = com.google.common.base.Ascii.toLowerCase(r3)
            java.util.Objects.requireNonNull(r3)
            java.lang.String r4 = "all"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L17a
            java.lang.String r4 = "none"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L170
            goto L2d7
        L170:
            com.google.android.exoplayer2.text.ttml.TtmlStyle r12 = createIfNull(r12)
            com.google.android.exoplayer2.text.ttml.TtmlStyle r12 = r12.setTextCombine(r1)
            goto L2d7
        L17a:
            com.google.android.exoplayer2.text.ttml.TtmlStyle r12 = createIfNull(r12)
            com.google.android.exoplayer2.text.ttml.TtmlStyle r12 = r12.setTextCombine(r10)
            goto L2d7
        L184:
            com.google.android.exoplayer2.text.ttml.TtmlStyle r12 = createIfNull(r12)
            float r3 = parseShear(r3)
            com.google.android.exoplayer2.text.ttml.TtmlStyle r12 = r12.setShearPercentage(r3)
            goto L2d7
        L192:
            com.google.android.exoplayer2.text.ttml.TtmlStyle r12 = createIfNull(r12)
            int r4 = com.google.android.exoplayer2.util.ColorParser.parseTtmlColor(r3)     // Catch: java.lang.IllegalArgumentException -> L19f
            r12.setFontColor(r4)     // Catch: java.lang.IllegalArgumentException -> L19f
            goto L2d7
        L19f:
            java.lang.String r4 = "Failed parsing color value: "
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m27m(r4, r3, r5)
            goto L2d7
        L1a6:
            java.lang.String r3 = com.google.common.base.Ascii.toLowerCase(r3)
            java.util.Objects.requireNonNull(r3)
            int r4 = r3.hashCode()
            switch(r4) {
                case -618561360: goto L1ec;
                case -410956671: goto L1e1;
                case -250518009: goto L1d6;
                case -136074796: goto L1ca;
                case 3016401: goto L1bf;
                case 3556653: goto L1b5;
                default: goto L1b4;
            }
        L1b4:
            goto L1f7
        L1b5:
            java.lang.String r4 = "text"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L1f8
            goto L1f7
        L1bf:
            java.lang.String r4 = "base"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L1c8
            goto L1f7
        L1c8:
            r6 = 4
            goto L1f8
        L1ca:
            java.lang.String r4 = "textContainer"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L1d4
            goto L1f7
        L1d4:
            r6 = 3
            goto L1f8
        L1d6:
            java.lang.String r4 = "delimiter"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L1df
            goto L1f7
        L1df:
            r6 = 2
            goto L1f8
        L1e1:
            java.lang.String r4 = "container"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L1ea
            goto L1f7
        L1ea:
            r6 = 1
            goto L1f8
        L1ec:
            java.lang.String r4 = "baseContainer"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L1f5
            goto L1f7
        L1f5:
            r6 = 0
            goto L1f8
        L1f7:
            r6 = -1
        L1f8:
            switch(r6) {
                case 0: goto L21b;
                case 1: goto L211;
                case 2: goto L207;
                case 3: goto L1fd;
                case 4: goto L21b;
                case 5: goto L1fd;
                default: goto L1fb;
            }
        L1fb:
            goto L2d7
        L1fd:
            com.google.android.exoplayer2.text.ttml.TtmlStyle r12 = createIfNull(r12)
            com.google.android.exoplayer2.text.ttml.TtmlStyle r12 = r12.setRubyType(r8)
            goto L2d7
        L207:
            com.google.android.exoplayer2.text.ttml.TtmlStyle r12 = createIfNull(r12)
            com.google.android.exoplayer2.text.ttml.TtmlStyle r12 = r12.setRubyType(r7)
            goto L2d7
        L211:
            com.google.android.exoplayer2.text.ttml.TtmlStyle r12 = createIfNull(r12)
            com.google.android.exoplayer2.text.ttml.TtmlStyle r12 = r12.setRubyType(r10)
            goto L2d7
        L21b:
            com.google.android.exoplayer2.text.ttml.TtmlStyle r12 = createIfNull(r12)
            com.google.android.exoplayer2.text.ttml.TtmlStyle r12 = r12.setRubyType(r9)
            goto L2d7
        L225:
            java.lang.String r4 = r11.getName()
            java.lang.String r5 = "style"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L2d7
            com.google.android.exoplayer2.text.ttml.TtmlStyle r12 = createIfNull(r12)
            com.google.android.exoplayer2.text.ttml.TtmlStyle r12 = r12.setId(r3)
            goto L2d7
        L23c:
            com.google.android.exoplayer2.text.ttml.TtmlStyle r12 = createIfNull(r12)
            java.lang.String r4 = "bold"
            boolean r3 = r4.equalsIgnoreCase(r3)
            com.google.android.exoplayer2.text.ttml.TtmlStyle r12 = r12.setBold(r3)
            goto L2d7
        L24c:
            java.lang.String r3 = com.google.common.base.Ascii.toLowerCase(r3)
            java.util.Objects.requireNonNull(r3)
            r3.hashCode()
            r4 = -1
            int r5 = r3.hashCode()
            switch(r5) {
                case -1461280213: goto L281;
                case -1026963764: goto L275;
                case 913457136: goto L26a;
                case 1679736913: goto L25f;
                default: goto L25e;
            }
        L25e:
            goto L28b
        L25f:
            java.lang.String r5 = "linethrough"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L268
            goto L28b
        L268:
            r4 = 3
            goto L28b
        L26a:
            java.lang.String r5 = "nolinethrough"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L273
            goto L28b
        L273:
            r4 = 2
            goto L28b
        L275:
            java.lang.String r5 = "underline"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L27f
            goto L28b
        L27f:
            r4 = 1
            goto L28b
        L281:
            java.lang.String r5 = "nounderline"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L28a
            goto L28b
        L28a:
            r4 = 0
        L28b:
            switch(r4) {
                case 0: goto L2aa;
                case 1: goto L2a1;
                case 2: goto L298;
                case 3: goto L28f;
                default: goto L28e;
            }
        L28e:
            goto L2d7
        L28f:
            com.google.android.exoplayer2.text.ttml.TtmlStyle r12 = createIfNull(r12)
            com.google.android.exoplayer2.text.ttml.TtmlStyle r12 = r12.setLinethrough(r10)
            goto L2d7
        L298:
            com.google.android.exoplayer2.text.ttml.TtmlStyle r12 = createIfNull(r12)
            com.google.android.exoplayer2.text.ttml.TtmlStyle r12 = r12.setLinethrough(r1)
            goto L2d7
        L2a1:
            com.google.android.exoplayer2.text.ttml.TtmlStyle r12 = createIfNull(r12)
            com.google.android.exoplayer2.text.ttml.TtmlStyle r12 = r12.setUnderline(r10)
            goto L2d7
        L2aa:
            com.google.android.exoplayer2.text.ttml.TtmlStyle r12 = createIfNull(r12)
            com.google.android.exoplayer2.text.ttml.TtmlStyle r12 = r12.setUnderline(r1)
            goto L2d7
        L2b3:
            com.google.android.exoplayer2.text.ttml.TtmlStyle r12 = createIfNull(r12)
            android.text.Layout$Alignment r3 = parseAlignment(r3)
            com.google.android.exoplayer2.text.ttml.TtmlStyle r12 = r12.setTextAlign(r3)
            goto L2d7
        L2c0:
            com.google.android.exoplayer2.text.ttml.TtmlStyle r12 = createIfNull(r12)
            com.google.android.exoplayer2.text.ttml.TtmlStyle r12 = r12.setFontFamily(r3)
            goto L2d7
        L2c9:
            com.google.android.exoplayer2.text.ttml.TtmlStyle r12 = createIfNull(r12)
            java.lang.String r4 = "italic"
            boolean r3 = r4.equalsIgnoreCase(r3)
            com.google.android.exoplayer2.text.ttml.TtmlStyle r12 = r12.setItalic(r3)
        L2d7:
            int r2 = r2 + 1
            goto L6
        L2db:
            return r12
    }

    private static java.lang.String[] parseStyleIds(java.lang.String r1) {
            java.lang.String r1 = r1.trim()
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto Le
            r1 = 0
            java.lang.String[] r1 = new java.lang.String[r1]
            goto L14
        Le:
            java.lang.String r0 = "\\s+"
            java.lang.String[] r1 = com.google.android.exoplayer2.util.Util.split(r1, r0)
        L14:
            return r1
    }

    private static long parseTimeExpression(java.lang.String r13, com.google.android.exoplayer2.text.ttml.TtmlDecoder.FrameAndTickRate r14) throws com.google.android.exoplayer2.text.SubtitleDecoderException {
            java.util.regex.Pattern r0 = com.google.android.exoplayer2.text.ttml.TtmlDecoder.CLOCK_TIME
            java.util.regex.Matcher r0 = r0.matcher(r13)
            boolean r1 = r0.matches()
            r2 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            if (r1 == 0) goto L88
            java.lang.String r13 = r0.group(r7)
            java.lang.Object r13 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r13)
            java.lang.String r13 = (java.lang.String) r13
            long r7 = java.lang.Long.parseLong(r13)
            r9 = 3600(0xe10, double:1.7786E-320)
            long r7 = r7 * r9
            double r7 = (double) r7
            java.lang.String r13 = r0.group(r6)
            java.lang.Object r13 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r13)
            java.lang.String r13 = (java.lang.String) r13
            long r9 = java.lang.Long.parseLong(r13)
            r11 = 60
            long r9 = r9 * r11
            double r9 = (double) r9
            double r7 = r7 + r9
            java.lang.String r13 = r0.group(r5)
            java.lang.Object r13 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r13)
            java.lang.String r13 = (java.lang.String) r13
            long r5 = java.lang.Long.parseLong(r13)
            double r5 = (double) r5
            double r7 = r7 + r5
            java.lang.String r13 = r0.group(r4)
            r4 = 0
            if (r13 == 0) goto L59
            double r9 = java.lang.Double.parseDouble(r13)
            goto L5a
        L59:
            r9 = r4
        L5a:
            double r7 = r7 + r9
            r13 = 5
            java.lang.String r13 = r0.group(r13)
            if (r13 == 0) goto L6c
            long r9 = java.lang.Long.parseLong(r13)
            float r13 = (float) r9
            float r1 = r14.effectiveFrameRate
            float r13 = r13 / r1
            double r9 = (double) r13
            goto L6d
        L6c:
            r9 = r4
        L6d:
            double r7 = r7 + r9
            r13 = 6
            java.lang.String r13 = r0.group(r13)
            if (r13 == 0) goto L83
            long r0 = java.lang.Long.parseLong(r13)
            double r0 = (double) r0
            int r13 = r14.subFrameRate
            double r4 = (double) r13
            double r0 = r0 / r4
            float r13 = r14.effectiveFrameRate
            double r13 = (double) r13
            double r4 = r0 / r13
        L83:
            double r7 = r7 + r4
        L84:
            double r7 = r7 * r2
            long r13 = (long) r7
            return r13
        L88:
            java.util.regex.Pattern r0 = com.google.android.exoplayer2.text.ttml.TtmlDecoder.OFFSET_TIME
            java.util.regex.Matcher r0 = r0.matcher(r13)
            boolean r1 = r0.matches()
            if (r1 == 0) goto L10e
            java.lang.String r13 = r0.group(r7)
            java.lang.Object r13 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r13)
            java.lang.String r13 = (java.lang.String) r13
            double r7 = java.lang.Double.parseDouble(r13)
            java.lang.String r13 = r0.group(r6)
            java.lang.Object r13 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r13)
            java.lang.String r13 = (java.lang.String) r13
            java.util.Objects.requireNonNull(r13)
            int r0 = r13.hashCode()
            switch(r0) {
                case 102: goto Le2;
                case 104: goto Ld7;
                case 109: goto Lcc;
                case 116: goto Lc0;
                case 3494: goto Lb7;
                default: goto Lb6;
            }
        Lb6:
            goto Led
        Lb7:
            java.lang.String r0 = "ms"
            boolean r13 = r13.equals(r0)
            if (r13 != 0) goto Lee
            goto Led
        Lc0:
            java.lang.String r0 = "t"
            boolean r13 = r13.equals(r0)
            if (r13 != 0) goto Lca
            goto Led
        Lca:
            r4 = 3
            goto Lee
        Lcc:
            java.lang.String r0 = "m"
            boolean r13 = r13.equals(r0)
            if (r13 != 0) goto Ld5
            goto Led
        Ld5:
            r4 = 2
            goto Lee
        Ld7:
            java.lang.String r0 = "h"
            boolean r13 = r13.equals(r0)
            if (r13 != 0) goto Le0
            goto Led
        Le0:
            r4 = 1
            goto Lee
        Le2:
            java.lang.String r0 = "f"
            boolean r13 = r13.equals(r0)
            if (r13 != 0) goto Leb
            goto Led
        Leb:
            r4 = 0
            goto Lee
        Led:
            r4 = -1
        Lee:
            switch(r4) {
                case 0: goto L108;
                case 1: goto Lff;
                case 2: goto Lfc;
                case 3: goto Lf8;
                case 4: goto Lf2;
                default: goto Lf1;
            }
        Lf1:
            goto L84
        Lf2:
            r13 = 4652007308841189376(0x408f400000000000, double:1000.0)
            goto L10b
        Lf8:
            int r13 = r14.tickRate
            double r13 = (double) r13
            goto L10b
        Lfc:
            r13 = 4633641066610819072(0x404e000000000000, double:60.0)
            goto L104
        Lff:
            r13 = 4660134898793709568(0x40ac200000000000, double:3600.0)
        L104:
            double r7 = r7 * r13
            goto L84
        L108:
            float r13 = r14.effectiveFrameRate
            double r13 = (double) r13
        L10b:
            double r7 = r7 / r13
            goto L84
        L10e:
            com.google.android.exoplayer2.text.SubtitleDecoderException r14 = new com.google.android.exoplayer2.text.SubtitleDecoderException
            java.lang.String r0 = "Malformed time expression: "
            java.lang.String r13 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r13)
            r14.<init>(r13)
            throw r14
    }

    @androidx.annotation.Nullable
    private static com.google.android.exoplayer2.text.ttml.TtmlDecoder.TtsExtent parseTtsExtent(org.xmlpull.v1.XmlPullParser r5) {
            java.lang.String r0 = "extent"
            java.lang.String r5 = com.google.android.exoplayer2.util.XmlPullParserUtil.getAttributeValue(r5, r0)
            r0 = 0
            if (r5 != 0) goto La
            return r0
        La:
            java.util.regex.Pattern r1 = com.google.android.exoplayer2.text.ttml.TtmlDecoder.PIXEL_COORDINATES
            java.util.regex.Matcher r1 = r1.matcher(r5)
            boolean r2 = r1.matches()
            java.lang.String r3 = "TtmlDecoder"
            if (r2 != 0) goto L1e
            java.lang.String r1 = "Ignoring non-pixel tts extent: "
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m27m(r1, r5, r3)
            return r0
        L1e:
            r2 = 1
            java.lang.String r2 = r1.group(r2)     // Catch: java.lang.NumberFormatException -> L42
            java.lang.Object r2 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r2)     // Catch: java.lang.NumberFormatException -> L42
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.NumberFormatException -> L42
            int r2 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.NumberFormatException -> L42
            r4 = 2
            java.lang.String r1 = r1.group(r4)     // Catch: java.lang.NumberFormatException -> L42
            java.lang.Object r1 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r1)     // Catch: java.lang.NumberFormatException -> L42
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.NumberFormatException -> L42
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.NumberFormatException -> L42
            com.google.android.exoplayer2.text.ttml.TtmlDecoder$TtsExtent r4 = new com.google.android.exoplayer2.text.ttml.TtmlDecoder$TtsExtent     // Catch: java.lang.NumberFormatException -> L42
            r4.<init>(r2, r1)     // Catch: java.lang.NumberFormatException -> L42
            return r4
        L42:
            java.lang.String r1 = "Ignoring malformed tts extent: "
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m27m(r1, r5, r3)
            return r0
    }

    @Override // com.google.android.exoplayer2.text.SimpleSubtitleDecoder
    public final com.google.android.exoplayer2.text.Subtitle decode(byte[] r19, int r20, boolean r21) throws com.google.android.exoplayer2.text.SubtitleDecoderException {
            r18 = this;
            java.lang.String r0 = ""
            r1 = r18
            org.xmlpull.v1.XmlPullParserFactory r2 = r1.xmlParserFactory     // Catch: java.io.IOException -> L116 org.xmlpull.v1.XmlPullParserException -> L11f
            org.xmlpull.v1.XmlPullParser r2 = r2.newPullParser()     // Catch: java.io.IOException -> L116 org.xmlpull.v1.XmlPullParserException -> L11f
            java.util.HashMap r9 = new java.util.HashMap     // Catch: java.io.IOException -> L116 org.xmlpull.v1.XmlPullParserException -> L11f
            r9.<init>()     // Catch: java.io.IOException -> L116 org.xmlpull.v1.XmlPullParserException -> L11f
            java.util.HashMap r10 = new java.util.HashMap     // Catch: java.io.IOException -> L116 org.xmlpull.v1.XmlPullParserException -> L11f
            r10.<init>()     // Catch: java.io.IOException -> L116 org.xmlpull.v1.XmlPullParserException -> L11f
            java.util.HashMap r11 = new java.util.HashMap     // Catch: java.io.IOException -> L116 org.xmlpull.v1.XmlPullParserException -> L11f
            r11.<init>()     // Catch: java.io.IOException -> L116 org.xmlpull.v1.XmlPullParserException -> L11f
            com.google.android.exoplayer2.text.ttml.TtmlRegion r3 = new com.google.android.exoplayer2.text.ttml.TtmlRegion     // Catch: java.io.IOException -> L116 org.xmlpull.v1.XmlPullParserException -> L11f
            r3.<init>(r0)     // Catch: java.io.IOException -> L116 org.xmlpull.v1.XmlPullParserException -> L11f
            r10.put(r0, r3)     // Catch: java.io.IOException -> L116 org.xmlpull.v1.XmlPullParserException -> L11f
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream     // Catch: java.io.IOException -> L116 org.xmlpull.v1.XmlPullParserException -> L11f
            r3 = 0
            r4 = r19
            r5 = r20
            r0.<init>(r4, r3, r5)     // Catch: java.io.IOException -> L116 org.xmlpull.v1.XmlPullParserException -> L11f
            r4 = 0
            r2.setInput(r0, r4)     // Catch: java.io.IOException -> L116 org.xmlpull.v1.XmlPullParserException -> L11f
            java.util.ArrayDeque r12 = new java.util.ArrayDeque     // Catch: java.io.IOException -> L116 org.xmlpull.v1.XmlPullParserException -> L11f
            r12.<init>()     // Catch: java.io.IOException -> L116 org.xmlpull.v1.XmlPullParserException -> L11f
            int r0 = r2.getEventType()     // Catch: java.io.IOException -> L116 org.xmlpull.v1.XmlPullParserException -> L11f
            com.google.android.exoplayer2.text.ttml.TtmlDecoder$FrameAndTickRate r5 = com.google.android.exoplayer2.text.ttml.TtmlDecoder.DEFAULT_FRAME_AND_TICK_RATE     // Catch: java.io.IOException -> L116 org.xmlpull.v1.XmlPullParserException -> L11f
            com.google.android.exoplayer2.text.ttml.TtmlDecoder$CellResolution r6 = com.google.android.exoplayer2.text.ttml.TtmlDecoder.DEFAULT_CELL_RESOLUTION     // Catch: java.io.IOException -> L116 org.xmlpull.v1.XmlPullParserException -> L11f
            r14 = r4
            r13 = 0
        L3e:
            r3 = 1
            if (r0 == r3) goto L10b
            java.lang.Object r3 = r12.peek()     // Catch: java.io.IOException -> L116 org.xmlpull.v1.XmlPullParserException -> L11f
            com.google.android.exoplayer2.text.ttml.TtmlNode r3 = (com.google.android.exoplayer2.text.ttml.TtmlNode) r3     // Catch: java.io.IOException -> L116 org.xmlpull.v1.XmlPullParserException -> L11f
            r7 = 2
            if (r13 != 0) goto Lf8
            java.lang.String r15 = r2.getName()     // Catch: java.io.IOException -> L116 org.xmlpull.v1.XmlPullParserException -> L11f
            java.lang.String r8 = "tt"
            if (r0 != r7) goto Lc1
            boolean r0 = r8.equals(r15)     // Catch: java.io.IOException -> L116 org.xmlpull.v1.XmlPullParserException -> L11f
            if (r0 == 0) goto L67
            com.google.android.exoplayer2.text.ttml.TtmlDecoder$FrameAndTickRate r5 = parseFrameAndTickRates(r2)     // Catch: java.io.IOException -> L116 org.xmlpull.v1.XmlPullParserException -> L11f
            com.google.android.exoplayer2.text.ttml.TtmlDecoder$CellResolution r0 = com.google.android.exoplayer2.text.ttml.TtmlDecoder.DEFAULT_CELL_RESOLUTION     // Catch: java.io.IOException -> L116 org.xmlpull.v1.XmlPullParserException -> L11f
            com.google.android.exoplayer2.text.ttml.TtmlDecoder$CellResolution r6 = parseCellResolution(r2, r0)     // Catch: java.io.IOException -> L116 org.xmlpull.v1.XmlPullParserException -> L11f
            com.google.android.exoplayer2.text.ttml.TtmlDecoder$TtsExtent r4 = parseTtsExtent(r2)     // Catch: java.io.IOException -> L116 org.xmlpull.v1.XmlPullParserException -> L11f
        L67:
            r16 = r4
            r8 = r5
            r17 = r6
            boolean r0 = isSupportedTag(r15)     // Catch: java.io.IOException -> L116 org.xmlpull.v1.XmlPullParserException -> L11f
            java.lang.String r4 = "TtmlDecoder"
            if (r0 != 0) goto L90
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L116 org.xmlpull.v1.XmlPullParserException -> L11f
            r0.<init>()     // Catch: java.io.IOException -> L116 org.xmlpull.v1.XmlPullParserException -> L11f
            java.lang.String r3 = "Ignoring unsupported tag: "
            r0.append(r3)     // Catch: java.io.IOException -> L116 org.xmlpull.v1.XmlPullParserException -> L11f
            java.lang.String r3 = r2.getName()     // Catch: java.io.IOException -> L116 org.xmlpull.v1.XmlPullParserException -> L11f
            r0.append(r3)     // Catch: java.io.IOException -> L116 org.xmlpull.v1.XmlPullParserException -> L11f
            java.lang.String r0 = r0.toString()     // Catch: java.io.IOException -> L116 org.xmlpull.v1.XmlPullParserException -> L11f
            com.google.android.exoplayer2.util.Log.i(r4, r0)     // Catch: java.io.IOException -> L116 org.xmlpull.v1.XmlPullParserException -> L11f
            int r13 = r13 + 1
            r15 = r8
            goto Lbb
        L90:
            java.lang.String r0 = "head"
            boolean r0 = r0.equals(r15)     // Catch: java.io.IOException -> L116 org.xmlpull.v1.XmlPullParserException -> L11f
            if (r0 == 0) goto La5
            r3 = r2
            r4 = r9
            r5 = r17
            r6 = r16
            r7 = r10
            r15 = r8
            r8 = r11
            parseHeader(r3, r4, r5, r6, r7, r8)     // Catch: java.io.IOException -> L116 org.xmlpull.v1.XmlPullParserException -> L11f
            goto Lbb
        La5:
            r15 = r8
            com.google.android.exoplayer2.text.ttml.TtmlNode r0 = parseNode(r2, r3, r10, r15)     // Catch: com.google.android.exoplayer2.text.SubtitleDecoderException -> Lb3 java.io.IOException -> L116 org.xmlpull.v1.XmlPullParserException -> L11f
            r12.push(r0)     // Catch: com.google.android.exoplayer2.text.SubtitleDecoderException -> Lb3 java.io.IOException -> L116 org.xmlpull.v1.XmlPullParserException -> L11f
            if (r3 == 0) goto Lbb
            r3.addChild(r0)     // Catch: com.google.android.exoplayer2.text.SubtitleDecoderException -> Lb3 java.io.IOException -> L116 org.xmlpull.v1.XmlPullParserException -> L11f
            goto Lbb
        Lb3:
            r0 = move-exception
            java.lang.String r3 = "Suppressing parser error"
            com.google.android.exoplayer2.util.Log.w(r4, r3, r0)     // Catch: java.io.IOException -> L116 org.xmlpull.v1.XmlPullParserException -> L11f
            int r13 = r13 + 1
        Lbb:
            r5 = r15
            r4 = r16
            r6 = r17
            goto L102
        Lc1:
            r7 = 4
            if (r0 != r7) goto Ld6
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r3)     // Catch: java.io.IOException -> L116 org.xmlpull.v1.XmlPullParserException -> L11f
            com.google.android.exoplayer2.text.ttml.TtmlNode r0 = (com.google.android.exoplayer2.text.ttml.TtmlNode) r0     // Catch: java.io.IOException -> L116 org.xmlpull.v1.XmlPullParserException -> L11f
            java.lang.String r3 = r2.getText()     // Catch: java.io.IOException -> L116 org.xmlpull.v1.XmlPullParserException -> L11f
            com.google.android.exoplayer2.text.ttml.TtmlNode r3 = com.google.android.exoplayer2.text.ttml.TtmlNode.buildTextNode(r3)     // Catch: java.io.IOException -> L116 org.xmlpull.v1.XmlPullParserException -> L11f
            r0.addChild(r3)     // Catch: java.io.IOException -> L116 org.xmlpull.v1.XmlPullParserException -> L11f
            goto L102
        Ld6:
            r3 = 3
            if (r0 != r3) goto L102
            java.lang.String r0 = r2.getName()     // Catch: java.io.IOException -> L116 org.xmlpull.v1.XmlPullParserException -> L11f
            boolean r0 = r0.equals(r8)     // Catch: java.io.IOException -> L116 org.xmlpull.v1.XmlPullParserException -> L11f
            if (r0 == 0) goto Lf4
            com.google.android.exoplayer2.text.ttml.TtmlSubtitle r14 = new com.google.android.exoplayer2.text.ttml.TtmlSubtitle     // Catch: java.io.IOException -> L116 org.xmlpull.v1.XmlPullParserException -> L11f
            java.lang.Object r0 = r12.peek()     // Catch: java.io.IOException -> L116 org.xmlpull.v1.XmlPullParserException -> L11f
            com.google.android.exoplayer2.text.ttml.TtmlNode r0 = (com.google.android.exoplayer2.text.ttml.TtmlNode) r0     // Catch: java.io.IOException -> L116 org.xmlpull.v1.XmlPullParserException -> L11f
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)     // Catch: java.io.IOException -> L116 org.xmlpull.v1.XmlPullParserException -> L11f
            com.google.android.exoplayer2.text.ttml.TtmlNode r0 = (com.google.android.exoplayer2.text.ttml.TtmlNode) r0     // Catch: java.io.IOException -> L116 org.xmlpull.v1.XmlPullParserException -> L11f
            r14.<init>(r0, r9, r10, r11)     // Catch: java.io.IOException -> L116 org.xmlpull.v1.XmlPullParserException -> L11f
        Lf4:
            r12.pop()     // Catch: java.io.IOException -> L116 org.xmlpull.v1.XmlPullParserException -> L11f
            goto L102
        Lf8:
            if (r0 != r7) goto Lfd
            int r13 = r13 + 1
            goto L102
        Lfd:
            r3 = 3
            if (r0 != r3) goto L102
            int r13 = r13 + (-1)
        L102:
            r2.next()     // Catch: java.io.IOException -> L116 org.xmlpull.v1.XmlPullParserException -> L11f
            int r0 = r2.getEventType()     // Catch: java.io.IOException -> L116 org.xmlpull.v1.XmlPullParserException -> L11f
            goto L3e
        L10b:
            if (r14 == 0) goto L10e
            return r14
        L10e:
            com.google.android.exoplayer2.text.SubtitleDecoderException r0 = new com.google.android.exoplayer2.text.SubtitleDecoderException     // Catch: java.io.IOException -> L116 org.xmlpull.v1.XmlPullParserException -> L11f
            java.lang.String r2 = "No TTML subtitles found"
            r0.<init>(r2)     // Catch: java.io.IOException -> L116 org.xmlpull.v1.XmlPullParserException -> L11f
            throw r0     // Catch: java.io.IOException -> L116 org.xmlpull.v1.XmlPullParserException -> L11f
        L116:
            r0 = move-exception
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "Unexpected error when reading input."
            r2.<init>(r3, r0)
            throw r2
        L11f:
            r0 = move-exception
            com.google.android.exoplayer2.text.SubtitleDecoderException r2 = new com.google.android.exoplayer2.text.SubtitleDecoderException
            java.lang.String r3 = "Unable to decode source"
            r2.<init>(r3, r0)
            throw r2
    }
}
