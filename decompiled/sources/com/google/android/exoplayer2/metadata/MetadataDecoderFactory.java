package com.google.android.exoplayer2.metadata;

/* JADX INFO: loaded from: classes.dex */
public interface MetadataDecoderFactory {
    public static final com.google.android.exoplayer2.metadata.MetadataDecoderFactory DEFAULT = null;


    static {
            com.google.android.exoplayer2.metadata.MetadataDecoderFactory$1 r0 = new com.google.android.exoplayer2.metadata.MetadataDecoderFactory$1
            r0.<init>()
            com.google.android.exoplayer2.metadata.MetadataDecoderFactory.DEFAULT = r0
            return
    }

    com.google.android.exoplayer2.metadata.MetadataDecoder createDecoder(com.google.android.exoplayer2.Format r1);

    boolean supportsFormat(com.google.android.exoplayer2.Format r1);
}
