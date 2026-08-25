package com.google.android.exoplayer2.extractor.avi;

/* JADX INFO: loaded from: classes2.dex */
final class AviMainHeaderChunk implements com.google.android.exoplayer2.extractor.avi.AviChunk {
    private static final int AVIF_HAS_INDEX = 16;
    public final int flags;
    public final int frameDurationUs;
    public final int streams;
    public final int totalFrames;

    private AviMainHeaderChunk(int r1, int r2, int r3, int r4) {
            r0 = this;
            r0.<init>()
            r0.frameDurationUs = r1
            r0.flags = r2
            r0.totalFrames = r3
            r0.streams = r4
            return
    }

    public static com.google.android.exoplayer2.extractor.avi.AviMainHeaderChunk parseFrom(com.google.android.exoplayer2.util.ParsableByteArray r5) {
            int r0 = r5.readLittleEndianInt()
            r1 = 8
            r5.skipBytes(r1)
            int r1 = r5.readLittleEndianInt()
            int r2 = r5.readLittleEndianInt()
            r3 = 4
            r5.skipBytes(r3)
            int r3 = r5.readLittleEndianInt()
            r4 = 12
            r5.skipBytes(r4)
            com.google.android.exoplayer2.extractor.avi.AviMainHeaderChunk r5 = new com.google.android.exoplayer2.extractor.avi.AviMainHeaderChunk
            r5.<init>(r0, r1, r2, r3)
            return r5
    }

    @Override // com.google.android.exoplayer2.extractor.avi.AviChunk
    public int getType() {
            r1 = this;
            r0 = 1751742049(0x68697661, float:4.4099804E24)
            return r0
    }

    public boolean hasIndex() {
            r2 = this;
            int r0 = r2.flags
            r1 = 16
            r0 = r0 & r1
            if (r0 != r1) goto L9
            r0 = 1
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }
}
