package com.google.android.exoplayer2.text.ssa;

/* JADX INFO: loaded from: classes.dex */
public final class SsaDecoder extends com.google.android.exoplayer2.text.SimpleSubtitleDecoder {
    private static final float DEFAULT_MARGIN = 0.05f;
    private static final java.lang.String DIALOGUE_LINE_PREFIX = "Dialogue:";
    private static final java.util.regex.Pattern SSA_TIMECODE_PATTERN = null;
    private static final java.lang.String TAG = "SsaDecoder";

    @androidx.annotation.Nullable
    private final com.google.android.exoplayer2.text.ssa.SsaDialogueFormat dialogueFormatFromInitializationData;
    private final boolean haveInitializationData;
    private float screenHeight;
    private float screenWidth;
    private java.util.Map<java.lang.String, com.google.android.exoplayer2.text.ssa.SsaStyle> styles;

    static {
            java.lang.String r0 = "(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.google.android.exoplayer2.text.ssa.SsaDecoder.SSA_TIMECODE_PATTERN = r0
            return
    }

    public SsaDecoder() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }

    public SsaDecoder(@androidx.annotation.Nullable java.util.List<byte[]> r4) {
            r3 = this;
            java.lang.String r0 = "SsaDecoder"
            r3.<init>(r0)
            r0 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r3.screenWidth = r0
            r3.screenHeight = r0
            r0 = 0
            if (r4 == 0) goto L46
            boolean r1 = r4.isEmpty()
            if (r1 != 0) goto L46
            r1 = 1
            r3.haveInitializationData = r1
            java.lang.Object r0 = r4.get(r0)
            byte[] r0 = (byte[]) r0
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.fromUtf8Bytes(r0)
            java.lang.String r2 = "Format:"
            boolean r2 = r0.startsWith(r2)
            com.google.android.exoplayer2.util.Assertions.checkArgument(r2)
            com.google.android.exoplayer2.text.ssa.SsaDialogueFormat r0 = com.google.android.exoplayer2.text.ssa.SsaDialogueFormat.fromFormatLine(r0)
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            com.google.android.exoplayer2.text.ssa.SsaDialogueFormat r0 = (com.google.android.exoplayer2.text.ssa.SsaDialogueFormat) r0
            r3.dialogueFormatFromInitializationData = r0
            com.google.android.exoplayer2.util.ParsableByteArray r0 = new com.google.android.exoplayer2.util.ParsableByteArray
            java.lang.Object r4 = r4.get(r1)
            byte[] r4 = (byte[]) r4
            r0.<init>(r4)
            r3.parseHeader(r0)
            goto L4b
        L46:
            r3.haveInitializationData = r0
            r4 = 0
            r3.dialogueFormatFromInitializationData = r4
        L4b:
            return
    }

    private static int addCuePlacerholderByTime(long r4, java.util.List<java.lang.Long> r6, java.util.List<java.util.List<com.google.android.exoplayer2.text.Cue>> r7) {
            int r0 = r6.size()
            int r0 = r0 + (-1)
        L6:
            if (r0 < 0) goto L2b
            java.lang.Object r1 = r6.get(r0)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            int r3 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r3 != 0) goto L17
            return r0
        L17:
            java.lang.Object r1 = r6.get(r0)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            int r3 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r3 >= 0) goto L28
            int r0 = r0 + 1
            goto L2c
        L28:
            int r0 = r0 + (-1)
            goto L6
        L2b:
            r0 = 0
        L2c:
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r6.add(r0, r4)
            java.util.ArrayList r4 = new java.util.ArrayList
            if (r0 != 0) goto L3b
            r4.<init>()
            goto L46
        L3b:
            int r5 = r0 + (-1)
            java.lang.Object r5 = r7.get(r5)
            java.util.Collection r5 = (java.util.Collection) r5
            r4.<init>(r5)
        L46:
            r7.add(r0, r4)
            return r0
    }

    private static float computeDefaultLineOrPosition(int r1) {
            if (r1 == 0) goto L13
            r0 = 1
            if (r1 == r0) goto L10
            r0 = 2
            if (r1 == r0) goto Lc
            r1 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            return r1
        Lc:
            r1 = 1064514355(0x3f733333, float:0.95)
            return r1
        L10:
            r1 = 1056964608(0x3f000000, float:0.5)
            return r1
        L13:
            r1 = 1028443341(0x3d4ccccd, float:0.05)
            return r1
    }

    private static com.google.android.exoplayer2.text.Cue createCue(java.lang.String r8, @androidx.annotation.Nullable com.google.android.exoplayer2.text.ssa.SsaStyle r9, com.google.android.exoplayer2.text.ssa.SsaStyle.Overrides r10, float r11, float r12) {
            android.text.SpannableString r0 = new android.text.SpannableString
            r0.<init>(r8)
            com.google.android.exoplayer2.text.Cue$Builder r8 = new com.google.android.exoplayer2.text.Cue$Builder
            r8.<init>()
            com.google.android.exoplayer2.text.Cue$Builder r8 = r8.setText(r0)
            r1 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r2 = 0
            if (r9 == 0) goto Lab
            java.lang.Integer r3 = r9.primaryColor
            r4 = 33
            if (r3 == 0) goto L2c
            android.text.style.ForegroundColorSpan r3 = new android.text.style.ForegroundColorSpan
            java.lang.Integer r5 = r9.primaryColor
            int r5 = r5.intValue()
            r3.<init>(r5)
            int r5 = r0.length()
            r0.setSpan(r3, r2, r5, r4)
        L2c:
            int r3 = r9.borderStyle
            r5 = 3
            if (r3 != r5) goto L47
            java.lang.Integer r3 = r9.outlineColor
            if (r3 == 0) goto L47
            android.text.style.BackgroundColorSpan r3 = new android.text.style.BackgroundColorSpan
            java.lang.Integer r6 = r9.outlineColor
            int r6 = r6.intValue()
            r3.<init>(r6)
            int r6 = r0.length()
            r0.setSpan(r3, r2, r6, r4)
        L47:
            float r3 = r9.fontSize
            r6 = 1
            int r7 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r7 == 0) goto L56
            int r7 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r7 == 0) goto L56
            float r3 = r3 / r12
            r8.setTextSize(r3, r6)
        L56:
            boolean r3 = r9.bold
            if (r3 == 0) goto L6b
            boolean r7 = r9.italic
            if (r7 == 0) goto L6b
            android.text.style.StyleSpan r3 = new android.text.style.StyleSpan
            r3.<init>(r5)
            int r5 = r0.length()
            r0.setSpan(r3, r2, r5, r4)
            goto L8b
        L6b:
            if (r3 == 0) goto L7a
            android.text.style.StyleSpan r3 = new android.text.style.StyleSpan
            r3.<init>(r6)
            int r5 = r0.length()
            r0.setSpan(r3, r2, r5, r4)
            goto L8b
        L7a:
            boolean r3 = r9.italic
            if (r3 == 0) goto L8b
            android.text.style.StyleSpan r3 = new android.text.style.StyleSpan
            r5 = 2
            r3.<init>(r5)
            int r5 = r0.length()
            r0.setSpan(r3, r2, r5, r4)
        L8b:
            boolean r3 = r9.underline
            if (r3 == 0) goto L9b
            android.text.style.UnderlineSpan r3 = new android.text.style.UnderlineSpan
            r3.<init>()
            int r5 = r0.length()
            r0.setSpan(r3, r2, r5, r4)
        L9b:
            boolean r3 = r9.strikeout
            if (r3 == 0) goto Lab
            android.text.style.StrikethroughSpan r3 = new android.text.style.StrikethroughSpan
            r3.<init>()
            int r5 = r0.length()
            r0.setSpan(r3, r2, r5, r4)
        Lab:
            int r0 = r10.alignment
            r3 = -1
            if (r0 == r3) goto Lb1
            goto Lb7
        Lb1:
            if (r9 == 0) goto Lb6
            int r0 = r9.alignment
            goto Lb7
        Lb6:
            r0 = -1
        Lb7:
            android.text.Layout$Alignment r9 = toTextAlignment(r0)
            com.google.android.exoplayer2.text.Cue$Builder r9 = r8.setTextAlignment(r9)
            int r3 = toPositionAnchor(r0)
            com.google.android.exoplayer2.text.Cue$Builder r9 = r9.setPositionAnchor(r3)
            int r0 = toLineAnchor(r0)
            r9.setLineAnchor(r0)
            android.graphics.PointF r9 = r10.position
            if (r9 == 0) goto Le9
            int r0 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r0 == 0) goto Le9
            int r0 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r0 == 0) goto Le9
            float r9 = r9.x
            float r9 = r9 / r11
            r8.setPosition(r9)
            android.graphics.PointF r9 = r10.position
            float r9 = r9.y
            float r9 = r9 / r12
            r8.setLine(r9, r2)
            goto Lff
        Le9:
            int r9 = r8.getPositionAnchor()
            float r9 = computeDefaultLineOrPosition(r9)
            r8.setPosition(r9)
            int r9 = r8.getLineAnchor()
            float r9 = computeDefaultLineOrPosition(r9)
            r8.setLine(r9, r2)
        Lff:
            com.google.android.exoplayer2.text.Cue r8 = r8.build()
            return r8
    }

    private void parseDialogueLine(java.lang.String r11, com.google.android.exoplayer2.text.ssa.SsaDialogueFormat r12, java.util.List<java.util.List<com.google.android.exoplayer2.text.Cue>> r13, java.util.List<java.lang.Long> r14) {
            r10 = this;
            java.lang.String r0 = "Dialogue:"
            boolean r0 = r11.startsWith(r0)
            com.google.android.exoplayer2.util.Assertions.checkArgument(r0)
            r0 = 9
            java.lang.String r0 = r11.substring(r0)
            int r1 = r12.length
            java.lang.String r2 = ","
            java.lang.String[] r0 = r0.split(r2, r1)
            int r1 = r0.length
            int r2 = r12.length
            java.lang.String r3 = "SsaDecoder"
            if (r1 == r2) goto L24
            java.lang.String r12 = "Skipping dialogue line with fewer columns than format: "
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m27m(r12, r11, r3)
            return
        L24:
            int r1 = r12.startTimeIndex
            r1 = r0[r1]
            long r1 = parseTimecodeUs(r1)
            java.lang.String r4 = "Skipping invalid timing: "
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 != 0) goto L3b
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m27m(r4, r11, r3)
            return
        L3b:
            int r7 = r12.endTimeIndex
            r7 = r0[r7]
            long r7 = parseTimecodeUs(r7)
            int r9 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r9 != 0) goto L4b
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m27m(r4, r11, r3)
            return
        L4b:
            java.util.Map<java.lang.String, com.google.android.exoplayer2.text.ssa.SsaStyle> r11 = r10.styles
            if (r11 == 0) goto L61
            int r3 = r12.styleIndex
            r4 = -1
            if (r3 == r4) goto L61
            r3 = r0[r3]
            java.lang.String r3 = r3.trim()
            java.lang.Object r11 = r11.get(r3)
            com.google.android.exoplayer2.text.ssa.SsaStyle r11 = (com.google.android.exoplayer2.text.ssa.SsaStyle) r11
            goto L62
        L61:
            r11 = 0
        L62:
            int r12 = r12.textIndex
            r12 = r0[r12]
            com.google.android.exoplayer2.text.ssa.SsaStyle$Overrides r0 = com.google.android.exoplayer2.text.ssa.SsaStyle.Overrides.parseFromDialogue(r12)
            java.lang.String r12 = com.google.android.exoplayer2.text.ssa.SsaStyle.Overrides.stripStyleOverrides(r12)
            java.lang.String r3 = "\\N"
            java.lang.String r4 = "\n"
            java.lang.String r12 = r12.replace(r3, r4)
            java.lang.String r3 = "\\n"
            java.lang.String r12 = r12.replace(r3, r4)
            java.lang.String r3 = "\\h"
            java.lang.String r4 = " "
            java.lang.String r12 = r12.replace(r3, r4)
            float r3 = r10.screenWidth
            float r4 = r10.screenHeight
            com.google.android.exoplayer2.text.Cue r11 = createCue(r12, r11, r0, r3, r4)
            int r12 = addCuePlacerholderByTime(r1, r14, r13)
            int r14 = addCuePlacerholderByTime(r7, r14, r13)
        L95:
            if (r12 >= r14) goto La3
            java.lang.Object r0 = r13.get(r12)
            java.util.List r0 = (java.util.List) r0
            r0.add(r11)
            int r12 = r12 + 1
            goto L95
        La3:
            return
    }

    private void parseEventBody(com.google.android.exoplayer2.util.ParsableByteArray r5, java.util.List<java.util.List<com.google.android.exoplayer2.text.Cue>> r6, java.util.List<java.lang.Long> r7) {
            r4 = this;
            boolean r0 = r4.haveInitializationData
            if (r0 == 0) goto L7
            com.google.android.exoplayer2.text.ssa.SsaDialogueFormat r0 = r4.dialogueFormatFromInitializationData
            goto L8
        L7:
            r0 = 0
        L8:
            java.lang.String r1 = r5.readLine()
            if (r1 == 0) goto L31
            java.lang.String r2 = "Format:"
            boolean r2 = r1.startsWith(r2)
            if (r2 == 0) goto L1b
            com.google.android.exoplayer2.text.ssa.SsaDialogueFormat r0 = com.google.android.exoplayer2.text.ssa.SsaDialogueFormat.fromFormatLine(r1)
            goto L8
        L1b:
            java.lang.String r2 = "Dialogue:"
            boolean r2 = r1.startsWith(r2)
            if (r2 == 0) goto L8
            if (r0 != 0) goto L2d
            java.lang.String r2 = "Skipping dialogue line before complete format: "
            java.lang.String r3 = "SsaDecoder"
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m27m(r2, r1, r3)
            goto L8
        L2d:
            r4.parseDialogueLine(r1, r0, r6, r7)
            goto L8
        L31:
            return
    }

    private void parseHeader(com.google.android.exoplayer2.util.ParsableByteArray r3) {
            r2 = this;
        L0:
            java.lang.String r0 = r3.readLine()
            if (r0 == 0) goto L39
            java.lang.String r1 = "[Script Info]"
            boolean r1 = r1.equalsIgnoreCase(r0)
            if (r1 == 0) goto L12
            r2.parseScriptInfo(r3)
            goto L0
        L12:
            java.lang.String r1 = "[V4+ Styles]"
            boolean r1 = r1.equalsIgnoreCase(r0)
            if (r1 == 0) goto L21
            java.util.Map r0 = parseStyles(r3)
            r2.styles = r0
            goto L0
        L21:
            java.lang.String r1 = "[V4 Styles]"
            boolean r1 = r1.equalsIgnoreCase(r0)
            if (r1 == 0) goto L31
            java.lang.String r0 = "SsaDecoder"
            java.lang.String r1 = "[V4 Styles] are not supported"
            com.google.android.exoplayer2.util.Log.i(r0, r1)
            goto L0
        L31:
            java.lang.String r1 = "[Events]"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L0
        L39:
            return
    }

    private void parseScriptInfo(com.google.android.exoplayer2.util.ParsableByteArray r5) {
            r4 = this;
        L0:
            java.lang.String r0 = r5.readLine()
            if (r0 == 0) goto L5b
            int r1 = r5.bytesLeft()
            if (r1 == 0) goto L14
            int r1 = r5.peekUnsignedByte()
            r2 = 91
            if (r1 == r2) goto L5b
        L14:
            java.lang.String r1 = ":"
            java.lang.String[] r0 = r0.split(r1)
            int r1 = r0.length
            r2 = 2
            if (r1 == r2) goto L1f
            goto L0
        L1f:
            r1 = 0
            r1 = r0[r1]
            java.lang.String r1 = r1.trim()
            java.lang.String r1 = com.google.common.base.Ascii.toLowerCase(r1)
            java.util.Objects.requireNonNull(r1)
            java.lang.String r2 = "playresx"
            boolean r2 = r1.equals(r2)
            r3 = 1
            if (r2 != 0) goto L4e
            java.lang.String r2 = "playresy"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L3f
            goto L0
        L3f:
            r0 = r0[r3]     // Catch: java.lang.NumberFormatException -> L4c
            java.lang.String r0 = r0.trim()     // Catch: java.lang.NumberFormatException -> L4c
            float r0 = java.lang.Float.parseFloat(r0)     // Catch: java.lang.NumberFormatException -> L4c
            r4.screenHeight = r0     // Catch: java.lang.NumberFormatException -> L4c
            goto L0
        L4c:
            goto L0
        L4e:
            r0 = r0[r3]     // Catch: java.lang.NumberFormatException -> L4c
            java.lang.String r0 = r0.trim()     // Catch: java.lang.NumberFormatException -> L4c
            float r0 = java.lang.Float.parseFloat(r0)     // Catch: java.lang.NumberFormatException -> L4c
            r4.screenWidth = r0     // Catch: java.lang.NumberFormatException -> L4c
            goto L0
        L5b:
            return
    }

    private static java.util.Map<java.lang.String, com.google.android.exoplayer2.text.ssa.SsaStyle> parseStyles(com.google.android.exoplayer2.util.ParsableByteArray r5) {
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r1 = 0
        L6:
            java.lang.String r2 = r5.readLine()
            if (r2 == 0) goto L45
            int r3 = r5.bytesLeft()
            if (r3 == 0) goto L1a
            int r3 = r5.peekUnsignedByte()
            r4 = 91
            if (r3 == r4) goto L45
        L1a:
            java.lang.String r3 = "Format:"
            boolean r3 = r2.startsWith(r3)
            if (r3 == 0) goto L27
            com.google.android.exoplayer2.text.ssa.SsaStyle$Format r1 = com.google.android.exoplayer2.text.ssa.SsaStyle.Format.fromFormatLine(r2)
            goto L6
        L27:
            java.lang.String r3 = "Style:"
            boolean r3 = r2.startsWith(r3)
            if (r3 == 0) goto L6
            if (r1 != 0) goto L39
            java.lang.String r3 = "Skipping 'Style:' line before 'Format:' line: "
            java.lang.String r4 = "SsaDecoder"
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m27m(r3, r2, r4)
            goto L6
        L39:
            com.google.android.exoplayer2.text.ssa.SsaStyle r2 = com.google.android.exoplayer2.text.ssa.SsaStyle.fromStyleLine(r2, r1)
            if (r2 == 0) goto L6
            java.lang.String r3 = r2.name
            r0.put(r3, r2)
            goto L6
        L45:
            return r0
    }

    private static long parseTimecodeUs(java.lang.String r8) {
            java.util.regex.Pattern r0 = com.google.android.exoplayer2.text.ssa.SsaDecoder.SSA_TIMECODE_PATTERN
            java.lang.String r8 = r8.trim()
            java.util.regex.Matcher r8 = r0.matcher(r8)
            boolean r0 = r8.matches()
            if (r0 != 0) goto L16
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            return r0
        L16:
            r0 = 1
            java.lang.String r0 = r8.group(r0)
            java.lang.Object r0 = com.google.android.exoplayer2.util.Util.castNonNull(r0)
            java.lang.String r0 = (java.lang.String) r0
            long r0 = java.lang.Long.parseLong(r0)
            r2 = 60
            long r0 = r0 * r2
            long r0 = r0 * r2
            r4 = 1000000(0xf4240, double:4.940656E-318)
            long r0 = r0 * r4
            r6 = 2
            java.lang.String r6 = r8.group(r6)
            java.lang.Object r6 = com.google.android.exoplayer2.util.Util.castNonNull(r6)
            java.lang.String r6 = (java.lang.String) r6
            long r6 = java.lang.Long.parseLong(r6)
            long r6 = r6 * r2
            long r6 = r6 * r4
            long r6 = r6 + r0
            r0 = 3
            java.lang.String r0 = r8.group(r0)
            java.lang.Object r0 = com.google.android.exoplayer2.util.Util.castNonNull(r0)
            java.lang.String r0 = (java.lang.String) r0
            long r0 = java.lang.Long.parseLong(r0)
            long r0 = r0 * r4
            long r0 = r0 + r6
            r2 = 4
            java.lang.String r8 = r8.group(r2)
            java.lang.Object r8 = com.google.android.exoplayer2.util.Util.castNonNull(r8)
            java.lang.String r8 = (java.lang.String) r8
            long r2 = java.lang.Long.parseLong(r8)
            r4 = 10000(0x2710, double:4.9407E-320)
            long r2 = r2 * r4
            long r2 = r2 + r0
            return r2
    }

    private static int toLineAnchor(int r3) {
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            switch(r3) {
                case -1: goto L13;
                case 0: goto L5;
                case 1: goto L11;
                case 2: goto L11;
                case 3: goto L11;
                case 4: goto Lf;
                case 5: goto Lf;
                case 6: goto Lf;
                case 7: goto Ld;
                case 8: goto Ld;
                case 9: goto Ld;
                default: goto L5;
            }
        L5:
            java.lang.String r1 = "Unknown alignment: "
            java.lang.String r2 = "SsaDecoder"
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m26m(r1, r3, r2)
            return r0
        Ld:
            r3 = 0
            return r3
        Lf:
            r3 = 1
            return r3
        L11:
            r3 = 2
            return r3
        L13:
            return r0
    }

    private static int toPositionAnchor(int r3) {
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            switch(r3) {
                case -1: goto L13;
                case 0: goto L5;
                case 1: goto L11;
                case 2: goto Lf;
                case 3: goto Ld;
                case 4: goto L11;
                case 5: goto Lf;
                case 6: goto Ld;
                case 7: goto L11;
                case 8: goto Lf;
                case 9: goto Ld;
                default: goto L5;
            }
        L5:
            java.lang.String r1 = "Unknown alignment: "
            java.lang.String r2 = "SsaDecoder"
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m26m(r1, r3, r2)
            return r0
        Ld:
            r3 = 2
            return r3
        Lf:
            r3 = 1
            return r3
        L11:
            r3 = 0
            return r3
        L13:
            return r0
    }

    @androidx.annotation.Nullable
    private static android.text.Layout.Alignment toTextAlignment(int r3) {
            r0 = 0
            switch(r3) {
                case -1: goto L15;
                case 0: goto L4;
                case 1: goto L12;
                case 2: goto Lf;
                case 3: goto Lc;
                case 4: goto L12;
                case 5: goto Lf;
                case 6: goto Lc;
                case 7: goto L12;
                case 8: goto Lf;
                case 9: goto Lc;
                default: goto L4;
            }
        L4:
            java.lang.String r1 = "Unknown alignment: "
            java.lang.String r2 = "SsaDecoder"
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m26m(r1, r3, r2)
            return r0
        Lc:
            android.text.Layout$Alignment r3 = android.text.Layout.Alignment.ALIGN_OPPOSITE
            return r3
        Lf:
            android.text.Layout$Alignment r3 = android.text.Layout.Alignment.ALIGN_CENTER
            return r3
        L12:
            android.text.Layout$Alignment r3 = android.text.Layout.Alignment.ALIGN_NORMAL
            return r3
        L15:
            return r0
    }

    @Override // com.google.android.exoplayer2.text.SimpleSubtitleDecoder
    public final com.google.android.exoplayer2.text.Subtitle decode(byte[] r3, int r4, boolean r5) {
            r2 = this;
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.google.android.exoplayer2.util.ParsableByteArray r1 = new com.google.android.exoplayer2.util.ParsableByteArray
            r1.<init>(r3, r4)
            boolean r3 = r2.haveInitializationData
            if (r3 != 0) goto L16
            r2.parseHeader(r1)
        L16:
            r2.parseEventBody(r1, r5, r0)
            com.google.android.exoplayer2.text.ssa.SsaSubtitle r3 = new com.google.android.exoplayer2.text.ssa.SsaSubtitle
            r3.<init>(r5, r0)
            return r3
    }
}
