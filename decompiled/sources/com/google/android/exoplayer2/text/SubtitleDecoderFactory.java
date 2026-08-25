package com.google.android.exoplayer2.text;

/* JADX INFO: loaded from: classes3.dex */
public interface SubtitleDecoderFactory {
    public static final com.google.android.exoplayer2.text.SubtitleDecoderFactory DEFAULT = null;


    static {
            com.google.android.exoplayer2.text.SubtitleDecoderFactory$1 r0 = new com.google.android.exoplayer2.text.SubtitleDecoderFactory$1
            r0.<init>()
            com.google.android.exoplayer2.text.SubtitleDecoderFactory.DEFAULT = r0
            return
    }

    com.google.android.exoplayer2.text.SubtitleDecoder createDecoder(com.google.android.exoplayer2.Format r1);

    boolean supportsFormat(com.google.android.exoplayer2.Format r1);
}
