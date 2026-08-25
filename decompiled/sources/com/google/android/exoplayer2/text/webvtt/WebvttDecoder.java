package com.google.android.exoplayer2.text.webvtt;

/* JADX INFO: loaded from: classes.dex */
public final class WebvttDecoder extends com.google.android.exoplayer2.text.SimpleSubtitleDecoder {
    private static final java.lang.String COMMENT_START = "NOTE";
    private static final int EVENT_COMMENT = 1;
    private static final int EVENT_CUE = 3;
    private static final int EVENT_END_OF_FILE = 0;
    private static final int EVENT_NONE = -1;
    private static final int EVENT_STYLE_BLOCK = 2;
    private static final java.lang.String STYLE_START = "STYLE";
    private final com.google.android.exoplayer2.text.webvtt.WebvttCssParser cssParser;
    private final com.google.android.exoplayer2.util.ParsableByteArray parsableWebvttData;

    public WebvttDecoder() {
            r1 = this;
            java.lang.String r0 = "WebvttDecoder"
            r1.<init>(r0)
            com.google.android.exoplayer2.util.ParsableByteArray r0 = new com.google.android.exoplayer2.util.ParsableByteArray
            r0.<init>()
            r1.parsableWebvttData = r0
            com.google.android.exoplayer2.text.webvtt.WebvttCssParser r0 = new com.google.android.exoplayer2.text.webvtt.WebvttCssParser
            r0.<init>()
            r1.cssParser = r0
            return
    }

    private static int getNextEvent(com.google.android.exoplayer2.util.ParsableByteArray r5) {
            r0 = 0
            r1 = -1
            r2 = -1
            r3 = 0
        L4:
            if (r2 != r1) goto L28
            int r3 = r5.getPosition()
            java.lang.String r2 = r5.readLine()
            if (r2 != 0) goto L12
            r2 = 0
            goto L4
        L12:
            java.lang.String r4 = "STYLE"
            boolean r4 = r4.equals(r2)
            if (r4 == 0) goto L1c
            r2 = 2
            goto L4
        L1c:
            java.lang.String r4 = "NOTE"
            boolean r2 = r2.startsWith(r4)
            if (r2 == 0) goto L26
            r2 = 1
            goto L4
        L26:
            r2 = 3
            goto L4
        L28:
            r5.setPosition(r3)
            return r2
    }

    private static void skipComment(com.google.android.exoplayer2.util.ParsableByteArray r1) {
        L0:
            java.lang.String r0 = r1.readLine()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto Lb
            goto L0
        Lb:
            return
    }

    @Override // com.google.android.exoplayer2.text.SimpleSubtitleDecoder
    public final com.google.android.exoplayer2.text.Subtitle decode(byte[] r2, int r3, boolean r4) throws com.google.android.exoplayer2.text.SubtitleDecoderException {
            r1 = this;
            com.google.android.exoplayer2.util.ParsableByteArray r4 = r1.parsableWebvttData
            r4.reset(r2, r3)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            com.google.android.exoplayer2.util.ParsableByteArray r3 = r1.parsableWebvttData     // Catch: com.google.android.exoplayer2.ParserException -> L69
            com.google.android.exoplayer2.text.webvtt.WebvttParserUtil.validateWebvttHeaderLine(r3)     // Catch: com.google.android.exoplayer2.ParserException -> L69
        Lf:
            com.google.android.exoplayer2.util.ParsableByteArray r3 = r1.parsableWebvttData
            java.lang.String r3 = r3.readLine()
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L1c
            goto Lf
        L1c:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
        L21:
            com.google.android.exoplayer2.util.ParsableByteArray r4 = r1.parsableWebvttData
            int r4 = getNextEvent(r4)
            if (r4 == 0) goto L63
            r0 = 1
            if (r4 != r0) goto L32
            com.google.android.exoplayer2.util.ParsableByteArray r4 = r1.parsableWebvttData
            skipComment(r4)
            goto L21
        L32:
            r0 = 2
            if (r4 != r0) goto L54
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L4c
            com.google.android.exoplayer2.util.ParsableByteArray r4 = r1.parsableWebvttData
            r4.readLine()
            com.google.android.exoplayer2.text.webvtt.WebvttCssParser r4 = r1.cssParser
            com.google.android.exoplayer2.util.ParsableByteArray r0 = r1.parsableWebvttData
            java.util.List r4 = r4.parseBlock(r0)
            r2.addAll(r4)
            goto L21
        L4c:
            com.google.android.exoplayer2.text.SubtitleDecoderException r2 = new com.google.android.exoplayer2.text.SubtitleDecoderException
            java.lang.String r3 = "A style block was found after the first cue."
            r2.<init>(r3)
            throw r2
        L54:
            r0 = 3
            if (r4 != r0) goto L21
            com.google.android.exoplayer2.util.ParsableByteArray r4 = r1.parsableWebvttData
            com.google.android.exoplayer2.text.webvtt.WebvttCueInfo r4 = com.google.android.exoplayer2.text.webvtt.WebvttCueParser.parseCue(r4, r2)
            if (r4 == 0) goto L21
            r3.add(r4)
            goto L21
        L63:
            com.google.android.exoplayer2.text.webvtt.WebvttSubtitle r2 = new com.google.android.exoplayer2.text.webvtt.WebvttSubtitle
            r2.<init>(r3)
            return r2
        L69:
            r2 = move-exception
            com.google.android.exoplayer2.text.SubtitleDecoderException r3 = new com.google.android.exoplayer2.text.SubtitleDecoderException
            r3.<init>(r2)
            throw r3
    }
}
