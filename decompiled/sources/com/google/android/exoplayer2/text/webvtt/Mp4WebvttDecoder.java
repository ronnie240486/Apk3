package com.google.android.exoplayer2.text.webvtt;

/* JADX INFO: loaded from: classes.dex */
public final class Mp4WebvttDecoder extends com.google.android.exoplayer2.text.SimpleSubtitleDecoder {
    private static final int BOX_HEADER_SIZE = 8;
    private static final int TYPE_payl = 1885436268;
    private static final int TYPE_sttg = 1937011815;
    private static final int TYPE_vttc = 1987343459;
    private final com.google.android.exoplayer2.util.ParsableByteArray sampleData;

    public Mp4WebvttDecoder() {
            r1 = this;
            java.lang.String r0 = "Mp4WebvttDecoder"
            r1.<init>(r0)
            com.google.android.exoplayer2.util.ParsableByteArray r0 = new com.google.android.exoplayer2.util.ParsableByteArray
            r0.<init>()
            r1.sampleData = r0
            return
    }

    private static com.google.android.exoplayer2.text.Cue parseVttCueBox(com.google.android.exoplayer2.util.ParsableByteArray r7, int r8) throws com.google.android.exoplayer2.text.SubtitleDecoderException {
            r0 = 0
            r1 = r0
            r2 = r1
        L3:
            if (r8 <= 0) goto L48
            r3 = 8
            if (r8 < r3) goto L40
            int r4 = r7.readInt()
            int r5 = r7.readInt()
            int r8 = r8 + (-8)
            int r4 = r4 - r3
            byte[] r3 = r7.getData()
            int r6 = r7.getPosition()
            java.lang.String r3 = com.google.android.exoplayer2.util.Util.fromUtf8Bytes(r3, r6, r4)
            r7.skipBytes(r4)
            int r8 = r8 - r4
            r4 = 1937011815(0x73747467, float:1.9367696E31)
            if (r5 != r4) goto L2e
            com.google.android.exoplayer2.text.Cue$Builder r2 = com.google.android.exoplayer2.text.webvtt.WebvttCueParser.parseCueSettingsList(r3)
            goto L3
        L2e:
            r4 = 1885436268(0x7061796c, float:2.7912367E29)
            if (r5 != r4) goto L3
            java.lang.String r1 = r3.trim()
            java.util.List r3 = java.util.Collections.emptyList()
            android.text.SpannedString r1 = com.google.android.exoplayer2.text.webvtt.WebvttCueParser.parseCueText(r0, r1, r3)
            goto L3
        L40:
            com.google.android.exoplayer2.text.SubtitleDecoderException r7 = new com.google.android.exoplayer2.text.SubtitleDecoderException
            java.lang.String r8 = "Incomplete vtt cue box header found."
            r7.<init>(r8)
            throw r7
        L48:
            if (r1 != 0) goto L4c
            java.lang.String r1 = ""
        L4c:
            if (r2 == 0) goto L57
            com.google.android.exoplayer2.text.Cue$Builder r7 = r2.setText(r1)
            com.google.android.exoplayer2.text.Cue r7 = r7.build()
            goto L68
        L57:
            java.util.regex.Pattern r7 = com.google.android.exoplayer2.text.webvtt.WebvttCueParser.CUE_HEADER_PATTERN
            com.google.android.exoplayer2.text.webvtt.WebvttCueParser$WebvttCueInfoBuilder r7 = new com.google.android.exoplayer2.text.webvtt.WebvttCueParser$WebvttCueInfoBuilder
            r7.<init>()
            r7.text = r1
            com.google.android.exoplayer2.text.Cue$Builder r7 = r7.toCueBuilder()
            com.google.android.exoplayer2.text.Cue r7 = r7.build()
        L68:
            return r7
    }

    @Override // com.google.android.exoplayer2.text.SimpleSubtitleDecoder
    public final com.google.android.exoplayer2.text.Subtitle decode(byte[] r2, int r3, boolean r4) throws com.google.android.exoplayer2.text.SubtitleDecoderException {
            r1 = this;
            com.google.android.exoplayer2.util.ParsableByteArray r4 = r1.sampleData
            r4.reset(r2, r3)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        La:
            com.google.android.exoplayer2.util.ParsableByteArray r3 = r1.sampleData
            int r3 = r3.bytesLeft()
            if (r3 <= 0) goto L49
            com.google.android.exoplayer2.util.ParsableByteArray r3 = r1.sampleData
            int r3 = r3.bytesLeft()
            r4 = 8
            if (r3 < r4) goto L41
            com.google.android.exoplayer2.util.ParsableByteArray r3 = r1.sampleData
            int r3 = r3.readInt()
            com.google.android.exoplayer2.util.ParsableByteArray r4 = r1.sampleData
            int r4 = r4.readInt()
            r0 = 1987343459(0x76747463, float:1.2395323E33)
            if (r4 != r0) goto L39
            com.google.android.exoplayer2.util.ParsableByteArray r4 = r1.sampleData
            int r3 = r3 + (-8)
            com.google.android.exoplayer2.text.Cue r3 = parseVttCueBox(r4, r3)
            r2.add(r3)
            goto La
        L39:
            com.google.android.exoplayer2.util.ParsableByteArray r4 = r1.sampleData
            int r3 = r3 + (-8)
            r4.skipBytes(r3)
            goto La
        L41:
            com.google.android.exoplayer2.text.SubtitleDecoderException r2 = new com.google.android.exoplayer2.text.SubtitleDecoderException
            java.lang.String r3 = "Incomplete Mp4Webvtt Top Level box header found."
            r2.<init>(r3)
            throw r2
        L49:
            com.google.android.exoplayer2.text.webvtt.Mp4WebvttSubtitle r3 = new com.google.android.exoplayer2.text.webvtt.Mp4WebvttSubtitle
            r3.<init>(r2)
            return r3
    }
}
