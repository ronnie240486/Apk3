package com.google.android.exoplayer2.text.cea;

/* JADX INFO: loaded from: classes2.dex */
public final class Cea608Decoder extends com.google.android.exoplayer2.text.cea.CeaDecoder {
    private static final int[] BASIC_CHARACTER_SET = null;
    private static final int CC_FIELD_FLAG = 1;
    private static final byte CC_IMPLICIT_DATA_HEADER = -4;
    private static final int CC_MODE_PAINT_ON = 3;
    private static final int CC_MODE_POP_ON = 2;
    private static final int CC_MODE_ROLL_UP = 1;
    private static final int CC_MODE_UNKNOWN = 0;
    private static final int CC_TYPE_FLAG = 2;
    private static final int CC_VALID_FLAG = 4;
    private static final int[] COLUMN_INDICES = null;
    private static final byte CTRL_BACKSPACE = 33;
    private static final byte CTRL_CARRIAGE_RETURN = 45;
    private static final byte CTRL_DELETE_TO_END_OF_ROW = 36;
    private static final byte CTRL_END_OF_CAPTION = 47;
    private static final byte CTRL_ERASE_DISPLAYED_MEMORY = 44;
    private static final byte CTRL_ERASE_NON_DISPLAYED_MEMORY = 46;
    private static final byte CTRL_RESUME_CAPTION_LOADING = 32;
    private static final byte CTRL_RESUME_DIRECT_CAPTIONING = 41;
    private static final byte CTRL_RESUME_TEXT_DISPLAY = 43;
    private static final byte CTRL_ROLL_UP_CAPTIONS_2_ROWS = 37;
    private static final byte CTRL_ROLL_UP_CAPTIONS_3_ROWS = 38;
    private static final byte CTRL_ROLL_UP_CAPTIONS_4_ROWS = 39;
    private static final byte CTRL_TEXT_RESTART = 42;
    private static final int DEFAULT_CAPTIONS_ROW_COUNT = 4;
    public static final long MIN_DATA_CHANNEL_TIMEOUT_MS = 16000;
    private static final int NTSC_CC_CHANNEL_1 = 0;
    private static final int NTSC_CC_CHANNEL_2 = 1;
    private static final int NTSC_CC_FIELD_1 = 0;
    private static final int NTSC_CC_FIELD_2 = 1;
    private static final boolean[] ODD_PARITY_BYTE_TABLE = null;
    private static final int[] ROW_INDICES = null;
    private static final int[] SPECIAL_CHARACTER_SET = null;
    private static final int[] SPECIAL_ES_FR_CHARACTER_SET = null;
    private static final int[] SPECIAL_PT_DE_CHARACTER_SET = null;
    private static final int[] STYLE_COLORS = null;
    private static final int STYLE_ITALICS = 7;
    private static final int STYLE_UNCHANGED = 8;
    private static final java.lang.String TAG = "Cea608Decoder";
    private int captionMode;
    private int captionRowCount;
    private final com.google.android.exoplayer2.util.ParsableByteArray ccData;
    private final java.util.ArrayList<com.google.android.exoplayer2.text.cea.Cea608Decoder.CueBuilder> cueBuilders;

    @androidx.annotation.Nullable
    private java.util.List<com.google.android.exoplayer2.text.Cue> cues;
    private int currentChannel;
    private com.google.android.exoplayer2.text.cea.Cea608Decoder.CueBuilder currentCueBuilder;
    private boolean isCaptionValid;
    private boolean isInCaptionService;
    private long lastCueUpdateUs;

    @androidx.annotation.Nullable
    private java.util.List<com.google.android.exoplayer2.text.Cue> lastCues;
    private final int packetLength;
    private byte repeatableControlCc1;
    private byte repeatableControlCc2;
    private boolean repeatableControlSet;
    private final int selectedChannel;
    private final int selectedField;
    private final long validDataChannelTimeoutUs;

    public static final class CueBuilder {
        private static final int BASE_ROW = 15;
        private static final int SCREEN_CHARWIDTH = 32;
        private int captionMode;
        private int captionRowCount;
        private final java.lang.StringBuilder captionStringBuilder;
        private final java.util.List<com.google.android.exoplayer2.text.cea.Cea608Decoder.CueBuilder.CueStyle> cueStyles;
        private int indent;
        private final java.util.List<android.text.SpannableString> rolledUpCaptions;
        private int row;
        private int tabOffset;

        public static class CueStyle {
            public int start;
            public final int style;
            public final boolean underline;

            public CueStyle(int r1, boolean r2, int r3) {
                    r0 = this;
                    r0.<init>()
                    r0.style = r1
                    r0.underline = r2
                    r0.start = r3
                    return
            }
        }

        public CueBuilder(int r2, int r3) {
                r1 = this;
                r1.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.cueStyles = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.rolledUpCaptions = r0
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r1.captionStringBuilder = r0
                r1.reset(r2)
                r1.captionRowCount = r3
                return
        }

        public static /* synthetic */ int access$002(com.google.android.exoplayer2.text.cea.Cea608Decoder.CueBuilder r0, int r1) {
                r0.tabOffset = r1
                return r1
        }

        public static /* synthetic */ int access$100(com.google.android.exoplayer2.text.cea.Cea608Decoder.CueBuilder r0) {
                int r0 = r0.row
                return r0
        }

        public static /* synthetic */ int access$102(com.google.android.exoplayer2.text.cea.Cea608Decoder.CueBuilder r0, int r1) {
                r0.row = r1
                return r1
        }

        public static /* synthetic */ int access$202(com.google.android.exoplayer2.text.cea.Cea608Decoder.CueBuilder r0, int r1) {
                r0.indent = r1
                return r1
        }

        private android.text.SpannableString buildCurrentLine() {
                r15 = this;
                android.text.SpannableStringBuilder r0 = new android.text.SpannableStringBuilder
                java.lang.StringBuilder r1 = r15.captionStringBuilder
                r0.<init>(r1)
                int r1 = r0.length()
                r2 = 0
                r3 = -1
                r4 = 0
                r5 = -1
                r6 = -1
                r7 = 0
                r8 = -1
                r9 = -1
                r10 = 0
            L14:
                java.util.List<com.google.android.exoplayer2.text.cea.Cea608Decoder$CueBuilder$CueStyle> r11 = r15.cueStyles
                int r11 = r11.size()
                if (r4 >= r11) goto L7b
                java.util.List<com.google.android.exoplayer2.text.cea.Cea608Decoder$CueBuilder$CueStyle> r11 = r15.cueStyles
                java.lang.Object r11 = r11.get(r4)
                com.google.android.exoplayer2.text.cea.Cea608Decoder$CueBuilder$CueStyle r11 = (com.google.android.exoplayer2.text.cea.Cea608Decoder.CueBuilder.CueStyle) r11
                boolean r12 = r11.underline
                int r13 = r11.style
                r14 = 8
                if (r13 == r14) goto L3c
                r10 = 7
                if (r13 != r10) goto L31
                r14 = 1
                goto L32
            L31:
                r14 = 0
            L32:
                if (r13 != r10) goto L35
                goto L3b
            L35:
                int[] r9 = com.google.android.exoplayer2.text.cea.Cea608Decoder.access$300()
                r9 = r9[r13]
            L3b:
                r10 = r14
            L3c:
                int r11 = r11.start
                int r4 = r4 + 1
                java.util.List<com.google.android.exoplayer2.text.cea.Cea608Decoder$CueBuilder$CueStyle> r13 = r15.cueStyles
                int r13 = r13.size()
                if (r4 >= r13) goto L53
                java.util.List<com.google.android.exoplayer2.text.cea.Cea608Decoder$CueBuilder$CueStyle> r13 = r15.cueStyles
                java.lang.Object r13 = r13.get(r4)
                com.google.android.exoplayer2.text.cea.Cea608Decoder$CueBuilder$CueStyle r13 = (com.google.android.exoplayer2.text.cea.Cea608Decoder.CueBuilder.CueStyle) r13
                int r13 = r13.start
                goto L54
            L53:
                r13 = r1
            L54:
                if (r11 != r13) goto L57
                goto L14
            L57:
                if (r5 == r3) goto L60
                if (r12 != 0) goto L60
                setUnderlineSpan(r0, r5, r11)
                r5 = -1
                goto L65
            L60:
                if (r5 != r3) goto L65
                if (r12 == 0) goto L65
                r5 = r11
            L65:
                if (r6 == r3) goto L6e
                if (r10 != 0) goto L6e
                setItalicSpan(r0, r6, r11)
                r6 = -1
                goto L73
            L6e:
                if (r6 != r3) goto L73
                if (r10 == 0) goto L73
                r6 = r11
            L73:
                if (r9 == r8) goto L14
                setColorSpan(r0, r7, r11, r8)
                r8 = r9
                r7 = r11
                goto L14
            L7b:
                if (r5 == r3) goto L82
                if (r5 == r1) goto L82
                setUnderlineSpan(r0, r5, r1)
            L82:
                if (r6 == r3) goto L89
                if (r6 == r1) goto L89
                setItalicSpan(r0, r6, r1)
            L89:
                if (r7 == r1) goto L8e
                setColorSpan(r0, r7, r1, r8)
            L8e:
                android.text.SpannableString r1 = new android.text.SpannableString
                r1.<init>(r0)
                return r1
        }

        private static void setColorSpan(android.text.SpannableStringBuilder r1, int r2, int r3, int r4) {
                r0 = -1
                if (r4 != r0) goto L4
                return
            L4:
                android.text.style.ForegroundColorSpan r0 = new android.text.style.ForegroundColorSpan
                r0.<init>(r4)
                r4 = 33
                r1.setSpan(r0, r2, r3, r4)
                return
        }

        private static void setItalicSpan(android.text.SpannableStringBuilder r2, int r3, int r4) {
                android.text.style.StyleSpan r0 = new android.text.style.StyleSpan
                r1 = 2
                r0.<init>(r1)
                r1 = 33
                r2.setSpan(r0, r3, r4, r1)
                return
        }

        private static void setUnderlineSpan(android.text.SpannableStringBuilder r2, int r3, int r4) {
                android.text.style.UnderlineSpan r0 = new android.text.style.UnderlineSpan
                r0.<init>()
                r1 = 33
                r2.setSpan(r0, r3, r4, r1)
                return
        }

        public void append(char r3) {
                r2 = this;
                java.lang.StringBuilder r0 = r2.captionStringBuilder
                int r0 = r0.length()
                r1 = 32
                if (r0 >= r1) goto Lf
                java.lang.StringBuilder r0 = r2.captionStringBuilder
                r0.append(r3)
            Lf:
                return
        }

        public void backspace() {
                r4 = this;
                java.lang.StringBuilder r0 = r4.captionStringBuilder
                int r0 = r0.length()
                if (r0 <= 0) goto L2c
                java.lang.StringBuilder r1 = r4.captionStringBuilder
                int r2 = r0 + (-1)
                r1.delete(r2, r0)
                java.util.List<com.google.android.exoplayer2.text.cea.Cea608Decoder$CueBuilder$CueStyle> r1 = r4.cueStyles
                int r1 = r1.size()
                int r1 = r1 + (-1)
            L17:
                if (r1 < 0) goto L2c
                java.util.List<com.google.android.exoplayer2.text.cea.Cea608Decoder$CueBuilder$CueStyle> r2 = r4.cueStyles
                java.lang.Object r2 = r2.get(r1)
                com.google.android.exoplayer2.text.cea.Cea608Decoder$CueBuilder$CueStyle r2 = (com.google.android.exoplayer2.text.cea.Cea608Decoder.CueBuilder.CueStyle) r2
                int r3 = r2.start
                if (r3 != r0) goto L2c
                int r3 = r3 + (-1)
                r2.start = r3
                int r1 = r1 + (-1)
                goto L17
            L2c:
                return
        }

        @androidx.annotation.Nullable
        public com.google.android.exoplayer2.text.Cue build(int r9) {
                r8 = this;
                int r0 = r8.indent
                int r1 = r8.tabOffset
                int r0 = r0 + r1
                int r1 = 32 - r0
                android.text.SpannableStringBuilder r2 = new android.text.SpannableStringBuilder
                r2.<init>()
                r3 = 0
                r4 = 0
            Le:
                java.util.List<android.text.SpannableString> r5 = r8.rolledUpCaptions
                int r5 = r5.size()
                if (r4 >= r5) goto L2d
                java.util.List<android.text.SpannableString> r5 = r8.rolledUpCaptions
                java.lang.Object r5 = r5.get(r4)
                java.lang.CharSequence r5 = (java.lang.CharSequence) r5
                java.lang.CharSequence r5 = com.google.android.exoplayer2.util.Util.truncateAscii(r5, r1)
                r2.append(r5)
                r5 = 10
                r2.append(r5)
                int r4 = r4 + 1
                goto Le
            L2d:
                android.text.SpannableString r4 = r8.buildCurrentLine()
                java.lang.CharSequence r4 = com.google.android.exoplayer2.util.Util.truncateAscii(r4, r1)
                r2.append(r4)
                int r4 = r2.length()
                if (r4 != 0) goto L40
                r9 = 0
                return r9
            L40:
                int r4 = r2.length()
                int r1 = r1 - r4
                int r4 = r0 - r1
                r5 = -2147483648(0xffffffff80000000, float:-0.0)
                r6 = 2
                r7 = 1
                if (r9 == r5) goto L4e
                goto L66
            L4e:
                int r9 = r8.captionMode
                if (r9 != r6) goto L5d
                int r9 = java.lang.Math.abs(r4)
                r5 = 3
                if (r9 < r5) goto L5b
                if (r1 >= 0) goto L5d
            L5b:
                r9 = 1
                goto L66
            L5d:
                int r9 = r8.captionMode
                if (r9 != r6) goto L65
                if (r4 <= 0) goto L65
                r9 = 2
                goto L66
            L65:
                r9 = 0
            L66:
                if (r9 == r7) goto L7b
                r3 = 1036831949(0x3dcccccd, float:0.1)
                r4 = 1061997773(0x3f4ccccd, float:0.8)
                r5 = 1107296256(0x42000000, float:32.0)
                if (r9 == r6) goto L78
            L72:
                float r0 = (float) r0
                float r0 = r0 / r5
                float r0 = r0 * r4
                float r0 = r0 + r3
                goto L7d
            L78:
                int r0 = 32 - r1
                goto L72
            L7b:
                r0 = 1056964608(0x3f000000, float:0.5)
            L7d:
                int r1 = r8.row
                r3 = 7
                if (r1 <= r3) goto L87
                int r1 = r1 + (-15)
                int r1 = r1 + (-2)
                goto L8f
            L87:
                int r3 = r8.captionMode
                if (r3 != r7) goto L8f
                int r3 = r8.captionRowCount
                int r3 = r3 - r7
                int r1 = r1 - r3
            L8f:
                com.google.android.exoplayer2.text.Cue$Builder r3 = new com.google.android.exoplayer2.text.Cue$Builder
                r3.<init>()
                com.google.android.exoplayer2.text.Cue$Builder r2 = r3.setText(r2)
                android.text.Layout$Alignment r3 = android.text.Layout.Alignment.ALIGN_NORMAL
                com.google.android.exoplayer2.text.Cue$Builder r2 = r2.setTextAlignment(r3)
                float r1 = (float) r1
                com.google.android.exoplayer2.text.Cue$Builder r1 = r2.setLine(r1, r7)
                com.google.android.exoplayer2.text.Cue$Builder r0 = r1.setPosition(r0)
                com.google.android.exoplayer2.text.Cue$Builder r9 = r0.setPositionAnchor(r9)
                com.google.android.exoplayer2.text.Cue r9 = r9.build()
                return r9
        }

        public boolean isEmpty() {
                r1 = this;
                java.util.List<com.google.android.exoplayer2.text.cea.Cea608Decoder$CueBuilder$CueStyle> r0 = r1.cueStyles
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto L1a
                java.util.List<android.text.SpannableString> r0 = r1.rolledUpCaptions
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto L1a
                java.lang.StringBuilder r0 = r1.captionStringBuilder
                int r0 = r0.length()
                if (r0 != 0) goto L1a
                r0 = 1
                goto L1b
            L1a:
                r0 = 0
            L1b:
                return r0
        }

        public void reset(int r2) {
                r1 = this;
                r1.captionMode = r2
                java.util.List<com.google.android.exoplayer2.text.cea.Cea608Decoder$CueBuilder$CueStyle> r2 = r1.cueStyles
                r2.clear()
                java.util.List<android.text.SpannableString> r2 = r1.rolledUpCaptions
                r2.clear()
                java.lang.StringBuilder r2 = r1.captionStringBuilder
                r0 = 0
                r2.setLength(r0)
                r2 = 15
                r1.row = r2
                r1.indent = r0
                r1.tabOffset = r0
                return
        }

        public void rollUp() {
                r3 = this;
                java.util.List<android.text.SpannableString> r0 = r3.rolledUpCaptions
                android.text.SpannableString r1 = r3.buildCurrentLine()
                r0.add(r1)
                java.lang.StringBuilder r0 = r3.captionStringBuilder
                r1 = 0
                r0.setLength(r1)
                java.util.List<com.google.android.exoplayer2.text.cea.Cea608Decoder$CueBuilder$CueStyle> r0 = r3.cueStyles
                r0.clear()
                int r0 = r3.captionRowCount
                int r2 = r3.row
                int r0 = java.lang.Math.min(r0, r2)
            L1c:
                java.util.List<android.text.SpannableString> r2 = r3.rolledUpCaptions
                int r2 = r2.size()
                if (r2 < r0) goto L2a
                java.util.List<android.text.SpannableString> r2 = r3.rolledUpCaptions
                r2.remove(r1)
                goto L1c
            L2a:
                return
        }

        public void setCaptionMode(int r1) {
                r0 = this;
                r0.captionMode = r1
                return
        }

        public void setCaptionRowCount(int r1) {
                r0 = this;
                r0.captionRowCount = r1
                return
        }

        public void setStyle(int r4, boolean r5) {
                r3 = this;
                java.util.List<com.google.android.exoplayer2.text.cea.Cea608Decoder$CueBuilder$CueStyle> r0 = r3.cueStyles
                com.google.android.exoplayer2.text.cea.Cea608Decoder$CueBuilder$CueStyle r1 = new com.google.android.exoplayer2.text.cea.Cea608Decoder$CueBuilder$CueStyle
                java.lang.StringBuilder r2 = r3.captionStringBuilder
                int r2 = r2.length()
                r1.<init>(r4, r5, r2)
                r0.add(r1)
                return
        }
    }

    static {
            r0 = 8
            int[] r1 = new int[r0]
            r1 = {x0044: FILL_ARRAY_DATA , data: [11, 1, 3, 12, 14, 5, 7, 9} // fill-array
            com.google.android.exoplayer2.text.cea.Cea608Decoder.ROW_INDICES = r1
            int[] r0 = new int[r0]
            r0 = {x0058: FILL_ARRAY_DATA , data: [0, 4, 8, 12, 16, 20, 24, 28} // fill-array
            com.google.android.exoplayer2.text.cea.Cea608Decoder.COLUMN_INDICES = r0
            r0 = 7
            int[] r0 = new int[r0]
            r0 = {x006c: FILL_ARRAY_DATA , data: [-1, -16711936, -16776961, -16711681, -65536, -256, -65281} // fill-array
            com.google.android.exoplayer2.text.cea.Cea608Decoder.STYLE_COLORS = r0
            r0 = 96
            int[] r0 = new int[r0]
            r0 = {x007e: FILL_ARRAY_DATA , data: [32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632} // fill-array
            com.google.android.exoplayer2.text.cea.Cea608Decoder.BASIC_CHARACTER_SET = r0
            r0 = 16
            int[] r0 = new int[r0]
            r0 = {x0142: FILL_ARRAY_DATA , data: [174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251} // fill-array
            com.google.android.exoplayer2.text.cea.Cea608Decoder.SPECIAL_CHARACTER_SET = r0
            r0 = 32
            int[] r1 = new int[r0]
            r1 = {x0166: FILL_ARRAY_DATA , data: [193, 201, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 202, 203, 235, 206, 207, 239, 212, 217, 249, 219, 171, 187} // fill-array
            com.google.android.exoplayer2.text.cea.Cea608Decoder.SPECIAL_ES_FR_CHARACTER_SET = r1
            int[] r0 = new int[r0]
            r0 = {x01aa: FILL_ARRAY_DATA , data: [195, 227, 205, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496} // fill-array
            com.google.android.exoplayer2.text.cea.Cea608Decoder.SPECIAL_PT_DE_CHARACTER_SET = r0
            r0 = 256(0x100, float:3.59E-43)
            boolean[] r0 = new boolean[r0]
            r0 = {x01ee: FILL_ARRAY_DATA , data: [0, 1, 1, 0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 1, 0, 1, 0, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 1, 0, 0, 1, 0, 1, 1, 0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 1, 0, 1, 0, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 1, 0, 0, 1, 0, 1, 1, 0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 1, 0, 1, 0, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 1, 0, 0, 1, 0, 1, 1, 0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 1, 0, 1, 0, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 1, 0, 0, 1, 0, 1, 1, 0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 1, 0, 1, 0, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 1, 0, 0, 1, 0, 1, 1, 0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 1, 0} // fill-array
            com.google.android.exoplayer2.text.cea.Cea608Decoder.ODD_PARITY_BYTE_TABLE = r0
            return
    }

    public Cea608Decoder(java.lang.String r8, int r9, long r10) {
            r7 = this;
            r7.<init>()
            com.google.android.exoplayer2.util.ParsableByteArray r0 = new com.google.android.exoplayer2.util.ParsableByteArray
            r0.<init>()
            r7.ccData = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r7.cueBuilders = r0
            com.google.android.exoplayer2.text.cea.Cea608Decoder$CueBuilder r0 = new com.google.android.exoplayer2.text.cea.Cea608Decoder$CueBuilder
            r1 = 0
            r2 = 4
            r0.<init>(r1, r2)
            r7.currentCueBuilder = r0
            r7.currentChannel = r1
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = 0
            int r0 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r0 <= 0) goto L2c
            r5 = 1000(0x3e8, double:4.94E-321)
            long r10 = r10 * r5
            goto L2d
        L2c:
            r10 = r3
        L2d:
            r7.validDataChannelTimeoutUs = r10
            java.lang.String r10 = "application/x-mp4-cea-608"
            boolean r8 = r10.equals(r8)
            r10 = 2
            r11 = 3
            if (r8 == 0) goto L3b
            r8 = 2
            goto L3c
        L3b:
            r8 = 3
        L3c:
            r7.packetLength = r8
            r8 = 1
            if (r9 == r8) goto L62
            if (r9 == r10) goto L5d
            if (r9 == r11) goto L58
            if (r9 == r2) goto L53
            java.lang.String r9 = "Cea608Decoder"
            java.lang.String r10 = "Invalid channel. Defaulting to CC1."
            com.google.android.exoplayer2.util.Log.w(r9, r10)
            r7.selectedChannel = r1
            r7.selectedField = r1
            goto L66
        L53:
            r7.selectedChannel = r8
            r7.selectedField = r8
            goto L66
        L58:
            r7.selectedChannel = r1
            r7.selectedField = r8
            goto L66
        L5d:
            r7.selectedChannel = r8
            r7.selectedField = r1
            goto L66
        L62:
            r7.selectedChannel = r1
            r7.selectedField = r1
        L66:
            r7.setCaptionMode(r1)
            r7.resetCueBuilders()
            r7.isInCaptionService = r8
            r7.lastCueUpdateUs = r3
            return
    }

    public static /* synthetic */ int[] access$300() {
            int[] r0 = com.google.android.exoplayer2.text.cea.Cea608Decoder.STYLE_COLORS
            return r0
    }

    private static char getBasicChar(byte r1) {
            r1 = r1 & 127(0x7f, float:1.78E-43)
            int r1 = r1 + (-32)
            int[] r0 = com.google.android.exoplayer2.text.cea.Cea608Decoder.BASIC_CHARACTER_SET
            r1 = r0[r1]
            char r1 = (char) r1
            return r1
    }

    private static int getChannel(byte r0) {
            int r0 = r0 >> 3
            r0 = r0 & 1
            return r0
    }

    private java.util.List<com.google.android.exoplayer2.text.Cue> getDisplayCues() {
            r7 = this;
            java.util.ArrayList<com.google.android.exoplayer2.text.cea.Cea608Decoder$CueBuilder> r0 = r7.cueBuilders
            int r0 = r0.size()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            r2 = 0
            r3 = 2
            r4 = 0
        Le:
            if (r4 >= r0) goto L2c
            java.util.ArrayList<com.google.android.exoplayer2.text.cea.Cea608Decoder$CueBuilder> r5 = r7.cueBuilders
            java.lang.Object r5 = r5.get(r4)
            com.google.android.exoplayer2.text.cea.Cea608Decoder$CueBuilder r5 = (com.google.android.exoplayer2.text.cea.Cea608Decoder.CueBuilder) r5
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            com.google.android.exoplayer2.text.Cue r5 = r5.build(r6)
            r1.add(r5)
            if (r5 == 0) goto L29
            int r5 = r5.positionAnchor
            int r3 = java.lang.Math.min(r3, r5)
        L29:
            int r4 = r4 + 1
            goto Le
        L2c:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r0)
        L31:
            if (r2 >= r0) goto L57
            java.lang.Object r5 = r1.get(r2)
            com.google.android.exoplayer2.text.Cue r5 = (com.google.android.exoplayer2.text.Cue) r5
            if (r5 == 0) goto L54
            int r6 = r5.positionAnchor
            if (r6 == r3) goto L51
            java.util.ArrayList<com.google.android.exoplayer2.text.cea.Cea608Decoder$CueBuilder> r5 = r7.cueBuilders
            java.lang.Object r5 = r5.get(r2)
            com.google.android.exoplayer2.text.cea.Cea608Decoder$CueBuilder r5 = (com.google.android.exoplayer2.text.cea.Cea608Decoder.CueBuilder) r5
            com.google.android.exoplayer2.text.Cue r5 = r5.build(r3)
            java.lang.Object r5 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r5)
            com.google.android.exoplayer2.text.Cue r5 = (com.google.android.exoplayer2.text.Cue) r5
        L51:
            r4.add(r5)
        L54:
            int r2 = r2 + 1
            goto L31
        L57:
            return r4
    }

    private static char getExtendedEsFrChar(byte r1) {
            r1 = r1 & 31
            int[] r0 = com.google.android.exoplayer2.text.cea.Cea608Decoder.SPECIAL_ES_FR_CHARACTER_SET
            r1 = r0[r1]
            char r1 = (char) r1
            return r1
    }

    private static char getExtendedPtDeChar(byte r1) {
            r1 = r1 & 31
            int[] r0 = com.google.android.exoplayer2.text.cea.Cea608Decoder.SPECIAL_PT_DE_CHARACTER_SET
            r1 = r0[r1]
            char r1 = (char) r1
            return r1
    }

    private static char getExtendedWestEuropeanChar(byte r0, byte r1) {
            r0 = r0 & 1
            if (r0 != 0) goto L9
            char r0 = getExtendedEsFrChar(r1)
            return r0
        L9:
            char r0 = getExtendedPtDeChar(r1)
            return r0
    }

    private static char getSpecialNorthAmericanChar(byte r1) {
            r1 = r1 & 15
            int[] r0 = com.google.android.exoplayer2.text.cea.Cea608Decoder.SPECIAL_CHARACTER_SET
            r1 = r0[r1]
            char r1 = (char) r1
            return r1
    }

    private void handleMidrowCtrl(byte r3) {
            r2 = this;
            com.google.android.exoplayer2.text.cea.Cea608Decoder$CueBuilder r0 = r2.currentCueBuilder
            r1 = 32
            r0.append(r1)
            r0 = r3 & 1
            r1 = 1
            if (r0 != r1) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            int r3 = r3 >> r1
            r3 = r3 & 7
            com.google.android.exoplayer2.text.cea.Cea608Decoder$CueBuilder r1 = r2.currentCueBuilder
            r1.setStyle(r3, r0)
            return
    }

    private void handleMiscCode(byte r5) {
            r4 = this;
            r0 = 32
            r1 = 2
            if (r5 == r0) goto L69
            r0 = 41
            r2 = 3
            if (r5 == r0) goto L65
            r0 = 1
            switch(r5) {
                case 37: goto L5e;
                case 38: goto L57;
                case 39: goto L4f;
                default: goto Le;
            }
        Le:
            int r1 = r4.captionMode
            if (r1 != 0) goto L13
            return
        L13:
            r3 = 33
            if (r5 == r3) goto L49
            switch(r5) {
                case 44: goto L39;
                case 45: goto L29;
                case 46: goto L25;
                case 47: goto L1b;
                default: goto L1a;
            }
        L1a:
            goto L4e
        L1b:
            java.util.List r5 = r4.getDisplayCues()
            r4.cues = r5
            r4.resetCueBuilders()
            goto L4e
        L25:
            r4.resetCueBuilders()
            goto L4e
        L29:
            if (r1 != r0) goto L4e
            com.google.android.exoplayer2.text.cea.Cea608Decoder$CueBuilder r5 = r4.currentCueBuilder
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L4e
            com.google.android.exoplayer2.text.cea.Cea608Decoder$CueBuilder r5 = r4.currentCueBuilder
            r5.rollUp()
            goto L4e
        L39:
            java.util.List r5 = java.util.Collections.emptyList()
            r4.cues = r5
            int r5 = r4.captionMode
            if (r5 == r0) goto L45
            if (r5 != r2) goto L4e
        L45:
            r4.resetCueBuilders()
            goto L4e
        L49:
            com.google.android.exoplayer2.text.cea.Cea608Decoder$CueBuilder r5 = r4.currentCueBuilder
            r5.backspace()
        L4e:
            return
        L4f:
            r4.setCaptionMode(r0)
            r5 = 4
            r4.setCaptionRowCount(r5)
            return
        L57:
            r4.setCaptionMode(r0)
            r4.setCaptionRowCount(r2)
            return
        L5e:
            r4.setCaptionMode(r0)
            r4.setCaptionRowCount(r1)
            return
        L65:
            r4.setCaptionMode(r2)
            return
        L69:
            r4.setCaptionMode(r1)
            return
    }

    private void handlePreambleAddressCode(byte r6, byte r7) {
            r5 = this;
            int[] r0 = com.google.android.exoplayer2.text.cea.Cea608Decoder.ROW_INDICES
            r6 = r6 & 7
            r6 = r0[r6]
            r0 = r7 & 32
            r1 = 0
            r2 = 1
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            if (r0 == 0) goto L13
            int r6 = r6 + 1
        L13:
            com.google.android.exoplayer2.text.cea.Cea608Decoder$CueBuilder r0 = r5.currentCueBuilder
            int r0 = com.google.android.exoplayer2.text.cea.Cea608Decoder.CueBuilder.access$100(r0)
            if (r6 == r0) goto L3c
            int r0 = r5.captionMode
            if (r0 == r2) goto L37
            com.google.android.exoplayer2.text.cea.Cea608Decoder$CueBuilder r0 = r5.currentCueBuilder
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L37
            com.google.android.exoplayer2.text.cea.Cea608Decoder$CueBuilder r0 = new com.google.android.exoplayer2.text.cea.Cea608Decoder$CueBuilder
            int r3 = r5.captionMode
            int r4 = r5.captionRowCount
            r0.<init>(r3, r4)
            r5.currentCueBuilder = r0
            java.util.ArrayList<com.google.android.exoplayer2.text.cea.Cea608Decoder$CueBuilder> r3 = r5.cueBuilders
            r3.add(r0)
        L37:
            com.google.android.exoplayer2.text.cea.Cea608Decoder$CueBuilder r0 = r5.currentCueBuilder
            com.google.android.exoplayer2.text.cea.Cea608Decoder.CueBuilder.access$102(r0, r6)
        L3c:
            r6 = r7 & 16
            r0 = 16
            if (r6 != r0) goto L44
            r6 = 1
            goto L45
        L44:
            r6 = 0
        L45:
            r0 = r7 & 1
            if (r0 != r2) goto L4a
            r1 = 1
        L4a:
            int r7 = r7 >> r2
            r7 = r7 & 7
            com.google.android.exoplayer2.text.cea.Cea608Decoder$CueBuilder r0 = r5.currentCueBuilder
            if (r6 == 0) goto L54
            r2 = 8
            goto L55
        L54:
            r2 = r7
        L55:
            r0.setStyle(r2, r1)
            if (r6 == 0) goto L63
            com.google.android.exoplayer2.text.cea.Cea608Decoder$CueBuilder r6 = r5.currentCueBuilder
            int[] r0 = com.google.android.exoplayer2.text.cea.Cea608Decoder.COLUMN_INDICES
            r7 = r0[r7]
            com.google.android.exoplayer2.text.cea.Cea608Decoder.CueBuilder.access$202(r6, r7)
        L63:
            return
    }

    private static boolean isCtrlCode(byte r0) {
            r0 = r0 & 224(0xe0, float:3.14E-43)
            if (r0 != 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    private static boolean isExtendedWestEuropeanChar(byte r1, byte r2) {
            r1 = r1 & 246(0xf6, float:3.45E-43)
            r0 = 18
            if (r1 != r0) goto Le
            r1 = r2 & 224(0xe0, float:3.14E-43)
            r2 = 32
            if (r1 != r2) goto Le
            r1 = 1
            goto Lf
        Le:
            r1 = 0
        Lf:
            return r1
    }

    private static boolean isMidrowCtrlCode(byte r1, byte r2) {
            r1 = r1 & 247(0xf7, float:3.46E-43)
            r0 = 17
            if (r1 != r0) goto Le
            r1 = r2 & 240(0xf0, float:3.36E-43)
            r2 = 32
            if (r1 != r2) goto Le
            r1 = 1
            goto Lf
        Le:
            r1 = 0
        Lf:
            return r1
    }

    private static boolean isMiscCode(byte r1, byte r2) {
            r1 = r1 & 246(0xf6, float:3.45E-43)
            r0 = 20
            if (r1 != r0) goto Le
            r1 = r2 & 240(0xf0, float:3.36E-43)
            r2 = 32
            if (r1 != r2) goto Le
            r1 = 1
            goto Lf
        Le:
            r1 = 0
        Lf:
            return r1
    }

    private static boolean isPreambleAddressCode(byte r1, byte r2) {
            r1 = r1 & 240(0xf0, float:3.36E-43)
            r0 = 16
            if (r1 != r0) goto Le
            r1 = r2 & 192(0xc0, float:2.69E-43)
            r2 = 64
            if (r1 != r2) goto Le
            r1 = 1
            goto Lf
        Le:
            r1 = 0
        Lf:
            return r1
    }

    private static boolean isRepeatable(byte r1) {
            r1 = r1 & 240(0xf0, float:3.36E-43)
            r0 = 16
            if (r1 != r0) goto L8
            r1 = 1
            goto L9
        L8:
            r1 = 0
        L9:
            return r1
    }

    private boolean isRepeatedCommand(boolean r3, byte r4, byte r5) {
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L20
            boolean r3 = isRepeatable(r4)
            if (r3 == 0) goto L20
            boolean r3 = r2.repeatableControlSet
            r1 = 1
            if (r3 == 0) goto L19
            byte r3 = r2.repeatableControlCc1
            if (r3 != r4) goto L19
            byte r3 = r2.repeatableControlCc2
            if (r3 != r5) goto L19
            r2.repeatableControlSet = r0
            return r1
        L19:
            r2.repeatableControlSet = r1
            r2.repeatableControlCc1 = r4
            r2.repeatableControlCc2 = r5
            goto L22
        L20:
            r2.repeatableControlSet = r0
        L22:
            return r0
    }

    private static boolean isServiceSwitchCommand(byte r1) {
            r1 = r1 & 246(0xf6, float:3.45E-43)
            r0 = 20
            if (r1 != r0) goto L8
            r1 = 1
            goto L9
        L8:
            r1 = 0
        L9:
            return r1
    }

    private static boolean isSpecialNorthAmericanChar(byte r1, byte r2) {
            r1 = r1 & 247(0xf7, float:3.46E-43)
            r0 = 17
            if (r1 != r0) goto Le
            r1 = r2 & 240(0xf0, float:3.36E-43)
            r2 = 48
            if (r1 != r2) goto Le
            r1 = 1
            goto Lf
        Le:
            r1 = 0
        Lf:
            return r1
    }

    private static boolean isTabCtrlCode(byte r1, byte r2) {
            r1 = r1 & 247(0xf7, float:3.46E-43)
            r0 = 23
            if (r1 != r0) goto L10
            r1 = 33
            if (r2 < r1) goto L10
            r1 = 35
            if (r2 > r1) goto L10
            r1 = 1
            goto L11
        L10:
            r1 = 0
        L11:
            return r1
    }

    private static boolean isXdsControlCode(byte r2) {
            r0 = 1
            if (r0 > r2) goto L8
            r1 = 15
            if (r2 > r1) goto L8
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    private void maybeUpdateIsInCaptionService(byte r3, byte r4) {
            r2 = this;
            boolean r0 = isXdsControlCode(r3)
            r1 = 0
            if (r0 == 0) goto La
            r2.isInCaptionService = r1
            goto L25
        La:
            boolean r3 = isServiceSwitchCommand(r3)
            if (r3 == 0) goto L25
            r3 = 32
            if (r4 == r3) goto L22
            r3 = 47
            if (r4 == r3) goto L22
            switch(r4) {
                case 37: goto L22;
                case 38: goto L22;
                case 39: goto L22;
                default: goto L1b;
            }
        L1b:
            switch(r4) {
                case 41: goto L22;
                case 42: goto L1f;
                case 43: goto L1f;
                default: goto L1e;
            }
        L1e:
            goto L25
        L1f:
            r2.isInCaptionService = r1
            goto L25
        L22:
            r3 = 1
            r2.isInCaptionService = r3
        L25:
            return
    }

    private void resetCueBuilders() {
            r2 = this;
            com.google.android.exoplayer2.text.cea.Cea608Decoder$CueBuilder r0 = r2.currentCueBuilder
            int r1 = r2.captionMode
            r0.reset(r1)
            java.util.ArrayList<com.google.android.exoplayer2.text.cea.Cea608Decoder$CueBuilder> r0 = r2.cueBuilders
            r0.clear()
            java.util.ArrayList<com.google.android.exoplayer2.text.cea.Cea608Decoder$CueBuilder> r0 = r2.cueBuilders
            com.google.android.exoplayer2.text.cea.Cea608Decoder$CueBuilder r1 = r2.currentCueBuilder
            r0.add(r1)
            return
    }

    private void setCaptionMode(int r3) {
            r2 = this;
            int r0 = r2.captionMode
            if (r0 != r3) goto L5
            return
        L5:
            r2.captionMode = r3
            r1 = 3
            if (r3 != r1) goto L22
            r0 = 0
        Lb:
            java.util.ArrayList<com.google.android.exoplayer2.text.cea.Cea608Decoder$CueBuilder> r1 = r2.cueBuilders
            int r1 = r1.size()
            if (r0 >= r1) goto L21
            java.util.ArrayList<com.google.android.exoplayer2.text.cea.Cea608Decoder$CueBuilder> r1 = r2.cueBuilders
            java.lang.Object r1 = r1.get(r0)
            com.google.android.exoplayer2.text.cea.Cea608Decoder$CueBuilder r1 = (com.google.android.exoplayer2.text.cea.Cea608Decoder.CueBuilder) r1
            r1.setCaptionMode(r3)
            int r0 = r0 + 1
            goto Lb
        L21:
            return
        L22:
            r2.resetCueBuilders()
            if (r0 == r1) goto L2c
            r0 = 1
            if (r3 == r0) goto L2c
            if (r3 != 0) goto L32
        L2c:
            java.util.List r3 = java.util.Collections.emptyList()
            r2.cues = r3
        L32:
            return
    }

    private void setCaptionRowCount(int r2) {
            r1 = this;
            r1.captionRowCount = r2
            com.google.android.exoplayer2.text.cea.Cea608Decoder$CueBuilder r0 = r1.currentCueBuilder
            r0.setCaptionRowCount(r2)
            return
    }

    private boolean shouldClearStuckCaptions() {
            r6 = this;
            long r0 = r6.validDataChannelTimeoutUs
            r2 = 0
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 == 0) goto L21
            long r0 = r6.lastCueUpdateUs
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 != 0) goto L13
            goto L21
        L13:
            long r0 = r6.getPositionUs()
            long r3 = r6.lastCueUpdateUs
            long r0 = r0 - r3
            long r3 = r6.validDataChannelTimeoutUs
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 < 0) goto L21
            r2 = 1
        L21:
            return r2
    }

    private boolean updateAndVerifyCurrentChannel(byte r2) {
            r1 = this;
            boolean r0 = isCtrlCode(r2)
            if (r0 == 0) goto Lc
            int r2 = getChannel(r2)
            r1.currentChannel = r2
        Lc:
            int r2 = r1.currentChannel
            int r0 = r1.selectedChannel
            if (r2 != r0) goto L14
            r2 = 1
            goto L15
        L14:
            r2 = 0
        L15:
            return r2
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
    public final void decode(com.google.android.exoplayer2.text.SubtitleInputBuffer r10) {
            r9 = this;
            java.nio.ByteBuffer r10 = r10.data
            java.lang.Object r10 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r10)
            java.nio.ByteBuffer r10 = (java.nio.ByteBuffer) r10
            com.google.android.exoplayer2.util.ParsableByteArray r0 = r9.ccData
            byte[] r1 = r10.array()
            int r10 = r10.limit()
            r0.reset(r1, r10)
            r10 = 0
            r0 = 1
            r1 = 0
        L18:
            com.google.android.exoplayer2.util.ParsableByteArray r2 = r9.ccData
            int r2 = r2.bytesLeft()
            int r3 = r9.packetLength
            if (r2 < r3) goto Lf7
            r2 = 2
            if (r3 != r2) goto L27
            r2 = -4
            goto L2d
        L27:
            com.google.android.exoplayer2.util.ParsableByteArray r2 = r9.ccData
            int r2 = r2.readUnsignedByte()
        L2d:
            com.google.android.exoplayer2.util.ParsableByteArray r3 = r9.ccData
            int r3 = r3.readUnsignedByte()
            com.google.android.exoplayer2.util.ParsableByteArray r4 = r9.ccData
            int r4 = r4.readUnsignedByte()
            r5 = r2 & 2
            if (r5 == 0) goto L3e
            goto L18
        L3e:
            r5 = r2 & 1
            int r6 = r9.selectedField
            if (r5 == r6) goto L45
            goto L18
        L45:
            r5 = r3 & 127(0x7f, float:1.78E-43)
            byte r5 = (byte) r5
            r6 = r4 & 127(0x7f, float:1.78E-43)
            byte r6 = (byte) r6
            if (r5 != 0) goto L50
            if (r6 != 0) goto L50
            goto L18
        L50:
            boolean r7 = r9.isCaptionValid
            r2 = r2 & 4
            r8 = 4
            if (r2 != r8) goto L63
            boolean[] r2 = com.google.android.exoplayer2.text.cea.Cea608Decoder.ODD_PARITY_BYTE_TABLE
            boolean r3 = r2[r3]
            if (r3 == 0) goto L63
            boolean r2 = r2[r4]
            if (r2 == 0) goto L63
            r2 = 1
            goto L64
        L63:
            r2 = 0
        L64:
            r9.isCaptionValid = r2
            boolean r2 = r9.isRepeatedCommand(r2, r5, r6)
            if (r2 == 0) goto L6d
            goto L18
        L6d:
            boolean r2 = r9.isCaptionValid
            if (r2 != 0) goto L78
            if (r7 == 0) goto L18
            r9.resetCueBuilders()
            goto Lf4
        L78:
            r9.maybeUpdateIsInCaptionService(r5, r6)
            boolean r2 = r9.isInCaptionService
            if (r2 != 0) goto L80
            goto L18
        L80:
            boolean r2 = r9.updateAndVerifyCurrentChannel(r5)
            if (r2 != 0) goto L87
            goto L18
        L87:
            boolean r1 = isCtrlCode(r5)
            if (r1 == 0) goto Lde
            boolean r1 = isSpecialNorthAmericanChar(r5, r6)
            if (r1 == 0) goto L9d
            com.google.android.exoplayer2.text.cea.Cea608Decoder$CueBuilder r1 = r9.currentCueBuilder
            char r2 = getSpecialNorthAmericanChar(r6)
            r1.append(r2)
            goto Lf4
        L9d:
            boolean r1 = isExtendedWestEuropeanChar(r5, r6)
            if (r1 == 0) goto Lb2
            com.google.android.exoplayer2.text.cea.Cea608Decoder$CueBuilder r1 = r9.currentCueBuilder
            r1.backspace()
            com.google.android.exoplayer2.text.cea.Cea608Decoder$CueBuilder r1 = r9.currentCueBuilder
            char r2 = getExtendedWestEuropeanChar(r5, r6)
            r1.append(r2)
            goto Lf4
        Lb2:
            boolean r1 = isMidrowCtrlCode(r5, r6)
            if (r1 == 0) goto Lbc
            r9.handleMidrowCtrl(r6)
            goto Lf4
        Lbc:
            boolean r1 = isPreambleAddressCode(r5, r6)
            if (r1 == 0) goto Lc6
            r9.handlePreambleAddressCode(r5, r6)
            goto Lf4
        Lc6:
            boolean r1 = isTabCtrlCode(r5, r6)
            if (r1 == 0) goto Ld4
            com.google.android.exoplayer2.text.cea.Cea608Decoder$CueBuilder r1 = r9.currentCueBuilder
            int r6 = r6 + (-32)
            com.google.android.exoplayer2.text.cea.Cea608Decoder.CueBuilder.access$002(r1, r6)
            goto Lf4
        Ld4:
            boolean r1 = isMiscCode(r5, r6)
            if (r1 == 0) goto Lf4
            r9.handleMiscCode(r6)
            goto Lf4
        Lde:
            com.google.android.exoplayer2.text.cea.Cea608Decoder$CueBuilder r1 = r9.currentCueBuilder
            char r2 = getBasicChar(r5)
            r1.append(r2)
            r1 = r6 & 224(0xe0, float:3.14E-43)
            if (r1 == 0) goto Lf4
            com.google.android.exoplayer2.text.cea.Cea608Decoder$CueBuilder r1 = r9.currentCueBuilder
            char r2 = getBasicChar(r6)
            r1.append(r2)
        Lf4:
            r1 = 1
            goto L18
        Lf7:
            if (r1 == 0) goto L10c
            int r10 = r9.captionMode
            if (r10 == r0) goto L100
            r0 = 3
            if (r10 != r0) goto L10c
        L100:
            java.util.List r10 = r9.getDisplayCues()
            r9.cues = r10
            long r0 = r9.getPositionUs()
            r9.lastCueUpdateUs = r0
        L10c:
            return
    }

    @Override // com.google.android.exoplayer2.text.cea.CeaDecoder, com.google.android.exoplayer2.decoder.Decoder
    @androidx.annotation.Nullable
    public /* bridge */ /* synthetic */ com.google.android.exoplayer2.text.SubtitleInputBuffer dequeueInputBuffer() throws com.google.android.exoplayer2.text.SubtitleDecoderException {
            r1 = this;
            com.google.android.exoplayer2.text.SubtitleInputBuffer r0 = super.dequeueInputBuffer()
            return r0
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.android.exoplayer2.text.cea.CeaDecoder, com.google.android.exoplayer2.decoder.Decoder
    @androidx.annotation.Nullable
    public com.google.android.exoplayer2.text.SubtitleOutputBuffer dequeueOutputBuffer() throws com.google.android.exoplayer2.text.SubtitleDecoderException {
            r7 = this;
            com.google.android.exoplayer2.text.SubtitleOutputBuffer r0 = super.dequeueOutputBuffer()
            if (r0 == 0) goto L7
            return r0
        L7:
            boolean r0 = r7.shouldClearStuckCaptions()
            if (r0 == 0) goto L3b
            com.google.android.exoplayer2.text.SubtitleOutputBuffer r0 = r7.getAvailableOutputBuffer()
            if (r0 == 0) goto L3b
            java.util.List r1 = java.util.Collections.emptyList()
            r7.cues = r1
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7.lastCueUpdateUs = r2
            r7.lastCues = r1
            com.google.android.exoplayer2.text.cea.CeaSubtitle r4 = new com.google.android.exoplayer2.text.cea.CeaSubtitle
            java.lang.Object r1 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r1)
            java.util.List r1 = (java.util.List) r1
            r4.<init>(r1)
            long r2 = r7.getPositionUs()
            r5 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r1 = r0
            r1.setContent(r2, r4, r5)
            return r0
        L3b:
            r0 = 0
            return r0
    }

    @Override // com.google.android.exoplayer2.text.cea.CeaDecoder, com.google.android.exoplayer2.decoder.Decoder
    @androidx.annotation.Nullable
    public /* bridge */ /* synthetic */ com.google.android.exoplayer2.text.SubtitleOutputBuffer dequeueOutputBuffer() throws com.google.android.exoplayer2.decoder.DecoderException {
            r1 = this;
            com.google.android.exoplayer2.text.SubtitleOutputBuffer r0 = r1.dequeueOutputBuffer()
            return r0
    }

    @Override // com.google.android.exoplayer2.text.cea.CeaDecoder, com.google.android.exoplayer2.decoder.Decoder
    public void flush() {
            r2 = this;
            super.flush()
            r0 = 0
            r2.cues = r0
            r2.lastCues = r0
            r0 = 0
            r2.setCaptionMode(r0)
            r1 = 4
            r2.setCaptionRowCount(r1)
            r2.resetCueBuilders()
            r2.isCaptionValid = r0
            r2.repeatableControlSet = r0
            r2.repeatableControlCc1 = r0
            r2.repeatableControlCc2 = r0
            r2.currentChannel = r0
            r0 = 1
            r2.isInCaptionService = r0
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r2.lastCueUpdateUs = r0
            return
    }

    @Override // com.google.android.exoplayer2.text.cea.CeaDecoder, com.google.android.exoplayer2.decoder.Decoder
    public java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = "Cea608Decoder"
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
    public void release() {
            r0 = this;
            return
    }

    @Override // com.google.android.exoplayer2.text.cea.CeaDecoder, com.google.android.exoplayer2.text.SubtitleDecoder
    public /* bridge */ /* synthetic */ void setPositionUs(long r1) {
            r0 = this;
            super.setPositionUs(r1)
            return
    }
}
