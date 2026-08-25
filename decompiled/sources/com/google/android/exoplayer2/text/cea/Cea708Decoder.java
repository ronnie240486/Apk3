package com.google.android.exoplayer2.text.cea;

/* JADX INFO: loaded from: classes2.dex */
public final class Cea708Decoder extends com.google.android.exoplayer2.text.cea.CeaDecoder {
    private static final int CC_VALID_FLAG = 4;
    private static final int CHARACTER_BIG_CARONS = 42;
    private static final int CHARACTER_BIG_OE = 44;
    private static final int CHARACTER_BOLD_BULLET = 53;
    private static final int CHARACTER_CLOSE_DOUBLE_QUOTE = 52;
    private static final int CHARACTER_CLOSE_SINGLE_QUOTE = 50;
    private static final int CHARACTER_DIAERESIS_Y = 63;
    private static final int CHARACTER_ELLIPSIS = 37;
    private static final int CHARACTER_FIVE_EIGHTHS = 120;
    private static final int CHARACTER_HORIZONTAL_BORDER = 125;
    private static final int CHARACTER_LOWER_LEFT_BORDER = 124;
    private static final int CHARACTER_LOWER_RIGHT_BORDER = 126;
    private static final int CHARACTER_MN = 127;
    private static final int CHARACTER_NBTSP = 33;
    private static final int CHARACTER_ONE_EIGHTH = 118;
    private static final int CHARACTER_OPEN_DOUBLE_QUOTE = 51;
    private static final int CHARACTER_OPEN_SINGLE_QUOTE = 49;
    private static final int CHARACTER_SEVEN_EIGHTHS = 121;
    private static final int CHARACTER_SM = 61;
    private static final int CHARACTER_SMALL_CARONS = 58;
    private static final int CHARACTER_SMALL_OE = 60;
    private static final int CHARACTER_SOLID_BLOCK = 48;
    private static final int CHARACTER_THREE_EIGHTHS = 119;
    private static final int CHARACTER_TM = 57;
    private static final int CHARACTER_TSP = 32;
    private static final int CHARACTER_UPPER_LEFT_BORDER = 127;
    private static final int CHARACTER_UPPER_RIGHT_BORDER = 123;
    private static final int CHARACTER_VERTICAL_BORDER = 122;
    private static final int COMMAND_BS = 8;
    private static final int COMMAND_CLW = 136;
    private static final int COMMAND_CR = 13;
    private static final int COMMAND_CW0 = 128;
    private static final int COMMAND_CW1 = 129;
    private static final int COMMAND_CW2 = 130;
    private static final int COMMAND_CW3 = 131;
    private static final int COMMAND_CW4 = 132;
    private static final int COMMAND_CW5 = 133;
    private static final int COMMAND_CW6 = 134;
    private static final int COMMAND_CW7 = 135;
    private static final int COMMAND_DF0 = 152;
    private static final int COMMAND_DF1 = 153;
    private static final int COMMAND_DF2 = 154;
    private static final int COMMAND_DF3 = 155;
    private static final int COMMAND_DF4 = 156;
    private static final int COMMAND_DF5 = 157;
    private static final int COMMAND_DF6 = 158;
    private static final int COMMAND_DF7 = 159;
    private static final int COMMAND_DLC = 142;
    private static final int COMMAND_DLW = 140;
    private static final int COMMAND_DLY = 141;
    private static final int COMMAND_DSW = 137;
    private static final int COMMAND_ETX = 3;
    private static final int COMMAND_EXT1 = 16;
    private static final int COMMAND_EXT1_END = 23;
    private static final int COMMAND_EXT1_START = 17;
    private static final int COMMAND_FF = 12;
    private static final int COMMAND_HCR = 14;
    private static final int COMMAND_HDW = 138;
    private static final int COMMAND_NUL = 0;
    private static final int COMMAND_P16_END = 31;
    private static final int COMMAND_P16_START = 24;
    private static final int COMMAND_RST = 143;
    private static final int COMMAND_SPA = 144;
    private static final int COMMAND_SPC = 145;
    private static final int COMMAND_SPL = 146;
    private static final int COMMAND_SWA = 151;
    private static final int COMMAND_TGW = 139;
    private static final int DTVCC_PACKET_DATA = 2;
    private static final int DTVCC_PACKET_START = 3;
    private static final int GROUP_C0_END = 31;
    private static final int GROUP_C1_END = 159;
    private static final int GROUP_C2_END = 31;
    private static final int GROUP_C3_END = 159;
    private static final int GROUP_G0_END = 127;
    private static final int GROUP_G1_END = 255;
    private static final int GROUP_G2_END = 127;
    private static final int GROUP_G3_END = 255;
    private static final int NUM_WINDOWS = 8;
    private static final java.lang.String TAG = "Cea708Decoder";
    private final com.google.android.exoplayer2.util.ParsableBitArray captionChannelPacketData;
    private final com.google.android.exoplayer2.util.ParsableByteArray ccData;
    private final com.google.android.exoplayer2.text.cea.Cea708Decoder.CueInfoBuilder[] cueInfoBuilders;

    @androidx.annotation.Nullable
    private java.util.List<com.google.android.exoplayer2.text.Cue> cues;
    private com.google.android.exoplayer2.text.cea.Cea708Decoder.CueInfoBuilder currentCueInfoBuilder;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.text.cea.Cea708Decoder.DtvCcPacket currentDtvCcPacket;
    private int currentWindow;
    private final boolean isWideAspectRatio;

    @androidx.annotation.Nullable
    private java.util.List<com.google.android.exoplayer2.text.Cue> lastCues;
    private int previousSequenceNumber;
    private final int selectedServiceNumber;

    public static final class Cea708CueInfo {
        private static final java.util.Comparator<com.google.android.exoplayer2.text.cea.Cea708Decoder.Cea708CueInfo> LEAST_IMPORTANT_FIRST = null;
        public final com.google.android.exoplayer2.text.Cue cue;
        public final int priority;

        /* JADX INFO: renamed from: $r8$lambda$Pxmft5kU-whF6SchrLmcyiHvOx8, reason: not valid java name */
        public static /* synthetic */ int m257$r8$lambda$Pxmft5kUwhF6SchrLmcyiHvOx8(com.google.android.exoplayer2.text.cea.Cea708Decoder.Cea708CueInfo r0, com.google.android.exoplayer2.text.cea.Cea708Decoder.Cea708CueInfo r1) {
                int r0 = lambda$static$0(r0, r1)
                return r0
        }

        static {
                com.google.android.exoplayer2.text.cea.Cea708Decoder$Cea708CueInfo$$ExternalSyntheticLambda0 r0 = com.google.android.exoplayer2.text.cea.Cea708Decoder$Cea708CueInfo$$ExternalSyntheticLambda0.INSTANCE
                com.google.android.exoplayer2.text.cea.Cea708Decoder.Cea708CueInfo.LEAST_IMPORTANT_FIRST = r0
                return
        }

        public Cea708CueInfo(java.lang.CharSequence r2, android.text.Layout.Alignment r3, float r4, int r5, int r6, float r7, int r8, float r9, boolean r10, int r11, int r12) {
                r1 = this;
                r1.<init>()
                com.google.android.exoplayer2.text.Cue$Builder r0 = new com.google.android.exoplayer2.text.Cue$Builder
                r0.<init>()
                com.google.android.exoplayer2.text.Cue$Builder r2 = r0.setText(r2)
                com.google.android.exoplayer2.text.Cue$Builder r2 = r2.setTextAlignment(r3)
                com.google.android.exoplayer2.text.Cue$Builder r2 = r2.setLine(r4, r5)
                com.google.android.exoplayer2.text.Cue$Builder r2 = r2.setLineAnchor(r6)
                com.google.android.exoplayer2.text.Cue$Builder r2 = r2.setPosition(r7)
                com.google.android.exoplayer2.text.Cue$Builder r2 = r2.setPositionAnchor(r8)
                com.google.android.exoplayer2.text.Cue$Builder r2 = r2.setSize(r9)
                if (r10 == 0) goto L29
                r2.setWindowColor(r11)
            L29:
                com.google.android.exoplayer2.text.Cue r2 = r2.build()
                r1.cue = r2
                r1.priority = r12
                return
        }

        public static /* synthetic */ java.util.Comparator access$000() {
                java.util.Comparator<com.google.android.exoplayer2.text.cea.Cea708Decoder$Cea708CueInfo> r0 = com.google.android.exoplayer2.text.cea.Cea708Decoder.Cea708CueInfo.LEAST_IMPORTANT_FIRST
                return r0
        }

        private static /* synthetic */ int lambda$static$0(com.google.android.exoplayer2.text.cea.Cea708Decoder.Cea708CueInfo r0, com.google.android.exoplayer2.text.cea.Cea708Decoder.Cea708CueInfo r1) {
                int r1 = r1.priority
                int r0 = r0.priority
                int r0 = java.lang.Integer.compare(r1, r0)
                return r0
        }
    }

    public static final class CueInfoBuilder {
        private static final int BORDER_AND_EDGE_TYPE_NONE = 0;
        private static final int BORDER_AND_EDGE_TYPE_UNIFORM = 3;
        public static final int COLOR_SOLID_BLACK = 0;
        public static final int COLOR_SOLID_WHITE = 0;
        public static final int COLOR_TRANSPARENT = 0;
        private static final int DEFAULT_PRIORITY = 4;
        private static final int DIRECTION_BOTTOM_TO_TOP = 3;
        private static final int DIRECTION_LEFT_TO_RIGHT = 0;
        private static final int DIRECTION_RIGHT_TO_LEFT = 1;
        private static final int DIRECTION_TOP_TO_BOTTOM = 2;
        private static final int HORIZONTAL_SIZE = 209;
        private static final int JUSTIFICATION_CENTER = 2;
        private static final int JUSTIFICATION_FULL = 3;
        private static final int JUSTIFICATION_LEFT = 0;
        private static final int JUSTIFICATION_RIGHT = 1;
        private static final int MAXIMUM_ROW_COUNT = 15;
        private static final int PEN_FONT_STYLE_DEFAULT = 0;
        private static final int PEN_FONT_STYLE_MONOSPACED_WITHOUT_SERIFS = 3;
        private static final int PEN_FONT_STYLE_MONOSPACED_WITH_SERIFS = 1;
        private static final int PEN_FONT_STYLE_PROPORTIONALLY_SPACED_WITHOUT_SERIFS = 4;
        private static final int PEN_FONT_STYLE_PROPORTIONALLY_SPACED_WITH_SERIFS = 2;
        private static final int PEN_OFFSET_NORMAL = 1;
        private static final int PEN_SIZE_STANDARD = 1;
        private static final int[] PEN_STYLE_BACKGROUND = null;
        private static final int[] PEN_STYLE_EDGE_TYPE = null;
        private static final int[] PEN_STYLE_FONT_STYLE = null;
        private static final int RELATIVE_CUE_SIZE = 99;
        private static final int VERTICAL_SIZE = 74;
        private static final int[] WINDOW_STYLE_FILL = null;
        private static final int[] WINDOW_STYLE_JUSTIFICATION = null;
        private static final int[] WINDOW_STYLE_PRINT_DIRECTION = null;
        private static final int[] WINDOW_STYLE_SCROLL_DIRECTION = null;
        private static final boolean[] WINDOW_STYLE_WORD_WRAP = null;
        private int anchorId;
        private int backgroundColor;
        private int backgroundColorStartPosition;
        private final android.text.SpannableStringBuilder captionStringBuilder;
        private boolean defined;
        private int foregroundColor;
        private int foregroundColorStartPosition;
        private int horizontalAnchor;
        private int italicsStartPosition;
        private int justification;
        private int penStyleId;
        private int priority;
        private boolean relativePositioning;
        private final java.util.List<android.text.SpannableString> rolledUpCaptions;
        private int row;
        private int rowCount;
        private boolean rowLock;
        private int underlineStartPosition;
        private int verticalAnchor;
        private boolean visible;
        private int windowFillColor;
        private int windowStyleId;

        static {
                r0 = 2
                r1 = 0
                int r2 = getArgbColorFromCeaColor(r0, r0, r0, r1)
                com.google.android.exoplayer2.text.cea.Cea708Decoder.CueInfoBuilder.COLOR_SOLID_WHITE = r2
                int r2 = getArgbColorFromCeaColor(r1, r1, r1, r1)
                com.google.android.exoplayer2.text.cea.Cea708Decoder.CueInfoBuilder.COLOR_SOLID_BLACK = r2
                r3 = 3
                int r4 = getArgbColorFromCeaColor(r1, r1, r1, r3)
                com.google.android.exoplayer2.text.cea.Cea708Decoder.CueInfoBuilder.COLOR_TRANSPARENT = r4
                r5 = 7
                int[] r6 = new int[r5]
                r6 = {x006a: FILL_ARRAY_DATA , data: [0, 0, 0, 0, 0, 2, 0} // fill-array
                com.google.android.exoplayer2.text.cea.Cea708Decoder.CueInfoBuilder.WINDOW_STYLE_JUSTIFICATION = r6
                int[] r6 = new int[r5]
                r6 = {x007c: FILL_ARRAY_DATA , data: [0, 0, 0, 0, 0, 0, 2} // fill-array
                com.google.android.exoplayer2.text.cea.Cea708Decoder.CueInfoBuilder.WINDOW_STYLE_PRINT_DIRECTION = r6
                int[] r6 = new int[r5]
                r6 = {x008e: FILL_ARRAY_DATA , data: [3, 3, 3, 3, 3, 3, 1} // fill-array
                com.google.android.exoplayer2.text.cea.Cea708Decoder.CueInfoBuilder.WINDOW_STYLE_SCROLL_DIRECTION = r6
                boolean[] r6 = new boolean[r5]
                r6 = {x00a0: FILL_ARRAY_DATA , data: [0, 0, 0, 1, 1, 1, 0} // fill-array
                com.google.android.exoplayer2.text.cea.Cea708Decoder.CueInfoBuilder.WINDOW_STYLE_WORD_WRAP = r6
                int[] r6 = new int[r5]
                r6[r1] = r2
                r7 = 1
                r6[r7] = r4
                r6[r0] = r2
                r6[r3] = r2
                r8 = 4
                r6[r8] = r4
                r9 = 5
                r6[r9] = r2
                r10 = 6
                r6[r10] = r2
                com.google.android.exoplayer2.text.cea.Cea708Decoder.CueInfoBuilder.WINDOW_STYLE_FILL = r6
                int[] r6 = new int[r5]
                r6 = {x00a8: FILL_ARRAY_DATA , data: [0, 1, 2, 3, 4, 3, 4} // fill-array
                com.google.android.exoplayer2.text.cea.Cea708Decoder.CueInfoBuilder.PEN_STYLE_FONT_STYLE = r6
                int[] r6 = new int[r5]
                r6 = {x00ba: FILL_ARRAY_DATA , data: [0, 0, 0, 0, 0, 3, 3} // fill-array
                com.google.android.exoplayer2.text.cea.Cea708Decoder.CueInfoBuilder.PEN_STYLE_EDGE_TYPE = r6
                int[] r5 = new int[r5]
                r5[r1] = r2
                r5[r7] = r2
                r5[r0] = r2
                r5[r3] = r2
                r5[r8] = r2
                r5[r9] = r4
                r5[r10] = r4
                com.google.android.exoplayer2.text.cea.Cea708Decoder.CueInfoBuilder.PEN_STYLE_BACKGROUND = r5
                return
        }

        public CueInfoBuilder() {
                r1 = this;
                r1.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.rolledUpCaptions = r0
                android.text.SpannableStringBuilder r0 = new android.text.SpannableStringBuilder
                r0.<init>()
                r1.captionStringBuilder = r0
                r1.reset()
                return
        }

        public static int getArgbColorFromCeaColor(int r1, int r2, int r3) {
                r0 = 0
                int r1 = getArgbColorFromCeaColor(r1, r2, r3, r0)
                return r1
        }

        public static int getArgbColorFromCeaColor(int r4, int r5, int r6, int r7) {
                r0 = 0
                r1 = 4
                com.google.android.exoplayer2.util.Assertions.checkIndex(r4, r0, r1)
                com.google.android.exoplayer2.util.Assertions.checkIndex(r5, r0, r1)
                com.google.android.exoplayer2.util.Assertions.checkIndex(r6, r0, r1)
                com.google.android.exoplayer2.util.Assertions.checkIndex(r7, r0, r1)
                r1 = 1
                r2 = 255(0xff, float:3.57E-43)
                if (r7 == 0) goto L21
                if (r7 == r1) goto L21
                r3 = 2
                if (r7 == r3) goto L1e
                r3 = 3
                if (r7 == r3) goto L1c
                goto L21
            L1c:
                r7 = 0
                goto L23
            L1e:
                r7 = 127(0x7f, float:1.78E-43)
                goto L23
            L21:
                r7 = 255(0xff, float:3.57E-43)
            L23:
                if (r4 <= r1) goto L28
                r4 = 255(0xff, float:3.57E-43)
                goto L29
            L28:
                r4 = 0
            L29:
                if (r5 <= r1) goto L2e
                r5 = 255(0xff, float:3.57E-43)
                goto L2f
            L2e:
                r5 = 0
            L2f:
                if (r6 <= r1) goto L33
                r0 = 255(0xff, float:3.57E-43)
            L33:
                int r4 = android.graphics.Color.argb(r7, r4, r5, r0)
                return r4
        }

        public void append(char r3) {
                r2 = this;
                r0 = 10
                if (r3 != r0) goto L4a
                java.util.List<android.text.SpannableString> r3 = r2.rolledUpCaptions
                android.text.SpannableString r0 = r2.buildSpannableString()
                r3.add(r0)
                android.text.SpannableStringBuilder r3 = r2.captionStringBuilder
                r3.clear()
                int r3 = r2.italicsStartPosition
                r0 = -1
                r1 = 0
                if (r3 == r0) goto L1a
                r2.italicsStartPosition = r1
            L1a:
                int r3 = r2.underlineStartPosition
                if (r3 == r0) goto L20
                r2.underlineStartPosition = r1
            L20:
                int r3 = r2.foregroundColorStartPosition
                if (r3 == r0) goto L26
                r2.foregroundColorStartPosition = r1
            L26:
                int r3 = r2.backgroundColorStartPosition
                if (r3 == r0) goto L2c
                r2.backgroundColorStartPosition = r1
            L2c:
                boolean r3 = r2.rowLock
                if (r3 == 0) goto L3a
                java.util.List<android.text.SpannableString> r3 = r2.rolledUpCaptions
                int r3 = r3.size()
                int r0 = r2.rowCount
                if (r3 >= r0) goto L44
            L3a:
                java.util.List<android.text.SpannableString> r3 = r2.rolledUpCaptions
                int r3 = r3.size()
                r0 = 15
                if (r3 < r0) goto L4f
            L44:
                java.util.List<android.text.SpannableString> r3 = r2.rolledUpCaptions
                r3.remove(r1)
                goto L2c
            L4a:
                android.text.SpannableStringBuilder r0 = r2.captionStringBuilder
                r0.append(r3)
            L4f:
                return
        }

        public void backspace() {
                r3 = this;
                android.text.SpannableStringBuilder r0 = r3.captionStringBuilder
                int r0 = r0.length()
                if (r0 <= 0) goto Lf
                android.text.SpannableStringBuilder r1 = r3.captionStringBuilder
                int r2 = r0 + (-1)
                r1.delete(r2, r0)
            Lf:
                return
        }

        @androidx.annotation.Nullable
        public com.google.android.exoplayer2.text.cea.Cea708Decoder.Cea708CueInfo build() {
                r14 = this;
                boolean r0 = r14.isEmpty()
                if (r0 == 0) goto L8
                r0 = 0
                return r0
            L8:
                android.text.SpannableStringBuilder r2 = new android.text.SpannableStringBuilder
                r2.<init>()
                r0 = 0
                r1 = 0
            Lf:
                java.util.List<android.text.SpannableString> r3 = r14.rolledUpCaptions
                int r3 = r3.size()
                if (r1 >= r3) goto L2a
                java.util.List<android.text.SpannableString> r3 = r14.rolledUpCaptions
                java.lang.Object r3 = r3.get(r1)
                java.lang.CharSequence r3 = (java.lang.CharSequence) r3
                r2.append(r3)
                r3 = 10
                r2.append(r3)
                int r1 = r1 + 1
                goto Lf
            L2a:
                android.text.SpannableString r1 = r14.buildSpannableString()
                r2.append(r1)
                int r1 = r14.justification
                r3 = 2
                r4 = 3
                r5 = 1
                if (r1 == 0) goto L5a
                if (r1 == r5) goto L57
                if (r1 == r3) goto L54
                if (r1 != r4) goto L3f
                goto L5a
            L3f:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "Unexpected justification value: "
                java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
                int r2 = r14.justification
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L54:
                android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_CENTER
                goto L5c
            L57:
                android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_OPPOSITE
                goto L5c
            L5a:
                android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_NORMAL
            L5c:
                r3 = r1
                boolean r1 = r14.relativePositioning
                if (r1 == 0) goto L6c
                int r1 = r14.horizontalAnchor
                float r1 = (float) r1
                r6 = 1120272384(0x42c60000, float:99.0)
                float r1 = r1 / r6
                int r7 = r14.verticalAnchor
                float r7 = (float) r7
                float r7 = r7 / r6
                goto L79
            L6c:
                int r1 = r14.horizontalAnchor
                float r1 = (float) r1
                r6 = 1129381888(0x43510000, float:209.0)
                float r1 = r1 / r6
                int r6 = r14.verticalAnchor
                float r6 = (float) r6
                r7 = 1116995584(0x42940000, float:74.0)
                float r7 = r6 / r7
            L79:
                r6 = 1063675494(0x3f666666, float:0.9)
                float r1 = r1 * r6
                r8 = 1028443341(0x3d4ccccd, float:0.05)
                float r9 = r1 + r8
                float r7 = r7 * r6
                float r6 = r7 + r8
                int r1 = r14.anchorId
                int r7 = r1 / 3
                if (r7 != 0) goto L8f
                r7 = 0
                goto L96
            L8f:
                int r7 = r1 / 3
                if (r7 != r5) goto L95
                r7 = 1
                goto L96
            L95:
                r7 = 2
            L96:
                int r8 = r1 % 3
                if (r8 != 0) goto L9d
                r1 = 0
                r8 = 0
                goto La5
            L9d:
                int r1 = r1 % r4
                if (r1 != r5) goto La3
                r1 = 1
                r8 = 1
                goto La5
            La3:
                r1 = 2
                r8 = 2
            La5:
                int r1 = r14.windowFillColor
                int r4 = com.google.android.exoplayer2.text.cea.Cea708Decoder.CueInfoBuilder.COLOR_SOLID_BLACK
                if (r1 == r4) goto Lae
                r0 = 1
                r10 = 1
                goto Laf
            Lae:
                r10 = 0
            Laf:
                com.google.android.exoplayer2.text.cea.Cea708Decoder$Cea708CueInfo r0 = new com.google.android.exoplayer2.text.cea.Cea708Decoder$Cea708CueInfo
                r5 = 0
                r11 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
                int r12 = r14.windowFillColor
                int r13 = r14.priority
                r1 = r0
                r4 = r6
                r6 = r7
                r7 = r9
                r9 = r11
                r11 = r12
                r12 = r13
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
                return r0
        }

        public android.text.SpannableString buildSpannableString() {
                r6 = this;
                android.text.SpannableStringBuilder r0 = new android.text.SpannableStringBuilder
                android.text.SpannableStringBuilder r1 = r6.captionStringBuilder
                r0.<init>(r1)
                int r1 = r0.length()
                if (r1 <= 0) goto L4d
                int r2 = r6.italicsStartPosition
                r3 = 33
                r4 = -1
                if (r2 == r4) goto L1f
                android.text.style.StyleSpan r2 = new android.text.style.StyleSpan
                r5 = 2
                r2.<init>(r5)
                int r5 = r6.italicsStartPosition
                r0.setSpan(r2, r5, r1, r3)
            L1f:
                int r2 = r6.underlineStartPosition
                if (r2 == r4) goto L2d
                android.text.style.UnderlineSpan r2 = new android.text.style.UnderlineSpan
                r2.<init>()
                int r5 = r6.underlineStartPosition
                r0.setSpan(r2, r5, r1, r3)
            L2d:
                int r2 = r6.foregroundColorStartPosition
                if (r2 == r4) goto L3d
                android.text.style.ForegroundColorSpan r2 = new android.text.style.ForegroundColorSpan
                int r5 = r6.foregroundColor
                r2.<init>(r5)
                int r5 = r6.foregroundColorStartPosition
                r0.setSpan(r2, r5, r1, r3)
            L3d:
                int r2 = r6.backgroundColorStartPosition
                if (r2 == r4) goto L4d
                android.text.style.BackgroundColorSpan r2 = new android.text.style.BackgroundColorSpan
                int r4 = r6.backgroundColor
                r2.<init>(r4)
                int r4 = r6.backgroundColorStartPosition
                r0.setSpan(r2, r4, r1, r3)
            L4d:
                android.text.SpannableString r1 = new android.text.SpannableString
                r1.<init>(r0)
                return r1
        }

        public void clear() {
                r1 = this;
                java.util.List<android.text.SpannableString> r0 = r1.rolledUpCaptions
                r0.clear()
                android.text.SpannableStringBuilder r0 = r1.captionStringBuilder
                r0.clear()
                r0 = -1
                r1.italicsStartPosition = r0
                r1.underlineStartPosition = r0
                r1.foregroundColorStartPosition = r0
                r1.backgroundColorStartPosition = r0
                r0 = 0
                r1.row = r0
                return
        }

        public void defineWindow(boolean r12, boolean r13, boolean r14, int r15, boolean r16, int r17, int r18, int r19, int r20, int r21, int r22, int r23) {
                r11 = this;
                r0 = r11
                r1 = r13
                r2 = r22
                r3 = r23
                r4 = 1
                r0.defined = r4
                r5 = r12
                r0.visible = r5
                r0.rowLock = r1
                r5 = r15
                r0.priority = r5
                r5 = r16
                r0.relativePositioning = r5
                r5 = r17
                r0.verticalAnchor = r5
                r5 = r18
                r0.horizontalAnchor = r5
                r5 = r21
                r0.anchorId = r5
                int r5 = r0.rowCount
                int r6 = r19 + 1
                if (r5 == r6) goto L46
                r0.rowCount = r6
            L29:
                if (r1 == 0) goto L35
                java.util.List<android.text.SpannableString> r5 = r0.rolledUpCaptions
                int r5 = r5.size()
                int r6 = r0.rowCount
                if (r5 >= r6) goto L3f
            L35:
                java.util.List<android.text.SpannableString> r5 = r0.rolledUpCaptions
                int r5 = r5.size()
                r6 = 15
                if (r5 < r6) goto L46
            L3f:
                java.util.List<android.text.SpannableString> r5 = r0.rolledUpCaptions
                r6 = 0
                r5.remove(r6)
                goto L29
            L46:
                if (r2 == 0) goto L76
                int r1 = r0.windowStyleId
                if (r1 == r2) goto L76
                r0.windowStyleId = r2
                int r1 = r2 + (-1)
                int[] r2 = com.google.android.exoplayer2.text.cea.Cea708Decoder.CueInfoBuilder.WINDOW_STYLE_FILL
                r2 = r2[r1]
                int r5 = com.google.android.exoplayer2.text.cea.Cea708Decoder.CueInfoBuilder.COLOR_TRANSPARENT
                boolean[] r6 = com.google.android.exoplayer2.text.cea.Cea708Decoder.CueInfoBuilder.WINDOW_STYLE_WORD_WRAP
                boolean r6 = r6[r1]
                r7 = 0
                int[] r8 = com.google.android.exoplayer2.text.cea.Cea708Decoder.CueInfoBuilder.WINDOW_STYLE_PRINT_DIRECTION
                r8 = r8[r1]
                int[] r9 = com.google.android.exoplayer2.text.cea.Cea708Decoder.CueInfoBuilder.WINDOW_STYLE_SCROLL_DIRECTION
                r9 = r9[r1]
                int[] r10 = com.google.android.exoplayer2.text.cea.Cea708Decoder.CueInfoBuilder.WINDOW_STYLE_JUSTIFICATION
                r1 = r10[r1]
                r12 = r11
                r13 = r2
                r14 = r5
                r15 = r6
                r16 = r7
                r17 = r8
                r18 = r9
                r19 = r1
                r12.setWindowAttributes(r13, r14, r15, r16, r17, r18, r19)
            L76:
                if (r3 == 0) goto La7
                int r1 = r0.penStyleId
                if (r1 == r3) goto La7
                r0.penStyleId = r3
                int r1 = r3 + (-1)
                r2 = 0
                r3 = 1
                r4 = 1
                r5 = 0
                r6 = 0
                int[] r7 = com.google.android.exoplayer2.text.cea.Cea708Decoder.CueInfoBuilder.PEN_STYLE_EDGE_TYPE
                r7 = r7[r1]
                int[] r8 = com.google.android.exoplayer2.text.cea.Cea708Decoder.CueInfoBuilder.PEN_STYLE_FONT_STYLE
                r8 = r8[r1]
                r12 = r11
                r13 = r2
                r14 = r3
                r15 = r4
                r16 = r5
                r17 = r6
                r18 = r7
                r19 = r8
                r12.setPenAttributes(r13, r14, r15, r16, r17, r18, r19)
                int r2 = com.google.android.exoplayer2.text.cea.Cea708Decoder.CueInfoBuilder.COLOR_SOLID_WHITE
                int[] r3 = com.google.android.exoplayer2.text.cea.Cea708Decoder.CueInfoBuilder.PEN_STYLE_BACKGROUND
                r1 = r3[r1]
                int r3 = com.google.android.exoplayer2.text.cea.Cea708Decoder.CueInfoBuilder.COLOR_SOLID_BLACK
                r11.setPenColor(r2, r1, r3)
            La7:
                return
        }

        public boolean isDefined() {
                r1 = this;
                boolean r0 = r1.defined
                return r0
        }

        public boolean isEmpty() {
                r1 = this;
                boolean r0 = r1.isDefined()
                if (r0 == 0) goto L19
                java.util.List<android.text.SpannableString> r0 = r1.rolledUpCaptions
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto L17
                android.text.SpannableStringBuilder r0 = r1.captionStringBuilder
                int r0 = r0.length()
                if (r0 != 0) goto L17
                goto L19
            L17:
                r0 = 0
                goto L1a
            L19:
                r0 = 1
            L1a:
                return r0
        }

        public boolean isVisible() {
                r1 = this;
                boolean r0 = r1.visible
                return r0
        }

        public void reset() {
                r2 = this;
                r2.clear()
                r0 = 0
                r2.defined = r0
                r2.visible = r0
                r1 = 4
                r2.priority = r1
                r2.relativePositioning = r0
                r2.verticalAnchor = r0
                r2.horizontalAnchor = r0
                r2.anchorId = r0
                r1 = 15
                r2.rowCount = r1
                r1 = 1
                r2.rowLock = r1
                r2.justification = r0
                r2.windowStyleId = r0
                r2.penStyleId = r0
                int r0 = com.google.android.exoplayer2.text.cea.Cea708Decoder.CueInfoBuilder.COLOR_SOLID_BLACK
                r2.windowFillColor = r0
                int r1 = com.google.android.exoplayer2.text.cea.Cea708Decoder.CueInfoBuilder.COLOR_SOLID_WHITE
                r2.foregroundColor = r1
                r2.backgroundColor = r0
                return
        }

        public void setPenAttributes(int r1, int r2, int r3, boolean r4, boolean r5, int r6, int r7) {
                r0 = this;
                int r1 = r0.italicsStartPosition
                r2 = 33
                r3 = -1
                if (r1 == r3) goto L1f
                if (r4 != 0) goto L29
                android.text.SpannableStringBuilder r1 = r0.captionStringBuilder
                android.text.style.StyleSpan r4 = new android.text.style.StyleSpan
                r6 = 2
                r4.<init>(r6)
                int r6 = r0.italicsStartPosition
                android.text.SpannableStringBuilder r7 = r0.captionStringBuilder
                int r7 = r7.length()
                r1.setSpan(r4, r6, r7, r2)
                r0.italicsStartPosition = r3
                goto L29
            L1f:
                if (r4 == 0) goto L29
                android.text.SpannableStringBuilder r1 = r0.captionStringBuilder
                int r1 = r1.length()
                r0.italicsStartPosition = r1
            L29:
                int r1 = r0.underlineStartPosition
                if (r1 == r3) goto L44
                if (r5 != 0) goto L4e
                android.text.SpannableStringBuilder r1 = r0.captionStringBuilder
                android.text.style.UnderlineSpan r4 = new android.text.style.UnderlineSpan
                r4.<init>()
                int r5 = r0.underlineStartPosition
                android.text.SpannableStringBuilder r6 = r0.captionStringBuilder
                int r6 = r6.length()
                r1.setSpan(r4, r5, r6, r2)
                r0.underlineStartPosition = r3
                goto L4e
            L44:
                if (r5 == 0) goto L4e
                android.text.SpannableStringBuilder r1 = r0.captionStringBuilder
                int r1 = r1.length()
                r0.underlineStartPosition = r1
            L4e:
                return
        }

        public void setPenColor(int r6, int r7, int r8) {
                r5 = this;
                int r8 = r5.foregroundColorStartPosition
                r0 = 33
                r1 = -1
                if (r8 == r1) goto L1f
                int r8 = r5.foregroundColor
                if (r8 == r6) goto L1f
                android.text.SpannableStringBuilder r8 = r5.captionStringBuilder
                android.text.style.ForegroundColorSpan r2 = new android.text.style.ForegroundColorSpan
                int r3 = r5.foregroundColor
                r2.<init>(r3)
                int r3 = r5.foregroundColorStartPosition
                android.text.SpannableStringBuilder r4 = r5.captionStringBuilder
                int r4 = r4.length()
                r8.setSpan(r2, r3, r4, r0)
            L1f:
                int r8 = com.google.android.exoplayer2.text.cea.Cea708Decoder.CueInfoBuilder.COLOR_SOLID_WHITE
                if (r6 == r8) goto L2d
                android.text.SpannableStringBuilder r8 = r5.captionStringBuilder
                int r8 = r8.length()
                r5.foregroundColorStartPosition = r8
                r5.foregroundColor = r6
            L2d:
                int r6 = r5.backgroundColorStartPosition
                if (r6 == r1) goto L49
                int r6 = r5.backgroundColor
                if (r6 == r7) goto L49
                android.text.SpannableStringBuilder r6 = r5.captionStringBuilder
                android.text.style.BackgroundColorSpan r8 = new android.text.style.BackgroundColorSpan
                int r1 = r5.backgroundColor
                r8.<init>(r1)
                int r1 = r5.backgroundColorStartPosition
                android.text.SpannableStringBuilder r2 = r5.captionStringBuilder
                int r2 = r2.length()
                r6.setSpan(r8, r1, r2, r0)
            L49:
                int r6 = com.google.android.exoplayer2.text.cea.Cea708Decoder.CueInfoBuilder.COLOR_SOLID_BLACK
                if (r7 == r6) goto L57
                android.text.SpannableStringBuilder r6 = r5.captionStringBuilder
                int r6 = r6.length()
                r5.backgroundColorStartPosition = r6
                r5.backgroundColor = r7
            L57:
                return
        }

        public void setPenLocation(int r1, int r2) {
                r0 = this;
                int r2 = r0.row
                if (r2 == r1) goto L9
                r2 = 10
                r0.append(r2)
            L9:
                r0.row = r1
                return
        }

        public void setVisibility(boolean r1) {
                r0 = this;
                r0.visible = r1
                return
        }

        public void setWindowAttributes(int r1, int r2, boolean r3, int r4, int r5, int r6, int r7) {
                r0 = this;
                r0.windowFillColor = r1
                r0.justification = r7
                return
        }
    }

    public static final class DtvCcPacket {
        public int currentIndex;
        public final byte[] packetData;
        public final int packetSize;
        public final int sequenceNumber;

        public DtvCcPacket(int r1, int r2) {
                r0 = this;
                r0.<init>()
                r0.sequenceNumber = r1
                r0.packetSize = r2
                int r2 = r2 * 2
                int r2 = r2 + (-1)
                byte[] r1 = new byte[r2]
                r0.packetData = r1
                r1 = 0
                r0.currentIndex = r1
                return
        }
    }

    public Cea708Decoder(int r4, @androidx.annotation.Nullable java.util.List<byte[]> r5) {
            r3 = this;
            r3.<init>()
            com.google.android.exoplayer2.util.ParsableByteArray r0 = new com.google.android.exoplayer2.util.ParsableByteArray
            r0.<init>()
            r3.ccData = r0
            com.google.android.exoplayer2.util.ParsableBitArray r0 = new com.google.android.exoplayer2.util.ParsableBitArray
            r0.<init>()
            r3.captionChannelPacketData = r0
            r0 = -1
            r3.previousSequenceNumber = r0
            r1 = 1
            if (r4 != r0) goto L18
            r4 = 1
        L18:
            r3.selectedServiceNumber = r4
            r4 = 0
            if (r5 == 0) goto L24
            boolean r5 = com.google.android.exoplayer2.util.CodecSpecificDataUtil.parseCea708InitializationData(r5)
            if (r5 == 0) goto L24
            goto L25
        L24:
            r1 = 0
        L25:
            r3.isWideAspectRatio = r1
            r5 = 8
            com.google.android.exoplayer2.text.cea.Cea708Decoder$CueInfoBuilder[] r0 = new com.google.android.exoplayer2.text.cea.Cea708Decoder.CueInfoBuilder[r5]
            r3.cueInfoBuilders = r0
            r0 = 0
        L2e:
            if (r0 >= r5) goto L3c
            com.google.android.exoplayer2.text.cea.Cea708Decoder$CueInfoBuilder[] r1 = r3.cueInfoBuilders
            com.google.android.exoplayer2.text.cea.Cea708Decoder$CueInfoBuilder r2 = new com.google.android.exoplayer2.text.cea.Cea708Decoder$CueInfoBuilder
            r2.<init>()
            r1[r0] = r2
            int r0 = r0 + 1
            goto L2e
        L3c:
            com.google.android.exoplayer2.text.cea.Cea708Decoder$CueInfoBuilder[] r5 = r3.cueInfoBuilders
            r4 = r5[r4]
            r3.currentCueInfoBuilder = r4
            return
    }

    private void finalizeCurrentPacket() {
            r1 = this;
            com.google.android.exoplayer2.text.cea.Cea708Decoder$DtvCcPacket r0 = r1.currentDtvCcPacket
            if (r0 != 0) goto L5
            return
        L5:
            r1.processCurrentPacket()
            r0 = 0
            r1.currentDtvCcPacket = r0
            return
    }

    private java.util.List<com.google.android.exoplayer2.text.Cue> getDisplayCues() {
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            r2 = 0
        L7:
            r3 = 8
            if (r2 >= r3) goto L2f
            com.google.android.exoplayer2.text.cea.Cea708Decoder$CueInfoBuilder[] r3 = r4.cueInfoBuilders
            r3 = r3[r2]
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L2c
            com.google.android.exoplayer2.text.cea.Cea708Decoder$CueInfoBuilder[] r3 = r4.cueInfoBuilders
            r3 = r3[r2]
            boolean r3 = r3.isVisible()
            if (r3 == 0) goto L2c
            com.google.android.exoplayer2.text.cea.Cea708Decoder$CueInfoBuilder[] r3 = r4.cueInfoBuilders
            r3 = r3[r2]
            com.google.android.exoplayer2.text.cea.Cea708Decoder$Cea708CueInfo r3 = r3.build()
            if (r3 == 0) goto L2c
            r0.add(r3)
        L2c:
            int r2 = r2 + 1
            goto L7
        L2f:
            java.util.Comparator r2 = com.google.android.exoplayer2.text.cea.Cea708Decoder.Cea708CueInfo.access$000()
            java.util.Collections.sort(r0, r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = r0.size()
            r2.<init>(r3)
        L3f:
            int r3 = r0.size()
            if (r1 >= r3) goto L53
            java.lang.Object r3 = r0.get(r1)
            com.google.android.exoplayer2.text.cea.Cea708Decoder$Cea708CueInfo r3 = (com.google.android.exoplayer2.text.cea.Cea708Decoder.Cea708CueInfo) r3
            com.google.android.exoplayer2.text.Cue r3 = r3.cue
            r2.add(r3)
            int r1 = r1 + 1
            goto L3f
        L53:
            java.util.List r0 = java.util.Collections.unmodifiableList(r2)
            return r0
    }

    private void handleC0Command(int r4) {
            r3 = this;
            if (r4 == 0) goto L54
            r0 = 3
            if (r4 == r0) goto L4e
            r0 = 8
            if (r4 == r0) goto L48
            switch(r4) {
                case 12: goto L29;
                case 13: goto L21;
                case 14: goto L54;
                default: goto Lc;
            }
        Lc:
            r1 = 17
            java.lang.String r2 = "Cea708Decoder"
            if (r4 < r1) goto L2d
            r1 = 23
            if (r4 > r1) goto L2d
            java.lang.String r1 = "Currently unsupported COMMAND_EXT1 Command: "
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m26m(r1, r4, r2)
            com.google.android.exoplayer2.util.ParsableBitArray r4 = r3.captionChannelPacketData
            r4.skipBits(r0)
            goto L54
        L21:
            com.google.android.exoplayer2.text.cea.Cea708Decoder$CueInfoBuilder r4 = r3.currentCueInfoBuilder
            r0 = 10
            r4.append(r0)
            goto L54
        L29:
            r3.resetCueBuilders()
            goto L54
        L2d:
            r0 = 24
            if (r4 < r0) goto L42
            r0 = 31
            if (r4 > r0) goto L42
            java.lang.String r0 = "Currently unsupported COMMAND_P16 Command: "
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m26m(r0, r4, r2)
            com.google.android.exoplayer2.util.ParsableBitArray r4 = r3.captionChannelPacketData
            r0 = 16
            r4.skipBits(r0)
            goto L54
        L42:
            java.lang.String r0 = "Invalid C0 command: "
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m26m(r0, r4, r2)
            goto L54
        L48:
            com.google.android.exoplayer2.text.cea.Cea708Decoder$CueInfoBuilder r4 = r3.currentCueInfoBuilder
            r4.backspace()
            goto L54
        L4e:
            java.util.List r4 = r3.getDisplayCues()
            r3.cues = r4
        L54:
            return
    }

    private void handleC1Command(int r5) {
            r4 = this;
            r0 = 16
            r1 = 8
            r2 = 1
            switch(r5) {
                case 128: goto Lfa;
                case 129: goto Lfa;
                case 130: goto Lfa;
                case 131: goto Lfa;
                case 132: goto Lfa;
                case 133: goto Lfa;
                case 134: goto Lfa;
                case 135: goto Lfa;
                case 136: goto Le4;
                case 137: goto Lcd;
                case 138: goto Lb6;
                case 139: goto L9a;
                case 140: goto L84;
                case 141: goto L7d;
                case 142: goto L108;
                case 143: goto L78;
                case 144: goto L64;
                case 145: goto L4e;
                case 146: goto L3a;
                case 147: goto L8;
                case 148: goto L8;
                case 149: goto L8;
                case 150: goto L8;
                case 151: goto L24;
                case 152: goto L11;
                case 153: goto L11;
                case 154: goto L11;
                case 155: goto L11;
                case 156: goto L11;
                case 157: goto L11;
                case 158: goto L11;
                case 159: goto L11;
                default: goto L8;
            }
        L8:
            java.lang.String r0 = "Invalid C1 command: "
            java.lang.String r1 = "Cea708Decoder"
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m26m(r0, r5, r1)
            goto L108
        L11:
            int r5 = r5 + (-152)
            r4.handleDefineWindow(r5)
            int r0 = r4.currentWindow
            if (r0 == r5) goto L108
            r4.currentWindow = r5
            com.google.android.exoplayer2.text.cea.Cea708Decoder$CueInfoBuilder[] r0 = r4.cueInfoBuilders
            r5 = r0[r5]
            r4.currentCueInfoBuilder = r5
            goto L108
        L24:
            com.google.android.exoplayer2.text.cea.Cea708Decoder$CueInfoBuilder r5 = r4.currentCueInfoBuilder
            boolean r5 = r5.isDefined()
            if (r5 != 0) goto L35
            com.google.android.exoplayer2.util.ParsableBitArray r5 = r4.captionChannelPacketData
            r0 = 32
            r5.skipBits(r0)
            goto L108
        L35:
            r4.handleSetWindowAttributes()
            goto L108
        L3a:
            com.google.android.exoplayer2.text.cea.Cea708Decoder$CueInfoBuilder r5 = r4.currentCueInfoBuilder
            boolean r5 = r5.isDefined()
            if (r5 != 0) goto L49
            com.google.android.exoplayer2.util.ParsableBitArray r5 = r4.captionChannelPacketData
            r5.skipBits(r0)
            goto L108
        L49:
            r4.handleSetPenLocation()
            goto L108
        L4e:
            com.google.android.exoplayer2.text.cea.Cea708Decoder$CueInfoBuilder r5 = r4.currentCueInfoBuilder
            boolean r5 = r5.isDefined()
            if (r5 != 0) goto L5f
            com.google.android.exoplayer2.util.ParsableBitArray r5 = r4.captionChannelPacketData
            r0 = 24
            r5.skipBits(r0)
            goto L108
        L5f:
            r4.handleSetPenColor()
            goto L108
        L64:
            com.google.android.exoplayer2.text.cea.Cea708Decoder$CueInfoBuilder r5 = r4.currentCueInfoBuilder
            boolean r5 = r5.isDefined()
            if (r5 != 0) goto L73
            com.google.android.exoplayer2.util.ParsableBitArray r5 = r4.captionChannelPacketData
            r5.skipBits(r0)
            goto L108
        L73:
            r4.handleSetPenAttributes()
            goto L108
        L78:
            r4.resetCueBuilders()
            goto L108
        L7d:
            com.google.android.exoplayer2.util.ParsableBitArray r5 = r4.captionChannelPacketData
            r5.skipBits(r1)
            goto L108
        L84:
            if (r2 > r1) goto L108
            com.google.android.exoplayer2.util.ParsableBitArray r5 = r4.captionChannelPacketData
            boolean r5 = r5.readBit()
            if (r5 == 0) goto L97
            com.google.android.exoplayer2.text.cea.Cea708Decoder$CueInfoBuilder[] r5 = r4.cueInfoBuilders
            int r0 = 8 - r2
            r5 = r5[r0]
            r5.reset()
        L97:
            int r2 = r2 + 1
            goto L84
        L9a:
            r5 = 1
        L9b:
            if (r5 > r1) goto L108
            com.google.android.exoplayer2.util.ParsableBitArray r0 = r4.captionChannelPacketData
            boolean r0 = r0.readBit()
            if (r0 == 0) goto Lb3
            com.google.android.exoplayer2.text.cea.Cea708Decoder$CueInfoBuilder[] r0 = r4.cueInfoBuilders
            int r3 = 8 - r5
            r0 = r0[r3]
            boolean r3 = r0.isVisible()
            r3 = r3 ^ r2
            r0.setVisibility(r3)
        Lb3:
            int r5 = r5 + 1
            goto L9b
        Lb6:
            if (r2 > r1) goto L108
            com.google.android.exoplayer2.util.ParsableBitArray r5 = r4.captionChannelPacketData
            boolean r5 = r5.readBit()
            if (r5 == 0) goto Lca
            com.google.android.exoplayer2.text.cea.Cea708Decoder$CueInfoBuilder[] r5 = r4.cueInfoBuilders
            int r0 = 8 - r2
            r5 = r5[r0]
            r0 = 0
            r5.setVisibility(r0)
        Lca:
            int r2 = r2 + 1
            goto Lb6
        Lcd:
            r5 = 1
        Lce:
            if (r5 > r1) goto L108
            com.google.android.exoplayer2.util.ParsableBitArray r0 = r4.captionChannelPacketData
            boolean r0 = r0.readBit()
            if (r0 == 0) goto Le1
            com.google.android.exoplayer2.text.cea.Cea708Decoder$CueInfoBuilder[] r0 = r4.cueInfoBuilders
            int r3 = 8 - r5
            r0 = r0[r3]
            r0.setVisibility(r2)
        Le1:
            int r5 = r5 + 1
            goto Lce
        Le4:
            if (r2 > r1) goto L108
            com.google.android.exoplayer2.util.ParsableBitArray r5 = r4.captionChannelPacketData
            boolean r5 = r5.readBit()
            if (r5 == 0) goto Lf7
            com.google.android.exoplayer2.text.cea.Cea708Decoder$CueInfoBuilder[] r5 = r4.cueInfoBuilders
            int r0 = 8 - r2
            r5 = r5[r0]
            r5.clear()
        Lf7:
            int r2 = r2 + 1
            goto Le4
        Lfa:
            int r5 = r5 + (-128)
            int r0 = r4.currentWindow
            if (r0 == r5) goto L108
            r4.currentWindow = r5
            com.google.android.exoplayer2.text.cea.Cea708Decoder$CueInfoBuilder[] r0 = r4.cueInfoBuilders
            r5 = r0[r5]
            r4.currentCueInfoBuilder = r5
        L108:
            return
    }

    private void handleC2Command(int r2) {
            r1 = this;
            r0 = 7
            if (r2 > r0) goto L4
            goto L27
        L4:
            r0 = 15
            if (r2 > r0) goto L10
            com.google.android.exoplayer2.util.ParsableBitArray r2 = r1.captionChannelPacketData
            r0 = 8
            r2.skipBits(r0)
            goto L27
        L10:
            r0 = 23
            if (r2 > r0) goto L1c
            com.google.android.exoplayer2.util.ParsableBitArray r2 = r1.captionChannelPacketData
            r0 = 16
            r2.skipBits(r0)
            goto L27
        L1c:
            r0 = 31
            if (r2 > r0) goto L27
            com.google.android.exoplayer2.util.ParsableBitArray r2 = r1.captionChannelPacketData
            r0 = 24
            r2.skipBits(r0)
        L27:
            return
    }

    private void handleC3Command(int r2) {
            r1 = this;
            r0 = 135(0x87, float:1.89E-43)
            if (r2 > r0) goto Lc
            com.google.android.exoplayer2.util.ParsableBitArray r2 = r1.captionChannelPacketData
            r0 = 32
            r2.skipBits(r0)
            goto L30
        Lc:
            r0 = 143(0x8f, float:2.0E-43)
            if (r2 > r0) goto L18
            com.google.android.exoplayer2.util.ParsableBitArray r2 = r1.captionChannelPacketData
            r0 = 40
            r2.skipBits(r0)
            goto L30
        L18:
            r0 = 159(0x9f, float:2.23E-43)
            if (r2 > r0) goto L30
            com.google.android.exoplayer2.util.ParsableBitArray r2 = r1.captionChannelPacketData
            r0 = 2
            r2.skipBits(r0)
            com.google.android.exoplayer2.util.ParsableBitArray r2 = r1.captionChannelPacketData
            r0 = 6
            int r2 = r2.readBits(r0)
            com.google.android.exoplayer2.util.ParsableBitArray r0 = r1.captionChannelPacketData
            int r2 = r2 * 8
            r0.skipBits(r2)
        L30:
            return
    }

    private void handleDefineWindow(int r15) {
            r14 = this;
            com.google.android.exoplayer2.text.cea.Cea708Decoder$CueInfoBuilder[] r0 = r14.cueInfoBuilders
            r1 = r0[r15]
            com.google.android.exoplayer2.util.ParsableBitArray r15 = r14.captionChannelPacketData
            r0 = 2
            r15.skipBits(r0)
            com.google.android.exoplayer2.util.ParsableBitArray r15 = r14.captionChannelPacketData
            boolean r2 = r15.readBit()
            com.google.android.exoplayer2.util.ParsableBitArray r15 = r14.captionChannelPacketData
            boolean r3 = r15.readBit()
            com.google.android.exoplayer2.util.ParsableBitArray r15 = r14.captionChannelPacketData
            boolean r4 = r15.readBit()
            com.google.android.exoplayer2.util.ParsableBitArray r15 = r14.captionChannelPacketData
            r5 = 3
            int r15 = r15.readBits(r5)
            com.google.android.exoplayer2.util.ParsableBitArray r6 = r14.captionChannelPacketData
            boolean r6 = r6.readBit()
            com.google.android.exoplayer2.util.ParsableBitArray r7 = r14.captionChannelPacketData
            r8 = 7
            int r7 = r7.readBits(r8)
            com.google.android.exoplayer2.util.ParsableBitArray r8 = r14.captionChannelPacketData
            r9 = 8
            int r8 = r8.readBits(r9)
            com.google.android.exoplayer2.util.ParsableBitArray r9 = r14.captionChannelPacketData
            r10 = 4
            int r11 = r9.readBits(r10)
            com.google.android.exoplayer2.util.ParsableBitArray r9 = r14.captionChannelPacketData
            int r9 = r9.readBits(r10)
            com.google.android.exoplayer2.util.ParsableBitArray r10 = r14.captionChannelPacketData
            r10.skipBits(r0)
            com.google.android.exoplayer2.util.ParsableBitArray r10 = r14.captionChannelPacketData
            r12 = 6
            int r10 = r10.readBits(r12)
            com.google.android.exoplayer2.util.ParsableBitArray r12 = r14.captionChannelPacketData
            r12.skipBits(r0)
            com.google.android.exoplayer2.util.ParsableBitArray r0 = r14.captionChannelPacketData
            int r12 = r0.readBits(r5)
            com.google.android.exoplayer2.util.ParsableBitArray r0 = r14.captionChannelPacketData
            int r13 = r0.readBits(r5)
            r5 = r15
            r1.defineWindow(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
    }

    private void handleG0Character(int r2) {
            r1 = this;
            r0 = 127(0x7f, float:1.78E-43)
            if (r2 != r0) goto Lc
            com.google.android.exoplayer2.text.cea.Cea708Decoder$CueInfoBuilder r2 = r1.currentCueInfoBuilder
            r0 = 9835(0x266b, float:1.3782E-41)
            r2.append(r0)
            goto L14
        Lc:
            com.google.android.exoplayer2.text.cea.Cea708Decoder$CueInfoBuilder r0 = r1.currentCueInfoBuilder
            r2 = r2 & 255(0xff, float:3.57E-43)
            char r2 = (char) r2
            r0.append(r2)
        L14:
            return
    }

    private void handleG1Character(int r2) {
            r1 = this;
            com.google.android.exoplayer2.text.cea.Cea708Decoder$CueInfoBuilder r0 = r1.currentCueInfoBuilder
            r2 = r2 & 255(0xff, float:3.57E-43)
            char r2 = (char) r2
            r0.append(r2)
            return
    }

    private void handleG2Character(int r3) {
            r2 = this;
            r0 = 32
            if (r3 == r0) goto L10c
            r0 = 33
            if (r3 == r0) goto L104
            r0 = 37
            if (r3 == r0) goto Lfc
            r0 = 42
            if (r3 == r0) goto Lf4
            r0 = 44
            if (r3 == r0) goto Lec
            r0 = 63
            if (r3 == r0) goto Le4
            r0 = 57
            if (r3 == r0) goto Ldc
            r0 = 58
            if (r3 == r0) goto Ld4
            r0 = 60
            if (r3 == r0) goto Lcc
            r0 = 61
            if (r3 == r0) goto Lc4
            switch(r3) {
                case 48: goto L64;
                case 49: goto L5b;
                case 50: goto L52;
                case 51: goto L49;
                case 52: goto L40;
                case 53: goto L37;
                default: goto L2b;
            }
        L2b:
            switch(r3) {
                case 118: goto Lbc;
                case 119: goto Lb4;
                case 120: goto Lac;
                case 121: goto La3;
                case 122: goto L9a;
                case 123: goto L91;
                case 124: goto L88;
                case 125: goto L7f;
                case 126: goto L76;
                case 127: goto L6d;
                default: goto L2e;
            }
        L2e:
            java.lang.String r0 = "Invalid G2 character: "
            java.lang.String r1 = "Cea708Decoder"
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m26m(r0, r3, r1)
            goto L111
        L37:
            com.google.android.exoplayer2.text.cea.Cea708Decoder$CueInfoBuilder r3 = r2.currentCueInfoBuilder
            r0 = 8226(0x2022, float:1.1527E-41)
            r3.append(r0)
            goto L111
        L40:
            com.google.android.exoplayer2.text.cea.Cea708Decoder$CueInfoBuilder r3 = r2.currentCueInfoBuilder
            r0 = 8221(0x201d, float:1.152E-41)
            r3.append(r0)
            goto L111
        L49:
            com.google.android.exoplayer2.text.cea.Cea708Decoder$CueInfoBuilder r3 = r2.currentCueInfoBuilder
            r0 = 8220(0x201c, float:1.1519E-41)
            r3.append(r0)
            goto L111
        L52:
            com.google.android.exoplayer2.text.cea.Cea708Decoder$CueInfoBuilder r3 = r2.currentCueInfoBuilder
            r0 = 8217(0x2019, float:1.1514E-41)
            r3.append(r0)
            goto L111
        L5b:
            com.google.android.exoplayer2.text.cea.Cea708Decoder$CueInfoBuilder r3 = r2.currentCueInfoBuilder
            r0 = 8216(0x2018, float:1.1513E-41)
            r3.append(r0)
            goto L111
        L64:
            com.google.android.exoplayer2.text.cea.Cea708Decoder$CueInfoBuilder r3 = r2.currentCueInfoBuilder
            r0 = 9608(0x2588, float:1.3464E-41)
            r3.append(r0)
            goto L111
        L6d:
            com.google.android.exoplayer2.text.cea.Cea708Decoder$CueInfoBuilder r3 = r2.currentCueInfoBuilder
            r0 = 9484(0x250c, float:1.329E-41)
            r3.append(r0)
            goto L111
        L76:
            com.google.android.exoplayer2.text.cea.Cea708Decoder$CueInfoBuilder r3 = r2.currentCueInfoBuilder
            r0 = 9496(0x2518, float:1.3307E-41)
            r3.append(r0)
            goto L111
        L7f:
            com.google.android.exoplayer2.text.cea.Cea708Decoder$CueInfoBuilder r3 = r2.currentCueInfoBuilder
            r0 = 9472(0x2500, float:1.3273E-41)
            r3.append(r0)
            goto L111
        L88:
            com.google.android.exoplayer2.text.cea.Cea708Decoder$CueInfoBuilder r3 = r2.currentCueInfoBuilder
            r0 = 9492(0x2514, float:1.3301E-41)
            r3.append(r0)
            goto L111
        L91:
            com.google.android.exoplayer2.text.cea.Cea708Decoder$CueInfoBuilder r3 = r2.currentCueInfoBuilder
            r0 = 9488(0x2510, float:1.3296E-41)
            r3.append(r0)
            goto L111
        L9a:
            com.google.android.exoplayer2.text.cea.Cea708Decoder$CueInfoBuilder r3 = r2.currentCueInfoBuilder
            r0 = 9474(0x2502, float:1.3276E-41)
            r3.append(r0)
            goto L111
        La3:
            com.google.android.exoplayer2.text.cea.Cea708Decoder$CueInfoBuilder r3 = r2.currentCueInfoBuilder
            r0 = 8542(0x215e, float:1.197E-41)
            r3.append(r0)
            goto L111
        Lac:
            com.google.android.exoplayer2.text.cea.Cea708Decoder$CueInfoBuilder r3 = r2.currentCueInfoBuilder
            r0 = 8541(0x215d, float:1.1968E-41)
            r3.append(r0)
            goto L111
        Lb4:
            com.google.android.exoplayer2.text.cea.Cea708Decoder$CueInfoBuilder r3 = r2.currentCueInfoBuilder
            r0 = 8540(0x215c, float:1.1967E-41)
            r3.append(r0)
            goto L111
        Lbc:
            com.google.android.exoplayer2.text.cea.Cea708Decoder$CueInfoBuilder r3 = r2.currentCueInfoBuilder
            r0 = 8539(0x215b, float:1.1966E-41)
            r3.append(r0)
            goto L111
        Lc4:
            com.google.android.exoplayer2.text.cea.Cea708Decoder$CueInfoBuilder r3 = r2.currentCueInfoBuilder
            r0 = 8480(0x2120, float:1.1883E-41)
            r3.append(r0)
            goto L111
        Lcc:
            com.google.android.exoplayer2.text.cea.Cea708Decoder$CueInfoBuilder r3 = r2.currentCueInfoBuilder
            r0 = 339(0x153, float:4.75E-43)
            r3.append(r0)
            goto L111
        Ld4:
            com.google.android.exoplayer2.text.cea.Cea708Decoder$CueInfoBuilder r3 = r2.currentCueInfoBuilder
            r0 = 353(0x161, float:4.95E-43)
            r3.append(r0)
            goto L111
        Ldc:
            com.google.android.exoplayer2.text.cea.Cea708Decoder$CueInfoBuilder r3 = r2.currentCueInfoBuilder
            r0 = 8482(0x2122, float:1.1886E-41)
            r3.append(r0)
            goto L111
        Le4:
            com.google.android.exoplayer2.text.cea.Cea708Decoder$CueInfoBuilder r3 = r2.currentCueInfoBuilder
            r0 = 376(0x178, float:5.27E-43)
            r3.append(r0)
            goto L111
        Lec:
            com.google.android.exoplayer2.text.cea.Cea708Decoder$CueInfoBuilder r3 = r2.currentCueInfoBuilder
            r0 = 338(0x152, float:4.74E-43)
            r3.append(r0)
            goto L111
        Lf4:
            com.google.android.exoplayer2.text.cea.Cea708Decoder$CueInfoBuilder r3 = r2.currentCueInfoBuilder
            r0 = 352(0x160, float:4.93E-43)
            r3.append(r0)
            goto L111
        Lfc:
            com.google.android.exoplayer2.text.cea.Cea708Decoder$CueInfoBuilder r3 = r2.currentCueInfoBuilder
            r0 = 8230(0x2026, float:1.1533E-41)
            r3.append(r0)
            goto L111
        L104:
            com.google.android.exoplayer2.text.cea.Cea708Decoder$CueInfoBuilder r3 = r2.currentCueInfoBuilder
            r0 = 160(0xa0, float:2.24E-43)
            r3.append(r0)
            goto L111
        L10c:
            com.google.android.exoplayer2.text.cea.Cea708Decoder$CueInfoBuilder r3 = r2.currentCueInfoBuilder
            r3.append(r0)
        L111:
            return
    }

    private void handleG3Character(int r3) {
            r2 = this;
            r0 = 160(0xa0, float:2.24E-43)
            if (r3 != r0) goto Lc
            com.google.android.exoplayer2.text.cea.Cea708Decoder$CueInfoBuilder r3 = r2.currentCueInfoBuilder
            r0 = 13252(0x33c4, float:1.857E-41)
            r3.append(r0)
            goto L1a
        Lc:
            java.lang.String r0 = "Invalid G3 character: "
            java.lang.String r1 = "Cea708Decoder"
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m26m(r0, r3, r1)
            com.google.android.exoplayer2.text.cea.Cea708Decoder$CueInfoBuilder r3 = r2.currentCueInfoBuilder
            r0 = 95
            r3.append(r0)
        L1a:
            return
    }

    private void handleSetPenAttributes() {
            r10 = this;
            com.google.android.exoplayer2.util.ParsableBitArray r0 = r10.captionChannelPacketData
            r1 = 4
            int r3 = r0.readBits(r1)
            com.google.android.exoplayer2.util.ParsableBitArray r0 = r10.captionChannelPacketData
            r1 = 2
            int r4 = r0.readBits(r1)
            com.google.android.exoplayer2.util.ParsableBitArray r0 = r10.captionChannelPacketData
            int r5 = r0.readBits(r1)
            com.google.android.exoplayer2.util.ParsableBitArray r0 = r10.captionChannelPacketData
            boolean r6 = r0.readBit()
            com.google.android.exoplayer2.util.ParsableBitArray r0 = r10.captionChannelPacketData
            boolean r7 = r0.readBit()
            com.google.android.exoplayer2.util.ParsableBitArray r0 = r10.captionChannelPacketData
            r1 = 3
            int r8 = r0.readBits(r1)
            com.google.android.exoplayer2.util.ParsableBitArray r0 = r10.captionChannelPacketData
            int r9 = r0.readBits(r1)
            com.google.android.exoplayer2.text.cea.Cea708Decoder$CueInfoBuilder r2 = r10.currentCueInfoBuilder
            r2.setPenAttributes(r3, r4, r5, r6, r7, r8, r9)
            return
    }

    private void handleSetPenColor() {
            r6 = this;
            com.google.android.exoplayer2.util.ParsableBitArray r0 = r6.captionChannelPacketData
            r1 = 2
            int r0 = r0.readBits(r1)
            com.google.android.exoplayer2.util.ParsableBitArray r2 = r6.captionChannelPacketData
            int r2 = r2.readBits(r1)
            com.google.android.exoplayer2.util.ParsableBitArray r3 = r6.captionChannelPacketData
            int r3 = r3.readBits(r1)
            com.google.android.exoplayer2.util.ParsableBitArray r4 = r6.captionChannelPacketData
            int r4 = r4.readBits(r1)
            int r0 = com.google.android.exoplayer2.text.cea.Cea708Decoder.CueInfoBuilder.getArgbColorFromCeaColor(r2, r3, r4, r0)
            com.google.android.exoplayer2.util.ParsableBitArray r2 = r6.captionChannelPacketData
            int r2 = r2.readBits(r1)
            com.google.android.exoplayer2.util.ParsableBitArray r3 = r6.captionChannelPacketData
            int r3 = r3.readBits(r1)
            com.google.android.exoplayer2.util.ParsableBitArray r4 = r6.captionChannelPacketData
            int r4 = r4.readBits(r1)
            com.google.android.exoplayer2.util.ParsableBitArray r5 = r6.captionChannelPacketData
            int r5 = r5.readBits(r1)
            int r2 = com.google.android.exoplayer2.text.cea.Cea708Decoder.CueInfoBuilder.getArgbColorFromCeaColor(r3, r4, r5, r2)
            com.google.android.exoplayer2.util.ParsableBitArray r3 = r6.captionChannelPacketData
            r3.skipBits(r1)
            com.google.android.exoplayer2.util.ParsableBitArray r3 = r6.captionChannelPacketData
            int r3 = r3.readBits(r1)
            com.google.android.exoplayer2.util.ParsableBitArray r4 = r6.captionChannelPacketData
            int r4 = r4.readBits(r1)
            com.google.android.exoplayer2.util.ParsableBitArray r5 = r6.captionChannelPacketData
            int r1 = r5.readBits(r1)
            int r1 = com.google.android.exoplayer2.text.cea.Cea708Decoder.CueInfoBuilder.getArgbColorFromCeaColor(r3, r4, r1)
            com.google.android.exoplayer2.text.cea.Cea708Decoder$CueInfoBuilder r3 = r6.currentCueInfoBuilder
            r3.setPenColor(r0, r2, r1)
            return
    }

    private void handleSetPenLocation() {
            r3 = this;
            com.google.android.exoplayer2.util.ParsableBitArray r0 = r3.captionChannelPacketData
            r1 = 4
            r0.skipBits(r1)
            com.google.android.exoplayer2.util.ParsableBitArray r0 = r3.captionChannelPacketData
            int r0 = r0.readBits(r1)
            com.google.android.exoplayer2.util.ParsableBitArray r1 = r3.captionChannelPacketData
            r2 = 2
            r1.skipBits(r2)
            com.google.android.exoplayer2.util.ParsableBitArray r1 = r3.captionChannelPacketData
            r2 = 6
            int r1 = r1.readBits(r2)
            com.google.android.exoplayer2.text.cea.Cea708Decoder$CueInfoBuilder r2 = r3.currentCueInfoBuilder
            r2.setPenLocation(r0, r1)
            return
    }

    private void handleSetWindowAttributes() {
            r13 = this;
            com.google.android.exoplayer2.util.ParsableBitArray r0 = r13.captionChannelPacketData
            r1 = 2
            int r0 = r0.readBits(r1)
            com.google.android.exoplayer2.util.ParsableBitArray r2 = r13.captionChannelPacketData
            int r2 = r2.readBits(r1)
            com.google.android.exoplayer2.util.ParsableBitArray r3 = r13.captionChannelPacketData
            int r3 = r3.readBits(r1)
            com.google.android.exoplayer2.util.ParsableBitArray r4 = r13.captionChannelPacketData
            int r4 = r4.readBits(r1)
            int r6 = com.google.android.exoplayer2.text.cea.Cea708Decoder.CueInfoBuilder.getArgbColorFromCeaColor(r2, r3, r4, r0)
            com.google.android.exoplayer2.util.ParsableBitArray r0 = r13.captionChannelPacketData
            int r0 = r0.readBits(r1)
            com.google.android.exoplayer2.util.ParsableBitArray r2 = r13.captionChannelPacketData
            int r2 = r2.readBits(r1)
            com.google.android.exoplayer2.util.ParsableBitArray r3 = r13.captionChannelPacketData
            int r3 = r3.readBits(r1)
            com.google.android.exoplayer2.util.ParsableBitArray r4 = r13.captionChannelPacketData
            int r4 = r4.readBits(r1)
            int r7 = com.google.android.exoplayer2.text.cea.Cea708Decoder.CueInfoBuilder.getArgbColorFromCeaColor(r2, r3, r4)
            com.google.android.exoplayer2.util.ParsableBitArray r2 = r13.captionChannelPacketData
            boolean r2 = r2.readBit()
            if (r2 == 0) goto L43
            r0 = r0 | 4
        L43:
            r9 = r0
            com.google.android.exoplayer2.util.ParsableBitArray r0 = r13.captionChannelPacketData
            boolean r8 = r0.readBit()
            com.google.android.exoplayer2.util.ParsableBitArray r0 = r13.captionChannelPacketData
            int r10 = r0.readBits(r1)
            com.google.android.exoplayer2.util.ParsableBitArray r0 = r13.captionChannelPacketData
            int r11 = r0.readBits(r1)
            com.google.android.exoplayer2.util.ParsableBitArray r0 = r13.captionChannelPacketData
            int r12 = r0.readBits(r1)
            com.google.android.exoplayer2.util.ParsableBitArray r0 = r13.captionChannelPacketData
            r1 = 8
            r0.skipBits(r1)
            com.google.android.exoplayer2.text.cea.Cea708Decoder$CueInfoBuilder r5 = r13.currentCueInfoBuilder
            r5.setWindowAttributes(r6, r7, r8, r9, r10, r11, r12)
            return
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"currentDtvCcPacket"})
    private void processCurrentPacket() {
            r11 = this;
            com.google.android.exoplayer2.text.cea.Cea708Decoder$DtvCcPacket r0 = r11.currentDtvCcPacket
            int r1 = r0.currentIndex
            int r0 = r0.packetSize
            r2 = 2
            int r0 = r0 * 2
            int r0 = r0 + (-1)
            java.lang.String r3 = "Cea708Decoder"
            if (r1 == r0) goto L44
            java.lang.String r0 = "DtvCcPacket ended prematurely; size is "
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            com.google.android.exoplayer2.text.cea.Cea708Decoder$DtvCcPacket r1 = r11.currentDtvCcPacket
            int r1 = r1.packetSize
            int r1 = r1 * 2
            int r1 = r1 + (-1)
            r0.append(r1)
            java.lang.String r1 = ", but current index is "
            r0.append(r1)
            com.google.android.exoplayer2.text.cea.Cea708Decoder$DtvCcPacket r1 = r11.currentDtvCcPacket
            int r1 = r1.currentIndex
            r0.append(r1)
            java.lang.String r1 = " (sequence number "
            r0.append(r1)
            com.google.android.exoplayer2.text.cea.Cea708Decoder$DtvCcPacket r1 = r11.currentDtvCcPacket
            int r1 = r1.sequenceNumber
            r0.append(r1)
            java.lang.String r1 = ");"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.google.android.exoplayer2.util.Log.d(r3, r0)
        L44:
            r0 = 0
            com.google.android.exoplayer2.util.ParsableBitArray r1 = r11.captionChannelPacketData
            com.google.android.exoplayer2.text.cea.Cea708Decoder$DtvCcPacket r4 = r11.currentDtvCcPacket
            byte[] r5 = r4.packetData
            int r4 = r4.currentIndex
            r1.reset(r5, r4)
        L50:
            com.google.android.exoplayer2.util.ParsableBitArray r1 = r11.captionChannelPacketData
            int r1 = r1.bitsLeft()
            if (r1 <= 0) goto L10e
            com.google.android.exoplayer2.util.ParsableBitArray r1 = r11.captionChannelPacketData
            r4 = 3
            int r1 = r1.readBits(r4)
            com.google.android.exoplayer2.util.ParsableBitArray r4 = r11.captionChannelPacketData
            r5 = 5
            int r4 = r4.readBits(r5)
            r5 = 7
            if (r1 != r5) goto L7c
            com.google.android.exoplayer2.util.ParsableBitArray r1 = r11.captionChannelPacketData
            r1.skipBits(r2)
            com.google.android.exoplayer2.util.ParsableBitArray r1 = r11.captionChannelPacketData
            r6 = 6
            int r1 = r1.readBits(r6)
            if (r1 >= r5) goto L7c
            java.lang.String r5 = "Invalid extended service number: "
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m26m(r5, r1, r3)
        L7c:
            if (r4 != 0) goto L9c
            if (r1 == 0) goto L10e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "serviceNumber is non-zero ("
            r2.append(r4)
            r2.append(r1)
            java.lang.String r1 = ") when blockSize is 0"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.google.android.exoplayer2.util.Log.w(r3, r1)
            goto L10e
        L9c:
            int r5 = r11.selectedServiceNumber
            if (r1 == r5) goto La6
            com.google.android.exoplayer2.util.ParsableBitArray r1 = r11.captionChannelPacketData
            r1.skipBytes(r4)
            goto L50
        La6:
            com.google.android.exoplayer2.util.ParsableBitArray r1 = r11.captionChannelPacketData
            int r1 = r1.getPosition()
            int r4 = r4 * 8
            int r4 = r4 + r1
        Laf:
            com.google.android.exoplayer2.util.ParsableBitArray r1 = r11.captionChannelPacketData
            int r1 = r1.getPosition()
            if (r1 >= r4) goto L50
            com.google.android.exoplayer2.util.ParsableBitArray r1 = r11.captionChannelPacketData
            r5 = 8
            int r1 = r1.readBits(r5)
            r6 = 16
            r7 = 255(0xff, float:3.57E-43)
            r8 = 159(0x9f, float:2.23E-43)
            r9 = 127(0x7f, float:1.78E-43)
            r10 = 31
            if (r1 == r6) goto Le9
            if (r1 > r10) goto Ld1
            r11.handleC0Command(r1)
            goto Laf
        Ld1:
            if (r1 > r9) goto Ld7
            r11.handleG0Character(r1)
            goto L106
        Ld7:
            if (r1 > r8) goto Ldd
            r11.handleC1Command(r1)
            goto L106
        Ldd:
            if (r1 > r7) goto Le3
            r11.handleG1Character(r1)
            goto L106
        Le3:
            java.lang.String r5 = "Invalid base command: "
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m26m(r5, r1, r3)
            goto Laf
        Le9:
            com.google.android.exoplayer2.util.ParsableBitArray r1 = r11.captionChannelPacketData
            int r1 = r1.readBits(r5)
            if (r1 > r10) goto Lf5
            r11.handleC2Command(r1)
            goto Laf
        Lf5:
            if (r1 > r9) goto Lfb
            r11.handleG2Character(r1)
            goto L106
        Lfb:
            if (r1 > r8) goto L101
            r11.handleC3Command(r1)
            goto Laf
        L101:
            if (r1 > r7) goto L108
            r11.handleG3Character(r1)
        L106:
            r0 = 1
            goto Laf
        L108:
            java.lang.String r5 = "Invalid extended command: "
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m26m(r5, r1, r3)
            goto Laf
        L10e:
            if (r0 == 0) goto L116
            java.util.List r0 = r11.getDisplayCues()
            r11.cues = r0
        L116:
            return
    }

    private void resetCueBuilders() {
            r2 = this;
            r0 = 0
        L1:
            r1 = 8
            if (r0 >= r1) goto Lf
            com.google.android.exoplayer2.text.cea.Cea708Decoder$CueInfoBuilder[] r1 = r2.cueInfoBuilders
            r1 = r1[r0]
            r1.reset()
            int r0 = r0 + 1
            goto L1
        Lf:
            return
    }

    @Override // com.google.android.exoplayer2.text.cea.CeaDecoder
    public final com.google.android.exoplayer2.text.Subtitle createSubtitle() {
            r2 = this;
            java.util.List<com.google.android.exoplayer2.text.Cue> r0 = r2.cues
            r2.lastCues = r0
            com.google.android.exoplayer2.text.cea.CeaSubtitle r1 = new com.google.android.exoplayer2.text.cea.CeaSubtitle
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            java.util.List r0 = (java.util.List) r0
            r1.<init>(r0)
            return r1
    }

    @Override // com.google.android.exoplayer2.text.cea.CeaDecoder
    public final void decode(com.google.android.exoplayer2.text.SubtitleInputBuffer r8) {
            r7 = this;
            java.nio.ByteBuffer r8 = r8.data
            java.lang.Object r8 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r8)
            java.nio.ByteBuffer r8 = (java.nio.ByteBuffer) r8
            byte[] r0 = r8.array()
            com.google.android.exoplayer2.util.ParsableByteArray r1 = r7.ccData
            int r8 = r8.limit()
            r1.reset(r0, r8)
        L15:
            com.google.android.exoplayer2.util.ParsableByteArray r8 = r7.ccData
            int r8 = r8.bytesLeft()
            r0 = 3
            if (r8 < r0) goto Lc5
            com.google.android.exoplayer2.util.ParsableByteArray r8 = r7.ccData
            int r8 = r8.readUnsignedByte()
            r8 = r8 & 7
            r1 = r8 & 3
            r2 = 4
            r8 = r8 & r2
            r3 = 0
            if (r8 != r2) goto L2f
            r8 = 1
            goto L30
        L2f:
            r8 = 0
        L30:
            com.google.android.exoplayer2.util.ParsableByteArray r4 = r7.ccData
            int r4 = r4.readUnsignedByte()
            byte r4 = (byte) r4
            com.google.android.exoplayer2.util.ParsableByteArray r5 = r7.ccData
            int r5 = r5.readUnsignedByte()
            byte r5 = (byte) r5
            r6 = 2
            if (r1 == r6) goto L44
            if (r1 == r0) goto L44
            goto L15
        L44:
            if (r8 != 0) goto L47
            goto L15
        L47:
            java.lang.String r8 = "Cea708Decoder"
            if (r1 != r0) goto L93
            r7.finalizeCurrentPacket()
            r0 = r4 & 192(0xc0, float:2.69E-43)
            int r0 = r0 >> 6
            int r1 = r7.previousSequenceNumber
            r3 = -1
            if (r1 == r3) goto L79
            int r1 = r1 + 1
            int r1 = r1 % r2
            if (r0 == r1) goto L79
            r7.resetCueBuilders()
            java.lang.String r1 = "Sequence number discontinuity. previous="
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
            int r2 = r7.previousSequenceNumber
            r1.append(r2)
            java.lang.String r2 = " current="
            r1.append(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            com.google.android.exoplayer2.util.Log.w(r8, r1)
        L79:
            r7.previousSequenceNumber = r0
            r8 = r4 & 63
            if (r8 != 0) goto L81
            r8 = 64
        L81:
            com.google.android.exoplayer2.text.cea.Cea708Decoder$DtvCcPacket r1 = new com.google.android.exoplayer2.text.cea.Cea708Decoder$DtvCcPacket
            r1.<init>(r0, r8)
            r7.currentDtvCcPacket = r1
            byte[] r8 = r1.packetData
            int r0 = r1.currentIndex
            int r2 = r0 + 1
            r1.currentIndex = r2
            r8[r0] = r5
            goto Lb4
        L93:
            if (r1 != r6) goto L96
            r3 = 1
        L96:
            com.google.android.exoplayer2.util.Assertions.checkArgument(r3)
            com.google.android.exoplayer2.text.cea.Cea708Decoder$DtvCcPacket r0 = r7.currentDtvCcPacket
            if (r0 != 0) goto La4
            java.lang.String r0 = "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START"
            com.google.android.exoplayer2.util.Log.e(r8, r0)
            goto L15
        La4:
            byte[] r8 = r0.packetData
            int r1 = r0.currentIndex
            int r2 = r1 + 1
            r0.currentIndex = r2
            r8[r1] = r4
            int r1 = r2 + 1
            r0.currentIndex = r1
            r8[r2] = r5
        Lb4:
            com.google.android.exoplayer2.text.cea.Cea708Decoder$DtvCcPacket r8 = r7.currentDtvCcPacket
            int r0 = r8.currentIndex
            int r8 = r8.packetSize
            int r8 = r8 * 2
            int r8 = r8 + (-1)
            if (r0 != r8) goto L15
            r7.finalizeCurrentPacket()
            goto L15
        Lc5:
            return
    }

    @Override // com.google.android.exoplayer2.text.cea.CeaDecoder, com.google.android.exoplayer2.decoder.Decoder
    @androidx.annotation.Nullable
    public /* bridge */ /* synthetic */ com.google.android.exoplayer2.text.SubtitleInputBuffer dequeueInputBuffer() throws com.google.android.exoplayer2.text.SubtitleDecoderException {
            r1 = this;
            com.google.android.exoplayer2.text.SubtitleInputBuffer r0 = super.dequeueInputBuffer()
            return r0
    }

    @Override // com.google.android.exoplayer2.text.cea.CeaDecoder, com.google.android.exoplayer2.decoder.Decoder
    @androidx.annotation.Nullable
    public /* bridge */ /* synthetic */ com.google.android.exoplayer2.text.SubtitleOutputBuffer dequeueOutputBuffer() throws com.google.android.exoplayer2.text.SubtitleDecoderException {
            r1 = this;
            com.google.android.exoplayer2.text.SubtitleOutputBuffer r0 = super.dequeueOutputBuffer()
            return r0
    }

    @Override // com.google.android.exoplayer2.text.cea.CeaDecoder, com.google.android.exoplayer2.decoder.Decoder
    public void flush() {
            r3 = this;
            super.flush()
            r0 = 0
            r3.cues = r0
            r3.lastCues = r0
            r1 = 0
            r3.currentWindow = r1
            com.google.android.exoplayer2.text.cea.Cea708Decoder$CueInfoBuilder[] r2 = r3.cueInfoBuilders
            r1 = r2[r1]
            r3.currentCueInfoBuilder = r1
            r3.resetCueBuilders()
            r3.currentDtvCcPacket = r0
            return
    }

    @Override // com.google.android.exoplayer2.text.cea.CeaDecoder, com.google.android.exoplayer2.decoder.Decoder
    public java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = "Cea708Decoder"
            return r0
    }

    @Override // com.google.android.exoplayer2.text.cea.CeaDecoder
    public final boolean isNewSubtitleDataAvailable() {
            r2 = this;
            java.util.List<com.google.android.exoplayer2.text.Cue> r0 = r2.cues
            java.util.List<com.google.android.exoplayer2.text.Cue> r1 = r2.lastCues
            if (r0 == r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    @Override // com.google.android.exoplayer2.text.cea.CeaDecoder
    public /* bridge */ /* synthetic */ void queueInputBuffer(com.google.android.exoplayer2.text.SubtitleInputBuffer r1) throws com.google.android.exoplayer2.text.SubtitleDecoderException {
            r0 = this;
            super.queueInputBuffer(r1)
            return
    }

    @Override // com.google.android.exoplayer2.text.cea.CeaDecoder, com.google.android.exoplayer2.decoder.Decoder
    public /* bridge */ /* synthetic */ void release() {
            r0 = this;
            super.release()
            return
    }

    @Override // com.google.android.exoplayer2.text.cea.CeaDecoder, com.google.android.exoplayer2.text.SubtitleDecoder
    public /* bridge */ /* synthetic */ void setPositionUs(long r1) {
            r0 = this;
            super.setPositionUs(r1)
            return
    }
}
