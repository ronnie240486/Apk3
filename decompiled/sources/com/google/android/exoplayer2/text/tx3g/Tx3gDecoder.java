package com.google.android.exoplayer2.text.tx3g;

/* JADX INFO: loaded from: classes2.dex */
public final class Tx3gDecoder extends com.google.android.exoplayer2.text.SimpleSubtitleDecoder {
    private static final int DEFAULT_COLOR = -1;
    private static final int DEFAULT_FONT_FACE = 0;
    private static final java.lang.String DEFAULT_FONT_FAMILY = "sans-serif";
    private static final float DEFAULT_VERTICAL_PLACEMENT = 0.85f;
    private static final int FONT_FACE_BOLD = 1;
    private static final int FONT_FACE_ITALIC = 2;
    private static final int FONT_FACE_UNDERLINE = 4;
    private static final int SIZE_ATOM_HEADER = 8;
    private static final int SIZE_SHORT = 2;
    private static final int SIZE_STYLE_RECORD = 12;
    private static final int SPAN_PRIORITY_HIGH = 0;
    private static final int SPAN_PRIORITY_LOW = 16711680;
    private static final java.lang.String TAG = "Tx3gDecoder";
    private static final java.lang.String TX3G_SERIF = "Serif";
    private static final int TYPE_STYL = 1937013100;
    private static final int TYPE_TBOX = 1952608120;
    private final int calculatedVideoTrackHeight;
    private final boolean customVerticalPlacement;
    private final int defaultColorRgba;
    private final int defaultFontFace;
    private final java.lang.String defaultFontFamily;
    private final float defaultVerticalPlacement;
    private final com.google.android.exoplayer2.util.ParsableByteArray parsableByteArray;

    public Tx3gDecoder(java.util.List<byte[]> r7) {
            r6 = this;
            java.lang.String r0 = "Tx3gDecoder"
            r6.<init>(r0)
            com.google.android.exoplayer2.util.ParsableByteArray r0 = new com.google.android.exoplayer2.util.ParsableByteArray
            r0.<init>()
            r6.parsableByteArray = r0
            int r0 = r7.size()
            r1 = 1062836634(0x3f59999a, float:0.85)
            java.lang.String r2 = "sans-serif"
            r3 = 1
            r4 = 0
            if (r0 != r3) goto La8
            java.lang.Object r0 = r7.get(r4)
            byte[] r0 = (byte[]) r0
            int r0 = r0.length
            r5 = 48
            if (r0 == r5) goto L30
            java.lang.Object r0 = r7.get(r4)
            byte[] r0 = (byte[]) r0
            int r0 = r0.length
            r5 = 53
            if (r0 != r5) goto La8
        L30:
            java.lang.Object r7 = r7.get(r4)
            byte[] r7 = (byte[]) r7
            r0 = 24
            r5 = r7[r0]
            r6.defaultFontFace = r5
            r5 = 26
            r5 = r7[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r0 = r5 << 24
            r5 = 27
            r5 = r7[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r5 = r5 << 16
            r0 = r0 | r5
            r5 = 28
            r5 = r7[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r5 = r5 << 8
            r0 = r0 | r5
            r5 = 29
            r5 = r7[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            r0 = r0 | r5
            r6.defaultColorRgba = r0
            int r0 = r7.length
            r5 = 43
            int r0 = r0 - r5
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.fromUtf8Bytes(r7, r5, r0)
            java.lang.String r5 = "Serif"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L72
            java.lang.String r2 = "serif"
        L72:
            r6.defaultFontFamily = r2
            r0 = 25
            r0 = r7[r0]
            int r0 = r0 * 20
            r6.calculatedVideoTrackHeight = r0
            r2 = r7[r4]
            r2 = r2 & 32
            if (r2 == 0) goto L83
            goto L84
        L83:
            r3 = 0
        L84:
            r6.customVerticalPlacement = r3
            if (r3 == 0) goto La5
            r1 = 10
            r1 = r7[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 8
            r2 = 11
            r7 = r7[r2]
            r7 = r7 & 255(0xff, float:3.57E-43)
            r7 = r7 | r1
            float r7 = (float) r7
            float r0 = (float) r0
            float r7 = r7 / r0
            r0 = 0
            r1 = 1064514355(0x3f733333, float:0.95)
            float r7 = com.google.android.exoplayer2.util.Util.constrainValue(r7, r0, r1)
            r6.defaultVerticalPlacement = r7
            goto Lb5
        La5:
            r6.defaultVerticalPlacement = r1
            goto Lb5
        La8:
            r6.defaultFontFace = r4
            r7 = -1
            r6.defaultColorRgba = r7
            r6.defaultFontFamily = r2
            r6.customVerticalPlacement = r4
            r6.defaultVerticalPlacement = r1
            r6.calculatedVideoTrackHeight = r7
        Lb5:
            return
    }

    private void applyStyleRecord(com.google.android.exoplayer2.util.ParsableByteArray r10, android.text.SpannableStringBuilder r11) throws com.google.android.exoplayer2.text.SubtitleDecoderException {
            r9 = this;
            int r0 = r10.bytesLeft()
            r1 = 1
            r2 = 12
            if (r0 < r2) goto Lb
            r0 = 1
            goto Lc
        Lb:
            r0 = 0
        Lc:
            assertTrue(r0)
            int r0 = r10.readUnsignedShort()
            int r2 = r10.readUnsignedShort()
            r3 = 2
            r10.skipBytes(r3)
            int r3 = r10.readUnsignedByte()
            r10.skipBytes(r1)
            int r10 = r10.readInt()
            int r1 = r11.length()
            java.lang.String r4 = ")."
            java.lang.String r5 = "Tx3gDecoder"
            if (r2 <= r1) goto L4e
            java.lang.String r1 = "Truncating styl end ("
            java.lang.String r6 = ") to cueText.length() ("
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m23m(r1, r2, r6)
            int r2 = r11.length()
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            com.google.android.exoplayer2.util.Log.w(r5, r1)
            int r1 = r11.length()
            goto L4f
        L4e:
            r1 = r2
        L4f:
            if (r0 < r1) goto L71
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "Ignoring styl with start ("
            r10.append(r11)
            r10.append(r0)
            java.lang.String r11 = ") >= end ("
            r10.append(r11)
            r10.append(r1)
            r10.append(r4)
            java.lang.String r10 = r10.toString()
            com.google.android.exoplayer2.util.Log.w(r5, r10)
            return
        L71:
            int r4 = r9.defaultFontFace
            r8 = 0
            r2 = r11
            r5 = r0
            r6 = r1
            r7 = r8
            attachFontFace(r2, r3, r4, r5, r6, r7)
            int r4 = r9.defaultColorRgba
            r3 = r10
            attachColor(r2, r3, r4, r5, r6, r7)
            return
    }

    private static void assertTrue(boolean r1) throws com.google.android.exoplayer2.text.SubtitleDecoderException {
            if (r1 == 0) goto L3
            return
        L3:
            com.google.android.exoplayer2.text.SubtitleDecoderException r1 = new com.google.android.exoplayer2.text.SubtitleDecoderException
            java.lang.String r0 = "Unexpected subtitle format."
            r1.<init>(r0)
            throw r1
    }

    private static void attachColor(android.text.SpannableStringBuilder r0, int r1, int r2, int r3, int r4, int r5) {
            if (r1 == r2) goto L13
            r2 = r1 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 24
            int r1 = r1 >>> 8
            r1 = r1 | r2
            android.text.style.ForegroundColorSpan r2 = new android.text.style.ForegroundColorSpan
            r2.<init>(r1)
            r1 = r5 | 33
            r0.setSpan(r2, r3, r4, r1)
        L13:
            return
    }

    private static void attachFontFace(android.text.SpannableStringBuilder r5, int r6, int r7, int r8, int r9, int r10) {
            if (r6 == r7) goto L54
            r7 = r10 | 33
            r10 = r6 & 1
            r0 = 0
            r1 = 1
            if (r10 == 0) goto Lc
            r10 = 1
            goto Ld
        Lc:
            r10 = 0
        Ld:
            r2 = r6 & 2
            if (r2 == 0) goto L13
            r2 = 1
            goto L14
        L13:
            r2 = 0
        L14:
            if (r10 == 0) goto L2b
            if (r2 == 0) goto L22
            android.text.style.StyleSpan r3 = new android.text.style.StyleSpan
            r4 = 3
            r3.<init>(r4)
            r5.setSpan(r3, r8, r9, r7)
            goto L36
        L22:
            android.text.style.StyleSpan r3 = new android.text.style.StyleSpan
            r3.<init>(r1)
            r5.setSpan(r3, r8, r9, r7)
            goto L36
        L2b:
            if (r2 == 0) goto L36
            android.text.style.StyleSpan r3 = new android.text.style.StyleSpan
            r4 = 2
            r3.<init>(r4)
            r5.setSpan(r3, r8, r9, r7)
        L36:
            r6 = r6 & 4
            if (r6 == 0) goto L3b
            goto L3c
        L3b:
            r1 = 0
        L3c:
            if (r1 == 0) goto L46
            android.text.style.UnderlineSpan r6 = new android.text.style.UnderlineSpan
            r6.<init>()
            r5.setSpan(r6, r8, r9, r7)
        L46:
            if (r1 != 0) goto L54
            if (r10 != 0) goto L54
            if (r2 != 0) goto L54
            android.text.style.StyleSpan r6 = new android.text.style.StyleSpan
            r6.<init>(r0)
            r5.setSpan(r6, r8, r9, r7)
        L54:
            return
    }

    private static void attachFontFamily(android.text.SpannableStringBuilder r1, java.lang.String r2, int r3, int r4) {
            java.lang.String r0 = "sans-serif"
            if (r2 == r0) goto L10
            android.text.style.TypefaceSpan r0 = new android.text.style.TypefaceSpan
            r0.<init>(r2)
            r2 = 16711713(0xff0021, float:2.3418098E-38)
            r1.setSpan(r0, r3, r4, r2)
        L10:
            return
    }

    private static java.lang.String readSubtitleText(com.google.android.exoplayer2.util.ParsableByteArray r4) throws com.google.android.exoplayer2.text.SubtitleDecoderException {
            int r0 = r4.bytesLeft()
            r1 = 2
            if (r0 < r1) goto L9
            r0 = 1
            goto La
        L9:
            r0 = 0
        La:
            assertTrue(r0)
            int r0 = r4.readUnsignedShort()
            if (r0 != 0) goto L16
            java.lang.String r4 = ""
            return r4
        L16:
            int r1 = r4.getPosition()
            java.nio.charset.Charset r2 = r4.readUtfCharsetFromBom()
            int r3 = r4.getPosition()
            int r3 = r3 - r1
            int r0 = r0 - r3
            if (r2 == 0) goto L27
            goto L29
        L27:
            java.nio.charset.Charset r2 = com.google.common.base.Charsets.UTF_8
        L29:
            java.lang.String r4 = r4.readString(r0, r2)
            return r4
    }

    @Override // com.google.android.exoplayer2.text.SimpleSubtitleDecoder
    public final com.google.android.exoplayer2.text.Subtitle decode(byte[] r7, int r8, boolean r9) throws com.google.android.exoplayer2.text.SubtitleDecoderException {
            r6 = this;
            com.google.android.exoplayer2.util.ParsableByteArray r9 = r6.parsableByteArray
            r9.reset(r7, r8)
            com.google.android.exoplayer2.util.ParsableByteArray r7 = r6.parsableByteArray
            java.lang.String r7 = readSubtitleText(r7)
            boolean r8 = r7.isEmpty()
            if (r8 == 0) goto L14
            com.google.android.exoplayer2.text.tx3g.Tx3gSubtitle r7 = com.google.android.exoplayer2.text.tx3g.Tx3gSubtitle.EMPTY
            return r7
        L14:
            android.text.SpannableStringBuilder r8 = new android.text.SpannableStringBuilder
            r8.<init>(r7)
            int r1 = r6.defaultFontFace
            r2 = 0
            r7 = 0
            int r4 = r8.length()
            r9 = 16711680(0xff0000, float:2.3418052E-38)
            r3 = 0
            r5 = 16711680(0xff0000, float:2.3418052E-38)
            r0 = r8
            attachFontFace(r0, r1, r2, r3, r4, r5)
            int r1 = r6.defaultColorRgba
            r2 = -1
            int r4 = r8.length()
            r3 = r7
            r5 = r9
            attachColor(r0, r1, r2, r3, r4, r5)
            java.lang.String r7 = r6.defaultFontFamily
            int r9 = r8.length()
            r0 = 0
            attachFontFamily(r8, r7, r0, r9)
            float r7 = r6.defaultVerticalPlacement
        L42:
            com.google.android.exoplayer2.util.ParsableByteArray r9 = r6.parsableByteArray
            int r9 = r9.bytesLeft()
            r1 = 8
            if (r9 < r1) goto Lb3
            com.google.android.exoplayer2.util.ParsableByteArray r9 = r6.parsableByteArray
            int r9 = r9.getPosition()
            com.google.android.exoplayer2.util.ParsableByteArray r1 = r6.parsableByteArray
            int r1 = r1.readInt()
            com.google.android.exoplayer2.util.ParsableByteArray r2 = r6.parsableByteArray
            int r2 = r2.readInt()
            r3 = 1937013100(0x7374796c, float:1.936925E31)
            r4 = 2
            r5 = 1
            if (r2 != r3) goto L83
            com.google.android.exoplayer2.util.ParsableByteArray r2 = r6.parsableByteArray
            int r2 = r2.bytesLeft()
            if (r2 < r4) goto L6e
            goto L6f
        L6e:
            r5 = 0
        L6f:
            assertTrue(r5)
            com.google.android.exoplayer2.util.ParsableByteArray r2 = r6.parsableByteArray
            int r2 = r2.readUnsignedShort()
            r3 = 0
        L79:
            if (r3 >= r2) goto Lac
            com.google.android.exoplayer2.util.ParsableByteArray r4 = r6.parsableByteArray
            r6.applyStyleRecord(r4, r8)
            int r3 = r3 + 1
            goto L79
        L83:
            r3 = 1952608120(0x74626f78, float:7.176025E31)
            if (r2 != r3) goto Lac
            boolean r2 = r6.customVerticalPlacement
            if (r2 == 0) goto Lac
            com.google.android.exoplayer2.util.ParsableByteArray r7 = r6.parsableByteArray
            int r7 = r7.bytesLeft()
            if (r7 < r4) goto L95
            goto L96
        L95:
            r5 = 0
        L96:
            assertTrue(r5)
            com.google.android.exoplayer2.util.ParsableByteArray r7 = r6.parsableByteArray
            int r7 = r7.readUnsignedShort()
            float r7 = (float) r7
            int r2 = r6.calculatedVideoTrackHeight
            float r2 = (float) r2
            float r7 = r7 / r2
            r2 = 0
            r3 = 1064514355(0x3f733333, float:0.95)
            float r7 = com.google.android.exoplayer2.util.Util.constrainValue(r7, r2, r3)
        Lac:
            com.google.android.exoplayer2.util.ParsableByteArray r2 = r6.parsableByteArray
            int r9 = r9 + r1
            r2.setPosition(r9)
            goto L42
        Lb3:
            com.google.android.exoplayer2.text.tx3g.Tx3gSubtitle r9 = new com.google.android.exoplayer2.text.tx3g.Tx3gSubtitle
            com.google.android.exoplayer2.text.Cue$Builder r1 = new com.google.android.exoplayer2.text.Cue$Builder
            r1.<init>()
            com.google.android.exoplayer2.text.Cue$Builder r8 = r1.setText(r8)
            com.google.android.exoplayer2.text.Cue$Builder r7 = r8.setLine(r7, r0)
            com.google.android.exoplayer2.text.Cue$Builder r7 = r7.setLineAnchor(r0)
            com.google.android.exoplayer2.text.Cue r7 = r7.build()
            r9.<init>(r7)
            return r9
    }
}
