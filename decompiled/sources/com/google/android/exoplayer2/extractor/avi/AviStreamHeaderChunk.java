package com.google.android.exoplayer2.extractor.avi;

/* JADX INFO: loaded from: classes2.dex */
final class AviStreamHeaderChunk implements com.google.android.exoplayer2.extractor.avi.AviChunk {
    private static final java.lang.String TAG = "AviStreamHeaderChunk";
    public final int initialFrames;
    public final int length;
    public final int rate;
    public final int scale;
    public final int streamType;
    public final int suggestedBufferSize;

    private AviStreamHeaderChunk(int r1, int r2, int r3, int r4, int r5, int r6) {
            r0 = this;
            r0.<init>()
            r0.streamType = r1
            r0.initialFrames = r2
            r0.scale = r3
            r0.rate = r4
            r0.length = r5
            r0.suggestedBufferSize = r6
            return
    }

    public static com.google.android.exoplayer2.extractor.avi.AviStreamHeaderChunk parseFrom(com.google.android.exoplayer2.util.ParsableByteArray r7) {
            int r1 = r7.readLittleEndianInt()
            r0 = 12
            r7.skipBytes(r0)
            int r2 = r7.readLittleEndianInt()
            int r3 = r7.readLittleEndianInt()
            int r4 = r7.readLittleEndianInt()
            r0 = 4
            r7.skipBytes(r0)
            int r5 = r7.readLittleEndianInt()
            int r6 = r7.readLittleEndianInt()
            r0 = 8
            r7.skipBytes(r0)
            com.google.android.exoplayer2.extractor.avi.AviStreamHeaderChunk r7 = new com.google.android.exoplayer2.extractor.avi.AviStreamHeaderChunk
            r0 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r7
    }

    public long getDurationUs() {
            r7 = this;
            int r0 = r7.length
            long r1 = (long) r0
            int r0 = r7.scale
            long r3 = (long) r0
            r5 = 1000000(0xf4240, double:4.940656E-318)
            long r3 = r3 * r5
            int r0 = r7.rate
            long r5 = (long) r0
            long r0 = com.google.android.exoplayer2.util.Util.scaleLargeTimestamp(r1, r3, r5)
            return r0
    }

    public float getFrameRate() {
            r2 = this;
            int r0 = r2.rate
            float r0 = (float) r0
            int r1 = r2.scale
            float r1 = (float) r1
            float r0 = r0 / r1
            return r0
    }

    public int getTrackType() {
            r2 = this;
            int r0 = r2.streamType
            r1 = 1935960438(0x73646976, float:1.809666E31)
            if (r0 == r1) goto L2f
            r1 = 1935963489(0x73647561, float:1.8100348E31)
            if (r0 == r1) goto L2d
            r1 = 1937012852(0x73747874, float:1.936895E31)
            if (r0 == r1) goto L2b
            java.lang.String r0 = "Found unsupported streamType fourCC: "
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            int r1 = r2.streamType
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "AviStreamHeaderChunk"
            com.google.android.exoplayer2.util.Log.w(r1, r0)
            r0 = -1
            return r0
        L2b:
            r0 = 3
            return r0
        L2d:
            r0 = 1
            return r0
        L2f:
            r0 = 2
            return r0
    }

    @Override // com.google.android.exoplayer2.extractor.avi.AviChunk
    public int getType() {
            r1 = this;
            r0 = 1752331379(0x68727473, float:4.5798432E24)
            return r0
    }
}
