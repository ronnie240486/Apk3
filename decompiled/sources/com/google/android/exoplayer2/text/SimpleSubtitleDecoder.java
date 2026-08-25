package com.google.android.exoplayer2.text;

/* JADX INFO: loaded from: classes.dex */
public abstract class SimpleSubtitleDecoder extends com.google.android.exoplayer2.decoder.SimpleDecoder<com.google.android.exoplayer2.text.SubtitleInputBuffer, com.google.android.exoplayer2.text.SubtitleOutputBuffer, com.google.android.exoplayer2.text.SubtitleDecoderException> implements com.google.android.exoplayer2.text.SubtitleDecoder {
    private final java.lang.String name;


    public SimpleSubtitleDecoder(java.lang.String r3) {
            r2 = this;
            r0 = 2
            com.google.android.exoplayer2.text.SubtitleInputBuffer[] r1 = new com.google.android.exoplayer2.text.SubtitleInputBuffer[r0]
            com.google.android.exoplayer2.text.SubtitleOutputBuffer[] r0 = new com.google.android.exoplayer2.text.SubtitleOutputBuffer[r0]
            r2.<init>(r1, r0)
            r2.name = r3
            r3 = 1024(0x400, float:1.435E-42)
            r2.setInitialInputBufferSize(r3)
            return
    }

    @Override // com.google.android.exoplayer2.decoder.SimpleDecoder
    public final com.google.android.exoplayer2.decoder.DecoderInputBuffer createInputBuffer() {
            r1 = this;
            com.google.android.exoplayer2.text.SubtitleInputBuffer r0 = new com.google.android.exoplayer2.text.SubtitleInputBuffer
            r0.<init>()
            return r0
    }

    @Override // com.google.android.exoplayer2.decoder.SimpleDecoder
    public final com.google.android.exoplayer2.decoder.DecoderOutputBuffer createOutputBuffer() {
            r1 = this;
            com.google.android.exoplayer2.text.SimpleSubtitleDecoder$1 r0 = new com.google.android.exoplayer2.text.SimpleSubtitleDecoder$1
            r0.<init>(r1)
            return r0
    }

    @Override // com.google.android.exoplayer2.decoder.SimpleDecoder
    public final com.google.android.exoplayer2.decoder.DecoderException createUnexpectedDecodeException(java.lang.Throwable r3) {
            r2 = this;
            com.google.android.exoplayer2.text.SubtitleDecoderException r0 = new com.google.android.exoplayer2.text.SubtitleDecoderException
            java.lang.String r1 = "Unexpected decode error"
            r0.<init>(r1, r3)
            return r0
    }

    @Override // com.google.android.exoplayer2.decoder.SimpleDecoder
    @androidx.annotation.Nullable
    public final com.google.android.exoplayer2.decoder.DecoderException decode(com.google.android.exoplayer2.decoder.DecoderInputBuffer r7, com.google.android.exoplayer2.decoder.DecoderOutputBuffer r8, boolean r9) {
            r6 = this;
            com.google.android.exoplayer2.text.SubtitleInputBuffer r7 = (com.google.android.exoplayer2.text.SubtitleInputBuffer) r7
            com.google.android.exoplayer2.text.SubtitleOutputBuffer r8 = (com.google.android.exoplayer2.text.SubtitleOutputBuffer) r8
            java.nio.ByteBuffer r0 = r7.data     // Catch: com.google.android.exoplayer2.text.SubtitleDecoderException -> L27
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)     // Catch: com.google.android.exoplayer2.text.SubtitleDecoderException -> L27
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0     // Catch: com.google.android.exoplayer2.text.SubtitleDecoderException -> L27
            byte[] r1 = r0.array()     // Catch: com.google.android.exoplayer2.text.SubtitleDecoderException -> L27
            int r0 = r0.limit()     // Catch: com.google.android.exoplayer2.text.SubtitleDecoderException -> L27
            com.google.android.exoplayer2.text.Subtitle r3 = r6.decode(r1, r0, r9)     // Catch: com.google.android.exoplayer2.text.SubtitleDecoderException -> L27
            long r1 = r7.timeUs     // Catch: com.google.android.exoplayer2.text.SubtitleDecoderException -> L27
            long r4 = r7.subsampleOffsetUs     // Catch: com.google.android.exoplayer2.text.SubtitleDecoderException -> L27
            r0 = r8
            r0.setContent(r1, r3, r4)     // Catch: com.google.android.exoplayer2.text.SubtitleDecoderException -> L27
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r8.clearFlag(r7)     // Catch: com.google.android.exoplayer2.text.SubtitleDecoderException -> L27
            r7 = 0
            goto L28
        L27:
            r7 = move-exception
        L28:
            return r7
    }

    public abstract com.google.android.exoplayer2.text.Subtitle decode(byte[] r1, int r2, boolean r3) throws com.google.android.exoplayer2.text.SubtitleDecoderException;

    @Override // com.google.android.exoplayer2.decoder.Decoder
    public final java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }

    @Override // com.google.android.exoplayer2.text.SubtitleDecoder
    public void setPositionUs(long r1) {
            r0 = this;
            return
    }
}
