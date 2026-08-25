package com.google.android.exoplayer2.extractor.avi;

/* JADX INFO: loaded from: classes.dex */
final class StreamNameChunk implements com.google.android.exoplayer2.extractor.avi.AviChunk {
    public final java.lang.String name;

    private StreamNameChunk(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            r0.name = r1
            return
    }

    public static com.google.android.exoplayer2.extractor.avi.StreamNameChunk parseFrom(com.google.android.exoplayer2.util.ParsableByteArray r2) {
            com.google.android.exoplayer2.extractor.avi.StreamNameChunk r0 = new com.google.android.exoplayer2.extractor.avi.StreamNameChunk
            int r1 = r2.bytesLeft()
            java.lang.String r2 = r2.readString(r1)
            r0.<init>(r2)
            return r0
    }

    @Override // com.google.android.exoplayer2.extractor.avi.AviChunk
    public int getType() {
            r1 = this;
            r0 = 1852994675(0x6e727473, float:1.8759038E28)
            return r0
    }
}
